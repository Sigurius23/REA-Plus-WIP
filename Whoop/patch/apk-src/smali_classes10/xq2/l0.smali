.class public abstract Lxq2/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001aA\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0017\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a#\u0010\u0012\u001a\u00020\u00082\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a%\u0010\u0017\u001a\u00020\u00082\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a/\u0010\u0019\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0007\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lxq2/m0;",
        "viewState",
        "Lm91/p;",
        "itemViewFactory",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "w",
        "(Landroidx/compose/ui/Modifier;Lxq2/m0;Lm91/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "o",
        "(Lxq2/m0;Landroidx/compose/runtime/Composer;I)V",
        "Lkd1/o;",
        "image",
        "Ls51/i;",
        "scoreGaugeItemState",
        "q",
        "(Lkd1/o;Ls51/i;Landroidx/compose/runtime/Composer;I)V",
        "",
        "Lm91/u;",
        "cardItems",
        "t",
        "(Ljava/util/List;Lm91/p;Landroidx/compose/runtime/Composer;I)V",
        "A",
        "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static final A(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, -0x30b57c09

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p3, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, p4, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_2

    :cond_5
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v3, v7

    :goto_3
    and-int/lit8 v7, v3, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v7, v8, :cond_6

    move v7, v10

    goto :goto_4

    :cond_6
    move v7, v9

    :goto_4
    and-int/lit8 v8, v3, 0x1

    invoke-virtual {v0, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_1d

    sget-object v7, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_7

    move-object v2, v7

    :cond_7
    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_9

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_8

    new-instance v4, Lxl0/b;

    const/16 v6, 0xc

    invoke-direct {v4, v6}, Lxl0/b;-><init>(I)V

    invoke-virtual {v0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_5

    :cond_9
    move-object v4, v6

    :goto_5
    sget v6, Lyp2/c;->a:I

    invoke-static {v0, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget v8, Lyp2/c;->b:I

    invoke-static {v0, v8}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    sget-object v11, Ll0/m;->a:Ll0/e;

    sget-object v12, Lb2/e;->J:Lb2/l;

    invoke-static {v11, v12, v0, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v11

    iget-wide v12, v0, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v5, v0, Lp1/q;->S:Z

    if-eqz v5, :cond_a

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_6
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v0, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v0, v5, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-nez v11, :cond_b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_c

    :cond_b
    invoke-static {v12, v0, v12, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v0, v5, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v5, "YearInReviewCard Back Press"

    invoke-static {v7, v5}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v5}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const v12, 0x3e99999a    # 0.3f

    float-to-double v13, v12

    const-wide/16 v15, 0x0

    cmpl-double v13, v13, v15

    const-string v14, "invalid weight; must be greater than zero"

    if-lez v13, :cond_d

    goto :goto_7

    :cond_d
    invoke-static {v14}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_7
    new-instance v13, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v17, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v18, v12, v17

    if-lez v18, :cond_e

    move/from16 v12, v17

    :cond_e
    invoke-direct {v13, v12, v10}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-interface {v5, v13}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_f

    if-ne v13, v1, :cond_10

    :cond_f
    new-instance v13, Lxq2/k0;

    const/4 v12, 0x0

    invoke-direct {v13, v6, v12}, Lxq2/k0;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v9, v13}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_11

    invoke-static {v0}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v5

    :cond_11
    move-object/from16 v19, v5

    check-cast v19, Lj0/i;

    and-int/lit8 v3, v3, 0x70

    const/16 v5, 0x20

    if-ne v3, v5, :cond_12

    move v5, v10

    goto :goto_8

    :cond_12
    move v5, v9

    :goto_8
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_13

    if-ne v6, v1, :cond_14

    :cond_13
    new-instance v6, Lxq2/d1;

    const/4 v5, 0x3

    invoke-direct {v6, v4, v5}, Lxq2/d1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object/from16 v23, v6

    check-cast v23, Lc93/a;

    const/16 v24, 0x1c

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v18 .. v24}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v5, v0, v9}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const-string v5, "YearInReviewCard Forward Press"

    invoke-static {v7, v5}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v11, v5}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const v6, 0x3f333333    # 0.7f

    float-to-double v11, v6

    cmpl-double v7, v11, v15

    if-lez v7, :cond_15

    goto :goto_9

    :cond_15
    invoke-static {v14}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_9
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v11, v6, v17

    if-lez v11, :cond_16

    move/from16 v6, v17

    :cond_16
    invoke-direct {v7, v6, v10}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-interface {v5, v7}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v0, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_17

    if-ne v7, v1, :cond_18

    :cond_17
    new-instance v7, Lxq2/k0;

    const/4 v6, 0x1

    invoke-direct {v7, v8, v6}, Lxq2/k0;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v9, v7}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_19

    invoke-static {v0}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v5

    :cond_19
    move-object v12, v5

    check-cast v12, Lj0/i;

    const/16 v5, 0x20

    if-ne v3, v5, :cond_1a

    move v3, v10

    goto :goto_a

    :cond_1a
    move v3, v9

    :goto_a
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_1b

    if-ne v5, v1, :cond_1c

    :cond_1b
    new-instance v5, Lxq2/d1;

    const/4 v1, 0x2

    invoke-direct {v5, v4, v1}, Lxq2/d1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    move-object/from16 v16, v5

    check-cast v16, Lc93/a;

    const/16 v17, 0x1c

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v11 .. v17}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1, v0, v9}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v10}, Lp1/q;->q(Z)V

    move-object v13, v4

    :goto_b
    move-object v12, v2

    goto :goto_c

    :cond_1d
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v13, v6

    goto :goto_b

    :goto_c
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_1e

    new-instance v11, Lb03/c;

    const/16 v16, 0x2

    move/from16 v14, p3

    move/from16 v15, p4

    invoke-direct/range {v11 .. v16}, Lb03/c;-><init>(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;III)V

    iput-object v11, v0, Lp1/v1;->d:Lc93/m;

    :cond_1e
    return-void
.end method

.method private static final B(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Ljava/lang/String;Li3/z;)Ll83/a0;
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lrq2/t0$a;->a:Lrq2/t0$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Ljava/lang/String;Li3/z;)Ll83/a0;
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lrq2/t0$b;->a:Lrq2/t0$b;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lxq2/l0;->A(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lxq2/l0;->u(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkd1/o;Ls51/i;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lxq2/l0;->s(Lkd1/o;Ls51/i;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lxq2/l0;->G(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;Li3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lxq2/l0;->C(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lxq2/m0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lxq2/l0;->p(Lxq2/m0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lxq2/l0;->x(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lxq2/l0;->F(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/String;Li3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lxq2/l0;->E(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lxq2/l0;->r(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/util/List;Lm91/p;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lxq2/l0;->v(Ljava/util/List;Lm91/p;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Landroidx/compose/ui/Modifier;Lxq2/m0;Lm91/p;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lxq2/l0;->z(Landroidx/compose/ui/Modifier;Lxq2/m0;Lm91/p;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lxq2/l0;->B(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lxq2/l0;->D(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Lxq2/m0;Lm91/p;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    sget-object v0, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-static/range {v0 .. v5}, Lxq2/l0;->y(Ll0/u;Lkotlin/jvm/functions/Function1;Lxq2/m0;Lm91/p;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Lxq2/m0;Landroidx/compose/runtime/Composer;I)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, 0x2b8a6684

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p2, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int v3, p2, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v3, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v5, v4, :cond_2

    move v5, v7

    goto :goto_2

    :cond_2
    move v5, v6

    :goto_2
    and-int/2addr v3, v7

    invoke-virtual {v2, v3, v5}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_c

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v4, v4

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v4, v8

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    sget-object v9, Lb2/e;->K:Lb2/l;

    const/16 v10, 0x36

    invoke-static {v4, v9, v2, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v9, v2, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v2, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v12, v2, Lp1/q;->S:Z

    if-eqz v12, :cond_3

    invoke-virtual {v2, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_3
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v2, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v2, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v13, v2, Lp1/q;->S:Z

    if-nez v13, :cond_4

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_5

    :cond_4
    invoke-static {v9, v2, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v2, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v13, v5

    const-wide/16 v15, 0x0

    cmpl-double v3, v13, v15

    if-lez v3, :cond_6

    goto :goto_4

    :cond_6
    const-string v3, "invalid weight; must be greater than zero"

    invoke-static {v3}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_4
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v3, v5, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const-wide/high16 v13, 0x3fe0000000000000L    # 0.5

    double-to-float v5, v13

    mul-float/2addr v5, v8

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    sget-object v8, Lb2/e;->M:Lb2/k;

    const/4 v13, 0x6

    invoke-static {v5, v8, v2, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v13, v2, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v2, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v14, v2, Lp1/q;->S:Z

    if-eqz v14, :cond_7

    invoke-virtual {v2, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v2, v12, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, v4, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v2, Lp1/q;->S:Z

    if-nez v4, :cond_8

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    :cond_8
    invoke-static {v8, v2, v8, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    invoke-static {v2, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lxq2/m0;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    if-nez v3, :cond_a

    const v3, 0x2b09dd9e

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v6}, Lp1/q;->q(Z)V

    move v0, v6

    move v1, v7

    goto/16 :goto_6

    :cond_a
    const v4, 0x2b09dd9f

    invoke-virtual {v2, v4}, Lp1/q;->e0(I)V

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v2, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v2, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->d()Lb91/a;

    move-result-object v22

    invoke-virtual {v4, v2, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->c1()J

    move-result-wide v4

    sget v8, Lb91/a;->d:I

    shl-int/lit8 v26, v8, 0x12

    const v27, 0x2fffa

    move-object/from16 v24, v2

    move-object v2, v3

    const/4 v3, 0x0

    move v8, v6

    move v9, v7

    const-wide/16 v6, 0x0

    move v10, v8

    const/4 v8, 0x0

    move v11, v9

    const/4 v9, 0x0

    move v12, v10

    const/4 v10, 0x0

    move v14, v11

    move v13, v12

    const-wide/16 v11, 0x0

    move v15, v13

    const/4 v13, 0x0

    move/from16 v16, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    move/from16 v18, v16

    const-wide/16 v15, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v23, v20

    const/16 v20, 0x0

    move/from16 v25, v21

    const/16 v21, 0x0

    move/from16 v28, v23

    const/16 v23, 0x0

    move/from16 v29, v25

    const/16 v25, 0x0

    move/from16 v1, v28

    move/from16 v0, v29

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual/range {p0 .. p0}, Lxq2/m0;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v2, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v2, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->Q()Lb91/a;

    move-result-object v22

    invoke-virtual {v5, v2, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v7

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v26, v9, 0x12

    const v27, 0x2fffa

    move-object/from16 v24, v2

    move-object v2, v3

    const/4 v3, 0x0

    move v9, v4

    move-object v10, v5

    move-wide v4, v7

    move v8, v6

    const-wide/16 v6, 0x0

    move v11, v8

    const/4 v8, 0x0

    move v12, v9

    const/4 v9, 0x0

    move-object v13, v10

    const/4 v10, 0x0

    move v15, v11

    move v14, v12

    const-wide/16 v11, 0x0

    move-object/from16 v16, v13

    const/4 v13, 0x0

    move/from16 v17, v14

    const/4 v14, 0x0

    move/from16 v19, v15

    move-object/from16 v18, v16

    const-wide/16 v15, 0x0

    move/from16 v20, v17

    const/16 v17, 0x0

    move-object/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v23, v19

    const/16 v19, 0x0

    move/from16 v25, v20

    const/16 v20, 0x0

    move-object/from16 v28, v21

    const/16 v21, 0x0

    move/from16 v29, v23

    const/16 v23, 0x0

    move/from16 v30, v25

    const/16 v25, 0x0

    move-object/from16 v0, v28

    move/from16 v31, v29

    move/from16 v1, v30

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual/range {p0 .. p0}, Lxq2/m0;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v3

    if-eqz v3, :cond_b

    const v3, 0x2b10f71e

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lxq2/m0;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v2, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    move/from16 v15, v31

    invoke-virtual {v0, v2, v15}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v22

    invoke-virtual {v0, v2, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v4

    const/16 v25, 0x0

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

    move-object/from16 v24, v2

    move-object v2, v1

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    const/4 v13, 0x0

    invoke-virtual {v2, v13}, Lp1/q;->q(Z)V

    :goto_7
    const/4 v14, 0x1

    goto :goto_8

    :cond_b
    const/4 v13, 0x0

    const v0, 0x2b13e798

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v13}, Lp1/q;->q(Z)V

    goto :goto_7

    :goto_8
    invoke-virtual {v2, v14}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lxq2/m0;->c()Lkd1/o;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lxq2/m0;->e()Ls51/i;

    move-result-object v1

    sget v3, Lkd1/o;->a:I

    sget v4, Ls51/i;->m:I

    shl-int/lit8 v4, v4, 0x3

    or-int/2addr v3, v4

    invoke-static {v0, v1, v2, v3}, Lxq2/l0;->q(Lkd1/o;Ls51/i;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v2, v14}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_c
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_d

    new-instance v1, Lxq2/b;

    const/4 v2, 0x3

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Lxq2/b;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final p(Lxq2/m0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lxq2/l0;->o(Lxq2/m0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lkd1/o;Ls51/i;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move/from16 v7, p3

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v1, -0x211814d9

    invoke-virtual {v3, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v7, 0x6

    const/4 v8, 0x4

    if-nez v1, :cond_2

    and-int/lit8 v1, v7, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    move v1, v8

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    :goto_1
    or-int/2addr v1, v7

    goto :goto_2

    :cond_2
    move v1, v7

    :goto_2
    and-int/lit8 v2, v7, 0x30

    if-nez v2, :cond_5

    and-int/lit8 v2, v7, 0x40

    if-nez v2, :cond_3

    invoke-virtual {v3, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_3

    :cond_3
    invoke-virtual {v3, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_3
    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_4

    :cond_4
    const/16 v2, 0x10

    :goto_4
    or-int/2addr v1, v2

    :cond_5
    and-int/lit8 v2, v1, 0x13

    const/16 v4, 0x12

    const/4 v5, 0x1

    const/4 v9, 0x0

    if-eq v2, v4, :cond_6

    move v2, v5

    goto :goto_5

    :cond_6
    move v2, v9

    :goto_5
    and-int/2addr v1, v5

    invoke-virtual {v3, v1, v2}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_a

    sget-object v10, Lb2/t;->w:Lb2/t;

    const/16 v11, 0x14

    if-nez v0, :cond_7

    const v1, -0x31603db5

    invoke-virtual {v3, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v9}, Lp1/q;->q(Z)V

    move v1, v8

    move v2, v9

    move-object v0, v10

    move v4, v11

    goto :goto_6

    :cond_7
    const v1, -0x31603db4

    invoke-virtual {v3, v1}, Lp1/q;->e0(I)V

    sget v4, Lkd1/o;->a:I

    const/4 v5, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v1

    int-to-float v0, v11

    int-to-float v2, v8

    mul-float/2addr v0, v2

    invoke-static {v0, v10}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v16, 0x61b0

    const/16 v17, 0x68

    move v2, v9

    const-string v9, ""

    move v4, v11

    const/4 v11, 0x0

    sget-object v12, Ly2/j;->b:Ly2/b1;

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v15, v10

    move-object v10, v0

    move-object v0, v15

    move v15, v8

    move-object v8, v1

    move v1, v15

    move-object v15, v3

    invoke-static/range {v8 .. v17}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    :goto_6
    if-nez v6, :cond_8

    const v0, -0x315c42b4

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    move-object v1, v6

    move-object/from16 v6, p0

    goto :goto_7

    :cond_8
    const v5, -0x315c42b3

    invoke-virtual {v3, v5}, Lp1/q;->e0(I)V

    int-to-float v4, v4

    int-to-float v1, v1

    mul-float/2addr v4, v1

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v1, v4, :cond_9

    new-instance v1, Lxl0/b;

    const/16 v4, 0xa

    invoke-direct {v1, v4}, Lxl0/b;-><init>(I)V

    invoke-virtual {v3, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v1, Lkotlin/jvm/functions/Function1;

    sget v4, Ls51/i;->m:I

    shl-int/lit8 v4, v4, 0x3

    or-int/lit16 v4, v4, 0x186

    const/4 v5, 0x0

    move v8, v2

    move-object v2, v1

    move-object v1, v6

    move-object/from16 v6, p0

    invoke-static/range {v0 .. v5}, Ls51/l;->j(Landroidx/compose/ui/Modifier;Ls51/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v3, v8}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_a
    move-object v1, v6

    move-object v6, v0

    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_b

    new-instance v2, Lxq2/j0;

    const/4 v3, 0x0

    invoke-direct {v2, v6, v1, v7, v3}, Lxq2/j0;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final r(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lkd1/o;Ls51/i;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lxq2/l0;->q(Lkd1/o;Ls51/i;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Ljava/util/List;Lm91/p;Landroidx/compose/runtime/Composer;I)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lm91/u;",
            ">;",
            "Lm91/p;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move/from16 v8, p3

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    const v1, 0x5d7ea324

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v8, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v8

    goto :goto_1

    :cond_1
    move v1, v8

    :goto_1
    and-int/lit8 v3, v8, 0x30

    if-nez v3, :cond_4

    and-int/lit8 v3, v8, 0x40

    if-nez v3, :cond_2

    invoke-virtual {v5, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_2

    :cond_2
    invoke-virtual {v5, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_2
    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_3

    :cond_3
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v1, v3

    :cond_4
    move/from16 v19, v1

    and-int/lit8 v1, v19, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x1

    const/4 v6, 0x0

    if-eq v1, v3, :cond_5

    move v1, v4

    goto :goto_4

    :cond_5
    move v1, v6

    :goto_4
    and-int/lit8 v3, v19, 0x1

    invoke-virtual {v5, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_a

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_9

    const v1, 0x13ecfa90

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :goto_5
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm91/u;

    instance-of v3, v1, Lj71/c;

    if-eqz v3, :cond_6

    const v3, 0x299ed5cf

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    int-to-float v3, v4

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float v12, v3, v7

    const/4 v13, 0x0

    const/16 v14, 0xb

    sget-object v9, Lb2/t;->w:Lb2/t;

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const v7, 0x3faaaaab

    invoke-static {v3, v6, v7}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move-object v10, v1

    check-cast v10, Lj71/c;

    const/16 v17, 0x6

    const/16 v18, 0x7c

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v5

    invoke-static/range {v9 .. v18}, Lb61/k;->p(Landroidx/compose/ui/Modifier;Lj71/c;Lj71/c;Lj71/c;ZLb61/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, v6}, Lp1/q;->q(Z)V

    move v10, v4

    move v9, v6

    goto :goto_6

    :cond_6
    const v3, 0x29a27981

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v3, v7, :cond_7

    new-instance v3, Lxl0/b;

    const/16 v7, 0xb

    invoke-direct {v3, v7}, Lxl0/b;-><init>(I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v3, Lkotlin/jvm/functions/Function1;

    sget v7, Lm91/p;->b:I

    shl-int/lit8 v7, v7, 0x3

    or-int/lit16 v7, v7, 0xc00

    and-int/lit8 v9, v19, 0x70

    or-int/2addr v7, v9

    move v9, v6

    move v6, v7

    const/4 v7, 0x4

    move v10, v4

    move-object v4, v3

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, v9}, Lp1/q;->q(Z)V

    :goto_6
    move v6, v9

    move v4, v10

    goto :goto_5

    :cond_8
    move v9, v6

    invoke-virtual {v5, v9}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_9
    move v9, v6

    const v1, 0x13f4b11e

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v9}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_a
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_b

    new-instance v3, Lxq2/j0;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v2, v8, v4}, Lxq2/j0;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v3, v1, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final u(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Ljava/util/List;Lm91/p;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lxq2/l0;->t(Ljava/util/List;Lm91/p;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final w(Landroidx/compose/ui/Modifier;Lxq2/m0;Lm91/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lxq2/m0;",
            "Lm91/p;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    move/from16 v5, p5

    const-string v1, "viewState"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p4

    check-cast v15, Lp1/q;

    const v1, 0x3c173723

    invoke-virtual {v15, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p6, 0x1

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-eqz v1, :cond_0

    or-int/lit8 v6, v5, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v5, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-virtual {v15, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v4

    goto :goto_0

    :cond_1
    move v7, v3

    :goto_0
    or-int/2addr v7, v5

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v5

    :goto_1
    and-int/lit8 v8, v5, 0x30

    if-nez v8, :cond_4

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x20

    goto :goto_2

    :cond_3
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_4
    and-int/lit16 v8, v5, 0x180

    if-nez v8, :cond_7

    and-int/lit8 v8, p6, 0x4

    if-nez v8, :cond_6

    and-int/lit16 v8, v5, 0x200

    if-nez v8, :cond_5

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_3

    :cond_5
    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    :goto_3
    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_4

    :cond_6
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v7, v8

    :cond_7
    and-int/lit8 v8, p6, 0x8

    if-eqz v8, :cond_9

    or-int/lit16 v7, v7, 0xc00

    :cond_8
    move-object/from16 v10, p3

    goto :goto_6

    :cond_9
    and-int/lit16 v10, v5, 0xc00

    if-nez v10, :cond_8

    move-object/from16 v10, p3

    invoke-virtual {v15, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_5

    :cond_a
    const/16 v11, 0x400

    :goto_5
    or-int/2addr v7, v11

    :goto_6
    and-int/lit16 v11, v7, 0x493

    const/16 v12, 0x492

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eq v11, v12, :cond_b

    move v11, v14

    goto :goto_7

    :cond_b
    move v11, v13

    :goto_7
    and-int/2addr v7, v14

    invoke-virtual {v15, v7, v11}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_15

    invoke-virtual {v15}, Lp1/q;->Z()V

    and-int/lit8 v7, v5, 0x1

    sget-object v11, Lb2/t;->w:Lb2/t;

    if-eqz v7, :cond_e

    invoke-virtual {v15}, Lp1/q;->C()Z

    move-result v7

    if-eqz v7, :cond_c

    goto :goto_8

    :cond_c
    invoke-virtual {v15}, Lp1/q;->X()V

    :cond_d
    move-object v1, v0

    move-object v0, v6

    move-object v6, v10

    goto :goto_9

    :cond_e
    :goto_8
    if-eqz v1, :cond_f

    move-object v6, v11

    :cond_f
    and-int/lit8 v1, p6, 0x4

    if-eqz v1, :cond_10

    invoke-static {}, Lwq2/c;->b()Lm91/p;

    move-result-object v0

    :cond_10
    if-eqz v8, :cond_d

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v1, v7, :cond_11

    new-instance v1, Lxl0/b;

    const/16 v7, 0x9

    invoke-direct {v1, v7}, Lxl0/b;-><init>(I)V

    invoke-virtual {v15, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v1, Lkotlin/jvm/functions/Function1;

    move-object/from16 v26, v1

    move-object v1, v0

    move-object v0, v6

    move-object/from16 v6, v26

    :goto_9
    invoke-virtual {v15}, Lp1/q;->r()V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v10, Lb2/e;->w:Lb2/m;

    invoke-static {v10, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v10

    iget-wide v11, v15, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v15, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    const/16 p4, 0x20

    iget-boolean v9, v15, Lp1/q;->S:Z

    if-eqz v9, :cond_12

    invoke-virtual {v15, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_12
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_a
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v15, v9, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v15, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v10, v15, Lp1/q;->S:Z

    if-nez v10, :cond_13

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_14

    :cond_13
    invoke-static {v11, v15, v11, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v15, v9, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x3

    invoke-static {v7, v8, v9}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v8, v3

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float/2addr v8, v10

    const/4 v10, 0x0

    invoke-static {v7, v8, v10, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v16, Li2/t;->b:Li2/s;

    const-wide v7, 0xff7ba1bbL

    invoke-static {v7, v8}, Li2/w0;->e(J)J

    move-result-wide v11

    const v13, 0x3dcccccd    # 0.1f

    invoke-static {v13, v11, v12}, Li2/x;->c(FJ)J

    move-result-wide v11

    move-wide/from16 p2, v7

    new-instance v7, Li2/x;

    invoke-direct {v7, v11, v12}, Li2/x;-><init>(J)V

    const-wide v23, 0xff384955L

    invoke-static/range {v23 .. v24}, Li2/w0;->e(J)J

    move-result-wide v11

    invoke-static {v13, v11, v12}, Li2/x;->c(FJ)J

    move-result-wide v11

    new-instance v8, Li2/x;

    invoke-direct {v8, v11, v12}, Li2/x;-><init>(J)V

    filled-new-array {v7, v8}, [Li2/x;

    move-result-object v7

    invoke-static {v7}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const v7, 0x42b08000    # 88.25f

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v7, v7

    const/high16 v11, 0x42680000    # 58.0f

    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v12

    int-to-long v12, v12

    shl-long v7, v7, p4

    const-wide v18, 0xffffffffL

    and-long v12, v12, v18

    or-long/2addr v7, v12

    const v12, 0x43846000    # 264.75f

    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v12

    int-to-long v12, v12

    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v11

    move-object/from16 v25, v15

    int-to-long v14, v11

    shl-long v11, v12, p4

    and-long v13, v14, v18

    or-long v20, v11, v13

    const/16 v22, 0x8

    move-wide/from16 v18, v7

    invoke-static/range {v16 .. v22}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v7

    move-object/from16 v8, v16

    int-to-float v9, v9

    int-to-float v11, v4

    mul-float/2addr v9, v11

    invoke-static {v9}, Lt0/j;->e(F)Lt0/i;

    move-result-object v11

    invoke-static {v3, v7, v11, v10, v4}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    move-object/from16 v15, v25

    invoke-virtual {v4, v15, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->a1()J

    move-result-wide v11

    invoke-static {v9}, Lt0/j;->e(F)Lt0/i;

    move-result-object v4

    move-wide v12, v11

    new-instance v11, Lf0/t;

    const/4 v7, 0x1

    int-to-float v9, v7

    invoke-static/range {v23 .. v24}, Li2/w0;->e(J)J

    move-result-wide v7

    const v14, 0x3e99999a    # 0.3f

    invoke-static {v14, v7, v8}, Li2/x;->c(FJ)J

    move-result-wide v7

    new-instance v10, Li2/x;

    invoke-direct {v10, v7, v8}, Li2/x;-><init>(J)V

    invoke-static/range {p2 .. p3}, Li2/w0;->e(J)J

    move-result-wide v7

    invoke-static {v14, v7, v8}, Li2/x;->c(FJ)J

    move-result-wide v7

    new-instance v14, Li2/x;

    invoke-direct {v14, v7, v8}, Li2/x;-><init>(J)V

    filled-new-array {v10, v14}, [Li2/x;

    move-result-object v7

    invoke-static {v7}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const/16 v8, 0xe

    move-object/from16 v10, v16

    const/4 v14, 0x0

    invoke-static {v10, v7, v14, v14, v8}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v7

    invoke-direct {v11, v9, v7}, Lf0/t;-><init>(FLi2/t;)V

    new-instance v7, Lvl0/c;

    const/16 v8, 0x8

    invoke-direct {v7, v6, v2, v1, v8}, Lvl0/c;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v8, -0x472bb647

    invoke-static {v8, v15, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v14

    const v16, 0xc06000

    const/16 v17, 0x62

    const/4 v7, 0x0

    move-wide v8, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v10, v6

    move-object v6, v3

    move-object v3, v10

    move-object v10, v4

    const/4 v4, 0x1

    invoke-static/range {v6 .. v17}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v4}, Lp1/q;->q(Z)V

    move-object v4, v3

    move-object v3, v1

    move-object v1, v0

    goto :goto_b

    :cond_15
    invoke-virtual {v15}, Lp1/q;->X()V

    move-object v3, v0

    move-object v1, v6

    move-object v4, v10

    :goto_b
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_16

    new-instance v0, Lw71/k;

    const/16 v7, 0x9

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lw71/k;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final x(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Ll0/u;Lkotlin/jvm/functions/Function1;Lxq2/m0;Lm91/p;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

    and-int/lit8 v0, p5, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p5, v1

    check-cast p4, Lp1/q;

    invoke-virtual {p4, p5, v0}, Lp1/q;->U(IZ)Z

    move-result p5

    if-eqz p5, :cond_5

    const/high16 p5, 0x3f800000    # 1.0f

    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {p5, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p5

    int-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3, p5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p5

    int-to-float v3, v1

    mul-float/2addr v3, v4

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    sget-object v5, Lb2/e;->M:Lb2/k;

    const/4 v6, 0x6

    invoke-static {v4, v5, p4, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, p4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {p4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {p4, p5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p5

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {p4}, Lp1/q;->i0()V

    iget-boolean v8, p4, Lp1/q;->S:Z

    if-eqz v8, :cond_1

    invoke-virtual {p4, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p4}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {p4, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {p4, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, p4, Lp1/q;->S:Z

    if-nez v6, :cond_2

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    :cond_2
    invoke-static {v5, p4, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {p4, v4, p5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p2, p4, v2}, Lxq2/l0;->o(Lxq2/m0;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2}, Lxq2/m0;->a()Ljava/util/List;

    move-result-object p5

    check-cast p5, Ljava/util/Collection;

    invoke-interface {p5}, Ljava/util/Collection;->isEmpty()Z

    move-result p5

    if-nez p5, :cond_4

    const p5, -0x6f11884c

    invoke-static {p4, p5, v0, v3, p4}, Lte0/d;->z(Lp1/q;ILb2/t;FLp1/q;)V

    invoke-virtual {p2}, Lxq2/m0;->a()Ljava/util/List;

    move-result-object p2

    sget p5, Lm91/p;->b:I

    shl-int/lit8 p5, p5, 0x3

    invoke-static {p2, p3, p4, p5}, Lxq2/l0;->t(Ljava/util/List;Lm91/p;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p4, v2}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    const p2, -0x6f0dcb0d

    invoke-virtual {p4, p2}, Lp1/q;->e0(I)V

    invoke-virtual {p4, v2}, Lp1/q;->q(Z)V

    :goto_2
    invoke-virtual {p4, v1}, Lp1/q;->q(Z)V

    invoke-interface {p0, v0}, Ll0/u;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-static {p0, p1, p4, v2, v2}, Lxq2/l0;->A(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_5
    invoke-virtual {p4}, Lp1/q;->X()V

    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Landroidx/compose/ui/Modifier;Lxq2/m0;Lm91/p;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lxq2/l0;->w(Landroidx/compose/ui/Modifier;Lxq2/m0;Lm91/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

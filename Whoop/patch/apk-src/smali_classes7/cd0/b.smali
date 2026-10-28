.class public abstract Lcd0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a#\u0010\u0008\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lad0/c;",
        "viewState",
        "Lkotlin/Function1;",
        "Lzc0/a;",
        "Ll83/a0;",
        "onNavigationEvent",
        "i",
        "(Lad0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "f",
        "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "advanced-labs_release"
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
.method public static synthetic a(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2, p3}, Lcd0/b;->h(Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lad0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcd0/b;->l(Lad0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcd0/b;->k(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcd0/b;->g(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lzc0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcd0/b;->j(Lzc0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v14, p1

    check-cast v14, Lp1/q;

    const v2, -0x71031485

    invoke-virtual {v14, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v14, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v5, v2, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v5, v4, :cond_2

    move v5, v7

    goto :goto_2

    :cond_2
    move v5, v6

    :goto_2
    and-int/lit8 v8, v2, 0x1

    invoke-virtual {v14, v8, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_6

    new-instance v8, Lsz0/p0$b;

    new-instance v9, Lcom/whoop/design/util/TextResource$b;

    sget v5, Lgy0/f;->P1:I

    const/4 v15, 0x0

    invoke-direct {v9, v5, v15, v4, v15}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v12, 0x6

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    move-object v9, v5

    new-instance v5, Lcom/whoop/design/util/TextResource$b;

    sget v10, Luv0/c;->E:I

    invoke-direct {v5, v10, v15, v4, v15}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v2, v2, 0xe

    if-ne v2, v3, :cond_3

    move v6, v7

    :cond_3
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v6, :cond_4

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_5

    :cond_4
    new-instance v2, Lbf0/a;

    const/16 v3, 0xe

    invoke-direct {v2, v0, v3}, Lbf0/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v6, v2

    check-cast v6, Lc93/a;

    sget v2, Lsz0/p0$b;->h:I

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v3, v3, 0x3

    or-int/2addr v2, v3

    sget v3, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v3, v3, 0x9

    or-int v15, v2, v3

    const/16 v16, 0x0

    const/16 v17, 0xfe4

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v2, v8

    const/4 v8, 0x0

    move-object v3, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v17}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    goto :goto_3

    :cond_6
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_7

    new-instance v3, Lcd0/a;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v4}, Lcd0/a;-><init>(Lkotlin/jvm/functions/Function1;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lzc0/a$a;->a:Lzc0/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lcd0/b;->f(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i(Lad0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lad0/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p2

    check-cast v14, Lp1/q;

    const v0, -0x37985412

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    const/16 v3, 0x20

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v14, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    move v5, v3

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :goto_3
    and-int/lit8 v5, v0, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v5, v6, :cond_5

    move v5, v7

    goto :goto_4

    :cond_5
    move v5, v8

    :goto_4
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v14, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_e

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_7

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v5, :cond_6

    new-instance v2, Lc62/a;

    const/4 v4, 0x4

    invoke-direct {v2, v4}, Lc62/a;-><init>(I)V

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    goto :goto_5

    :cond_7
    move-object v2, v4

    :goto_5
    and-int/lit8 v4, v0, 0xe

    or-int/lit8 v4, v4, 0x30

    const-string v6, "advanced_labs_mobile_scheduling_form"

    invoke-static {v1, v6, v14, v4}, Lfy1/j;->c(Lfy1/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    and-int/lit8 v4, v0, 0x70

    if-ne v4, v3, :cond_8

    move v3, v7

    goto :goto_6

    :cond_8
    move v3, v8

    :goto_6
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_9

    if-ne v4, v5, :cond_a

    :cond_9
    new-instance v4, Lbf0/a;

    const/16 v3, 0xd

    invoke-direct {v4, v2, v3}, Lbf0/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v4, Lc93/a;

    invoke-static {v4, v8, v14, v8, v7}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    instance-of v3, v1, Lad0/c$b;

    if-eqz v3, :cond_b

    const v0, 0x58671edc

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    move-object v4, v2

    sget-object v2, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v0, Lsz0/p0$c;->f:I

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v5, 0x3

    or-int v15, v0, v5

    const/16 v16, 0x0

    const/16 v17, 0xffc

    move-object v0, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move/from16 v18, v13

    const/4 v13, 0x0

    move-object/from16 p1, v0

    move/from16 v0, v18

    invoke-static/range {v2 .. v17}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    move-object/from16 v4, p1

    goto :goto_7

    :cond_b
    move-object v4, v2

    move v2, v0

    move v0, v8

    instance-of v3, v1, Lad0/c$a;

    if-eqz v3, :cond_c

    const v3, 0x586a2a57

    invoke-virtual {v14, v3}, Lp1/q;->e0(I)V

    shr-int/lit8 v2, v2, 0x3

    and-int/lit8 v2, v2, 0xe

    invoke-static {v4, v14, v2}, Lcd0/b;->f(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_c
    instance-of v2, v1, Lad0/c$c;

    if-eqz v2, :cond_d

    const v2, 0x586c8126

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2}, Ll0/f;->n(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v14, v0}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    :goto_7
    move-object v3, v4

    goto :goto_8

    :cond_d
    const v1, 0x4d2c9786    # 1.8097571E8f

    invoke-static {v1, v14, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_e
    invoke-virtual {v14}, Lp1/q;->X()V

    goto :goto_7

    :goto_8
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_f

    new-instance v0, La01/i;

    const/16 v5, 0x16

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, La01/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final j(Lzc0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lzc0/a$a;->a:Lzc0/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lad0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lcd0/b;->i(Lad0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

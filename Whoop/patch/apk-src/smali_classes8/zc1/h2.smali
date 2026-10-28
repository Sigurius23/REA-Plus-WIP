.class public abstract Lzc1/h2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "h",
        "(Landroidx/compose/runtime/Composer;I)V",
        "design-showcase_release"
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
.method public static synthetic a(Landroid/content/Context;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/h2;->l(Landroid/content/Context;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroid/content/Context;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/h2;->i(Landroid/content/Context;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/h2;->o(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroid/content/Context;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/h2;->j(Landroid/content/Context;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/h2;->k(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroid/content/Context;Lvy0/y;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/h2;->n(Landroid/content/Context;Lvy0/y;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/h2;->m(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Landroidx/compose/runtime/Composer;I)V
    .locals 26

    move-object/from16 v10, p0

    check-cast v10, Lp1/q;

    const v1, -0x3554f7a4    # -5604398.0f

    invoke-virtual {v10, v1}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, p1, 0x1

    invoke-virtual {v10, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_10

    sget-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v10, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Landroid/content/Context;

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v14, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v14, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->w()J

    move-result-wide v3

    sget-object v5, Li2/w0;->a:Li2/v0;

    invoke-static {v1, v3, v4, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Lb2/e;->N:Lb2/k;

    sget-object v4, Ll0/m;->c:Ll0/g;

    const/16 v5, 0x30

    invoke-static {v4, v3, v10, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v10, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v10, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v10, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v10, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v10, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v10, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, v10, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v10, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "Standard FAB"

    const/4 v3, 0x6

    invoke-static {v1, v10, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move v1, v2

    new-instance v2, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/a;->a()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-direct {v2, v4, v5, v6, v5}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-nez v4, :cond_4

    if-ne v7, v8, :cond_5

    :cond_4
    new-instance v7, Lh32/b;

    const/16 v4, 0x15

    invoke-direct {v7, v13, v4}, Lh32/b;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v9, v7

    check-cast v9, Lkotlin/jvm/functions/Function1;

    sget v4, Ly71/g;->c:I

    shl-int/lit8 v11, v4, 0x3

    const/16 v12, 0x3d

    move v4, v1

    const/4 v1, 0x0

    move/from16 v16, v3

    move v7, v4

    const-wide/16 v3, 0x0

    move-object/from16 v18, v5

    move/from16 v17, v6

    const-wide/16 v5, 0x0

    move/from16 v19, v7

    const/4 v7, 0x0

    move-object/from16 v20, v8

    const/4 v8, 0x0

    move/from16 v0, v16

    move/from16 v15, v19

    move-object/from16 v21, v20

    invoke-static/range {v1 .. v12}, Lvy0/x;->s(Landroidx/compose/ui/Modifier;Ly71/g;JJZLd0/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "Custom Color FAB"

    invoke-static {v1, v10, v0}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v2, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/a;->k()I

    move-result v1

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v2, v1, v4, v3, v4}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v14, v10, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->a()J

    move-result-wide v5

    invoke-virtual {v10, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v15, v21

    if-nez v1, :cond_6

    if-ne v3, v15, :cond_7

    :cond_6
    new-instance v3, Lh32/b;

    const/16 v1, 0x16

    invoke-direct {v3, v13, v1}, Lh32/b;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v9, v3

    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/16 v12, 0x39

    const/4 v1, 0x0

    move-object/from16 v18, v4

    move-wide v3, v5

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v14, v18

    invoke-static/range {v1 .. v12}, Lvy0/x;->s(Landroidx/compose/ui/Modifier;Ly71/g;JJZLd0/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "Descriptive FAB"

    invoke-static {v1, v10, v0}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v2, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/a;->a()I

    move-result v1

    const/4 v3, 0x2

    invoke-direct {v2, v1, v14, v3, v14}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v16, "ADD ACTIVITY"

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v10, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_8

    if-ne v4, v15, :cond_9

    :cond_8
    new-instance v4, Lzc1/l1;

    const/4 v1, 0x1

    invoke-direct {v4, v13, v1}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v4, Lc93/a;

    const/high16 v1, 0x180000

    or-int/2addr v1, v11

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v18, v5, 0x6

    or-int v1, v1, v18

    move-object/from16 v22, v14

    const/16 v14, 0xb9

    move-object v5, v13

    move v13, v1

    const/4 v1, 0x0

    move-object v6, v5

    move v7, v11

    move-object v11, v4

    const-wide/16 v4, 0x0

    move-object v8, v6

    move v9, v7

    const-wide/16 v6, 0x0

    move-object v12, v8

    const/4 v8, 0x0

    move/from16 v19, v9

    const/high16 v9, 0x3f800000    # 1.0f

    move-object/from16 v20, v12

    move-object v12, v10

    const/4 v10, 0x0

    move/from16 v24, v19

    move-object/from16 v23, v20

    invoke-static/range {v1 .. v14}, Lvy0/x;->k(Landroidx/compose/ui/Modifier;Ly71/g;Lcom/whoop/design/util/TextResource;JJZFFLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v12

    const-string v1, "Glowing FAB"

    invoke-static {v1, v10, v0}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v2, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/a;->a()I

    move-result v1

    const/4 v3, 0x2

    const/4 v14, 0x0

    invoke-direct {v2, v1, v14, v3, v14}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v13, v23

    invoke-virtual {v10, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_a

    if-ne v3, v15, :cond_b

    :cond_a
    new-instance v3, Lh32/b;

    const/16 v1, 0x17

    invoke-direct {v3, v13, v1}, Lh32/b;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v9, v3

    check-cast v9, Lkotlin/jvm/functions/Function1;

    move/from16 v1, v24

    or-int/lit16 v11, v1, 0x6000

    const/16 v12, 0x2d

    move/from16 v19, v1

    const/4 v1, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static/range {v1 .. v12}, Lvy0/x;->s(Landroidx/compose/ui/Modifier;Ly71/g;JJZLd0/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    new-instance v2, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/a;->a()I

    move-result v1

    const/4 v3, 0x2

    invoke-direct {v2, v1, v14, v3, v14}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v10, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_c

    if-ne v4, v15, :cond_d

    :cond_c
    new-instance v4, Lzc1/l1;

    const/4 v1, 0x2

    invoke-direct {v4, v13, v1}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object v11, v4

    check-cast v11, Lc93/a;

    const/high16 v1, 0x1b0000

    or-int v1, v19, v1

    or-int v1, v1, v18

    const/16 v14, 0x99

    move-object/from16 v20, v13

    move v13, v1

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x1

    const/high16 v9, 0x3f800000    # 1.0f

    move-object v12, v10

    const/4 v10, 0x0

    move-object/from16 v25, v20

    invoke-static/range {v1 .. v14}, Lvy0/x;->k(Landroidx/compose/ui/Modifier;Ly71/g;Lcom/whoop/design/util/TextResource;JJZFFLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v12

    const-string v1, "FAB Menu"

    invoke-static {v1, v10, v0}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v1, Lvy0/d0;

    new-instance v2, Lvy0/z;

    sget-object v6, Lgz0/m0;->ADD:Lgz0/m0;

    move-object v5, v6

    const/4 v6, 0x2

    const/4 v7, 0x0

    const-string v3, "Add Period"

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v7}, Lvy0/z;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lvy0/z;

    const/4 v7, 0x2

    const/4 v8, 0x0

    const-string v4, "Add Ovulation"

    move-object v6, v5

    const/4 v5, 0x0

    invoke-direct/range {v3 .. v8}, Lvy0/z;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v3

    move-object v5, v6

    new-instance v3, Lvy0/z;

    const-string v4, "Add Symptoms & Behaviors"

    const/4 v5, 0x0

    invoke-direct/range {v3 .. v8}, Lvy0/z;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v2, v0, v3}, [Lvy0/z;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v0}, Lvy0/d0;-><init>(Ljava/util/List;)V

    move-object/from16 v5, v25

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_e

    if-ne v2, v15, :cond_f

    :cond_e
    new-instance v2, Lh32/b;

    const/16 v0, 0x18

    invoke-direct {v2, v5, v0}, Lh32/b;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v3, v2

    check-cast v3, Lkotlin/jvm/functions/Function1;

    sget v5, Lvy0/d0;->b:I

    const/4 v6, 0x2

    const/4 v2, 0x0

    move-object v4, v10

    invoke-static/range {v1 .. v6}, Lvy0/c0;->m(Lvy0/d0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_10
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_11

    new-instance v1, Lzc1/w0;

    const/16 v2, 0x1a

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lzc1/w0;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final i(Landroid/content/Context;Z)Ll83/a0;
    .locals 1

    const-string p1, "Standard Clicked"

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Landroid/content/Context;Z)Ll83/a0;
    .locals 1

    const-string p1, "Custom Color Clicked"

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Descriptive Clicked"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Landroid/content/Context;Z)Ll83/a0;
    .locals 1

    const-string p1, "Glowing Clicked"

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Glowing Clicked"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Landroid/content/Context;Lvy0/y;)Ll83/a0;
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Clicked: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/h2;->h(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

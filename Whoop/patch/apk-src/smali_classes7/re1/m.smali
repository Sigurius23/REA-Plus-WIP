.class public abstract Lre1/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a7\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u001b\u0010\u000c\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0001H\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Ll0/u;",
        "Ly3/f;",
        "stickyButtonShadowHeight",
        "Lcom/whoop/educationModels/StickyButton;",
        "stickyButton",
        "Lkotlin/Function1;",
        "Lne1/a;",
        "Ll83/a0;",
        "onNavigationEvent",
        "d",
        "(Ll0/u;FLcom/whoop/educationModels/StickyButton;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "shadowHeight",
        "e",
        "(Ll0/u;FLandroidx/compose/runtime/Composer;I)V",
        "",
        "Li2/t;",
        "i",
        "(Ljava/lang/String;)Li2/t;",
        "education_release"
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
.method public static synthetic a(Ll0/u;FLcom/whoop/educationModels/StickyButton;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lre1/m;->h(Ll0/u;FLcom/whoop/educationModels/StickyButton;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lcom/whoop/educationModels/StickyButton;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lre1/m;->g(Lkotlin/jvm/functions/Function1;Lcom/whoop/educationModels/StickyButton;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ll0/u;FILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lre1/m;->f(Ll0/u;FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ll0/u;FLcom/whoop/educationModels/StickyButton;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll0/u;",
            "F",
            "Lcom/whoop/educationModels/StickyButton;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    const-string v0, "$this$StickyButton"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stickyButton"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigationEvent"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v6, -0x37c40d82

    invoke-virtual {v0, v6}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v6, v5, 0x6

    if-nez v6, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v5

    goto :goto_1

    :cond_1
    move v6, v5

    :goto_1
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->d(F)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_3
    and-int/lit16 v7, v5, 0x180

    const/16 v8, 0x100

    if-nez v7, :cond_6

    and-int/lit16 v7, v5, 0x200

    if-nez v7, :cond_4

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_3

    :cond_4
    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_3
    if-eqz v7, :cond_5

    move v7, v8

    goto :goto_4

    :cond_5
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v6, v7

    :cond_6
    and-int/lit16 v7, v5, 0xc00

    const/16 v9, 0x800

    if-nez v7, :cond_8

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    move v7, v9

    goto :goto_5

    :cond_7
    const/16 v7, 0x400

    :goto_5
    or-int/2addr v6, v7

    :cond_8
    and-int/lit16 v7, v6, 0x493

    const/16 v10, 0x492

    const/4 v11, 0x0

    if-eq v7, v10, :cond_9

    const/4 v7, 0x1

    goto :goto_6

    :cond_9
    move v7, v11

    :goto_6
    and-int/lit8 v10, v6, 0x1

    invoke-virtual {v0, v10, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_12

    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v13, Lb2/e;->H:Lb2/m;

    invoke-interface {v1, v7, v13}, Ll0/u;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v13, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    iget-wide v14, v0, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v0, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-eqz v12, :cond_a

    invoke-virtual {v0, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_7
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v0, v11, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v0, v11, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-nez v12, :cond_b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_c

    :cond_b
    invoke-static {v14, v0, v14, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v0, v11, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v7, v6, 0x70

    const/4 v11, 0x6

    or-int/2addr v7, v11

    sget-object v12, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-static {v12, v2, v0, v7}, Lre1/m;->e(Ll0/u;FLandroidx/compose/runtime/Composer;I)V

    const-wide/high16 v12, 0x4004000000000000L    # 2.5

    double-to-float v7, v12

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float/2addr v7, v12

    invoke-static {v7, v10}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v3}, Lcom/whoop/educationModels/StickyButton;->getTitle()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v3}, Lcom/whoop/educationModels/StickyButton;->getStyle()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lre1/m;->i(Ljava/lang/String;)Li2/t;

    move-result-object v14

    and-int/lit16 v10, v6, 0x1c00

    if-ne v10, v9, :cond_d

    const/4 v9, 0x1

    goto :goto_8

    :cond_d
    const/4 v9, 0x0

    :goto_8
    and-int/lit16 v10, v6, 0x380

    if-eq v10, v8, :cond_f

    and-int/lit16 v6, v6, 0x200

    if-eqz v6, :cond_e

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    goto :goto_9

    :cond_e
    const/4 v6, 0x0

    goto :goto_a

    :cond_f
    :goto_9
    const/4 v6, 0x1

    :goto_a
    or-int/2addr v6, v9

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_10

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v8, v6, :cond_11

    :cond_10
    new-instance v8, Lqt2/e;

    const/16 v6, 0xf

    invoke-direct {v8, v6, v4, v3}, Lqt2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object/from16 v19, v8

    check-cast v19, Lc93/a;

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v6, 0x12

    or-int/lit8 v21, v6, 0x6

    const/16 v22, 0x0

    const/16 v23, 0x1ebe

    move-object v6, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x1

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v24, v20

    move-object/from16 v20, v0

    move/from16 v0, v24

    invoke-static/range {v6 .. v23}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v20

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_12
    move-object v6, v0

    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_13

    new-instance v0, Lc51/j;

    const/4 v6, 0x2

    invoke-direct/range {v0 .. v6}, Lc51/j;-><init>(Ljava/lang/Object;FLjava/lang/Object;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final e(Ll0/u;FLandroidx/compose/runtime/Composer;I)V
    .locals 10

    check-cast p2, Lp1/q;

    const v0, -0x4a3efe32

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->d(F)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v2, :cond_4

    move v1, v4

    goto :goto_3

    :cond_4
    move v1, v3

    :goto_3
    and-int/2addr v0, v4

    invoke-virtual {p2, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Li2/t;->b:Li2/s;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const v4, 0x12171a

    invoke-static {v4}, Li2/w0;->c(I)J

    move-result-wide v4

    invoke-static {v1, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v4

    new-instance v6, Li2/x;

    invoke-direct {v6, v4, v5}, Li2/x;-><init>(J)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v2, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x3e99999a    # 0.3f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const-wide v5, 0xff101518L

    invoke-static {v5, v6}, Li2/w0;->e(J)J

    move-result-wide v7

    new-instance v9, Li2/x;

    invoke-direct {v9, v7, v8}, Li2/x;-><init>(J)V

    new-instance v7, Ll83/k;

    invoke-direct {v7, v2, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-static {v5, v6}, Li2/w0;->e(J)J

    move-result-wide v5

    new-instance v9, Li2/x;

    invoke-direct {v9, v5, v6}, Li2/x;-><init>(J)V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v8, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v7, v5}, [Ll83/k;

    move-result-object v4

    const/16 v5, 0xe

    invoke-static {v0, v4, v1, v1, v5}, Li2/s;->l(Li2/s;[Ll83/k;FFI)Li2/k0;

    move-result-object v0

    const/4 v4, 0x0

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/4 v6, 0x6

    invoke-static {v5, v0, v4, v1, v6}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->H:Lb2/m;

    invoke-interface {p0, v0, v1}, Ll0/u;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, p2, v3}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_5
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, Lqn0/d;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p3, v1}, Lqn0/d;-><init>(Ll0/u;FII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final f(Ll0/u;FILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lre1/m;->e(Ll0/u;FLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;Lcom/whoop/educationModels/StickyButton;)Ll83/a0;
    .locals 2

    new-instance v0, Lne1/a$d;

    invoke-virtual {p1}, Lcom/whoop/educationModels/StickyButton;->getDestination()Lcom/whoop/navigation/e;

    move-result-object p1

    const-string v1, "sticky"

    invoke-direct {v0, p1, v1}, Lne1/a$d;-><init>(Lcom/whoop/navigation/e;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Ll0/u;FLcom/whoop/educationModels/StickyButton;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lre1/m;->d(Ll0/u;FLcom/whoop/educationModels/StickyButton;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i(Ljava/lang/String;)Li2/t;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "PROMO_LINEAR"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {}, Lgb1/b0;->I0()Li2/t;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

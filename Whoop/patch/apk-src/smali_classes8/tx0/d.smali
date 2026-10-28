.class public abstract Ltx0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001aM\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0008H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0013\u00a8\u0006\u0019"
    }
    d2 = {
        "Ltx0/g;",
        "viewState",
        "Lkotlin/Function1;",
        "Ltx0/e;",
        "Ll83/a0;",
        "onViewEvent",
        "Lgv1/m;",
        "onOverrideViewEvent",
        "Lkotlin/Function0;",
        "onBackClick",
        "o",
        "(Ltx0/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "",
        "title",
        "m",
        "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V",
        "Lv41/r0;",
        "lottieWrapper",
        "A",
        "(Lv41/r0;Landroidx/compose/runtime/Composer;I)V",
        "Li51/h;",
        "celebrationMediaSource",
        "y",
        "(Li51/h;Landroidx/compose/runtime/Composer;I)V",
        "v",
        "debug-tools_release"
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
.method private static final A(Lv41/r0;Landroidx/compose/runtime/Composer;I)V
    .locals 14

    move/from16 v10, p2

    move-object v11, p1

    check-cast v11, Lp1/q;

    const v0, 0x40968b9b

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v10, 0x6

    const/4 v12, 0x4

    const/4 v13, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v11, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v12

    goto :goto_0

    :cond_0
    move v0, v13

    :goto_0
    or-int/2addr v0, v10

    goto :goto_1

    :cond_1
    move v0, v10

    :goto_1
    and-int/lit8 v1, v0, 0x3

    const/4 v2, 0x1

    if-eq v1, v13, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    and-int/2addr v0, v2

    invoke-virtual {v11, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Lnq2/i;

    const-string v1, "122"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const-string v2, "DAY STREAK"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget-object v3, Ly81/f;->BRAND_WHITE:Ly81/f;

    sget-object v4, Lcom/whoop/user/journey/model/yearinreview/StyleType;->NUMBER_LARGE:Lcom/whoop/user/journey/model/yearinreview/StyleType;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v9, p0

    invoke-direct/range {v0 .. v9}, Lnq2/i;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/user/journey/model/yearinreview/StyleType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lv41/r0;)V

    new-instance v1, Lnq2/g;

    invoke-direct {v1}, Lnq2/g;-><init>()V

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v3, 0x3

    int-to-float v4, v3

    int-to-float v5, v12

    invoke-static {v2, v4, v5}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v4, v13

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v4, v5, :cond_3

    new-instance v4, Lt71/i;

    const/16 v5, 0x14

    invoke-direct {v4, v5}, Lt71/i;-><init>(I)V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v4, Lkotlin/jvm/functions/Function1;

    sget v5, Lnq2/i;->j:I

    shl-int/lit8 v3, v5, 0x3

    or-int/lit16 v3, v3, 0x180

    sget v5, Lnq2/g;->a:I

    shl-int/lit8 v5, v5, 0x9

    or-int/2addr v5, v3

    move-object v3, v2

    move-object v2, v0

    move-object v0, v1

    move-object v1, v3

    move-object v3, v4

    move-object v4, v11

    invoke-virtual/range {v0 .. v5}, Lnq2/g;->b(Landroidx/compose/ui/Modifier;Lnq2/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_3

    :cond_4
    move-object v4, v11

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v1, Ltx0/c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v10, v2}, Ltx0/c;-><init>(Lv41/r0;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final B(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lv41/r0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Ltx0/d;->A(Lv41/r0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ltx0/d;->n(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ltx0/d;->B(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Li51/h;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ltx0/d;->z(Li51/h;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ltx0/d;->t(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ltx0/d;->r(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ltx0/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ltx0/d;->u(Ltx0/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ltx0/d;->s(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lv41/r0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ltx0/d;->x(Lv41/r0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ltx0/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ltx0/d;->q(Ltx0/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Ltx0/g;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ltx0/d;->p(Lkotlin/jvm/functions/Function1;Ltx0/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lem1/t;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ltx0/d;->w(Lem1/t;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lv41/r0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ltx0/d;->C(Lv41/r0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lp1/q;

    const v2, 0x79882dc3

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v4, v2, 0x3

    const/4 v5, 0x1

    if-eq v4, v3, :cond_2

    move v4, v5

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    and-int/lit8 v6, v2, 0x1

    invoke-virtual {v1, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_3

    int-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    int-to-float v5, v5

    mul-float/2addr v5, v4

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v3, v5}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v1, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v20

    invoke-virtual {v4, v1, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->X0()J

    move-result-wide v4

    and-int/lit8 v2, v2, 0xe

    or-int/lit8 v23, v2, 0x30

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v24, v2, 0x12

    const v25, 0x2fff8

    move-object/from16 v22, v1

    move-object v1, v3

    move-wide v2, v4

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_3

    :cond_3
    move-object/from16 v22, v1

    invoke-virtual/range {v22 .. v22}, Lp1/q;->X()V

    :goto_3
    invoke-virtual/range {v22 .. v22}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_4

    new-instance v2, Lcp0/a;

    const/16 v3, 0x18

    move/from16 v4, p2

    invoke-direct {v2, v0, v4, v3}, Lcp0/a;-><init>(Ljava/lang/String;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method private static final n(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Ltx0/d;->m(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final o(Ltx0/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 45
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltx0/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v0, p5

    const-string v5, "viewState"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onViewEvent"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onOverrideViewEvent"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onBackClick"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v5, -0x6da3b6d1

    invoke-virtual {v9, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_2

    and-int/lit8 v5, v0, 0x8

    if-nez v5, :cond_0

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_0

    :cond_0
    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_0
    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_1

    :cond_1
    const/4 v5, 0x2

    :goto_1
    or-int/2addr v5, v0

    goto :goto_2

    :cond_2
    move v5, v0

    :goto_2
    and-int/lit8 v6, v0, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v5, v6

    :cond_4
    and-int/lit16 v6, v0, 0x180

    if-nez v6, :cond_6

    invoke-virtual {v9, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_4

    :cond_5
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v5, v6

    :cond_6
    and-int/lit16 v6, v0, 0xc00

    if-nez v6, :cond_8

    invoke-virtual {v9, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x800

    goto :goto_5

    :cond_7
    const/16 v6, 0x400

    :goto_5
    or-int/2addr v5, v6

    :cond_8
    and-int/lit16 v6, v5, 0x493

    const/16 v7, 0x492

    const/4 v8, 0x1

    const/4 v10, 0x0

    if-eq v6, v7, :cond_9

    move v6, v8

    goto :goto_6

    :cond_9
    move v6, v10

    :goto_6
    and-int/lit8 v7, v5, 0x1

    invoke-virtual {v9, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_1f

    invoke-virtual {v1}, Ltx0/g;->a()Li51/h;

    move-result-object v17

    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v11}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v10, v9, v8}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v12

    const/16 v6, 0xe

    invoke-static {v11, v12, v6}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v11, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    invoke-static {v11, v12, v9, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    iget-wide v13, v9, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v9, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-eqz v8, :cond_a

    invoke-virtual {v9, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_7
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v9, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v9, v11, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-nez v10, :cond_b

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v10, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    :cond_b
    invoke-static {v12, v9, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v15, La3/k;->d:La3/i;

    invoke-static {v9, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v22, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    const-string v6, "Lottie Tester"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v23

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/w;->a()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v25

    const v39, 0xfffa

    const/16 v40, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    invoke-direct/range {v22 .. v40}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v6, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v6, v6, 0x3

    and-int/lit16 v10, v5, 0x1c00

    or-int/2addr v6, v10

    const/16 v12, 0x35

    const/4 v4, 0x0

    move-object v10, v11

    move v11, v6

    const/4 v6, 0x0

    move-object/from16 v23, v8

    const/4 v8, 0x0

    move-object/from16 v28, v9

    const/4 v9, 0x0

    move/from16 v32, v5

    move-object v3, v7

    move-object/from16 v43, v10

    move-object/from16 v41, v17

    move-object/from16 v5, v22

    move-object/from16 v42, v23

    move-object/from16 v10, v28

    const/high16 v0, 0x3f800000    # 1.0f

    move-object/from16 v7, p3

    invoke-static/range {v4 .. v12}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v10

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v22

    and-int/lit8 v4, v32, 0x70

    const/16 v5, 0x20

    if-ne v4, v5, :cond_d

    const/4 v8, 0x1

    goto :goto_8

    :cond_d
    const/4 v8, 0x0

    :goto_8
    and-int/lit8 v6, v32, 0xe

    const/4 v7, 0x4

    if-eq v6, v7, :cond_f

    and-int/lit8 v6, v32, 0x8

    if-eqz v6, :cond_e

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

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
    or-int/2addr v6, v8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-nez v6, :cond_10

    if-ne v8, v10, :cond_11

    :cond_10
    new-instance v8, Ls51/f;

    const/16 v6, 0x11

    invoke-direct {v8, v2, v1, v6}, Ls51/f;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object/from16 v26, v8

    check-cast v26, Lc93/a;

    const/16 v27, 0xf

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v22 .. v27}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v8, 0x2

    int-to-float v11, v8

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float/2addr v11, v12

    const/4 v5, 0x1

    int-to-float v7, v5

    mul-float v5, v7, v12

    invoke-static {v6, v11, v5}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Ll0/m;->g:Ll0/h;

    sget-object v12, Lb2/e;->K:Lb2/l;

    const/16 v8, 0x36

    invoke-static {v7, v12, v9, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v0, v9, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    invoke-static {v9, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-eqz v8, :cond_12

    invoke-virtual {v9, v14}, Lp1/q;->l(Lc93/a;)V

    :goto_b
    move-object/from16 v8, v42

    goto :goto_c

    :cond_12
    invoke-virtual {v9}, Lp1/q;->s0()V

    goto :goto_b

    :goto_c
    invoke-static {v9, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v7, v43

    invoke-static {v9, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v9, Lp1/q;->S:Z

    if-nez v1, :cond_13

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    :cond_13
    invoke-static {v0, v9, v0, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v9, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v9, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    invoke-virtual {v0, v9, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v6

    sget v8, Lb91/a;->d:I

    shl-int/lit8 v30, v8, 0x12

    const v31, 0x2fffa

    move-object/from16 v28, v9

    move-wide v8, v6

    const-string v6, "Override Lotties"

    const/4 v7, 0x0

    move-object v13, v10

    move v12, v11

    const-wide/16 v10, 0x0

    move v14, v12

    const/4 v12, 0x0

    move-object v15, v13

    const/4 v13, 0x0

    move/from16 v17, v14

    const/4 v14, 0x0

    move-object/from16 v19, v15

    const/16 v20, 0x4

    const-wide/16 v15, 0x0

    move/from16 v22, v17

    const/16 v17, 0x0

    const/16 v23, 0x2

    const/16 v18, 0x0

    move-object/from16 v24, v19

    move/from16 v25, v20

    const-wide/16 v19, 0x0

    const/16 v27, 0x20

    const/16 v21, 0x0

    move/from16 v29, v22

    const/16 v22, 0x0

    move/from16 v35, v23

    const/16 v23, 0x0

    move-object/from16 v36, v24

    const/16 v24, 0x0

    move/from16 v37, v25

    const/16 v25, 0x0

    move/from16 v38, v27

    const/16 v27, 0x0

    move/from16 v39, v29

    const/16 v29, 0x6

    move/from16 v40, v4

    move-object/from16 v44, v36

    move/from16 v4, v39

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    invoke-virtual {v0, v9, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->k0()J

    move-result-wide v6

    new-instance v8, Lpp2/o;

    const/16 v10, 0xc

    move-object/from16 v11, p0

    invoke-direct {v8, v10, v11, v2}, Lpp2/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v10, 0x3d319b0

    invoke-static {v10, v9, v8}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v14

    const/16 v16, 0x6000

    const/16 v17, 0xd

    move-wide v8, v6

    const-wide/16 v6, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    move-object/from16 v15, v28

    invoke-static/range {v6 .. v17}, Ly81/c;->b(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v15

    const/4 v6, 0x1

    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7, v4, v5}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v17, 0x6

    const/16 v18, 0xfe

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v28, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v28

    invoke-static/range {v6 .. v18}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v9, v16

    invoke-static {v3, v4, v5}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v0, v9, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->I()Lb91/a;

    move-result-object v26

    invoke-virtual {v0, v9, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v0

    const/16 v29, 0x36

    const v31, 0x2fff8

    const-string v6, "Sandbox"

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v28, v9

    move-wide v8, v0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v4, v5}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const-string v0, "SELECT LOTTIE"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    move/from16 v0, v40

    const/16 v5, 0x20

    if-ne v0, v5, :cond_15

    const/4 v8, 0x1

    goto :goto_d

    :cond_15
    const/4 v8, 0x0

    :goto_d
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v7, v44

    if-nez v8, :cond_16

    if-ne v1, v7, :cond_17

    :cond_16
    new-instance v1, Lsg2/i;

    const/16 v8, 0x11

    invoke-direct {v1, v2, v8}, Lsg2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object/from16 v19, v1

    check-cast v19, Lc93/a;

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v1, v1, 0x12

    const/4 v8, 0x6

    or-int/lit8 v21, v1, 0x6

    const/16 v22, 0x0

    const/16 v23, 0x1fbe

    move-object/from16 v44, v7

    const/4 v7, 0x0

    move v1, v8

    const/4 v8, 0x0

    move-object/from16 v28, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move v5, v1

    move-object/from16 v20, v28

    move-object/from16 v1, v44

    invoke-static/range {v6 .. v23}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v20

    move-object/from16 v6, v41

    if-eqz v6, :cond_1a

    const v7, -0x6bd77042

    invoke-virtual {v9, v7}, Lp1/q;->e0(I)V

    const-string v7, "StreaksMediaContent"

    invoke-static {v7, v9, v5}, Ltx0/d;->m(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget v7, Li51/h;->a:I

    invoke-static {v6, v9, v7}, Ltx0/d;->y(Li51/h;Landroidx/compose/runtime/Composer;I)V

    const/16 v7, 0xa

    int-to-float v7, v7

    const/4 v8, 0x4

    int-to-float v8, v8

    mul-float v12, v7, v8

    invoke-static {v12, v3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v9, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    instance-of v13, v6, Li51/h$d;

    if-eqz v13, :cond_18

    const v7, -0x6bd3f828

    invoke-virtual {v9, v7}, Lp1/q;->e0(I)V

    const-string v7, "StreakFireLottie"

    invoke-static {v7, v9, v5}, Ltx0/d;->m(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v17, v6

    check-cast v17, Li51/h$d;

    invoke-virtual/range {v17 .. v17}, Li51/h$d;->a()Lv41/r0;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v7, v9, v8}, Ltx0/d;->v(Lv41/r0;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v9, v8}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_18
    const/4 v8, 0x0

    const v7, -0x6bd18cc3

    invoke-virtual {v9, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v8}, Lp1/q;->q(Z)V

    :goto_e
    const-string v7, "CelebrationMedia - Small"

    invoke-static {v7, v9, v5}, Ltx0/d;->m(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v14, 0x0

    const/4 v15, 0x2

    invoke-static {v3, v4, v14, v15}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    new-instance v16, Li51/i;

    sget-object v18, Li51/g;->SMALL:Li51/g;

    const/16 v23, 0x3c

    const/16 v24, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v17, v6

    invoke-direct/range {v16 .. v24}, Li51/i;-><init>(Li51/h;Li51/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Li51/p;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v6, Li51/i;->g:I

    or-int/lit8 v10, v6, 0x30

    const/4 v11, 0x4

    const/4 v8, 0x0

    move-object/from16 v6, v16

    invoke-static/range {v6 .. v11}, Li51/f;->d(Li51/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const-string v6, "CelebrationMedia - Medium"

    invoke-static {v6, v9, v5}, Ltx0/d;->m(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v3, v4, v14, v15}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    new-instance v16, Li51/i;

    sget-object v18, Li51/g;->MEDIUM:Li51/g;

    invoke-direct/range {v16 .. v24}, Li51/i;-><init>(Li51/h;Li51/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Li51/p;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, v16

    invoke-static/range {v6 .. v11}, Li51/f;->d(Li51/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const-string v6, "CelebrationMedia - Large"

    invoke-static {v6, v9, v5}, Ltx0/d;->m(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v3, v4, v14, v15}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    new-instance v16, Li51/i;

    sget-object v18, Li51/g;->LARGE:Li51/g;

    invoke-direct/range {v16 .. v24}, Li51/i;-><init>(Li51/h;Li51/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Li51/p;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, v16

    invoke-static/range {v6 .. v11}, Li51/f;->d(Li51/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    if-eqz v13, :cond_19

    const v4, -0x6bbfa0a4

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    const-string v4, "YearInReviewStreaksStatsCardItem"

    invoke-static {v4, v9, v5}, Ltx0/d;->m(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    check-cast v17, Li51/h$d;

    invoke-virtual/range {v17 .. v17}, Li51/h$d;->a()Lv41/r0;

    move-result-object v4

    const/4 v8, 0x0

    invoke-static {v4, v9, v8}, Ltx0/d;->A(Lv41/r0;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v9, v8}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_19
    const/4 v8, 0x0

    const v4, -0x6bbccc23

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v8}, Lp1/q;->q(Z)V

    :goto_f
    invoke-static {v3, v12, v9, v8}, Lq63/c;->u(Lb2/t;FLp1/q;Z)V

    :goto_10
    const/4 v5, 0x1

    goto :goto_11

    :cond_1a
    const/4 v8, 0x0

    const v3, -0x6bbbc4a3

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v8}, Lp1/q;->q(Z)V

    goto :goto_10

    :goto_11
    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Ltx0/g;->d()Z

    move-result v3

    if-eqz v3, :cond_1e

    const v3, 0x21a94669

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Ltx0/g;->b()Lgv1/o;

    move-result-object v3

    const/16 v4, 0x20

    if-ne v0, v4, :cond_1b

    move v8, v5

    goto :goto_12

    :cond_1b
    const/4 v8, 0x0

    :goto_12
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v8, :cond_1c

    if-ne v0, v1, :cond_1d

    :cond_1c
    new-instance v0, Lsg2/i;

    const/16 v1, 0x12

    invoke-direct {v0, v2, v1}, Lsg2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v0, Lc93/a;

    sget v1, Lgv1/o;->a:I

    shr-int/lit8 v4, v32, 0x3

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v1, v4

    move-object/from16 v4, p2

    invoke-static {v3, v4, v0, v9, v1}, Lgv1/g;->p(Lgv1/o;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    const/4 v8, 0x0

    invoke-virtual {v9, v8}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_1e
    move-object/from16 v4, p2

    const/4 v8, 0x0

    const v0, 0x21acb4d3

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v8}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_1f
    move-object v4, v3

    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_13
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_20

    new-instance v0, Ltu1/c;

    move-object/from16 v1, p0

    move/from16 v5, p5

    move-object v3, v4

    move-object/from16 v4, p3

    invoke-direct/range {v0 .. v5}, Ltu1/c;-><init>(Ltx0/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;I)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_20
    return-void
.end method

.method private static final p(Lkotlin/jvm/functions/Function1;Ltx0/g;)Ll83/a0;
    .locals 1

    new-instance v0, Ltx0/e$a;

    invoke-virtual {p1}, Ltx0/g;->c()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-direct {v0, p1}, Ltx0/e$a;-><init>(Z)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Ltx0/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p3, v2

    move-object v9, p2

    check-cast v9, Lp1/q;

    invoke-virtual {v9, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p0}, Ltx0/g;->c()Z

    move-result v2

    invoke-virtual {v9, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p0, :cond_1

    sget-object p0, Lp1/l;->a:Lp1/v0;

    if-ne p2, p0, :cond_2

    :cond_1
    new-instance p2, Lsg2/b;

    const/16 p0, 0x11

    invoke-direct {p2, p1, p0}, Lsg2/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v8, p2

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/4 v10, 0x0

    const/16 v11, 0x3d

    const/4 v1, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v11}, Lpz0/d;->e(Landroidx/compose/ui/Modifier;ZZJLpz0/e;Li2/t;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 1

    new-instance v0, Ltx0/e$a;

    invoke-direct {v0, p1}, Ltx0/e$a;-><init>(Z)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Ltx0/e$b;->a:Ltx0/e$b;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Ltx0/e$c;->a:Ltx0/e$c;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Ltx0/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Ltx0/d;->o(Ltx0/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lv41/r0;Landroidx/compose/runtime/Composer;I)V
    .locals 15

    move/from16 v13, p2

    move-object/from16 v14, p1

    check-cast v14, Lp1/q;

    const v0, -0x295cace4

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v13, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v14, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, v13

    goto :goto_1

    :cond_1
    move v0, v13

    :goto_1
    and-int/lit8 v2, v0, 0x3

    const/4 v3, 0x1

    if-eq v2, v1, :cond_2

    move v1, v3

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    and-int/2addr v0, v3

    invoke-virtual {v14, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v3, Lfm1/h;->ACTIVE:Lfm1/h;

    sget-object v4, Ly81/f;->BRAND_WHITE:Ly81/f;

    new-instance v6, Lcom/whoop/navigation/e;

    const/4 v10, 0x7

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lfm1/i;

    const/16 v11, 0x280

    const/4 v12, 0x0

    const/4 v1, 0x1

    const-string v2, "122"

    move-object v9, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v5, p0

    invoke-direct/range {v0 .. v12}, Lfm1/i;-><init>(ZLjava/lang/String;Lfm1/h;Ly81/f;Lv41/r0;Lkd1/o;ZZLcom/whoop/navigation/e;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_3

    new-instance v1, Lt71/i;

    const/16 v2, 0x13

    invoke-direct {v1, v2}, Lt71/i;-><init>(I)V

    invoke-virtual {v14, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v1, Lkotlin/jvm/functions/Function1;

    sget v2, Lfm1/i;->k:I

    or-int/lit8 v2, v2, 0x30

    invoke-static {v0, v1, v14, v2}, Ljk2/i;->n(Lfm1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_3

    :cond_4
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v1, Ltx0/c;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v13, v2}, Ltx0/c;-><init>(Lv41/r0;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final w(Lem1/t;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lv41/r0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Ltx0/d;->v(Lv41/r0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Li51/h;Landroidx/compose/runtime/Composer;I)V
    .locals 27

    move-object/from16 v1, p0

    move/from16 v9, p2

    move-object/from16 v10, p1

    check-cast v10, Lp1/q;

    const v0, -0x632b189f

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v9, 0x6

    const/4 v2, 0x2

    if-nez v0, :cond_2

    and-int/lit8 v0, v9, 0x8

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
    move v0, v2

    :goto_1
    or-int/2addr v0, v9

    goto :goto_2

    :cond_2
    move v0, v9

    :goto_2
    and-int/lit8 v3, v0, 0x3

    const/4 v4, 0x1

    if-eq v3, v2, :cond_3

    move v2, v4

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    :goto_3
    and-int/2addr v0, v4

    invoke-virtual {v10, v0, v2}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v11, Lui2/c;

    const-string v12, ""

    move-object v13, v12

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    new-instance v15, Li51/i;

    sget-object v2, Li51/g;->LARGE:Li51/g;

    const-string v0, "2000"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/16 v7, 0x38

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, v15

    invoke-direct/range {v0 .. v8}, Li51/i;-><init>(Li51/h;Li51/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Li51/p;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    sget-object v20, Ly81/f;->BRAND_WHITE:Ly81/f;

    sget-object v21, Lui2/b;->NONE:Lui2/b;

    new-instance v2, Lcom/whoop/navigation/e;

    sget-object v3, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v25, 0x810

    const/16 v26, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    sget-object v22, Lm83/y;->w:Lm83/y;

    const/16 v23, 0x0

    move-object/from16 v24, v2

    invoke-direct/range {v11 .. v26}, Lui2/c;-><init>(Lcom/whoop/design/util/TextResource;Lv41/r0;Lkd1/o;Li51/i;Lsz0/k1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lui2/a;Ly81/f;Lui2/b;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lti2/g;

    const/16 v18, 0x1f

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v12 .. v19}, Lti2/g;-><init>(ZZLui2/c;Lti2/g$a;Lti2/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v0, Lui2/c;->n:I

    sget v2, Lti2/g;->f:I

    shl-int/lit8 v2, v2, 0x3

    or-int/2addr v0, v2

    invoke-static {v11, v12, v10, v0}, Lxi2/f;->E(Lui2/c;Lti2/g;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_4
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v2, Lsl0/j2;

    const/4 v3, 0x5

    invoke-direct {v2, v1, v9, v3}, Lsl0/j2;-><init>(Ljava/lang/Object;II)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final z(Li51/h;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Ltx0/d;->y(Li51/h;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

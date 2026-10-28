.class public abstract Lk31/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a;\u0010\n\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lgz0/m0;",
        "icon",
        "Lcom/whoop/design/util/TextResource;",
        "primaryText",
        "",
        "isExpanded",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onEvent",
        "e",
        "(Lgz0/m0;Lcom/whoop/design/util/TextResource;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lk31/b;->h(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lk31/b;->g(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ZLkotlin/jvm/functions/Function1;Lgz0/m0;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lk31/b;->f(ZLkotlin/jvm/functions/Function1;Lgz0/m0;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lgz0/m0;Lcom/whoop/design/util/TextResource;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lk31/b;->i(Lgz0/m0;Lcom/whoop/design/util/TextResource;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lgz0/m0;Lcom/whoop/design/util/TextResource;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgz0/m0;",
            "Lcom/whoop/design/util/TextResource;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    const-string v0, "icon"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryText"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p4

    check-cast v13, Lp1/q;

    const v0, 0x3cded37

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    const/4 v6, 0x2

    const/4 v7, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {v13, v0}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v7

    goto :goto_0

    :cond_0
    move v0, v6

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v8, v5, 0x30

    if-nez v8, :cond_3

    invoke-virtual {v13, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v0, v8

    :cond_3
    and-int/lit16 v8, v5, 0x180

    if-nez v8, :cond_5

    invoke-virtual {v13, v3}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v0, v8

    :cond_5
    and-int/lit16 v8, v5, 0xc00

    if-nez v8, :cond_7

    invoke-virtual {v13, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x800

    goto :goto_4

    :cond_6
    const/16 v8, 0x400

    :goto_4
    or-int/2addr v0, v8

    :cond_7
    and-int/lit16 v8, v0, 0x493

    const/16 v9, 0x492

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v8, v9, :cond_8

    move v8, v11

    goto :goto_5

    :cond_8
    move v8, v10

    :goto_5
    and-int/2addr v0, v11

    invoke-virtual {v13, v0, v8}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_9

    const/4 v0, 0x3

    int-to-float v0, v0

    int-to-float v7, v7

    mul-float/2addr v0, v7

    invoke-static {v0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v7

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v8, 0x6

    invoke-virtual {v0, v13, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->r()J

    move-result-wide v11

    int-to-float v9, v10

    new-instance v10, Lf0/t;

    int-to-float v6, v6

    new-instance v14, Li2/c1;

    invoke-virtual {v0, v13, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    move-object/from16 p4, v7

    invoke-virtual {v0}, Ly81/i;->w()J

    move-result-wide v7

    invoke-direct {v14, v7, v8}, Li2/c1;-><init>(J)V

    invoke-direct {v10, v6, v14}, Lf0/t;-><init>(FLi2/t;)V

    new-instance v0, Lay/a0;

    invoke-direct {v0, v3, v4, v1, v2}, Lay/a0;-><init>(ZLkotlin/jvm/functions/Function1;Lgz0/m0;Lcom/whoop/design/util/TextResource;)V

    const v6, -0x3e5913e6

    invoke-static {v6, v13, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const v14, 0x1b0006

    const/16 v15, 0x8

    sget-object v6, Lb2/t;->w:Lb2/t;

    move-wide/from16 v16, v11

    move v11, v9

    move-wide/from16 v8, v16

    move-object/from16 v7, p4

    move-object v12, v0

    invoke-static/range {v6 .. v15}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_6

    :cond_9
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_a

    new-instance v0, Lar2/a;

    const/16 v6, 0x14

    invoke-direct/range {v0 .. v6}, Lar2/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final f(ZLkotlin/jvm/functions/Function1;Lgz0/m0;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 32

    move-object/from16 v0, p1

    and-int/lit8 v1, p5, 0x3

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-eq v1, v4, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    and-int/lit8 v5, p5, 0x1

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v5, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v1, v5, :cond_1

    invoke-static {v11}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v1

    :cond_1
    move-object v13, v1

    check-cast v13, Lj0/i;

    const-wide/16 v6, 0x0

    const/4 v1, 0x7

    const/4 v8, 0x0

    invoke-static {v6, v7, v1, v3, v8}, Lg1/z4;->a(JIZF)Landroidx/compose/material/d;

    move-result-object v14

    sget-object v12, Lb2/t;->w:Lb2/t;

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    const/16 v1, 0x8

    if-eqz p0, :cond_4

    const v8, 0x7fefa195

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_2

    if-ne v9, v5, :cond_3

    :cond_2
    new-instance v9, Ljp1/l;

    const/16 v5, 0xf

    invoke-direct {v9, v0, v5}, Ljp1/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object/from16 v17, v9

    check-cast v17, Lc93/a;

    const/16 v18, 0x1c

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v12 .. v18}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-string v5, "REPLAY"

    invoke-static {v0, v5}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v4, v4

    int-to-float v5, v1

    mul-float/2addr v4, v5

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    move-object v4, v12

    goto :goto_1

    :cond_4
    const v4, 0x7ff4d93f

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_5

    if-ne v8, v5, :cond_6

    :cond_5
    new-instance v8, Ljp1/l;

    const/16 v4, 0x10

    invoke-direct {v8, v0, v4}, Ljp1/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object/from16 v17, v8

    check-cast v17, Lc93/a;

    const/16 v18, 0x1c

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v12 .. v18}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object v4, v12

    const-string v5, "REPLAY_NON_EXPANDED_BUTTON"

    invoke-static {v0, v5}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    double-to-float v5, v6

    int-to-float v8, v1

    mul-float/2addr v5, v8

    invoke-static {v5, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    :goto_1
    const/4 v5, 0x0

    const/4 v8, 0x3

    invoke-static {v0, v5, v8}, Landroidx/compose/animation/c;->a(Landroidx/compose/ui/Modifier;Ld0/e2;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, Ll0/m;->a:Ll0/e;

    sget-object v8, Lb2/e;->K:Lb2/l;

    const/16 v9, 0x36

    invoke-static {v5, v8, v11, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v8, v11, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v11, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-eqz v12, :cond_7

    invoke-virtual {v11, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_7
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_2
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v11, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v11, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-nez v9, :cond_8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_9

    :cond_8
    invoke-static {v8, v11, v8, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v11, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p2 .. p2}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    const/4 v5, 0x6

    invoke-static {v0, v11, v5}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    sget-object v14, Lx81/d;->a:Lx81/d;

    invoke-virtual {v14, v11, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v9

    const/16 v12, 0x30

    const/4 v13, 0x4

    move-wide v15, v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v6, v0

    move-wide v1, v15

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    if-eqz p0, :cond_a

    const v0, 0x9ea7efb

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    move-object/from16 v0, p3

    invoke-static {v0, v11, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    double-to-float v0, v1

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    const/4 v1, 0x0

    const/16 v2, 0xe

    const/4 v7, 0x0

    const/4 v8, 0x0

    move/from16 p1, v0

    move/from16 p4, v1

    move/from16 p5, v2

    move-object/from16 p0, v4

    move/from16 p2, v7

    move/from16 p3, v8

    invoke-static/range {p0 .. p5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v14, v11, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v8

    invoke-virtual {v14, v11, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->s()Lb91/a;

    move-result-object v26

    const/16 v30, 0x0

    const v31, 0x2fff8

    move-object/from16 v28, v11

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x30

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    :goto_3
    const/4 v0, 0x1

    goto :goto_4

    :cond_a
    const v0, 0x9eed9e4

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :goto_4
    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_b
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lk31/a;->REPLAY:Lk31/a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lk31/a;->REPLAY:Lk31/a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lgz0/m0;Lcom/whoop/design/util/TextResource;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lk31/b;->e(Lgz0/m0;Lcom/whoop/design/util/TextResource;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

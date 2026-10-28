.class public abstract Lc41/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a/\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u000f\u0010\n\u001a\u00020\tH\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lc41/r;",
        "state",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onToggle",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "c",
        "(Lc41/r;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "Lg1/a1;",
        "f",
        "(Landroidx/compose/runtime/Composer;I)Lg1/a1;",
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
.method public static synthetic a(Lc41/r;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lc41/u;->d(Lc41/r;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc41/r;Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lc41/u;->e(Lc41/r;Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lc41/r;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc41/r;",
            "Lc93/a;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onToggle"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v0, 0x6b89c4bf

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v3, v4, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v5, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v5, v4, 0x180

    if-nez v5, :cond_4

    move-object/from16 v5, p2

    invoke-virtual {v14, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_3

    :cond_6
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v0, v6

    :goto_4
    and-int/lit16 v6, v0, 0x93

    const/16 v7, 0x92

    const/4 v8, 0x0

    if-eq v6, v7, :cond_7

    const/4 v6, 0x1

    goto :goto_5

    :cond_7
    move v6, v8

    :goto_5
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v14, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_a

    if-eqz v3, :cond_8

    sget-object v3, Lb2/t;->w:Lb2/t;

    move-object v5, v3

    :cond_8
    invoke-static {v1}, Lc41/s;->a(Lc41/r;)Z

    move-result v3

    const/4 v6, 0x6

    if-eqz v3, :cond_9

    const v3, 0x554a3a93

    invoke-virtual {v14, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3, v14, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->a1()J

    move-result-wide v9

    invoke-virtual {v14, v8}, Lp1/q;->q(Z)V

    :goto_6
    move-wide v7, v9

    goto :goto_7

    :cond_9
    const v3, 0x554b0bf2

    invoke-virtual {v14, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-static {v3, v14, v6, v8}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v9

    goto :goto_6

    :goto_7
    new-instance v3, La0;

    const/16 v9, 0xa

    invoke-direct {v3, v9, v1, v2}, La0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v9, 0x571ef72f

    invoke-static {v9, v14, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    shr-int/2addr v0, v6

    and-int/lit8 v0, v0, 0xe

    const/high16 v3, 0xc00000

    or-int v15, v0, v3

    const/16 v16, 0x7a

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v5 .. v16}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    :goto_8
    move-object v3, v5

    goto :goto_9

    :cond_a
    invoke-virtual {v14}, Lp1/q;->X()V

    goto :goto_8

    :goto_9
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_b

    new-instance v0, La01/e;

    const/16 v6, 0x1c

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, La01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/Modifier;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final d(Lc41/r;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 31

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v4, p3, 0x1

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    invoke-virtual {v13, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static/range {p0 .. p0}, Lc41/s;->a(Lc41/r;)Z

    move-result v6

    const/4 v8, 0x0

    const/16 v10, 0xe

    const/4 v7, 0x0

    move-object/from16 v9, p1

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lc41/r;->c()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "activity_tile_selection_"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v3, v3

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v3, v5

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    double-to-float v6, v6

    mul-float/2addr v6, v5

    invoke-static {v0, v3, v6}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v5, Lb2/e;->K:Lb2/l;

    const/16 v6, 0x36

    invoke-static {v3, v5, v13, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v5, v13, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v13, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-eqz v8, :cond_1

    invoke-virtual {v13, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v13, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v13, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v13, Lp1/q;->S:Z

    if-nez v6, :cond_2

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    :cond_2
    invoke-static {v5, v13, v5, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v13, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {p0 .. p0}, Lc41/s;->a(Lc41/r;)Z

    move-result v0

    const/4 v3, 0x6

    if-eqz v0, :cond_4

    const v0, -0x72df5bb9

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    sget-object v0, Ly81/f;->STRAIN:Ly81/f;

    invoke-virtual {v0, v13, v3}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v5

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    :goto_2
    move-wide v8, v5

    goto :goto_3

    :cond_4
    const v0, -0x72de0e3b

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    sget-object v0, Ly81/f;->WHITE_20:Ly81/f;

    invoke-virtual {v0, v13, v3}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v5

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    goto :goto_2

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lc41/r;->g()Lkd1/o;

    move-result-object v0

    if-nez v0, :cond_5

    new-instance v0, Lkd1/o$a;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/a;->a()I

    move-result v5

    invoke-direct {v0, v5}, Lkd1/o$a;-><init>(I)V

    :cond_5
    move-object v10, v0

    invoke-virtual/range {p0 .. p0}, Lc41/r;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    const/16 v14, 0x36

    const/16 v15, 0x44

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v12, 0x0

    invoke-static/range {v5 .. v15}, Ljy0/b;->b(ZZLi91/a;JLkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {p0 .. p0}, Lc41/r;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0, v13, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    float-to-double v6, v4

    const-wide/16 v8, 0x0

    cmpl-double v0, v6, v8

    if-lez v0, :cond_6

    goto :goto_4

    :cond_6
    const-string v0, "invalid weight; must be greater than zero"

    invoke-static {v0}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_4
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v6, v4, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v13, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->r()Lb91/a;

    move-result-object v25

    invoke-static/range {p0 .. p0}, Lc41/s;->a(Lc41/r;)Z

    move-result v4

    if-eqz v4, :cond_7

    const v4, -0x72d74fad

    invoke-static {v13, v4, v0, v13, v3}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v7

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    const v4, -0x72d6314a

    invoke-static {v13, v4, v0, v13, v3}, Lr80/c;->c(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v7

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    :goto_5
    const/16 v29, 0x0

    const v30, 0x2fff8

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v27, v13

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v27

    invoke-virtual/range {p0 .. p0}, Lc41/r;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lc41/r;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v0, v13, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b1()J

    move-result-wide v7

    const/4 v10, 0x0

    move-object v9, v13

    invoke-static/range {v5 .. v10}, Lky0/b;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_8
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final e(Lc41/r;Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lc41/u;->c(Lc41/r;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final f(Landroidx/compose/runtime/Composer;I)Lg1/a1;
    .locals 13

    sget-object p1, Lx81/d;->a:Lx81/d;

    const/4 v0, 0x6

    invoke-virtual {p1, p0, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v2

    invoke-virtual {p1, p0, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v4

    invoke-virtual {p1, p0, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->w()J

    move-result-wide v6

    invoke-virtual {p1, p0, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p1

    invoke-virtual {p1}, Ly81/i;->X0()J

    move-result-wide v8

    const/4 v11, 0x0

    const/16 v12, 0x10

    move-object v10, p0

    invoke-static/range {v2 .. v12}, Ldp/d;->r(JJJJLandroidx/compose/runtime/Composer;II)Lg1/r1;

    move-result-object p0

    return-object p0
.end method

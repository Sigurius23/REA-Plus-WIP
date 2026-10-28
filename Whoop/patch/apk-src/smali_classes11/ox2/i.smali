.class public abstract Lox2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a/\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lpx2/j;",
        "viewState",
        "Lkotlin/Function1;",
        "Llx2/a;",
        "Ll83/a0;",
        "onViewEvent",
        "g",
        "(Lpx2/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lcom/whoop/design/util/TextResource;",
        "text",
        "Li2/x;",
        "textColor",
        "backgroundColor",
        "Lgz0/m0;",
        "icon",
        "e",
        "(Lcom/whoop/design/util/TextResource;JJLgz0/m0;Landroidx/compose/runtime/Composer;I)V",
        "whooplabs_release"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lpx2/j;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lox2/i;->i(Lkotlin/jvm/functions/Function1;Lpx2/j;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/util/TextResource;JJLgz0/m0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lox2/i;->f(Lcom/whoop/design/util/TextResource;JJLgz0/m0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lpx2/j;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lox2/i;->j(Lpx2/j;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lpx2/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lox2/i;->h(Lpx2/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/util/TextResource;JJLgz0/m0;Landroidx/compose/runtime/Composer;I)V
    .locals 34

    move-object/from16 v1, p0

    move-wide/from16 v4, p3

    move/from16 v7, p7

    move-object/from16 v13, p6

    check-cast v13, Lp1/q;

    const v0, 0xf636094

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x6

    const/4 v2, 0x2

    const/4 v3, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, v7, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    or-int/2addr v0, v7

    goto :goto_2

    :cond_2
    move v0, v7

    :goto_2
    and-int/lit8 v6, v7, 0x30

    move-wide/from16 v10, p1

    if-nez v6, :cond_4

    invoke-virtual {v13, v10, v11}, Lp1/q;->f(J)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v0, v6

    :cond_4
    and-int/lit16 v6, v7, 0x180

    if-nez v6, :cond_6

    invoke-virtual {v13, v4, v5}, Lp1/q;->f(J)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_4

    :cond_5
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v0, v6

    :cond_6
    and-int/lit16 v6, v7, 0xc00

    if-nez v6, :cond_8

    invoke-virtual/range {p5 .. p5}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    invoke-virtual {v13, v6}, Lp1/q;->e(I)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x800

    goto :goto_5

    :cond_7
    const/16 v6, 0x400

    :goto_5
    or-int/2addr v0, v6

    :cond_8
    and-int/lit16 v6, v0, 0x493

    const/16 v8, 0x492

    const/4 v12, 0x1

    if-eq v6, v8, :cond_9

    move v6, v12

    goto :goto_6

    :cond_9
    const/4 v6, 0x0

    :goto_6
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v13, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_d

    int-to-float v6, v12

    int-to-float v3, v3

    mul-float v8, v6, v3

    invoke-static {v8}, Lt0/j;->e(F)Lt0/i;

    move-result-object v8

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v8}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v15, Li2/w0;->a:Li2/v0;

    invoke-static {v8, v4, v5, v15}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v15, 0x8

    int-to-float v15, v15

    mul-float/2addr v6, v15

    const-wide/high16 v9, 0x3fe0000000000000L    # 0.5

    double-to-float v9, v9

    mul-float/2addr v9, v15

    invoke-static {v8, v6, v9}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Lb2/e;->K:Lb2/l;

    sget-object v10, Ll0/m;->a:Ll0/e;

    const/16 v11, 0x30

    invoke-static {v10, v8, v13, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v10, v13, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v13, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_a

    invoke-virtual {v13, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_7
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v13, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v13, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v11, v13, Lp1/q;->S:Z

    if-nez v11, :cond_b

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_c

    :cond_b
    invoke-static {v10, v13, v10, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v13, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v18, 0x0

    const/16 v19, 0xb

    const/4 v15, 0x0

    const/16 v16, 0x0

    move/from16 v17, v9

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v2, v2

    mul-float/2addr v2, v3

    invoke-static {v2, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual/range {p5 .. p5}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v2, v13, v3}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v8

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    and-int/lit8 v3, v0, 0xe

    or-int/2addr v2, v3

    invoke-static {v1, v13, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    shl-int/lit8 v3, v0, 0x6

    and-int/lit16 v3, v3, 0x1c00

    or-int/lit16 v14, v3, 0x180

    const/4 v15, 0x0

    move-wide/from16 v11, p1

    const/4 v3, 0x1

    invoke-static/range {v8 .. v15}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-static {v1, v13, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v2, v13, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->v()Lb91/a;

    move-result-object v28

    shl-int/lit8 v0, v0, 0x3

    and-int/lit16 v0, v0, 0x380

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v32, v2, 0x12

    const v33, 0x2fffa

    const/4 v9, 0x0

    move-object/from16 v30, v13

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-wide/from16 v10, p1

    move/from16 v31, v0

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_d
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_e

    new-instance v0, Lc41/t3;

    move-wide/from16 v2, p1

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v7}, Lc41/t3;-><init>(Lcom/whoop/design/util/TextResource;JJLgz0/m0;I)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final f(Lcom/whoop/design/util/TextResource;JJLgz0/m0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p6, p6, 0x1

    invoke-static {p6}, Lp1/x;->L(I)I

    move-result v7

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    move-object v6, p7

    invoke-static/range {v0 .. v7}, Lox2/i;->e(Lcom/whoop/design/util/TextResource;JJLgz0/m0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final g(Lpx2/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpx2/j;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onViewEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    const v3, 0x6999e869

    invoke-virtual {v13, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_2

    and-int/lit8 v3, v2, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    or-int/2addr v3, v2

    goto :goto_2

    :cond_2
    move v3, v2

    :goto_2
    and-int/lit8 v5, v2, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v3, v5

    :cond_4
    and-int/lit8 v5, v3, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x1

    if-eq v5, v6, :cond_5

    move v5, v7

    goto :goto_4

    :cond_5
    const/4 v5, 0x0

    :goto_4
    and-int/2addr v3, v7

    invoke-virtual {v13, v3, v5}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_6

    int-to-float v3, v4

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float v7, v3, v4

    const/4 v9, 0x0

    const/16 v10, 0xd

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    new-instance v3, Lj21/d;

    const/16 v5, 0x1a

    invoke-direct {v3, v5, v0, v1}, Lj21/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v5, 0xfec0ff9

    invoke-static {v5, v13, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v12

    const v14, 0xc00006

    const/16 v15, 0x7e

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v4 .. v15}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_6
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_7

    new-instance v4, Lof2/d;

    const/16 v5, 0xa

    invoke-direct {v4, v0, v1, v2, v5}, Lof2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final h(Lpx2/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 46

    and-int/lit8 v2, p3, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-eq v2, v5, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    and-int/lit8 v6, p3, 0x1

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    invoke-virtual {v13, v6, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_13

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v5, v5

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v8, v5

    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v9, v10, v13, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v10, v13, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v13, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v14, v13, Lp1/q;->S:Z

    if-eqz v14, :cond_1

    invoke-virtual {v13, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_1
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v13, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v13, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v15, v13, Lp1/q;->S:Z

    if-nez v15, :cond_2

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v15, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    invoke-static {v10, v13, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v13, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v10, Ll0/m;->b:Ll0/e;

    sget-object v15, Lb2/e;->K:Lb2/l;

    const/16 v4, 0x36

    invoke-static {v10, v15, v13, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    move-object/from16 p3, v3

    iget-wide v2, v13, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v13, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-eqz v10, :cond_4

    invoke-virtual {v13, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v13, v14, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v13, Lp1/q;->S:Z

    if-nez v3, :cond_6

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v2, p3

    goto :goto_5

    :cond_6
    :goto_4
    invoke-static {v2, v13, v2, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_3

    :goto_5
    invoke-static {v13, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lpx2/j;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v13, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v3, v13, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->y()J

    move-result-wide v15

    invoke-virtual {v3, v13, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lb91/d;->i()Lb91/a;

    move-result-object v27

    move/from16 p3, v4

    move-object/from16 v18, v7

    move/from16 v17, v8

    const/high16 v4, 0x3f800000    # 1.0f

    float-to-double v7, v4

    const-wide/16 v33, 0x0

    cmpl-double v7, v7, v33

    const-string v35, "invalid weight; must be greater than zero"

    if-lez v7, :cond_7

    goto :goto_6

    :cond_7
    invoke-static/range {v35 .. v35}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_6
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v36, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v7, v4, v36

    if-lez v7, :cond_8

    move/from16 v4, v36

    :goto_7
    const/4 v7, 0x1

    goto :goto_8

    :cond_8
    const/high16 v4, 0x3f800000    # 1.0f

    goto :goto_7

    :goto_8
    invoke-direct {v8, v4, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v31, v4, 0x12

    const v32, 0x2fff8

    move-object v7, v11

    move-object v4, v12

    const-wide/16 v11, 0x0

    move-object/from16 v29, v13

    const/4 v13, 0x0

    move-object/from16 v19, v14

    const/4 v14, 0x0

    move/from16 v20, v10

    move-wide/from16 v44, v15

    move-object/from16 v16, v9

    move-wide/from16 v9, v44

    const/4 v15, 0x0

    move-object/from16 v22, v16

    move/from16 v21, v17

    const-wide/16 v16, 0x0

    move-object/from16 v23, v7

    move-object/from16 v7, v18

    const/16 v18, 0x0

    move-object/from16 v24, v19

    const/16 v19, 0x0

    move/from16 v26, v20

    move/from16 v25, v21

    const-wide/16 v20, 0x0

    move-object/from16 v28, v22

    const/16 v22, 0x0

    move-object/from16 v30, v23

    const/16 v23, 0x0

    move-object/from16 v37, v24

    const/16 v24, 0x0

    move/from16 v38, v25

    const/16 v25, 0x0

    move/from16 v39, v26

    const/16 v26, 0x0

    move-object/from16 v40, v28

    const/16 v28, 0x0

    move-object/from16 v41, v30

    const/16 v30, 0x0

    move-object/from16 v0, v37

    move/from16 v37, v5

    move-object v5, v0

    move/from16 v42, v39

    move-object/from16 v0, v40

    move-object/from16 v1, v41

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v29

    invoke-virtual/range {p0 .. p0}, Lpx2/j;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lpx2/j;->e()Ly81/e;

    move-result-object v8

    const/4 v9, 0x0

    invoke-interface {v8, v13, v9}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v10

    invoke-virtual/range {p0 .. p0}, Lpx2/j;->d()Ly81/e;

    move-result-object v8

    invoke-interface {v8, v13, v9}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v14

    invoke-virtual/range {p0 .. p0}, Lpx2/j;->c()Lgz0/m0;

    move-result-object v12

    move-wide v8, v10

    move-wide v10, v14

    move/from16 v14, p3

    invoke-static/range {v7 .. v14}, Lox2/i;->e(Lcom/whoop/design/util/TextResource;JJLgz0/m0;Landroidx/compose/runtime/Composer;I)V

    move v7, v14

    const/4 v8, 0x1

    invoke-virtual {v13, v8}, Lp1/q;->q(Z)V

    const/4 v8, 0x4

    int-to-float v8, v8

    mul-float v9, v37, v8

    invoke-static {v9, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v13, v10}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v10, Ll0/m;->a:Ll0/e;

    sget-object v12, Lb2/e;->J:Lb2/l;

    const/4 v14, 0x0

    invoke-static {v10, v12, v13, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v15

    move v14, v8

    move/from16 v17, v9

    iget-wide v8, v13, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v13, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v13}, Lp1/q;->i0()V

    move-object/from16 p3, v10

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-eqz v10, :cond_9

    invoke-virtual {v13, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_9
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v13, v5, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v0, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-nez v9, :cond_a

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_b

    :cond_a
    invoke-static {v8, v13, v8, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v13, v2, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lpx2/j;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {v8, v13, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    move/from16 v9, v42

    invoke-virtual {v3, v13, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->c1()J

    move-result-wide v10

    invoke-virtual {v3, v13, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->c()Lb91/a;

    move-result-object v27

    move/from16 v16, v7

    move-object/from16 v18, v8

    const/high16 v15, 0x3f800000    # 1.0f

    float-to-double v7, v15

    cmpl-double v7, v7, v33

    if-lez v7, :cond_c

    goto :goto_a

    :cond_c
    invoke-static/range {v35 .. v35}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_a
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v7, v15, v36

    if-lez v7, :cond_d

    move/from16 v7, v36

    :goto_b
    const/4 v15, 0x1

    goto :goto_c

    :cond_d
    const/high16 v7, 0x3f800000    # 1.0f

    goto :goto_b

    :goto_c
    invoke-direct {v8, v7, v15}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/16 v30, 0x0

    const v32, 0x2fff8

    move/from16 v42, v9

    move-wide v9, v10

    move-object v7, v12

    const-wide/16 v11, 0x0

    move-object/from16 v29, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v19, v15

    const/4 v15, 0x0

    move/from16 v20, v16

    move/from16 v21, v17

    const-wide/16 v16, 0x0

    move-object/from16 v22, v7

    move-object/from16 v7, v18

    const/16 v18, 0x0

    move/from16 v23, v19

    const/16 v19, 0x0

    move/from16 v24, v20

    move/from16 v25, v21

    const-wide/16 v20, 0x0

    move-object/from16 v26, v22

    const/16 v22, 0x0

    move/from16 v28, v23

    const/16 v23, 0x0

    move/from16 v33, v24

    const/16 v24, 0x0

    move/from16 v34, v25

    const/16 v25, 0x0

    move-object/from16 v35, v26

    const/16 v26, 0x0

    move/from16 v36, v28

    const/16 v28, 0x0

    move-object/from16 v41, v1

    move-object/from16 v1, v35

    move/from16 v43, v42

    move-object/from16 v35, v2

    move-object/from16 v2, p3

    move-object/from16 p3, v3

    move/from16 v3, v36

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v29

    const/4 v15, 0x1

    invoke-virtual {v13, v15}, Lp1/q;->q(Z)V

    int-to-float v7, v15

    invoke-static {v7, v3, v6, v13}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v15, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const/16 v18, 0x0

    const/16 v19, 0xd

    const/4 v15, 0x0

    const/16 v17, 0x0

    move/from16 v16, v38

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v14, 0x0

    invoke-static {v2, v1, v13, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v7, v13, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v13, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-eqz v8, :cond_e

    invoke-virtual {v13, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_e
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v13, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v13, Lp1/q;->S:Z

    if-nez v0, :cond_f

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    :cond_f
    move-object/from16 v1, v41

    goto :goto_f

    :cond_10
    :goto_e
    move-object/from16 v2, v35

    goto :goto_10

    :goto_f
    invoke-static {v2, v13, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_e

    :goto_10
    invoke-static {v13, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v15, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lpx2/j;->b()Lpx2/i;

    move-result-object v1

    invoke-virtual {v1}, Lpx2/i;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lpx2/j;->b()Lpx2/i;

    move-result-object v2

    invoke-virtual {v2}, Lpx2/i;->a()Lgz0/m0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    sget-object v3, Lg1/v0;->a:Ll0/l1;

    move-object/from16 v3, p3

    move/from16 v9, v43

    invoke-virtual {v3, v13, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->W0()J

    move-result-wide v7

    invoke-virtual {v3, v13, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v9

    const/16 v16, 0x0

    const/16 v17, 0xc

    const-wide/16 v11, 0x0

    move-object/from16 v29, v13

    const-wide/16 v13, 0x0

    move-object/from16 v15, v29

    invoke-static/range {v7 .. v17}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v14

    move-object v13, v15

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    move-object/from16 v2, p1

    invoke-virtual {v13, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    move-object/from16 v4, p0

    invoke-virtual {v13, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_11

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v5, v3, :cond_12

    :cond_11
    new-instance v5, Lox0/b;

    const/4 v3, 0x5

    invoke-direct {v5, v3, v2, v4}, Lox0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v13, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object/from16 v20, v5

    check-cast v20, Lc93/a;

    shl-int/lit8 v2, v33, 0x12

    or-int/lit8 v22, v2, 0x6

    const/16 v23, 0x6

    const/16 v24, 0x1b36

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v7, v0

    move-object/from16 v21, v13

    move/from16 v17, v34

    move-object v13, v1

    invoke-static/range {v7 .. v24}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v21

    const/4 v15, 0x1

    invoke-virtual {v13, v15}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v15}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_13
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_11
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;Lpx2/j;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lpx2/j;->a()Llx2/a;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lpx2/j;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lox2/i;->g(Lpx2/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

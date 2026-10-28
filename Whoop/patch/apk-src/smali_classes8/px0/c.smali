.class public abstract Lpx0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001am\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0014\u0008\u0002\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a#\u0010\u001a\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u001a\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001cH\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u001a!\u0010\"\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\r2\u0008\u0008\u0002\u0010!\u001a\u00020\u0015H\u0003\u00a2\u0006\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lpx0/d;",
        "state",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onPush",
        "onPresent",
        "Lkotlin/Function1;",
        "Lj02/v;",
        "onDismiss",
        "onClearLog",
        "onNavigateBack",
        "o",
        "(Lpx0/d;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "",
        "title",
        "x",
        "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V",
        "Lpx0/f;",
        "group",
        "z",
        "(Lpx0/f;Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/ui/Modifier;",
        "Li2/x;",
        "color",
        "Ly3/f;",
        "cornerRadius",
        "G",
        "(Landroidx/compose/ui/Modifier;JF)Landroidx/compose/ui/Modifier;",
        "Lpx0/e;",
        "entry",
        "B",
        "(Lpx0/e;Landroidx/compose/runtime/Composer;I)V",
        "style",
        "modifier",
        "D",
        "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "app_prodStandardRelease"
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
.method private static final A(Lpx0/f;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lpx0/c;->z(Lpx0/f;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lpx0/e;Landroidx/compose/runtime/Composer;I)V
    .locals 37

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, -0x5cdafada

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p2, 0x6

    const/4 v4, 0x4

    const/4 v5, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    or-int v3, p2, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v6, v3, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v6, v5, :cond_2

    move v6, v7

    goto :goto_2

    :cond_2
    move v6, v8

    :goto_2
    and-int/2addr v3, v7

    invoke-virtual {v2, v3, v6}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_a

    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/16 v10, 0x8

    int-to-float v15, v10

    const/high16 v10, 0x3f000000    # 0.5f

    mul-float v13, v15, v10

    const/4 v14, 0x7

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    int-to-float v5, v5

    int-to-float v4, v4

    invoke-static {v9, v5, v4}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v0}, Lpx0/e;->e()Z

    move-result v9

    if-eqz v9, :cond_3

    const v9, 0x6df8752d

    invoke-virtual {v2, v9}, Lp1/q;->e0(I)V

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-static {v9, v2, v10, v8}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v9

    goto :goto_3

    :cond_3
    const v9, 0x6df8790c

    invoke-virtual {v2, v9}, Lp1/q;->e0(I)V

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v9, v2, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->a1()J

    move-result-wide v9

    invoke-virtual {v2, v8}, Lp1/q;->q(Z)V

    :goto_3
    sget-object v11, Li2/w0;->a:Li2/v0;

    invoke-static {v5, v9, v10, v11}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v9, v7

    mul-float/2addr v15, v9

    mul-float/2addr v9, v4

    invoke-static {v5, v15, v9}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v15}, Ll0/m;->i(F)Ll0/k;

    move-result-object v9

    sget-object v10, Lb2/e;->K:Lb2/l;

    const/16 v11, 0x36

    invoke-static {v9, v10, v2, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v10, v2, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v2, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v13, v2, Lp1/q;->S:Z

    if-eqz v13, :cond_4

    invoke-virtual {v2, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_4
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v2, v12, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v2, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v11, v2, Lp1/q;->S:Z

    if-nez v11, :cond_5

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_6

    :cond_5
    invoke-static {v10, v2, v10, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v2, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lpx0/e;->e()Z

    move-result v5

    if-eqz v5, :cond_7

    const-string v5, "\u25b8"

    goto :goto_5

    :cond_7
    const-string v5, " "

    :goto_5
    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v9, v2, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->c()Lb91/a;

    move-result-object v22

    invoke-virtual {v9, v2, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->a()J

    move-result-wide v11

    sget v13, Lb91/a;->d:I

    const/16 v14, 0x12

    shl-int/lit8 v26, v13, 0x12

    const v27, 0x2fffa

    move v13, v3

    const/4 v3, 0x0

    move-object/from16 v16, v6

    move v15, v7

    const-wide/16 v6, 0x0

    move/from16 v17, v8

    const/4 v8, 0x0

    move-object/from16 v18, v9

    const/4 v9, 0x0

    move/from16 v19, v10

    const/4 v10, 0x0

    move-object/from16 v24, v2

    move/from16 v20, v4

    move-object v2, v5

    move-wide v4, v11

    const-wide/16 v11, 0x0

    move/from16 v21, v13

    const/4 v13, 0x0

    move/from16 v23, v14

    const/4 v14, 0x0

    move/from16 v25, v15

    move-object/from16 v28, v16

    const-wide/16 v15, 0x0

    move/from16 v29, v17

    const/16 v17, 0x0

    move-object/from16 v30, v18

    const/16 v18, 0x0

    move/from16 v31, v19

    const/16 v19, 0x0

    move/from16 v32, v20

    const/16 v20, 0x0

    move/from16 v33, v21

    const/16 v21, 0x0

    move/from16 v34, v23

    const/16 v23, 0x0

    move/from16 v35, v25

    const/16 v25, 0x0

    move-object/from16 v36, v28

    move-object/from16 v0, v30

    move/from16 v1, v31

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual/range {p0 .. p0}, Lpx0/e;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->c()Lb91/a;

    move-result-object v22

    invoke-virtual {v0, v2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->b1()J

    move-result-wide v4

    mul-float v6, v32, v32

    move-object/from16 v7, v36

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v25, 0x30

    const v27, 0x2fff8

    move-object v2, v3

    move-object v3, v6

    move-object/from16 v16, v7

    const-wide/16 v6, 0x0

    move-object/from16 v36, v16

    const-wide/16 v15, 0x0

    move-object/from16 v0, v36

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual/range {p0 .. p0}, Lpx0/e;->c()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x12

    int-to-float v4, v4

    mul-float v4, v4, v32

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v4, 0x30

    const/4 v5, 0x0

    invoke-static {v3, v0, v2, v4, v5}, Lpx0/c;->D(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {p0 .. p0}, Lpx0/e;->b()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v3, v30

    invoke-virtual {v3, v2, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->c()Lb91/a;

    move-result-object v22

    invoke-virtual {v3, v2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->d()J

    move-result-wide v6

    const/high16 v13, 0x3f800000    # 1.0f

    float-to-double v8, v13

    const-wide/16 v10, 0x0

    cmpl-double v4, v8, v10

    if-lez v4, :cond_8

    :goto_6
    move-object/from16 v30, v3

    goto :goto_7

    :cond_8
    const-string v4, "invalid weight; must be greater than zero"

    invoke-static {v4}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_6

    :goto_7
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v4, 0x1

    invoke-direct {v3, v13, v4}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/16 v25, 0x0

    const v27, 0x2fff8

    move v15, v4

    move/from16 v29, v5

    move-wide v4, v6

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v35, v15

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-object/from16 v24, v2

    move-object v2, v0

    move-object/from16 v0, v30

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual/range {p0 .. p0}, Lpx0/e;->d()Z

    move-result v3

    if-eqz v3, :cond_9

    const v3, -0x1fd89001

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v2, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->d()Lb91/a;

    move-result-object v22

    invoke-virtual {v0, v2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->C()J

    move-result-wide v4

    const/16 v25, 0x6

    const v27, 0x2fffa

    move-object/from16 v24, v2

    const-string v2, "BOUNDARY"

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

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    const/4 v5, 0x0

    invoke-virtual {v2, v5}, Lp1/q;->q(Z)V

    :goto_8
    const/4 v15, 0x1

    goto :goto_9

    :cond_9
    const/4 v5, 0x0

    const v0, -0x1fd60ce0

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v5}, Lp1/q;->q(Z)V

    goto :goto_8

    :goto_9
    invoke-virtual {v2, v15}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_b

    new-instance v1, Los0/d;

    const/16 v2, 0xb

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Los0/d;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final C(Lpx0/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lpx0/c;->B(Lpx0/e;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 29

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v2, -0x4d6644ce

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p3, 0x6

    const/4 v3, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v4, p4, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v2, v6

    :goto_3
    and-int/lit8 v6, v2, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eq v6, v7, :cond_5

    move v6, v8

    goto :goto_4

    :cond_5
    move v6, v9

    :goto_4
    and-int/lit8 v10, v2, 0x1

    invoke-virtual {v0, v10, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_a

    if-eqz v4, :cond_6

    sget-object v4, Lb2/t;->w:Lb2/t;

    move-object/from16 v27, v4

    move v4, v2

    move-object/from16 v2, v27

    goto :goto_5

    :cond_6
    move v4, v2

    move-object v2, v5

    :goto_5
    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_7

    const v3, -0x101f8c2a

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    invoke-static {v0, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_b

    new-instance v0, Leo2/l;

    const/4 v5, 0x5

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Leo2/l;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;III)V

    :goto_6
    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_7
    const v5, -0x101eb270

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "toUpperCase(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "ROOT"

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    const v5, -0x101d065f

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v0, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->j()J

    move-result-wide v10

    invoke-virtual {v5, v0, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->k()J

    move-result-wide v5

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_8
    const-string v6, "PRESENT"

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    const v5, -0x101a818c

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v0, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->C()J

    move-result-wide v10

    invoke-virtual {v5, v0, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->C()J

    move-result-wide v5

    const v12, 0x3e19999a    # 0.15f

    invoke-static {v12, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v5

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_9
    const v5, -0x1017e405

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v0, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->c1()J

    move-result-wide v10

    invoke-static {v5, v0, v6, v9}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v5

    :goto_7
    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v9, v0, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->d()Lb91/a;

    move-result-object v20

    int-to-float v9, v8

    int-to-float v3, v3

    mul-float/2addr v9, v3

    invoke-static {v9}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    invoke-static {v2, v3}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v12, Li2/w0;->a:Li2/v0;

    invoke-static {v3, v5, v6, v12}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v5, 0x0

    invoke-static {v3, v5, v9, v8}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    new-instance v12, Lw3/k;

    const/4 v5, 0x3

    invoke-direct {v12, v5}, Lw3/k;-><init>(I)V

    and-int/lit8 v23, v4, 0xe

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v24, v4, 0x12

    const v25, 0x2fdf8

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, v3

    move-wide/from16 v27, v10

    move-object v11, v2

    move-wide/from16 v2, v27

    const-wide/16 v9, 0x0

    move-object v13, v11

    const/4 v11, 0x0

    move-object v15, v13

    const-wide/16 v13, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v21, v19

    const/16 v19, 0x0

    move-object/from16 v22, v21

    const/16 v21, 0x0

    move-object/from16 v26, v22

    move-object/from16 v22, v0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v26

    goto :goto_8

    :cond_a
    move-object/from16 v22, v0

    invoke-virtual/range {v22 .. v22}, Lp1/q;->X()V

    move-object v2, v5

    :goto_8
    invoke-virtual/range {v22 .. v22}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_b

    new-instance v0, Leo2/l;

    const/4 v5, 0x6

    move-object/from16 v1, p0

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Leo2/l;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;III)V

    goto/16 :goto_6

    :cond_b
    return-void
.end method

.method private static final E(Ljava/lang/String;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lpx0/c;->D(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Ljava/lang/String;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lpx0/c;->D(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Landroidx/compose/ui/Modifier;JF)Landroidx/compose/ui/Modifier;
    .locals 2

    new-instance v0, Ll1/m1;

    const/4 v1, 0x1

    invoke-direct {v0, p1, p2, p3, v1}, Ll1/m1;-><init>(JFI)V

    invoke-static {p0, v0}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final H(JFLk2/e;)Ll83/a0;
    .locals 16

    move-object/from16 v0, p3

    const-string v1, "$this$drawBehind"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move/from16 v1, p2

    invoke-interface {v0, v1}, Ly3/c;->q0(F)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v4, v1

    const/16 v1, 0x20

    shl-long v1, v2, v1

    const-wide v6, 0xffffffffL

    and-long v3, v4, v6

    or-long v7, v1, v3

    new-instance v9, Lk2/i;

    const/4 v1, 0x1

    int-to-float v2, v1

    invoke-interface {v0, v2}, Ly3/c;->q0(F)F

    move-result v10

    const/4 v2, 0x6

    int-to-float v2, v2

    invoke-interface {v0, v2}, Ly3/c;->q0(F)F

    move-result v2

    const/4 v3, 0x4

    int-to-float v3, v3

    invoke-interface {v0, v3}, Ly3/c;->q0(F)F

    move-result v3

    const/4 v4, 0x2

    new-array v4, v4, [F

    const/4 v5, 0x0

    aput v2, v4, v5

    aput v3, v4, v1

    new-instance v14, Li2/k;

    new-instance v1, Landroid/graphics/DashPathEffect;

    const/4 v2, 0x0

    invoke-direct {v1, v4, v2}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v14, v1}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    const/16 v15, 0xe

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lk2/i;-><init>(FFIILi2/t0;I)V

    const/4 v10, 0x0

    const/16 v11, 0xe6

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    move-wide/from16 v1, p0

    invoke-static/range {v0 .. v11}, Lk2/e;->D(Lk2/e;JJJJLk2/f;FI)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static synthetic a(Lj02/v;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpx0/c;->r(Lj02/v;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lpx0/d;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lpx0/c;->w(Lpx0/d;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    move-object v0, p1

    move-object p1, p0

    move-object p0, v0

    invoke-static/range {p0 .. p5}, Lpx0/c;->E(Ljava/lang/String;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Ll83/a0;
    .locals 1

    invoke-static {}, Lpx0/c;->p()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpx0/c;->v(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f()Ll83/a0;
    .locals 1

    invoke-static {}, Lpx0/c;->s()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g()Ll83/a0;
    .locals 1

    invoke-static {}, Lpx0/c;->q()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h(JFLk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpx0/c;->H(JFLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i()Ll83/a0;
    .locals 1

    invoke-static {}, Lpx0/c;->t()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic j(Lpx0/f;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpx0/c;->A(Lpx0/f;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpx0/c;->y(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lpx0/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpx0/c;->C(Lpx0/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Lj02/v;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lpx0/c;->u(Lkotlin/jvm/functions/Function1;Lj02/v;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Landroidx/compose/ui/Modifier;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    move-object v0, p1

    move-object p1, p0

    move-object p0, v0

    invoke-static/range {p0 .. p5}, Lpx0/c;->F(Ljava/lang/String;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final o(Lpx0/d;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 47
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpx0/d;",
            "Lc93/a;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v7, p7

    sget-object v0, Lb2/e;->J:Lb2/l;

    const-string v2, "state"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p6

    check-cast v14, Lp1/q;

    const v2, 0x2f89cb5b

    invoke-virtual {v14, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v7, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v7

    goto :goto_1

    :cond_1
    move v2, v7

    :goto_1
    and-int/lit8 v4, p8, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v7, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v2, v6

    :goto_3
    and-int/lit8 v6, p8, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v2, v2, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v7, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v14, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v2, v9

    :goto_5
    and-int/lit8 v9, p8, 0x8

    if-eqz v9, :cond_9

    or-int/lit16 v2, v2, 0xc00

    :cond_8
    move-object/from16 v11, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v11, v7, 0xc00

    if-nez v11, :cond_8

    move-object/from16 v11, p3

    invoke-virtual {v14, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_6

    :cond_a
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v2, v12

    :goto_7
    and-int/lit8 v12, p8, 0x10

    if-eqz v12, :cond_c

    or-int/lit16 v2, v2, 0x6000

    :cond_b
    move-object/from16 v15, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v15, v7, 0x6000

    if-nez v15, :cond_b

    move-object/from16 v15, p4

    invoke-virtual {v14, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_8

    :cond_d
    const/16 v16, 0x2000

    :goto_8
    or-int v2, v2, v16

    :goto_9
    and-int/lit8 v16, p8, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_e

    or-int v2, v2, v17

    move-object/from16 v10, p5

    goto :goto_b

    :cond_e
    and-int v17, v7, v17

    move-object/from16 v10, p5

    if-nez v17, :cond_10

    invoke-virtual {v14, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_f

    const/high16 v17, 0x20000

    goto :goto_a

    :cond_f
    const/high16 v17, 0x10000

    :goto_a
    or-int v2, v2, v17

    :cond_10
    :goto_b
    const v17, 0x12493

    and-int v13, v2, v17

    const v3, 0x12492

    if-eq v13, v3, :cond_11

    const/4 v3, 0x1

    goto :goto_c

    :cond_11
    const/4 v3, 0x0

    :goto_c
    and-int/lit8 v13, v2, 0x1

    invoke-virtual {v14, v13, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_36

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_13

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_12

    new-instance v4, Lpc3/r;

    const/16 v5, 0x12

    invoke-direct {v4, v5}, Lpc3/r;-><init>(I)V

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v4, Lc93/a;

    goto :goto_d

    :cond_13
    move-object v4, v5

    :goto_d
    if-eqz v6, :cond_15

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_14

    new-instance v5, Lpc3/r;

    const/16 v6, 0x13

    invoke-direct {v5, v6}, Lpc3/r;-><init>(I)V

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v5, Lc93/a;

    goto :goto_e

    :cond_15
    move-object/from16 v5, p2

    :goto_e
    if-eqz v9, :cond_17

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_16

    new-instance v6, Lpt2/k;

    const/16 v9, 0xd

    invoke-direct {v6, v9}, Lpt2/k;-><init>(I)V

    invoke-virtual {v14, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v6, Lkotlin/jvm/functions/Function1;

    goto :goto_f

    :cond_17
    move-object v6, v11

    :goto_f
    if-eqz v12, :cond_19

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v3, :cond_18

    new-instance v9, Lpc3/r;

    const/16 v11, 0x14

    invoke-direct {v9, v11}, Lpc3/r;-><init>(I)V

    invoke-virtual {v14, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v9, Lc93/a;

    goto :goto_10

    :cond_19
    move-object v9, v15

    :goto_10
    if-eqz v16, :cond_1b

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v3, :cond_1a

    new-instance v11, Lpc3/r;

    const/16 v12, 0x15

    invoke-direct {v11, v12}, Lpc3/r;-><init>(I)V

    invoke-virtual {v14, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v11, Lc93/a;

    goto :goto_11

    :cond_1b
    move-object/from16 v11, p5

    :goto_11
    const/high16 v12, 0x3f800000    # 1.0f

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v13}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v12, Lx81/d;->a:Lx81/d;

    move-object/from16 v19, v13

    sget v13, Lx81/d;->b:I

    invoke-virtual {v12, v14, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    move-object/from16 p2, v9

    invoke-virtual/range {v16 .. v16}, Ly81/i;->o()J

    move-result-wide v8

    sget-object v10, Li2/w0;->a:Li2/v0;

    invoke-static {v15, v8, v9, v10}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-static {v9, v14, v10}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v15

    const/16 v9, 0xe

    invoke-static {v8, v15, v9}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v21

    const/4 v8, 0x3

    int-to-float v15, v8

    move/from16 p3, v8

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float v24, v15, v8

    const/16 v26, 0x7

    const/16 v22, 0x0

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    invoke-static/range {v21 .. v26}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v15

    move/from16 v16, v8

    move/from16 v34, v25

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    const/4 v9, 0x0

    invoke-static {v8, v10, v14, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    move-object/from16 p5, v10

    iget-wide v9, v14, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v14, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v22, La3/l;->a:La3/k;

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v22, v8

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    move-object/from16 v35, v4

    iget-boolean v4, v14, Lp1/q;->S:Z

    if-eqz v4, :cond_1c

    invoke-virtual {v14, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_1c
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_12
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v14, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v14, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    move-object/from16 v36, v5

    iget-boolean v5, v14, Lp1/q;->S:Z

    if-nez v5, :cond_1d

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1e

    :cond_1d
    invoke-static {v9, v14, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1e
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v14, v5, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, Lcom/whoop/design/atomic/organism/toolbar/d;->a:Lcom/whoop/design/atomic/organism/toolbar/d$b;

    const-string v9, "Dismissal Playground"

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v7, v9}, Lcom/whoop/design/atomic/organism/toolbar/d$b;->a(Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/atomic/organism/toolbar/d$a;

    move-result-object v9

    sget v7, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v7, v7, 0x3

    shr-int/lit8 v15, v2, 0x6

    and-int/lit16 v15, v15, 0x1c00

    or-int/2addr v15, v7

    move/from16 v7, v16

    const/16 v16, 0x35

    move-object/from16 v23, v8

    const/4 v8, 0x0

    move-object/from16 v24, v10

    const/4 v10, 0x0

    move-object/from16 v25, v12

    const/4 v12, 0x0

    move/from16 v26, v13

    const/4 v13, 0x0

    move-object/from16 v37, p2

    move/from16 v45, v2

    move-object/from16 p6, v3

    move-object/from16 p1, v6

    move/from16 v40, v7

    move-object/from16 v7, v19

    move-object/from16 v6, v22

    move-object/from16 v41, v23

    move-object/from16 v42, v24

    move-object/from16 v38, v25

    move/from16 v39, v26

    const/16 v43, 0xe

    move/from16 v2, p3

    move-object/from16 v3, p5

    invoke-static/range {v8 .. v16}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v46, v11

    const/4 v8, 0x2

    int-to-float v9, v8

    mul-float v9, v9, v40

    const/4 v10, 0x0

    invoke-static {v7, v9, v10, v8}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v9, 0x0

    invoke-static {v6, v3, v14, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v9, v14, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v14, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v10, v14, Lp1/q;->S:Z

    if-eqz v10, :cond_1f

    move-object/from16 v10, v41

    invoke-virtual {v14, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_1f
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_13
    invoke-static {v14, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v14, Lp1/q;->S:Z

    if-nez v1, :cond_20

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    :cond_20
    move-object/from16 v1, v42

    invoke-static {v6, v14, v6, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_21
    invoke-static {v14, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lpx0/d;->b()Ljava/lang/String;

    move-result-object v8

    move-object/from16 v3, v38

    move/from16 v4, v39

    invoke-virtual {v3, v14, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->q()Lb91/a;

    move-result-object v28

    invoke-virtual {v3, v14, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->d()J

    move-result-wide v10

    new-instance v3, Lw3/k;

    invoke-direct {v3, v2}, Lw3/k;-><init>(I)V

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v32, v2, 0x12

    const v33, 0x2fdf8

    const-wide/16 v12, 0x0

    move-object/from16 v30, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x30

    move-object/from16 v20, v3

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v30

    const-string v2, "Back stack"

    const/4 v3, 0x6

    invoke-static {v2, v14, v3}, Lpx0/c;->x(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const v2, 0x65aaee0d

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lpx0/d;->c()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lm83/s;->q0(Ljava/util/List;)Lm83/j0;

    move-result-object v2

    invoke-virtual {v2}, Lm83/j0;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_14
    move-object v4, v2

    check-cast v4, Lm83/h0;

    iget-object v4, v4, Lm83/h0;->x:Ljava/lang/Object;

    check-cast v4, Ljava/util/ListIterator;

    invoke-interface {v4}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v5

    if-eqz v5, :cond_22

    invoke-interface {v4}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpx0/f;

    const/4 v9, 0x0

    invoke-static {v4, v14, v9}, Lpx0/c;->z(Lpx0/f;Landroidx/compose/runtime/Composer;I)V

    goto :goto_14

    :cond_22
    const/4 v9, 0x0

    invoke-virtual {v14, v9}, Lp1/q;->q(Z)V

    const-string v2, "NAVIGATE"

    invoke-static {v2, v14, v3}, Lpx0/c;->x(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v2, 0x1

    int-to-float v4, v2

    mul-float v26, v4, v40

    invoke-static/range {v26 .. v26}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    invoke-static {v4, v0, v14, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v5, v14, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v14, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v10, v14, Lp1/q;->S:Z

    if-eqz v10, :cond_23

    invoke-virtual {v14, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_23
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_15
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v14, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v14, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v14, Lp1/q;->S:Z

    if-nez v6, :cond_24

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_25

    :cond_24
    invoke-static {v5, v14, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_25
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v14, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v4, v1

    const-wide/16 v23, 0x0

    cmpl-double v4, v4, v23

    const-string v5, "invalid weight; must be greater than zero"

    if-lez v4, :cond_26

    goto :goto_16

    :cond_26
    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_16
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v4, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v6, v1, v4

    if-lez v6, :cond_27

    move v12, v4

    goto :goto_17

    :cond_27
    move v12, v1

    :goto_17
    invoke-direct {v8, v12, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const-string v6, "Push"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v20, v6, 0x6

    shr-int/lit8 v9, v45, 0x3

    and-int/lit8 v21, v9, 0xe

    const/16 v22, 0x3fa

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v30, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v19, v30

    move-object/from16 v18, v35

    invoke-static/range {v8 .. v22}, Lny0/o0;->b(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    float-to-double v8, v1

    cmpl-double v8, v8, v23

    if-lez v8, :cond_28

    goto :goto_18

    :cond_28
    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_18
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v5, v1, v4

    if-lez v5, :cond_29

    move v12, v4

    goto :goto_19

    :cond_29
    move v12, v1

    :goto_19
    invoke-direct {v8, v12, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const-string v4, "Present"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    shl-int/lit8 v23, v6, 0x12

    shl-int/lit8 v4, v45, 0x3

    and-int/lit16 v4, v4, 0x1c00

    const/16 v25, 0x1fbe

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move/from16 v24, v4

    move-object/from16 v22, v30

    move-object/from16 v21, v36

    invoke-static/range {v8 .. v25}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v22

    invoke-virtual {v14, v2}, Lp1/q;->q(Z)V

    const-string v4, "DISMISS WITH"

    invoke-static {v4, v14, v3}, Lpx0/c;->x(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const v4, 0x65ab4072

    invoke-virtual {v14, v4}, Lp1/q;->e0(I)V

    invoke-static {}, Lj02/v;->getEntries()Lt83/a;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lj02/v;

    invoke-static {v1, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v11, 0x0

    const/4 v13, 0x7

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v12, v26

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move/from16 v23, v12

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    move/from16 v6, v45

    and-int/lit16 v9, v6, 0x1c00

    const/16 v11, 0x800

    if-ne v9, v11, :cond_2a

    move v9, v2

    goto :goto_1b

    :cond_2a
    const/4 v9, 0x0

    :goto_1b
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    invoke-virtual {v14, v12}, Lp1/q;->e(I)Z

    move-result v12

    or-int/2addr v9, v12

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v9, :cond_2c

    move-object/from16 v9, p6

    if-ne v12, v9, :cond_2b

    goto :goto_1c

    :cond_2b
    move-object/from16 v15, p1

    goto :goto_1d

    :cond_2c
    move-object/from16 v9, p6

    :goto_1c
    new-instance v12, Lox0/b;

    const/16 v13, 0x18

    move-object/from16 v15, p1

    invoke-direct {v12, v13, v15, v5}, Lox0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v14, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1d
    move-object/from16 v18, v12

    check-cast v18, Lc93/a;

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/2addr v5, v3

    or-int/lit8 v20, v5, 0x6

    const/16 v21, 0x0

    const/16 v22, 0x3fa

    move-object v5, v9

    const/4 v9, 0x0

    move/from16 v44, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v30, v14

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v19, v17

    const/16 v17, 0x0

    move-object v2, v5

    move-object/from16 v5, v19

    move-object/from16 v19, v30

    invoke-static/range {v8 .. v22}, Lny0/o0;->b(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 p6, v2

    move-object/from16 p1, v5

    move/from16 v45, v6

    move-object/from16 v14, v19

    move/from16 v26, v23

    const/4 v2, 0x1

    goto/16 :goto_1a

    :cond_2d
    move-object/from16 v5, p1

    move-object/from16 v2, p6

    move/from16 v23, v26

    move/from16 v6, v45

    const/4 v9, 0x0

    invoke-virtual {v14, v9}, Lp1/q;->q(Z)V

    invoke-static {v1, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v22

    const/16 v25, 0x0

    const/16 v27, 0x5

    const/16 v23, 0x0

    move/from16 v24, v34

    invoke-static/range {v22 .. v27}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move/from16 v4, v26

    sget-object v8, Ll0/m;->g:Ll0/h;

    invoke-static {v8, v0, v14, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v8, v14, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v14, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v10, v14, Lp1/q;->S:Z

    if-eqz v10, :cond_2e

    invoke-virtual {v14, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1e

    :cond_2e
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_1e
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v14, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v14, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v8, v14, Lp1/q;->S:Z

    if-nez v8, :cond_2f

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_30

    :cond_2f
    invoke-static {v3, v14, v3, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_30
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v14, v0, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v14, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->t()Lb91/a;

    move-result-object v28

    invoke-virtual {v0, v14, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->b1()J

    move-result-wide v10

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v32, v3, 0x12

    const v33, 0x2fffa

    const-string v8, "LOG"

    const/4 v9, 0x0

    const-wide/16 v12, 0x0

    move-object/from16 v30, v14

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

    const/16 v31, 0x6

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v30

    invoke-virtual {v0, v14, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->c()Lb91/a;

    move-result-object v28

    invoke-virtual {v0, v14, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->b1()J

    move-result-wide v10

    const v3, 0xe000

    and-int/2addr v3, v6

    const/16 v6, 0x4000

    if-ne v3, v6, :cond_31

    const/4 v8, 0x1

    goto :goto_1f

    :cond_31
    const/4 v8, 0x0

    :goto_1f
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v8, :cond_33

    if-ne v3, v2, :cond_32

    goto :goto_20

    :cond_32
    move-object/from16 v6, v37

    goto :goto_21

    :cond_33
    :goto_20
    new-instance v3, Lot1/e;

    const/16 v2, 0x10

    move-object/from16 v6, v37

    invoke-direct {v3, v6, v2}, Lot1/e;-><init>(Lc93/a;I)V

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_21
    move-object/from16 v23, v3

    check-cast v23, Lc93/a;

    const/16 v24, 0xf

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v19, v7

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/16 v31, 0x6

    const v33, 0x2fff8

    const-string v8, "clear"

    const-wide/16 v12, 0x0

    move-object/from16 v30, v14

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

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v30

    const/4 v10, 0x1

    invoke-virtual {v14, v10}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lpx0/d;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_34

    const v2, 0x4fcd4763    # 6.8880154E9f

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v14, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->c()Lb91/a;

    move-result-object v28

    invoke-virtual {v0, v14, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b1()J

    move-result-wide v10

    const/16 v31, 0x6

    const v33, 0x2fffa

    const-string v8, "no dismissals yet"

    const/4 v9, 0x0

    const-wide/16 v12, 0x0

    move-object/from16 v30, v14

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

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v30

    const/4 v9, 0x0

    invoke-virtual {v14, v9}, Lp1/q;->q(Z)V

    :goto_22
    const/4 v10, 0x1

    goto :goto_24

    :cond_34
    const v0, 0x4fd073ed    # 6.9945165E9f

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lpx0/d;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_23
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_35

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Ljava/lang/String;

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v14, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->c()Lb91/a;

    move-result-object v28

    invoke-virtual {v1, v14, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v10

    const/16 v22, 0x0

    const/16 v24, 0x7

    const/16 v20, 0x0

    const/16 v21, 0x0

    move/from16 v23, v4

    move-object/from16 v19, v7

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v32, v1, 0x12

    const v33, 0x2fff8

    const-wide/16 v12, 0x0

    move-object/from16 v30, v14

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

    const/16 v31, 0x30

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v30

    goto :goto_23

    :cond_35
    const/4 v9, 0x0

    invoke-virtual {v14, v9}, Lp1/q;->q(Z)V

    goto :goto_22

    :goto_24
    invoke-virtual {v14, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v14, v10}, Lp1/q;->q(Z)V

    move-object v4, v5

    move-object v5, v6

    move-object/from16 v2, v35

    move-object/from16 v3, v36

    move-object/from16 v6, v46

    goto :goto_25

    :cond_36
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object/from16 v3, p2

    move-object/from16 v6, p5

    move-object v2, v5

    move-object v4, v11

    move-object v5, v15

    :goto_25
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_37

    new-instance v0, Lp72/a;

    move-object/from16 v1, p0

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lp72/a;-><init>(Lpx0/d;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_37
    return-void
.end method

.method private static final p()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final q()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final r(Lj02/v;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final t()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final u(Lkotlin/jvm/functions/Function1;Lj02/v;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lpx0/d;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lpx0/c;->o(Lpx0/d;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lp1/q;

    const v2, 0x64c0047e

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

    move v3, v5

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    and-int/lit8 v4, v2, 0x1

    invoke-virtual {v1, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v1, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->t()Lb91/a;

    move-result-object v20

    invoke-virtual {v3, v1, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->b1()J

    move-result-wide v3

    const/4 v6, 0x3

    int-to-float v6, v6

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float v10, v6, v7

    int-to-float v5, v5

    mul-float v12, v5, v7

    const/4 v13, 0x5

    sget-object v8, Lb2/t;->w:Lb2/t;

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    and-int/lit8 v2, v2, 0xe

    or-int/lit8 v23, v2, 0x30

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v24, v2, 0x12

    const v25, 0x2fff8

    move-object/from16 v22, v1

    move-wide v2, v3

    move-object v1, v5

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

    const/16 v3, 0x13

    move/from16 v4, p2

    invoke-direct {v2, v0, v4, v3}, Lcp0/a;-><init>(Ljava/lang/String;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method private static final y(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lpx0/c;->x(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lpx0/f;Landroidx/compose/runtime/Composer;I)V
    .locals 47

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, -0x2b82ffe2

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p2, 0x6

    const/4 v5, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    or-int v3, p2, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v6, v3, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v6, v5, :cond_2

    move v6, v7

    goto :goto_2

    :cond_2
    move v6, v8

    :goto_2
    and-int/2addr v3, v7

    invoke-virtual {v2, v3, v6}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-virtual {v0}, Lpx0/f;->c()Z

    move-result v3

    if-eqz v3, :cond_3

    const v3, 0x7e721c59

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v3, v2, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->C()J

    move-result-wide v9

    invoke-virtual {v2, v8}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_3
    const v3, 0x7e72d9fb

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-static {v3, v2, v6, v8}, Lih0/d0;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v9

    :goto_3
    int-to-float v3, v7

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float v15, v3, v6

    const/16 v16, 0x7

    sget-object v11, Lb2/t;->w:Lb2/t;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v12, Ll0/m;->c:Ll0/g;

    sget-object v13, Lb2/e;->M:Lb2/k;

    invoke-static {v12, v13, v2, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v14

    iget-wide v4, v2, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v2, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v16, v6

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v7, v2, Lp1/q;->S:Z

    if-eqz v7, :cond_4

    invoke-virtual {v2, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_4
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v2, v7, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v2, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v2, Lp1/q;->S:Z

    if-nez v8, :cond_5

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v20, v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v8, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_5

    :cond_5
    move-object/from16 v20, v6

    :goto_5
    invoke-static {v4, v2, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v2, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lpx0/f;->a()Ljava/lang/String;

    move-result-object v3

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v6, v2, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->d()Lb91/a;

    move-result-object v22

    const/high16 v6, 0x3f000000    # 0.5f

    mul-float v6, v6, v16

    const/16 v16, 0x6

    move-object v8, v13

    const/4 v13, 0x0

    move-object/from16 v21, v14

    const/4 v14, 0x0

    move/from16 v28, v15

    move v15, v6

    move-object v6, v12

    move/from16 v12, v28

    move-object/from16 v28, v21

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v13

    move v15, v12

    sget v12, Lb91/a;->d:I

    shl-int/lit8 v26, v12, 0x12

    const v27, 0x2fff8

    move-object v12, v6

    move-object v14, v7

    const-wide/16 v6, 0x0

    move-object/from16 v16, v8

    const/4 v8, 0x0

    move-object/from16 v21, v4

    move-wide/from16 v45, v9

    move-object v10, v5

    move-wide/from16 v4, v45

    const/4 v9, 0x0

    move-object/from16 v23, v10

    const/4 v10, 0x0

    move-object/from16 v25, v11

    move-object/from16 v24, v12

    const-wide/16 v11, 0x0

    move-object/from16 v29, v24

    move-object/from16 v24, v2

    move-object v2, v3

    move-object v3, v13

    const/4 v13, 0x0

    move-object/from16 v30, v14

    const/4 v14, 0x0

    move/from16 v31, v15

    move-object/from16 v32, v16

    const-wide/16 v15, 0x0

    const/16 v33, 0x2

    const/16 v17, 0x0

    const/16 v34, 0x1

    const/16 v18, 0x0

    const/16 v35, 0x0

    const/16 v19, 0x0

    move-object/from16 v36, v20

    const/16 v20, 0x0

    move-object/from16 v37, v21

    const/16 v21, 0x0

    move-object/from16 v38, v23

    const/16 v23, 0x0

    move-object/from16 v39, v25

    const/16 v25, 0x30

    move-object/from16 v42, v30

    move/from16 v0, v31

    move-object/from16 v40, v32

    move-object/from16 v41, v36

    move-object/from16 v44, v37

    move-object/from16 v43, v38

    move-object/from16 v1, v39

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v3, 0x2

    int-to-float v3, v3

    const/4 v6, 0x4

    int-to-float v6, v6

    mul-float/2addr v3, v6

    invoke-static {v1, v4, v5, v3}, Lpx0/c;->G(Landroidx/compose/ui/Modifier;JF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v6, v29

    move-object/from16 v8, v40

    const/4 v1, 0x0

    invoke-static {v6, v8, v2, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v2, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v2, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v6, v2, Lp1/q;->S:Z

    if-eqz v6, :cond_7

    move-object/from16 v6, v41

    invoke-virtual {v2, v6}, Lp1/q;->l(Lc93/a;)V

    :goto_6
    move-object/from16 v14, v42

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Lp1/q;->s0()V

    goto :goto_6

    :goto_7
    invoke-static {v2, v14, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v28

    invoke-static {v2, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v2, Lp1/q;->S:Z

    if-nez v3, :cond_8

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    :cond_8
    move-object/from16 v10, v43

    goto :goto_9

    :cond_9
    :goto_8
    move-object/from16 v3, v44

    goto :goto_a

    :goto_9
    invoke-static {v4, v2, v4, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_8

    :goto_a
    invoke-static {v2, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x2ca3fe76

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lpx0/f;->b()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->q0(Ljava/util/List;)Lm83/j0;

    move-result-object v0

    invoke-virtual {v0}, Lm83/j0;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_b
    move-object v3, v0

    check-cast v3, Lm83/h0;

    iget-object v3, v3, Lm83/h0;->x:Ljava/lang/Object;

    check-cast v3, Ljava/util/ListIterator;

    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpx0/e;

    invoke-static {v3, v2, v1}, Lpx0/c;->B(Lpx0/e;Landroidx/compose/runtime/Composer;I)V

    goto :goto_b

    :cond_a
    const/4 v3, 0x1

    invoke-static {v2, v1, v3, v3}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_c

    :cond_b
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_c
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_c

    new-instance v1, Los0/d;

    const/16 v2, 0xc

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Los0/d;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

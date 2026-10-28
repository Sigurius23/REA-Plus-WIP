.class public abstract Lyc2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyc2/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u001a=\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a=\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\n2\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\rH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001aE\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006H\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lxc2/d;",
        "viewState",
        "Lkotlin/Function1;",
        "Lxc2/b;",
        "Ll83/a0;",
        "onViewEvent",
        "Lkotlin/Function0;",
        "dismiss",
        "G",
        "(Lxc2/d;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "Lxc2/d$b;",
        "z",
        "(Lxc2/d$b;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "Lxc2/d$d;",
        "O",
        "(Lxc2/d$d;Landroidx/compose/runtime/Composer;I)V",
        "Lxc2/a;",
        "error",
        "",
        "plan",
        "t",
        "(Lxc2/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "settings_release"
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
.method private static final A(Lxc2/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final C(Lxc2/d$b;Lkotlin/jvm/functions/Function1;Lc93/a;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 37

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-string v4, "$this$BoxWithConstraints"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v4, p5, 0x6

    if-nez v4, :cond_1

    move-object/from16 v4, p4

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int v4, p5, v4

    goto :goto_1

    :cond_1
    move/from16 v4, p5

    :goto_1
    and-int/lit8 v6, v4, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v6, v7, :cond_2

    move v6, v9

    goto :goto_2

    :cond_2
    move v6, v8

    :goto_2
    and-int/2addr v4, v9

    move-object/from16 v13, p4

    check-cast v13, Lp1/q;

    invoke-virtual {v13, v4, v6}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_e

    sget-object v4, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v13, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly3/c;

    check-cast v3, Landroidx/compose/foundation/layout/c;

    invoke-virtual {v3}, Landroidx/compose/foundation/layout/c;->d()F

    move-result v3

    invoke-interface {v4, v3}, Ly3/c;->q0(F)F

    move-result v3

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v10, v3}, Lgb1/b0;->a1(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v10, Lb2/e;->w:Lb2/m;

    invoke-static {v10, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v10

    iget-wide v11, v13, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v13, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v15, v13, Lp1/q;->S:Z

    if-eqz v15, :cond_3

    invoke-virtual {v13, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_3
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v13, v15, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v13, v10, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    move/from16 p5, v7

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-nez v7, :cond_4

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v7, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    :cond_4
    invoke-static {v11, v13, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v13, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object v7, v10

    new-instance v10, Lkd1/o$a;

    sget v11, Lea2/p;->b:I

    invoke-direct {v10, v11}, Lkd1/o$a;-><init>(I)V

    move-object v11, v14

    sget v14, Lkd1/o$a;->c:I

    move-object/from16 v16, v15

    const/4 v15, 0x3

    move-object/from16 v17, v11

    const/4 v11, 0x0

    move-object/from16 v18, v12

    const/4 v12, 0x0

    move-object v4, v7

    move-object/from16 v9, v16

    move-object/from16 v7, v17

    move-object/from16 v36, v18

    invoke-static/range {v10 .. v15}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v10

    sget v11, Lea2/s;->O:I

    invoke-static {v11, v13, v8}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    const/16 v18, 0x6180

    const/16 v19, 0x68

    move-object/from16 v32, v13

    const/4 v13, 0x0

    sget-object v14, Ly2/j;->g:Ly2/b1;

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v12, v3

    move-object/from16 v17, v32

    invoke-static/range {v10 .. v19}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, v17

    sget-object v3, Ll0/m;->e:Ll0/h;

    sget-object v8, Lb2/e;->N:Lb2/k;

    const/16 v10, 0x36

    invoke-static {v3, v8, v13, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v10, v13, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v13, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_6

    invoke-virtual {v13, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v13, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v13, Lp1/q;->S:Z

    if-nez v3, :cond_7

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    :cond_7
    move-object/from16 v3, v36

    invoke-static {v8, v13, v8, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v13, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x3f800000    # 1.0f

    float-to-double v4, v3

    const-wide/16 v7, 0x0

    cmpl-double v4, v4, v7

    if-lez v4, :cond_9

    goto :goto_5

    :cond_9
    const-string v4, "invalid weight; must be greater than zero"

    invoke-static {v4}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v5, 0x1

    invoke-direct {v4, v3, v5}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v13, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v0}, Lxc2/d$b;->e()Ljava/lang/String;

    move-result-object v10

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v13, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v7

    invoke-virtual {v3, v13, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->p()Lb91/a;

    move-result-object v30

    const-wide/high16 v11, 0x3ff4000000000000L    # 1.25

    double-to-float v5, v11

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v5, v9

    const/4 v11, 0x0

    const/4 v12, 0x2

    invoke-static {v6, v5, v11, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    new-instance v5, Lw3/k;

    const/4 v12, 0x3

    invoke-direct {v5, v12}, Lw3/k;-><init>(I)V

    sget v14, Lb91/a;->d:I

    shl-int/lit8 v34, v14, 0x12

    const v35, 0x2fdf8

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x30

    move-object/from16 v22, v5

    move v5, v12

    move-object/from16 v32, v13

    move-wide v12, v7

    invoke-static/range {v10 .. v35}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v32

    invoke-virtual {v0}, Lxc2/d$b;->d()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v13, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->J()J

    move-result-wide v7

    invoke-virtual {v3, v13, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->a()Lb91/a;

    move-result-object v30

    const/4 v12, 0x2

    int-to-float v11, v12

    mul-float/2addr v11, v9

    const/4 v12, 0x1

    int-to-float v14, v12

    mul-float/2addr v14, v9

    int-to-float v12, v5

    mul-float/2addr v12, v9

    invoke-static {v6, v11, v14, v11, v12}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v12

    new-instance v14, Lw3/k;

    invoke-direct {v14, v5}, Lw3/k;-><init>(I)V

    const/16 v33, 0x0

    move-object/from16 v22, v14

    const-wide/16 v14, 0x0

    move v5, v11

    move-object v11, v12

    move-wide v12, v7

    invoke-static/range {v10 .. v35}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v32

    invoke-virtual {v0}, Lxc2/d$b;->a()Ljava/lang/String;

    move-result-object v12

    sget-object v11, Lny0/v;->TextMedium:Lny0/v;

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-nez v7, :cond_a

    if-ne v8, v10, :cond_b

    :cond_a
    new-instance v8, Lwr0/r;

    const/16 v7, 0x14

    invoke-direct {v8, v1, v0, v7}, Lwr0/r;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v13, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object/from16 v18, v8

    check-cast v18, Lc93/a;

    const/16 v20, 0x30

    const/16 v21, 0x79

    move-object v1, v10

    const/4 v10, 0x0

    move-object/from16 v32, v13

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v19, v32

    invoke-static/range {v10 .. v21}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, v19

    invoke-virtual {v0}, Lxc2/d$b;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v7}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v10

    const-string v0, "toUpperCase(...)"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v13, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v7

    invoke-virtual {v3, v13, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->i()Lb91/a;

    move-result-object v30

    const-wide/high16 v3, 0x400c000000000000L    # 3.5

    double-to-float v0, v3

    mul-float v18, v0, v9

    const/16 v19, 0x5

    const/4 v15, 0x0

    const/16 v17, 0x0

    move/from16 v16, v5

    move-object v14, v6

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v13, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_c

    if-ne v4, v1, :cond_d

    :cond_c
    new-instance v4, Ly71/e;

    const/4 v1, 0x6

    invoke-direct {v4, v2, v1}, Ly71/e;-><init>(Lc93/a;I)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v4, Lc93/a;

    const/16 v1, 0xf

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object/from16 p0, v0

    move/from16 p5, v1

    move/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p4, v4

    move-object/from16 p3, v5

    invoke-static/range {p0 .. p5}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/high16 v33, 0x6000000

    const v35, 0x2fef8

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    sget-object v21, Lw3/l;->c:Lw3/l;

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    move-object/from16 v32, v13

    move-wide v12, v7

    invoke-static/range {v10 .. v35}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v32

    const/4 v12, 0x1

    invoke-virtual {v13, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v12}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_e
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final D(Lkotlin/jvm/functions/Function1;Lxc2/d$b;)Ll83/a0;
    .locals 1

    new-instance v0, Lxc2/b$b;

    invoke-virtual {p1}, Lxc2/d$b;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lxc2/b$b;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lxc2/d$b;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lyc2/c;->z(Lxc2/d$b;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final G(Lxc2/d;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxc2/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lp1/q;

    const v0, -0x7d7e89fd

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p4, 0x8

    if-nez v0, :cond_0

    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p3, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, p4

    goto :goto_2

    :cond_2
    move v0, p4

    :goto_2
    and-int/lit8 v1, p5, 0x2

    if-eqz v1, :cond_3

    or-int/lit8 v0, v0, 0x30

    goto :goto_4

    :cond_3
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_5

    invoke-virtual {p3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_3

    :cond_4
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v0, v2

    :cond_5
    :goto_4
    and-int/lit8 v2, p5, 0x4

    if-eqz v2, :cond_6

    or-int/lit16 v0, v0, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v3, p4, 0x180

    if-nez v3, :cond_8

    invoke-virtual {p3, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    const/16 v3, 0x100

    goto :goto_5

    :cond_7
    const/16 v3, 0x80

    :goto_5
    or-int/2addr v0, v3

    :cond_8
    :goto_6
    and-int/lit16 v3, v0, 0x93

    const/16 v5, 0x92

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v3, v5, :cond_9

    move v3, v7

    goto :goto_7

    :cond_9
    move v3, v6

    :goto_7
    and-int/2addr v0, v7

    invoke-virtual {p3, v0, v3}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v1, :cond_b

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    new-instance p1, Lyb1/a;

    const/4 v1, 0x5

    invoke-direct {p1, v1}, Lyb1/a;-><init>(I)V

    invoke-virtual {p3, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast p1, Lkotlin/jvm/functions/Function1;

    :cond_b
    if-eqz v2, :cond_d

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_c

    new-instance p2, Lyc2/a;

    const/4 v1, 0x0

    invoke-direct {p2, v1}, Lyc2/a;-><init>(I)V

    invoke-virtual {p3, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast p2, Lc93/a;

    :cond_d
    new-instance v1, Lc4/a0;

    invoke-direct {v1, v7, v6, v7}, Lc4/a0;-><init>(ZZZ)V

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_e

    new-instance v2, Lyc2/a;

    const/4 v0, 0x1

    invoke-direct {v2, v0}, Lyc2/a;-><init>(I)V

    invoke-virtual {p3, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v2, Lc93/a;

    new-instance v0, Lyc2/b;

    const/4 v3, 0x0

    invoke-direct {v0, p0, p1, p2, v3}, Lyc2/b;-><init>(Lxc2/d;Lkotlin/jvm/functions/Function1;Lc93/a;I)V

    const v3, -0x18882be6

    invoke-static {v3, p3, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v3, 0x1b6

    invoke-static {v2, v1, v0, p3, v3}, Lse/b;->d(Lc93/a;Lc4/a0;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_8
    move-object v2, p1

    move-object v3, p2

    goto :goto_9

    :cond_f
    invoke-virtual {p3}, Lp1/q;->X()V

    goto :goto_8

    :goto_9
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_10

    new-instance v0, Lwr0/f;

    const/16 v6, 0x17

    move-object v1, p0

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lwr0/f;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ll83/e;III)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final H(Lxc2/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final J()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final K(Lxc2/d;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 13

    and-int/lit8 v0, p4, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p4, 0x1

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v4

    int-to-float v0, v2

    mul-float v8, v0, v1

    const/16 v0, 0x8a

    int-to-float v0, v0

    mul-float/2addr v0, v1

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    new-instance v0, Lyc2/b;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p2, v1}, Lyc2/b;-><init>(Lxc2/d;Lkotlin/jvm/functions/Function1;Lc93/a;I)V

    const p0, -0x6322db83

    invoke-static {p0, v10, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    const v11, 0x1b0006

    const/16 v12, 0x1c

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v12}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lxc2/d;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 29

    move-object/from16 v0, p0

    and-int/lit8 v1, p4, 0x3

    const/4 v2, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eq v1, v2, :cond_0

    move v1, v8

    goto :goto_0

    :cond_0
    move v1, v9

    :goto_0
    and-int/lit8 v2, p4, 0x1

    move-object/from16 v4, p3

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_b

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->w:Lb2/m;

    invoke-static {v2, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v4, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v7, v4, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v4, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v4, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v4, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v5, v4, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v3, v4, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v4, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    instance-of v1, v0, Lxc2/d$a;

    if-eqz v1, :cond_4

    const v1, -0x66645573

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    move-object v1, v0

    check-cast v1, Lxc2/d$a;

    move-object v2, v1

    invoke-virtual {v2}, Lxc2/d$a;->b()Lxc2/a;

    move-result-object v1

    invoke-virtual {v2}, Lxc2/d$a;->a()Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v3, p1

    move-object v5, v4

    move-object/from16 v4, p2

    invoke-static/range {v1 .. v7}, Lyc2/c;->t(Lxc2/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v5

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    :goto_2
    move-object/from16 v3, p2

    goto :goto_3

    :cond_4
    sget-object v1, Lxc2/d$c;->a:Lxc2/d$c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    const v1, 0x704f85bb

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    sget-object v10, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    sget v1, Lsz0/p0$c;->f:I

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v2, v2, 0x3

    or-int v23, v1, v2

    const/16 v24, 0x0

    const/16 v25, 0xffc

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v22, v4

    invoke-static/range {v10 .. v25}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_5
    instance-of v1, v0, Lxc2/d$d;

    if-eqz v1, :cond_6

    const v1, 0x704fa2d7

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    move-object v1, v0

    check-cast v1, Lxc2/d$d;

    invoke-static {v1, v4, v9}, Lyc2/c;->O(Lxc2/d$d;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_6
    instance-of v1, v0, Lxc2/d$b;

    if-eqz v1, :cond_a

    const v1, 0x704fb1e5

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    move-object v1, v0

    check-cast v1, Lxc2/d$b;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-static/range {v1 .. v6}, Lyc2/c;->z(Lxc2/d$b;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    :goto_3
    instance-of v0, v0, Lxc2/d$c;

    if-nez v0, :cond_9

    const v0, -0x6656677b

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    new-instance v11, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/a;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    sget v0, Lgy0/f;->E:I

    invoke-static {v4, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v16

    const v27, 0xffcf

    const/16 v28, 0x0

    move-object v10, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v10 .. v28}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_7

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_8

    :cond_7
    new-instance v1, Ly71/e;

    const/4 v0, 0x7

    invoke-direct {v1, v3, v0}, Ly71/e;-><init>(Lc93/a;I)V

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v14, v1

    check-cast v14, Lc93/a;

    sget v0, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v17, v0, 0x3

    const/16 v18, 0x2d

    move-object v11, v10

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v4

    invoke-static/range {v10 .. v18}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_9
    const v0, -0x66506461

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {v4, v8}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_a
    const v0, 0x704f501f

    invoke-static {v0, v4, v9}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_b
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final M(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Lxc2/d;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lyc2/c;->G(Lxc2/d;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final O(Lxc2/d$d;Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "viewState"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p1

    check-cast v15, Lp1/q;

    const v2, -0x37b5ce81

    invoke-virtual {v15, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v4, v2, 0x3

    const/4 v5, 0x1

    if-eq v4, v3, :cond_2

    move v3, v5

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    and-int/2addr v2, v5

    invoke-virtual {v15, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v3, Lsz0/p0$h;

    invoke-virtual {v0}, Lxc2/d$d;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const/4 v8, 0x6

    const/4 v9, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lxc2/d$d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v2, Lsz0/p0$h;->h:I

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v5, 0x3

    or-int v16, v2, v5

    const/16 v17, 0x0

    const/16 v18, 0xffc

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v3 .. v18}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    goto :goto_3

    :cond_3
    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_4

    new-instance v3, Lbb2/h;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v1, v4}, Lbb2/h;-><init>(Lxc2/d$d;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method private static final P(Lxc2/d$d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lyc2/c;->O(Lxc2/d$d;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lxc2/d;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lyc2/c;->N(Lxc2/d;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lyc2/c;->v()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lxc2/a;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lyc2/c;->w(Lxc2/a;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lxc2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyc2/c;->u(Lxc2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyc2/c;->E(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f()Ll83/a0;
    .locals 1

    invoke-static {}, Lyc2/c;->B()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g()Ll83/a0;
    .locals 1

    invoke-static {}, Lyc2/c;->J()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h(Lxc2/d$b;Lkotlin/jvm/functions/Function1;Lc93/a;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lyc2/c;->C(Lxc2/d$b;Lkotlin/jvm/functions/Function1;Lc93/a;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lxc2/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lyc2/c;->y(Lxc2/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lxc2/d;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lyc2/c;->K(Lxc2/d;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lxc2/d;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lyc2/c;->L(Lxc2/d;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lxc2/d$d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lyc2/c;->P(Lxc2/d$d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lxc2/d$b;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lyc2/c;->F(Lxc2/d$b;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyc2/c;->M(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lxc2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyc2/c;->A(Lxc2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p()Ll83/a0;
    .locals 1

    invoke-static {}, Lyc2/c;->I()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic q(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyc2/c;->x(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lkotlin/jvm/functions/Function1;Lxc2/d$b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lyc2/c;->D(Lkotlin/jvm/functions/Function1;Lxc2/d$b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lxc2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyc2/c;->H(Lxc2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final t(Lxc2/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxc2/a;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v5, p5

    const-string v0, "error"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "plan"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v3, 0x5e043f66

    invoke-virtual {v0, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v5, 0x6

    const/4 v4, 0x4

    const/4 v6, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    invoke-virtual {v0, v3}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v6

    :goto_0
    or-int/2addr v3, v5

    goto :goto_1

    :cond_1
    move v3, v5

    :goto_1
    and-int/lit8 v7, v5, 0x30

    const/16 v8, 0x20

    if-nez v7, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    move v7, v8

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v3, v7

    :cond_3
    and-int/lit8 v7, p6, 0x4

    const/16 v9, 0x100

    if-eqz v7, :cond_5

    or-int/lit16 v3, v3, 0x180

    :cond_4
    move-object/from16 v10, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v10, v5, 0x180

    if-nez v10, :cond_4

    move-object/from16 v10, p2

    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    move v11, v9

    goto :goto_3

    :cond_6
    const/16 v11, 0x80

    :goto_3
    or-int/2addr v3, v11

    :goto_4
    and-int/lit8 v11, p6, 0x8

    if-eqz v11, :cond_8

    or-int/lit16 v3, v3, 0xc00

    :cond_7
    move-object/from16 v13, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v13, v5, 0xc00

    if-nez v13, :cond_7

    move-object/from16 v13, p3

    invoke-virtual {v0, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_9

    const/16 v14, 0x800

    goto :goto_5

    :cond_9
    const/16 v14, 0x400

    :goto_5
    or-int/2addr v3, v14

    :goto_6
    and-int/lit16 v14, v3, 0x493

    const/16 v15, 0x492

    const/16 v16, 0x0

    const/16 v17, 0x1

    if-eq v14, v15, :cond_a

    move/from16 v14, v17

    goto :goto_7

    :cond_a
    move/from16 v14, v16

    :goto_7
    and-int/lit8 v15, v3, 0x1

    invoke-virtual {v0, v15, v14}, Lp1/q;->U(IZ)Z

    move-result v14

    if-eqz v14, :cond_17

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_c

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v14, :cond_b

    new-instance v7, Lyb1/a;

    const/4 v10, 0x6

    invoke-direct {v7, v10}, Lyb1/a;-><init>(I)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_c
    move-object v7, v10

    :goto_8
    if-eqz v11, :cond_e

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v14, :cond_d

    new-instance v10, Lxo1/a;

    const/16 v11, 0x1d

    invoke-direct {v10, v11}, Lxo1/a;-><init>(I)V

    invoke-virtual {v0, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v10, Lc93/a;

    goto :goto_9

    :cond_e
    move-object v10, v13

    :goto_9
    new-instance v18, Lsz0/p0$b;

    new-instance v11, Lcom/whoop/design/util/TextResource$b;

    sget v13, Lea2/s;->K0:I

    const/4 v15, 0x0

    invoke-direct {v11, v13, v15, v6, v15}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v22, 0x6

    const/16 v23, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v19, v11

    invoke-direct/range {v18 .. v23}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    new-instance v13, Lcom/whoop/design/util/TextResource$b;

    sget v12, Lea2/s;->L0:I

    invoke-direct {v13, v12, v15, v6, v15}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v12, v3, 0xe

    if-ne v12, v4, :cond_f

    move/from16 v4, v17

    goto :goto_a

    :cond_f
    move/from16 v4, v16

    :goto_a
    and-int/lit16 v12, v3, 0x380

    if-ne v12, v9, :cond_10

    move/from16 v9, v17

    goto :goto_b

    :cond_10
    move/from16 v9, v16

    :goto_b
    or-int/2addr v4, v9

    and-int/lit8 v9, v3, 0x70

    if-ne v9, v8, :cond_11

    move/from16 v8, v17

    goto :goto_c

    :cond_11
    move/from16 v8, v16

    :goto_c
    or-int/2addr v4, v8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_12

    if-ne v8, v14, :cond_13

    :cond_12
    new-instance v8, Lre1/k;

    const/16 v4, 0x19

    invoke-direct {v8, v4, v1, v7, v2}, Lre1/k;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v8, Lc93/a;

    move-object v9, v13

    new-instance v13, Lcom/whoop/design/util/TextResource$b;

    sget v4, Lea2/s;->J0:I

    invoke-direct {v13, v4, v15, v6, v15}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v3, v3, 0x1c00

    const/16 v4, 0x800

    if-ne v3, v4, :cond_14

    move/from16 v16, v17

    :cond_14
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v16, :cond_15

    if-ne v3, v14, :cond_16

    :cond_15
    new-instance v3, Ly71/e;

    const/4 v4, 0x5

    invoke-direct {v3, v10, v4}, Ly71/e;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    move-object v14, v3

    check-cast v14, Lc93/a;

    const/high16 v3, 0x30000

    sget v4, Lsz0/p0$b;->h:I

    or-int/2addr v3, v4

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v4, v4, 0x3

    or-int/2addr v3, v4

    sget v4, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v6, v4, 0x9

    or-int/2addr v3, v6

    shl-int/lit8 v4, v4, 0x15

    or-int v19, v3, v4

    const/16 v20, 0x0

    const/16 v21, 0xe44

    move-object v3, v10

    move-object v10, v8

    const/4 v8, 0x0

    move-object v4, v7

    move-object v7, v11

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v6, v18

    move-object/from16 v18, v0

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v24, v4

    move-object v4, v3

    move-object/from16 v3, v24

    goto :goto_d

    :cond_17
    move-object/from16 v18, v0

    invoke-virtual/range {v18 .. v18}, Lp1/q;->X()V

    move-object v3, v10

    move-object v4, v13

    :goto_d
    invoke-virtual/range {v18 .. v18}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_18

    new-instance v0, Lw71/k;

    const/16 v7, 0x10

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lw71/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ll83/e;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final u(Lxc2/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final w(Lxc2/a;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    sget-object v0, Lyc2/c$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    new-instance p0, Lxc2/b$a;

    invoke-direct {p0, p2}, Lxc2/b$a;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    new-instance p0, Lxc2/b$b;

    invoke-direct {p0, p2}, Lxc2/b$b;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lxc2/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lyc2/c;->t(Lxc2/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final z(Lxc2/d$b;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxc2/d$b;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v9, p3

    check-cast v9, Lp1/q;

    const p3, -0x2a984492

    invoke-virtual {v9, p3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p3, v4, 0x6

    if-nez p3, :cond_1

    invoke-virtual {v9, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    const/4 p3, 0x4

    goto :goto_0

    :cond_0
    const/4 p3, 0x2

    :goto_0
    or-int/2addr p3, v4

    goto :goto_1

    :cond_1
    move p3, v4

    :goto_1
    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_2

    or-int/lit8 p3, p3, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v1, v4, 0x30

    if-nez v1, :cond_4

    invoke-virtual {v9, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x20

    goto :goto_2

    :cond_3
    const/16 v1, 0x10

    :goto_2
    or-int/2addr p3, v1

    :cond_4
    :goto_3
    and-int/lit8 v1, p5, 0x4

    if-eqz v1, :cond_5

    or-int/lit16 p3, p3, 0x180

    goto :goto_5

    :cond_5
    and-int/lit16 v2, v4, 0x180

    if-nez v2, :cond_7

    invoke-virtual {v9, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x100

    goto :goto_4

    :cond_6
    const/16 v2, 0x80

    :goto_4
    or-int/2addr p3, v2

    :cond_7
    :goto_5
    and-int/lit16 v2, p3, 0x93

    const/16 v3, 0x92

    const/4 v5, 0x1

    if-eq v2, v3, :cond_8

    move v2, v5

    goto :goto_6

    :cond_8
    const/4 v2, 0x0

    :goto_6
    and-int/2addr p3, v5

    invoke-virtual {v9, p3, v2}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_d

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-eqz v0, :cond_a

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, p3, :cond_9

    new-instance p1, Lyb1/a;

    const/4 v0, 0x7

    invoke-direct {p1, v0}, Lyb1/a;-><init>(I)V

    invoke-virtual {v9, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast p1, Lkotlin/jvm/functions/Function1;

    :cond_a
    if-eqz v1, :cond_c

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-ne p2, p3, :cond_b

    new-instance p2, Lyc2/a;

    const/4 p3, 0x2

    invoke-direct {p2, p3}, Lyc2/a;-><init>(I)V

    invoke-virtual {v9, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast p2, Lc93/a;

    :cond_c
    new-instance p3, Lno0/h;

    const/16 v0, 0x1c

    invoke-direct {p3, p0, p1, p2, v0}, Lno0/h;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    const v0, -0x5d2c12a8

    invoke-static {v0, v9, p3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const/16 v10, 0xc00

    const/4 v11, 0x7

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v11}, Ll0/f;->a(Landroidx/compose/ui/Modifier;Lb2/h;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    :goto_7
    move-object v2, p1

    move-object v3, p2

    goto :goto_8

    :cond_d
    invoke-virtual {v9}, Lp1/q;->X()V

    goto :goto_7

    :goto_8
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_e

    new-instance v0, Lwr0/f;

    const/16 v6, 0x16

    move-object v1, p0

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lwr0/f;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ll83/e;III)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

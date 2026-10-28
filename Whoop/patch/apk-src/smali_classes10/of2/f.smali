.class public abstract Lof2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Llf2/m;",
        "wakeTimeState",
        "Lkotlin/Function1;",
        "Lpf2/d;",
        "Ll83/a0;",
        "wakeTimeListener",
        "d",
        "(Llf2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "sleep-coach_release"
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
.method public static synthetic a(Llf2/m;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lof2/f;->g(Llf2/m;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lof2/f;->f(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;II)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lof2/f;->e(Lkotlin/jvm/functions/Function1;II)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Llf2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llf2/m;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v3, "wakeTimeState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "wakeTimeListener"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    const v3, -0x3a8d29af

    invoke-virtual {v13, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v6, p3, 0x30

    const/16 v7, 0x20

    if-nez v6, :cond_3

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    move v6, v7

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :cond_3
    and-int/lit8 v6, v3, 0x13

    const/16 v8, 0x12

    if-eq v6, v8, :cond_4

    const/4 v6, 0x1

    goto :goto_3

    :cond_4
    const/4 v6, 0x0

    :goto_3
    and-int/lit8 v11, v3, 0x1

    invoke-virtual {v13, v11, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_11

    sget-object v6, Lb2/e;->N:Lb2/k;

    sget-object v11, Ll0/m;->g:Ll0/h;

    const/high16 v12, 0x3f800000    # 1.0f

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v14}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    const/16 v4, 0x36

    invoke-static {v11, v6, v13, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    move-object/from16 v16, v6

    iget-wide v5, v13, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v13, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-eqz v9, :cond_5

    invoke-virtual {v13, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_4
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v13, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v13, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-nez v10, :cond_6

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_7

    :cond_6
    invoke-static {v5, v13, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v13, v5, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v10, 0x3f333333    # 0.7f

    invoke-static {v10, v14}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    move-object v10, v6

    invoke-virtual {v0}, Llf2/m;->d()Lorg/joda/time/LocalTime;

    move-result-object v6

    and-int/lit8 v3, v3, 0x70

    if-ne v3, v7, :cond_8

    const/4 v15, 0x1

    goto :goto_5

    :cond_8
    const/4 v15, 0x0

    :goto_5
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v22, v4

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-nez v15, :cond_9

    if-ne v7, v4, :cond_a

    :cond_9
    new-instance v7, Lcom/whoop/profile/view/h;

    const/4 v15, 0x5

    invoke-direct {v7, v1, v15}, Lcom/whoop/profile/view/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lc93/m;

    const v15, 0xd80c00

    move-object/from16 v23, v16

    const/16 v16, 0x33

    move-object/from16 v24, v4

    const/4 v4, 0x0

    move-object/from16 v25, v5

    const/4 v5, 0x0

    move-object/from16 v26, v13

    move-object v13, v7

    const/4 v7, 0x0

    move-object/from16 v27, v8

    const/4 v8, 0x0

    move-object/from16 v28, v9

    move-object/from16 v29, v10

    const-wide/16 v9, 0x0

    move/from16 v30, v12

    const/4 v12, 0x0

    move/from16 p2, v3

    move-object v3, v14

    move-object/from16 v32, v24

    move-object/from16 v31, v25

    move-object/from16 v14, v26

    move-object/from16 v2, v27

    move-object/from16 v1, v28

    move/from16 v0, v30

    const/16 v17, 0x12

    invoke-static/range {v4 .. v16}, Ll41/d;->g(Ljava/lang/String;ZLorg/joda/time/LocalTime;ZLjava/lang/String;JLandroidx/compose/ui/Modifier;ZLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v13, v14

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v5, 0x4

    int-to-float v5, v5

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float v7, v5, v6

    const/4 v8, 0x0

    const/4 v11, 0x2

    invoke-static {v4, v7, v8, v11}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v7, Ll0/m;->e:Ll0/h;

    sget-object v9, Lb2/e;->M:Lb2/k;

    const/4 v10, 0x6

    invoke-static {v7, v9, v13, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v9, v13, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v13, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_b

    invoke-virtual {v13, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_b
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v13, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, v22

    invoke-static {v13, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v13, Lp1/q;->S:Z

    if-nez v1, :cond_c

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    :cond_c
    move-object/from16 v10, v29

    goto :goto_8

    :cond_d
    :goto_7
    move-object/from16 v1, v31

    goto :goto_9

    :goto_8
    invoke-static {v9, v13, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_7

    :goto_9
    invoke-static {v13, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v1, v11

    mul-float/2addr v1, v6

    invoke-static {v3, v1, v8, v11}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v2, v23

    invoke-static {v2, v1}, Lev/n;->g(Lb2/k;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Llf2/m;->a()Ljava/lang/String;

    move-result-object v4

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v2, v13, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->c()Lb91/a;

    move-result-object v24

    invoke-virtual {v2, v13, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->b1()J

    move-result-wide v6

    new-instance v2, Lw3/k;

    const/4 v8, 0x3

    invoke-direct {v2, v8}, Lw3/k;-><init>(I)V

    sget v8, Lb91/a;->d:I

    shl-int/lit8 v28, v8, 0x12

    const v29, 0x2fdf8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v26, v13

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move/from16 v16, v5

    move-object v5, v1

    move/from16 v1, v16

    move-object/from16 v16, v2

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v26

    invoke-static {v1, v1, v3, v13}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lny0/v;->TextLarge:Lny0/v;

    invoke-virtual/range {p0 .. p0}, Llf2/m;->f()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Llf2/m;->e()Ly81/f;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v13, v2}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v8

    move/from16 v0, p2

    const/16 v7, 0x20

    if-ne v0, v7, :cond_e

    const/4 v2, 0x1

    :cond_e
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v2, :cond_10

    move-object/from16 v2, v32

    if-ne v0, v2, :cond_f

    goto :goto_a

    :cond_f
    move-object/from16 v7, p1

    goto :goto_b

    :cond_10
    :goto_a
    new-instance v0, Lnw0/n;

    const/16 v2, 0xe

    move-object/from16 v7, p1

    invoke-direct {v0, v7, v2}, Lnw0/n;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_b
    move-object v12, v0

    check-cast v12, Lc93/a;

    const/16 v14, 0x36

    const/16 v15, 0x68

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v0, p1

    invoke-static/range {v4 .. v15}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    const/16 v2, 0xa

    int-to-float v2, v2

    const/4 v4, 0x1

    invoke-static {v2, v1, v3, v13, v4}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    invoke-virtual {v13, v4}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_11
    move-object v0, v1

    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_c
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_12

    new-instance v2, Lof2/d;

    const/4 v3, 0x1

    move-object/from16 v4, p0

    move/from16 v5, p3

    invoke-direct {v2, v4, v0, v5, v3}, Lof2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;II)Ll83/a0;
    .locals 2

    new-instance v0, Lpf2/d$b;

    new-instance v1, Lorg/joda/time/LocalTime;

    invoke-direct {v1, p1, p2}, Lorg/joda/time/LocalTime;-><init>(II)V

    invoke-direct {v0, v1}, Lpf2/d$b;-><init>(Lorg/joda/time/LocalTime;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lpf2/d$a;->a:Lpf2/d$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Llf2/m;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lof2/f;->d(Llf2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.class public abstract Lrq2/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lrq2/q;",
        "step",
        "",
        "isCurrentStep",
        "Ll83/a0;",
        "d",
        "(Lrq2/q;ZLandroidx/compose/runtime/Composer;I)V",
        "user-journey_release"
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
.method public static synthetic a(Lrq2/q;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lrq2/p;->g(Lrq2/q;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lrq2/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lrq2/p;->f(Lrq2/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lrq2/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lrq2/p;->e(Lrq2/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lrq2/q;ZLandroidx/compose/runtime/Composer;I)V
    .locals 9

    const-string v0, "step"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p2

    check-cast v4, Lp1/q;

    const p2, -0x2071cc5f

    invoke-virtual {v4, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_2

    and-int/lit8 p2, p3, 0x8

    if-nez p2, :cond_0

    invoke-virtual {v4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    goto :goto_0

    :cond_0
    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    :goto_0
    if-eqz p2, :cond_1

    const/4 p2, 0x4

    goto :goto_1

    :cond_1
    const/4 p2, 0x2

    :goto_1
    or-int/2addr p2, p3

    goto :goto_2

    :cond_2
    move p2, p3

    :goto_2
    and-int/lit8 v0, p3, 0x30

    if-nez v0, :cond_4

    invoke-virtual {v4, p1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x20

    goto :goto_3

    :cond_3
    const/16 v0, 0x10

    :goto_3
    or-int/2addr p2, v0

    :cond_4
    and-int/lit8 v0, p2, 0x13

    const/16 v1, 0x12

    const/4 v8, 0x0

    const/4 v2, 0x1

    if-eq v0, v1, :cond_5

    move v0, v2

    goto :goto_4

    :cond_5
    move v0, v8

    :goto_4
    and-int/2addr p2, v2

    invoke-virtual {v4, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_8

    if-eqz p1, :cond_7

    const p2, 0x652cbb7e

    invoke-virtual {v4, p2}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p2, v0, :cond_6

    new-instance p2, Ld0/q0;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p2, v0}, Ld0/q0;-><init>(Ljava/lang/Object;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p2, v0}, Ld0/q0;->I0(Ljava/lang/Boolean;)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v1, p2

    check-cast v1, Ld0/q0;

    new-instance p2, Lrq2/o;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lrq2/o;-><init>(Lrq2/q;I)V

    const v0, 0x850bd0c

    invoke-static {v0, v4, p2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v5, 0x180

    const/4 v6, 0x2

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Lkr2/b;->k(Ld0/q0;Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    sget-object v2, Lkr2/g;->BOTTOM:Lkr2/g;

    new-instance p2, Lrq2/o;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, Lrq2/o;-><init>(Lrq2/q;I)V

    const v0, -0x4a82fb39

    invoke-static {v0, v4, p2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object p2

    const/16 v6, 0xc30

    const/4 v7, 0x4

    const/4 v3, 0x0

    move-object v5, v4

    move-object v4, p2

    invoke-static/range {v1 .. v7}, Lkr2/b;->u(Ld0/q0;Lkr2/g;Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v5

    invoke-virtual {v4, v8}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    const p2, 0x65496661

    invoke-virtual {v4, p2}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v8}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_8
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_9

    new-instance v0, Lrq2/m;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p3, v1}, Lrq2/m;-><init>(Lrq2/q;ZII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final e(Lrq2/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 14

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object v11, p1

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v1, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_4

    const/high16 p1, 0x3f800000    # 1.0f

    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {p1, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {}, Ljr2/a;->f()Li2/t;

    move-result-object v4

    invoke-static {v1, v4}, Lny0/u;->o(Landroidx/compose/ui/Modifier;Li2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v4, Lb2/e;->w:Lb2/m;

    invoke-static {v4, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v5, v11, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v11, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-eqz v8, :cond_1

    invoke-virtual {v11, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v11, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v11, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v11, Lp1/q;->S:Z

    if-nez v6, :cond_2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    :cond_2
    invoke-static {v5, v11, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v11, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lrq2/q;->h()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v11, v2}, Lrq2/n;->f(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)I

    move-result p0

    invoke-static {p0, v11, v2}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v4

    sget p0, Lyp2/c;->C:I

    invoke-static {v11, p0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object p0, Lb2/e;->F:Lb2/m;

    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v1, v0, p0}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-static {p1, p0}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v12, 0x6000

    const/16 v13, 0x68

    const/4 v7, 0x0

    sget-object v8, Ly2/j;->c:Ly2/b1;

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v4 .. v13}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lrq2/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 37

    and-int/lit8 v0, p2, 0x3

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v4, p2, 0x1

    move-object/from16 v5, p1

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v0, 0x5

    int-to-float v0, v0

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float v10, v0, v7

    const/4 v11, 0x7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, Ll0/m;->d:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    const/4 v8, 0x6

    invoke-static {v6, v7, v5, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v7, v5, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v5, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v10, v5, Lp1/q;->S:Z

    if-eqz v10, :cond_1

    invoke-virtual {v5, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_1
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v5, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v5, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v5, Lp1/q;->S:Z

    if-nez v8, :cond_2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    :cond_2
    invoke-static {v7, v5, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v5, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lrq2/q;->g()Ljava/lang/String;

    move-result-object v0

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v5, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->N()Lb91/a;

    move-result-object v25

    const/4 v8, 0x4

    int-to-float v8, v8

    mul-float v9, v8, v8

    const/4 v10, 0x0

    invoke-static {v4, v9, v10, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const-string v12, "IntroStepV2Greeting"

    invoke-static {v11, v12}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v6, v5, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v12

    sget v14, Lb91/a;->d:I

    shl-int/lit8 v29, v14, 0x12

    const v30, 0x2fff8

    move v14, v9

    move v15, v10

    const-wide/16 v9, 0x0

    move-object/from16 v16, v6

    move-object v6, v11

    const/4 v11, 0x0

    move/from16 v17, v8

    move-wide/from16 v35, v12

    move v13, v7

    move-wide/from16 v7, v35

    const/4 v12, 0x0

    move/from16 v18, v13

    const/4 v13, 0x0

    move/from16 v19, v14

    move/from16 v20, v15

    const-wide/16 v14, 0x0

    move-object/from16 v21, v16

    const/16 v16, 0x0

    move/from16 v22, v17

    const/16 v17, 0x0

    move/from16 v23, v18

    move/from16 v24, v19

    const-wide/16 v18, 0x0

    move/from16 v26, v20

    const/16 v20, 0x0

    move-object/from16 v27, v21

    const/16 v21, 0x0

    move/from16 v28, v22

    const/16 v22, 0x0

    move/from16 v31, v23

    const/16 v23, 0x0

    move/from16 v32, v24

    const/16 v24, 0x0

    move/from16 v33, v26

    const/16 v26, 0x0

    move/from16 v34, v28

    const/16 v28, 0x30

    move-object v1, v5

    move-object v5, v0

    move-object/from16 v0, v27

    move-object/from16 v27, v1

    move/from16 v2, v31

    move/from16 v1, v32

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    invoke-virtual/range {p0 .. p0}, Lrq2/q;->f()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v5, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->N()Lb91/a;

    move-result-object v25

    const/4 v15, 0x0

    invoke-static {v4, v1, v15, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v0, v5, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v7

    const-wide/16 v14, 0x0

    move-object v5, v6

    move-object v6, v3

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    invoke-virtual/range {p0 .. p0}, Lrq2/q;->e()Llq2/b;

    move-result-object v0

    const/4 v2, 0x3

    int-to-float v2, v2

    mul-float v8, v2, v34

    const/4 v10, 0x0

    const/16 v11, 0x8

    move v9, v1

    move v7, v1

    move-object v6, v4

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v5, v2, v2}, Llq2/d;->b(Llq2/b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Lrq2/q;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lrq2/p;->d(Lrq2/q;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

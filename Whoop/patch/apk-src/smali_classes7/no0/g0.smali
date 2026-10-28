.class public abstract Lno0/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lno0/g0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Llo0/b0;",
        "viewState",
        "Lkotlin/Function1;",
        "Llo0/z;",
        "Ll83/a0;",
        "onEvent",
        "n",
        "(Llo0/b0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lc0/l0;",
        "A",
        "()Lc0/l0;",
        "x",
        "clinician-in-the-loop_release"
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
.method private static final A()Lc0/l0;
    .locals 7

    const/16 v0, 0x12c

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-static {v0, v1, v2, v3}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v4

    new-instance v5, Ln72/b;

    const/16 v6, 0x14

    invoke-direct {v5, v6}, Ln72/b;-><init>(I)V

    invoke-static {v4, v5}, Lc0/w0;->m(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/d1;

    move-result-object v4

    invoke-static {v0, v1, v2, v3}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    new-instance v1, Ln72/b;

    const/16 v2, 0x15

    invoke-direct {v1, v2}, Ln72/b;-><init>(I)V

    invoke-static {v0, v1}, Lc0/w0;->q(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/f1;

    move-result-object v0

    invoke-static {v4, v0}, Landroidx/compose/animation/a;->c(Lc0/d1;Lc0/f1;)Lc0/l0;

    move-result-object v0

    return-object v0
.end method

.method private static final B(I)I
    .locals 0

    return p0
.end method

.method private static final C(I)I
    .locals 0

    neg-int p0, p0

    return p0
.end method

.method public static synthetic a(I)I
    .locals 0

    invoke-static {p0}, Lno0/g0;->B(I)I

    move-result p0

    return p0
.end method

.method public static synthetic b(Llo0/b0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lno0/g0;->p(Llo0/b0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2, p3}, Lno0/g0;->r(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(I)I
    .locals 0

    invoke-static {p0}, Lno0/g0;->C(I)I

    move-result p0

    return p0
.end method

.method public static synthetic e(Llo0/l0;Lc0/q;)Lc0/l0;
    .locals 0

    invoke-static {p0, p1}, Lno0/g0;->u(Llo0/l0;Lc0/q;)Lc0/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Llo0/b0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lno0/g0;->w(Llo0/b0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lno0/g0;->s(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Llo0/z;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lno0/g0;->o(Llo0/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lno0/g0;->t(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(I)I
    .locals 0

    invoke-static {p0}, Lno0/g0;->y(I)I

    move-result p0

    return p0
.end method

.method public static synthetic k(I)I
    .locals 0

    invoke-static {p0}, Lno0/g0;->z(I)I

    move-result p0

    return p0
.end method

.method public static synthetic l(Lz1/s;Lkotlin/jvm/functions/Function1;Lc0/o;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lno0/g0;->v(Lz1/s;Lkotlin/jvm/functions/Function1;Lc0/o;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lz1/s;Llo0/b0$b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lno0/g0;->q(Lz1/s;Llo0/b0$b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Llo0/b0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llo0/b0;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v0, -0xfc04a0b

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int v0, p3, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p3

    :goto_2
    and-int/lit8 v2, p4, 0x2

    const/16 v3, 0x20

    if-eqz v2, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v7, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    move v5, v3

    goto :goto_3

    :cond_5
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v0, v5

    :goto_4
    and-int/lit8 v5, v0, 0x13

    const/16 v6, 0x12

    const/4 v10, 0x0

    if-eq v5, v6, :cond_6

    const/4 v5, 0x1

    goto :goto_5

    :cond_6
    move v5, v10

    :goto_5
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v7, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_1a

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_8

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v12, :cond_7

    new-instance v2, Ln72/b;

    const/16 v4, 0x11

    invoke-direct {v2, v4}, Ln72/b;-><init>(I)V

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_8
    move-object v2, v4

    :goto_6
    invoke-virtual {v1}, Llo0/b0;->f()Llo0/b0$b;

    move-result-object v4

    if-nez v4, :cond_9

    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1b

    new-instance v0, Lno0/d0;

    const/4 v5, 0x0

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lno0/d0;-><init>(Llo0/b0;Lkotlin/jvm/functions/Function1;III)V

    :goto_7
    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_9
    move-object v13, v2

    invoke-virtual {v4}, Llo0/b0$b;->a()Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Llo0/b0;->g()Llo0/l0;

    move-result-object v15

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v12, :cond_a

    new-instance v1, Lz1/s;

    invoke-direct {v1}, Lz1/s;-><init>()V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v1, Lz1/s;

    invoke-virtual {v7, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_b

    if-ne v5, v12, :cond_c

    :cond_b
    new-instance v5, Lno0/o0;

    const/4 v2, 0x4

    invoke-direct {v5, v2, v1, v4}, Lno0/o0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v5, Lc93/a;

    invoke-static {v5, v7}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v2, v5}, Lvl/b;->c(Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    invoke-static {v8, v9, v7, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    move-object/from16 v16, v12

    iget-wide v11, v7, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v7, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-eqz v5, :cond_d

    invoke-virtual {v7, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_d
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_8
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v7, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v7, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-nez v8, :cond_e

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    :cond_e
    invoke-static {v9, v7, v9, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v7, v5, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    instance-of v5, v4, Llo0/b0$b$f;

    const/4 v6, 0x0

    if-eqz v5, :cond_10

    move-object v5, v4

    check-cast v5, Llo0/b0$b$f;

    goto :goto_9

    :cond_10
    move-object v5, v6

    :goto_9
    if-eqz v5, :cond_11

    invoke-virtual {v5}, Llo0/b0$b$f;->e()Ljava/lang/String;

    move-result-object v5

    goto :goto_a

    :cond_11
    move-object v5, v6

    :goto_a
    invoke-virtual {v4}, Llo0/b0$b;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v18

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-static {v4}, Lev/n;->h(Lx81/d;)Ljava/lang/Integer;

    move-result-object v20

    if-nez v5, :cond_12

    const v4, -0x9f1a54c

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    :goto_b
    move-object/from16 v27, v6

    goto :goto_c

    :cond_12
    const v4, -0x9f1a54b

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    new-instance v4, Lno0/n;

    invoke-direct {v4, v13, v5}, Lno0/n;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    const v5, 0x54bc64b0

    invoke-static {v5, v7, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    goto :goto_b

    :goto_c
    new-instance v17, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const v34, 0xfdfa

    const/16 v35, 0x0

    invoke-direct/range {v17 .. v35}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x1

    int-to-float v5, v4

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v5, v4

    invoke-static {v5, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v3, :cond_13

    const/4 v0, 0x1

    goto :goto_d

    :cond_13
    move v0, v10

    :goto_d
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_14

    move-object/from16 v0, v16

    if-ne v3, v0, :cond_15

    goto :goto_e

    :cond_14
    move-object/from16 v0, v16

    :goto_e
    new-instance v3, Lmf2/e;

    const/16 v4, 0x15

    invoke-direct {v3, v13, v4}, Lmf2/e;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object v4, v3

    check-cast v4, Lc93/a;

    sget v3, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v3, v3, 0x3

    or-int/lit8 v8, v3, 0x6

    const/16 v9, 0x34

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v11, v1

    move-object v1, v2

    move-object/from16 v2, v17

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static/range {v1 .. v9}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    float-to-double v1, v12

    const-wide/16 v3, 0x0

    cmpl-double v1, v1, v3

    if-lez v1, :cond_16

    const/4 v10, 0x1

    :cond_16
    if-nez v10, :cond_17

    const-string v1, "invalid weight; must be greater than zero"

    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_17
    const/4 v4, 0x1

    invoke-static {v12, v12, v4}, Ly00/t7;->d(FFZ)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-virtual {v7, v1}, Lp1/q;->e(I)Z

    move-result v1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_18

    if-ne v3, v0, :cond_19

    :cond_18
    new-instance v3, Lno0/e0;

    const/4 v0, 0x0

    invoke-direct {v3, v15, v0}, Lno0/e0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v3, Lkotlin/jvm/functions/Function1;

    new-instance v0, Lno0/f0;

    invoke-direct {v0, v11, v13}, Lno0/f0;-><init>(Lz1/s;Lkotlin/jvm/functions/Function1;)V

    const v1, -0x539913ab

    invoke-static {v1, v7, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const v9, 0x186000

    const/16 v10, 0x28

    const/4 v4, 0x0

    const-string v5, "ClinicianVideoSchedulingIntakeStep"

    const/4 v6, 0x0

    move-object v8, v7

    move-object v1, v14

    move-object v7, v0

    invoke-static/range {v1 .. v10}, Landroidx/compose/animation/a;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/n;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v8

    const/4 v4, 0x1

    invoke-virtual {v7, v4}, Lp1/q;->q(Z)V

    move-object v2, v13

    goto :goto_f

    :cond_1a
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v2, v4

    :goto_f
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1b

    new-instance v0, Lno0/d0;

    const/4 v5, 0x1

    move-object/from16 v1, p0

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lno0/d0;-><init>(Llo0/b0;Lkotlin/jvm/functions/Function1;III)V

    goto/16 :goto_7

    :cond_1b
    return-void
.end method

.method private static final o(Llo0/z;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Llo0/b0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lno0/g0;->n(Llo0/b0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lz1/s;Llo0/b0$b;)Ll83/a0;
    .locals 1

    invoke-virtual {p1}, Llo0/b0$b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

    move-object/from16 v0, p0

    and-int/lit8 v1, p3, 0x3

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v1, v3, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, p3, 0x1

    move-object/from16 v4, p2

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_2

    :cond_1
    new-instance v2, Lmf2/e;

    const/16 v1, 0x14

    invoke-direct {v2, v0, v1}, Lmf2/e;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v9, v2

    check-cast v9, Lc93/a;

    const/16 v10, 0xf

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v1, v3

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v4, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->m()Lb91/a;

    move-result-object v24

    invoke-virtual {v0, v4, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v6

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v28, v0, 0x12

    const v29, 0x2fff8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v4

    move-object/from16 v4, p1

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_3
    move-object/from16 v26, v4

    invoke-virtual/range {v26 .. v26}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final s(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Llo0/z$m;->a:Llo0/z$m;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Llo0/z$n;->a:Llo0/z$n;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Llo0/l0;Lc0/q;)Lc0/l0;
    .locals 1

    const-string v0, "$this$AnimatedContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lno0/g0$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p1, p0

    const/4 p1, 0x1

    if-eq p0, p1, :cond_2

    const/4 p1, 0x2

    if-eq p0, p1, :cond_1

    const/4 p1, 0x3

    if-ne p0, p1, :cond_0

    sget-object p0, Lc0/c1;->a:Lc0/d1;

    sget-object p1, Lc0/e1;->a:Lc0/f1;

    invoke-static {p0, p1}, Landroidx/compose/animation/a;->c(Lc0/d1;Lc0/f1;)Lc0/l0;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    invoke-static {}, Lno0/g0;->x()Lc0/l0;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-static {}, Lno0/g0;->A()Lc0/l0;

    move-result-object p0

    return-object p0
.end method

.method private static final v(Lz1/s;Lkotlin/jvm/functions/Function1;Lc0/o;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    const-string p5, "$this$AnimatedContent"

    invoke-static {p2, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "animatedStepId"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Lz1/s;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Llo0/b0$b;

    instance-of p2, p0, Llo0/b0$b$b;

    const/4 p3, 0x0

    if-eqz p2, :cond_0

    check-cast p4, Lp1/q;

    const p2, 0x2e5d4274

    invoke-virtual {p4, p2}, Lp1/q;->e0(I)V

    check-cast p0, Llo0/b0$b$b;

    invoke-static {p0, p1, p4, p3, p3}, Lno0/a0;->i(Llo0/b0$b$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p4, p3}, Lp1/q;->q(Z)V

    goto/16 :goto_0

    :cond_0
    instance-of p2, p0, Llo0/b0$b$e;

    if-eqz p2, :cond_1

    check-cast p4, Lp1/q;

    const p2, 0x2e5d5714

    invoke-virtual {p4, p2}, Lp1/q;->e0(I)V

    check-cast p0, Llo0/b0$b$e;

    invoke-static {p0, p1, p4, p3, p3}, Lno0/n0;->l(Llo0/b0$b$e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p4, p3}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_1
    instance-of p2, p0, Llo0/b0$b$c;

    if-eqz p2, :cond_2

    check-cast p4, Lp1/q;

    const p2, 0x2e5d6bb4

    invoke-virtual {p4, p2}, Lp1/q;->e0(I)V

    check-cast p0, Llo0/b0$b$c;

    invoke-static {p0, p1, p4, p3, p3}, Lno0/i0;->i(Llo0/b0$b$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p4, p3}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_2
    instance-of p2, p0, Llo0/b0$b$d;

    if-eqz p2, :cond_3

    check-cast p4, Lp1/q;

    const p2, 0x2e5d80b7

    invoke-virtual {p4, p2}, Lp1/q;->e0(I)V

    check-cast p0, Llo0/b0$b$d;

    invoke-static {p0, p1, p4, p3, p3}, Lno0/l0;->I(Llo0/b0$b$d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p4, p3}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_3
    instance-of p2, p0, Llo0/b0$b$f;

    if-eqz p2, :cond_4

    check-cast p4, Lp1/q;

    const p2, 0x2e5d9572

    invoke-virtual {p4, p2}, Lp1/q;->e0(I)V

    check-cast p0, Llo0/b0$b$f;

    invoke-static {p0, p1, p4, p3, p3}, Lno0/p0;->k(Llo0/b0$b$f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p4, p3}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_4
    instance-of p2, p0, Llo0/b0$b$a;

    if-eqz p2, :cond_5

    check-cast p4, Lp1/q;

    const p2, 0x2e5da9f5

    invoke-virtual {p4, p2}, Lp1/q;->e0(I)V

    check-cast p0, Llo0/b0$b$a;

    invoke-static {p0, p1, p4, p3}, Lno0/z;->f(Llo0/b0$b$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p4, p3}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_5
    if-nez p0, :cond_6

    check-cast p4, Lp1/q;

    const p0, 0x2e5db4f0

    invoke-virtual {p4, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-static {p1, p0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p1, 0x6

    invoke-static {p0, p4, p1}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p4, p3}, Lp1/q;->q(Z)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_6
    const p0, 0x2e5d336c

    check-cast p4, Lp1/q;

    invoke-static {p0, p4, p3}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0
.end method

.method private static final w(Llo0/b0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lno0/g0;->n(Llo0/b0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x()Lc0/l0;
    .locals 7

    const/16 v0, 0x12c

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-static {v0, v1, v2, v3}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v4

    new-instance v5, Ln72/b;

    const/16 v6, 0x12

    invoke-direct {v5, v6}, Ln72/b;-><init>(I)V

    invoke-static {v4, v5}, Lc0/w0;->m(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/d1;

    move-result-object v4

    invoke-static {v0, v1, v2, v3}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    new-instance v1, Ln72/b;

    const/16 v2, 0x13

    invoke-direct {v1, v2}, Ln72/b;-><init>(I)V

    invoke-static {v0, v1}, Lc0/w0;->q(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/f1;

    move-result-object v0

    invoke-static {v4, v0}, Landroidx/compose/animation/a;->c(Lc0/d1;Lc0/f1;)Lc0/l0;

    move-result-object v0

    return-object v0
.end method

.method private static final y(I)I
    .locals 0

    neg-int p0, p0

    return p0
.end method

.method private static final z(I)I
    .locals 0

    return p0
.end method

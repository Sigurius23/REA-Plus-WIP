.class public abstract Lc31/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u0006\u00b2\u0006\u000c\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "d",
        "(Landroidx/compose/runtime/Composer;I)V",
        "f",
        "",
        "rotation",
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
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lc31/b;->i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(FFFLi2/d1;Lk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lc31/b;->h(FFFLi2/t;Lk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lc31/b;->e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/runtime/Composer;I)V
    .locals 12

    move-object v9, p0

    check-cast v9, Lp1/q;

    const p0, -0x56fff408

    invoke-virtual {v9, p0}, Lp1/q;->g0(I)Lp1/q;

    const/4 p0, 0x1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    move v1, p0

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    and-int/lit8 v2, p1, 0x1

    invoke-virtual {v9, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, Lc31/l;->b()F

    move-result v1

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Lb2/e;->E:Lb2/m;

    invoke-static {v3, v0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v4, v9, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v9, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v9, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v9, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v9, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v9, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, v9, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v9, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {}, Lc31/l;->b()F

    move-result v1

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {}, Lc31/l;->c()F

    move-result v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    const/4 v5, 0x6

    invoke-virtual {v4, v9, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->W0()J

    move-result-wide v4

    invoke-static {v3, v4, v5}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v3

    sget-object v4, Lt0/j;->a:Lt0/i;

    iget v5, v3, Lf0/t;->a:F

    iget-object v3, v3, Lf0/t;->b:Li2/t;

    invoke-static {v5, v1, v3, v4}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1, v9, v0}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v9, v0}, Lc31/b;->f(Landroidx/compose/runtime/Composer;I)V

    const-wide/high16 v0, 0x401a000000000000L    # 6.5

    double-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v3, v1

    invoke-static {v2, v3, v0}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v1, Lgy0/e;->e:I

    invoke-static {v1}, Lv41/r0$d;->b(I)I

    move-result v1

    invoke-static {v1}, Lv41/r0$d;->a(I)Lv41/r0$d;

    move-result-object v1

    const/high16 v10, 0xc00000

    const/16 v11, 0x17c

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    sget-object v7, Ly2/j;->b:Ly2/b1;

    const/4 v8, 0x0

    invoke-static/range {v0 .. v11}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, p0}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_5

    new-instance v0, Lbz0/c;

    const/4 v1, 0x3

    invoke-direct {v0, p1, v1}, Lbz0/c;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lc31/b;->d(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Landroidx/compose/runtime/Composer;I)V
    .locals 13

    move-object v5, p0

    check-cast v5, Lp1/q;

    const p0, -0x68b79c0f

    invoke-virtual {v5, p0}, Lp1/q;->g0(I)Lp1/q;

    const/4 p0, 0x0

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, p0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {v5, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v5, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly3/c;

    invoke-static {}, Lc31/l;->c()F

    move-result v2

    invoke-interface {v1, v2}, Ly3/c;->q0(F)F

    move-result v8

    invoke-virtual {v5, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/c;

    invoke-static {}, Lc31/l;->a()F

    move-result v1

    invoke-interface {v0, v1}, Ly3/c;->q0(F)F

    move-result v0

    const/4 v1, 0x2

    int-to-float v2, v1

    mul-float/2addr v0, v2

    sub-float v9, v0, v8

    const/high16 v0, 0x40000000    # 2.0f

    div-float v10, v8, v0

    sget-object v0, Li2/t;->b:Li2/s;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    sget-wide v3, Li2/x;->m:J

    new-instance v6, Li2/x;

    invoke-direct {v6, v3, v4}, Li2/x;-><init>(J)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    sget-object v4, Lx81/d;->a:Lx81/d;

    const/4 v6, 0x6

    invoke-virtual {v4, v5, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->W0()J

    move-result-wide v11

    new-instance v7, Li2/x;

    invoke-direct {v7, v11, v12}, Li2/x;-><init>(J)V

    new-instance v11, Ll83/k;

    invoke-direct {v11, v2, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v4, v5, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v6

    new-instance v4, Li2/x;

    invoke-direct {v4, v6, v7}, Li2/x;-><init>(J)V

    new-instance v6, Ll83/k;

    invoke-direct {v6, v2, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v11, v6}, [Ll83/k;

    move-result-object v2

    invoke-static {v0, v2}, Li2/s;->j(Li2/s;[Ll83/k;)Li2/d1;

    move-result-object v11

    const-string v0, "animateCircleInfiniteTransition"

    invoke-static {v0, v5, p0}, Ld0/f;->s(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ld0/l0;

    move-result-object v0

    const/16 v2, 0x5dc

    sget-object v3, Ld0/b0;->c:Lb23/h;

    invoke-static {v2, p0, v3, v1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v1

    sget-object v2, Ld0/v0;->w:Ld0/v0;

    const/4 v3, 0x4

    invoke-static {v1, v2, v3}, Ld0/f;->q(Ld0/y;Ld0/v0;I)Ld0/i0;

    move-result-object v3

    const/16 v6, 0x71b8

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const-string v4, "animateRotation"

    invoke-static/range {v0 .. v7}, Ld0/f;->g(Ld0/l0;FFLd0/i0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/j0;

    move-result-object v0

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {}, Lc31/l;->b()F

    move-result v2

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v0}, Lc31/b;->g(Lp1/t2;)F

    move-result v0

    const/16 v2, 0x168

    int-to-float v2, v2

    mul-float/2addr v0, v2

    invoke-static {v0, v1}, Landroidx/room/c1;->L(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v5, v9}, Lp1/q;->d(F)Z

    move-result v1

    invoke-virtual {v5, v8}, Lp1/q;->d(F)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v5, v10}, Lp1/q;->d(F)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v5, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_2

    :cond_1
    new-instance v6, Lc31/a;

    move v7, v9

    move v9, v10

    move-object v10, v11

    const/4 v11, 0x0

    invoke-direct/range {v6 .. v11}, Lc31/a;-><init>(FFFLjava/lang/Object;I)V

    invoke-virtual {v5, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v6

    :cond_2
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2, v5, p0}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_3
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_4

    new-instance v0, Lbz0/c;

    const/4 v1, 0x4

    invoke-direct {v0, p1, v1}, Lbz0/c;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method private static final g(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final h(FFFLi2/t;Lk2/e;)Ll83/a0;
    .locals 17

    const-string v0, "$this$Canvas"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p0 .. p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v2, v0

    invoke-static/range {p0 .. p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v4, v0

    const/16 v0, 0x20

    shl-long/2addr v2, v0

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    or-long v8, v2, v4

    new-instance v10, Lk2/i;

    const/4 v15, 0x0

    const/16 v16, 0x1a

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    move/from16 v11, p1

    invoke-direct/range {v10 .. v16}, Lk2/i;-><init>(FFIILi2/t0;I)V

    invoke-static/range {p2 .. p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static/range {p2 .. p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    shl-long/2addr v2, v0

    and-long/2addr v4, v6

    or-long v6, v2, v4

    const/4 v11, 0x0

    const/16 v12, 0x340

    const/high16 v3, 0x43870000    # 270.0f

    const/high16 v4, 0x43b40000    # 360.0f

    const/4 v5, 0x0

    move-object/from16 v2, p3

    invoke-static/range {v1 .. v12}, Lk2/e;->X(Lk2/e;Li2/t;FFZJJLk2/i;II)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lc31/b;->f(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

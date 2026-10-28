.class public abstract Lmz0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmz0/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a)\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u001f\u0010\r\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lmz0/a;",
        "orientation",
        "Li2/x;",
        "color",
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/ui/Modifier;Lmz0/a;JLandroidx/compose/runtime/Composer;II)V",
        "",
        "canvasHeight",
        "canvasWidth",
        "Li2/s0;",
        "f",
        "(FF)Li2/s0;",
        "g",
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
.method public static synthetic a(Lmz0/a;ZJLk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lmz0/b;->d(Lmz0/a;ZJLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lmz0/a;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lmz0/b;->e(Landroidx/compose/ui/Modifier;Lmz0/a;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lmz0/a;JLandroidx/compose/runtime/Composer;II)V
    .locals 16

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move/from16 v5, p5

    const-string v0, "orientation"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v1, 0x518310a0

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p6, 0x1

    const/4 v6, 0x4

    if-eqz v1, :cond_0

    or-int/lit8 v7, v5, 0x6

    move v8, v7

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v5, 0x6

    if-nez v7, :cond_2

    move-object/from16 v7, p0

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    move v8, v6

    goto :goto_0

    :cond_1
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v8, v5

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    move v8, v5

    :goto_1
    and-int/lit8 v9, v5, 0x30

    const/16 v10, 0x20

    if-nez v9, :cond_4

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    invoke-virtual {v0, v9}, Lp1/q;->e(I)Z

    move-result v9

    if-eqz v9, :cond_3

    move v9, v10

    goto :goto_2

    :cond_3
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v8, v9

    :cond_4
    and-int/lit16 v9, v5, 0x180

    const/16 v11, 0x100

    if-nez v9, :cond_6

    invoke-virtual {v0, v3, v4}, Lp1/q;->f(J)Z

    move-result v9

    if-eqz v9, :cond_5

    move v9, v11

    goto :goto_3

    :cond_5
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v8, v9

    :cond_6
    and-int/lit16 v9, v8, 0x93

    const/16 v12, 0x92

    const/4 v13, 0x0

    if-eq v9, v12, :cond_7

    const/4 v9, 0x1

    goto :goto_4

    :cond_7
    move v9, v13

    :goto_4
    and-int/lit8 v12, v8, 0x1

    invoke-virtual {v0, v12, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_11

    sget-object v9, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_8

    move-object v7, v9

    :cond_8
    const-wide v14, 0x4037c00000000000L    # 23.75

    double-to-float v1, v14

    int-to-float v6, v6

    mul-float/2addr v1, v6

    invoke-static {v1, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-wide/high16 v14, 0x401f000000000000L    # 7.75

    double-to-float v12, v14

    mul-float/2addr v12, v6

    invoke-static {v12, v1}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-interface {v1, v7}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v14, v0, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v0, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-eqz v13, :cond_9

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_9
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_5
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v0, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v0, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-nez v13, :cond_a

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_b

    :cond_a
    invoke-static {v12, v0, v12, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v0, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    sget-object v6, Ly3/m;->x:Ly3/m;

    if-ne v1, v6, :cond_c

    const/4 v1, 0x1

    goto :goto_6

    :cond_c
    const/4 v1, 0x0

    :goto_6
    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v9}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    and-int/lit8 v9, v8, 0x70

    if-ne v9, v10, :cond_d

    const/4 v9, 0x1

    goto :goto_7

    :cond_d
    const/4 v9, 0x0

    :goto_7
    invoke-virtual {v0, v1}, Lp1/q;->h(Z)Z

    move-result v10

    or-int/2addr v9, v10

    and-int/lit16 v8, v8, 0x380

    if-ne v8, v11, :cond_e

    const/4 v13, 0x1

    goto :goto_8

    :cond_e
    const/4 v13, 0x0

    :goto_8
    or-int v8, v9, v13

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_f

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v9, v8, :cond_10

    :cond_f
    new-instance v9, Lf1/e;

    invoke-direct {v9, v2, v1, v3, v4}, Lf1/e;-><init>(Lmz0/a;ZJ)V

    invoke-virtual {v0, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x6

    invoke-static {v6, v9, v0, v1}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    :goto_9
    move-object v1, v7

    goto :goto_a

    :cond_11
    invoke-virtual {v0}, Lp1/q;->X()V

    goto :goto_9

    :goto_a
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_12

    new-instance v0, Lbr2/g;

    const/4 v7, 0x2

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lbr2/g;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Enum;JIII)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final d(Lmz0/a;ZJLk2/e;)Ll83/a0;
    .locals 10

    const-string v1, "$this$Canvas"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p4}, Lk2/e;->d()J

    move-result-wide v1

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-interface {p4}, Lk2/e;->d()J

    move-result-wide v2

    const/16 v4, 0x20

    shr-long/2addr v2, v4

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    sget-object v3, Lmz0/b$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v3, p0

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eq p0, v3, :cond_2

    if-ne p0, v4, :cond_1

    if-eqz p1, :cond_0

    invoke-static {v1, v2}, Lmz0/b;->f(FF)Li2/s0;

    move-result-object p0

    :goto_0
    move-object v1, p0

    goto :goto_1

    :cond_0
    invoke-static {v1, v2}, Lmz0/b;->g(FF)Li2/s0;

    move-result-object p0

    goto :goto_0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    if-eqz p1, :cond_3

    invoke-static {v1, v2}, Lmz0/b;->g(FF)Li2/s0;

    move-result-object p0

    goto :goto_0

    :cond_3
    invoke-static {v1, v2}, Lmz0/b;->f(FF)Li2/s0;

    move-result-object p0

    goto :goto_0

    :goto_1
    new-array p0, v4, [F

    fill-array-data p0, :array_0

    new-instance p1, Landroid/graphics/DashPathEffect;

    const/4 v2, 0x0

    invoke-direct {p1, p0, v2}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    const/16 p0, 0x8

    int-to-float p0, p0

    invoke-interface {p4, p0}, Ly3/c;->q0(F)F

    move-result p0

    new-instance v2, Landroid/graphics/CornerPathEffect;

    invoke-direct {v2, p0}, Landroid/graphics/CornerPathEffect;-><init>(F)V

    new-instance v3, Lk2/i;

    new-instance v8, Li2/k;

    new-instance p0, Landroid/graphics/ComposePathEffect;

    invoke-direct {p0, p1, v2}, Landroid/graphics/ComposePathEffect;-><init>(Landroid/graphics/PathEffect;Landroid/graphics/PathEffect;)V

    invoke-direct {v8, p0}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    const/16 v9, 0xe

    const/high16 v4, 0x40000000    # 2.0f

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lk2/i;-><init>(FFIILi2/t0;I)V

    const/16 v6, 0x34

    const/4 v4, 0x0

    move-object v0, p4

    move-object v5, v3

    move-wide v2, p2

    invoke-static/range {v0 .. v6}, Lk2/e;->z(Lk2/e;Li2/s0;JFLk2/f;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :array_0
    .array-data 4
        0x41000000    # 8.0f
        0x40800000    # 4.0f
    .end array-data
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Lmz0/a;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lmz0/b;->c(Landroidx/compose/ui/Modifier;Lmz0/a;JLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(FF)Li2/s0;
    .locals 2

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p0}, Li2/j;->i(FF)V

    invoke-virtual {v0, v1, v1}, Li2/j;->h(FF)V

    invoke-virtual {v0, p1, v1}, Li2/j;->h(FF)V

    return-object v0
.end method

.method private static final g(FF)Li2/s0;
    .locals 2

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Li2/j;->i(FF)V

    invoke-virtual {v0, p1, v1}, Li2/j;->h(FF)V

    invoke-virtual {v0, p1, p0}, Li2/j;->h(FF)V

    return-object v0
.end method

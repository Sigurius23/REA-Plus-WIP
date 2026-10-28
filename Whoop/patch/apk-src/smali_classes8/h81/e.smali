.class public abstract Lh81/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lh81/g;",
        "viewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Lh81/g;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lh81/e;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lh81/g;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lh81/e;->g(Lh81/g;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lh81/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lh81/e;->f(Lh81/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lh81/g;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh81/g;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v0, 0x58548087

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v14, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :goto_3
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v7, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v14, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v0, v8

    :goto_5
    and-int/lit16 v8, v0, 0x93

    const/16 v9, 0x92

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v8, v9, :cond_8

    move v8, v11

    goto :goto_6

    :cond_8
    move v8, v10

    :goto_6
    and-int/2addr v0, v11

    invoke-virtual {v14, v0, v8}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_10

    if-eqz v3, :cond_9

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_7

    :cond_9
    move-object v0, v5

    :goto_7
    if-eqz v6, :cond_b

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v3, v5, :cond_a

    new-instance v3, Lh00/l0;

    const/16 v5, 0x1a

    invoke-direct {v3, v5}, Lh00/l0;-><init>(I)V

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_b
    move-object v3, v7

    :goto_8
    invoke-virtual {v1}, Lh81/g;->b()Lh81/f;

    move-result-object v5

    sget-object v6, Lh81/f;->OUTLINED:Lh81/f;

    if-ne v5, v6, :cond_c

    move v5, v11

    goto :goto_9

    :cond_c
    move v5, v10

    :goto_9
    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v7, 0x3

    int-to-float v7, v7

    int-to-float v2, v2

    mul-float/2addr v7, v2

    invoke-static {v7}, Lt0/j;->e(F)Lt0/i;

    move-result-object v9

    const/4 v2, 0x0

    if-eqz v5, :cond_d

    move-object v7, v2

    goto :goto_a

    :cond_d
    sget-object v7, Lrz0/f;->AMERICA_250_REWARDS:Lrz0/f;

    :goto_a
    const/4 v8, 0x6

    if-eqz v5, :cond_e

    const v12, -0x6ac93d6e

    invoke-virtual {v14, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v10}, Lp1/q;->q(Z)V

    sget-wide v12, Li2/x;->m:J

    goto :goto_b

    :cond_e
    const v12, -0x6ac93912

    invoke-virtual {v14, v12}, Lp1/q;->e0(I)V

    sget-object v12, Lx81/d;->a:Lx81/d;

    invoke-static {v12, v14, v8, v10}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v12

    :goto_b
    if-eqz v5, :cond_f

    const v2, -0x6ac9339c

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    int-to-float v2, v11

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-virtual {v5, v14, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->X0()J

    move-result-wide v4

    invoke-static {v2, v4, v5}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v2

    :goto_c
    invoke-virtual {v14, v10}, Lp1/q;->q(Z)V

    move-object v10, v2

    goto :goto_d

    :cond_f
    const v4, 0x11a3bcd6

    invoke-virtual {v14, v4}, Lp1/q;->e0(I)V

    goto :goto_c

    :goto_d
    new-instance v2, Lf01/f;

    const/16 v4, 0x18

    invoke-direct {v2, v4, v1, v3}, Lf01/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v4, 0x12ff9417

    invoke-static {v4, v14, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    const/high16 v15, 0xc00000

    const/16 v16, 0x60

    const/4 v11, 0x0

    move-object v5, v6

    move-object v6, v7

    move-wide v7, v12

    const/4 v12, 0x0

    move-object v13, v2

    invoke-static/range {v5 .. v16}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v0

    goto :goto_e

    :cond_10
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v2, v5

    move-object v3, v7

    :goto_e
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_11

    new-instance v0, Lf02/c;

    const/16 v6, 0x1b

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lf02/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final e(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lh81/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 32

    sget-object v0, Lb2/e;->M:Lb2/k;

    and-int/lit8 v1, p3, 0x3

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-eq v1, v4, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    and-int/lit8 v5, p3, 0x1

    move-object/from16 v10, p2

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v5, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_c

    int-to-float v1, v4

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v1, v4

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    const/4 v7, 0x6

    invoke-static {v1, v0, v10, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-eqz v11, :cond_1

    invoke-virtual {v10, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_1
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v10, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v10, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-nez v8, :cond_2

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    :cond_2
    invoke-static {v7, v10, v7, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v10, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lh81/g;->c()Lsz0/c0;

    move-result-object v1

    invoke-virtual {v1}, Lsz0/c0;->m()Ljava/lang/String;

    move-result-object v6

    sget-object v1, Lb91/c;->Companion:Lb91/c$a;

    invoke-virtual/range {p0 .. p0}, Lh81/g;->c()Lsz0/c0;

    move-result-object v7

    invoke-virtual {v7}, Lsz0/c0;->l()Lb91/c;

    move-result-object v7

    invoke-virtual {v1, v7}, Lb91/c$a;->a(Lb91/c;)Lb91/a;

    move-result-object v26

    invoke-virtual/range {p0 .. p0}, Lh81/g;->c()Lsz0/c0;

    move-result-object v1

    invoke-virtual {v1}, Lsz0/c0;->e()Ly81/f;

    move-result-object v1

    invoke-virtual {v1, v10, v3}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v8

    const/16 v30, 0x0

    const v31, 0x2fffa

    const/4 v7, 0x0

    move-object/from16 v28, v10

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

    const/16 v29, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v28

    invoke-virtual/range {p0 .. p0}, Lh81/g;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Lh81/c;

    if-eqz v7, :cond_4

    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    sget-object v1, Ll0/m;->c:Ll0/g;

    invoke-static {v1, v0, v10, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_6

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_6
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_3
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v10, v8, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v10, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v6, v10, Lp1/q;->S:Z

    if-nez v6, :cond_7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    :cond_7
    invoke-static {v1, v10, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v10, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x783a5d67

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v1, v3

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v19, v1, 0x1

    if-ltz v1, :cond_a

    check-cast v6, Lh81/c;

    const/4 v11, 0x0

    const/4 v12, 0x6

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v9, p1

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v13}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v6

    if-ge v1, v6, :cond_9

    const v1, -0x60dc95e4

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    double-to-float v1, v6

    mul-float/2addr v1, v4

    const/4 v6, 0x0

    invoke-static {v5, v6, v1, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lhy0/g;->SOLID:Lhy0/g;

    const/16 v17, 0x36

    const/16 v18, 0xfc

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v28, v10

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    move-object v1, v13

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v28

    invoke-static/range {v6 .. v18}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v10, v16

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_9
    move-object v1, v13

    const v6, -0x60d9367e

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    :goto_5
    move-object v13, v1

    move/from16 v1, v19

    goto :goto_4

    :cond_a
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_b
    invoke-static {v10, v3, v2, v2}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_6

    :cond_c
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Lh81/g;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lh81/e;->d(Lh81/g;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

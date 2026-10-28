.class public abstract Ls81/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls81/g$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a?\u0010\u0010\u001a\u00020\u0006*\u00020\n2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ls81/h;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "i",
        "(Landroidx/compose/ui/Modifier;Ls81/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Ll0/s1;",
        "Ls81/d;",
        "rowItem",
        "",
        "weighted",
        "stretch",
        "f",
        "(Ll0/s1;Ls81/d;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Ll0/s1;Ls81/d;ZZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Ls81/g;->h(Ll0/s1;Ls81/d;ZZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ls81/g;->g(Landroidx/compose/ui/Modifier;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Ls81/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ls81/g;->k(Landroidx/compose/ui/Modifier;Ls81/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Ls81/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ls81/g;->l(Landroidx/compose/ui/Modifier;Ls81/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ls81/g;->j(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Ll0/s1;Ls81/d;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll0/s1;",
            "Ls81/d;",
            "ZZ",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v6, p6

    move-object/from16 v11, p5

    check-cast v11, Lp1/q;

    const v0, -0x4fe6a52c

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v5, v6, 0x30

    if-nez v5, :cond_4

    and-int/lit8 v5, v6, 0x40

    if-nez v5, :cond_2

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_2

    :cond_2
    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_2
    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v0, v5

    :cond_4
    and-int/lit16 v5, v6, 0x180

    if-nez v5, :cond_6

    invoke-virtual {v11, v3}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x100

    goto :goto_4

    :cond_5
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v0, v5

    :cond_6
    and-int/lit16 v5, v6, 0xc00

    if-nez v5, :cond_8

    invoke-virtual {v11, v4}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_7

    const/16 v5, 0x800

    goto :goto_5

    :cond_7
    const/16 v5, 0x400

    :goto_5
    or-int/2addr v0, v5

    :cond_8
    and-int/lit16 v5, v6, 0x6000

    move-object/from16 v10, p4

    if-nez v5, :cond_a

    invoke-virtual {v11, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    const/16 v5, 0x4000

    goto :goto_6

    :cond_9
    const/16 v5, 0x2000

    :goto_6
    or-int/2addr v0, v5

    :cond_a
    and-int/lit16 v5, v0, 0x2493

    const/16 v7, 0x2492

    const/4 v8, 0x0

    const/4 v14, 0x1

    if-eq v5, v7, :cond_b

    move v5, v14

    goto :goto_7

    :cond_b
    move v5, v8

    :goto_7
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v11, v7, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-virtual {v2}, Ls81/d;->b()Ls81/e;

    move-result-object v5

    sget-object v7, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_c

    instance-of v9, v5, Ls81/e$a;

    if-eqz v9, :cond_c

    check-cast v5, Ls81/e$a;

    invoke-virtual {v5}, Ls81/e$a;->a()F

    move-result v5

    invoke-interface {v1, v7, v14, v5}, Ll0/s1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    goto :goto_8

    :cond_c
    move-object v5, v7

    :goto_8
    if-eqz v4, :cond_d

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v7}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    :cond_d
    invoke-interface {v5, v7}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v9, Lb2/e;->z:Lb2/m;

    invoke-static {v9, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v11, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_e

    invoke-virtual {v11, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_e
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_9
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v11, v13, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v11, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-nez v12, :cond_f

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_10

    :cond_f
    invoke-static {v9, v11, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v11, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Ls81/d;->a()Lm91/u;

    move-result-object v5

    new-instance v9, Law0/a;

    const/16 v8, 0xa

    invoke-direct {v9, v8, v7}, Law0/a;-><init>(ILandroidx/compose/ui/Modifier;)V

    shr-int/lit8 v0, v0, 0x3

    and-int/lit16 v12, v0, 0x1c00

    const/4 v13, 0x2

    const/4 v8, 0x0

    move-object v7, v5

    invoke-static/range {v7 .. v13}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_11
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_12

    new-instance v0, Ld30/k0;

    const/4 v7, 0x4

    move-object/from16 v5, p4

    invoke-direct/range {v0 .. v7}, Ld30/k0;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZZLkotlin/jvm/functions/Function1;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p3, "it"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const p1, 0x6b1fc96a

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final h(Ll0/s1;Ls81/d;ZZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p6

    invoke-static/range {v0 .. v6}, Ls81/g;->f(Ll0/s1;Ls81/d;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i(Landroidx/compose/ui/Modifier;Ls81/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ls81/h;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p3

    check-cast v6, Lp1/q;

    const v0, 0x4a50befd    # 3420095.2f

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v1, 0x4

    const/4 v2, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v3, v4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v4, 0x6

    if-nez v3, :cond_2

    invoke-virtual {v6, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move v3, v1

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_0
    or-int/2addr v3, v4

    goto :goto_1

    :cond_2
    move v3, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_4
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    :goto_3
    move v8, v3

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v6, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v3, v8

    goto :goto_3

    :goto_5
    and-int/lit16 v3, v8, 0x93

    const/16 v9, 0x92

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v3, v9, :cond_8

    move v3, v11

    goto :goto_6

    :cond_8
    move v3, v10

    :goto_6
    and-int/lit8 v9, v8, 0x1

    invoke-virtual {v6, v9, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_1b

    sget-object v3, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object p0, v3

    :cond_9
    if-eqz v5, :cond_b

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v0, v5, :cond_a

    new-instance v0, Ls32/d;

    const/16 v5, 0xc

    invoke-direct {v0, v5}, Ls32/d;-><init>(I)V

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v0, Lkotlin/jvm/functions/Function1;

    move-object v5, v0

    goto :goto_7

    :cond_b
    move-object v5, p2

    :goto_7
    invoke-virtual {p1}, Ls81/h;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1c

    new-instance v0, Ls81/f;

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, v5

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ls81/f;-><init>(Landroidx/compose/ui/Modifier;Ls81/h;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_c
    invoke-virtual {p1}, Ls81/h;->a()Ls81/b;

    move-result-object v0

    sget-object v4, Ls81/b;->STRETCH:Ls81/b;

    if-ne v0, v4, :cond_d

    move v4, v11

    goto :goto_8

    :cond_d
    move v4, v10

    :goto_8
    invoke-virtual {p1}, Ls81/h;->b()Ls81/a;

    move-result-object v0

    sget-object v7, Ls81/a;->FILL:Ls81/a;

    if-ne v0, v7, :cond_e

    move v0, v11

    goto :goto_9

    :cond_e
    move v0, v10

    :goto_9
    invoke-virtual {p1}, Ls81/h;->f()Ls81/a;

    move-result-object v7

    sget-object v9, Ls81/g$a;->a:[I

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v7, v9, v7

    const/high16 v9, 0x3f800000    # 1.0f

    if-eq v7, v11, :cond_10

    if-ne v7, v2, :cond_f

    invoke-virtual {p1}, Ls81/h;->e()Lb2/f;

    move-result-object v7

    invoke-static {v3, v7, v2}, Landroidx/compose/foundation/layout/d;->z(Landroidx/compose/ui/Modifier;Lb2/f;I)Landroidx/compose/ui/Modifier;

    move-result-object v7

    goto :goto_a

    :cond_f
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_10
    invoke-static {v9, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    :goto_a
    invoke-interface {p0, v7}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    if-eqz v0, :cond_11

    invoke-static {v9, v3}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    goto :goto_b

    :cond_11
    move-object v0, v3

    :goto_b
    invoke-interface {v7, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    if-eqz v4, :cond_12

    sget-object v7, Ll0/a1;->x:Ll0/a1;

    invoke-static {v3, v7}, Landroidx/compose/foundation/layout/a;->j(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    :cond_12
    invoke-interface {v0, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {p1}, Ls81/h;->g()Ll0/k1;

    move-result-object v3

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v3, Ll0/m;->a:Ll0/e;

    invoke-virtual {p1}, Ls81/h;->h()F

    move-result v3

    invoke-virtual {p1}, Ls81/h;->e()Lb2/f;

    move-result-object v7

    invoke-static {v3, v7}, Ll0/m;->j(FLb2/f;)Ll0/k;

    move-result-object v3

    invoke-virtual {p1}, Ls81/h;->a()Ls81/b;

    move-result-object v7

    sget-object v9, Ls81/g$a;->b:[I

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v7, v9, v7

    if-eq v7, v11, :cond_15

    if-eq v7, v2, :cond_15

    const/4 v2, 0x3

    if-eq v7, v2, :cond_14

    if-ne v7, v1, :cond_13

    sget-object v1, Lb2/e;->L:Lb2/l;

    goto :goto_c

    :cond_13
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_14
    sget-object v1, Lb2/e;->K:Lb2/l;

    goto :goto_c

    :cond_15
    sget-object v1, Lb2/e;->J:Lb2/l;

    :goto_c
    invoke-static {v3, v1, v6, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v2, v6, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v6, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v9, v6, Lp1/q;->S:Z

    if-eqz v9, :cond_16

    invoke-virtual {v6, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_16
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_d
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v6, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v6, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v6, Lp1/q;->S:Z

    if-nez v3, :cond_17

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_18

    :cond_17
    invoke-static {v2, v6, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v6, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x102738d7

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    invoke-virtual {p1}, Ls81/h;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ls81/d;

    invoke-virtual {p1}, Ls81/h;->f()Ls81/a;

    move-result-object v1

    sget-object v3, Ls81/a;->FILL:Ls81/a;

    if-ne v1, v3, :cond_19

    move v3, v11

    goto :goto_f

    :cond_19
    move v3, v10

    :goto_f
    const v1, 0xe000

    const/4 v7, 0x6

    shl-int/lit8 v9, v8, 0x6

    and-int/2addr v1, v9

    or-int/2addr v7, v1

    sget-object v1, Ll0/t1;->a:Ll0/t1;

    invoke-static/range {v1 .. v7}, Ls81/g;->f(Ll0/s1;Ls81/d;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_e

    :cond_1a
    invoke-virtual {v6, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v11}, Lp1/q;->q(Z)V

    move-object v3, v5

    :goto_10
    move-object v1, p0

    goto :goto_11

    :cond_1b
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v3, p2

    goto :goto_10

    :goto_11
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_1c

    new-instance v0, Ls81/f;

    const/4 v6, 0x1

    move-object v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ls81/f;-><init>(Landroidx/compose/ui/Modifier;Ls81/h;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method private static final j(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Landroidx/compose/ui/Modifier;Ls81/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Ls81/g;->i(Landroidx/compose/ui/Modifier;Ls81/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Landroidx/compose/ui/Modifier;Ls81/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Ls81/g;->i(Landroidx/compose/ui/Modifier;Ls81/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

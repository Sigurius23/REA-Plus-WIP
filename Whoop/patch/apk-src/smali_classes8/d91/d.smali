.class public abstract Ld91/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aC\u0010\n\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "",
        "switchAt",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ld91/c;",
        "initial",
        "whenConditionMet",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "content",
        "b",
        "(FLandroidx/compose/ui/Modifier;Ld91/c;Ld91/c;Lc93/m;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(FLandroidx/compose/ui/Modifier;Ld91/c;Ld91/c;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Ld91/d;->c(FLandroidx/compose/ui/Modifier;Ld91/c;Ld91/c;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(FLandroidx/compose/ui/Modifier;Ld91/c;Ld91/c;Lc93/m;Landroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Landroidx/compose/ui/Modifier;",
            "Ld91/c;",
            "Ld91/c;",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v2, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    const-string v3, "content"

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p5

    check-cast v3, Lp1/q;

    const v4, 0x14c8b474

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v6, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v3, v1}, Lp1/q;->d(F)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v6

    goto :goto_1

    :cond_1
    move v4, v6

    :goto_1
    and-int/lit8 v7, p7, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v4, v4, 0x30

    :cond_2
    move-object/from16 v8, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v6, 0x30

    if-nez v8, :cond_2

    move-object/from16 v8, p1

    invoke-virtual {v3, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_4
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v4, v9

    :goto_3
    and-int/lit16 v9, v6, 0x180

    if-nez v9, :cond_7

    and-int/lit8 v9, p7, 0x4

    if-nez v9, :cond_6

    and-int/lit16 v9, v6, 0x200

    if-nez v9, :cond_5

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_4

    :cond_5
    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_4
    if-eqz v9, :cond_6

    const/16 v9, 0x100

    goto :goto_5

    :cond_6
    const/16 v9, 0x80

    :goto_5
    or-int/2addr v4, v9

    :cond_7
    and-int/lit16 v9, v6, 0xc00

    if-nez v9, :cond_a

    and-int/lit8 v9, p7, 0x8

    if-nez v9, :cond_9

    and-int/lit16 v9, v6, 0x1000

    if-nez v9, :cond_8

    invoke-virtual {v3, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_6

    :cond_8
    invoke-virtual {v3, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_6
    if-eqz v9, :cond_9

    const/16 v9, 0x800

    goto :goto_7

    :cond_9
    const/16 v9, 0x400

    :goto_7
    or-int/2addr v4, v9

    :cond_a
    and-int/lit16 v9, v6, 0x6000

    if-nez v9, :cond_c

    invoke-virtual {v3, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    const/16 v9, 0x4000

    goto :goto_8

    :cond_b
    const/16 v9, 0x2000

    :goto_8
    or-int/2addr v4, v9

    :cond_c
    and-int/lit16 v9, v4, 0x2493

    const/16 v10, 0x2492

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eq v9, v10, :cond_d

    move v9, v11

    goto :goto_9

    :cond_d
    move v9, v12

    :goto_9
    and-int/lit8 v10, v4, 0x1

    invoke-virtual {v3, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_1f

    invoke-virtual {v3}, Lp1/q;->Z()V

    and-int/lit8 v9, v6, 0x1

    if-eqz v9, :cond_10

    invoke-virtual {v3}, Lp1/q;->C()Z

    move-result v9

    if-eqz v9, :cond_e

    goto :goto_b

    :cond_e
    invoke-virtual {v3}, Lp1/q;->X()V

    and-int/lit8 v7, p7, 0x4

    if-eqz v7, :cond_f

    and-int/lit16 v4, v4, -0x381

    :cond_f
    and-int/lit8 v7, p7, 0x8

    if-eqz v7, :cond_13

    :goto_a
    and-int/lit16 v4, v4, -0x1c01

    goto :goto_c

    :cond_10
    :goto_b
    if-eqz v7, :cond_11

    sget-object v7, Lb2/t;->w:Lb2/t;

    move-object v8, v7

    :cond_11
    and-int/lit8 v7, p7, 0x4

    const/4 v9, 0x3

    const/4 v10, 0x0

    if-eqz v7, :cond_12

    new-instance v0, Ld91/c$a;

    invoke-direct {v0, v10, v10, v9, v10}, Ld91/c$a;-><init>(Lb2/g;Ly3/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v4, v4, -0x381

    :cond_12
    and-int/lit8 v7, p7, 0x8

    if-eqz v7, :cond_13

    new-instance v2, Ld91/c$b;

    invoke-direct {v2, v10, v10, v9, v10}, Ld91/c$b;-><init>(Lb2/f;Ly3/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_a

    :cond_13
    :goto_c
    invoke-virtual {v3}, Lp1/q;->r()V

    sget-object v7, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v3, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly3/c;

    invoke-interface {v7}, Ly3/c;->m0()F

    move-result v7

    cmpl-float v7, v7, v1

    if-ltz v7, :cond_14

    move-object v7, v2

    goto :goto_d

    :cond_14
    move-object v7, v0

    :goto_d
    instance-of v9, v7, Ld91/c$a;

    if-eqz v9, :cond_19

    const v9, 0x56d988b

    invoke-virtual {v3, v9}, Lp1/q;->e0(I)V

    check-cast v7, Ld91/c$a;

    invoke-virtual {v7}, Ld91/c$a;->b()Ly3/f;

    move-result-object v9

    if-eqz v9, :cond_15

    iget v9, v9, Ly3/f;->w:F

    invoke-static {v9}, Ll0/m;->i(F)Ll0/k;

    move-result-object v9

    goto :goto_e

    :cond_15
    sget-object v9, Ll0/m;->a:Ll0/e;

    :goto_e
    invoke-virtual {v7}, Ld91/c$a;->a()Lb2/g;

    move-result-object v7

    invoke-static {v9, v7, v3, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v9, v3, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v3, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v15, v3, Lp1/q;->S:Z

    if-eqz v15, :cond_16

    invoke-virtual {v3, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_16
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_f
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v3, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v3, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v3, Lp1/q;->S:Z

    if-nez v10, :cond_17

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v10, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_18

    :cond_17
    invoke-static {v9, v3, v9, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v3, v7, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v4, v4, 0xc

    and-int/lit8 v4, v4, 0xe

    invoke-static {v4, v5, v3, v11, v12}, Ldc/b;->A(ILc93/m;Lp1/q;ZZ)V

    goto :goto_12

    :cond_19
    instance-of v9, v7, Ld91/c$b;

    if-eqz v9, :cond_1e

    const v9, 0x56db82c

    invoke-virtual {v3, v9}, Lp1/q;->e0(I)V

    check-cast v7, Ld91/c$b;

    invoke-virtual {v7}, Ld91/c$b;->b()Ly3/f;

    move-result-object v9

    if-eqz v9, :cond_1a

    iget v9, v9, Ly3/f;->w:F

    invoke-static {v9}, Ll0/m;->i(F)Ll0/k;

    move-result-object v9

    goto :goto_10

    :cond_1a
    sget-object v9, Ll0/m;->c:Ll0/g;

    :goto_10
    invoke-virtual {v7}, Ld91/c$b;->a()Lb2/f;

    move-result-object v7

    invoke-static {v9, v7, v3, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v9, v3, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v3, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v15, v3, Lp1/q;->S:Z

    if-eqz v15, :cond_1b

    invoke-virtual {v3, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_1b
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_11
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v3, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v3, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v3, Lp1/q;->S:Z

    if-nez v10, :cond_1c

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v10, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1d

    :cond_1c
    invoke-static {v9, v3, v9, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v3, v7, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v4, v4, 0xc

    and-int/lit8 v4, v4, 0xe

    invoke-static {v4, v5, v3, v11, v12}, Ldc/b;->A(ILc93/m;Lp1/q;ZZ)V

    :goto_12
    move-object v4, v3

    move-object v3, v0

    move-object v0, v4

    move-object v4, v2

    move-object v2, v8

    goto :goto_13

    :cond_1e
    const v0, 0x56d9324

    invoke-static {v0, v3, v12}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_1f
    invoke-virtual {v3}, Lp1/q;->X()V

    goto :goto_12

    :goto_13
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_20

    new-instance v0, Lc51/b;

    const/4 v8, 0x1

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lc51/b;-><init>(FLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_20
    return-void
.end method

.method private static final c(FLandroidx/compose/ui/Modifier;Ld91/c;Ld91/c;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Ld91/d;->b(FLandroidx/compose/ui/Modifier;Ld91/c;Ld91/c;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

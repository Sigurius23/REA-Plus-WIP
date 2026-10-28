.class public abstract Lz41/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\u001aA\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0015\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lz41/g;",
        "particleSystemSettings",
        "",
        "iteration",
        "Lz41/b;",
        "updateListener",
        "",
        "scale",
        "Ll83/a0;",
        "d",
        "(Landroidx/compose/ui/Modifier;Lz41/g;ILz41/b;FLandroidx/compose/runtime/Composer;II)V",
        "",
        "startTime",
        "h",
        "(J)J",
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
.method public static synthetic a(Lp1/c1;Ly2/y;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lz41/j;->e(Lp1/c1;Ly2/y;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lz41/g;IFIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    move/from16 v8, p7

    invoke-static/range {v0 .. v8}, Lz41/j;->g(Landroidx/compose/ui/Modifier;Lz41/g;ILz41/b;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;Lk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lz41/j;->f(Lp1/c1;Lk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lz41/g;ILz41/b;FLandroidx/compose/runtime/Composer;II)V
    .locals 23

    move-object/from16 v2, p1

    move-object/from16 v0, p3

    move/from16 v7, p6

    const-string v1, "particleSystemSettings"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p5

    check-cast v8, Lp1/q;

    const v1, -0x7e82a414

    invoke-virtual {v8, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p7, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v3, v7, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v7, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v8, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v7

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v7

    :goto_1
    and-int/lit8 v5, v7, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_4
    and-int/lit8 v5, p7, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v4, v4, 0x180

    :cond_5
    move/from16 v6, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v6, v7, 0x180

    if-nez v6, :cond_5

    move/from16 v6, p2

    invoke-virtual {v8, v6}, Lp1/q;->e(I)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_3

    :cond_7
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v4, v9

    :goto_4
    and-int/lit8 v9, p7, 0x8

    const/16 v10, 0x800

    if-eqz v9, :cond_8

    or-int/lit16 v4, v4, 0xc00

    goto :goto_7

    :cond_8
    and-int/lit16 v11, v7, 0xc00

    if-nez v11, :cond_b

    and-int/lit16 v11, v7, 0x1000

    if-nez v11, :cond_9

    invoke-virtual {v8, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    goto :goto_5

    :cond_9
    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    :goto_5
    if-eqz v11, :cond_a

    move v11, v10

    goto :goto_6

    :cond_a
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v4, v11

    :cond_b
    :goto_7
    and-int/lit16 v11, v4, 0x493

    const/16 v12, 0x492

    const/4 v14, 0x1

    if-eq v11, v12, :cond_c

    move v11, v14

    goto :goto_8

    :cond_c
    const/4 v11, 0x0

    :goto_8
    and-int/lit8 v12, v4, 0x1

    invoke-virtual {v8, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_1a

    if-eqz v1, :cond_d

    sget-object v1, Lb2/t;->w:Lb2/t;

    move-object v11, v1

    goto :goto_9

    :cond_d
    move-object v11, v3

    :goto_9
    if-eqz v5, :cond_e

    const/4 v12, 0x0

    goto :goto_a

    :cond_e
    move v12, v6

    :goto_a
    if-eqz v9, :cond_f

    const/4 v0, 0x0

    :cond_f
    and-int/lit8 v1, p7, 0x10

    if-eqz v1, :cond_10

    const/high16 v1, 0x3f800000    # 1.0f

    move v9, v1

    goto :goto_b

    :cond_10
    move/from16 v9, p4

    :goto_b
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-ne v1, v15, :cond_11

    sget-object v1, Lm83/y;->w:Lm83/y;

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v8, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v1, Lp1/c1;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v15, :cond_12

    const-wide/16 v5, 0x0

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v3, Lp1/c1;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v15, :cond_13

    new-instance v16, Lb51/b;

    const/16 v21, 0xf

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v16 .. v22}, Lb51/b;-><init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v16 .. v16}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v5

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v5, Lp1/c1;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    and-int/lit16 v13, v4, 0x1c00

    if-eq v13, v10, :cond_15

    and-int/lit16 v4, v4, 0x1000

    if-eqz v4, :cond_14

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_14

    goto :goto_c

    :cond_14
    const/4 v13, 0x0

    goto :goto_d

    :cond_15
    :goto_c
    move v13, v14

    :goto_d
    or-int v4, v16, v13

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v4, :cond_16

    if-ne v10, v15, :cond_17

    :cond_16
    move-object v4, v0

    goto :goto_e

    :cond_17
    move-object v0, v10

    move-object v10, v6

    goto :goto_f

    :goto_e
    new-instance v0, Lz41/j$a;

    move-object v10, v6

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lz41/j$a;-><init>(Lp1/c1;Lz41/g;Lp1/c1;Lz41/b;Lp1/c1;Lq83/d;)V

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_f
    check-cast v0, Lc93/m;

    invoke-static {v10, v2, v0, v8}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v15, :cond_18

    new-instance v0, Lyb0/e;

    const/16 v3, 0xa

    invoke-direct {v0, v3, v5}, Lyb0/e;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v11, v0}, Landroidx/compose/ui/layout/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v15, :cond_19

    new-instance v3, Lyb0/e;

    const/16 v4, 0xb

    invoke-direct {v3, v4, v1}, Lyb0/e;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/16 v1, 0x30

    invoke-static {v0, v3, v8, v1}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move v4, v9

    move-object v1, v11

    move v3, v12

    goto :goto_10

    :cond_1a
    invoke-virtual {v8}, Lp1/q;->X()V

    move/from16 v4, p4

    move-object v1, v3

    move v3, v6

    :goto_10
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1b

    new-instance v0, Lw12/e;

    move/from16 v6, p7

    move v5, v7

    invoke-direct/range {v0 .. v6}, Lw12/e;-><init>(Landroidx/compose/ui/Modifier;Lz41/g;IFII)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final e(Lp1/c1;Ly2/y;)Ll83/a0;
    .locals 6

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb51/b;

    invoke-interface {p1}, Ly2/y;->n()J

    move-result-wide v1

    const/16 v3, 0x20

    shr-long/2addr v1, v3

    long-to-int v1, v1

    int-to-float v1, v1

    invoke-interface {p1}, Ly2/y;->n()J

    move-result-wide v2

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    long-to-int p1, v2

    int-to-float p1, p1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2, v1, p1}, Lb51/b;-><init>(FFFF)V

    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lp1/c1;Lk2/e;)Ll83/a0;
    .locals 2

    const-string v0, "$this$Canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La51/h;

    invoke-virtual {v0}, La51/h;->g()Lb51/c;

    move-result-object v1

    invoke-static {v1, p1, v0}, Lz41/a;->a(Lb51/c;Lk2/e;La51/h;)V

    goto :goto_0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Lz41/g;ILz41/b;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lz41/j;->d(Landroidx/compose/ui/Modifier;Lz41/g;ILz41/b;FLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(J)J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, p0

    return-wide v0
.end method

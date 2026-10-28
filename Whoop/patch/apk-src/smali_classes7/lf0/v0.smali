.class public abstract Llf0/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a#\u0010\t\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u001b\u0010\u000c\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0008H\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Llf0/w0;",
        "itemState",
        "Ll83/a0;",
        "d",
        "(Landroidx/compose/ui/Modifier;Llf0/w0;Landroidx/compose/runtime/Composer;II)V",
        "Ll0/s1;",
        "Llf0/x0;",
        "f",
        "(Ll0/s1;Llf0/x0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V",
        "Ll0/u;",
        "h",
        "(Ll0/u;Llf0/x0;Landroidx/compose/runtime/Composer;I)V",
        "advanced-labs_release"
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
.method public static synthetic a(Ll0/s1;Llf0/x0;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Llf0/v0;->g(Ll0/s1;Llf0/x0;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Llf0/w0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Llf0/v0;->e(Landroidx/compose/ui/Modifier;Llf0/w0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ll0/u;Llf0/x0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Llf0/v0;->i(Ll0/u;Llf0/x0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Llf0/w0;Landroidx/compose/runtime/Composer;II)V
    .locals 13

    const-string v0, "itemState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, 0x5706773f

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_2

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_2
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_5

    and-int/lit8 v2, p3, 0x40

    if-nez v2, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_2

    :cond_3
    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_2
    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_3

    :cond_4
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x1

    if-eq v2, v3, :cond_6

    move v2, v4

    goto :goto_4

    :cond_6
    const/4 v2, 0x0

    :goto_4
    and-int/2addr v1, v4

    invoke-virtual {p2, v1, v2}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_b

    sget-object v1, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_7

    move-object p0, v1

    :cond_7
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v3, 0x8

    int-to-float v3, v3

    const/high16 v5, 0x3fc00000    # 1.5f

    mul-float/2addr v3, v5

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v5, Lb2/e;->J:Lb2/l;

    const/4 v6, 0x6

    invoke-static {v3, v5, p2, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v7, p2, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {p2}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {p2, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {p2}, Lp1/q;->i0()V

    iget-boolean v9, p2, Lp1/q;->S:Z

    if-eqz v9, :cond_8

    invoke-virtual {p2, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_8
    invoke-virtual {p2}, Lp1/q;->s0()V

    :goto_5
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {p2, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {p2, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v7, p2, Lp1/q;->S:Z

    if-nez v7, :cond_9

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    :cond_9
    invoke-static {v5, p2, v5, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {p2, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p1}, Llf0/w0;->b()Llf0/x0;

    move-result-object v2

    sget-object v3, Ll0/t1;->a:Ll0/t1;

    invoke-virtual {v3, v1, v4, v0}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget v7, Lkd1/o;->a:I

    shl-int/lit8 v7, v7, 0x3

    or-int/2addr v6, v7

    invoke-static {v3, v2, v5, p2, v6}, Llf0/v0;->f(Ll0/s1;Llf0/x0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1}, Llf0/w0;->a()Llf0/x0;

    move-result-object v2

    invoke-virtual {v3, v1, v4, v0}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v3, v2, v0, p2, v6}, Llf0/v0;->f(Ll0/s1;Llf0/x0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    :goto_6
    move-object v8, p0

    goto :goto_7

    :cond_b
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_6

    :goto_7
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_c

    new-instance v7, Lio2/k0;

    const/16 v12, 0x18

    move-object v10, p1

    move/from16 v9, p3

    move/from16 v11, p4

    invoke-direct/range {v7 .. v12}, Lio2/k0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v7, p0, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Llf0/w0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Llf0/v0;->d(Landroidx/compose/ui/Modifier;Llf0/w0;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Ll0/s1;Llf0/x0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, 0x17973c03

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x30

    if-nez v0, :cond_2

    and-int/lit8 v0, v4, 0x40

    if-nez v0, :cond_0

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/16 v0, 0x20

    goto :goto_1

    :cond_1
    const/16 v0, 0x10

    :goto_1
    or-int/2addr v0, v4

    goto :goto_2

    :cond_2
    move v0, v4

    :goto_2
    and-int/lit16 v1, v4, 0x180

    if-nez v1, :cond_4

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x100

    goto :goto_3

    :cond_3
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_4
    and-int/lit16 v1, v0, 0x91

    const/16 v5, 0x90

    const/4 v6, 0x0

    const/4 v15, 0x1

    if-eq v1, v5, :cond_5

    move v1, v15

    goto :goto_4

    :cond_5
    move v1, v6

    :goto_4
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v12, v5, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_9

    const/16 v1, 0x3f

    int-to-float v1, v1

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float/2addr v1, v5

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v11, 0x3

    int-to-float v7, v11

    invoke-static {v1, v7, v5}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, Lb2/e;->w:Lb2/m;

    invoke-static {v5, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v6, v12, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v12, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-eqz v9, :cond_6

    invoke-virtual {v12, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_5
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v12, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v12, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v12, Lp1/q;->S:Z

    if-nez v7, :cond_7

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    :cond_7
    invoke-static {v6, v12, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v12, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v2}, Llf0/x0;->a()Lkd1/o;

    move-result-object v5

    sget v9, Lkd1/o;->a:I

    const/4 v10, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v8, v12

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    move/from16 v16, v9

    const/16 v13, 0x61b0

    const/16 v14, 0x68

    const/4 v8, 0x0

    sget-object v9, Ly2/j;->a:Ly2/b1;

    const/4 v10, 0x0

    move v7, v11

    const/4 v11, 0x0

    move/from16 v17, v7

    move-object v7, v1

    move/from16 v1, v17

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    const/4 v5, 0x6

    shl-int/lit8 v1, v16, 0x3

    or-int/2addr v1, v5

    and-int/lit8 v0, v0, 0x70

    or-int/2addr v0, v1

    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-static {v1, v2, v12, v0}, Llf0/v0;->h(Ll0/u;Llf0/x0;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_9
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_a

    new-instance v0, Ll72/n;

    const/4 v5, 0x3

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v5}, Ll72/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final g(Ll0/s1;Llf0/x0;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Llf0/v0;->f(Ll0/s1;Llf0/x0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Ll0/u;Llf0/x0;Landroidx/compose/runtime/Composer;I)V
    .locals 36

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, 0x591405ac

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, p3, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int v4, p3, v4

    goto :goto_1

    :cond_1
    move/from16 v4, p3

    :goto_1
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_4

    and-int/lit8 v5, p3, 0x40

    if-nez v5, :cond_2

    invoke-virtual {v3, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_2

    :cond_2
    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_2
    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v4, v5

    :cond_4
    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v5, v6, :cond_5

    move v5, v8

    goto :goto_4

    :cond_5
    move v5, v7

    :goto_4
    and-int/2addr v4, v8

    invoke-virtual {v3, v4, v5}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_a

    sget-object v4, Lb2/t;->w:Lb2/t;

    sget-object v5, Lb2/e;->G:Lb2/m;

    invoke-interface {v0, v4, v5}, Ll0/u;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v5, 0x8

    int-to-float v5, v5

    const/high16 v9, 0x3fc00000    # 1.5f

    mul-float/2addr v5, v9

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, Lb2/e;->M:Lb2/k;

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    const/16 v10, 0x36

    invoke-static {v5, v9, v3, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v9, v3, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v3, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v12, v3, Lp1/q;->S:Z

    if-eqz v12, :cond_6

    invoke-virtual {v3, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_5
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v3, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v3, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v10, v3, Lp1/q;->S:Z

    if-nez v10, :cond_7

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_8

    :cond_7
    invoke-static {v9, v3, v9, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v3, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Llf0/x0;->c()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v5, v3, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->Q()Lb91/a;

    move-result-object v10

    sget-object v11, Lb91/b$g;->a:Lb91/b$g;

    const/4 v12, 0x0

    invoke-static {v10, v12, v11, v8, v12}, Lb91/a;->c(Lb91/a;Ll3/v0;Lb91/b;ILjava/lang/Object;)Lb91/a;

    move-result-object v23

    invoke-virtual {v1}, Llf0/x0;->d()Ly81/f;

    move-result-object v10

    invoke-virtual {v10, v3, v7}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v10

    new-instance v15, Lw3/k;

    const/4 v12, 0x5

    invoke-direct {v15, v12}, Lw3/k;-><init>(I)V

    sget v13, Lb91/a;->d:I

    shl-int/lit8 v27, v13, 0x12

    const v28, 0x2fdfa

    move-object/from16 v25, v3

    move-object v3, v4

    const/4 v4, 0x0

    move v6, v7

    move v13, v8

    const-wide/16 v7, 0x0

    move v14, v9

    const/4 v9, 0x0

    move/from16 v16, v6

    move-wide/from16 v34, v10

    move-object v11, v5

    move-wide/from16 v5, v34

    const/4 v10, 0x0

    move-object/from16 v17, v11

    const/4 v11, 0x0

    move/from16 v18, v12

    move/from16 v19, v13

    const-wide/16 v12, 0x0

    move/from16 v20, v14

    const/4 v14, 0x0

    move/from16 v22, v16

    move-object/from16 v21, v17

    const-wide/16 v16, 0x0

    move/from16 v24, v18

    const/16 v18, 0x0

    move/from16 v26, v19

    const/16 v19, 0x0

    move/from16 v29, v20

    const/16 v20, 0x0

    move-object/from16 v30, v21

    const/16 v21, 0x0

    move/from16 v31, v22

    const/16 v22, 0x0

    move/from16 v32, v24

    const/16 v24, 0x0

    move/from16 v33, v26

    const/16 v26, 0x0

    move/from16 v1, v29

    move-object/from16 v0, v30

    move/from16 v2, v31

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    invoke-virtual/range {p1 .. p1}, Llf0/x0;->b()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_9

    const v0, -0x2cc7f2c7

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    :goto_6
    const/4 v13, 0x1

    goto :goto_7

    :cond_9
    const v5, -0x2cc7f2c6

    invoke-virtual {v3, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v3, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->b()Lb91/a;

    move-result-object v23

    invoke-virtual {v0, v3, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v5

    new-instance v15, Lw3/k;

    const/4 v0, 0x5

    invoke-direct {v15, v0}, Lw3/k;-><init>(I)V

    const/16 v26, 0x0

    const v28, 0x2fdfa

    move-object/from16 v25, v3

    move-object v3, v4

    const/4 v4, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    goto :goto_6

    :goto_7
    invoke-virtual {v3, v13}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_a
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_b

    new-instance v1, Lkl2/f;

    const/16 v2, 0x10

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move/from16 v5, p3

    invoke-direct {v1, v3, v4, v5, v2}, Lkl2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final i(Ll0/u;Llf0/x0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Llf0/v0;->h(Ll0/u;Llf0/x0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

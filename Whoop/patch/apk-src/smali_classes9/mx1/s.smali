.class public abstract Lmx1/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lkd1/o;",
        "tierImage",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "centerTier",
        "Ll83/a0;",
        "b",
        "(Lkd1/o;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V",
        "membership_release"
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
.method public static synthetic a(Lkd1/o;Landroidx/compose/ui/Modifier;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lmx1/s;->c(Lkd1/o;Landroidx/compose/ui/Modifier;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lkd1/o;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v6, p4

    const-string v1, "tierImage"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v1, -0x2fe026ef

    invoke-virtual {v11, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v6, 0x6

    const/4 v2, 0x4

    if-nez v1, :cond_2

    and-int/lit8 v1, v6, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    :goto_1
    or-int/2addr v1, v6

    goto :goto_2

    :cond_2
    move v1, v6

    :goto_2
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v1, v1, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v4, v6, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x20

    goto :goto_3

    :cond_5
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v1, v5

    :goto_4
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_7

    or-int/lit16 v1, v1, 0x180

    :cond_6
    move/from16 v7, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_6

    move/from16 v7, p2

    invoke-virtual {v11, v7}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_5

    :cond_8
    const/16 v8, 0x80

    :goto_5
    or-int/2addr v1, v8

    :goto_6
    and-int/lit16 v8, v1, 0x93

    const/16 v9, 0x92

    const/4 v14, 0x1

    if-eq v8, v9, :cond_9

    move v8, v14

    goto :goto_7

    :cond_9
    const/4 v8, 0x0

    :goto_7
    and-int/lit8 v9, v1, 0x1

    invoke-virtual {v11, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_10

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_a

    move-object v3, v15

    goto :goto_8

    :cond_a
    move-object v3, v4

    :goto_8
    if-eqz v5, :cond_b

    move/from16 v17, v14

    goto :goto_9

    :cond_b
    move/from16 v17, v7

    :goto_9
    const-wide/high16 v4, 0x4004000000000000L    # 2.5

    double-to-float v4, v4

    int-to-float v2, v2

    mul-float/2addr v4, v2

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    if-eqz v17, :cond_c

    sget-object v7, Lb2/e;->K:Lb2/l;

    goto :goto_a

    :cond_c
    sget-object v7, Lb2/e;->L:Lb2/l;

    :goto_a
    const/4 v8, 0x6

    invoke-static {v5, v7, v11, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v9, v11, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v11, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-eqz v13, :cond_d

    invoke-virtual {v11, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_d
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_b
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v11, v12, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v11, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-nez v9, :cond_e

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_f

    :cond_e
    invoke-static {v7, v11, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v11, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    mul-float/2addr v2, v2

    invoke-static {v2, v15}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->h()Lgz0/u;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/u;->g()I

    move-result v2

    invoke-static {v2, v11, v8}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v7

    const/16 v12, 0x61b0

    const/16 v13, 0x68

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v13}, Lpf/c;->d(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;Li2/p;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v4, v15}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget v2, Lkd1/o;->a:I

    and-int/lit8 v1, v1, 0xe

    or-int v4, v2, v1

    const/4 v5, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object/from16 v18, v3

    move-object v3, v11

    invoke-static/range {v0 .. v5}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v7

    const/16 v15, 0x61b0

    const/16 v16, 0x68

    sget-object v11, Ly2/j;->b:Ly2/b1;

    const/4 v12, 0x0

    const/4 v13, 0x0

    move v0, v14

    move-object v14, v3

    invoke-static/range {v7 .. v16}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v14

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    move/from16 v3, v17

    move-object/from16 v2, v18

    goto :goto_c

    :cond_10
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v2, v4

    move v3, v7

    :goto_c
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_11

    new-instance v0, Lbg0/h;

    const/16 v6, 0x16

    move-object/from16 v1, p0

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lbg0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZIII)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final c(Lkd1/o;Landroidx/compose/ui/Modifier;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lmx1/s;->b(Lkd1/o;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

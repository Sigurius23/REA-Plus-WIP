.class public abstract Law0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lgz0/m0;",
        "icon",
        "",
        "title",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "b",
        "(Lgz0/m0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "core-details_release"
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
.method public static synthetic a(Lgz0/m0;Ljava/lang/String;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Law0/g;->c(Lgz0/m0;Ljava/lang/String;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lgz0/m0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 28

    move-object/from16 v0, p1

    move/from16 v1, p4

    const-string v2, "icon"

    move-object/from16 v3, p0

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "title"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v2, -0x728ef338

    invoke-virtual {v9, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v4, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    invoke-virtual {v9, v2}, Lp1/q;->e(I)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v5, v1, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v9, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :cond_3
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_5

    or-int/lit16 v2, v2, 0x180

    :cond_4
    move-object/from16 v6, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v6, v1, 0x180

    if-nez v6, :cond_4

    move-object/from16 v6, p2

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_3

    :cond_6
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v2, v7

    :goto_4
    and-int/lit16 v7, v2, 0x93

    const/16 v8, 0x92

    const/4 v10, 0x0

    const/4 v12, 0x1

    if-eq v7, v8, :cond_7

    move v7, v12

    goto :goto_5

    :cond_7
    move v7, v10

    :goto_5
    and-int/lit8 v8, v2, 0x1

    invoke-virtual {v9, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_c

    sget-object v7, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_8

    move-object v13, v7

    goto :goto_6

    :cond_8
    move-object v13, v6

    :goto_6
    const-wide/high16 v5, 0x3ff8000000000000L    # 1.5

    double-to-float v5, v5

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v5, v6

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    sget-object v6, Lb2/e;->K:Lb2/l;

    const/16 v8, 0x36

    invoke-static {v5, v6, v9, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v14, v9, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v9, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v15, v9, Lp1/q;->S:Z

    if-eqz v15, :cond_9

    invoke-virtual {v9, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_7
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v9, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v9, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-nez v8, :cond_a

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v8, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    :cond_a
    invoke-static {v6, v9, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v9, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v5, 0x5

    int-to-float v5, v5

    int-to-float v4, v4

    mul-float/2addr v5, v4

    invoke-static {v5, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v3}, Lgz0/m0;->toWhoopIcon()I

    move-result v4

    invoke-static {v4, v9, v10}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v4

    sget-object v14, Lx81/d;->a:Lx81/d;

    sget v15, Lx81/d;->b:I

    invoke-virtual {v14, v9, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->b1()J

    move-result-wide v7

    const/16 v10, 0x1b0

    const/4 v11, 0x0

    const/4 v5, 0x0

    invoke-static/range {v4 .. v11}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v9, v15}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->a()Lb91/a;

    move-result-object v20

    invoke-virtual {v14, v9, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v4

    shr-int/lit8 v2, v2, 0x3

    and-int/lit8 v23, v2, 0xe

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v24, v2, 0x12

    const v25, 0x2fffa

    const/4 v1, 0x0

    move-wide v2, v4

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v22, v9

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move v14, v12

    const/4 v12, 0x0

    move-object v15, v13

    move/from16 v16, v14

    const-wide/16 v13, 0x0

    move-object/from16 v17, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const/16 v16, 0x0

    move-object/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v21, v18

    const/16 v18, 0x0

    move-object/from16 v26, v19

    const/16 v19, 0x0

    move/from16 v27, v21

    const/16 v21, 0x0

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v22

    const/4 v14, 0x1

    invoke-virtual {v9, v14}, Lp1/q;->q(Z)V

    move-object/from16 v3, v26

    goto :goto_8

    :cond_c
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v3, v6

    :goto_8
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_d

    new-instance v0, La01/e;

    const/16 v6, 0xa

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, La01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/Modifier;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final c(Lgz0/m0;Ljava/lang/String;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Law0/g;->b(Lgz0/m0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.class public abstract Lhy0/d2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aC\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "imageUrl",
        "contentDescription",
        "",
        "placeholderResId",
        "Ly2/k;",
        "contentScale",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ly2/k;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ly2/k;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lhy0/d2;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ly2/k;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ly2/k;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation runtime Ll83/c;
    .end annotation

    move-object/from16 v2, p1

    move/from16 v6, p6

    move-object/from16 v14, p5

    check-cast v14, Lp1/q;

    const v0, -0x5471134f

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p7, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v6, 0x6

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v6, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v6

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v3, v6

    :goto_1
    and-int/lit8 v4, v6, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_4
    and-int/lit16 v4, v6, 0x180

    move-object/from16 v8, p2

    if-nez v4, :cond_6

    invoke-virtual {v14, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x100

    goto :goto_3

    :cond_5
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v3, v4

    :cond_6
    and-int/lit8 v4, p7, 0x8

    if-eqz v4, :cond_8

    or-int/lit16 v3, v3, 0xc00

    :cond_7
    move-object/from16 v5, p3

    goto :goto_5

    :cond_8
    and-int/lit16 v5, v6, 0xc00

    if-nez v5, :cond_7

    move-object/from16 v5, p3

    invoke-virtual {v14, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    const/16 v7, 0x800

    goto :goto_4

    :cond_9
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v3, v7

    :goto_5
    and-int/lit8 v7, p7, 0x10

    if-eqz v7, :cond_b

    or-int/lit16 v3, v3, 0x6000

    :cond_a
    move-object/from16 v9, p4

    goto :goto_7

    :cond_b
    and-int/lit16 v9, v6, 0x6000

    if-nez v9, :cond_a

    move-object/from16 v9, p4

    invoke-virtual {v14, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_c

    const/16 v10, 0x4000

    goto :goto_6

    :cond_c
    const/16 v10, 0x2000

    :goto_6
    or-int/2addr v3, v10

    :goto_7
    and-int/lit16 v10, v3, 0x2493

    const/16 v11, 0x2492

    const/4 v12, 0x0

    if-eq v10, v11, :cond_d

    const/4 v10, 0x1

    goto :goto_8

    :cond_d
    move v10, v12

    :goto_8
    and-int/lit8 v11, v3, 0x1

    invoke-virtual {v14, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_12

    if-eqz v0, :cond_e

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object v9, v0

    goto :goto_9

    :cond_e
    move-object v9, v1

    :goto_9
    if-eqz v4, :cond_f

    const/4 v0, 0x0

    goto :goto_a

    :cond_f
    move-object v0, v5

    :goto_a
    if-eqz v7, :cond_10

    sget-object v1, Ly2/j;->b:Ly2/b1;

    move-object v11, v1

    goto :goto_b

    :cond_10
    move-object/from16 v11, p4

    :goto_b
    shr-int/lit8 v1, v3, 0x3

    const v4, 0x24066c4c

    invoke-virtual {v14, v4}, Lp1/q;->f0(I)V

    new-instance v4, Lmh/h;

    sget-object v5, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v14, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/Context;

    invoke-direct {v4, v5}, Lmh/h;-><init>(Landroid/content/Context;)V

    iput-object v2, v4, Lmh/h;->c:Ljava/lang/Object;

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iput-object v7, v4, Lmh/h;->r:Ljava/lang/Integer;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iput-object v7, v4, Lmh/h;->t:Ljava/lang/Integer;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, v4, Lmh/h;->s:Ljava/lang/Integer;

    :cond_11
    invoke-virtual {v4}, Lmh/h;->a()Lmh/j;

    move-result-object v4

    const/16 v5, 0x8

    invoke-static {v4, v14, v5}, Ldp/d;->T(Lmh/j;Lp1/q;I)Lcoil/compose/AsyncImagePainter;

    move-result-object v7

    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    and-int/lit8 v1, v1, 0x70

    shl-int/lit8 v4, v3, 0x6

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v1, v4

    const v4, 0xe000

    and-int/2addr v3, v4

    or-int v15, v1, v3

    const/16 v16, 0x68

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v7 .. v16}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v0

    move-object v1, v9

    move-object v5, v11

    goto :goto_c

    :cond_12
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v4, v5

    move-object/from16 v5, p4

    :goto_c
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_13

    new-instance v0, La01/f;

    const/16 v8, 0x1b

    move-object/from16 v3, p2

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, La01/f;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ly2/k;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lhy0/d2;->b(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ly2/k;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

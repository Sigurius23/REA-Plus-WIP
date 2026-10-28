.class public abstract Lnn2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aA\u0010\n\u001a\u00020\t*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Ll0/u;",
        "Lkd1/o;",
        "image",
        "",
        "stackedImages",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ly2/k;",
        "contentScale",
        "Ll83/a0;",
        "b",
        "(Ll0/u;Lkd1/o;Ljava/util/List;Landroidx/compose/ui/Modifier;Ly2/k;Landroidx/compose/runtime/Composer;II)V",
        "universal-checkout_release"
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
.method public static synthetic a(Ll0/u;Lkd1/o;Ljava/util/List;Landroidx/compose/ui/Modifier;Ly2/k;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lnn2/a;->c(Ll0/u;Lkd1/o;Ljava/util/List;Landroidx/compose/ui/Modifier;Ly2/k;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ll0/u;Lkd1/o;Ljava/util/List;Landroidx/compose/ui/Modifier;Ly2/k;Landroidx/compose/runtime/Composer;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll0/u;",
            "Lkd1/o;",
            "Ljava/util/List<",
            "+",
            "Lkd1/o;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Ly2/k;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v6, p6

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p5

    check-cast v10, Lp1/q;

    const v0, 0x16415349

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x30

    if-nez v0, :cond_2

    and-int/lit8 v0, v6, 0x40

    if-nez v0, :cond_0

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/16 v0, 0x20

    goto :goto_1

    :cond_1
    const/16 v0, 0x10

    :goto_1
    or-int/2addr v0, v6

    goto :goto_2

    :cond_2
    move v0, v6

    :goto_2
    and-int/lit16 v4, v6, 0x180

    if-nez v4, :cond_4

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x100

    goto :goto_3

    :cond_3
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v0, v4

    :cond_4
    and-int/lit8 v4, p7, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v0, v0, 0xc00

    :cond_5
    move-object/from16 v5, p3

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v6, 0xc00

    if-nez v5, :cond_5

    move-object/from16 v5, p3

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x800

    goto :goto_4

    :cond_7
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v0, v7

    :goto_5
    and-int/lit8 v7, p7, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v0, v0, 0x6000

    :cond_8
    move-object/from16 v8, p4

    goto :goto_7

    :cond_9
    and-int/lit16 v8, v6, 0x6000

    if-nez v8, :cond_8

    move-object/from16 v8, p4

    invoke-virtual {v10, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x4000

    goto :goto_6

    :cond_a
    const/16 v9, 0x2000

    :goto_6
    or-int/2addr v0, v9

    :goto_7
    and-int/lit16 v9, v0, 0x2491

    const/16 v11, 0x2490

    if-eq v9, v11, :cond_b

    const/4 v9, 0x1

    goto :goto_8

    :cond_b
    const/4 v9, 0x0

    :goto_8
    and-int/lit8 v11, v0, 0x1

    invoke-virtual {v10, v11, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_12

    if-eqz v4, :cond_c

    sget-object v4, Lb2/t;->w:Lb2/t;

    goto :goto_9

    :cond_c
    move-object v4, v5

    :goto_9
    if-eqz v7, :cond_d

    sget-object v5, Ly2/j;->b:Ly2/b1;

    goto :goto_a

    :cond_d
    move-object v5, v8

    :goto_a
    if-eqz v3, :cond_f

    move-object v7, v3

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_e

    move-object v7, v3

    goto :goto_b

    :cond_e
    const/4 v7, 0x0

    :goto_b
    if-nez v7, :cond_10

    :cond_f
    invoke-static {v2}, Lwb3/f;->L(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    :cond_10
    check-cast v7, Ljava/lang/Iterable;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_c
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_11

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lkd1/o;

    sget v11, Lkd1/o;->a:I

    const/4 v12, 0x3

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v7

    shr-int/lit8 v8, v0, 0x3

    and-int/lit16 v8, v8, 0x380

    or-int/lit8 v8, v8, 0x30

    const v9, 0xe000

    and-int/2addr v9, v0

    or-int v15, v8, v9

    const/16 v16, 0x68

    const/4 v8, 0x0

    move-object v14, v10

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v9, v4

    move-object v11, v5

    invoke-static/range {v7 .. v16}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v14

    goto :goto_c

    :cond_11
    move-object v9, v4

    move-object v11, v5

    goto :goto_d

    :cond_12
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v4, v5

    move-object v5, v8

    :goto_d
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_13

    new-instance v0, Lj81/e;

    const/4 v8, 0x7

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lj81/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ljava/lang/Object;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final c(Ll0/u;Lkd1/o;Ljava/util/List;Landroidx/compose/ui/Modifier;Ly2/k;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v7}, Lnn2/a;->b(Ll0/u;Lkd1/o;Ljava/util/List;Landroidx/compose/ui/Modifier;Ly2/k;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

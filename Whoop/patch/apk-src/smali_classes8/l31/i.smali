.class public abstract Ll31/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u001d\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Ll83/a0;",
        "j",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Ly11/a;",
        "fillColor",
        "",
        "Ly11/l;",
        "t",
        "(Ly11/a;)Ljava/util/List;",
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
.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Ll31/i;->o()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ll31/i;->s(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Ll31/i;->n()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Ll83/a0;
    .locals 1

    invoke-static {}, Ll31/i;->l()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Ll83/a0;
    .locals 1

    invoke-static {}, Ll31/i;->m()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Ll83/a0;
    .locals 1

    invoke-static {}, Ll31/i;->q()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g()Ll83/a0;
    .locals 1

    invoke-static {}, Ll31/i;->r()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h()Ll83/a0;
    .locals 1

    invoke-static {}, Ll31/i;->k()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i()Ll83/a0;
    .locals 1

    invoke-static {}, Ll31/i;->p()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final j(Landroidx/compose/runtime/Composer;I)V
    .locals 45

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/high16 v2, 0x42a00000    # 80.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/high16 v3, 0x42480000    # 50.0f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/high16 v4, 0x3f000000    # 0.5f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const/high16 v5, 0x42700000    # 60.0f

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    const/high16 v6, 0x42200000    # 40.0f

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    const/high16 v7, 0x425c0000    # 55.0f

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    const/high16 v8, 0x42340000    # 45.0f

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    const/high16 v9, 0x42c80000    # 100.0f

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    const/high16 v10, 0x42960000    # 75.0f

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    const/high16 v11, 0x41c80000    # 25.0f

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    const/4 v12, 0x0

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    move-object/from16 v13, p0

    check-cast v13, Lp1/q;

    const v14, 0x2eeb086a

    invoke-virtual {v13, v14}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v14, 0x1

    goto :goto_0

    :cond_0
    const/4 v14, 0x0

    :goto_0
    and-int/lit8 v15, p1, 0x1

    invoke-virtual {v13, v15, v14}, Lp1/q;->U(IZ)Z

    move-result v14

    if-eqz v14, :cond_9

    const-string v14, "title"

    move-object v15, v14

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    const-string v35, "9%"

    invoke-static/range {v35 .. v35}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    const-string v36, "0:47"

    invoke-static/range {v36 .. v36}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    const-string v37, ":03"

    invoke-static/range {v37 .. v37}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    move-object/from16 p0, v14

    new-instance v14, Ll83/k;

    invoke-direct {v14, v6, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v19, v15

    sget-object v15, Lx81/d;->a:Lx81/d;

    const/4 v0, 0x6

    invoke-virtual {v15, v13, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ly81/i;->y()J

    move-result-wide v20

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v15

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-ne v0, v15, :cond_1

    new-instance v0, Ll1/f0;

    move-object/from16 v25, v14

    const/16 v14, 0x13

    invoke-direct {v0, v14}, Ll1/f0;-><init>(I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    move-object/from16 v25, v14

    :goto_1
    move-object/from16 v30, v0

    check-cast v30, Lc93/a;

    const/high16 v33, 0x180000

    const v34, 0xf585

    move-object/from16 v31, v13

    const/4 v13, 0x0

    move-object v0, v15

    const/4 v15, 0x0

    move-object/from16 v14, v19

    move-wide/from16 v19, v20

    const/16 v21, 0x0

    move-object/from16 v23, v22

    const/16 v22, 0x0

    move-object/from16 v24, v23

    sget-object v23, Lm83/y;->w:Lm83/y;

    move-object/from16 v26, v24

    const/16 v24, 0x0

    move-object/from16 v27, v26

    const/16 v26, 0x0

    move-object/from16 v28, v27

    const/16 v27, 0x0

    move-object/from16 v29, v28

    const/16 v28, 0x0

    move-object/from16 v32, v29

    const/16 v29, 0x0

    move-object/from16 v38, v32

    const/high16 v32, 0x30000000

    move-object/from16 v39, v8

    move-object v8, v0

    move-object/from16 v0, v38

    move-object/from16 v38, v7

    move-object v7, v14

    move-object/from16 v14, p0

    invoke-static/range {v13 .. v34}, Ly11/k;->i(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JZZLjava/util/List;ZLl83/k;Ld0/z1;ZZLcom/whoop/design/models/items/graph/LayoutDirection;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v31

    const/4 v14, 0x4

    int-to-float v14, v14

    mul-float/2addr v14, v14

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v15, v14, v13, v7}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    const-string v17, "subtitle"

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    move/from16 v18, v14

    move-object/from16 v14, v16

    invoke-static/range {v35 .. v35}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    move-object/from16 v19, v15

    move-object/from16 v15, v17

    invoke-static/range {v36 .. v36}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    move/from16 v20, v18

    invoke-static/range {v37 .. v37}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    move-object/from16 p0, v14

    new-instance v14, Ll83/k;

    invoke-direct {v14, v12, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v21, v15

    new-instance v15, Ll83/k;

    const/high16 v22, 0x41f00000    # 30.0f

    move-object/from16 v40, v9

    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-direct {v15, v4, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v6, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v9, Ll83/k;

    const/high16 v22, 0x428c0000    # 70.0f

    move-object/from16 v41, v10

    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-direct {v9, v5, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v10, Ll83/k;

    const/high16 v22, 0x42b40000    # 90.0f

    move-object/from16 v42, v12

    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    invoke-direct {v10, v2, v12}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v14, v15, v4, v9, v10}, [Ll83/k;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lb21/f;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v23

    new-instance v4, Ll83/k;

    invoke-direct {v4, v6, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v9, 0x6

    invoke-virtual {v0, v13, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v9

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v8, :cond_2

    new-instance v12, Ll1/f0;

    const/16 v14, 0x14

    invoke-direct {v12, v14}, Ll1/f0;-><init>(I)V

    invoke-virtual {v13, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object/from16 v30, v12

    check-cast v30, Lc93/a;

    const/high16 v33, 0x180000

    const v34, 0xf581

    move-object/from16 v31, v13

    const/4 v13, 0x0

    move-object/from16 v15, v21

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v32, 0x0

    move-object/from16 v14, p0

    move-object/from16 v25, v4

    move/from16 v4, v20

    move-wide/from16 v43, v9

    move-object/from16 v9, v19

    move-wide/from16 v19, v43

    invoke-static/range {v13 .. v34}, Ly11/k;->i(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JZZLjava/util/List;ZLl83/k;Ld0/z1;ZZLcom/whoop/design/models/items/graph/LayoutDirection;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v31

    invoke-static {v9, v4, v13, v7}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-static/range {v35 .. v35}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-static/range {v36 .. v36}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    invoke-static/range {v37 .. v37}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    new-instance v10, Ll83/k;

    invoke-direct {v10, v1, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v12, Ll83/k;

    invoke-direct {v12, v3, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const/high16 v5, 0x42be0000    # 95.0f

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-direct {v3, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v10, v12, v3}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lb21/f;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v23

    new-instance v2, Ll83/k;

    invoke-direct {v2, v1, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v1, 0x6

    invoke-virtual {v0, v13, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->h0()J

    move-result-wide v19

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v8, :cond_3

    new-instance v1, Ll1/f0;

    const/16 v3, 0x15

    invoke-direct {v1, v3}, Ll1/f0;-><init>(I)V

    invoke-virtual {v13, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object/from16 v30, v1

    check-cast v30, Lc93/a;

    const/high16 v33, 0x180000

    const v34, 0xf585

    move-object/from16 v31, v13

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v32, 0x0

    move-object/from16 v25, v2

    invoke-static/range {v13 .. v34}, Ly11/k;->i(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JZZLjava/util/List;ZLl83/k;Ld0/z1;ZZLcom/whoop/design/models/items/graph/LayoutDirection;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v31

    invoke-static {v9, v4, v13, v7}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-static/range {v35 .. v35}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-static/range {v36 .. v36}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    invoke-static/range {v37 .. v37}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    new-instance v1, Ll83/k;

    move-object/from16 v2, v42

    invoke-direct {v1, v2, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    move-object/from16 v5, v40

    move-object/from16 v6, v41

    invoke-direct {v3, v6, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v3}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lb21/f;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v23

    new-instance v1, Ll83/k;

    move-object/from16 v3, v38

    move-object/from16 v7, v39

    invoke-direct {v1, v7, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v10, 0x6

    invoke-virtual {v0, v13, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->X()J

    move-result-wide v19

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v8, :cond_4

    new-instance v10, Ll1/f0;

    const/16 v12, 0x16

    invoke-direct {v10, v12}, Ll1/f0;-><init>(I)V

    invoke-virtual {v13, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object/from16 v30, v10

    check-cast v30, Lc93/a;

    const/high16 v33, 0x180000

    const v34, 0xf505

    move-object/from16 v31, v13

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/high16 v32, 0xc00000

    move-object/from16 v25, v1

    invoke-static/range {v13 .. v34}, Ly11/k;->i(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JZZLjava/util/List;ZLl83/k;Ld0/z1;ZZLcom/whoop/design/models/items/graph/LayoutDirection;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v31

    const-string v1, "Drilldown"

    invoke-static {v9, v4, v13, v1}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-static/range {v35 .. v35}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-static/range {v36 .. v36}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    invoke-static/range {v37 .. v37}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    new-instance v4, Ll83/k;

    invoke-direct {v4, v2, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v9, Ll83/k;

    invoke-direct {v9, v6, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v9}, [Ll83/k;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lb21/f;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v23

    new-instance v4, Ll83/k;

    invoke-direct {v4, v7, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v9, 0x6

    invoke-virtual {v0, v13, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->k0()J

    move-result-wide v19

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v8, :cond_5

    new-instance v9, Ll1/f0;

    const/16 v10, 0x17

    invoke-direct {v9, v10}, Ll1/f0;-><init>(I)V

    invoke-virtual {v13, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object/from16 v30, v9

    check-cast v30, Lc93/a;

    const/high16 v33, 0x180000

    const v34, 0xf405

    move-object/from16 v31, v13

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x1

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/high16 v32, 0x6c00000

    move-object/from16 v25, v4

    invoke-static/range {v13 .. v34}, Ly11/k;->i(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JZZLjava/util/List;ZLl83/k;Ld0/z1;ZZLcom/whoop/design/models/items/graph/LayoutDirection;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v31

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-static/range {v35 .. v35}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-static/range {v36 .. v36}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    invoke-static/range {v37 .. v37}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    new-instance v1, Ll83/k;

    invoke-direct {v1, v2, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v6, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v4}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lb21/f;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v23

    new-instance v1, Ll83/k;

    invoke-direct {v1, v7, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v9, 0x6

    invoke-virtual {v0, v13, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->k0()J

    move-result-wide v19

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v8, :cond_6

    new-instance v4, Ll1/f0;

    const/16 v9, 0x18

    invoke-direct {v4, v9}, Ll1/f0;-><init>(I)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object/from16 v30, v4

    check-cast v30, Lc93/a;

    const/high16 v33, 0x180000

    const v34, 0xf405

    move-object/from16 v31, v13

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x1

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/high16 v32, 0x6c00000

    move-object/from16 v25, v1

    invoke-static/range {v13 .. v34}, Ly11/k;->i(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JZZLjava/util/List;ZLl83/k;Ld0/z1;ZZLcom/whoop/design/models/items/graph/LayoutDirection;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v31

    const-string v1, "Title"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-static/range {v35 .. v35}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-static/range {v36 .. v36}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    invoke-static/range {v37 .. v37}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    new-instance v4, Ll83/k;

    invoke-direct {v4, v2, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v9, Ll83/k;

    invoke-direct {v9, v6, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v9}, [Ll83/k;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lb21/f;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v23

    new-instance v4, Ll83/k;

    invoke-direct {v4, v7, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v9, 0x6

    invoke-virtual {v0, v13, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->j0()J

    move-result-wide v19

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v8, :cond_7

    new-instance v9, Ll1/f0;

    const/16 v10, 0x19

    invoke-direct {v9, v10}, Ll1/f0;-><init>(I)V

    invoke-virtual {v13, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object/from16 v30, v9

    check-cast v30, Lc93/a;

    const v33, 0x186c00

    const v34, 0x9405

    move-object/from16 v31, v13

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x1

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x1

    const/16 v28, 0x1

    const/16 v29, 0x0

    const/high16 v32, 0x6c00000

    move-object/from16 v25, v4

    invoke-static/range {v13 .. v34}, Ly11/k;->i(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JZZLjava/util/List;ZLl83/k;Ld0/z1;ZZLcom/whoop/design/models/items/graph/LayoutDirection;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v31

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-static/range {v35 .. v35}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-static/range {v36 .. v36}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    invoke-static/range {v37 .. v37}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    new-instance v1, Ll83/k;

    invoke-direct {v1, v2, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v6, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lb21/f;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v23

    new-instance v1, Ll83/k;

    invoke-direct {v1, v7, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v9, 0x6

    invoke-virtual {v0, v13, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->j0()J

    move-result-wide v19

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_8

    new-instance v0, Ll1/f0;

    const/16 v2, 0x1a

    invoke-direct {v0, v2}, Ll1/f0;-><init>(I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object/from16 v30, v0

    check-cast v30, Lc93/a;

    const v33, 0x186c00

    const v34, 0x9405

    move-object/from16 v31, v13

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x1

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x1

    const/16 v29, 0x0

    const/high16 v32, 0x6c00000

    move-object/from16 v25, v1

    invoke-static/range {v13 .. v34}, Ly11/k;->i(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JZZLjava/util/List;ZLl83/k;Ld0/z1;ZZLcom/whoop/design/models/items/graph/LayoutDirection;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    move-object v1, v0

    move-object v2, v0

    move-object v3, v0

    move-object v4, v0

    move-object v5, v0

    move-object v6, v0

    move-object v7, v0

    move-object v8, v0

    move-object v9, v0

    move-object v10, v0

    move-object v11, v0

    filled-new-array/range {v0 .. v11}, [Ll83/a0;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    goto :goto_2

    :cond_9
    move-object/from16 v31, v13

    invoke-virtual/range {v31 .. v31}, Lp1/q;->X()V

    :goto_2
    invoke-virtual/range {v31 .. v31}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_a

    new-instance v1, Lk71/a0;

    const/16 v2, 0x13

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lk71/a0;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final k()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final l()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final m()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final n()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final o()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final p()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final q()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final r()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final s(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Ll31/i;->j(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final t(Ly11/a;)Ljava/util/List;
    .locals 52
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly11/a;",
            ")",
            "Ljava/util/List<",
            "Ly11/l;",
            ">;"
        }
    .end annotation

    const-string v0, "fillColor"

    move-object/from16 v8, p0

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Title"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v20, "9%"

    invoke-static/range {v20 .. v20}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const-string v21, "0:47"

    invoke-static/range {v21 .. v21}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    new-instance v1, Ll83/k;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/high16 v4, 0x41200000    # 10.0f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-direct {v1, v2, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, Ll83/k;

    const/high16 v9, 0x41a00000    # 20.0f

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    const/high16 v10, 0x41f00000    # 30.0f

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-direct {v7, v9, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v11, Ll83/k;

    const/high16 v12, 0x42200000    # 40.0f

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    const/high16 v13, 0x42480000    # 50.0f

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    invoke-direct {v11, v12, v13}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, Ll83/k;

    const/high16 v15, 0x42700000    # 60.0f

    invoke-static {v15}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v15

    const/high16 v16, 0x428c0000    # 70.0f

    move-object/from16 v17, v2

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-direct {v14, v15, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v22, v0

    new-instance v0, Ll83/k;

    const/high16 v16, 0x42a00000    # 80.0f

    move-object/from16 v18, v2

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/high16 v16, 0x42b40000    # 90.0f

    move-object/from16 v19, v4

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-direct {v0, v2, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v7, v11, v14, v0}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lb21/f;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    new-instance v14, Ll83/k;

    invoke-direct {v14, v12, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ly11/l;

    move-object/from16 v7, v18

    const v18, 0xeba5

    move-object/from16 v11, v19

    const/16 v19, 0x0

    move-object/from16 v16, v2

    const/4 v2, 0x0

    move-object/from16 v23, v4

    const/4 v4, 0x0

    move-object/from16 v24, v7

    const/4 v7, 0x0

    move-object/from16 v25, v9

    const/4 v9, 0x0

    move-object/from16 v26, v10

    const/4 v10, 0x0

    move-object/from16 v27, v11

    const/4 v11, 0x0

    move-object/from16 v28, v13

    const/4 v13, 0x0

    move-object/from16 v29, v15

    const/4 v15, 0x0

    move-object/from16 v30, v16

    const/16 v16, 0x0

    move-object/from16 v31, v17

    const/16 v17, 0x0

    move-object/from16 v35, v12

    move-object/from16 v40, v23

    move-object/from16 v38, v24

    move-object/from16 v33, v25

    move-object/from16 v34, v26

    move-object/from16 v32, v27

    move-object/from16 v36, v28

    move-object/from16 v37, v29

    move-object/from16 v39, v30

    move-object v12, v0

    move-object/from16 v0, v31

    invoke-direct/range {v1 .. v19}, Ly11/l;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly11/a;Landroidx/compose/ui/Modifier;ZZLjava/util/List;ZLl83/k;ZZLcom/whoop/design/models/items/graph/LayoutDirection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v2, "Subtitle"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static/range {v20 .. v20}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static/range {v21 .. v21}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const-string v23, ":03"

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    new-instance v2, Ll83/k;

    move-object/from16 v11, v32

    invoke-direct {v2, v0, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, Ll83/k;

    move-object/from16 v9, v33

    move-object/from16 v10, v34

    invoke-direct {v8, v9, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v11, Ll83/k;

    move-object/from16 v12, v35

    move-object/from16 v13, v36

    invoke-direct {v11, v12, v13}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, Ll83/k;

    move-object/from16 v14, v37

    move-object/from16 v15, v38

    invoke-direct {v13, v14, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v15, Ll83/k;

    move-object/from16 v16, v1

    move-object/from16 v17, v3

    move-object/from16 v1, v39

    move-object/from16 v3, v40

    invoke-direct {v15, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v8, v11, v13, v15}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lb21/f;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Ll83/k;

    invoke-direct {v2, v12, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v12, v1

    new-instance v1, Ly11/l;

    const v18, 0xeb81

    move-object v14, v2

    const/4 v2, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    move-object/from16 v3, v16

    const/16 v16, 0x0

    move-object v8, v3

    move-object/from16 v3, v17

    const/16 v17, 0x0

    move-object/from16 v44, v8

    move-object/from16 v41, v33

    move-object/from16 v42, v34

    move-object/from16 v43, v35

    move-object/from16 v8, p0

    invoke-direct/range {v1 .. v19}, Ly11/l;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly11/a;Landroidx/compose/ui/Modifier;ZZLjava/util/List;ZLl83/k;ZZLcom/whoop/design/models/items/graph/LayoutDirection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static/range {v20 .. v20}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static/range {v21 .. v21}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    new-instance v2, Ll83/k;

    const/high16 v4, 0x41c80000    # 25.0f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-direct {v2, v0, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, Ll83/k;

    const/high16 v9, 0x42960000    # 75.0f

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    const/high16 v10, 0x42c80000    # 100.0f

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-direct {v8, v9, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v8}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lb21/f;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v12

    new-instance v14, Ll83/k;

    const/high16 v2, 0x42340000    # 45.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/high16 v8, 0x425c0000    # 55.0f

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-direct {v14, v2, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v11, v1

    new-instance v1, Ly11/l;

    const v18, 0xea85

    move-object v13, v2

    const/4 v2, 0x0

    move-object v15, v4

    const/4 v4, 0x0

    move-object/from16 v16, v9

    const/4 v9, 0x0

    move-object/from16 v17, v10

    const/4 v10, 0x1

    move-object/from16 v22, v11

    const/4 v11, 0x0

    move-object/from16 v24, v13

    const/4 v13, 0x0

    move-object/from16 v25, v15

    const/4 v15, 0x0

    move-object/from16 v26, v16

    const/16 v16, 0x0

    move-object/from16 v27, v17

    const/16 v17, 0x0

    move-object/from16 v50, v8

    move-object/from16 v45, v22

    move-object/from16 v49, v24

    move-object/from16 v46, v25

    move-object/from16 v47, v26

    move-object/from16 v48, v27

    move-object/from16 v8, p0

    invoke-direct/range {v1 .. v19}, Ly11/l;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly11/a;Landroidx/compose/ui/Modifier;ZZLjava/util/List;ZLl83/k;ZZLcom/whoop/design/models/items/graph/LayoutDirection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v22, "Drilldown"

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static/range {v20 .. v20}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static/range {v21 .. v21}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    new-instance v2, Ll83/k;

    move-object/from16 v15, v46

    invoke-direct {v2, v0, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    move-object/from16 v8, v47

    move-object/from16 v9, v48

    invoke-direct {v4, v8, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v4}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lb21/f;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v12

    new-instance v14, Ll83/k;

    move-object/from16 v13, v49

    move-object/from16 v2, v50

    invoke-direct {v14, v13, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v2, v1

    new-instance v1, Ly11/l;

    const v18, 0xe885

    move-object v4, v2

    const/4 v2, 0x0

    move-object v8, v4

    const/4 v4, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x1

    const/4 v13, 0x0

    const/4 v15, 0x0

    move-object/from16 v51, v8

    move-object/from16 v8, p0

    invoke-direct/range {v1 .. v19}, Ly11/l;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly11/a;Landroidx/compose/ui/Modifier;ZZLjava/util/List;ZLl83/k;ZZLcom/whoop/design/models/items/graph/LayoutDirection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    new-instance v3, Ll83/k;

    const/high16 v4, 0x3f000000    # 0.5f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-direct {v3, v0, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ll83/k;

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/high16 v4, 0x3fc00000    # 1.5f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-direct {v0, v2, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const/high16 v5, 0x40000000    # 2.0f

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-direct {v2, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    const/high16 v5, 0x41a40000    # 20.5f

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    move-object/from16 v6, v41

    invoke-direct {v4, v6, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Ll83/k;

    const/high16 v6, 0x41b00000    # 22.0f

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    const v7, 0x41b26666    # 22.3f

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Ll83/k;

    const/high16 v7, 0x41b80000    # 23.0f

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    const v8, 0x41b9999a    # 23.2f

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-direct {v6, v7, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, Ll83/k;

    const v8, 0x41f1999a    # 30.2f

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    move-object/from16 v10, v42

    invoke-direct {v7, v10, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, Ll83/k;

    const/high16 v10, 0x42220000    # 40.5f

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    move-object/from16 v12, v43

    invoke-direct {v8, v12, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v10, Ll83/k;

    const/high16 v11, 0x422c0000    # 43.0f

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    const/high16 v12, 0x42300000    # 44.0f

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    invoke-direct {v10, v11, v12}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v11, Ll83/k;

    const/high16 v12, 0x42c40000    # 98.0f

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    const/high16 v13, 0x42c50000    # 98.5f

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    invoke-direct {v11, v12, v13}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v12, Ll83/k;

    const v13, 0x42c56666    # 98.7f

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    const v14, 0x42c5cccd    # 98.9f

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    invoke-direct {v12, v13, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, Ll83/k;

    const/high16 v14, 0x42c60000    # 99.0f

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    const/high16 v15, 0x42c70000    # 99.5f

    invoke-static {v15}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v15

    invoke-direct {v13, v14, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v25, v0

    move-object/from16 v26, v2

    move-object/from16 v24, v3

    move-object/from16 v27, v4

    move-object/from16 v28, v5

    move-object/from16 v29, v6

    move-object/from16 v30, v7

    move-object/from16 v31, v8

    move-object/from16 v32, v10

    move-object/from16 v33, v11

    move-object/from16 v34, v12

    move-object/from16 v35, v13

    filled-new-array/range {v24 .. v35}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lb21/f;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v12

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static/range {v20 .. v20}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static/range {v21 .. v21}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    move-object v0, v1

    new-instance v1, Ly11/l;

    const v18, 0xf805

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v8, p0

    invoke-direct/range {v1 .. v19}, Ly11/l;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly11/a;Landroidx/compose/ui/Modifier;ZZLjava/util/List;ZLl83/k;ZZLcom/whoop/design/models/items/graph/LayoutDirection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v1

    move-object/from16 v1, v44

    move-object/from16 v11, v45

    move-object/from16 v2, v51

    filled-new-array {v1, v11, v2, v0, v3}, [Ly11/l;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.class public abstract Ll31/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ll31/o;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 46

    move-object/from16 v13, p0

    check-cast v13, Lp1/q;

    const v1, -0x7f7c4e38

    invoke-virtual {v13, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    and-int/lit8 v3, p1, 0x1

    invoke-virtual {v13, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "TITLE"

    move-object v3, v2

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget-object v17, Ll31/e;->a:Ll31/e;

    invoke-virtual/range {v17 .. v17}, Ll31/e;->o()Lc93/m;

    move-result-object v12

    const/4 v15, 0x6

    const/16 v16, 0x3fd

    move v4, v1

    const/4 v1, 0x0

    move-object v5, v3

    const/4 v3, 0x0

    move v6, v4

    const/4 v4, 0x0

    move-object v7, v5

    const/4 v5, 0x0

    move v8, v6

    const/4 v6, 0x0

    move-object v10, v7

    move v9, v8

    const-wide/16 v7, 0x0

    move v11, v9

    const/4 v9, 0x0

    move-object v14, v10

    const/4 v10, 0x0

    move/from16 v18, v11

    const/4 v11, 0x0

    move-object/from16 v19, v14

    const/4 v14, 0x0

    move/from16 v0, v18

    move-object/from16 v20, v19

    invoke-static/range {v1 .. v16}, Lf01/w;->f(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Lny0/o;Ljava/lang/String;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sget-object v1, Lb2/t;->w:Lb2/t;

    move-object/from16 v2, v20

    invoke-static {v1, v0, v13, v2}, Ljh3/c;->y(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    new-instance v18, Lny0/o;

    sget-object v19, Lny0/q$g;->f:Lny0/q$g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/i0;->w()I

    move-result v20

    const/16 v29, 0x3fc

    const/16 v30, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-direct/range {v18 .. v30}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {v17 .. v17}, Ll31/e;->m()Lc93/m;

    move-result-object v12

    const/16 v16, 0xfd

    move-object v4, v1

    const/4 v1, 0x0

    move-object v14, v2

    move-object v2, v3

    const/4 v3, 0x0

    move-object v5, v4

    const/4 v4, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    move-object v9, v7

    const-wide/16 v7, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object/from16 v20, v14

    const/high16 v14, 0x30000000

    const-string v11, "Card Icon Button"

    move-object/from16 v33, v10

    move-object/from16 v10, v18

    move-object/from16 v32, v20

    invoke-static/range {v1 .. v16}, Lf01/w;->f(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Lny0/o;Ljava/lang/String;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v32

    move-object/from16 v2, v33

    invoke-static {v2, v0, v13, v1}, Ljh3/c;->y(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v18, "SUPPORT TEXT"

    move-object v2, v3

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v20, "91%"

    invoke-static/range {v20 .. v20}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual/range {v17 .. v17}, Ll31/e;->k()Lc93/m;

    move-result-object v12

    const/16 v16, 0x3d9

    move-object v14, v1

    const/4 v1, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v32, v14

    const/4 v14, 0x0

    move-object/from16 v34, v32

    move-object/from16 v35, v33

    invoke-static/range {v1 .. v16}, Lf01/w;->f(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Lny0/o;Ljava/lang/String;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v34

    move-object/from16 v2, v35

    invoke-static {v2, v0, v13, v1}, Ljh3/c;->y(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    move-object/from16 v33, v2

    move-object v2, v3

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static/range {v20 .. v20}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget-object v4, Lx81/d;->a:Lx81/d;

    const/4 v5, 0x6

    invoke-virtual {v4, v13, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->b0()J

    move-result-wide v7

    invoke-virtual/range {v17 .. v17}, Ll31/e;->n()Lc93/m;

    move-result-object v12

    const/16 v16, 0x399

    move-object v14, v1

    const/4 v1, 0x0

    move-object v5, v4

    const/4 v4, 0x0

    move-object v9, v5

    const/4 v5, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    move-object/from16 v20, v11

    const/4 v11, 0x0

    move-object/from16 v32, v14

    const/4 v14, 0x0

    move-object/from16 v36, v20

    move-object/from16 v37, v32

    move-object/from16 v38, v33

    invoke-static/range {v1 .. v16}, Lf01/w;->f(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Lny0/o;Ljava/lang/String;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v37

    move-object/from16 v2, v38

    invoke-static {v2, v0, v13, v1}, Ljh3/c;->y(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    move-object/from16 v33, v2

    move-object v2, v3

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual/range {v17 .. v17}, Ll31/e;->q()Lc93/m;

    move-result-object v12

    const/16 v16, 0x3f9

    move-object v14, v1

    const/4 v1, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    move-object/from16 v32, v14

    const/4 v14, 0x0

    move-object/from16 v39, v32

    move-object/from16 v40, v33

    invoke-static/range {v1 .. v16}, Lf01/w;->f(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Lny0/o;Ljava/lang/String;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v39

    move-object/from16 v2, v40

    invoke-static {v2, v0, v13, v1}, Ljh3/c;->y(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v4, "Button Text"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual/range {v17 .. v17}, Ll31/e;->r()Lc93/m;

    move-result-object v12

    const/16 v16, 0x3f5

    move-object v14, v1

    const/4 v1, 0x0

    move-object/from16 v33, v2

    move-object v2, v3

    const/4 v3, 0x0

    move-object/from16 v32, v14

    const/4 v14, 0x0

    move-object/from16 v41, v32

    move-object/from16 v42, v33

    invoke-static/range {v1 .. v16}, Lf01/w;->f(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Lny0/o;Ljava/lang/String;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v41

    move-object/from16 v2, v42

    invoke-static {v2, v0, v13, v1}, Ljh3/c;->y(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    new-instance v10, Lny0/o;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/i0;->w()I

    move-result v21

    const/16 v30, 0x3fc

    const/16 v31, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-object/from16 v20, v19

    move-object/from16 v19, v10

    invoke-direct/range {v19 .. v31}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {v17 .. v17}, Ll31/e;->p()Lc93/m;

    move-result-object v12

    const/16 v16, 0x2fd

    move-object v14, v1

    const/4 v1, 0x0

    move-object/from16 v33, v2

    move-object v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v32, v14

    const/4 v14, 0x0

    move-object/from16 v43, v32

    move-object/from16 v44, v33

    invoke-static/range {v1 .. v16}, Lf01/w;->f(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Lny0/o;Ljava/lang/String;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v43

    move-object/from16 v1, v44

    invoke-static {v1, v0, v13, v14}, Ljh3/c;->y(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual/range {v17 .. v17}, Ll31/e;->l()Lc93/m;

    move-result-object v12

    const/16 v16, 0x37d

    move-object/from16 v33, v1

    const/4 v1, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    move-object/from16 v45, v33

    invoke-static/range {v1 .. v16}, Lf01/w;->f(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Lny0/o;Ljava/lang/String;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    const-string v1, "CARD WITH LONG TITLE TEXT WHICH WORD WRAPS"

    move-object/from16 v2, v45

    invoke-static {v2, v0, v13, v1}, Ljh3/c;->y(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v0, "Compose Text%"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const-string v0, "Support Text"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/4 v0, 0x6

    move-object/from16 v5, v36

    invoke-virtual {v5, v13, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b0()J

    move-result-wide v7

    invoke-virtual/range {v17 .. v17}, Ll31/e;->j()Lc93/m;

    move-result-object v12

    const/16 v16, 0x339

    const/4 v1, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v16}, Lf01/w;->f(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Lny0/o;Ljava/lang/String;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    sget-object v14, Ll83/a0;->a:Ll83/a0;

    move-object v15, v14

    move-object/from16 v16, v14

    move-object/from16 v17, v14

    move-object/from16 v18, v14

    move-object/from16 v19, v14

    move-object/from16 v20, v14

    move-object/from16 v21, v14

    move-object/from16 v22, v14

    move-object/from16 v23, v14

    move-object/from16 v24, v14

    move-object/from16 v25, v14

    move-object/from16 v26, v14

    move-object/from16 v27, v14

    move-object/from16 v28, v14

    move-object/from16 v29, v14

    move-object/from16 v30, v14

    filled-new-array/range {v14 .. v30}, [Ll83/a0;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    goto :goto_1

    :cond_1
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Lk71/a0;

    const/16 v2, 0x14

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lk71/a0;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Ll31/o;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

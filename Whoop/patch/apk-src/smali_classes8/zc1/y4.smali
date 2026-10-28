.class public abstract Lzc1/y4;
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
        "design-showcase_release"
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

    invoke-static {p0, p1, p2}, Lzc1/y4;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 51

    move-object/from16 v1, p0

    check-cast v1, Lp1/q;

    const v2, -0x43da0e64

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    const/4 v2, 0x1

    if-eqz p1, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    and-int/lit8 v4, p1, 0x1

    invoke-virtual {v1, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_4

    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->N:Lb2/k;

    sget-object v6, Ll0/m;->c:Ll0/g;

    const/16 v7, 0x30

    invoke-static {v6, v5, v1, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v1, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v1, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v9, v1, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v1, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v1, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v1, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v1, Lp1/q;->S:Z

    if-nez v7, :cond_2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    :cond_2
    invoke-static {v6, v1, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v1, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v3, "Relaxed Meter"

    const/4 v5, 0x6

    invoke-static {v3, v1, v5}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v3, v3

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v1, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {}, Lz71/a;->d()Li91/a;

    move-result-object v5

    move v6, v2

    invoke-static {}, Lz71/a;->f()Li91/a;

    move-result-object v2

    const-string v23, "0.0"

    move-object v7, v5

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v1, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->X()J

    move-result-wide v10

    const-string v12, "RELAXED"

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    const-string v24, "Last updated 2:05pm"

    move-object/from16 v19, v1

    move-object v1, v7

    move-wide/from16 v49, v10

    move-object v10, v8

    move-wide/from16 v7, v49

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    move v13, v6

    move-object v6, v12

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    const-string v25, "3.0"

    move v14, v13

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    sget v15, Li91/a;->a:I

    or-int/lit16 v14, v15, 0xc00

    shl-int/lit8 v26, v15, 0x3

    or-int v14, v14, v26

    sget v21, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v27, v21, 0xc

    or-int v14, v14, v27

    shl-int/lit8 v28, v21, 0xf

    or-int v14, v14, v28

    shl-int/lit8 v29, v21, 0x18

    or-int v14, v14, v29

    shl-int/lit8 v30, v21, 0x1b

    or-int v20, v14, v30

    const v22, 0xf884

    move v14, v3

    const/4 v3, 0x0

    move-object/from16 v16, v4

    const/4 v4, 0x0

    move/from16 v18, v9

    move-object/from16 v17, v10

    const-wide/16 v9, 0x0

    move/from16 v31, v14

    const/4 v14, 0x0

    move/from16 v32, v15

    const/4 v15, 0x0

    move-object/from16 v33, v16

    const/16 v16, 0x0

    move-object/from16 v34, v17

    const/16 v17, 0x0

    move/from16 v35, v18

    const/16 v18, 0x0

    move/from16 v0, v31

    move/from16 v38, v32

    move-object/from16 v39, v33

    move-object/from16 v36, v34

    move/from16 v37, v35

    invoke-static/range {v1 .. v22}, Lz71/l;->n(Li91/a;Li91/a;ZFLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;ZLc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v19

    const-string v2, "Balanced Meter"

    const/4 v3, 0x6

    invoke-static {v2, v1, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v2, v39

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v1, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {}, Lz71/a;->d()Li91/a;

    move-result-object v3

    move-object/from16 v16, v2

    invoke-static {}, Lz71/a;->f()Li91/a;

    move-result-object v2

    const-string v4, "1.5"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    move-object/from16 v4, v36

    move/from16 v6, v37

    invoke-virtual {v4, v1, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->j()J

    move-result-wide v7

    const-string v9, "BALANCED"

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    move-object v1, v3

    const/4 v3, 0x0

    move-object/from16 v17, v4

    const/high16 v4, 0x3f000000    # 0.5f

    move/from16 v35, v6

    move-object v6, v9

    const-wide/16 v9, 0x0

    move-object/from16 v33, v16

    const/16 v16, 0x0

    move-object/from16 v34, v17

    const/16 v17, 0x0

    move-object/from16 v42, v33

    move-object/from16 v40, v34

    move/from16 v41, v35

    invoke-static/range {v1 .. v22}, Lz71/l;->n(Li91/a;Li91/a;ZFLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;ZLc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v19

    const-string v2, "Stressed Meter"

    const/4 v3, 0x6

    invoke-static {v2, v1, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v2, v42

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v1, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {}, Lz71/a;->d()Li91/a;

    move-result-object v3

    move-object/from16 v16, v2

    invoke-static {}, Lz71/a;->f()Li91/a;

    move-result-object v2

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    move-object/from16 v4, v40

    move/from16 v6, v41

    invoke-virtual {v4, v1, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->f()J

    move-result-wide v7

    const-string v9, "stressed"

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    move-object v1, v3

    const/4 v3, 0x0

    move-object/from16 v17, v4

    const/high16 v4, 0x3f800000    # 1.0f

    move/from16 v35, v6

    move-object v6, v9

    const-wide/16 v9, 0x0

    move-object/from16 v33, v16

    const/16 v16, 0x0

    move-object/from16 v34, v17

    const/16 v17, 0x0

    move-object/from16 v45, v33

    move-object/from16 v43, v34

    move/from16 v44, v35

    invoke-static/range {v1 .. v22}, Lz71/l;->n(Li91/a;Li91/a;ZFLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;ZLc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v19

    const-string v2, "No Highlight"

    const/4 v3, 0x6

    invoke-static {v2, v1, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v2, v45

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v1, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {}, Lz71/a;->d()Li91/a;

    move-result-object v3

    move-object/from16 v16, v2

    invoke-static {}, Lz71/a;->f()Li91/a;

    move-result-object v2

    const-string v24, "--"

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    move-object/from16 v4, v43

    move/from16 v6, v44

    invoke-virtual {v4, v1, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->I()J

    move-result-wide v7

    const-string v31, "NO DATA"

    move/from16 v35, v6

    invoke-static/range {v31 .. v31}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const-string v32, "Invalid Time"

    invoke-static/range {v32 .. v32}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    move/from16 v9, v38

    or-int/lit16 v9, v9, 0xd80

    or-int v9, v9, v26

    or-int v9, v9, v27

    or-int v9, v9, v28

    or-int v9, v9, v29

    or-int v20, v9, v30

    const v22, 0xf880

    move-object v1, v3

    const/4 v3, 0x0

    move-object/from16 v17, v4

    const/high16 v4, 0x3f800000    # 1.0f

    const-wide/16 v9, 0x0

    move-object/from16 v33, v16

    const/16 v16, 0x0

    move-object/from16 v34, v17

    const/16 v17, 0x0

    move-object/from16 v48, v33

    move-object/from16 v46, v34

    move/from16 v47, v35

    invoke-static/range {v1 .. v22}, Lz71/l;->n(Li91/a;Li91/a;ZFLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;ZLc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v19

    move/from16 v2, v21

    const-string v3, "Loading"

    const/4 v4, 0x6

    invoke-static {v3, v1, v4}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v3, v48

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v1, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {}, Lz71/a;->d()Li91/a;

    move-result-object v0

    invoke-static {}, Lz71/a;->f()Li91/a;

    move-result-object v3

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    move-object/from16 v4, v46

    move/from16 v6, v47

    invoke-virtual {v4, v1, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->I()J

    move-result-wide v7

    invoke-static/range {v31 .. v31}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static/range {v32 .. v32}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const-string v4, "LOADING PROMPT"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    or-int/lit16 v4, v2, 0x180

    shl-int/lit8 v2, v2, 0x9

    or-int v21, v4, v2

    const v22, 0xc880

    move-object v2, v3

    const/4 v3, 0x1

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v15, 0x1

    move-object v1, v0

    invoke-static/range {v1 .. v22}, Lz71/l;->n(Li91/a;Li91/a;ZFLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;ZLc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v19

    const/4 v14, 0x1

    invoke-virtual {v1, v14}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v1, Lzc1/s3;

    const/16 v2, 0x1c

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lzc1/s3;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/y4;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

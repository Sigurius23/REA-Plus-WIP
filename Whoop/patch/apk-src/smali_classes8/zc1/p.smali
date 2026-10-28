.class public abstract Lzc1/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "d",
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
.method public static synthetic a(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/p;->f(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/p;->g(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/p;->e(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/runtime/Composer;I)V
    .locals 41

    move-object/from16 v14, p0

    check-cast v14, Lp1/q;

    const v1, -0x495ebbe4

    invoke-virtual {v14, v1}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    and-int/lit8 v4, p1, 0x1

    invoke-virtual {v14, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_c

    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->M:Lb2/k;

    const/4 v6, 0x2

    int-to-float v7, v6

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float v9, v7, v8

    invoke-static {v9}, Ll0/m;->i(F)Ll0/k;

    move-result-object v10

    const/16 v11, 0x36

    invoke-static {v10, v5, v14, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v11, v14, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v14, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v15, v14, Lp1/q;->S:Z

    if-eqz v15, :cond_1

    invoke-virtual {v14, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_1
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v14, v15, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v14, v10, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v2, v14, Lp1/q;->S:Z

    if-nez v2, :cond_2

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    invoke-static {v11, v14, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v14, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v2, "Interactive Markdown Text"

    const/4 v3, 0x6

    invoke-static {v2, v14, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    const-string v11, "## Markdown Text\n\nThis is a sample markdown text with **bold** and *italic* formatting."

    move/from16 v17, v7

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v2, v7, :cond_4

    invoke-static {v11}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v2, Lp1/c1;

    move/from16 v18, v3

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v7, :cond_5

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v3, Lp1/c1;

    move/from16 v19, v8

    const/4 v8, 0x0

    move-object/from16 v20, v1

    invoke-static {v4, v9, v8, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    new-instance v6, Lsz0/c;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v22

    move-object/from16 v8, v22

    check-cast v8, Ljava/lang/String;

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v22

    check-cast v22, Ljava/lang/Boolean;

    move-object/from16 v23, v3

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-direct {v6, v8, v3}, Lsz0/c;-><init>(Ljava/lang/String;Z)V

    sget v3, Lsz0/c;->c:I

    const/4 v8, 0x3

    shl-int/2addr v3, v8

    or-int/lit8 v3, v3, 0x6

    const/4 v8, 0x0

    invoke-static {v1, v6, v14, v3, v8}, Lsz0/b;->b(Landroidx/compose/ui/Modifier;Lsz0/c;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float v1, v1, v17

    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v14, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move v3, v9

    const-wide/high16 v8, 0x4004000000000000L    # 2.5

    double-to-float v6, v8

    mul-float v6, v6, v19

    const/4 v8, 0x0

    const/4 v9, 0x2

    invoke-static {v4, v6, v8, v9}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const-string v17, "Input Markdown Text"

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    move/from16 v19, v3

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    const-string v21, "Please input valid Markdown Text"

    invoke-static/range {v21 .. v21}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v7, :cond_6

    new-instance v8, Lyb0/e;

    const/16 v9, 0xf

    invoke-direct {v8, v9, v2}, Lyb0/e;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v8, Lkotlin/jvm/functions/Function1;

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v9, v2, 0x3

    const v24, 0x36db0006

    or-int v9, v9, v24

    shl-int/lit8 v24, v2, 0x6

    or-int v9, v9, v24

    shl-int/lit8 v24, v2, 0x9

    or-int v9, v9, v24

    shl-int/lit8 v24, v2, 0xc

    or-int v9, v9, v24

    const/16 v24, 0x0

    const/16 v16, 0x180

    move/from16 v25, v2

    move-object/from16 v2, v17

    const/16 v17, 0xc00

    move/from16 v26, v1

    move-object v1, v6

    const/16 v6, 0x1388

    move-object/from16 v27, v7

    const/4 v7, 0x5

    move-object/from16 v28, v13

    move-object v13, v8

    const/4 v8, 0x0

    move-object/from16 v29, v15

    move v15, v9

    const/4 v9, 0x1

    move-object/from16 v30, v10

    const/4 v10, 0x0

    move-object/from16 v31, v4

    move-object v4, v11

    const/4 v11, 0x0

    move-object/from16 v32, v12

    const/4 v12, 0x0

    move-object/from16 v18, v5

    move-object/from16 v37, v20

    move-object/from16 v5, v21

    move/from16 v38, v26

    move-object/from16 v40, v27

    move-object/from16 v33, v28

    move-object/from16 v34, v29

    move-object/from16 v35, v30

    move-object/from16 v39, v31

    move-object/from16 v36, v32

    const/4 v0, 0x3

    invoke-static/range {v1 .. v17}, Lhy0/l1;->e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIZZZLb91/a;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    const-string v1, "Show Divider"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    new-instance v2, Lsy0/k$g;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v3, v0, v3}, Lsy0/k$g;-><init>(Lb91/a;Lb2/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface/range {v23 .. v23}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v6, v40

    if-ne v5, v6, :cond_7

    new-instance v5, Lyb0/e;

    const/16 v6, 0x10

    move-object/from16 v7, v23

    invoke-direct {v5, v6, v7}, Lyb0/e;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v13, v5

    check-cast v13, Lkotlin/jvm/functions/Function1;

    move/from16 v5, v25

    or-int/lit16 v5, v5, 0x6c00

    sget v6, Lsy0/k$g;->d:I

    shl-int/2addr v6, v0

    or-int v15, v5, v6

    const/16 v16, 0x6

    const/16 v17, 0x3e0

    move-object v5, v3

    move v3, v4

    const/4 v4, 0x1

    move-object v6, v5

    const/4 v5, 0x1

    move-object v8, v6

    const-wide/16 v6, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    move-object/from16 v20, v11

    const-wide/16 v11, 0x0

    move/from16 v22, v0

    move-object/from16 v0, v20

    invoke-static/range {v1 .. v17}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    const-string v1, "Medical Disclaimer - Variants"

    const/4 v2, 0x6

    invoke-static {v1, v14, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move/from16 v3, v19

    move-object/from16 v1, v39

    const/4 v8, 0x0

    const/4 v9, 0x2

    invoke-static {v1, v3, v8, v9}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Ll0/m;->c:Ll0/g;

    move-object/from16 v4, v18

    const/4 v8, 0x0

    invoke-static {v3, v4, v14, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v14, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v14, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v6, v14, Lp1/q;->S:Z

    if-eqz v6, :cond_8

    move-object/from16 v6, v33

    invoke-virtual {v14, v6}, Lp1/q;->l(Lc93/a;)V

    :goto_2
    move-object/from16 v6, v34

    goto :goto_3

    :cond_8
    invoke-virtual {v14}, Lp1/q;->s0()V

    goto :goto_2

    :goto_3
    invoke-static {v14, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v35

    invoke-static {v14, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v14, Lp1/q;->S:Z

    if-nez v3, :cond_9

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    :cond_9
    move-object/from16 v3, v36

    goto :goto_5

    :cond_a
    :goto_4
    move-object/from16 v3, v37

    goto :goto_6

    :goto_5
    invoke-static {v4, v14, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_4

    :goto_6
    invoke-static {v14, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, -0x6d7f8639

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    invoke-static {}, Lsz0/b;->g()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lsz0/c;

    sget v4, Lsz0/c;->c:I

    shl-int/lit8 v4, v4, 0x3

    const/4 v5, 0x1

    invoke-static {v0, v3, v14, v4, v5}, Lsz0/b;->b(Landroidx/compose/ui/Modifier;Lsz0/c;Landroidx/compose/runtime/Composer;II)V

    move/from16 v7, v38

    invoke-static {v7, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v14, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    goto :goto_7

    :cond_b
    const/4 v5, 0x1

    invoke-static {v14, v8, v5, v5}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_8

    :cond_c
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_d

    new-instance v1, Lzc1/j;

    const/4 v2, 0x5

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lzc1/j;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final e(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/p;->d(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

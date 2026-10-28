.class public abstract Lzc1/a8;
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

    invoke-static {p0, p1, p2}, Lzc1/a8;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 51

    move-object/from16 v8, p0

    check-cast v8, Lp1/q;

    const v1, 0x66d33abc

    invoke-virtual {v8, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    and-int/lit8 v3, p1, 0x1

    invoke-virtual {v8, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_4

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->N:Lb2/k;

    sget-object v6, Ll0/m;->c:Ll0/g;

    const/16 v7, 0x30

    invoke-static {v6, v5, v8, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v8, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-eqz v10, :cond_1

    invoke-virtual {v8, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v8, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v8, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-nez v7, :cond_2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    :cond_2
    invoke-static {v6, v8, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v8, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v4, "Default"

    const/4 v5, 0x6

    invoke-static {v4, v8, v5}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move v4, v1

    new-instance v1, Lcom/whoop/design/util/TextResource$e;

    const-string v5, "A long tag Label"

    invoke-direct {v1, v5}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    sget v27, Lcom/whoop/design/util/TextResource$e;->b:I

    const/16 v29, 0x0

    const v30, 0x7ffffe

    move v6, v2

    move-object v7, v3

    const-wide/16 v2, 0x0

    move v9, v4

    const/4 v4, 0x0

    move-object v11, v5

    move v10, v6

    const-wide/16 v5, 0x0

    move-object v12, v7

    const/4 v7, 0x0

    move-object/from16 v26, v8

    const/4 v8, 0x0

    move v13, v9

    const/4 v9, 0x0

    move v14, v10

    const/4 v10, 0x0

    move-object v15, v11

    const/4 v11, 0x0

    move-object/from16 v16, v12

    const/4 v12, 0x0

    move/from16 v17, v13

    const/4 v13, 0x0

    move/from16 v18, v14

    const/4 v14, 0x0

    move-object/from16 v19, v15

    const/4 v15, 0x0

    move-object/from16 v20, v16

    const/16 v16, 0x0

    move/from16 v21, v17

    const/16 v17, 0x0

    move/from16 v22, v18

    const/16 v18, 0x0

    move-object/from16 v23, v19

    const/16 v19, 0x0

    move-object/from16 v24, v20

    const/16 v20, 0x0

    move/from16 v25, v21

    const/16 v21, 0x0

    move/from16 v28, v22

    const/16 v22, 0x0

    move-object/from16 v31, v23

    const/16 v23, 0x0

    move-object/from16 v32, v24

    const/16 v24, 0x0

    move/from16 v33, v25

    const/16 v25, 0x0

    move/from16 v34, v28

    const/16 v28, 0x0

    move-object/from16 v0, v32

    invoke-static/range {v1 .. v30}, Lhy0/g1;->j(Lcom/whoop/design/util/TextResource;JLi91/d;JLi2/t;ZLy71/g;Li2/t;FLhy0/o1;Li2/a1;FFLy71/g;Li2/x;FLhy0/c1;Lkd1/o;Ljava/util/List;IILandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v8, v26

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v1, v1

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v8, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v2, "Custom Color"

    const/4 v3, 0x6

    invoke-static {v2, v8, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move v2, v1

    new-instance v1, Lcom/whoop/design/util/TextResource$e;

    const-string v3, "Medium"

    invoke-direct {v1, v3}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v8, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v6

    invoke-virtual {v4, v8, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->w()J

    move-result-wide v9

    const v30, 0x7ffff4

    move-object v11, v4

    const/4 v4, 0x0

    move-object v12, v3

    move-wide/from16 v49, v6

    move v6, v2

    move-wide/from16 v2, v49

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v13, v5

    move-wide/from16 v49, v9

    move v10, v6

    move-wide/from16 v5, v49

    const/4 v9, 0x0

    move v14, v10

    const/4 v10, 0x0

    move-object v15, v11

    const/4 v11, 0x0

    move-object/from16 v16, v12

    const/4 v12, 0x0

    move/from16 v17, v13

    const/4 v13, 0x0

    move/from16 v18, v14

    const/4 v14, 0x0

    move-object/from16 v19, v15

    const/4 v15, 0x0

    move-object/from16 v20, v16

    const/16 v16, 0x0

    move/from16 v21, v17

    const/16 v17, 0x0

    move/from16 v22, v18

    const/16 v18, 0x0

    move-object/from16 v23, v19

    const/16 v19, 0x0

    move-object/from16 v24, v20

    const/16 v20, 0x0

    move/from16 v25, v21

    const/16 v21, 0x0

    move/from16 v28, v22

    const/16 v22, 0x0

    move-object/from16 v32, v23

    const/16 v23, 0x0

    move-object/from16 v33, v24

    const/16 v24, 0x0

    move/from16 v35, v25

    const/16 v25, 0x0

    move/from16 v36, v28

    const/16 v28, 0x0

    move-object/from16 v38, v32

    move-object/from16 v40, v33

    move/from16 v39, v35

    move/from16 v37, v36

    invoke-static/range {v1 .. v30}, Lhy0/g1;->j(Lcom/whoop/design/util/TextResource;JLi91/d;JLi2/t;ZLy71/g;Li2/t;FLhy0/o1;Li2/a1;FFLy71/g;Li2/x;FLhy0/c1;Lkd1/o;Ljava/util/List;IILandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v8, v26

    move/from16 v1, v37

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v8, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v2, "Custom Background"

    const/4 v3, 0x6

    invoke-static {v2, v8, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move v14, v1

    new-instance v1, Lcom/whoop/design/util/TextResource$e;

    const-string v2, "Tag"

    invoke-direct {v1, v2}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    move-object/from16 v3, v38

    move/from16 v4, v39

    invoke-virtual {v3, v8, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->x()J

    move-result-wide v5

    const v30, 0x7ffffc

    move/from16 v17, v4

    const/4 v4, 0x0

    move-object v7, v2

    move-object v15, v3

    move-wide v2, v5

    const-wide/16 v5, 0x0

    move-object v9, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object/from16 v16, v13

    const/4 v13, 0x0

    move/from16 v18, v14

    const/4 v14, 0x0

    move-object/from16 v32, v15

    const/4 v15, 0x0

    move-object/from16 v19, v16

    const/16 v16, 0x0

    move/from16 v35, v17

    const/16 v17, 0x0

    move/from16 v36, v18

    const/16 v18, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v22, v21

    const/16 v21, 0x0

    move-object/from16 v23, v22

    const/16 v22, 0x0

    move-object/from16 v24, v23

    const/16 v23, 0x0

    move-object/from16 v25, v24

    const/16 v24, 0x0

    move-object/from16 v28, v25

    const/16 v25, 0x0

    move-object/from16 v33, v28

    const/16 v28, 0x0

    move-object/from16 v43, v33

    move/from16 v42, v35

    move/from16 v41, v36

    invoke-static/range {v1 .. v30}, Lhy0/g1;->j(Lcom/whoop/design/util/TextResource;JLi91/d;JLi2/t;ZLy71/g;Li2/t;FLhy0/o1;Li2/a1;FFLy71/g;Li2/x;FLhy0/c1;Lkd1/o;Ljava/util/List;IILandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v8, v26

    move/from16 v33, v27

    move/from16 v1, v41

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v8, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v2, "Default With Icon"

    const/4 v3, 0x6

    invoke-static {v2, v8, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move v14, v1

    new-instance v1, Lcom/whoop/design/util/TextResource$e;

    move-object/from16 v15, v31

    invoke-direct {v1, v15}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v9, Ly71/g;

    invoke-virtual/range {v32 .. v32}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/i0;->A()I

    move-result v2

    new-instance v3, Lcom/whoop/design/util/TextResource$e;

    const-string v4, "Up Arrow"

    invoke-direct {v3, v4}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v9, v2, v3}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    sget v31, Ly71/g;->c:I

    shl-int/lit8 v2, v31, 0x12

    or-int v27, v33, v2

    const v30, 0x7fffbe

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    move/from16 v18, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    move/from16 v36, v18

    const/16 v18, 0x0

    move/from16 v44, v36

    invoke-static/range {v1 .. v30}, Lhy0/g1;->j(Lcom/whoop/design/util/TextResource;JLi91/d;JLi2/t;ZLy71/g;Li2/t;FLhy0/o1;Li2/a1;FFLy71/g;Li2/x;FLhy0/c1;Lkd1/o;Ljava/util/List;IILandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v8, v26

    move/from16 v1, v44

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v8, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v2, "Custom Color With Icon"

    const/4 v3, 0x6

    invoke-static {v2, v8, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move v14, v1

    new-instance v1, Lcom/whoop/design/util/TextResource$e;

    move-object/from16 v12, v40

    invoke-direct {v1, v12}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    move-object/from16 v2, v32

    move/from16 v3, v42

    invoke-virtual {v2, v8, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v4

    invoke-virtual {v2, v8, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->w()J

    move-result-wide v6

    new-instance v9, Ly71/g;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v10

    invoke-virtual {v10}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v10

    invoke-virtual {v10}, Lgz0/i0;->v()I

    move-result v10

    const/4 v11, 0x2

    const/4 v12, 0x0

    invoke-direct {v9, v10, v12, v11, v12}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v30, 0x7fffb4

    move/from16 v17, v3

    move-wide v2, v4

    const/4 v4, 0x0

    move-wide v5, v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move/from16 v18, v14

    const/4 v14, 0x0

    move/from16 v35, v17

    const/16 v17, 0x0

    move/from16 v36, v18

    const/16 v18, 0x0

    move-object/from16 v46, v32

    move/from16 v47, v35

    move/from16 v45, v36

    invoke-static/range {v1 .. v30}, Lhy0/g1;->j(Lcom/whoop/design/util/TextResource;JLi91/d;JLi2/t;ZLy71/g;Li2/t;FLhy0/o1;Li2/a1;FFLy71/g;Li2/x;FLhy0/c1;Lkd1/o;Ljava/util/List;IILandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v8, v26

    move/from16 v1, v45

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v8, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v2, "Custom Background With Icon"

    const/4 v3, 0x6

    invoke-static {v2, v8, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move/from16 v36, v1

    new-instance v1, Lcom/whoop/design/util/TextResource$e;

    move-object/from16 v7, v43

    invoke-direct {v1, v7}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    move-object/from16 v2, v46

    move/from16 v3, v47

    invoke-virtual {v2, v8, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->x()J

    move-result-wide v3

    new-instance v9, Ly71/g;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/i0;->r()I

    move-result v5

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-direct {v9, v5, v7, v6, v7}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v30, 0x7fffbc

    move-object/from16 v32, v2

    move-wide v2, v3

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v8, 0x0

    move/from16 v48, v36

    invoke-static/range {v1 .. v30}, Lhy0/g1;->j(Lcom/whoop/design/util/TextResource;JLi91/d;JLi2/t;ZLy71/g;Li2/t;FLhy0/o1;Li2/a1;FFLy71/g;Li2/x;FLhy0/c1;Lkd1/o;Ljava/util/List;IILandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v8, v26

    const/4 v1, 0x6

    const-string v2, "Default With Right Icon"

    invoke-static {v2, v8, v1}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v1, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v1, v2}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v2, Ly71/g;

    invoke-virtual/range {v32 .. v32}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/i0;->k()I

    move-result v3

    new-instance v4, Lcom/whoop/design/util/TextResource$e;

    const-string v5, "Close"

    invoke-direct {v4, v5}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v2, v3, v4}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    shl-int/lit8 v28, v31, 0x9

    const v30, 0x7fdffe

    move-object/from16 v16, v2

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move/from16 v27, v33

    invoke-static/range {v1 .. v30}, Lhy0/g1;->j(Lcom/whoop/design/util/TextResource;JLi91/d;JLi2/t;ZLy71/g;Li2/t;FLhy0/o1;Li2/a1;FFLy71/g;Li2/x;FLhy0/c1;Lkd1/o;Ljava/util/List;IILandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v8, v26

    move/from16 v1, v48

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v8, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v1, "All Background Styles"

    const/4 v2, 0x6

    invoke-static {v1, v8, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x2

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v0, v1, v1}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-wide/high16 v3, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v3

    mul-float/2addr v0, v2

    invoke-static {v0}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    invoke-static {v0}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v0, Lzc1/h1;->a:Lzc1/h1;

    invoke-virtual {v0}, Lzc1/h1;->b()Lkotlin/jvm/functions/Function3;

    move-result-object v7

    const v9, 0x1801b6

    const/16 v10, 0x38

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v10}, Ll0/g2;->a(Landroidx/compose/ui/Modifier;Ll0/i;Ll0/l;Lb2/g;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    const/4 v4, 0x1

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v1, Lzc1/t7;

    const/16 v2, 0x9

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lzc1/t7;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/a8;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

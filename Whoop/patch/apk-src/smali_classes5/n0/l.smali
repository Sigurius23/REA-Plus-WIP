.class public final Ln0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/c0;


# instance fields
.field public final synthetic a:Ln0/u;

.field public final synthetic b:Z

.field public final synthetic c:Ll0/k1;

.field public final synthetic d:Lc93/a;

.field public final synthetic e:Ll0/l;

.field public final synthetic f:Ll0/i;

.field public final synthetic g:Lbc3/c0;

.field public final synthetic h:Li2/f0;

.field public final synthetic i:Lp0/e1;

.field public final synthetic j:Lb2/f;

.field public final synthetic k:Lb2/g;


# direct methods
.method public constructor <init>(Ln0/u;ZLl0/k1;Lj93/u;Ll0/l;Ll0/i;Lbc3/c0;Li2/f0;Lp0/e1;Lb2/f;Lb2/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/l;->a:Ln0/u;

    iput-boolean p2, p0, Ln0/l;->b:Z

    iput-object p3, p0, Ln0/l;->c:Ll0/k1;

    iput-object p4, p0, Ln0/l;->d:Lc93/a;

    iput-object p5, p0, Ln0/l;->e:Ll0/l;

    iput-object p6, p0, Ln0/l;->f:Ll0/i;

    iput-object p7, p0, Ln0/l;->g:Lbc3/c0;

    iput-object p8, p0, Ln0/l;->h:Li2/f0;

    iput-object p9, p0, Ln0/l;->i:Lp0/e1;

    iput-object p10, p0, Ln0/l;->j:Lb2/f;

    iput-object p11, p0, Ln0/l;->k:Lb2/g;

    return-void
.end method


# virtual methods
.method public final a(Lp0/d0;J)Ly2/s0;
    .locals 62

    move-object/from16 v1, p0

    move-object/from16 v11, p1

    move-wide/from16 v2, p2

    iget-object v0, v11, Lp0/d0;->x:Ly2/v1;

    iget-object v4, v1, Ln0/l;->a:Ln0/u;

    iget-object v5, v4, Ln0/u;->s:Lp1/c1;

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    iget-boolean v5, v4, Ln0/u;->b:Z

    const/16 v17, 0x1

    if-nez v5, :cond_1

    invoke-interface {v0}, Ly2/r;->A()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    const/16 v28, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move/from16 v28, v17

    :goto_1
    iget-boolean v5, v1, Ln0/l;->b:Z

    if-eqz v5, :cond_2

    sget-object v7, Lh0/d2;->w:Lh0/d2;

    goto :goto_2

    :cond_2
    sget-object v7, Lh0/d2;->x:Lh0/d2;

    :goto_2
    invoke-static {v2, v3, v7}, Ljc/x;->q(JLh0/d2;)V

    iget-object v7, v1, Ln0/l;->c:Ll0/k1;

    if-eqz v5, :cond_3

    invoke-interface {v0}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v8

    invoke-interface {v7, v8}, Ll0/k1;->b(Ly3/m;)F

    move-result v8

    invoke-interface {v0, v8}, Ly3/c;->F(F)I

    move-result v8

    goto :goto_3

    :cond_3
    invoke-interface {v0}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v8

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/a;->i(Ll0/k1;Ly3/m;)F

    move-result v8

    invoke-interface {v0, v8}, Ly3/c;->F(F)I

    move-result v8

    :goto_3
    if-eqz v5, :cond_4

    invoke-interface {v0}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v9

    invoke-interface {v7, v9}, Ll0/k1;->c(Ly3/m;)F

    move-result v9

    invoke-interface {v0, v9}, Ly3/c;->F(F)I

    move-result v9

    goto :goto_4

    :cond_4
    invoke-interface {v0}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v9

    invoke-static {v7, v9}, Landroidx/compose/foundation/layout/a;->h(Ll0/k1;Ly3/m;)F

    move-result v9

    invoke-interface {v0, v9}, Ly3/c;->F(F)I

    move-result v9

    :goto_4
    invoke-interface {v7}, Ll0/k1;->d()F

    move-result v10

    invoke-interface {v0, v10}, Ly3/c;->F(F)I

    move-result v10

    invoke-interface {v7}, Ll0/k1;->a()F

    move-result v7

    invoke-interface {v0, v7}, Ly3/c;->F(F)I

    move-result v7

    add-int/2addr v7, v10

    add-int v12, v8, v9

    if-eqz v5, :cond_5

    move v13, v7

    goto :goto_5

    :cond_5
    move v13, v12

    :goto_5
    if-eqz v5, :cond_6

    move/from16 v23, v10

    goto :goto_6

    :cond_6
    if-nez v5, :cond_7

    move/from16 v23, v8

    goto :goto_6

    :cond_7
    move/from16 v23, v9

    :goto_6
    sub-int v19, v13, v23

    neg-int v9, v12

    neg-int v13, v7

    invoke-static {v9, v2, v3, v13}, Ly3/b;->i(IJI)J

    move-result-wide v13

    iget-object v9, v1, Ln0/l;->d:Lc93/a;

    invoke-interface {v9}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ln0/i;

    iget-object v15, v9, Ln0/i;->c:Landroidx/compose/foundation/lazy/b;

    invoke-static {v13, v14}, Ly3/a;->i(J)I

    move-result v6

    invoke-static {v13, v14}, Ly3/a;->h(J)I

    move-result v2

    iget-object v3, v15, Landroidx/compose/foundation/lazy/b;->a:Lp1/h1;

    invoke-virtual {v3, v6}, Lp1/h1;->y(I)V

    iget-object v3, v15, Landroidx/compose/foundation/lazy/b;->b:Lp1/h1;

    invoke-virtual {v3, v2}, Lp1/h1;->y(I)V

    iget-object v2, v1, Ln0/l;->f:Ll0/i;

    const-string v18, "null verticalArrangement when isVertical == true"

    iget-object v3, v1, Ln0/l;->e:Ll0/l;

    if-eqz v5, :cond_9

    if-eqz v3, :cond_8

    invoke-interface {v3}, Ll0/l;->a()F

    move-result v6

    goto :goto_7

    :cond_8
    invoke-static/range {v18 .. v18}, Lk0/a;->b(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :cond_9
    if-eqz v2, :cond_72

    invoke-interface {v2}, Ll0/i;->a()F

    move-result v6

    :goto_7
    invoke-interface {v0, v6}, Ly3/c;->F(F)I

    move-result v20

    iget-object v6, v9, Ln0/i;->b:Ln0/f;

    invoke-virtual {v6}, Ln0/f;->m()Lab/h0;

    move-result-object v6

    iget v6, v6, Lab/h0;->x:I

    if-eqz v5, :cond_a

    invoke-static/range {p2 .. p3}, Ly3/a;->h(J)I

    move-result v5

    sub-int/2addr v5, v7

    :goto_8
    move-object v15, v2

    move-object/from16 v21, v3

    goto :goto_9

    :cond_a
    invoke-static/range {p2 .. p3}, Ly3/a;->i(J)I

    move-result v5

    sub-int/2addr v5, v12

    goto :goto_8

    :goto_9
    int-to-long v2, v8

    const/16 v33, 0x20

    shl-long v2, v2, v33

    move-wide/from16 v24, v2

    int-to-long v2, v10

    const-wide v34, 0xffffffffL

    and-long v2, v2, v34

    or-long v2, v24, v2

    new-instance v24, Ln0/k;

    iget-object v11, v1, Ln0/l;->k:Lb2/g;

    iget-object v8, v1, Ln0/l;->a:Ln0/u;

    move v10, v5

    iget-boolean v5, v1, Ln0/l;->b:Z

    move/from16 v22, v10

    iget-object v10, v1, Ln0/l;->j:Lb2/f;

    move-object/from16 v41, v0

    move-object v0, v4

    move/from16 v37, v7

    move-object/from16 v16, v8

    move/from16 v38, v12

    move-object/from16 v40, v21

    move/from16 v39, v22

    move/from16 v12, v23

    move-object/from16 v7, p1

    move v8, v6

    move-object v6, v9

    move/from16 v9, v20

    move/from16 v59, v19

    move-object/from16 v19, v15

    move-wide/from16 v60, v13

    move/from16 v13, v59

    move-wide v14, v2

    move-wide/from16 v3, v60

    move-object/from16 v2, v24

    invoke-direct/range {v2 .. v16}, Ln0/k;-><init>(JZLn0/i;Lp0/d0;IILb2/f;Lb2/g;IIJLn0/u;)V

    move v10, v8

    move-wide/from16 v59, v3

    move-object v3, v2

    move v2, v9

    move-wide/from16 v8, v59

    invoke-static {}, Lyl/a;->c()Lz1/f;

    move-result-object v4

    if-eqz v4, :cond_b

    invoke-virtual {v4}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v5

    goto :goto_a

    :cond_b
    const/4 v5, 0x0

    :goto_a
    invoke-static {v4}, Lyl/a;->e(Lz1/f;)Lz1/f;

    move-result-object v7

    :try_start_0
    iget-object v14, v0, Ln0/u;->e:Ll2/a;

    iget-object v15, v14, Ll2/a;->b:Ljava/lang/Object;

    check-cast v15, Lp1/h1;

    invoke-virtual {v15}, Lp1/h1;->x()I

    move-result v15

    iget-object v11, v14, Ll2/a;->d:Ljava/lang/Object;

    invoke-static {v15, v11, v6}, Lp0/y;->k(ILjava/lang/Object;Lp0/b0;)I

    move-result v11

    if-eq v15, v11, :cond_c

    move/from16 v42, v2

    iget-object v2, v14, Ll2/a;->b:Ljava/lang/Object;

    check-cast v2, Lp1/h1;

    invoke-virtual {v2, v11}, Lp1/h1;->y(I)V

    iget-object v2, v14, Ll2/a;->e:Ljava/lang/Object;

    check-cast v2, Lp0/f0;

    invoke-virtual {v2, v15}, Lp0/f0;->a(I)V

    goto :goto_b

    :catchall_0
    move-exception v0

    goto/16 :goto_5d

    :cond_c
    move/from16 v42, v2

    :goto_b
    iget-object v2, v14, Ll2/a;->c:Ljava/lang/Object;

    check-cast v2, Lp1/h1;

    invoke-virtual {v2}, Lp1/h1;->x()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v4, v7, v5}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    iget-object v4, v0, Ln0/u;->r:Lp0/h0;

    iget-object v5, v0, Ln0/u;->o:Laj/d;

    invoke-static {v6, v4, v5}, Lp0/y;->j(Lp0/b0;Lp0/h0;Laj/d;)Ljava/util/List;

    move-result-object v4

    invoke-interface/range {v41 .. v41}, Ly2/r;->A()Z

    move-result v5

    if-nez v5, :cond_e

    if-nez v28, :cond_d

    goto :goto_c

    :cond_d
    iget-object v5, v0, Ln0/u;->w:Lp0/n0;

    iget-object v5, v5, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v5, Ld0/m;

    iget-object v5, v5, Ld0/m;->x:Lp1/k1;

    invoke-virtual {v5}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    goto :goto_d

    :cond_e
    :goto_c
    iget v5, v0, Ln0/u;->h:F

    :goto_d
    iget-object v6, v0, Ln0/u;->n:Landroidx/compose/foundation/lazy/layout/b;

    invoke-interface/range {v41 .. v41}, Ly2/r;->A()Z

    move-result v26

    iget-object v7, v0, Ln0/u;->c:Ln0/n;

    iget-object v14, v0, Ln0/u;->v:Lp1/c1;

    if-ltz v12, :cond_f

    goto :goto_e

    :cond_f
    const-string v15, "invalid beforeContentPadding"

    invoke-static {v15}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_e
    if-ltz v13, :cond_10

    goto :goto_f

    :cond_10
    const-string v15, "invalid afterContentPadding"

    invoke-static {v15}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_f
    sget-object v15, Lm83/z;->w:Lm83/z;

    move/from16 v43, v13

    iget-object v13, v3, Ln0/k;->y:Ln0/i;

    move/from16 v20, v2

    iget-boolean v2, v1, Ln0/l;->b:Z

    move/from16 v25, v2

    iget-object v2, v1, Ln0/l;->g:Lbc3/c0;

    move-object/from16 v31, v2

    iget-object v2, v1, Ln0/l;->h:Li2/f0;

    move-object/from16 v44, v0

    const-wide/16 v0, 0x0

    move-object/from16 v45, v14

    sget-object v14, Lm83/y;->w:Lm83/y;

    if-gtz v10, :cond_13

    invoke-static {v8, v9}, Ly3/a;->k(J)I

    move-result v20

    invoke-static {v8, v9}, Ly3/a;->j(J)I

    move-result v21

    new-instance v22, Ljava/util/ArrayList;

    invoke-direct/range {v22 .. v22}, Ljava/util/ArrayList;-><init>()V

    iget-object v4, v13, Ln0/i;->d:Lab/h0;

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v19, 0x0

    const/16 v27, 0x1

    move-object/from16 v32, v2

    move-object/from16 v24, v3

    move-object/from16 v23, v4

    move-object/from16 v18, v6

    invoke-virtual/range {v18 .. v32}, Landroidx/compose/foundation/lazy/layout/b;->d(IIILjava/util/ArrayList;Lab/h0;La2/a;ZZIZIILbc3/c0;Li2/f0;)V

    move-object/from16 v22, v18

    move-object/from16 v2, v24

    if-nez v26, :cond_11

    invoke-virtual/range {v22 .. v22}, Landroidx/compose/foundation/lazy/layout/b;->b()J

    move-result-wide v3

    invoke-static {v3, v4, v0, v1}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_11

    shr-long v0, v3, v33

    long-to-int v0, v0

    invoke-static {v0, v8, v9}, Ly3/b;->g(IJ)I

    move-result v20

    and-long v0, v3, v34

    long-to-int v0, v0

    invoke-static {v0, v8, v9}, Ly3/b;->f(IJ)I

    move-result v21

    :cond_11
    new-instance v0, Ldc1/c;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Ldc1/c;-><init>(I)V

    add-int v1, v20, v38

    move-wide/from16 v3, p2

    invoke-static {v1, v3, v4}, Ly3/b;->g(IJ)I

    move-result v1

    add-int v5, v21, v37

    invoke-static {v5, v3, v4}, Ly3/b;->f(IJ)I

    move-result v3

    move-object/from16 v4, v41

    invoke-interface {v4, v1, v3, v15, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v7

    neg-int v15, v12

    move/from16 v3, v39

    add-int v16, v3, v43

    if-eqz v25, :cond_12

    sget-object v0, Lh0/d2;->w:Lh0/d2;

    :goto_10
    move-object/from16 v18, v0

    goto :goto_11

    :cond_12
    sget-object v0, Lh0/d2;->x:Lh0/d2;

    goto :goto_10

    :goto_11
    new-instance v0, Ln0/n;

    const/4 v9, 0x0

    const/16 v17, 0x0

    const/4 v3, 0x0

    move-object/from16 v41, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    iget-wide v12, v2, Ln0/k;->E:J

    move-object/from16 v11, p1

    move-object v2, v0

    move-object/from16 v10, v31

    move/from16 v20, v42

    move/from16 v19, v43

    invoke-direct/range {v2 .. v20}, Ln0/n;-><init>(Ln0/o;IZFLy2/s0;FZLbc3/c0;Ly3/c;JLjava/util/List;IIILh0/d2;II)V

    move-object/from16 v1, v41

    const/4 v0, 0x0

    goto/16 :goto_5c

    :cond_13
    move-object/from16 v32, v2

    move-object v2, v3

    move-object/from16 v22, v6

    move/from16 v3, v39

    move-object/from16 v46, v41

    if-lt v11, v10, :cond_14

    add-int/lit8 v11, v10, -0x1

    const/16 v20, 0x0

    :cond_14
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v21

    sub-int v20, v20, v21

    if-nez v11, :cond_15

    if-gez v20, :cond_15

    add-int v21, v21, v20

    const/16 v20, 0x0

    :cond_15
    new-instance v0, Lm83/m;

    invoke-direct {v0}, Lm83/m;-><init>()V

    neg-int v1, v12

    if-gez v42, :cond_16

    move/from16 v23, v42

    :goto_12
    move/from16 v39, v1

    goto :goto_13

    :cond_16
    const/16 v23, 0x0

    goto :goto_12

    :goto_13
    add-int v1, v39, v23

    add-int v20, v20, v1

    move/from16 v23, v5

    move-object/from16 v24, v14

    move-object/from16 v41, v15

    move/from16 v5, v20

    move/from16 v20, v11

    const/4 v11, 0x0

    :goto_14
    iget-wide v14, v2, Ln0/k;->E:J

    if-gez v5, :cond_17

    if-lez v20, :cond_17

    move-object/from16 v47, v13

    add-int/lit8 v13, v20, -0x1

    invoke-virtual {v2, v13, v14, v15}, Ln0/k;->Q(IJ)Ln0/o;

    move-result-object v14

    const/4 v15, 0x0

    invoke-virtual {v0, v15, v14}, Lm83/m;->add(ILjava/lang/Object;)V

    iget v15, v14, Ln0/o;->r:I

    invoke-static {v11, v15}, Ljava/lang/Math;->max(II)I

    move-result v11

    iget v14, v14, Ln0/o;->q:I

    add-int/2addr v5, v14

    move/from16 v20, v13

    move-object/from16 v13, v47

    goto :goto_14

    :cond_17
    move-object/from16 v47, v13

    const/4 v13, 0x0

    if-ge v5, v1, :cond_18

    sub-int v5, v1, v5

    sub-int v21, v21, v5

    move v5, v1

    :cond_18
    move/from16 v48, v21

    sub-int/2addr v5, v1

    const/16 v36, 0x0

    add-int v16, v3, v43

    if-gez v16, :cond_19

    :goto_15
    move/from16 v21, v11

    goto :goto_16

    :cond_19
    move/from16 v13, v16

    goto :goto_15

    :goto_16
    neg-int v11, v5

    move/from16 v29, v5

    move v5, v11

    move/from16 v30, v20

    const/4 v11, 0x0

    const/16 v27, 0x0

    :goto_17
    iget v6, v0, Lm83/m;->y:I

    if-ge v11, v6, :cond_1b

    if-lt v5, v13, :cond_1a

    invoke-virtual {v0, v11}, Lm83/m;->c(I)Ljava/lang/Object;

    move/from16 v27, v17

    goto :goto_17

    :cond_1a
    add-int/lit8 v30, v30, 0x1

    invoke-virtual {v0, v11}, Lm83/m;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ln0/o;

    iget v6, v6, Ln0/o;->q:I

    add-int/2addr v5, v6

    add-int/lit8 v11, v11, 0x1

    goto :goto_17

    :cond_1b
    move/from16 v11, v21

    move/from16 v49, v27

    move/from16 v21, v29

    move/from16 v6, v30

    :goto_18
    if-ge v6, v10, :cond_1d

    if-lt v5, v13, :cond_1c

    if-lez v5, :cond_1c

    invoke-virtual {v0}, Lm83/m;->isEmpty()Z

    move-result v27

    if-eqz v27, :cond_1d

    :cond_1c
    move/from16 v27, v13

    goto :goto_19

    :cond_1d
    move-wide/from16 v50, v8

    goto :goto_1b

    :goto_19
    invoke-virtual {v2, v6, v14, v15}, Ln0/k;->Q(IJ)Ln0/o;

    move-result-object v13

    move-wide/from16 v50, v8

    iget v8, v13, Ln0/o;->q:I

    add-int/2addr v5, v8

    if-gt v5, v1, :cond_1e

    add-int/lit8 v9, v10, -0x1

    if-eq v6, v9, :cond_1e

    add-int/lit8 v9, v6, 0x1

    sub-int v8, v21, v8

    move/from16 v21, v8

    move/from16 v20, v9

    move/from16 v49, v17

    goto :goto_1a

    :cond_1e
    iget v8, v13, Ln0/o;->r:I

    invoke-static {v11, v8}, Ljava/lang/Math;->max(II)I

    move-result v8

    invoke-virtual {v0, v13}, Lm83/m;->addLast(Ljava/lang/Object;)V

    move v11, v8

    :goto_1a
    add-int/lit8 v6, v6, 0x1

    move/from16 v13, v27

    move-wide/from16 v8, v50

    goto :goto_18

    :goto_1b
    if-ge v5, v3, :cond_21

    sub-int v1, v3, v5

    sub-int v21, v21, v1

    add-int/2addr v5, v1

    move/from16 v8, v21

    :goto_1c
    if-ge v8, v12, :cond_1f

    if-lez v20, :cond_1f

    add-int/lit8 v9, v20, -0x1

    invoke-virtual {v2, v9, v14, v15}, Ln0/k;->Q(IJ)Ln0/o;

    move-result-object v13

    move/from16 v27, v1

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v13}, Lm83/m;->add(ILjava/lang/Object;)V

    iget v1, v13, Ln0/o;->r:I

    invoke-static {v11, v1}, Ljava/lang/Math;->max(II)I

    move-result v11

    iget v1, v13, Ln0/o;->q:I

    add-int/2addr v8, v1

    move/from16 v20, v9

    move/from16 v1, v27

    goto :goto_1c

    :cond_1f
    move/from16 v27, v1

    move/from16 v1, v48

    add-int v48, v1, v27

    if-gez v8, :cond_20

    add-int v48, v48, v8

    add-int/2addr v5, v8

    move v8, v5

    move/from16 v9, v20

    move/from16 v13, v48

    const/4 v5, 0x0

    goto :goto_1d

    :cond_20
    move v9, v8

    move v8, v5

    move v5, v9

    move/from16 v9, v20

    move/from16 v13, v48

    goto :goto_1d

    :cond_21
    move/from16 v1, v48

    move v13, v1

    move v8, v5

    move/from16 v9, v20

    move/from16 v5, v21

    :goto_1d
    invoke-static/range {v23 .. v23}, Ljava/lang/Math;->round(F)I

    move-result v20

    move/from16 v21, v6

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->signum(I)I

    move-result v6

    move/from16 v20, v11

    invoke-static {v13}, Ljava/lang/Integer;->signum(I)I

    move-result v11

    if-ne v6, v11, :cond_22

    invoke-static/range {v23 .. v23}, Ljava/lang/Math;->round(F)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    invoke-static {v13}, Ljava/lang/Math;->abs(I)I

    move-result v11

    if-lt v6, v11, :cond_22

    int-to-float v6, v13

    move v11, v6

    goto :goto_1e

    :cond_22
    move/from16 v11, v23

    :goto_1e
    sub-float v6, v23, v11

    const/16 v23, 0x0

    if-eqz v26, :cond_23

    if-le v13, v1, :cond_23

    cmpg-float v27, v6, v23

    if-gtz v27, :cond_23

    sub-int/2addr v13, v1

    int-to-float v1, v13

    add-float/2addr v1, v6

    goto :goto_1f

    :cond_23
    move/from16 v1, v23

    :goto_1f
    if-ltz v5, :cond_24

    goto :goto_20

    :cond_24
    const-string v6, "negative currentFirstItemScrollOffset"

    invoke-static {v6}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_20
    neg-int v6, v5

    invoke-virtual {v0}, Lm83/m;->first()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ln0/o;

    if-gtz v12, :cond_25

    if-gez v42, :cond_26

    :cond_25
    move/from16 v48, v1

    goto :goto_22

    :cond_26
    move/from16 v48, v1

    :goto_21
    move/from16 v29, v5

    const/4 v1, 0x0

    goto :goto_24

    :goto_22
    invoke-virtual {v0}, Lm83/m;->a()I

    move-result v1

    move-object/from16 v27, v13

    const/4 v13, 0x0

    :goto_23
    if-ge v13, v1, :cond_27

    invoke-virtual {v0, v13}, Lm83/m;->get(I)Ljava/lang/Object;

    move-result-object v29

    move/from16 v30, v1

    move-object/from16 v1, v29

    check-cast v1, Ln0/o;

    iget v1, v1, Ln0/o;->q:I

    if-eqz v5, :cond_27

    if-gt v1, v5, :cond_27

    move/from16 v29, v1

    invoke-static {v0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v1

    if-eq v13, v1, :cond_27

    sub-int v5, v5, v29

    add-int/lit8 v13, v13, 0x1

    invoke-virtual {v0, v13}, Lm83/m;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v27, v1

    check-cast v27, Ln0/o;

    move/from16 v1, v30

    goto :goto_23

    :cond_27
    move-object/from16 v13, v27

    goto :goto_21

    :goto_24
    invoke-static {v1, v9}, Ljava/lang/Math;->max(II)I

    move-result v5

    add-int/lit8 v9, v9, -0x1

    if-gt v5, v9, :cond_29

    move-object/from16 v27, v36

    :goto_25
    if-nez v27, :cond_28

    new-instance v27, Ljava/util/ArrayList;

    invoke-direct/range {v27 .. v27}, Ljava/util/ArrayList;-><init>()V

    :cond_28
    move-object/from16 v1, v27

    move/from16 v27, v6

    invoke-virtual {v2, v9, v14, v15}, Ln0/k;->Q(IJ)Ln0/o;

    move-result-object v6

    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eq v9, v5, :cond_2a

    add-int/lit8 v9, v9, -0x1

    move/from16 v6, v27

    move-object/from16 v27, v1

    const/4 v1, 0x0

    goto :goto_25

    :cond_29
    move/from16 v27, v6

    move-object/from16 v1, v36

    :cond_2a
    move-object v6, v4

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v9

    move-object/from16 v30, v1

    const/4 v1, -0x1

    add-int/2addr v9, v1

    if-ltz v9, :cond_2e

    :goto_26
    add-int/lit8 v52, v9, -0x1

    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    if-ge v9, v5, :cond_2c

    if-nez v30, :cond_2b

    new-instance v30, Ljava/util/ArrayList;

    invoke-direct/range {v30 .. v30}, Ljava/util/ArrayList;-><init>()V

    :cond_2b
    move-object/from16 v1, v30

    invoke-virtual {v2, v9, v14, v15}, Ln0/k;->Q(IJ)Ln0/o;

    move-result-object v9

    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v30, v1

    :cond_2c
    if-gez v52, :cond_2d

    goto :goto_27

    :cond_2d
    move/from16 v9, v52

    const/4 v1, -0x1

    goto :goto_26

    :cond_2e
    :goto_27
    if-nez v30, :cond_2f

    move-object/from16 v1, v24

    goto :goto_28

    :cond_2f
    move-object/from16 v1, v30

    :goto_28
    move-object v5, v1

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v9

    move/from16 v30, v20

    move-object/from16 v20, v6

    move/from16 v6, v30

    move-object/from16 v30, v5

    const/4 v5, 0x0

    :goto_29
    if-ge v5, v9, :cond_30

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v52

    move/from16 v54, v5

    move-object/from16 v5, v52

    check-cast v5, Ln0/o;

    iget v5, v5, Ln0/o;->r:I

    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    move-result v6

    add-int/lit8 v5, v54, 0x1

    goto :goto_29

    :cond_30
    invoke-static {v0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ln0/o;

    iget v5, v5, Ln0/o;->a:I

    add-int/lit8 v9, v10, -0x1

    invoke-static {v5, v9}, Ljava/lang/Math;->min(II)I

    move-result v5

    invoke-static {v0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v52

    move/from16 v54, v6

    move-object/from16 v6, v52

    check-cast v6, Ln0/o;

    iget v6, v6, Ln0/o;->a:I

    add-int/lit8 v6, v6, 0x1

    if-gt v6, v5, :cond_32

    move-object/from16 v52, v36

    :goto_2a
    if-nez v52, :cond_31

    new-instance v52, Ljava/util/ArrayList;

    invoke-direct/range {v52 .. v52}, Ljava/util/ArrayList;-><init>()V

    :cond_31
    move/from16 v55, v12

    move-object/from16 v12, v52

    move/from16 v52, v11

    invoke-virtual {v2, v6, v14, v15}, Ln0/k;->Q(IJ)Ln0/o;

    move-result-object v11

    invoke-interface {v12, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eq v6, v5, :cond_33

    add-int/lit8 v6, v6, 0x1

    move/from16 v11, v52

    move-object/from16 v52, v12

    move/from16 v12, v55

    goto :goto_2a

    :cond_32
    move/from16 v52, v11

    move/from16 v55, v12

    move-object/from16 v12, v36

    :cond_33
    if-eqz v26, :cond_46

    if-eqz v7, :cond_46

    iget-object v6, v7, Ln0/n;->k:Ljava/lang/Object;

    move-object v11, v6

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_46

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v11

    add-int/lit8 v11, v11, -0x1

    move-object/from16 v53, v12

    :goto_2b
    const/4 v12, -0x1

    if-ge v12, v11, :cond_36

    invoke-interface {v6, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v56

    check-cast v56, Ln0/g;

    move-object/from16 v12, v56

    check-cast v12, Ln0/o;

    iget v12, v12, Ln0/o;->a:I

    if-le v12, v5, :cond_35

    if-eqz v11, :cond_34

    add-int/lit8 v12, v11, -0x1

    invoke-interface {v6, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ln0/g;

    check-cast v12, Ln0/o;

    iget v12, v12, Ln0/o;->a:I

    if-gt v12, v5, :cond_35

    :cond_34
    invoke-interface {v6, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ln0/g;

    goto :goto_2c

    :cond_35
    add-int/lit8 v11, v11, -0x1

    goto :goto_2b

    :cond_36
    move-object/from16 v11, v36

    :goto_2c
    invoke-static {v6}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ln0/g;

    if-eqz v11, :cond_3c

    check-cast v11, Ln0/o;

    iget v11, v11, Ln0/o;->a:I

    move-object v12, v6

    check-cast v12, Ln0/o;

    iget v12, v12, Ln0/o;->a:I

    invoke-static {v12, v9}, Ljava/lang/Math;->min(II)I

    move-result v9

    if-gt v11, v9, :cond_3c

    move-object/from16 v12, v53

    :goto_2d
    if-eqz v12, :cond_39

    move-object/from16 v56, v6

    invoke-interface {v12}, Ljava/util/Collection;->size()I

    move-result v6

    move-object/from16 v57, v1

    const/4 v1, 0x0

    :goto_2e
    if-ge v1, v6, :cond_38

    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v53

    move/from16 v58, v1

    move-object/from16 v1, v53

    check-cast v1, Ln0/o;

    iget v1, v1, Ln0/o;->a:I

    if-ne v1, v11, :cond_37

    goto :goto_2f

    :cond_37
    add-int/lit8 v1, v58, 0x1

    goto :goto_2e

    :cond_38
    move-object/from16 v53, v36

    :goto_2f
    check-cast v53, Ln0/o;

    goto :goto_30

    :cond_39
    move-object/from16 v57, v1

    move-object/from16 v56, v6

    move-object/from16 v53, v36

    :goto_30
    if-nez v53, :cond_3b

    if-nez v12, :cond_3a

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    :cond_3a
    invoke-virtual {v2, v11, v14, v15}, Ln0/k;->Q(IJ)Ln0/o;

    move-result-object v1

    invoke-interface {v12, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3b
    if-eq v11, v9, :cond_3d

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v6, v56

    move-object/from16 v1, v57

    goto :goto_2d

    :cond_3c
    move-object/from16 v57, v1

    move-object/from16 v56, v6

    move-object/from16 v12, v53

    :cond_3d
    iget v1, v7, Ln0/n;->m:I

    move-object/from16 v6, v56

    check-cast v6, Ln0/o;

    iget v7, v6, Ln0/o;->o:I

    sub-int/2addr v1, v7

    iget v7, v6, Ln0/o;->p:I

    sub-int/2addr v1, v7

    int-to-float v1, v1

    sub-float v1, v1, v52

    cmpl-float v7, v1, v23

    if-lez v7, :cond_47

    iget v6, v6, Ln0/o;->a:I

    add-int/lit8 v6, v6, 0x1

    const/4 v7, 0x0

    :goto_31
    if-ge v6, v10, :cond_47

    int-to-float v9, v7

    cmpg-float v9, v9, v1

    if-gez v9, :cond_47

    if-gt v6, v5, :cond_40

    invoke-virtual {v0}, Lm83/m;->a()I

    move-result v9

    const/4 v11, 0x0

    :goto_32
    if-ge v11, v9, :cond_3f

    invoke-virtual {v0, v11}, Lm83/m;->get(I)Ljava/lang/Object;

    move-result-object v23

    move/from16 v53, v1

    move-object/from16 v1, v23

    check-cast v1, Ln0/o;

    iget v1, v1, Ln0/o;->a:I

    if-ne v1, v6, :cond_3e

    goto :goto_33

    :cond_3e
    add-int/lit8 v11, v11, 0x1

    move/from16 v1, v53

    goto :goto_32

    :cond_3f
    move/from16 v53, v1

    move-object/from16 v23, v36

    :goto_33
    check-cast v23, Ln0/o;

    :goto_34
    move-object/from16 v1, v23

    goto :goto_37

    :cond_40
    move/from16 v53, v1

    if-eqz v12, :cond_43

    invoke-interface {v12}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v9, 0x0

    :goto_35
    if-ge v9, v1, :cond_42

    invoke-interface {v12, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    move/from16 v23, v1

    move-object v1, v11

    check-cast v1, Ln0/o;

    iget v1, v1, Ln0/o;->a:I

    if-ne v1, v6, :cond_41

    goto :goto_36

    :cond_41
    add-int/lit8 v9, v9, 0x1

    move/from16 v1, v23

    goto :goto_35

    :cond_42
    move-object/from16 v11, v36

    :goto_36
    move-object/from16 v23, v11

    check-cast v23, Ln0/o;

    goto :goto_34

    :cond_43
    move-object/from16 v1, v36

    :goto_37
    if-eqz v1, :cond_44

    add-int/lit8 v6, v6, 0x1

    iget v1, v1, Ln0/o;->q:I

    :goto_38
    add-int/2addr v7, v1

    move/from16 v1, v53

    goto :goto_31

    :cond_44
    if-nez v12, :cond_45

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    :cond_45
    invoke-virtual {v2, v6, v14, v15}, Ln0/k;->Q(IJ)Ln0/o;

    move-result-object v1

    invoke-interface {v12, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    invoke-static {v12}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/o;

    iget v1, v1, Ln0/o;->q:I

    goto :goto_38

    :cond_46
    move-object/from16 v57, v1

    move-object/from16 v53, v12

    move-object/from16 v12, v53

    :cond_47
    if-eqz v12, :cond_48

    invoke-static {v12}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/o;

    iget v1, v1, Ln0/o;->a:I

    if-le v1, v5, :cond_48

    invoke-static {v12}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/o;

    iget v5, v1, Ln0/o;->a:I

    :cond_48
    invoke-interface/range {v20 .. v20}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v6, 0x0

    :goto_39
    if-ge v6, v1, :cond_4b

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    if-le v7, v5, :cond_4a

    if-nez v12, :cond_49

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    :cond_49
    invoke-virtual {v2, v7, v14, v15}, Ln0/k;->Q(IJ)Ln0/o;

    move-result-object v7

    invoke-interface {v12, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4a
    add-int/lit8 v6, v6, 0x1

    goto :goto_39

    :cond_4b
    if-nez v12, :cond_4c

    move-object/from16 v14, v24

    goto :goto_3a

    :cond_4c
    move-object v14, v12

    :goto_3a
    move-object v1, v14

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v4

    move/from16 v5, v54

    const/4 v6, 0x0

    :goto_3b
    if-ge v6, v4, :cond_4d

    invoke-interface {v14, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ln0/o;

    iget v7, v7, Ln0/o;->r:I

    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    move-result v5

    add-int/lit8 v6, v6, 0x1

    goto :goto_3b

    :cond_4d
    invoke-virtual {v0}, Lm83/m;->first()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v13, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4e

    invoke-interface/range {v57 .. v57}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_4e

    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_4e

    move/from16 v9, v17

    goto :goto_3c

    :cond_4e
    const/4 v9, 0x0

    :goto_3c
    if-eqz v25, :cond_4f

    move v4, v5

    :goto_3d
    move-wide/from16 v11, v50

    goto :goto_3e

    :cond_4f
    move v4, v8

    goto :goto_3d

    :goto_3e
    invoke-static {v4, v11, v12}, Ly3/b;->g(IJ)I

    move-result v15

    if-eqz v25, :cond_50

    move v5, v8

    :cond_50
    invoke-static {v5, v11, v12}, Ly3/b;->f(IJ)I

    move-result v4

    move v5, v4

    if-eqz v25, :cond_51

    goto :goto_3f

    :cond_51
    move v4, v15

    :goto_3f
    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v6

    if-ge v8, v6, :cond_52

    move/from16 v6, v17

    goto :goto_40

    :cond_52
    const/4 v6, 0x0

    :goto_40
    if-eqz v6, :cond_54

    if-nez v27, :cond_53

    goto :goto_41

    :cond_53
    const-string v7, "non-zero itemsScrollOffset"

    invoke-static {v7}, Lk0/a;->c(Ljava/lang/String;)V

    :cond_54
    :goto_41
    new-instance v7, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lm83/m;->a()I

    move-result v20

    invoke-interface/range {v57 .. v57}, Ljava/util/List;->size()I

    move-result v23

    add-int v23, v23, v20

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v20

    move-object/from16 v24, v1

    add-int v1, v20, v23

    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(I)V

    if-eqz v6, :cond_5e

    invoke-interface/range {v57 .. v57}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_55

    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_55

    goto :goto_42

    :cond_55
    const-string v1, "no extra items"

    invoke-static {v1}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_42
    invoke-virtual {v0}, Lm83/m;->a()I

    move-result v1

    move v6, v5

    new-array v5, v1, [I

    const/4 v14, 0x0

    :goto_43
    if-ge v14, v1, :cond_56

    invoke-virtual {v0, v14}, Lm83/m;->get(I)Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v23, v2

    move-object/from16 v2, v20

    check-cast v2, Ln0/o;

    iget v2, v2, Ln0/o;->p:I

    aput v2, v5, v14

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v2, v23

    goto :goto_43

    :cond_56
    move-object/from16 v23, v2

    new-array v1, v1, [I

    if-eqz v25, :cond_58

    move-object/from16 v2, v40

    if-eqz v2, :cond_57

    move-object/from16 v14, p1

    invoke-interface {v2, v14, v4, v5, v1}, Ll0/l;->b(Ly3/c;I[I[I)V

    move v14, v6

    move/from16 v18, v8

    move-object v8, v7

    move-object v7, v1

    move v1, v3

    goto :goto_44

    :cond_57
    invoke-static/range {v18 .. v18}, Lk0/a;->b(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :cond_58
    move-object/from16 v14, p1

    if-eqz v19, :cond_5d

    move v2, v6

    sget-object v6, Ly3/m;->w:Ly3/m;

    move/from16 v18, v8

    move-object v8, v7

    move-object v7, v1

    move v1, v3

    move-object v3, v14

    move v14, v2

    move-object/from16 v2, v19

    invoke-interface/range {v2 .. v7}, Ll0/i;->c(Ly3/c;I[ILy3/m;[I)V

    :goto_44
    invoke-static {v7}, Lm83/n;->u0([I)Li93/j;

    move-result-object v2

    iget v3, v2, Li93/h;->w:I

    iget v4, v2, Li93/h;->x:I

    iget v2, v2, Li93/h;->y:I

    if-lez v2, :cond_59

    if-le v3, v4, :cond_5a

    :cond_59
    if-gez v2, :cond_5b

    if-gt v4, v3, :cond_5b

    :cond_5a
    :goto_45
    aget v5, v7, v3

    invoke-virtual {v0, v3}, Lm83/m;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ln0/o;

    invoke-virtual {v6, v5, v15, v14}, Ln0/o;->q(III)V

    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eq v3, v4, :cond_5b

    add-int/2addr v3, v2

    goto :goto_45

    :cond_5b
    move v2, v14

    move/from16 v6, v21

    :cond_5c
    move/from16 v3, v52

    goto/16 :goto_49

    :cond_5d
    const-string v0, "null horizontalArrangement when isVertical == false"

    invoke-static {v0}, Lk0/a;->b(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :cond_5e
    move-object/from16 v23, v2

    move v1, v3

    move v2, v5

    move/from16 v18, v8

    move/from16 v6, v21

    move-object v8, v7

    invoke-interface/range {v30 .. v30}, Ljava/util/Collection;->size()I

    move-result v3

    move/from16 v5, v27

    const/4 v4, 0x0

    :goto_46
    if-ge v4, v3, :cond_5f

    move-object/from16 v7, v57

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v19

    move/from16 v20, v3

    move-object/from16 v3, v19

    check-cast v3, Ln0/o;

    move/from16 v19, v4

    iget v4, v3, Ln0/o;->q:I

    sub-int/2addr v5, v4

    invoke-virtual {v3, v5, v15, v2}, Ln0/o;->q(III)V

    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v19, 0x1

    move/from16 v3, v20

    goto :goto_46

    :cond_5f
    invoke-virtual {v0}, Lm83/m;->a()I

    move-result v3

    move/from16 v5, v27

    const/4 v4, 0x0

    :goto_47
    if-ge v4, v3, :cond_60

    invoke-virtual {v0, v4}, Lm83/m;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ln0/o;

    invoke-virtual {v7, v5, v15, v2}, Ln0/o;->q(III)V

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v7, v7, Ln0/o;->q:I

    add-int/2addr v5, v7

    add-int/lit8 v4, v4, 0x1

    goto :goto_47

    :cond_60
    invoke-interface/range {v24 .. v24}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_48
    if-ge v4, v3, :cond_5c

    invoke-interface {v14, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ln0/o;

    invoke-virtual {v7, v5, v15, v2}, Ln0/o;->q(III)V

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v7, v7, Ln0/o;->q:I

    add-int/2addr v5, v7

    add-int/lit8 v4, v4, 0x1

    goto :goto_48

    :goto_49
    float-to-int v4, v3

    move-object/from16 v5, v47

    iget-object v7, v5, Ln0/i;->d:Lab/h0;

    const/16 v27, 0x1

    move/from16 v21, v2

    move/from16 v19, v4

    move/from16 v20, v15

    move/from16 v30, v18

    move-object/from16 v18, v22

    move-object/from16 v24, v23

    move-object/from16 v23, v7

    move-object/from16 v22, v8

    invoke-virtual/range {v18 .. v32}, Landroidx/compose/foundation/lazy/layout/b;->d(IIILjava/util/ArrayList;Lab/h0;La2/a;ZZIZIILbc3/c0;Li2/f0;)V

    move-object/from16 v14, v22

    move-object/from16 v4, v24

    move/from16 v27, v25

    move/from16 v7, v26

    move/from16 v8, v30

    move-object/from16 v28, v0

    move/from16 v30, v1

    if-nez v7, :cond_64

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/foundation/lazy/layout/b;->b()J

    move-result-wide v0

    move/from16 v32, v7

    move/from16 v40, v8

    const-wide/16 v7, 0x0

    invoke-static {v0, v1, v7, v8}, Ly3/l;->a(JJ)Z

    move-result v7

    if-nez v7, :cond_65

    if-eqz v27, :cond_61

    move v7, v2

    :goto_4a
    move-wide/from16 v18, v0

    goto :goto_4b

    :cond_61
    move v7, v15

    goto :goto_4a

    :goto_4b
    shr-long v0, v18, v33

    long-to-int v0, v0

    invoke-static {v15, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v0, v11, v12}, Ly3/b;->g(IJ)I

    move-result v15

    and-long v0, v18, v34

    long-to-int v0, v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v0, v11, v12}, Ly3/b;->f(IJ)I

    move-result v0

    if-eqz v27, :cond_62

    move v1, v0

    goto :goto_4c

    :cond_62
    move v1, v15

    :goto_4c
    if-eq v1, v7, :cond_63

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v7, 0x0

    :goto_4d
    if-ge v7, v2, :cond_63

    invoke-virtual {v14, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ln0/o;

    iput v1, v8, Ln0/o;->t:I

    iget v11, v8, Ln0/o;->h:I

    add-int/2addr v11, v1

    iput v11, v8, Ln0/o;->v:I

    add-int/lit8 v7, v7, 0x1

    goto :goto_4d

    :cond_63
    move/from16 v25, v0

    :goto_4e
    move/from16 v24, v15

    goto :goto_4f

    :cond_64
    move/from16 v32, v7

    move/from16 v40, v8

    :cond_65
    move/from16 v25, v2

    goto :goto_4e

    :goto_4f
    invoke-virtual/range {v28 .. v28}, Lm83/m;->g()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/o;

    if-eqz v0, :cond_66

    iget v0, v0, Ln0/o;->a:I

    move/from16 v19, v0

    goto :goto_50

    :cond_66
    const/16 v19, 0x0

    :goto_50
    invoke-virtual/range {v28 .. v28}, Lm83/m;->l()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/o;

    if-eqz v0, :cond_67

    iget v0, v0, Ln0/o;->a:I

    move/from16 v20, v0

    goto :goto_51

    :cond_67
    const/16 v20, 0x0

    :goto_51
    iget-object v0, v5, Ln0/i;->b:Ln0/f;

    iget-object v0, v0, Ln0/f;->d:La0/f0;

    if-eqz v0, :cond_68

    :goto_52
    move-object/from16 v22, v0

    goto :goto_53

    :cond_68
    sget-object v0, La0/r;->a:La0/f0;

    goto :goto_52

    :goto_53
    new-instance v0, Llc0/c;

    const/16 v1, 0x14

    invoke-direct {v0, v4, v1}, Llc0/c;-><init>(Ljava/lang/Object;I)V

    move-object/from16 v1, p0

    iget-object v2, v1, Ln0/l;->i:Lp0/e1;

    move-object/from16 v26, v0

    move-object/from16 v18, v2

    move-object/from16 v21, v14

    move/from16 v23, v55

    invoke-static/range {v18 .. v26}, Lp0/y;->i(Lp0/e1;IILjava/util/ArrayList;La0/f0;IIILkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object v23

    move-object/from16 v22, v21

    move/from16 v15, v24

    move/from16 v0, v25

    if-eqz v9, :cond_6a

    invoke-static/range {v22 .. v22}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/o;

    if-eqz v2, :cond_69

    iget v2, v2, Ln0/o;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_54

    :cond_69
    move-object/from16 v2, v36

    goto :goto_54

    :cond_6a
    invoke-virtual/range {v28 .. v28}, Lm83/m;->g()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/o;

    if-eqz v2, :cond_69

    iget v2, v2, Ln0/o;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_54
    if-eqz v9, :cond_6c

    invoke-static/range {v22 .. v22}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ln0/o;

    if-eqz v5, :cond_6b

    iget v5, v5, Ln0/o;->a:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    goto :goto_55

    :cond_6b
    move-object/from16 v11, v36

    goto :goto_55

    :cond_6c
    invoke-virtual/range {v28 .. v28}, Lm83/m;->l()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ln0/o;

    if-eqz v5, :cond_6b

    iget v5, v5, Ln0/o;->a:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    :goto_55
    if-lt v6, v10, :cond_6e

    move/from16 v5, v30

    move/from16 v8, v40

    if-le v8, v5, :cond_6d

    goto :goto_56

    :cond_6d
    const/4 v5, 0x0

    goto :goto_57

    :cond_6e
    :goto_56
    move/from16 v5, v17

    :goto_57
    new-instance v20, Ln0/m;

    const/16 v25, 0x0

    move/from16 v24, v32

    move-object/from16 v21, v45

    invoke-direct/range {v20 .. v25}, Ln0/m;-><init>(Lp1/c1;Ljava/util/ArrayList;Ljava/util/List;ZI)V

    move-object/from16 v7, v20

    move-object/from16 v14, v22

    move-object/from16 v6, v23

    add-int v8, v15, v38

    move/from16 v25, v0

    move-wide/from16 v0, p2

    invoke-static {v8, v0, v1}, Ly3/b;->g(IJ)I

    move-result v8

    add-int v9, v25, v37

    invoke-static {v9, v0, v1}, Ly3/b;->f(IJ)I

    move-result v0

    move-object/from16 v9, v41

    move-object/from16 v1, v46

    invoke-interface {v1, v8, v0, v9, v7}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v7

    if-eqz v2, :cond_6f

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_58

    :cond_6f
    const/4 v0, 0x0

    :goto_58
    if-eqz v11, :cond_70

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_59

    :cond_70
    const/4 v2, 0x0

    :goto_59
    invoke-static {v0, v2, v14, v6}, Lp0/y;->p(IILjava/util/ArrayList;Ljava/util/List;)Ljava/util/List;

    move-result-object v14

    if-eqz v27, :cond_71

    sget-object v0, Lh0/d2;->w:Lh0/d2;

    :goto_5a
    move-object/from16 v18, v0

    goto :goto_5b

    :cond_71
    sget-object v0, Lh0/d2;->x:Lh0/d2;

    goto :goto_5a

    :goto_5b
    new-instance v2, Ln0/n;

    iget-wide v8, v4, Ln0/k;->E:J

    move-object/from16 v11, p1

    move v6, v3

    move/from16 v17, v10

    move-object v3, v13

    move/from16 v4, v29

    move-object/from16 v10, v31

    move/from16 v15, v39

    move/from16 v20, v42

    move/from16 v19, v43

    const/4 v0, 0x0

    move-wide v12, v8

    move/from16 v8, v48

    move/from16 v9, v49

    invoke-direct/range {v2 .. v20}, Ln0/n;-><init>(Ln0/o;IZFLy2/s0;FZLbc3/c0;Ly3/c;JLjava/util/List;IIILh0/d2;II)V

    :goto_5c
    invoke-interface {v1}, Ly2/r;->A()Z

    move-result v1

    move-object/from16 v3, v44

    invoke-virtual {v3, v2, v1, v0}, Ln0/u;->g(Ln0/n;ZZ)V

    return-object v2

    :goto_5d
    invoke-static {v4, v7, v5}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    throw v0

    :cond_72
    const-string v0, "null horizontalAlignment when isVertical == false"

    invoke-static {v0}, Lk0/a;->b(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

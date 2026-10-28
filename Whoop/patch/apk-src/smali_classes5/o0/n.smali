.class public final Lo0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/c0;


# instance fields
.field public final synthetic a:Lo0/y;

.field public final synthetic b:Ll0/k1;

.field public final synthetic c:Lc93/a;

.field public final synthetic d:Lo0/d;

.field public final synthetic e:Ll0/l;

.field public final synthetic f:Lbc3/c0;

.field public final synthetic g:Li2/f0;

.field public final synthetic h:Lp0/e1;


# direct methods
.method public constructor <init>(Lo0/y;Ll0/k1;Lj93/u;Lo0/d;Ll0/l;Ll0/i;Lbc3/c0;Li2/f0;Lp0/e1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo0/n;->a:Lo0/y;

    iput-object p2, p0, Lo0/n;->b:Ll0/k1;

    iput-object p3, p0, Lo0/n;->c:Lc93/a;

    iput-object p4, p0, Lo0/n;->d:Lo0/d;

    iput-object p5, p0, Lo0/n;->e:Ll0/l;

    iput-object p7, p0, Lo0/n;->f:Lbc3/c0;

    iput-object p8, p0, Lo0/n;->g:Li2/f0;

    iput-object p9, p0, Lo0/n;->h:Lp0/e1;

    return-void
.end method


# virtual methods
.method public final a(Lp0/d0;J)Ly2/s0;
    .locals 69

    move-object/from16 v1, p0

    move-object/from16 v11, p1

    move-wide/from16 v12, p2

    iget-object v0, v11, Lp0/d0;->x:Ly2/v1;

    iget-object v14, v1, Lo0/n;->a:Lo0/y;

    iget-object v2, v14, Lo0/y;->s:Lp1/c1;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    iget-boolean v2, v14, Lo0/y;->b:Z

    if-nez v2, :cond_1

    invoke-interface {v0}, Ly2/r;->A()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/16 v26, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/16 v26, 0x1

    :goto_1
    sget-object v2, Lh0/d2;->w:Lh0/d2;

    invoke-static {v12, v13, v2}, Ljc/x;->q(JLh0/d2;)V

    invoke-interface {v0}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v4

    iget-object v5, v1, Lo0/n;->b:Ll0/k1;

    invoke-interface {v5, v4}, Ll0/k1;->b(Ly3/m;)F

    move-result v4

    invoke-interface {v0, v4}, Ly3/c;->F(F)I

    move-result v4

    invoke-interface {v0}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v6

    invoke-interface {v5, v6}, Ll0/k1;->c(Ly3/m;)F

    move-result v6

    invoke-interface {v0, v6}, Ly3/c;->F(F)I

    move-result v6

    invoke-interface {v5}, Ll0/k1;->d()F

    move-result v7

    invoke-interface {v0, v7}, Ly3/c;->F(F)I

    move-result v7

    invoke-interface {v5}, Ll0/k1;->a()F

    move-result v5

    invoke-interface {v0, v5}, Ly3/c;->F(F)I

    move-result v5

    add-int/2addr v5, v7

    add-int/2addr v6, v4

    sub-int v20, v5, v7

    neg-int v8, v6

    neg-int v9, v5

    invoke-static {v8, v12, v13, v9}, Ly3/b;->i(IJI)J

    move-result-wide v8

    iget-object v10, v1, Lo0/n;->c:Lc93/a;

    invoke-interface {v10}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lo0/h;

    const/16 v31, 0x1

    iget-object v15, v10, Lo0/h;->b:Lo0/g;

    iget-object v15, v15, Lo0/g;->c:Lo0/v;

    iget-object v3, v1, Lo0/n;->d:Lo0/d;

    move-object/from16 v19, v2

    iget-object v2, v3, Lo0/d;->d:Ld1/j;

    if-eqz v2, :cond_2

    move v2, v5

    move/from16 v17, v6

    iget-wide v5, v3, Lo0/d;->b:J

    invoke-static {v5, v6, v8, v9}, Ly3/a;->c(JJ)Z

    move-result v5

    if-eqz v5, :cond_3

    iget v5, v3, Lo0/d;->c:F

    invoke-interface {v0}, Ly3/c;->getDensity()F

    move-result v6

    cmpg-float v5, v5, v6

    if-nez v5, :cond_3

    iget-object v3, v3, Lo0/d;->d:Ld1/j;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    move v2, v5

    move/from16 v17, v6

    :cond_3
    iput-wide v8, v3, Lo0/d;->b:J

    invoke-interface {v0}, Ly3/c;->getDensity()F

    move-result v5

    iput v5, v3, Lo0/d;->c:F

    iget-object v5, v3, Lo0/d;->a:Lj21/d;

    new-instance v6, Ly3/a;

    invoke-direct {v6, v8, v9}, Ly3/a;-><init>(J)V

    invoke-virtual {v5, v11, v6}, Lj21/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ld1/j;

    iput-object v5, v3, Lo0/d;->d:Ld1/j;

    move-object v3, v5

    :goto_2
    iget-object v5, v3, Ld1/j;->x:Ljava/lang/Object;

    check-cast v5, [I

    array-length v5, v5

    iget v6, v15, Lo0/v;->i:I

    if-eq v5, v6, :cond_4

    iput v5, v15, Lo0/v;->i:I

    iget-object v6, v15, Lo0/v;->b:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    new-instance v11, Lo0/t;

    move/from16 v21, v2

    const/4 v2, 0x0

    invoke-direct {v11, v2, v2}, Lo0/t;-><init>(II)V

    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput v2, v15, Lo0/v;->c:I

    iput v2, v15, Lo0/v;->d:I

    iput v2, v15, Lo0/v;->e:I

    const/4 v6, -0x1

    iput v6, v15, Lo0/v;->f:I

    iget-object v6, v15, Lo0/v;->g:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    goto :goto_3

    :cond_4
    move/from16 v21, v2

    const/4 v2, 0x0

    :goto_3
    iget-object v11, v1, Lo0/n;->e:Ll0/l;

    if-eqz v11, :cond_56

    invoke-interface {v11}, Ll0/l;->a()F

    move-result v6

    invoke-interface {v0, v6}, Ly3/c;->F(F)I

    move-result v35

    iget-object v6, v10, Lo0/h;->b:Lo0/g;

    invoke-virtual {v6}, Lo0/g;->m()Lab/h0;

    move-result-object v6

    iget v6, v6, Lab/h0;->x:I

    invoke-static {v12, v13}, Ly3/a;->h(J)I

    move-result v16

    move-object/from16 v37, v15

    sub-int v15, v16, v21

    move-object/from16 v33, v3

    int-to-long v2, v4

    const/16 v38, 0x20

    shl-long v2, v2, v38

    move-wide/from16 v22, v2

    int-to-long v2, v7

    const-wide v39, 0xffffffffL

    and-long v2, v2, v39

    or-long v2, v22, v2

    new-instance v22, Lo0/l;

    move/from16 v34, v6

    iget-object v6, v1, Lo0/n;->a:Lo0/y;

    move-object/from16 v4, p1

    move/from16 v25, v5

    move-wide/from16 v51, v8

    move/from16 v50, v17

    move-object/from16 v41, v19

    move/from16 v8, v20

    move/from16 v49, v21

    move/from16 v5, v35

    move-wide/from16 v67, v2

    move-object v3, v10

    move-wide/from16 v9, v67

    move-object/from16 v2, v22

    invoke-direct/range {v2 .. v10}, Lo0/l;-><init>(Lo0/h;Lp0/d0;ILo0/y;IIJ)V

    move/from16 v21, v5

    new-instance v32, Lo0/m;

    move/from16 v35, v21

    move-object/from16 v36, v22

    invoke-direct/range {v32 .. v37}, Lo0/m;-><init>(Ld1/j;IILo0/l;Lo0/v;)V

    move-object/from16 v6, v32

    move/from16 v4, v34

    move-object/from16 v5, v36

    move-object/from16 v2, v37

    new-instance v9, Lnq0/m;

    const/4 v10, 0x2

    invoke-direct {v9, v10, v2, v6}, Lnq0/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v10, Lno0/e0;

    move/from16 v32, v8

    const/16 v8, 0x9

    invoke-direct {v10, v2, v8}, Lno0/e0;-><init>(Ljava/lang/Object;I)V

    invoke-static {}, Lyl/a;->c()Lz1/f;

    move-result-object v8

    const/16 v16, 0x0

    if-eqz v8, :cond_5

    invoke-virtual {v8}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v17

    move-object/from16 v33, v9

    move-object/from16 v9, v17

    :goto_4
    move-object/from16 v34, v10

    goto :goto_5

    :cond_5
    move-object/from16 v33, v9

    move-object/from16 v9, v16

    goto :goto_4

    :goto_5
    invoke-static {v8}, Lyl/a;->e(Lz1/f;)Lz1/f;

    move-result-object v10

    move-object/from16 v17, v11

    :try_start_0
    iget-object v11, v14, Lo0/y;->d:Lc33/c;

    move/from16 v36, v15

    iget-object v15, v11, Lc33/c;->c:Ljava/lang/Object;

    check-cast v15, Lp1/h1;

    invoke-virtual {v15}, Lp1/h1;->x()I

    move-result v15

    move-object/from16 v37, v6

    iget-object v6, v11, Lc33/c;->d:Ljava/lang/Object;

    invoke-static {v15, v6, v3}, Lp0/y;->k(ILjava/lang/Object;Lp0/b0;)I

    move-result v6

    if-eq v15, v6, :cond_6

    move/from16 v53, v7

    iget-object v7, v11, Lc33/c;->c:Ljava/lang/Object;

    check-cast v7, Lp1/h1;

    invoke-virtual {v7, v6}, Lp1/h1;->y(I)V

    iget-object v7, v11, Lc33/c;->e:Ljava/lang/Object;

    check-cast v7, Lp0/f0;

    invoke-virtual {v7, v15}, Lp0/f0;->a(I)V

    goto :goto_6

    :cond_6
    move/from16 v53, v7

    :goto_6
    if-lt v6, v4, :cond_8

    if-gtz v4, :cond_7

    goto :goto_7

    :cond_7
    add-int/lit8 v6, v4, -0x1

    invoke-virtual {v2, v6}, Lo0/v;->c(I)I

    move-result v2

    const/4 v6, 0x0

    goto :goto_8

    :catchall_0
    move-exception v0

    goto/16 :goto_4c

    :cond_8
    :goto_7
    invoke-virtual {v2, v6}, Lo0/v;->c(I)I

    move-result v2

    iget-object v6, v11, Lc33/c;->b:Ljava/lang/Object;

    check-cast v6, Lp1/h1;

    invoke-virtual {v6}, Lp1/h1;->x()I

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_8
    invoke-static {v8, v10, v9}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    iget-object v7, v14, Lo0/y;->q:Lp0/h0;

    iget-object v8, v14, Lo0/y;->n:Laj/d;

    invoke-static {v3, v7, v8}, Lp0/y;->j(Lp0/b0;Lp0/h0;Laj/d;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v0}, Ly2/r;->A()Z

    move-result v7

    if-nez v7, :cond_a

    if-nez v26, :cond_9

    goto :goto_9

    :cond_9
    iget-object v7, v14, Lo0/y;->v:Lp0/n0;

    iget-object v7, v7, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v7, Ld0/m;

    iget-object v7, v7, Ld0/m;->x:Lp1/k1;

    invoke-virtual {v7}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    goto :goto_a

    :cond_a
    :goto_9
    iget v7, v14, Lo0/y;->g:F

    :goto_a
    iget-object v8, v14, Lo0/y;->m:Landroidx/compose/foundation/lazy/layout/b;

    invoke-interface {v0}, Ly2/r;->A()Z

    move-result v24

    iget-object v9, v14, Lo0/y;->c:Lo0/o;

    iget-object v10, v14, Lo0/y;->r:Lp1/c1;

    if-ltz v53, :cond_b

    goto :goto_b

    :cond_b
    const-string v11, "negative beforeContentPadding"

    invoke-static {v11}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_b
    if-ltz v32, :cond_c

    goto :goto_c

    :cond_c
    const-string v11, "negative afterContentPadding"

    invoke-static {v11}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_c
    sget-object v11, Lm83/z;->w:Lm83/z;

    iget-object v15, v5, Lo0/l;->y:Lo0/h;

    const/16 v23, 0x1

    move/from16 v19, v2

    iget-object v2, v1, Lo0/n;->f:Lbc3/c0;

    move-object/from16 v29, v2

    iget-object v2, v1, Lo0/n;->g:Li2/f0;

    move-object/from16 v22, v5

    move/from16 v20, v6

    const-wide/16 v5, 0x0

    sget-object v42, Lm83/y;->w:Lm83/y;

    if-gtz v4, :cond_e

    invoke-static/range {v51 .. v52}, Ly3/a;->k(J)I

    move-result v18

    invoke-static/range {v51 .. v52}, Ly3/a;->j(J)I

    move-result v19

    new-instance v20, Ljava/util/ArrayList;

    invoke-direct/range {v20 .. v20}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, v15, Lo0/h;->c:Lab/h0;

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v17, 0x0

    move-object/from16 v30, v2

    move-object/from16 v21, v3

    move-object/from16 v16, v8

    invoke-virtual/range {v16 .. v30}, Landroidx/compose/foundation/lazy/layout/b;->d(IIILjava/util/ArrayList;Lab/h0;La2/a;ZZIZIILbc3/c0;Li2/f0;)V

    move-object/from16 v2, v16

    if-nez v24, :cond_d

    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/layout/b;->b()J

    move-result-wide v2

    invoke-static {v2, v3, v5, v6}, Ly3/l;->a(JJ)Z

    move-result v4

    if-nez v4, :cond_d

    shr-long v4, v2, v38

    long-to-int v4, v4

    move-wide/from16 v5, v51

    invoke-static {v4, v5, v6}, Ly3/b;->g(IJ)I

    move-result v18

    and-long v2, v2, v39

    long-to-int v2, v2

    invoke-static {v2, v5, v6}, Ly3/b;->f(IJ)I

    move-result v19

    :cond_d
    new-instance v2, Ldc1/c;

    const/16 v3, 0x1b

    invoke-direct {v2, v3}, Ldc1/c;-><init>(I)V

    add-int v3, v18, v50

    invoke-static {v3, v12, v13}, Ly3/b;->g(IJ)I

    move-result v3

    add-int v4, v19, v49

    invoke-static {v4, v12, v13}, Ly3/b;->f(IJ)I

    move-result v4

    invoke-interface {v0, v3, v4, v11, v2}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v7

    move/from16 v8, v53

    neg-int v2, v8

    add-int v17, v36, v32

    move/from16 v16, v2

    new-instance v2, Lo0/o;

    const/4 v9, 0x0

    const/16 v18, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v11, p1

    move-object/from16 v54, v14

    move/from16 v12, v25

    move-object/from16 v10, v29

    move/from16 v20, v32

    move-object/from16 v13, v33

    move-object/from16 v14, v34

    move/from16 v21, v35

    move-object/from16 v19, v41

    move-object/from16 v15, v42

    invoke-direct/range {v2 .. v21}, Lo0/o;-><init>(Lo0/q;IZFLy2/s0;FZLbc3/c0;Ly3/c;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/util/List;IIILh0/d2;II)V

    move-object/from16 v58, v0

    const/4 v0, 0x0

    goto/16 :goto_4b

    :cond_e
    move-object/from16 v5, p1

    move-object/from16 v30, v2

    move-object/from16 v21, v8

    move-object/from16 v54, v14

    move-object/from16 v2, v22

    move/from16 v6, v32

    move-object/from16 v14, v42

    move/from16 v8, v53

    move-object/from16 v53, v34

    move-object/from16 v34, v33

    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    move-result v22

    sub-int v20, v20, v22

    if-nez v19, :cond_f

    if-gez v20, :cond_f

    add-int v22, v22, v20

    const/16 v20, 0x0

    :cond_f
    move/from16 v55, v6

    new-instance v6, Lm83/m;

    invoke-direct {v6}, Lm83/m;-><init>()V

    move/from16 v27, v7

    neg-int v7, v8

    if-gez v35, :cond_10

    move/from16 v28, v35

    :goto_d
    move/from16 v56, v7

    goto :goto_e

    :cond_10
    const/16 v28, 0x0

    goto :goto_d

    :goto_e
    add-int v7, v56, v28

    add-int v20, v20, v7

    move-object/from16 v57, v10

    move/from16 v10, v20

    :goto_f
    if-gez v10, :cond_11

    if-lez v19, :cond_11

    move-object/from16 v20, v14

    add-int/lit8 v14, v19, -0x1

    move-object/from16 v58, v0

    move-object/from16 v0, v37

    move-object/from16 v37, v11

    invoke-virtual {v0, v14}, Lo0/m;->b(I)Lo0/q;

    move-result-object v11

    move/from16 v19, v14

    const/4 v14, 0x0

    invoke-virtual {v6, v14, v11}, Lm83/m;->add(ILjava/lang/Object;)V

    iget v11, v11, Lo0/q;->g:I

    add-int/2addr v10, v11

    move-object/from16 v14, v20

    move-object/from16 v11, v37

    move-object/from16 v37, v0

    move-object/from16 v0, v58

    goto :goto_f

    :cond_11
    move-object/from16 v58, v0

    move-object/from16 v20, v14

    move-object/from16 v0, v37

    const/4 v14, 0x0

    move-object/from16 v37, v11

    if-ge v10, v7, :cond_12

    sub-int v10, v7, v10

    sub-int v22, v22, v10

    move v10, v7

    :cond_12
    move/from16 v11, v22

    sub-int/2addr v10, v7

    add-int v48, v36, v55

    if-gez v48, :cond_13

    goto :goto_10

    :cond_13
    move/from16 v14, v48

    :goto_10
    neg-int v12, v10

    move/from16 v22, v10

    move v10, v12

    move/from16 v28, v19

    const/4 v12, 0x0

    const/16 v41, 0x0

    :goto_11
    iget v13, v6, Lm83/m;->y:I

    if-ge v12, v13, :cond_15

    if-lt v10, v14, :cond_14

    invoke-virtual {v6, v12}, Lm83/m;->c(I)Ljava/lang/Object;

    move/from16 v41, v31

    goto :goto_11

    :cond_14
    add-int/lit8 v28, v28, 0x1

    invoke-virtual {v6, v12}, Lm83/m;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lo0/q;

    iget v13, v13, Lo0/q;->g:I

    add-int/2addr v10, v13

    add-int/lit8 v12, v12, 0x1

    goto :goto_11

    :cond_15
    move/from16 v12, v28

    move/from16 v13, v41

    :goto_12
    if-ge v12, v4, :cond_17

    if-lt v10, v14, :cond_16

    if-lez v10, :cond_16

    invoke-virtual {v6}, Lm83/m;->isEmpty()Z

    move-result v28

    if-eqz v28, :cond_17

    :cond_16
    move/from16 v59, v13

    goto :goto_14

    :cond_17
    move/from16 v59, v13

    :goto_13
    move/from16 v7, v36

    goto :goto_16

    :goto_14
    invoke-virtual {v0, v12}, Lo0/m;->b(I)Lo0/q;

    move-result-object v13

    move/from16 v28, v12

    iget v12, v13, Lo0/q;->g:I

    move/from16 v41, v12

    iget-object v12, v13, Lo0/q;->b:[Lo0/p;

    move/from16 v42, v14

    array-length v14, v12

    if-nez v14, :cond_18

    goto :goto_13

    :cond_18
    add-int v10, v10, v41

    if-gt v10, v7, :cond_19

    invoke-static {v12}, Lm83/n;->E0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lo0/p;

    iget v12, v12, Lo0/p;->a:I

    add-int/lit8 v14, v4, -0x1

    if-eq v12, v14, :cond_19

    add-int/lit8 v12, v28, 0x1

    sub-int v22, v22, v41

    move/from16 v19, v12

    move/from16 v13, v31

    goto :goto_15

    :cond_19
    invoke-virtual {v6, v13}, Lm83/m;->addLast(Ljava/lang/Object;)V

    move/from16 v13, v59

    :goto_15
    add-int/lit8 v12, v28, 0x1

    move/from16 v14, v42

    goto :goto_12

    :goto_16
    if-ge v10, v7, :cond_1c

    sub-int v12, v7, v10

    sub-int v22, v22, v12

    add-int/2addr v10, v12

    move/from16 v13, v22

    :goto_17
    if-ge v13, v8, :cond_1a

    if-lez v19, :cond_1a

    add-int/lit8 v14, v19, -0x1

    move/from16 v36, v8

    invoke-virtual {v0, v14}, Lo0/m;->b(I)Lo0/q;

    move-result-object v8

    move/from16 v19, v10

    const/4 v10, 0x0

    invoke-virtual {v6, v10, v8}, Lm83/m;->add(ILjava/lang/Object;)V

    iget v8, v8, Lo0/q;->g:I

    add-int/2addr v13, v8

    move/from16 v10, v19

    move/from16 v8, v36

    move/from16 v19, v14

    goto :goto_17

    :cond_1a
    move/from16 v36, v8

    move/from16 v19, v10

    add-int/2addr v12, v11

    if-gez v13, :cond_1b

    add-int/2addr v12, v13

    add-int v10, v19, v13

    const/4 v13, 0x0

    goto :goto_18

    :cond_1b
    move/from16 v10, v19

    goto :goto_18

    :cond_1c
    move/from16 v36, v8

    move v12, v11

    move/from16 v13, v22

    :goto_18
    invoke-static/range {v27 .. v27}, Ljava/lang/Math;->round(F)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->signum(I)I

    move-result v8

    invoke-static {v12}, Ljava/lang/Integer;->signum(I)I

    move-result v14

    if-ne v8, v14, :cond_1d

    invoke-static/range {v27 .. v27}, Ljava/lang/Math;->round(F)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    move-result v8

    invoke-static {v12}, Ljava/lang/Math;->abs(I)I

    move-result v14

    if-lt v8, v14, :cond_1d

    int-to-float v8, v12

    goto :goto_19

    :cond_1d
    move/from16 v8, v27

    :goto_19
    sub-float v14, v27, v8

    const/16 v19, 0x0

    if-eqz v24, :cond_1e

    if-le v12, v11, :cond_1e

    cmpg-float v22, v14, v19

    if-gtz v22, :cond_1e

    sub-int/2addr v12, v11

    int-to-float v11, v12

    add-float v19, v11, v14

    :cond_1e
    move/from16 v11, v19

    if-ltz v13, :cond_1f

    goto :goto_1a

    :cond_1f
    const-string v12, "negative initial offset"

    invoke-static {v12}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_1a
    neg-int v12, v13

    invoke-virtual {v6}, Lm83/m;->first()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lo0/q;

    move/from16 v60, v11

    iget-object v11, v14, Lo0/q;->b:[Lo0/p;

    invoke-static {v11}, Lm83/n;->t0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lo0/p;

    if-eqz v11, :cond_20

    iget v11, v11, Lo0/p;->a:I

    goto :goto_1b

    :cond_20
    const/4 v11, 0x0

    :goto_1b
    invoke-virtual {v6}, Lm83/m;->l()Ljava/lang/Object;

    move-result-object v19

    move/from16 v22, v12

    move-object/from16 v12, v19

    check-cast v12, Lo0/q;

    if-eqz v12, :cond_22

    iget-object v12, v12, Lo0/q;->b:[Lo0/p;

    move/from16 v19, v13

    array-length v13, v12

    if-nez v13, :cond_21

    move-object/from16 v12, v16

    goto :goto_1c

    :cond_21
    array-length v13, v12

    add-int/lit8 v13, v13, -0x1

    aget-object v12, v12, v13

    :goto_1c
    if-eqz v12, :cond_23

    iget v12, v12, Lo0/p;->a:I

    goto :goto_1d

    :cond_22
    move/from16 v19, v13

    :cond_23
    const/4 v12, 0x0

    :goto_1d
    move-object v13, v3

    check-cast v13, Ljava/util/Collection;

    move-object/from16 v27, v13

    invoke-interface/range {v27 .. v27}, Ljava/util/Collection;->size()I

    move-result v13

    move-object/from16 v28, v14

    move-object/from16 v61, v16

    const/4 v14, 0x0

    :goto_1e
    iget-object v1, v0, Lo0/m;->e:Lo0/v;

    if-ge v14, v13, :cond_26

    invoke-interface {v3, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v41

    check-cast v41, Ljava/lang/Number;

    move/from16 v62, v13

    invoke-virtual/range {v41 .. v41}, Ljava/lang/Number;->intValue()I

    move-result v13

    if-ltz v13, :cond_25

    if-ge v13, v11, :cond_25

    move/from16 v63, v11

    iget v11, v1, Lo0/v;->i:I

    invoke-virtual {v1, v13}, Lo0/v;->e(I)I

    move-result v1

    const/4 v11, 0x0

    invoke-virtual {v0, v11, v1}, Lo0/m;->a(II)J

    move-result-wide v45

    const/16 v43, 0x0

    iget v11, v2, Lo0/l;->E:I

    move/from16 v44, v1

    move-object/from16 v41, v2

    move/from16 v47, v11

    move/from16 v42, v13

    invoke-virtual/range {v41 .. v47}, Lo0/l;->Q(IIIJI)Lo0/p;

    move-result-object v1

    if-nez v61, :cond_24

    new-instance v61, Ljava/util/ArrayList;

    invoke-direct/range {v61 .. v61}, Ljava/util/ArrayList;-><init>()V

    :cond_24
    move-object/from16 v11, v61

    invoke-interface {v11, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v61, v11

    goto :goto_1f

    :cond_25
    move/from16 v63, v11

    :goto_1f
    add-int/lit8 v14, v14, 0x1

    move/from16 v13, v62

    move/from16 v11, v63

    goto :goto_1e

    :cond_26
    move/from16 v63, v11

    if-nez v61, :cond_27

    move-object/from16 v11, v20

    goto :goto_20

    :cond_27
    move-object/from16 v11, v61

    :goto_20
    if-eqz v24, :cond_33

    if-eqz v9, :cond_33

    iget-object v9, v9, Lo0/o;->m:Ljava/lang/Object;

    move-object v13, v9

    check-cast v13, Ljava/util/Collection;

    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_33

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v13

    add-int/lit8 v13, v13, -0x1

    :goto_21
    const/4 v14, -0x1

    if-ge v14, v13, :cond_2a

    invoke-interface {v9, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lo0/p;

    iget v14, v14, Lo0/p;->a:I

    if-le v14, v12, :cond_29

    if-eqz v13, :cond_28

    add-int/lit8 v14, v13, -0x1

    invoke-interface {v9, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lo0/p;

    iget v14, v14, Lo0/p;->a:I

    if-gt v14, v12, :cond_29

    :cond_28
    invoke-interface {v9, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lo0/p;

    goto :goto_22

    :cond_29
    add-int/lit8 v13, v13, -0x1

    goto :goto_21

    :cond_2a
    move-object/from16 v13, v16

    :goto_22
    invoke-static {v9}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lo0/p;

    invoke-static {v6}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lo0/q;

    if-eqz v14, :cond_2b

    iget v14, v14, Lo0/q;->a:I

    add-int/lit8 v14, v14, 0x1

    goto :goto_23

    :cond_2b
    const/4 v14, 0x0

    :goto_23
    if-eqz v13, :cond_33

    iget v13, v13, Lo0/p;->a:I

    iget v9, v9, Lo0/p;->a:I

    move/from16 v61, v12

    add-int/lit8 v12, v4, -0x1

    invoke-static {v9, v12}, Ljava/lang/Math;->min(II)I

    move-result v9

    if-gt v13, v9, :cond_32

    move-object/from16 v12, v16

    :goto_24
    if-eqz v12, :cond_2f

    move-object/from16 v62, v15

    invoke-interface {v12}, Ljava/util/Collection;->size()I

    move-result v15

    move/from16 v64, v8

    const/4 v8, 0x0

    :goto_25
    if-ge v8, v15, :cond_2e

    invoke-interface {v12, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v41

    move/from16 v42, v8

    move-object/from16 v8, v41

    check-cast v8, Lo0/q;

    iget-object v8, v8, Lo0/q;->b:[Lo0/p;

    move-object/from16 v41, v12

    array-length v12, v8

    move-object/from16 v43, v8

    const/4 v8, 0x0

    :goto_26
    if-ge v8, v12, :cond_2d

    move/from16 v44, v8

    aget-object v8, v43, v44

    iget v8, v8, Lo0/p;->a:I

    if-ne v8, v13, :cond_2c

    move-object/from16 v12, v41

    goto :goto_2a

    :cond_2c
    add-int/lit8 v8, v44, 0x1

    goto :goto_26

    :cond_2d
    add-int/lit8 v8, v42, 0x1

    move-object/from16 v12, v41

    goto :goto_25

    :cond_2e
    :goto_27
    move-object/from16 v41, v12

    goto :goto_28

    :cond_2f
    move/from16 v64, v8

    move-object/from16 v62, v15

    goto :goto_27

    :goto_28
    if-nez v41, :cond_30

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    goto :goto_29

    :cond_30
    move-object/from16 v12, v41

    :goto_29
    invoke-virtual {v0, v14}, Lo0/m;->b(I)Lo0/q;

    move-result-object v8

    add-int/lit8 v14, v14, 0x1

    invoke-interface {v12, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2a
    if-eq v13, v9, :cond_31

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v15, v62

    move/from16 v8, v64

    goto :goto_24

    :cond_31
    move-object/from16 v42, v12

    goto :goto_2d

    :cond_32
    move/from16 v64, v8

    :goto_2b
    move-object/from16 v62, v15

    goto :goto_2c

    :cond_33
    move/from16 v64, v8

    move/from16 v61, v12

    goto :goto_2b

    :goto_2c
    move-object/from16 v42, v16

    :goto_2d
    if-nez v42, :cond_34

    move-object/from16 v8, v20

    goto :goto_2e

    :cond_34
    move-object/from16 v8, v42

    :goto_2e
    invoke-interface/range {v27 .. v27}, Ljava/util/Collection;->size()I

    move-result v9

    const/4 v12, 0x0

    :goto_2f
    if-ge v12, v9, :cond_3a

    invoke-interface {v3, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Number;

    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    move-result v13

    add-int/lit8 v14, v61, 0x1

    if-gt v14, v13, :cond_39

    if-ge v13, v4, :cond_39

    if-eqz v24, :cond_37

    move-object v14, v8

    check-cast v14, Ljava/util/Collection;

    invoke-interface {v14}, Ljava/util/Collection;->size()I

    move-result v14

    const/4 v15, 0x0

    :goto_30
    if-ge v15, v14, :cond_37

    invoke-interface {v8, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v27

    move-object/from16 v65, v3

    move-object/from16 v3, v27

    check-cast v3, Lo0/q;

    iget-object v3, v3, Lo0/q;->b:[Lo0/p;

    move/from16 v66, v4

    array-length v4, v3

    move-object/from16 v27, v3

    const/4 v3, 0x0

    :goto_31
    if-ge v3, v4, :cond_36

    move/from16 v41, v3

    aget-object v3, v27, v41

    iget v3, v3, Lo0/p;->a:I

    if-ne v3, v13, :cond_35

    move-object/from16 v41, v2

    goto :goto_32

    :cond_35
    add-int/lit8 v3, v41, 0x1

    goto :goto_31

    :cond_36
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v3, v65

    move/from16 v4, v66

    goto :goto_30

    :cond_37
    move-object/from16 v65, v3

    move/from16 v66, v4

    iget v3, v1, Lo0/v;->i:I

    invoke-virtual {v1, v13}, Lo0/v;->e(I)I

    move-result v3

    const/4 v14, 0x0

    invoke-virtual {v0, v14, v3}, Lo0/m;->a(II)J

    move-result-wide v45

    const/16 v43, 0x0

    iget v4, v2, Lo0/l;->E:I

    move-object/from16 v41, v2

    move/from16 v44, v3

    move/from16 v47, v4

    move/from16 v42, v13

    invoke-virtual/range {v41 .. v47}, Lo0/l;->Q(IIIJI)Lo0/p;

    move-result-object v2

    if-nez v16, :cond_38

    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    :cond_38
    move-object/from16 v3, v16

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v16, v3

    goto :goto_32

    :cond_39
    move-object/from16 v41, v2

    move-object/from16 v65, v3

    move/from16 v66, v4

    :goto_32
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v2, v41

    move-object/from16 v3, v65

    move/from16 v4, v66

    goto/16 :goto_2f

    :cond_3a
    move-object/from16 v41, v2

    move/from16 v66, v4

    if-nez v16, :cond_3b

    move-object/from16 v1, v20

    goto :goto_33

    :cond_3b
    move-object/from16 v1, v16

    :goto_33
    if-gtz v36, :cond_3d

    if-gez v35, :cond_3c

    goto :goto_34

    :cond_3c
    move/from16 v4, v19

    move-object/from16 v3, v28

    goto :goto_36

    :cond_3d
    :goto_34
    invoke-virtual {v6}, Lm83/m;->a()I

    move-result v2

    move/from16 v13, v19

    move-object/from16 v14, v28

    const/4 v3, 0x0

    :goto_35
    if-ge v3, v2, :cond_3e

    invoke-virtual {v6, v3}, Lm83/m;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo0/q;

    iget v4, v4, Lo0/q;->g:I

    if-eqz v13, :cond_3e

    if-gt v4, v13, :cond_3e

    invoke-static {v6}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v9

    if-eq v3, v9, :cond_3e

    sub-int/2addr v13, v4

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v6, v3}, Lm83/m;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v14, v4

    check-cast v14, Lo0/q;

    goto :goto_35

    :cond_3e
    move v4, v13

    move-object v3, v14

    :goto_36
    invoke-static/range {v51 .. v52}, Ly3/a;->i(J)I

    move-result v2

    move-wide/from16 v12, v51

    invoke-static {v10, v12, v13}, Ly3/b;->f(IJ)I

    move-result v9

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v14

    if-eqz v14, :cond_3f

    goto :goto_37

    :cond_3f
    check-cast v8, Ljava/lang/Iterable;

    invoke-static {v6, v8}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v6

    :goto_37
    invoke-static {v9, v7}, Ljava/lang/Math;->min(II)I

    move-result v8

    if-ge v10, v8, :cond_40

    move/from16 v8, v31

    goto :goto_38

    :cond_40
    const/4 v8, 0x0

    :goto_38
    if-eqz v8, :cond_42

    if-nez v22, :cond_41

    goto :goto_39

    :cond_41
    const-string v14, "non-zero firstLineScrollOffset"

    invoke-static {v14}, Lk0/a;->c(Ljava/lang/String;)V

    :cond_42
    :goto_39
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v14

    move-object/from16 v42, v3

    const/4 v3, 0x0

    const/4 v15, 0x0

    :goto_3a
    if-ge v15, v14, :cond_43

    invoke-interface {v6, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    move/from16 v27, v4

    move-object/from16 v4, v16

    check-cast v4, Lo0/q;

    iget-object v4, v4, Lo0/q;->b:[Lo0/p;

    array-length v4, v4

    add-int/2addr v3, v4

    add-int/lit8 v15, v15, 0x1

    move/from16 v4, v27

    goto :goto_3a

    :cond_43
    move/from16 v27, v4

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    if-eqz v8, :cond_4b

    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_44

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_44

    goto :goto_3b

    :cond_44
    const-string v1, "no items"

    invoke-static {v1}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_3b
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v1

    new-array v3, v1, [I

    const/4 v8, 0x0

    :goto_3c
    if-ge v8, v1, :cond_45

    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lo0/q;

    iget v11, v11, Lo0/q;->f:I

    aput v11, v3, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_3c

    :cond_45
    new-array v1, v1, [I

    if-eqz v17, :cond_4a

    move-object/from16 v8, v17

    invoke-interface {v8, v5, v9, v3, v1}, Ll0/l;->b(Ly3/c;I[I[I)V

    invoke-static {v1}, Lm83/n;->u0([I)Li93/j;

    move-result-object v3

    iget v8, v3, Li93/h;->w:I

    iget v11, v3, Li93/h;->x:I

    iget v3, v3, Li93/h;->y:I

    if-lez v3, :cond_46

    if-le v8, v11, :cond_47

    :cond_46
    if-gez v3, :cond_49

    if-gt v11, v8, :cond_49

    :cond_47
    :goto_3d
    aget v14, v1, v8

    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lo0/q;

    invoke-virtual {v15, v14, v2, v9}, Lo0/q;->a(III)[Lo0/p;

    move-result-object v14

    array-length v15, v14

    move-object/from16 v16, v1

    const/4 v1, 0x0

    :goto_3e
    if-ge v1, v15, :cond_48

    move/from16 v17, v1

    aget-object v1, v14, v17

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v17, 0x1

    goto :goto_3e

    :cond_48
    if-eq v8, v11, :cond_49

    add-int/2addr v8, v3

    move-object/from16 v1, v16

    goto :goto_3d

    :cond_49
    move/from16 v6, v64

    const/4 v14, 0x0

    goto/16 :goto_44

    :cond_4a
    const-string v0, "null verticalArrangement"

    invoke-static {v0}, Lk0/a;->b(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :cond_4b
    move-object v3, v11

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    const/16 v18, -0x1

    add-int/lit8 v3, v3, -0x1

    if-ltz v3, :cond_4d

    move/from16 v8, v22

    :goto_3f
    add-int/lit8 v14, v3, -0x1

    invoke-interface {v11, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo0/p;

    iget v15, v3, Lo0/p;->o:I

    sub-int/2addr v8, v15

    const/4 v15, 0x0

    invoke-virtual {v3, v8, v15, v2, v9}, Lo0/p;->a(IIII)V

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-gez v14, :cond_4c

    goto :goto_40

    :cond_4c
    move v3, v14

    goto :goto_3f

    :cond_4d
    :goto_40
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v3

    move/from16 v11, v22

    const/4 v8, 0x0

    :goto_41
    if-ge v8, v3, :cond_4f

    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lo0/q;

    invoke-virtual {v14, v11, v2, v9}, Lo0/q;->a(III)[Lo0/p;

    move-result-object v15

    move/from16 v16, v3

    array-length v3, v15

    const/4 v5, 0x0

    :goto_42
    if-ge v5, v3, :cond_4e

    move/from16 v17, v3

    aget-object v3, v15, v5

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    move/from16 v3, v17

    goto :goto_42

    :cond_4e
    iget v3, v14, Lo0/q;->g:I

    add-int/2addr v11, v3

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v5, p1

    move/from16 v3, v16

    goto :goto_41

    :cond_4f
    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v5, 0x0

    :goto_43
    if-ge v5, v3, :cond_50

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lo0/p;

    const/4 v14, 0x0

    invoke-virtual {v6, v11, v14, v2, v9}, Lo0/p;->a(IIII)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v6, v6, Lo0/p;->o:I

    add-int/2addr v11, v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_43

    :cond_50
    const/4 v14, 0x0

    move/from16 v6, v64

    :goto_44
    float-to-int v1, v6

    move-object/from16 v3, v62

    iget-object v5, v3, Lo0/h;->c:Lab/h0;

    move/from16 v17, v1

    move/from16 v18, v2

    move-object/from16 v20, v4

    move/from16 v19, v9

    move/from16 v28, v10

    move-object/from16 v16, v21

    move-object/from16 v22, v41

    move-object/from16 v21, v5

    invoke-virtual/range {v16 .. v30}, Landroidx/compose/foundation/lazy/layout/b;->d(IIILjava/util/ArrayList;Lab/h0;La2/a;ZZIZIILbc3/c0;Li2/f0;)V

    move-object/from16 v5, v22

    move/from16 v1, v24

    if-nez v1, :cond_52

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/foundation/lazy/layout/b;->b()J

    move-result-wide v14

    move/from16 v64, v6

    move v8, v7

    const-wide/16 v6, 0x0

    invoke-static {v14, v15, v6, v7}, Ly3/l;->a(JJ)Z

    move-result v6

    if-nez v6, :cond_53

    shr-long v6, v14, v38

    long-to-int v6, v6

    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v2, v12, v13}, Ly3/b;->g(IJ)I

    move-result v2

    and-long v6, v14, v39

    long-to-int v6, v6

    invoke-static {v9, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-static {v6, v12, v13}, Ly3/b;->f(IJ)I

    move-result v6

    if-eq v6, v9, :cond_51

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/4 v9, 0x0

    :goto_45
    if-ge v9, v7, :cond_51

    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lo0/p;

    iput v6, v11, Lo0/p;->p:I

    iget v12, v11, Lo0/p;->f:I

    add-int/2addr v12, v6

    iput v12, v11, Lo0/p;->r:I

    add-int/lit8 v9, v9, 0x1

    goto :goto_45

    :cond_51
    move/from16 v23, v6

    :goto_46
    move/from16 v22, v2

    goto :goto_47

    :cond_52
    move/from16 v64, v6

    move v8, v7

    :cond_53
    move/from16 v23, v9

    goto :goto_46

    :goto_47
    iget-object v2, v3, Lo0/h;->b:Lo0/g;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v20, La0/r;->a:La0/f0;

    new-instance v2, Lnq0/m;

    const/4 v3, 0x3

    invoke-direct {v2, v3, v0, v5}, Lnq0/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v3, p0

    iget-object v0, v3, Lo0/n;->h:Lp0/e1;

    move-object/from16 v16, v0

    move-object/from16 v24, v2

    move-object/from16 v19, v4

    move/from16 v21, v36

    move/from16 v18, v61

    move/from16 v17, v63

    invoke-static/range {v16 .. v24}, Lp0/y;->i(Lp0/e1;IILjava/util/ArrayList;La0/f0;IIILkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object v0

    move/from16 v11, v17

    move/from16 v12, v18

    move/from16 v2, v22

    move/from16 v6, v23

    add-int/lit8 v4, v66, -0x1

    if-ne v12, v4, :cond_55

    move v7, v8

    if-le v10, v7, :cond_54

    goto :goto_49

    :cond_54
    const/4 v5, 0x0

    :goto_48
    move-object/from16 v20, v19

    goto :goto_4a

    :cond_55
    :goto_49
    move/from16 v5, v31

    goto :goto_48

    :goto_4a
    new-instance v19, Ln0/m;

    const/16 v24, 0x1

    move-object/from16 v22, v0

    move/from16 v23, v1

    move-object/from16 v21, v20

    move-object/from16 v20, v57

    invoke-direct/range {v19 .. v24}, Ln0/m;-><init>(Lp1/c1;Ljava/util/ArrayList;Ljava/util/List;ZI)V

    move-object/from16 v1, v19

    move-object/from16 v4, v21

    add-int v2, v2, v50

    move-wide/from16 v7, p2

    invoke-static {v2, v7, v8}, Ly3/b;->g(IJ)I

    move-result v2

    add-int v6, v6, v49

    invoke-static {v6, v7, v8}, Ly3/b;->f(IJ)I

    move-result v6

    move-object/from16 v8, v37

    move-object/from16 v7, v58

    invoke-interface {v7, v2, v6, v8, v1}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v1

    invoke-static {v11, v12, v4, v0}, Lp0/y;->p(IILjava/util/ArrayList;Ljava/util/List;)Ljava/util/List;

    move-result-object v15

    sget-object v19, Lh0/d2;->w:Lh0/d2;

    new-instance v2, Lo0/o;

    move-object/from16 v11, p1

    move/from16 v12, v25

    move/from16 v4, v27

    move-object/from16 v10, v29

    move-object/from16 v13, v34

    move/from16 v21, v35

    move-object/from16 v3, v42

    move/from16 v17, v48

    move-object/from16 v14, v53

    move/from16 v20, v55

    move/from16 v16, v56

    move/from16 v9, v59

    move/from16 v8, v60

    move/from16 v6, v64

    move/from16 v18, v66

    const/4 v0, 0x0

    move-object v7, v1

    invoke-direct/range {v2 .. v21}, Lo0/o;-><init>(Lo0/q;IZFLy2/s0;FZLbc3/c0;Ly3/c;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/util/List;IIILh0/d2;II)V

    :goto_4b
    invoke-interface/range {v58 .. v58}, Ly2/r;->A()Z

    move-result v1

    move-object/from16 v3, v54

    invoke-virtual {v3, v2, v1, v0}, Lo0/y;->f(Lo0/o;ZZ)V

    return-object v2

    :goto_4c
    invoke-static {v8, v10, v9}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    throw v0

    :cond_56
    const-string v0, "null verticalArrangement when isVertical == true"

    invoke-static {v0}, Lk0/a;->b(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

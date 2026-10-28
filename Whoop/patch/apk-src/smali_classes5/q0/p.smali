.class public final Lq0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/c0;


# instance fields
.field public final synthetic a:Lq0/y;

.field public final synthetic b:Lh0/d2;

.field public final synthetic c:Ll0/k1;

.field public final synthetic d:F

.field public final synthetic e:Lq0/e;

.field public final synthetic f:Lc93/a;

.field public final synthetic g:Lc93/a;

.field public final synthetic h:Lb2/g;

.field public final synthetic i:Lb2/f;

.field public final synthetic j:I

.field public final synthetic k:Li0/n;

.field public final synthetic l:Lbc3/c0;


# direct methods
.method public constructor <init>(Lq0/y;Lh0/d2;Ll0/k1;FLq0/e;Lj93/u;Lc93/a;Lb2/g;Lb2/f;ILi0/n;Lbc3/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq0/p;->a:Lq0/y;

    iput-object p2, p0, Lq0/p;->b:Lh0/d2;

    iput-object p3, p0, Lq0/p;->c:Ll0/k1;

    iput p4, p0, Lq0/p;->d:F

    iput-object p5, p0, Lq0/p;->e:Lq0/e;

    iput-object p6, p0, Lq0/p;->f:Lc93/a;

    iput-object p7, p0, Lq0/p;->g:Lc93/a;

    iput-object p8, p0, Lq0/p;->h:Lb2/g;

    iput-object p9, p0, Lq0/p;->i:Lb2/f;

    iput p10, p0, Lq0/p;->j:I

    iput-object p11, p0, Lq0/p;->k:Li0/n;

    iput-object p12, p0, Lq0/p;->l:Lbc3/c0;

    return-void
.end method


# virtual methods
.method public final a(Lp0/d0;J)Ly2/s0;
    .locals 58

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    iget-object v0, v2, Lp0/d0;->x:Ly2/v1;

    iget-object v15, v1, Lq0/p;->a:Lq0/y;

    iget-object v5, v15, Lq0/y;->E:Lp1/c1;

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    sget-object v5, Lh0/d2;->w:Lh0/d2;

    iget-object v9, v1, Lq0/p;->b:Lh0/d2;

    if-ne v9, v5, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    if-eqz v8, :cond_1

    move-object v10, v5

    goto :goto_1

    :cond_1
    sget-object v10, Lh0/d2;->x:Lh0/d2;

    :goto_1
    invoke-static {v3, v4, v10}, Ljc/x;->q(JLh0/d2;)V

    iget-object v10, v1, Lq0/p;->c:Ll0/k1;

    if-eqz v8, :cond_2

    invoke-interface {v0}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v11

    invoke-interface {v10, v11}, Ll0/k1;->b(Ly3/m;)F

    move-result v11

    invoke-interface {v0, v11}, Ly3/c;->F(F)I

    move-result v11

    goto :goto_2

    :cond_2
    invoke-interface {v0}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v11

    invoke-static {v10, v11}, Landroidx/compose/foundation/layout/a;->i(Ll0/k1;Ly3/m;)F

    move-result v11

    invoke-interface {v0, v11}, Ly3/c;->F(F)I

    move-result v11

    :goto_2
    if-eqz v8, :cond_3

    invoke-interface {v0}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v12

    invoke-interface {v10, v12}, Ll0/k1;->c(Ly3/m;)F

    move-result v12

    invoke-interface {v0, v12}, Ly3/c;->F(F)I

    move-result v12

    goto :goto_3

    :cond_3
    invoke-interface {v0}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v12

    invoke-static {v10, v12}, Landroidx/compose/foundation/layout/a;->h(Ll0/k1;Ly3/m;)F

    move-result v12

    invoke-interface {v0, v12}, Ly3/c;->F(F)I

    move-result v12

    :goto_3
    invoke-interface {v10}, Ll0/k1;->d()F

    move-result v13

    invoke-interface {v0, v13}, Ly3/c;->F(F)I

    move-result v13

    invoke-interface {v10}, Ll0/k1;->a()F

    move-result v10

    invoke-interface {v0, v10}, Ly3/c;->F(F)I

    move-result v10

    add-int/2addr v10, v13

    add-int v14, v11, v12

    if-eqz v8, :cond_4

    move/from16 v16, v10

    goto :goto_4

    :cond_4
    move/from16 v16, v14

    :goto_4
    if-eqz v8, :cond_5

    move v12, v13

    goto :goto_5

    :cond_5
    if-nez v8, :cond_6

    move v12, v11

    :cond_6
    :goto_5
    sub-int v6, v16, v12

    neg-int v7, v14

    move/from16 v16, v8

    neg-int v8, v10

    invoke-static {v7, v3, v4, v8}, Ly3/b;->i(IJI)J

    move-result-wide v7

    iput-object v2, v15, Lq0/y;->q:Ly3/c;

    iget v2, v1, Lq0/p;->d:F

    invoke-interface {v0, v2}, Ly3/c;->F(F)I

    move-result v18

    if-eqz v16, :cond_7

    invoke-static {v3, v4}, Ly3/a;->h(J)I

    move-result v2

    sub-int/2addr v2, v10

    :goto_6
    move-wide/from16 v19, v7

    goto :goto_7

    :cond_7
    invoke-static {v3, v4}, Ly3/a;->i(J)I

    move-result v2

    sub-int/2addr v2, v14

    goto :goto_6

    :goto_7
    int-to-long v7, v11

    const/16 v11, 0x20

    shl-long/2addr v7, v11

    move-wide/from16 v21, v7

    int-to-long v7, v13

    const-wide v23, 0xffffffffL

    and-long v7, v7, v23

    or-long v7, v21, v7

    iget-object v11, v1, Lq0/p;->e:Lq0/e;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-gez v2, :cond_8

    const/4 v13, 0x0

    goto :goto_8

    :cond_8
    move v13, v2

    :goto_8
    if-ne v9, v5, :cond_9

    invoke-static/range {v19 .. v20}, Ly3/a;->i(J)I

    move-result v11

    goto :goto_9

    :cond_9
    move v11, v13

    :goto_9
    if-eq v9, v5, :cond_a

    invoke-static/range {v19 .. v20}, Ly3/a;->h(J)I

    move-result v16

    move/from16 v21, v16

    move/from16 v16, v2

    move/from16 v2, v21

    :goto_a
    move-wide/from16 v21, v7

    goto :goto_b

    :cond_a
    move/from16 v16, v2

    move v2, v13

    goto :goto_a

    :goto_b
    const/4 v7, 0x5

    move-object/from16 v23, v9

    invoke-static {v11, v2, v7}, Ly3/b;->b(III)J

    move-result-wide v8

    iput-wide v8, v15, Lq0/y;->B:J

    iget-object v2, v1, Lq0/p;->f:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq0/o;

    add-int v8, v16, v12

    add-int/2addr v8, v6

    iget-object v9, v1, Lq0/p;->k:Li0/n;

    invoke-static {}, Lyl/a;->c()Lz1/f;

    move-result-object v11

    if-eqz v11, :cond_b

    invoke-virtual {v11}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v25

    move-object/from16 v7, v25

    :goto_c
    move/from16 v26, v10

    goto :goto_d

    :cond_b
    const/4 v7, 0x0

    goto :goto_c

    :goto_d
    invoke-static {v11}, Lyl/a;->e(Lz1/f;)Lz1/f;

    move-result-object v10

    move/from16 v28, v14

    :try_start_0
    invoke-virtual {v15}, Lq0/y;->k()I

    move-result v14

    move-object/from16 v29, v5

    iget-object v5, v15, Lq0/y;->d:Ll9/o;

    move-object/from16 v36, v0

    iget-object v0, v5, Ll9/o;->e:Ljava/lang/Object;

    invoke-static {v14, v0, v2}, Lp0/y;->k(ILjava/lang/Object;Lp0/b0;)I

    move-result v0

    if-eq v14, v0, :cond_c

    iget-object v3, v5, Ll9/o;->c:Ljava/lang/Object;

    check-cast v3, Lp1/h1;

    invoke-virtual {v3, v0}, Lp1/h1;->y(I)V

    iget-object v3, v5, Ll9/o;->f:Ljava/lang/Object;

    check-cast v3, Lp0/f0;

    invoke-virtual {v3, v14}, Lp0/f0;->a(I)V

    :cond_c
    invoke-virtual {v15}, Lq0/y;->k()I

    iget-object v3, v5, Ll9/o;->d:Ljava/lang/Object;

    check-cast v3, Lp1/g1;

    invoke-virtual {v3}, Lp1/g1;->x()F

    move-result v3

    invoke-virtual {v15}, Lq0/y;->m()I

    invoke-interface {v9, v8, v13, v12, v6}, Li0/n;->a(IIII)I

    move-result v4

    int-to-float v4, v4

    add-int v5, v13, v18

    int-to-float v9, v5

    mul-float/2addr v3, v9

    sub-float/2addr v4, v3

    invoke-static {v4}, Le93/b;->X(F)I

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v11, v10, v7}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    iget-object v4, v15, Lq0/y;->C:Lp0/h0;

    iget-object v7, v15, Lq0/y;->x:Laj/d;

    invoke-static {v2, v4, v7}, Lp0/y;->j(Lp0/b0;Lp0/h0;Laj/d;)Ljava/util/List;

    move-result-object v4

    sget-object v7, La0/t;->a:La0/g0;

    new-instance v14, La0/g0;

    invoke-direct {v14}, La0/g0;-><init>()V

    iget-object v7, v1, Lq0/p;->g:Lc93/a;

    invoke-interface {v7}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    iget-object v9, v15, Lq0/y;->D:Lp1/c1;

    if-ltz v12, :cond_d

    goto :goto_e

    :cond_d
    const-string v10, "negative beforeContentPadding"

    invoke-static {v10}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_e
    if-ltz v6, :cond_e

    goto :goto_f

    :cond_e
    const-string v10, "negative afterContentPadding"

    invoke-static {v10}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_f
    if-gez v5, :cond_f

    const/4 v10, 0x0

    goto :goto_10

    :cond_f
    move v10, v5

    :goto_10
    iget v11, v1, Lq0/p;->j:I

    if-le v11, v7, :cond_10

    move v11, v7

    :cond_10
    move/from16 v30, v0

    sget-object v0, Lm83/z;->w:Lm83/z;

    move-object/from16 v31, v2

    iget-object v2, v1, Lq0/p;->k:Li0/n;

    move-object/from16 v32, v2

    iget-object v2, v1, Lq0/p;->l:Lbc3/c0;

    if-gtz v7, :cond_11

    neg-int v3, v12

    add-int v22, v16, v6

    invoke-static/range {v19 .. v20}, Ly3/a;->k(J)I

    move-result v4

    invoke-static/range {v19 .. v20}, Ly3/a;->j(J)I

    move-result v5

    new-instance v7, Ldc1/c;

    const/16 v8, 0x1b

    invoke-direct {v7, v8}, Ldc1/c;-><init>(I)V

    add-int v4, v4, v28

    move-wide/from16 v8, p2

    invoke-static {v4, v8, v9}, Ly3/b;->g(IJ)I

    move-result v4

    add-int v5, v5, v26

    invoke-static {v5, v8, v9}, Ly3/b;->f(IJ)I

    move-result v5

    move-object/from16 v8, v36

    invoke-interface {v8, v4, v5, v0, v7}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v25

    new-instance v16, Lq0/q;

    move-object/from16 v26, v2

    move/from16 v21, v3

    move/from16 v19, v6

    move/from16 v17, v13

    move-object/from16 v20, v23

    move-object/from16 v24, v32

    move/from16 v23, v11

    invoke-direct/range {v16 .. v26}, Lq0/q;-><init>(IIILh0/d2;IIILi0/n;Ly2/s0;Lbc3/c0;)V

    move-object/from16 v37, v15

    :goto_11
    move-object/from16 v0, v16

    goto/16 :goto_55

    :cond_11
    move/from16 v35, v11

    move-object v11, v9

    move-object/from16 v9, v23

    move/from16 v23, v35

    move-object/from16 v35, v2

    move-object/from16 v37, v15

    move-object/from16 v2, v29

    move-object/from16 v15, v32

    if-ne v9, v2, :cond_12

    invoke-static/range {v19 .. v20}, Ly3/a;->i(J)I

    move-result v29

    move/from16 v56, v29

    move/from16 v29, v3

    move/from16 v3, v56

    goto :goto_12

    :cond_12
    move/from16 v29, v3

    move v3, v13

    :goto_12
    if-eq v9, v2, :cond_13

    invoke-static/range {v19 .. v20}, Ly3/a;->h(J)I

    move-result v2

    :goto_13
    move-object/from16 v24, v4

    const/4 v4, 0x5

    goto :goto_14

    :cond_13
    move v2, v13

    goto :goto_13

    :goto_14
    invoke-static {v3, v2, v4}, Ly3/b;->b(III)J

    move-result-wide v2

    move/from16 v4, v30

    :goto_15
    if-lez v4, :cond_14

    if-lez v29, :cond_14

    add-int/lit8 v4, v4, -0x1

    sub-int v29, v29, v10

    goto :goto_15

    :cond_14
    mul-int/lit8 v29, v29, -0x1

    if-lt v4, v7, :cond_15

    add-int/lit8 v4, v7, -0x1

    const/16 v29, 0x0

    :cond_15
    move-object/from16 v30, v0

    new-instance v0, Lm83/m;

    invoke-direct {v0}, Lm83/m;-><init>()V

    move-object/from16 v32, v15

    neg-int v15, v12

    if-gez v18, :cond_16

    move/from16 v33, v18

    :goto_16
    move/from16 v34, v15

    goto :goto_17

    :cond_16
    const/16 v33, 0x0

    goto :goto_16

    :goto_17
    add-int v15, v34, v33

    add-int v29, v29, v15

    move-object/from16 v38, v11

    move/from16 v33, v29

    move/from16 v29, v15

    const/4 v15, 0x0

    :goto_18
    iget-object v11, v1, Lq0/p;->h:Lb2/g;

    move/from16 v39, v10

    iget-object v10, v1, Lq0/p;->i:Lb2/f;

    if-gez v33, :cond_17

    if-lez v4, :cond_17

    add-int/lit8 v4, v4, -0x1

    move/from16 v40, v12

    invoke-interface/range {v36 .. v36}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v12

    move/from16 v42, v6

    move/from16 v49, v7

    move/from16 v47, v8

    move/from16 v46, v16

    move/from16 v45, v18

    move-wide/from16 v43, v19

    move-wide/from16 v7, v21

    move/from16 v52, v23

    move-object/from16 v48, v24

    move-object/from16 v6, v31

    move-object/from16 v50, v38

    move/from16 v51, v39

    move/from16 v41, v40

    const/4 v1, 0x0

    const/16 v17, 0x1

    move/from16 v16, v5

    move-wide/from16 v56, v2

    move-object/from16 v2, p1

    move v3, v4

    move-wide/from16 v4, v56

    invoke-static/range {v2 .. v14}, Lds/q;->x(Lp0/d0;IJLq0/o;JLh0/d2;Lb2/f;Lb2/g;Ly3/m;ILa0/g0;)Lq0/d;

    move-result-object v10

    move-wide v11, v4

    invoke-virtual {v0, v1, v10}, Lm83/m;->add(ILjava/lang/Object;)V

    iget v2, v10, Lq0/d;->i:I

    invoke-static {v15, v2}, Ljava/lang/Math;->max(II)I

    move-result v15

    add-int v33, v33, v51

    move-object/from16 v1, p0

    move v4, v3

    move-wide v2, v11

    move/from16 v5, v16

    move/from16 v12, v41

    move/from16 v6, v42

    move/from16 v16, v46

    move/from16 v8, v47

    move/from16 v7, v49

    move/from16 v10, v51

    goto :goto_18

    :cond_17
    move/from16 v42, v6

    move/from16 v49, v7

    move/from16 v47, v8

    move/from16 v41, v12

    move/from16 v46, v16

    move/from16 v45, v18

    move-wide/from16 v43, v19

    move-wide/from16 v7, v21

    move/from16 v52, v23

    move-object/from16 v48, v24

    move-object/from16 v6, v31

    move-object/from16 v50, v38

    move/from16 v51, v39

    const/4 v1, 0x0

    const/16 v17, 0x1

    move/from16 v16, v5

    move-wide/from16 v56, v2

    move-object v2, v11

    move-wide/from16 v11, v56

    move/from16 v3, v29

    move/from16 v5, v33

    if-ge v5, v3, :cond_18

    move v5, v3

    :cond_18
    sub-int/2addr v5, v3

    move/from16 v18, v15

    move/from16 v1, v42

    move/from16 v15, v46

    add-int v23, v15, v1

    move/from16 v19, v1

    if-gez v23, :cond_19

    const/4 v1, 0x0

    :goto_19
    move-object/from16 v20, v2

    goto :goto_1a

    :cond_19
    move/from16 v1, v23

    goto :goto_19

    :goto_1a
    neg-int v2, v5

    move/from16 v29, v3

    move/from16 v22, v4

    move/from16 v24, v22

    const/4 v3, 0x0

    const/16 v21, 0x0

    :goto_1b
    iget v4, v0, Lm83/m;->y:I

    if-ge v3, v4, :cond_1b

    if-lt v2, v1, :cond_1a

    invoke-virtual {v0, v3}, Lm83/m;->c(I)Ljava/lang/Object;

    move/from16 v21, v17

    goto :goto_1b

    :cond_1a
    add-int/lit8 v22, v22, 0x1

    add-int v2, v2, v51

    add-int/lit8 v3, v3, 0x1

    goto :goto_1b

    :cond_1b
    move-object/from16 v3, v32

    move/from16 v32, v21

    move-object/from16 v21, v3

    move/from16 v3, v18

    move/from16 v4, v22

    move/from16 v18, v5

    :goto_1c
    move/from16 v5, v49

    if-ge v4, v5, :cond_20

    if-lt v2, v1, :cond_1c

    if-lez v2, :cond_1c

    invoke-virtual {v0}, Lm83/m;->isEmpty()Z

    move-result v22

    if-eqz v22, :cond_1d

    :cond_1c
    move/from16 v49, v5

    move-wide/from16 v56, v11

    move v11, v3

    move v3, v4

    move-wide/from16 v4, v56

    goto :goto_1e

    :cond_1d
    move v1, v4

    move v4, v2

    move v2, v1

    move-wide/from16 v53, v11

    move-object/from16 v11, v20

    :goto_1d
    move v1, v3

    move/from16 v49, v5

    move/from16 v39, v51

    goto/16 :goto_23

    :goto_1e
    invoke-interface/range {v36 .. v36}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v12

    move/from16 v22, v1

    move v1, v11

    move/from16 v46, v15

    move-object/from16 v11, v20

    move/from16 v15, v29

    move/from16 v39, v51

    move/from16 v20, v2

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v14}, Lds/q;->x(Lp0/d0;IJLq0/o;JLh0/d2;Lb2/f;Lb2/g;Ly3/m;ILa0/g0;)Lq0/d;

    move-result-object v12

    move v2, v3

    add-int/lit8 v3, v49, -0x1

    if-ne v2, v3, :cond_1e

    move/from16 v27, v13

    :goto_1f
    move-wide/from16 v53, v4

    goto :goto_20

    :cond_1e
    move/from16 v27, v39

    goto :goto_1f

    :goto_20
    add-int v4, v20, v27

    if-gt v4, v15, :cond_1f

    if-eq v2, v3, :cond_1f

    add-int/lit8 v3, v2, 0x1

    sub-int v18, v18, v39

    move/from16 v24, v3

    move/from16 v32, v17

    :goto_21
    move v3, v1

    goto :goto_22

    :cond_1f
    iget v3, v12, Lq0/d;->i:I

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {v0, v12}, Lm83/m;->addLast(Ljava/lang/Object;)V

    goto :goto_21

    :goto_22
    add-int/lit8 v1, v2, 0x1

    move v2, v4

    move-object/from16 v20, v11

    move/from16 v29, v15

    move/from16 v51, v39

    move/from16 v15, v46

    move-wide/from16 v11, v53

    move v4, v1

    move/from16 v1, v22

    goto :goto_1c

    :cond_20
    move-wide/from16 v53, v11

    move-object/from16 v11, v20

    move/from16 v20, v2

    move v2, v4

    move/from16 v4, v20

    goto :goto_1d

    :goto_23
    if-ge v4, v15, :cond_23

    sub-int v3, v15, v4

    sub-int v18, v18, v3

    add-int v20, v4, v3

    move/from16 v3, v18

    move/from16 v4, v41

    :goto_24
    if-ge v3, v4, :cond_21

    if-lez v24, :cond_21

    add-int/lit8 v24, v24, -0x1

    invoke-interface/range {v36 .. v36}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v12

    move/from16 v55, v2

    move/from16 v18, v3

    move/from16 v46, v15

    move/from16 v3, v24

    move-object/from16 v2, p1

    move v15, v4

    move-wide/from16 v4, v53

    invoke-static/range {v2 .. v14}, Lds/q;->x(Lp0/d0;IJLq0/o;JLh0/d2;Lb2/f;Lb2/g;Ly3/m;ILa0/g0;)Lq0/d;

    move-result-object v12

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v12}, Lm83/m;->add(ILjava/lang/Object;)V

    iget v2, v12, Lq0/d;->i:I

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int v2, v18, v39

    move v4, v15

    move/from16 v15, v46

    move v3, v2

    move/from16 v2, v55

    goto :goto_24

    :cond_21
    move/from16 v55, v2

    move/from16 v18, v3

    move/from16 v46, v15

    move v15, v4

    if-gez v18, :cond_22

    add-int v2, v20, v18

    move/from16 v18, v1

    move v1, v2

    const/4 v2, 0x0

    goto :goto_25

    :cond_22
    move/from16 v2, v18

    move/from16 v18, v1

    move/from16 v1, v20

    goto :goto_25

    :cond_23
    move/from16 v55, v2

    move/from16 v46, v15

    move/from16 v15, v41

    move/from16 v2, v18

    move/from16 v18, v1

    move v1, v4

    :goto_25
    if-ltz v2, :cond_24

    goto :goto_26

    :cond_24
    const-string v3, "invalid currentFirstPageScrollOffset"

    invoke-static {v3}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_26
    neg-int v3, v2

    invoke-virtual {v0}, Lm83/m;->first()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lq0/d;

    if-gtz v15, :cond_26

    if-gez v45, :cond_25

    goto :goto_27

    :cond_25
    move/from16 v20, v2

    move/from16 v40, v15

    move/from16 v15, v39

    goto :goto_29

    :cond_26
    :goto_27
    invoke-virtual {v0}, Lm83/m;->a()I

    move-result v5

    const/4 v12, 0x0

    :goto_28
    if-ge v12, v5, :cond_25

    if-eqz v2, :cond_25

    move/from16 v40, v15

    move/from16 v15, v39

    move/from16 v20, v2

    if-gt v15, v2, :cond_27

    invoke-static {v0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v2

    if-eq v12, v2, :cond_27

    sub-int v2, v20, v15

    add-int/lit8 v12, v12, 0x1

    invoke-virtual {v0, v12}, Lm83/m;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lq0/d;

    move/from16 v39, v15

    move/from16 v15, v40

    goto :goto_28

    :cond_27
    :goto_29
    sub-int v2, v24, v52

    const/4 v5, 0x0

    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/lit8 v5, v24, -0x1

    if-gt v2, v5, :cond_2a

    const/4 v12, 0x0

    :goto_2a
    if-nez v12, :cond_28

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    :cond_28
    invoke-interface/range {v36 .. v36}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v22

    move/from16 v27, v1

    move v1, v2

    move/from16 v24, v3

    move-object/from16 v29, v4

    move v3, v5

    move/from16 v39, v15

    move-wide/from16 v4, v53

    move-object/from16 v2, p1

    move-object v15, v12

    move-object/from16 v12, v22

    move-object/from16 v22, v0

    move/from16 v0, v52

    invoke-static/range {v2 .. v14}, Lds/q;->x(Lp0/d0;IJLq0/o;JLh0/d2;Lb2/f;Lb2/g;Ly3/m;ILa0/g0;)Lq0/d;

    move-result-object v12

    invoke-interface {v15, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eq v3, v1, :cond_29

    add-int/lit8 v2, v3, -0x1

    move/from16 v52, v0

    move-wide/from16 v53, v4

    move-object v12, v15

    move-object/from16 v0, v22

    move/from16 v3, v24

    move-object/from16 v4, v29

    move/from16 v15, v39

    move v5, v2

    move v2, v1

    move/from16 v1, v27

    goto :goto_2a

    :cond_29
    :goto_2b
    move-object/from16 v2, v48

    goto :goto_2c

    :cond_2a
    move-object/from16 v22, v0

    move/from16 v27, v1

    move v1, v2

    move/from16 v24, v3

    move-object/from16 v29, v4

    move/from16 v39, v15

    move/from16 v0, v52

    move-wide/from16 v4, v53

    const/4 v15, 0x0

    goto :goto_2b

    :goto_2c
    move-object/from16 v31, v2

    check-cast v31, Ljava/util/Collection;

    invoke-interface/range {v31 .. v31}, Ljava/util/Collection;->size()I

    move-result v3

    move-object v12, v15

    const/4 v15, 0x0

    :goto_2d
    if-ge v15, v3, :cond_2d

    invoke-interface {v2, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v33

    check-cast v33, Ljava/lang/Number;

    move-object/from16 v48, v2

    invoke-virtual/range {v33 .. v33}, Ljava/lang/Number;->intValue()I

    move-result v2

    if-ge v2, v1, :cond_2c

    if-nez v12, :cond_2b

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    :cond_2b
    invoke-interface/range {v36 .. v36}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v33

    move/from16 v41, v1

    move/from16 v42, v15

    move-object/from16 v1, v48

    move-object v15, v12

    move-object/from16 v12, v33

    move/from16 v33, v3

    move v3, v2

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v14}, Lds/q;->x(Lp0/d0;IJLq0/o;JLh0/d2;Lb2/f;Lb2/g;Ly3/m;ILa0/g0;)Lq0/d;

    move-result-object v3

    invoke-interface {v15, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v12, v15

    goto :goto_2e

    :cond_2c
    move/from16 v41, v1

    move/from16 v33, v3

    move/from16 v42, v15

    move-object/from16 v1, v48

    :goto_2e
    add-int/lit8 v15, v42, 0x1

    move-object v2, v1

    move/from16 v3, v33

    move/from16 v1, v41

    goto :goto_2d

    :cond_2d
    move-object v1, v2

    sget-object v15, Lm83/y;->w:Lm83/y;

    if-nez v12, :cond_2e

    move-object v2, v15

    goto :goto_2f

    :cond_2e
    move-object v2, v12

    :goto_2f
    move-object/from16 v33, v2

    check-cast v33, Ljava/util/Collection;

    invoke-interface/range {v33 .. v33}, Ljava/util/Collection;->size()I

    move-result v3

    move/from16 v12, v18

    move-object/from16 v18, v15

    move v15, v12

    const/4 v12, 0x0

    :goto_30
    if-ge v12, v3, :cond_2f

    invoke-interface {v2, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v41

    move-object/from16 v42, v2

    move-object/from16 v2, v41

    check-cast v2, Lq0/d;

    iget v2, v2, Lq0/d;->i:I

    invoke-static {v15, v2}, Ljava/lang/Math;->max(II)I

    move-result v15

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v2, v42

    goto :goto_30

    :cond_2f
    move-object/from16 v42, v2

    invoke-virtual/range {v22 .. v22}, Lm83/m;->last()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq0/d;

    iget v2, v2, Lq0/d;->a:I

    sub-int v3, v49, v2

    add-int/lit8 v3, v3, -0x1

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    add-int/2addr v3, v2

    add-int/lit8 v2, v2, 0x1

    if-gt v2, v3, :cond_31

    const/4 v12, 0x0

    :goto_31
    if-nez v12, :cond_30

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    :cond_30
    invoke-interface/range {v36 .. v36}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v41

    move/from16 v48, v15

    move-object v15, v12

    move-object/from16 v12, v41

    move/from16 v41, v48

    move/from16 v52, v0

    move v0, v3

    move-object/from16 v48, v42

    move v3, v2

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v14}, Lds/q;->x(Lp0/d0;IJLq0/o;JLh0/d2;Lb2/f;Lb2/g;Ly3/m;ILa0/g0;)Lq0/d;

    move-result-object v12

    invoke-interface {v15, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eq v3, v0, :cond_32

    add-int/lit8 v2, v3, 0x1

    move v3, v0

    move-object v12, v15

    move/from16 v15, v41

    move-object/from16 v42, v48

    move/from16 v0, v52

    goto :goto_31

    :cond_31
    move/from16 v52, v0

    move v0, v3

    move/from16 v41, v15

    move-object/from16 v48, v42

    const/4 v15, 0x0

    :cond_32
    invoke-interface/range {v31 .. v31}, Ljava/util/Collection;->size()I

    move-result v2

    move-object v3, v15

    const/4 v15, 0x0

    :goto_32
    if-ge v15, v2, :cond_36

    invoke-interface {v1, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    move-result v12

    move/from16 v31, v0

    add-int/lit8 v0, v31, 0x1

    if-gt v0, v12, :cond_35

    move/from16 v0, v49

    if-ge v12, v0, :cond_34

    if-nez v3, :cond_33

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :cond_33
    move/from16 v42, v12

    invoke-interface/range {v36 .. v36}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v12

    move-object/from16 v49, v1

    move-object v1, v3

    move/from16 v3, v42

    move/from16 v42, v2

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v14}, Lds/q;->x(Lp0/d0;IJLq0/o;JLh0/d2;Lb2/f;Lb2/g;Ly3/m;ILa0/g0;)Lq0/d;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v3, v1

    goto :goto_33

    :cond_34
    move-object/from16 v49, v1

    move/from16 v42, v2

    move-object/from16 v2, p1

    goto :goto_33

    :cond_35
    move/from16 v0, v49

    move/from16 v42, v2

    move-object/from16 v2, p1

    move-object/from16 v49, v1

    :goto_33
    add-int/lit8 v15, v15, 0x1

    move/from16 v2, v42

    move-object/from16 v1, v49

    move/from16 v49, v0

    move/from16 v0, v31

    goto :goto_32

    :cond_36
    move-object/from16 v2, p1

    move/from16 v0, v49

    if-nez v3, :cond_37

    move-object/from16 v1, v18

    goto :goto_34

    :cond_37
    move-object v1, v3

    :goto_34
    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v4

    move/from16 v15, v41

    const/4 v7, 0x0

    :goto_35
    if-ge v7, v4, :cond_38

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lq0/d;

    iget v5, v5, Lq0/d;->i:I

    invoke-static {v15, v5}, Ljava/lang/Math;->max(II)I

    move-result v15

    add-int/lit8 v7, v7, 0x1

    goto :goto_35

    :cond_38
    invoke-virtual/range {v22 .. v22}, Lm83/m;->first()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v8, v29

    invoke-static {v8, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_39

    invoke-interface/range {v48 .. v48}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_39

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_39

    move/from16 v10, v17

    goto :goto_36

    :cond_39
    const/4 v10, 0x0

    :goto_36
    sget-object v4, Lh0/d2;->w:Lh0/d2;

    if-ne v9, v4, :cond_3a

    move v7, v15

    :goto_37
    move-wide/from16 v5, v43

    goto :goto_38

    :cond_3a
    move/from16 v7, v27

    goto :goto_37

    :goto_38
    invoke-static {v7, v5, v6}, Ly3/b;->g(IJ)I

    move-result v11

    if-ne v9, v4, :cond_3b

    move/from16 v15, v27

    :cond_3b
    invoke-static {v15, v5, v6}, Ly3/b;->f(IJ)I

    move-result v12

    if-ne v9, v4, :cond_3c

    move v4, v12

    :goto_39
    move/from16 v15, v46

    goto :goto_3a

    :cond_3c
    move v4, v11

    goto :goto_39

    :goto_3a
    invoke-static {v4, v15}, Ljava/lang/Math;->min(II)I

    move-result v5

    move/from16 v14, v27

    if-ge v14, v5, :cond_3d

    move/from16 v6, v17

    goto :goto_3b

    :cond_3d
    const/4 v6, 0x0

    :goto_3b
    if-eqz v6, :cond_3f

    if-nez v24, :cond_3e

    goto :goto_3c

    :cond_3e
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "non-zero pagesScrollOffset="

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move/from16 v7, v24

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lk0/a;->c(Ljava/lang/String;)V

    goto :goto_3d

    :cond_3f
    :goto_3c
    move/from16 v7, v24

    :goto_3d
    new-instance v5, Ljava/util/ArrayList;

    invoke-virtual/range {v22 .. v22}, Lm83/m;->a()I

    move-result v24

    invoke-interface/range {v48 .. v48}, Ljava/util/List;->size()I

    move-result v27

    add-int v27, v27, v24

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v24

    move-object/from16 v29, v3

    add-int v3, v24, v27

    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    if-eqz v6, :cond_47

    invoke-interface/range {v48 .. v48}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_40

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_40

    goto :goto_3e

    :cond_40
    const-string v3, "No extra pages"

    invoke-static {v3}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_3e
    invoke-virtual/range {v22 .. v22}, Lm83/m;->a()I

    move-result v3

    move-object v6, v5

    new-array v5, v3, [I

    const/4 v7, 0x0

    :goto_3f
    if-ge v7, v3, :cond_41

    aput v13, v5, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_3f

    :cond_41
    new-array v7, v3, [I

    move-object/from16 v16, v6

    move-object/from16 v24, v8

    move-object/from16 v3, v36

    move/from16 v8, v45

    invoke-interface {v3, v8}, Ly3/c;->e0(I)F

    move-result v6

    new-instance v3, Ll0/k;

    move/from16 v25, v10

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-direct {v3, v6, v10, v8}, Ll0/k;-><init>(FZLc93/m;)V

    sget-object v6, Lh0/d2;->w:Lh0/d2;

    if-ne v9, v6, :cond_42

    invoke-virtual {v3, v2, v4, v5, v7}, Ll0/k;->b(Ly3/c;I[I[I)V

    move-object/from16 v10, v16

    move-object/from16 v8, v36

    goto :goto_40

    :cond_42
    sget-object v6, Ly3/m;->w:Ly3/m;

    move-object v8, v3

    move-object v3, v2

    move-object v2, v8

    move-object/from16 v10, v16

    move-object/from16 v8, v36

    invoke-virtual/range {v2 .. v7}, Ll0/k;->c(Ly3/c;I[ILy3/m;[I)V

    :goto_40
    invoke-static {v7}, Lm83/n;->u0([I)Li93/j;

    move-result-object v2

    iget v3, v2, Li93/h;->w:I

    iget v4, v2, Li93/h;->x:I

    iget v2, v2, Li93/h;->y:I

    if-lez v2, :cond_43

    if-le v3, v4, :cond_44

    :cond_43
    if-gez v2, :cond_46

    if-gt v4, v3, :cond_46

    :cond_44
    :goto_41
    aget v5, v7, v3

    move-object/from16 v6, v22

    invoke-virtual {v6, v3}, Lm83/m;->get(I)Ljava/lang/Object;

    move-result-object v16

    move/from16 v22, v2

    move-object/from16 v2, v16

    check-cast v2, Lq0/d;

    invoke-virtual {v2, v5, v11, v12}, Lq0/d;->b(III)V

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eq v3, v4, :cond_45

    add-int v3, v3, v22

    move/from16 v2, v22

    move-object/from16 v22, v6

    goto :goto_41

    :cond_45
    :goto_42
    move-object/from16 v5, v48

    goto :goto_46

    :cond_46
    move-object/from16 v6, v22

    goto :goto_42

    :cond_47
    move-object/from16 v24, v8

    move/from16 v25, v10

    move-object/from16 v6, v22

    move-object/from16 v8, v36

    move-object v10, v5

    invoke-interface/range {v33 .. v33}, Ljava/util/Collection;->size()I

    move-result v2

    move v3, v7

    const/4 v4, 0x0

    :goto_43
    if-ge v4, v2, :cond_48

    move-object/from16 v5, v48

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v22

    move/from16 p1, v2

    move-object/from16 v2, v22

    check-cast v2, Lq0/d;

    sub-int v3, v3, v16

    invoke-virtual {v2, v3, v11, v12}, Lq0/d;->b(III)V

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    move/from16 v2, p1

    goto :goto_43

    :cond_48
    move-object/from16 v5, v48

    invoke-virtual {v6}, Lm83/m;->a()I

    move-result v2

    move v3, v7

    const/4 v7, 0x0

    :goto_44
    if-ge v7, v2, :cond_49

    invoke-virtual {v6, v7}, Lm83/m;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lq0/d;

    invoke-virtual {v4, v3, v11, v12}, Lq0/d;->b(III)V

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int v3, v3, v16

    add-int/lit8 v7, v7, 0x1

    goto :goto_44

    :cond_49
    invoke-interface/range {v29 .. v29}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v7, 0x0

    :goto_45
    if-ge v7, v2, :cond_4a

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lq0/d;

    invoke-virtual {v4, v3, v11, v12}, Lq0/d;->b(III)V

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int v3, v3, v16

    add-int/lit8 v7, v7, 0x1

    goto :goto_45

    :cond_4a
    :goto_46
    if-eqz v25, :cond_4b

    move-object/from16 v42, v5

    move-object v5, v10

    :goto_47
    move-object/from16 v16, v1

    goto :goto_49

    :cond_4b
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v7, 0x0

    :goto_48
    if-ge v7, v3, :cond_4d

    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v16, v1

    move-object v1, v4

    check-cast v1, Lq0/d;

    move/from16 p1, v3

    iget v3, v1, Lq0/d;->a:I

    invoke-virtual {v6}, Lm83/m;->first()Ljava/lang/Object;

    move-result-object v22

    move-object/from16 v42, v5

    move-object/from16 v5, v22

    check-cast v5, Lq0/d;

    iget v5, v5, Lq0/d;->a:I

    if-lt v3, v5, :cond_4c

    iget v1, v1, Lq0/d;->a:I

    invoke-virtual {v6}, Lm83/m;->last()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lq0/d;

    iget v3, v3, Lq0/d;->a:I

    if-gt v1, v3, :cond_4c

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4c
    add-int/lit8 v7, v7, 0x1

    move/from16 v3, p1

    move-object/from16 v1, v16

    move-object/from16 v5, v42

    goto :goto_48

    :cond_4d
    move-object/from16 v42, v5

    move-object v5, v2

    goto :goto_47

    :goto_49
    invoke-interface/range {v42 .. v42}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4e

    move-object/from16 v33, v18

    goto :goto_4b

    :cond_4e
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v7, 0x0

    :goto_4a
    if-ge v7, v2, :cond_50

    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lq0/d;

    iget v4, v4, Lq0/d;->a:I

    invoke-virtual {v6}, Lm83/m;->first()Ljava/lang/Object;

    move-result-object v22

    move/from16 p1, v2

    move-object/from16 v2, v22

    check-cast v2, Lq0/d;

    iget v2, v2, Lq0/d;->a:I

    if-ge v4, v2, :cond_4f

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4f
    add-int/lit8 v7, v7, 0x1

    move/from16 v2, p1

    goto :goto_4a

    :cond_50
    move-object/from16 v33, v1

    :goto_4b
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_51

    move-object/from16 v1, v18

    goto :goto_4d

    :cond_51
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v7, 0x0

    :goto_4c
    if-ge v7, v2, :cond_53

    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lq0/d;

    iget v4, v4, Lq0/d;->a:I

    invoke-virtual {v6}, Lm83/m;->last()Ljava/lang/Object;

    move-result-object v16

    move/from16 p1, v2

    move-object/from16 v2, v16

    check-cast v2, Lq0/d;

    iget v2, v2, Lq0/d;->a:I

    if-le v4, v2, :cond_52

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_52
    add-int/lit8 v7, v7, 0x1

    move/from16 v2, p1

    goto :goto_4c

    :cond_53
    :goto_4d
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_54

    move-object/from16 p1, v1

    move/from16 v22, v11

    move/from16 v6, v19

    move-object/from16 v1, v21

    move/from16 v4, v40

    move/from16 v7, v47

    const/16 v16, 0x0

    move-object/from16 v19, v5

    move-object/from16 v21, v9

    goto/16 :goto_4f

    :cond_54
    const/4 v2, 0x0

    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v2, v3

    check-cast v2, Lq0/d;

    iget v2, v2, Lq0/d;->k:I

    move-object/from16 p1, v1

    move-object/from16 v16, v3

    move/from16 v6, v19

    move-object/from16 v1, v21

    move/from16 v4, v40

    move/from16 v7, v47

    invoke-interface {v1, v7, v13, v4, v6}, Li0/n;->a(IIII)I

    move-result v3

    int-to-float v3, v3

    int-to-float v2, v2

    sub-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    neg-float v2, v2

    invoke-static {v5}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v3

    move/from16 v18, v2

    move/from16 v2, v17

    if-gt v2, v3, :cond_56

    move-object/from16 v21, v9

    move v9, v2

    move/from16 v2, v18

    :goto_4e
    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v19, v5

    move-object/from16 v5, v18

    check-cast v5, Lq0/d;

    iget v5, v5, Lq0/d;->k:I

    move/from16 v22, v11

    invoke-interface {v1, v7, v13, v4, v6}, Li0/n;->a(IIII)I

    move-result v11

    int-to-float v11, v11

    int-to-float v5, v5

    sub-float/2addr v5, v11

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    neg-float v5, v5

    invoke-static {v2, v5}, Ljava/lang/Float;->compare(FF)I

    move-result v11

    if-gez v11, :cond_55

    move v2, v5

    move-object/from16 v16, v18

    :cond_55
    if-eq v9, v3, :cond_57

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v5, v19

    move/from16 v11, v22

    goto :goto_4e

    :cond_56
    move-object/from16 v19, v5

    move-object/from16 v21, v9

    move/from16 v22, v11

    :cond_57
    :goto_4f
    move-object/from16 v2, v16

    check-cast v2, Lq0/d;

    invoke-interface {v1, v7, v13, v4, v6}, Li0/n;->a(IIII)I

    move-result v3

    if-eqz v2, :cond_58

    iget v7, v2, Lq0/d;->k:I

    goto :goto_50

    :cond_58
    const/4 v7, 0x0

    :goto_50
    if-nez v39, :cond_59

    const/4 v3, 0x0

    :goto_51
    move/from16 v27, v3

    goto :goto_52

    :cond_59
    sub-int/2addr v3, v7

    int-to-float v3, v3

    move/from16 v5, v39

    int-to-float v4, v5

    div-float/2addr v3, v4

    const/high16 v4, -0x41000000    # -0.5f

    const/high16 v5, 0x3f000000    # 0.5f

    invoke-static {v3, v4, v5}, Le93/b;->m(FFF)F

    move-result v3

    goto :goto_51

    :goto_52
    new-instance v3, Lnq0/m;

    const/16 v4, 0x1d

    move-object/from16 v11, v50

    invoke-direct {v3, v4, v11, v10}, Lnq0/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    add-int v11, v22, v28

    move-wide/from16 v4, p2

    invoke-static {v11, v4, v5}, Ly3/b;->g(IJ)I

    move-result v7

    add-int v12, v12, v26

    invoke-static {v12, v4, v5}, Ly3/b;->f(IJ)I

    move-result v4

    move-object/from16 v5, v30

    invoke-interface {v8, v7, v4, v5, v3}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v31

    move/from16 v3, v55

    if-lt v3, v0, :cond_5b

    if-le v14, v15, :cond_5a

    goto :goto_53

    :cond_5a
    const/16 v29, 0x0

    goto :goto_54

    :cond_5b
    :goto_53
    const/16 v29, 0x1

    :goto_54
    new-instance v16, Lq0/q;

    move-object/from16 v30, v1

    move-object/from16 v26, v2

    move/from16 v18, v13

    move-object/from16 v17, v19

    move/from16 v28, v20

    move-object/from16 v25, v24

    move/from16 v22, v34

    move/from16 v19, v45

    move/from16 v24, v52

    move-object/from16 v34, p1

    move/from16 v20, v6

    invoke-direct/range {v16 .. v35}, Lq0/q;-><init>(Ljava/util/List;IIILh0/d2;IIILq0/d;Lq0/d;FIZLi0/n;Ly2/s0;ZLjava/util/List;Ljava/util/List;Lbc3/c0;)V

    goto/16 :goto_11

    :goto_55
    invoke-interface {v8}, Ly2/r;->A()Z

    move-result v1

    move-object/from16 v3, v37

    const/4 v2, 0x0

    invoke-virtual {v3, v0, v1, v2}, Lq0/y;->h(Lq0/q;ZZ)V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-static {v11, v10, v7}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    throw v0
.end method

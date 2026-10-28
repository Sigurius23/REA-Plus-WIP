.class public final Ll0/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/z0;
.implements Ll0/n1;


# instance fields
.field public final a:Ll0/i;

.field public final b:Ll0/l;

.field public final c:F

.field public final d:Ll0/d0;

.field public final e:F

.field public final f:I

.field public final g:Ll0/o0;


# direct methods
.method public constructor <init>(Ll0/i;Ll0/l;FLl0/d0;FILl0/o0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll0/q0;->a:Ll0/i;

    iput-object p2, p0, Ll0/q0;->b:Ll0/l;

    iput p3, p0, Ll0/q0;->c:F

    iput-object p4, p0, Ll0/q0;->d:Ll0/d0;

    iput p5, p0, Ll0/q0;->e:F

    iput p6, p0, Ll0/q0;->f:I

    iput-object p7, p0, Ll0/q0;->g:Ll0/o0;

    return-void
.end method

.method public static k(Ljava/util/List;IIIILl0/o0;)I
    .locals 24

    move-object/from16 v0, p0

    move/from16 v1, p1

    const/4 v2, 0x0

    invoke-static {v2, v2}, La0/q;->a(II)J

    move-result-wide v3

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_d

    :cond_0
    const v5, 0x7fffffff

    invoke-static {v2, v1, v2, v5}, Ly3/b;->a(IIII)J

    move-result-wide v9

    new-instance v11, Ll0/l0;

    move/from16 v12, p3

    move/from16 v7, p4

    move-object/from16 v8, p5

    move-object v6, v11

    move/from16 v11, p2

    invoke-direct/range {v6 .. v12}, Ll0/l0;-><init>(ILl0/o0;JII)V

    move-object v11, v6

    invoke-static {v2, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly2/q0;

    if-eqz v6, :cond_1

    invoke-interface {v6, v1}, Ly2/q0;->C(I)I

    move-result v7

    goto :goto_0

    :cond_1
    move v7, v2

    :goto_0
    if-eqz v6, :cond_2

    invoke-interface {v6, v7}, Ly2/q0;->O(I)I

    move-result v8

    goto :goto_1

    :cond_2
    move v8, v2

    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v9

    const/4 v10, 0x1

    if-le v9, v10, :cond_3

    move v12, v10

    goto :goto_2

    :cond_3
    move v12, v2

    :goto_2
    invoke-static {v1, v5}, La0/q;->a(II)J

    move-result-wide v14

    move-wide/from16 v22, v3

    if-nez v6, :cond_4

    const/16 v16, 0x0

    goto :goto_3

    :cond_4
    invoke-static {v8, v7}, La0/q;->a(II)J

    move-result-wide v2

    new-instance v4, La0/q;

    invoke-direct {v4, v2, v3}, La0/q;-><init>(J)V

    move-object/from16 v16, v4

    :goto_3
    const/16 v20, 0x0

    const/16 v21, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-virtual/range {v11 .. v21}, Ll0/l0;->b(ZIJLa0/q;IIIZZ)Ll0/k0;

    move-result-object v2

    iget-boolean v2, v2, Ll0/k0;->b:Z

    if-eqz v2, :cond_5

    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Ll0/n0;->w:Ll0/n0;

    move-wide/from16 v3, v22

    goto/16 :goto_d

    :cond_5
    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    move v12, v1

    move/from16 v14, v17

    move/from16 v3, v19

    const/4 v4, 0x0

    const/4 v13, 0x0

    const/16 v22, 0x0

    :goto_4
    if-ge v4, v2, :cond_d

    sub-int v8, v12, v8

    add-int/lit8 v12, v4, 0x1

    invoke-static {v3, v7}, Ljava/lang/Math;->max(II)I

    move-result v19

    invoke-static {v12, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly2/q0;

    if-eqz v3, :cond_6

    invoke-interface {v3, v1}, Ly2/q0;->C(I)I

    move-result v7

    goto :goto_5

    :cond_6
    const/4 v7, 0x0

    :goto_5
    if-eqz v3, :cond_7

    invoke-interface {v3, v7}, Ly2/q0;->O(I)I

    move-result v13

    add-int v13, v13, p2

    goto :goto_6

    :cond_7
    const/4 v13, 0x0

    :goto_6
    add-int/lit8 v4, v4, 0x2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v15

    if-ge v4, v15, :cond_8

    move v4, v12

    move v12, v10

    goto :goto_7

    :cond_8
    move v4, v12

    const/4 v12, 0x0

    :goto_7
    sub-int v17, v4, v22

    move/from16 v16, v17

    move/from16 v17, v14

    invoke-static {v8, v5}, La0/q;->a(II)J

    move-result-wide v14

    if-nez v3, :cond_9

    const/4 v9, 0x0

    goto :goto_8

    :cond_9
    invoke-static {v13, v7}, La0/q;->a(II)J

    move-result-wide v5

    new-instance v9, La0/q;

    invoke-direct {v9, v5, v6}, La0/q;-><init>(J)V

    :goto_8
    const/16 v20, 0x0

    const/16 v21, 0x0

    move v6, v13

    move/from16 v13, v16

    move-object/from16 v16, v9

    invoke-virtual/range {v11 .. v21}, Ll0/l0;->b(ZIJLa0/q;IIIZZ)Ll0/k0;

    move-result-object v12

    iget-boolean v5, v12, Ll0/k0;->a:Z

    if-eqz v5, :cond_c

    add-int v19, v19, p3

    add-int v15, v19, v18

    move/from16 v14, v17

    move/from16 v17, v13

    if-eqz v3, :cond_a

    move v13, v10

    :goto_9
    move/from16 v16, v8

    goto :goto_a

    :cond_a
    const/4 v13, 0x0

    goto :goto_9

    :goto_a
    invoke-virtual/range {v11 .. v17}, Ll0/l0;->a(Ll0/k0;ZIIII)Ll0/g2;

    move/from16 v17, v14

    sub-int v13, v6, p2

    add-int/lit8 v14, v17, 0x1

    iget-boolean v3, v12, Ll0/k0;->b:Z

    if-eqz v3, :cond_b

    move v13, v4

    move/from16 v18, v15

    goto :goto_c

    :cond_b
    move v12, v1

    move/from16 v22, v4

    move v8, v13

    move/from16 v18, v15

    const/4 v3, 0x0

    goto :goto_b

    :cond_c
    move/from16 v16, v8

    move v8, v6

    move/from16 v12, v16

    move/from16 v14, v17

    move/from16 v3, v19

    :goto_b
    move v13, v4

    const v5, 0x7fffffff

    goto/16 :goto_4

    :cond_d
    :goto_c
    sub-int v0, v18, p3

    invoke-static {v0, v13}, La0/q;->a(II)J

    move-result-wide v3

    :goto_d
    const/16 v0, 0x20

    shr-long v0, v3, v0

    long-to-int v0, v0

    return v0
.end method


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 53

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move-object/from16 v1, p2

    move-wide/from16 v2, p3

    iget v4, v0, Ll0/q0;->f:I

    const/16 v5, 0x1b

    sget-object v13, Lm83/z;->w:Lm83/z;

    const/4 v14, 0x0

    if-eqz v4, :cond_0

    move-object v4, v1

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-static {v2, v3}, Ly3/a;->h(J)I

    move-result v4

    iget-object v7, v0, Ll0/q0;->g:Ll0/o0;

    if-nez v4, :cond_1

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Ll0/n0;->w:Ll0/n0;

    sget-object v1, Ll0/n0;->w:Ll0/n0;

    :cond_0
    move-object v3, v13

    goto/16 :goto_21

    :cond_1
    invoke-static {v1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_2

    new-instance v1, Ldc1/c;

    invoke-direct {v1, v5}, Ldc1/c;-><init>(I)V

    invoke-interface {v6, v14, v14, v13, v1}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v1

    return-object v1

    :cond_2
    const/4 v15, 0x1

    invoke-static {v15, v1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    const/16 v16, 0x0

    if-eqz v5, :cond_3

    invoke-static {v5}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly2/q0;

    goto :goto_0

    :cond_3
    move-object/from16 v5, v16

    :goto_0
    const/4 v8, 0x2

    invoke-static {v8, v1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_4

    invoke-static {v1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly2/q0;

    goto :goto_1

    :cond_4
    move-object/from16 v1, v16

    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, Ll0/c1;->w:Ll0/c1;

    invoke-static {v2, v3, v7}, Ll0/g2;->c(JLl0/c1;)J

    move-result-wide v9

    const/16 v11, 0xa

    invoke-static {v11, v9, v10}, Ll0/g2;->d(IJ)J

    move-result-wide v9

    invoke-static {v9, v10}, Ll0/g2;->e(J)J

    move-result-wide v9

    const v11, 0x7fffffff

    const/4 v12, 0x0

    if-eqz v5, :cond_6

    invoke-static {v5}, Ll0/f;->g(Ly2/q0;)Ll0/o1;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Ll0/f;->h(Ll0/o1;)F

    move-result v17

    cmpg-float v17, v17, v12

    if-nez v17, :cond_5

    invoke-static {v5}, Ll0/f;->g(Ly2/q0;)Ll0/o1;

    invoke-interface {v5, v9, v10}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v5

    move/from16 v17, v8

    invoke-virtual {v5}, Ly2/j1;->j0()I

    move-result v8

    move/from16 p2, v12

    invoke-virtual {v5}, Ly2/j1;->g0()I

    move-result v12

    move/from16 v18, v15

    invoke-static {v8, v12}, La0/q;->a(II)J

    move-result-wide v14

    new-instance v8, La0/q;

    invoke-direct {v8, v14, v15}, La0/q;-><init>(J)V

    invoke-virtual {v5}, Ly2/j1;->j0()I

    invoke-virtual {v5}, Ly2/j1;->g0()I

    goto :goto_2

    :cond_5
    move/from16 v17, v8

    move/from16 p2, v12

    move/from16 v18, v15

    invoke-interface {v5, v11}, Ly2/q0;->O(I)I

    move-result v8

    invoke-interface {v5, v8}, Ly2/q0;->C(I)I

    goto :goto_2

    :cond_6
    move/from16 v17, v8

    move/from16 p2, v12

    move/from16 v18, v15

    :goto_2
    if-eqz v1, :cond_8

    invoke-static {v1}, Ll0/f;->g(Ly2/q0;)Ll0/o1;

    move-result-object v5

    invoke-static {v5}, Ll0/f;->h(Ll0/o1;)F

    move-result v5

    cmpg-float v5, v5, p2

    if-nez v5, :cond_7

    invoke-static {v1}, Ll0/f;->g(Ly2/q0;)Ll0/o1;

    invoke-interface {v1, v9, v10}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v1

    invoke-virtual {v1}, Ly2/j1;->j0()I

    move-result v5

    invoke-virtual {v1}, Ly2/j1;->g0()I

    move-result v8

    invoke-static {v5, v8}, La0/q;->a(II)J

    move-result-wide v8

    new-instance v5, La0/q;

    invoke-direct {v5, v8, v9}, La0/q;-><init>(J)V

    invoke-virtual {v1}, Ly2/j1;->j0()I

    invoke-virtual {v1}, Ly2/j1;->g0()I

    goto :goto_3

    :cond_7
    invoke-interface {v1, v11}, Ly2/q0;->O(I)I

    move-result v5

    invoke-interface {v1, v5}, Ly2/q0;->C(I)I

    :cond_8
    :goto_3
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-static {v2, v3, v7}, Ll0/g2;->c(JLl0/c1;)J

    move-result-wide v22

    new-instance v14, Lr1/c;

    const/16 v2, 0x10

    new-array v3, v2, [Ly2/s0;

    invoke-direct {v14, v3}, Lr1/c;-><init>([Ljava/lang/Object;)V

    invoke-static/range {v22 .. v23}, Ly3/a;->i(J)I

    move-result v3

    invoke-static/range {v22 .. v23}, Ly3/a;->k(J)I

    move-result v4

    invoke-static/range {v22 .. v23}, Ly3/a;->h(J)I

    move-result v5

    sget-object v7, La0/t;->a:La0/g0;

    new-instance v7, La0/g0;

    invoke-direct {v7}, La0/g0;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iget v9, v0, Ll0/q0;->c:F

    invoke-interface {v6, v9}, Ly3/c;->q0(F)F

    move-result v9

    float-to-double v9, v9

    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v9

    double-to-float v9, v9

    float-to-int v9, v9

    iget v10, v0, Ll0/q0;->e:F

    invoke-interface {v6, v10}, Ly3/c;->q0(F)F

    move-result v10

    float-to-double v11, v10

    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v10

    double-to-float v10, v10

    float-to-int v10, v10

    move-object/from16 v31, v13

    move-object/from16 p3, v14

    const/4 v11, 0x0

    invoke-static {v11, v3, v11, v5}, Ly3/b;->a(IIII)J

    move-result-wide v13

    const/16 v11, 0xe

    invoke-static {v11, v13, v14}, Ll0/g2;->d(IJ)J

    move-result-wide v11

    invoke-static {v11, v12}, Ll0/g2;->e(J)J

    move-result-wide v11

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-nez v19, :cond_9

    move-object/from16 v15, v16

    goto :goto_5

    :cond_9
    :try_start_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Ly2/q0;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-object/from16 v19, v16

    :goto_4
    move-object/from16 v15, v19

    :goto_5
    if-eqz v15, :cond_b

    invoke-static {v15}, Ll0/f;->g(Ly2/q0;)Ll0/o1;

    move-result-object v19

    invoke-static/range {v19 .. v19}, Ll0/f;->h(Ll0/o1;)F

    move-result v19

    cmpg-float v19, v19, p2

    if-nez v19, :cond_a

    invoke-static {v15}, Ll0/f;->g(Ly2/q0;)Ll0/o1;

    invoke-interface {v15, v11, v12}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ly2/j1;->j0()I

    move-result v2

    move-object/from16 v32, v1

    invoke-virtual/range {v19 .. v19}, Ly2/j1;->g0()I

    move-result v1

    invoke-static {v2, v1}, La0/q;->a(II)J

    move-result-wide v1

    :goto_6
    move/from16 v33, v4

    goto :goto_7

    :cond_a
    move-object/from16 v32, v1

    const v1, 0x7fffffff

    invoke-interface {v15, v1}, Ly2/q0;->O(I)I

    move-result v2

    invoke-interface {v15, v2}, Ly2/q0;->C(I)I

    move-result v1

    invoke-static {v2, v1}, La0/q;->a(II)J

    move-result-wide v1

    move-object/from16 v19, v16

    goto :goto_6

    :goto_7
    new-instance v4, La0/q;

    invoke-direct {v4, v1, v2}, La0/q;-><init>(J)V

    move-object/from16 v1, v19

    goto :goto_8

    :cond_b
    move-object/from16 v32, v1

    move/from16 v33, v4

    move-object/from16 v1, v16

    move-object v4, v1

    :goto_8
    move/from16 v29, v3

    const/16 v45, 0x20

    if-eqz v4, :cond_c

    iget-wide v2, v4, La0/q;->a:J

    shr-long v2, v2, v45

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_9

    :cond_c
    move-object/from16 v2, v16

    :goto_9
    const-wide v46, 0xffffffffL

    move-object v3, v1

    move-object/from16 v48, v2

    if-eqz v4, :cond_d

    iget-wide v1, v4, La0/q;->a:J

    and-long v1, v1, v46

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v49, v1

    :goto_a
    const/16 v2, 0x10

    goto :goto_b

    :cond_d
    move-object/from16 v49, v16

    goto :goto_a

    :goto_b
    new-array v1, v2, [I

    new-array v2, v2, [I

    move-wide/from16 v50, v13

    new-instance v13, La0/h0;

    invoke-direct {v13}, La0/h0;-><init>()V

    new-instance v34, Ll0/l0;

    iget v14, v0, Ll0/q0;->f:I

    move-object/from16 v52, v1

    iget-object v1, v0, Ll0/q0;->g:Ll0/o0;

    move-object/from16 v21, v1

    move/from16 v24, v9

    move/from16 v25, v10

    move/from16 v20, v14

    move-object/from16 v19, v34

    invoke-direct/range {v19 .. v25}, Ll0/l0;-><init>(ILl0/o0;JII)V

    move/from16 v1, v24

    move/from16 v9, v25

    invoke-interface/range {v32 .. v32}, Ljava/util/Iterator;->hasNext()Z

    move-result v35

    move/from16 v10, v29

    invoke-static {v10, v5}, La0/q;->a(II)J

    move-result-wide v37

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v36, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    move-object/from16 v39, v4

    invoke-virtual/range {v34 .. v44}, Ll0/l0;->b(ZIJLa0/q;IIIZZ)Ll0/k0;

    move-result-object v4

    iget-boolean v14, v4, Ll0/k0;->b:Z

    if-eqz v14, :cond_f

    if-eqz v39, :cond_e

    move/from16 v26, v18

    goto :goto_c

    :cond_e
    const/16 v26, 0x0

    :goto_c
    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v27, -0x1

    move-object/from16 v25, v4

    move/from16 v29, v10

    move-object/from16 v24, v34

    invoke-virtual/range {v24 .. v30}, Ll0/l0;->a(Ll0/k0;ZIIII)Ll0/g2;

    goto :goto_d

    :cond_f
    move-object/from16 v25, v4

    :goto_d
    move/from16 v24, v1

    move-object v4, v2

    move/from16 v28, v9

    move/from16 v27, v10

    move-object/from16 v29, v13

    move-object v9, v15

    move-object/from16 v0, v25

    move/from16 v1, v33

    move-object/from16 v20, v48

    move-object/from16 v14, v52

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v15, 0x0

    const/16 v19, 0x0

    const/16 v26, 0x0

    const/16 v37, 0x0

    const/16 v41, 0x0

    move v13, v5

    move/from16 v25, v13

    const/4 v5, 0x0

    :goto_e
    iget-boolean v0, v0, Ll0/k0;->b:Z

    if-nez v0, :cond_1b

    if-eqz v9, :cond_1b

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static/range {v49 .. v49}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move/from16 v20, v0

    invoke-virtual/range {v49 .. v49}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move/from16 v30, v6

    add-int v6, v19, v20

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v42

    sub-int v0, v27, v20

    add-int/lit8 v2, v5, 0x1

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7, v5, v3}, La0/g0;->h(ILjava/lang/Object;)V

    invoke-interface {v9}, Ly2/q0;->p()Ljava/lang/Object;

    sub-int v36, v2, v26

    invoke-interface/range {v32 .. v32}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_10

    move-object/from16 v9, v16

    goto :goto_10

    :cond_10
    :try_start_1
    invoke-interface/range {v32 .. v32}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly2/q0;
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_f

    :catch_1
    move-object/from16 v3, v16

    :goto_f
    move-object v9, v3

    :goto_10
    if-eqz v9, :cond_12

    invoke-static {v9}, Ll0/f;->g(Ly2/q0;)Ll0/o1;

    move-result-object v3

    invoke-static {v3}, Ll0/f;->h(Ll0/o1;)F

    move-result v3

    cmpg-float v3, v3, p2

    if-nez v3, :cond_11

    invoke-static {v9}, Ll0/f;->g(Ly2/q0;)Ll0/o1;

    invoke-interface {v9, v11, v12}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v3

    invoke-virtual {v3}, Ly2/j1;->j0()I

    move-result v5

    move/from16 v19, v2

    invoke-virtual {v3}, Ly2/j1;->g0()I

    move-result v2

    invoke-static {v5, v2}, La0/q;->a(II)J

    move-result-wide v38

    move-object/from16 v20, v3

    :goto_11
    move-wide/from16 v2, v38

    goto :goto_12

    :cond_11
    move/from16 v19, v2

    const v2, 0x7fffffff

    invoke-interface {v9, v2}, Ly2/q0;->O(I)I

    move-result v3

    invoke-interface {v9, v3}, Ly2/q0;->C(I)I

    move-result v5

    invoke-static {v3, v5}, La0/q;->a(II)J

    move-result-wide v38

    move-object/from16 v20, v16

    goto :goto_11

    :goto_12
    new-instance v5, La0/q;

    invoke-direct {v5, v2, v3}, La0/q;-><init>(J)V

    move-object/from16 v3, v20

    goto :goto_13

    :cond_12
    move/from16 v19, v2

    move-object/from16 v3, v16

    move-object v5, v3

    :goto_13
    move-object/from16 v20, v3

    if-eqz v5, :cond_13

    iget-wide v2, v5, La0/q;->a:J

    shr-long v2, v2, v45

    long-to-int v2, v2

    add-int v2, v2, v24

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_14

    :cond_13
    move-object/from16 v2, v16

    :goto_14
    move-object/from16 v27, v2

    if-eqz v5, :cond_14

    iget-wide v2, v5, La0/q;->a:J

    and-long v2, v2, v46

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v49, v2

    goto :goto_15

    :cond_14
    move-object/from16 v49, v16

    :goto_15
    invoke-interface/range {v32 .. v32}, Ljava/util/Iterator;->hasNext()Z

    move-result v35

    move/from16 v40, v37

    invoke-static {v0, v13}, La0/q;->a(II)J

    move-result-wide v37

    if-nez v5, :cond_15

    move/from16 v33, v0

    move-object/from16 v39, v16

    goto :goto_16

    :cond_15
    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual/range {v27 .. v27}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static/range {v49 .. v49}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual/range {v49 .. v49}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v2, v3}, La0/q;->a(II)J

    move-result-wide v2

    move/from16 v33, v0

    new-instance v0, La0/q;

    invoke-direct {v0, v2, v3}, La0/q;-><init>(J)V

    move-object/from16 v39, v0

    :goto_16
    const/16 v43, 0x0

    const/16 v44, 0x0

    invoke-virtual/range {v34 .. v44}, Ll0/l0;->b(ZIJLa0/q;IIIZZ)Ll0/k0;

    move-result-object v0

    iget-boolean v2, v0, Ll0/k0;->a:Z

    if-eqz v2, :cond_1a

    invoke-static {v1, v6}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v1, v10}, Ljava/lang/Math;->min(II)I

    move-result v1

    add-int v38, v41, v42

    move/from16 v37, v40

    move/from16 v40, v36

    if-eqz v5, :cond_16

    move/from16 v36, v18

    :goto_17
    move-object/from16 v35, v0

    move/from16 v39, v33

    goto :goto_18

    :cond_16
    const/16 v36, 0x0

    goto :goto_17

    :goto_18
    invoke-virtual/range {v34 .. v40}, Ll0/l0;->a(Ll0/k0;ZIIII)Ll0/g2;

    move/from16 v40, v37

    add-int/lit8 v6, v30, 0x1

    array-length v0, v4

    const-string v2, "copyOf(...)"

    if-ge v0, v6, :cond_17

    array-length v0, v4

    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x2

    invoke-static {v6, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v4, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_17
    aput v42, v4, v30

    add-int/lit8 v6, v30, 0x1

    sub-int v5, v25, v38

    sub-int v13, v5, v28

    add-int/lit8 v0, v15, 0x1

    array-length v3, v14

    if-ge v3, v0, :cond_18

    array-length v3, v14

    mul-int/lit8 v3, v3, 0x3

    div-int/lit8 v3, v3, 0x2

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v14, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v14

    invoke-static {v14, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_18
    aput v19, v14, v15

    add-int/lit8 v15, v15, 0x1

    if-eqz v27, :cond_19

    invoke-virtual/range {v27 .. v27}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sub-int v0, v0, v24

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_19

    :cond_19
    move-object/from16 v0, v16

    :goto_19
    add-int/lit8 v37, v40, 0x1

    add-int v38, v38, v28

    move-object/from16 v27, v0

    move/from16 v33, v10

    move/from16 v26, v19

    move/from16 v41, v38

    const/4 v0, 0x0

    const/4 v2, 0x0

    goto :goto_1a

    :cond_1a
    move-object/from16 v35, v0

    move v0, v6

    move/from16 v6, v30

    move/from16 v37, v40

    move/from16 v2, v42

    :goto_1a
    move/from16 v5, v19

    move-object/from16 v3, v20

    move-object/from16 v20, v27

    move/from16 v27, v33

    move/from16 v19, v0

    move-object/from16 v0, v35

    goto/16 :goto_e

    :cond_1b
    move/from16 v30, v6

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    move-object v2, v8

    new-array v8, v0, [Ly2/j1;

    const/4 v11, 0x0

    :goto_1b
    if-ge v11, v0, :cond_1c

    invoke-virtual {v7, v11}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v8, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_1b

    :cond_1c
    new-array v11, v15, [I

    new-array v13, v15, [I

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/16 v17, 0x0

    :goto_1c
    if-ge v12, v15, :cond_20

    aget v10, v14, v12

    if-ltz v12, :cond_1f

    move/from16 v6, v30

    if-ge v12, v6, :cond_1f

    aget v0, v4, v12

    move-object/from16 v3, v29

    invoke-virtual {v3, v12}, La0/h0;->b(I)Z

    move-result v5

    if-eqz v5, :cond_1d

    move-object v7, v2

    const v5, 0x7fffffff

    goto :goto_1d

    :cond_1d
    invoke-static/range {v50 .. v51}, Ly3/a;->h(J)I

    move-result v0

    const v5, 0x7fffffff

    if-ne v0, v5, :cond_1e

    move-object v7, v2

    move v0, v5

    goto :goto_1d

    :cond_1e
    invoke-static/range {v50 .. v51}, Ly3/a;->h(J)I

    move-result v0

    sub-int v0, v0, v17

    move-object v7, v2

    :goto_1d
    invoke-static/range {v50 .. v51}, Ly3/a;->j(J)I

    move-result v2

    move-object/from16 v29, v3

    invoke-static/range {v50 .. v51}, Ly3/a;->i(J)I

    move-result v3

    move-object/from16 v19, v4

    move/from16 v20, v5

    move/from16 v30, v6

    move/from16 v5, v24

    move-object/from16 v6, p1

    move v4, v0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v12}, Ll0/f;->j(Ll0/n1;IIIIILy2/t0;Ljava/util/List;[Ly2/j1;II[II)Ly2/s0;

    move-result-object v2

    invoke-interface {v2}, Ly2/s0;->getWidth()I

    move-result v3

    invoke-interface {v2}, Ly2/s0;->getHeight()I

    move-result v4

    aput v4, v13, v12

    add-int v17, v17, v4

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    move-object/from16 v3, p3

    invoke-virtual {v3, v2}, Lr1/c;->b(Ljava/lang/Object;)V

    add-int/lit8 v12, v12, 0x1

    move-object v2, v7

    move v9, v10

    move-object/from16 v4, v19

    goto :goto_1c

    :cond_1f
    move-object/from16 v0, p0

    const-string v1, "Index must be between 0 and size"

    invoke-static {v1}, Lug/m;->Q(Ljava/lang/String;)V

    throw v16

    :cond_20
    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move-object/from16 v3, p3

    iget v2, v3, Lr1/c;->y:I

    if-nez v2, :cond_21

    const/4 v14, 0x0

    const/16 v17, 0x0

    goto :goto_1e

    :cond_21
    move v14, v1

    :goto_1e
    iget-object v1, v0, Ll0/q0;->b:Ll0/l;

    invoke-interface {v1}, Ll0/l;->a()F

    move-result v2

    invoke-interface {v6, v2}, Ly3/c;->F(F)I

    move-result v2

    iget v4, v3, Lr1/c;->y:I

    add-int/lit8 v4, v4, -0x1

    mul-int/2addr v4, v2

    add-int v4, v4, v17

    invoke-static/range {v22 .. v23}, Ly3/a;->j(J)I

    move-result v2

    invoke-static/range {v22 .. v23}, Ly3/a;->h(J)I

    move-result v5

    if-ge v4, v2, :cond_22

    move v4, v2

    :cond_22
    if-le v4, v5, :cond_23

    goto :goto_1f

    :cond_23
    move v5, v4

    :goto_1f
    invoke-interface {v1, v6, v5, v13, v11}, Ll0/l;->b(Ly3/c;I[I[I)V

    invoke-static/range {v22 .. v23}, Ly3/a;->k(J)I

    move-result v1

    invoke-static/range {v22 .. v23}, Ly3/a;->i(J)I

    move-result v2

    if-ge v14, v1, :cond_24

    move v14, v1

    :cond_24
    if-le v14, v2, :cond_25

    goto :goto_20

    :cond_25
    move v2, v14

    :goto_20
    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/typing/a;

    const/16 v4, 0x15

    invoke-direct {v1, v3, v4}, Lio/getstream/chat/android/ui/viewmodel/typing/a;-><init>(Ljava/lang/Object;I)V

    move-object/from16 v3, v31

    invoke-interface {v6, v2, v5, v3, v1}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v1

    return-object v1

    :goto_21
    new-instance v1, Ldc1/c;

    invoke-direct {v1, v5}, Ldc1/c;-><init>(I)V

    const/4 v11, 0x0

    invoke-interface {v6, v11, v11, v3, v1}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v1

    return-object v1
.end method

.method public final b(Ly2/r;Ljava/util/List;I)I
    .locals 6

    const/4 v0, 0x1

    invoke-static {v0, p2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/q0;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const/4 v2, 0x2

    invoke-static {v2, p2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_1

    invoke-static {v2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly2/q0;

    :cond_1
    const/4 v2, 0x0

    const/16 v3, 0xd

    invoke-static {p3, v2, v3}, Ly3/b;->b(III)J

    move-result-wide v2

    iget-object v4, p0, Ll0/q0;->g:Ll0/o0;

    invoke-virtual {v4, v0, v1, v2, v3}, Ll0/o0;->a(Ly2/q0;Ly2/q0;J)V

    invoke-static {p2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_2

    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_2
    move-object v0, p2

    iget p2, p0, Ll0/q0;->c:F

    invoke-interface {p1, p2}, Ly3/c;->F(F)I

    move-result v2

    iget p2, p0, Ll0/q0;->e:F

    invoke-interface {p1, p2}, Ly3/c;->F(F)I

    move-result v3

    iget v4, p0, Ll0/q0;->f:I

    iget-object v5, p0, Ll0/q0;->g:Ll0/o0;

    move v1, p3

    invoke-static/range {v0 .. v5}, Ll0/q0;->k(Ljava/util/List;IIIILl0/o0;)I

    move-result p1

    return p1
.end method

.method public final c(Ly2/r;Ljava/util/List;I)I
    .locals 10

    const/4 v0, 0x1

    invoke-static {v0, p2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/q0;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const/4 v2, 0x2

    invoke-static {v2, p2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_1

    invoke-static {v2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly2/q0;

    :cond_1
    const/4 v2, 0x7

    const/4 v3, 0x0

    invoke-static {v3, p3, v2}, Ly3/b;->b(III)J

    move-result-wide v4

    iget-object v2, p0, Ll0/q0;->g:Ll0/o0;

    invoke-virtual {v2, v0, v1, v4, v5}, Ll0/o0;->a(Ly2/q0;Ly2/q0;J)V

    invoke-static {p2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_2

    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_2
    iget v0, p0, Ll0/q0;->c:F

    invoke-interface {p1, v0}, Ly3/c;->F(F)I

    move-result p1

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    move v1, v3

    move v2, v1

    move v4, v2

    move v5, v4

    :goto_1
    if-ge v1, v0, :cond_5

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly2/q0;

    invoke-interface {v6, p3}, Ly2/q0;->Q(I)I

    move-result v6

    add-int/2addr v6, p1

    add-int/lit8 v7, v1, 0x1

    sub-int v8, v7, v4

    iget v9, p0, Ll0/q0;->f:I

    if-eq v8, v9, :cond_4

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v8

    if-ne v7, v8, :cond_3

    goto :goto_2

    :cond_3
    add-int/2addr v5, v6

    goto :goto_3

    :cond_4
    :goto_2
    add-int/2addr v5, v6

    sub-int/2addr v5, p1

    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    move-result v2

    move v4, v1

    move v5, v3

    :goto_3
    move v1, v7

    goto :goto_1

    :cond_5
    return v2
.end method

.method public final d(Ly2/r;Ljava/util/List;I)I
    .locals 6

    const/4 v0, 0x1

    invoke-static {v0, p2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/q0;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const/4 v2, 0x2

    invoke-static {v2, p2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_1

    invoke-static {v2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly2/q0;

    :cond_1
    const/4 v2, 0x0

    const/16 v3, 0xd

    invoke-static {p3, v2, v3}, Ly3/b;->b(III)J

    move-result-wide v2

    iget-object v4, p0, Ll0/q0;->g:Ll0/o0;

    invoke-virtual {v4, v0, v1, v2, v3}, Ll0/o0;->a(Ly2/q0;Ly2/q0;J)V

    invoke-static {p2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_2

    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_2
    move-object v0, p2

    iget p2, p0, Ll0/q0;->c:F

    invoke-interface {p1, p2}, Ly3/c;->F(F)I

    move-result v2

    iget p2, p0, Ll0/q0;->e:F

    invoke-interface {p1, p2}, Ly3/c;->F(F)I

    move-result v3

    iget v4, p0, Ll0/q0;->f:I

    iget-object v5, p0, Ll0/q0;->g:Ll0/o0;

    move v1, p3

    invoke-static/range {v0 .. v5}, Ll0/q0;->k(Ljava/util/List;IIIILl0/o0;)I

    move-result p1

    return p1
.end method

.method public final e(Ly2/r;Ljava/util/List;I)I
    .locals 38

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    const/4 v4, 0x1

    invoke-static {v4, v2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    if-eqz v5, :cond_0

    invoke-static {v5}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly2/q0;

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    const/4 v7, 0x2

    invoke-static {v7, v2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    if-eqz v8, :cond_1

    invoke-static {v8}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly2/q0;

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    :goto_1
    const/4 v9, 0x7

    const/4 v10, 0x0

    invoke-static {v10, v3, v9}, Ly3/b;->b(III)J

    move-result-wide v11

    iget-object v9, v0, Ll0/q0;->g:Ll0/o0;

    invoke-virtual {v9, v5, v8, v11, v12}, Ll0/o0;->a(Ly2/q0;Ly2/q0;J)V

    invoke-static {v2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_2

    sget-object v2, Lm83/y;->w:Lm83/y;

    :cond_2
    iget v5, v0, Ll0/q0;->c:F

    invoke-interface {v1, v5}, Ly3/c;->F(F)I

    move-result v16

    iget v5, v0, Ll0/q0;->e:F

    invoke-interface {v1, v5}, Ly3/c;->F(F)I

    move-result v17

    invoke-static {v10, v10}, La0/q;->a(II)J

    move-result-wide v8

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    return v10

    :cond_3
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    new-array v5, v1, [I

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v11

    new-array v12, v11, [I

    move-object/from16 v18, v2

    check-cast v18, Ljava/util/Collection;

    invoke-interface/range {v18 .. v18}, Ljava/util/Collection;->size()I

    move-result v13

    move v14, v10

    :goto_2
    if-ge v14, v13, :cond_4

    invoke-interface {v2, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ly2/q0;

    invoke-interface {v15, v3}, Ly2/q0;->O(I)I

    move-result v6

    aput v6, v5, v14

    invoke-interface {v15, v6}, Ly2/q0;->C(I)I

    move-result v6

    aput v6, v12, v14

    add-int/lit8 v14, v14, 0x1

    goto :goto_2

    :cond_4
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    iget-object v13, v0, Ll0/q0;->g:Ll0/o0;

    const v14, 0x7fffffff

    if-ge v14, v6, :cond_5

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Ll0/n0;->w:Ll0/n0;

    :cond_5
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    if-lt v14, v6, :cond_6

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Ll0/n0;->w:Ll0/n0;

    :cond_6
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    invoke-static {v14, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    move v15, v10

    move/from16 v19, v15

    :goto_3
    if-ge v15, v1, :cond_7

    aget v20, v5, v15

    add-int v19, v19, v20

    add-int/lit8 v15, v15, 0x1

    goto :goto_3

    :cond_7
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v15

    sub-int/2addr v15, v4

    mul-int v15, v15, v16

    add-int v15, v15, v19

    if-eqz v11, :cond_22

    aget v19, v12, v10

    sub-int/2addr v11, v4

    move/from16 v20, v7

    move/from16 v21, v10

    if-gt v4, v11, :cond_a

    move/from16 v7, v19

    move v10, v4

    :goto_4
    aget v14, v12, v10

    if-ge v7, v14, :cond_8

    move v7, v14

    :cond_8
    if-eq v10, v11, :cond_9

    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_9
    move/from16 v19, v7

    :cond_a
    if-eqz v1, :cond_21

    aget v7, v5, v21

    sub-int/2addr v1, v4

    if-gt v4, v1, :cond_c

    move v10, v4

    :goto_5
    aget v11, v5, v10

    if-ge v7, v11, :cond_b

    move v7, v11

    :cond_b
    if-eq v10, v1, :cond_c

    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    :cond_c
    move v1, v15

    move/from16 v10, v19

    :goto_6
    if-gt v7, v1, :cond_20

    if-ne v10, v3, :cond_d

    goto/16 :goto_16

    :cond_d
    add-int v10, v7, v1

    div-int/lit8 v10, v10, 0x2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_e

    move-object/from16 v35, v2

    move-object v11, v5

    move-wide v2, v8

    move-object/from16 v21, v12

    goto/16 :goto_14

    :cond_e
    move/from16 v11, v21

    const v14, 0x7fffffff

    invoke-static {v11, v10, v11, v14}, Ly3/b;->a(IIII)J

    move-result-wide v21

    new-instance v23, Ll0/l0;

    move-object v15, v12

    iget v12, v0, Ll0/q0;->f:I

    move v4, v11

    move v0, v14

    move-object/from16 v11, v23

    move-wide/from16 v36, v21

    move-object/from16 v21, v15

    move-wide/from16 v14, v36

    invoke-direct/range {v11 .. v17}, Ll0/l0;-><init>(ILl0/o0;JII)V

    invoke-static {v4, v2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ly2/q0;

    if-eqz v11, :cond_f

    aget v12, v21, v4

    goto :goto_7

    :cond_f
    move v12, v4

    :goto_7
    if-eqz v11, :cond_10

    aget v14, v5, v4

    goto :goto_8

    :cond_10
    move v14, v4

    :goto_8
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v15

    const/4 v4, 0x1

    if-le v15, v4, :cond_11

    move/from16 v24, v4

    goto :goto_9

    :cond_11
    const/16 v24, 0x0

    :goto_9
    invoke-static {v10, v0}, La0/q;->a(II)J

    move-result-wide v26

    if-nez v11, :cond_12

    move-object v11, v5

    const/16 v28, 0x0

    goto :goto_a

    :cond_12
    move-object v11, v5

    invoke-static {v14, v12}, La0/q;->a(II)J

    move-result-wide v4

    new-instance v15, La0/q;

    invoke-direct {v15, v4, v5}, La0/q;-><init>(J)V

    move-object/from16 v28, v15

    :goto_a
    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v25, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-virtual/range {v23 .. v33}, Ll0/l0;->b(ZIJLa0/q;IIIZZ)Ll0/k0;

    move-result-object v4

    iget-boolean v4, v4, Ll0/k0;->b:Z

    if-eqz v4, :cond_13

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Ll0/n0;->w:Ll0/n0;

    move-object/from16 v35, v2

    move-wide v2, v8

    goto/16 :goto_14

    :cond_13
    invoke-interface/range {v18 .. v18}, Ljava/util/Collection;->size()I

    move-result v4

    move/from16 v25, v10

    move v15, v12

    move/from16 v24, v14

    move/from16 v0, v31

    const/4 v5, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    :goto_b
    if-ge v5, v4, :cond_1b

    sub-int v14, v25, v24

    move/from16 p2, v4

    add-int/lit8 v4, v5, 0x1

    invoke-static {v0, v15}, Ljava/lang/Math;->max(II)I

    move-result v31

    invoke-static {v4, v2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/q0;

    if-eqz v0, :cond_14

    aget v15, v21, v4

    goto :goto_c

    :cond_14
    const/4 v15, 0x0

    :goto_c
    if-eqz v0, :cond_15

    aget v24, v11, v4

    add-int v24, v24, v16

    move-object/from16 v34, v0

    move/from16 v0, v24

    goto :goto_d

    :cond_15
    move-object/from16 v34, v0

    const/4 v0, 0x0

    :goto_d
    add-int/lit8 v5, v5, 0x2

    move-object/from16 v35, v2

    invoke-interface/range {v35 .. v35}, Ljava/util/List;->size()I

    move-result v2

    if-ge v5, v2, :cond_16

    const/16 v24, 0x1

    goto :goto_e

    :cond_16
    const/16 v24, 0x0

    :goto_e
    sub-int v25, v4, v12

    const v2, 0x7fffffff

    invoke-static {v14, v2}, La0/q;->a(II)J

    move-result-wide v26

    if-nez v34, :cond_17

    const/16 v28, 0x0

    goto :goto_f

    :cond_17
    invoke-static {v0, v15}, La0/q;->a(II)J

    move-result-wide v2

    new-instance v5, La0/q;

    invoke-direct {v5, v2, v3}, La0/q;-><init>(J)V

    move-object/from16 v28, v5

    :goto_f
    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-virtual/range {v23 .. v33}, Ll0/l0;->b(ZIJLa0/q;IIIZZ)Ll0/k0;

    move-result-object v2

    iget-boolean v3, v2, Ll0/k0;->a:Z

    if-eqz v3, :cond_1a

    add-int v31, v31, v17

    add-int v27, v31, v30

    move/from16 v26, v29

    move/from16 v29, v25

    if-eqz v34, :cond_18

    const/16 v25, 0x1

    :goto_10
    move-object/from16 v24, v2

    move/from16 v28, v14

    goto :goto_11

    :cond_18
    const/16 v25, 0x0

    goto :goto_10

    :goto_11
    invoke-virtual/range {v23 .. v29}, Ll0/l0;->a(Ll0/k0;ZIIII)Ll0/g2;

    move-object/from16 v2, v24

    move/from16 v29, v26

    sub-int v0, v0, v16

    add-int/lit8 v29, v29, 0x1

    iget-boolean v2, v2, Ll0/k0;->b:Z

    if-eqz v2, :cond_19

    move v14, v4

    move/from16 v30, v27

    goto :goto_13

    :cond_19
    move/from16 v24, v0

    move v12, v4

    move/from16 v25, v10

    move/from16 v30, v27

    const/4 v0, 0x0

    goto :goto_12

    :cond_1a
    move/from16 v28, v14

    move/from16 v24, v0

    move/from16 v25, v28

    move/from16 v0, v31

    :goto_12
    move/from16 v3, p3

    move v5, v4

    move v14, v5

    move-object/from16 v2, v35

    move/from16 v4, p2

    goto/16 :goto_b

    :cond_1b
    move-object/from16 v35, v2

    :goto_13
    sub-int v0, v30, v17

    invoke-static {v0, v14}, La0/q;->a(II)J

    move-result-wide v2

    :goto_14
    const/16 v0, 0x20

    shr-long v4, v2, v0

    long-to-int v0, v4

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    long-to-int v2, v2

    move/from16 v3, p3

    if-gt v0, v3, :cond_1f

    if-ge v2, v6, :cond_1c

    goto :goto_15

    :cond_1c
    if-ge v0, v3, :cond_1e

    add-int/lit8 v1, v10, -0x1

    :cond_1d
    move v15, v10

    move-object v5, v11

    move-object/from16 v12, v21

    move-object/from16 v2, v35

    const/4 v4, 0x1

    const/16 v21, 0x0

    move v10, v0

    move-object/from16 v0, p0

    goto/16 :goto_6

    :cond_1e
    return v10

    :cond_1f
    :goto_15
    add-int/lit8 v7, v10, 0x1

    if-le v7, v1, :cond_1d

    return v7

    :cond_20
    :goto_16
    return v15

    :cond_21
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_22
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Ll0/q0;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Ll0/q0;

    iget-object v0, p0, Ll0/q0;->a:Ll0/i;

    iget-object v1, p1, Ll0/q0;->a:Ll0/i;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Ll0/q0;->b:Ll0/l;

    iget-object v1, p1, Ll0/q0;->b:Ll0/l;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget v0, p0, Ll0/q0;->c:F

    iget v1, p1, Ll0/q0;->c:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Ll0/q0;->d:Ll0/d0;

    iget-object v1, p1, Ll0/q0;->d:Ll0/d0;

    invoke-virtual {v0, v1}, Ll0/d0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    iget v0, p0, Ll0/q0;->e:F

    iget v1, p1, Ll0/q0;->e:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    iget v0, p0, Ll0/q0;->f:I

    iget v1, p1, Ll0/q0;->f:I

    if-eq v0, v1, :cond_7

    goto :goto_0

    :cond_7
    iget-object v0, p0, Ll0/q0;->g:Ll0/o0;

    iget-object p1, p1, Ll0/q0;->g:Ll0/o0;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_8
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final f(Ly2/j1;)I
    .locals 0

    invoke-virtual {p1}, Ly2/j1;->g0()I

    move-result p1

    return p1
.end method

.method public final g(IIIZ)J
    .locals 1

    sget-object v0, Ll0/p1;->a:Ll0/r1;

    const/4 v0, 0x0

    if-nez p4, :cond_0

    invoke-static {p1, p2, v0, p3}, Ly3/b;->a(IIII)J

    move-result-wide p1

    return-wide p1

    :cond_0
    invoke-static {p1, p2, v0, p3}, Lva3/l;->n(IIII)J

    move-result-wide p1

    return-wide p1
.end method

.method public final h(Ly2/j1;)I
    .locals 0

    invoke-virtual {p1}, Ly2/j1;->j0()I

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Ll0/q0;->a:Ll0/i;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Ll0/q0;->b:Ll0/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Ll0/q0;->c:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Ll0/q0;->d:Ll0/d0;

    invoke-virtual {v2}, Ll0/d0;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Ll0/q0;->e:F

    invoke-static {v0, v2, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Ll0/q0;->f:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    const v2, 0x7fffffff

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Ll0/q0;->g:Ll0/o0;

    invoke-virtual {v1}, Ll0/o0;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final i([Ly2/j1;Ly2/t0;I[III[IIII)Ly2/s0;
    .locals 11

    sget-object v8, Ly3/m;->w:Ly3/m;

    new-instance v0, Ll0/p0;

    move-object v6, p0

    move-object v5, p1

    move v9, p3

    move-object v10, p4

    move/from16 v7, p6

    move-object/from16 v1, p7

    move/from16 v2, p8

    move/from16 v3, p9

    move/from16 v4, p10

    invoke-direct/range {v0 .. v10}, Ll0/p0;-><init>([IIII[Ly2/j1;Ll0/q0;ILy3/m;I[I)V

    sget-object p1, Lm83/z;->w:Lm83/z;

    move/from16 p3, p5

    invoke-interface {p2, p3, v7, p1, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method

.method public final j(I[I[ILy2/t0;)V
    .locals 6

    iget-object v0, p0, Ll0/q0;->a:Ll0/i;

    invoke-interface {p4}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v4

    move v2, p1

    move-object v3, p2

    move-object v5, p3

    move-object v1, p4

    invoke-interface/range {v0 .. v5}, Ll0/i;->c(Ly3/c;I[ILy3/m;[I)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll0/q0;->a:Ll0/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", verticalArrangement="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll0/q0;->b:Ll0/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mainAxisSpacing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll0/q0;->c:F

    const-string v2, ", crossAxisAlignment="

    invoke-static {v1, v2, v0}, Lev/n;->s(FLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v1, p0, Ll0/q0;->d:Ll0/d0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", crossAxisArrangementSpacing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll0/q0;->e:F

    const-string v2, ", maxItemsInMainAxis="

    invoke-static {v1, v2, v0}, Lev/n;->s(FLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget v1, p0, Ll0/q0;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", maxLines=2147483647, overflow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll0/q0;->g:Ll0/o0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

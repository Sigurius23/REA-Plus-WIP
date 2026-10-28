.class public abstract Lh0/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/high16 v0, 0x3fc0000000000000L    # 0.125

    double-to-float v0, v0

    const/16 v1, 0x12

    int-to-float v1, v1

    div-float/2addr v0, v1

    sput v0, Lh0/z0;->a:F

    return-void
.end method

.method public static final a(Lu2/b;Lu2/r;Lu2/l;Ls83/a;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    instance-of v2, v1, Lh0/m0;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lh0/m0;

    iget v3, v2, Lh0/m0;->H:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lh0/m0;->H:I

    goto :goto_0

    :cond_0
    new-instance v2, Lh0/m0;

    invoke-direct {v2, v1}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lh0/m0;->G:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lh0/m0;->H:I

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_2

    if-ne v4, v6, :cond_1

    iget v0, v2, Lh0/m0;->F:F

    iget v4, v2, Lh0/m0;->E:I

    iget-object v8, v2, Lh0/m0;->z:Lan/d;

    iget-object v9, v2, Lh0/m0;->y:Lkotlin/jvm/internal/f0;

    iget-object v10, v2, Lh0/m0;->x:Lu2/l;

    iget-object v11, v2, Lh0/m0;->w:Lu2/b;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v16, v2

    move v2, v0

    move-object v0, v10

    move-object v10, v9

    move-object v9, v8

    move v8, v4

    :goto_1
    move-object/from16 v4, v16

    goto :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static/range {p0 .. p0}, Lh0/q3;->a(Lu2/b;)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :cond_3
    new-instance v1, Lkotlin/jvm/internal/f0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-wide v8, v0, Lu2/r;->a:J

    iput-wide v8, v1, Lkotlin/jvm/internal/f0;->w:J

    move-object/from16 v4, p0

    check-cast v4, Lu2/g0;

    invoke-virtual {v4}, Lu2/g0;->f()Lb3/j3;

    move-result-object v8

    iget v0, v0, Lu2/r;->i:I

    invoke-static {v8, v0}, Lh0/z0;->m(Lb3/j3;I)F

    move-result v0

    new-instance v8, Lan/d;

    const-wide/16 v9, 0x0

    const/16 v11, 0x8

    invoke-direct {v8, v7, v9, v10, v11}, Lan/d;-><init>(Ljava/lang/Object;JI)V

    move-object v10, v1

    move-object v9, v8

    const/4 v8, 0x0

    move v1, v0

    move-object/from16 v0, p2

    :goto_2
    iput-object v4, v2, Lh0/m0;->w:Lu2/b;

    iput-object v0, v2, Lh0/m0;->x:Lu2/l;

    iput-object v10, v2, Lh0/m0;->y:Lkotlin/jvm/internal/f0;

    iput-object v9, v2, Lh0/m0;->z:Lan/d;

    iput v8, v2, Lh0/m0;->E:I

    iput v1, v2, Lh0/m0;->F:F

    iput v6, v2, Lh0/m0;->H:I

    move-object v11, v4

    check-cast v11, Lu2/g0;

    invoke-virtual {v11, v0, v2}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_4

    return-object v3

    :cond_4
    move-object/from16 v16, v2

    move v2, v1

    move-object v1, v4

    goto :goto_1

    :goto_3
    check-cast v1, Lu2/k;

    iget-object v1, v1, Lu2/k;->a:Ljava/lang/Object;

    move-object v12, v1

    check-cast v12, Ljava/util/Collection;

    invoke-interface {v12}, Ljava/util/Collection;->size()I

    move-result v12

    const/4 v13, 0x0

    :goto_4
    if-ge v13, v12, :cond_6

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, Lu2/r;

    iget-wide v5, v15, Lu2/r;->a:J

    move/from16 p0, v8

    iget-wide v7, v10, Lkotlin/jvm/internal/f0;->w:J

    invoke-static {v5, v6, v7, v8}, Lu2/q;->a(JJ)Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_5

    :cond_5
    add-int/lit8 v13, v13, 0x1

    move/from16 v8, p0

    const/4 v6, 0x1

    const/4 v7, 0x0

    goto :goto_4

    :cond_6
    move/from16 p0, v8

    const/4 v14, 0x0

    :goto_5
    check-cast v14, Lu2/r;

    if-eqz v14, :cond_8

    invoke-static {v14}, Lu2/d0;->e(Lu2/r;)Z

    move-result v5

    if-eqz v5, :cond_7

    goto :goto_6

    :cond_7
    invoke-virtual {v9, v14, v2}, Lan/d;->E(Lu2/r;F)J

    move-result-wide v5

    const-wide v7, 0x7fffffff7fffffffL

    and-long/2addr v5, v7

    const-wide v7, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v5, v5, v7

    if-eqz v5, :cond_d

    const/4 v8, 0x1

    goto :goto_a

    :cond_8
    :goto_6
    move-object v5, v1

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_7
    if-ge v6, v5, :cond_a

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lu2/r;

    iget-boolean v8, v8, Lu2/r;->d:Z

    if-eqz v8, :cond_9

    goto :goto_8

    :cond_9
    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    :cond_a
    const/4 v7, 0x0

    :goto_8
    check-cast v7, Lu2/r;

    if-nez v7, :cond_c

    if-eqz p0, :cond_b

    const/4 v5, 0x1

    goto :goto_9

    :cond_b
    const/4 v5, 0x0

    :goto_9
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_c
    iget-wide v5, v7, Lu2/r;->a:J

    iput-wide v5, v10, Lkotlin/jvm/internal/f0;->w:J

    :cond_d
    move/from16 v8, p0

    :goto_a
    move-object v5, v1

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_b
    if-ge v6, v5, :cond_f

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lu2/r;

    iget-boolean v7, v7, Lu2/r;->d:Z

    if-eqz v7, :cond_e

    move v1, v2

    move-object v2, v4

    move-object v4, v11

    const/4 v6, 0x1

    const/4 v7, 0x0

    goto/16 :goto_2

    :cond_e
    add-int/lit8 v6, v6, 0x1

    goto :goto_b

    :cond_f
    if-eqz v8, :cond_10

    const/4 v5, 0x1

    goto :goto_c

    :cond_10
    const/4 v5, 0x0

    :goto_c
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public static final b(Lu2/b;JLs83/c;)Ljava/lang/Object;
    .locals 17

    move-wide/from16 v0, p1

    move-object/from16 v2, p3

    instance-of v3, v2, Lh0/n0;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lh0/n0;

    iget v4, v3, Lh0/n0;->z:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lh0/n0;->z:I

    goto :goto_0

    :cond_0
    new-instance v3, Lh0/n0;

    invoke-direct {v3, v2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lh0/n0;->y:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lh0/n0;->z:I

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v0, v3, Lh0/n0;->x:Lkotlin/jvm/internal/f0;

    iget-object v1, v3, Lh0/n0;->w:Lu2/b;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v16, v1

    move-object v1, v0

    move-object/from16 v0, v16

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p0

    check-cast v2, Lu2/g0;

    iget-object v2, v2, Lu2/g0;->F:Lu2/h0;

    iget-object v2, v2, Lu2/h0;->T:Lu2/k;

    invoke-static {v2, v0, v1}, Lh0/z0;->l(Lu2/k;J)Z

    move-result v2

    if-eqz v2, :cond_3

    goto/16 :goto_8

    :cond_3
    new-instance v2, Lkotlin/jvm/internal/f0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-wide v0, v2, Lkotlin/jvm/internal/f0;->w:J

    move-object/from16 v0, p0

    :goto_1
    iput-object v0, v3, Lh0/n0;->w:Lu2/b;

    iput-object v2, v3, Lh0/n0;->x:Lkotlin/jvm/internal/f0;

    iput v6, v3, Lh0/n0;->z:I

    invoke-static {v0, v3}, Lu2/b;->H(Lu2/b;Ls83/a;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_4

    return-object v4

    :cond_4
    move-object/from16 v16, v2

    move-object v2, v1

    move-object/from16 v1, v16

    :goto_2
    check-cast v2, Lu2/k;

    iget-object v5, v2, Lu2/k;->a:Ljava/lang/Object;

    move-object v8, v5

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v8

    const/4 v9, 0x0

    move v10, v9

    :goto_3
    if-ge v10, v8, :cond_6

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Lu2/r;

    iget-wide v12, v12, Lu2/r;->a:J

    iget-wide v14, v1, Lkotlin/jvm/internal/f0;->w:J

    invoke-static {v12, v13, v14, v15}, Lu2/q;->a(JJ)Z

    move-result v12

    if-eqz v12, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_6
    move-object v11, v7

    :goto_4
    check-cast v11, Lu2/r;

    if-nez v11, :cond_7

    move-object v11, v7

    goto :goto_7

    :cond_7
    invoke-static {v11}, Lu2/d0;->e(Lu2/r;)Z

    move-result v5

    if-eqz v5, :cond_b

    iget-object v2, v2, Lu2/k;->a:Ljava/lang/Object;

    move-object v5, v2

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    :goto_5
    if-ge v9, v5, :cond_9

    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Lu2/r;

    iget-boolean v10, v10, Lu2/r;->d:Z

    if-eqz v10, :cond_8

    goto :goto_6

    :cond_8
    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_9
    move-object v8, v7

    :goto_6
    check-cast v8, Lu2/r;

    if-nez v8, :cond_a

    goto :goto_7

    :cond_a
    iget-wide v8, v8, Lu2/r;->a:J

    iput-wide v8, v1, Lkotlin/jvm/internal/f0;->w:J

    goto :goto_9

    :cond_b
    invoke-static {v11}, Lu2/d0;->m(Lu2/r;)Z

    move-result v2

    if-eqz v2, :cond_d

    :goto_7
    if-eqz v11, :cond_c

    invoke-virtual {v11}, Lu2/r;->l()Z

    move-result v0

    if-nez v0, :cond_c

    return-object v11

    :cond_c
    :goto_8
    return-object v7

    :cond_d
    :goto_9
    move-object v2, v1

    goto :goto_1
.end method

.method public static final c(Lu2/b;JILh0/u0;Ls83/a;)Ljava/lang/Object;
    .locals 19

    move-wide/from16 v0, p1

    move-object/from16 v2, p5

    instance-of v3, v2, Lh0/o0;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lh0/o0;

    iget v4, v3, Lh0/o0;->H:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lh0/o0;->H:I

    goto :goto_0

    :cond_0
    new-instance v3, Lh0/o0;

    invoke-direct {v3, v2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lh0/o0;->G:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lh0/o0;->H:I

    const-wide/16 v6, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v5, :cond_3

    if-eq v5, v9, :cond_2

    if-ne v5, v8, :cond_1

    iget v0, v3, Lh0/o0;->F:F

    iget-object v1, v3, Lh0/o0;->E:Lu2/r;

    iget-object v5, v3, Lh0/o0;->z:Lan/d;

    iget-object v11, v3, Lh0/o0;->y:Lkotlin/jvm/internal/f0;

    iget-object v12, v3, Lh0/o0;->x:Lu2/b;

    iget-object v13, v3, Lh0/o0;->w:Lc93/m;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, v5

    move v9, v8

    move-object/from16 v17, v10

    move v5, v0

    move-wide v7, v6

    move-object v0, v12

    goto/16 :goto_b

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v0, v3, Lh0/o0;->F:F

    iget-object v1, v3, Lh0/o0;->z:Lan/d;

    iget-object v5, v3, Lh0/o0;->y:Lkotlin/jvm/internal/f0;

    iget-object v11, v3, Lh0/o0;->x:Lu2/b;

    iget-object v12, v3, Lh0/o0;->w:Lc93/m;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v18, v11

    move v11, v0

    move-object/from16 v0, v18

    move-object/from16 v18, v3

    move-object v3, v1

    move-object v1, v12

    move-object v12, v5

    :goto_1
    move-object/from16 v5, v18

    goto :goto_3

    :cond_3
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v2, Lh0/d2;->x:Lh0/d2;

    move-object/from16 v5, p0

    check-cast v5, Lu2/g0;

    iget-object v11, v5, Lu2/g0;->F:Lu2/h0;

    iget-object v11, v11, Lu2/h0;->T:Lu2/k;

    invoke-static {v11, v0, v1}, Lh0/z0;->l(Lu2/k;J)Z

    move-result v11

    if-eqz v11, :cond_4

    move-object/from16 v17, v10

    goto/16 :goto_c

    :cond_4
    invoke-virtual {v5}, Lu2/g0;->f()Lb3/j3;

    move-result-object v5

    move/from16 v11, p3

    invoke-static {v5, v11}, Lh0/z0;->m(Lb3/j3;I)F

    move-result v5

    new-instance v11, Lkotlin/jvm/internal/f0;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    iput-wide v0, v11, Lkotlin/jvm/internal/f0;->w:J

    new-instance v0, Lan/d;

    const/16 v1, 0x8

    invoke-direct {v0, v2, v6, v7, v1}, Lan/d;-><init>(Ljava/lang/Object;JI)V

    move-object/from16 v1, p4

    move-object v2, v0

    move-object/from16 v0, p0

    :goto_2
    iput-object v1, v3, Lh0/o0;->w:Lc93/m;

    iput-object v0, v3, Lh0/o0;->x:Lu2/b;

    iput-object v11, v3, Lh0/o0;->y:Lkotlin/jvm/internal/f0;

    iput-object v2, v3, Lh0/o0;->z:Lan/d;

    iput-object v10, v3, Lh0/o0;->E:Lu2/r;

    iput v5, v3, Lh0/o0;->F:F

    iput v9, v3, Lh0/o0;->H:I

    invoke-static {v0, v3}, Lu2/b;->H(Lu2/b;Ls83/a;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v4, :cond_5

    goto/16 :goto_a

    :cond_5
    move-object/from16 v18, v3

    move-object v3, v2

    move-object v2, v12

    move-object v12, v11

    move v11, v5

    goto :goto_1

    :goto_3
    check-cast v2, Lu2/k;

    iget-object v13, v2, Lu2/k;->a:Ljava/lang/Object;

    move-object v14, v13

    check-cast v14, Ljava/util/Collection;

    invoke-interface {v14}, Ljava/util/Collection;->size()I

    move-result v14

    const/4 v15, 0x0

    move v9, v15

    :goto_4
    if-ge v9, v14, :cond_7

    invoke-interface {v13, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v17, v10

    move-object/from16 v10, v16

    check-cast v10, Lu2/r;

    move/from16 p0, v9

    iget-wide v8, v10, Lu2/r;->a:J

    iget-wide v6, v12, Lkotlin/jvm/internal/f0;->w:J

    invoke-static {v8, v9, v6, v7}, Lu2/q;->a(JJ)Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_5

    :cond_6
    add-int/lit8 v9, p0, 0x1

    move-object/from16 v10, v17

    const-wide/16 v6, 0x0

    const/4 v8, 0x2

    goto :goto_4

    :cond_7
    move-object/from16 v17, v10

    move-object/from16 v16, v17

    :goto_5
    move-object/from16 v6, v16

    check-cast v6, Lu2/r;

    if-nez v6, :cond_8

    goto/16 :goto_c

    :cond_8
    invoke-virtual {v6}, Lu2/r;->l()Z

    move-result v7

    if-eqz v7, :cond_9

    goto/16 :goto_c

    :cond_9
    invoke-static {v6}, Lu2/d0;->e(Lu2/r;)Z

    move-result v7

    if-eqz v7, :cond_d

    iget-object v2, v2, Lu2/k;->a:Ljava/lang/Object;

    move-object v6, v2

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    :goto_6
    if-ge v15, v6, :cond_b

    invoke-interface {v2, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lu2/r;

    iget-boolean v8, v8, Lu2/r;->d:Z

    if-eqz v8, :cond_a

    goto :goto_7

    :cond_a
    add-int/lit8 v15, v15, 0x1

    goto :goto_6

    :cond_b
    move-object/from16 v7, v17

    :goto_7
    check-cast v7, Lu2/r;

    if-nez v7, :cond_c

    goto/16 :goto_c

    :cond_c
    iget-wide v6, v7, Lu2/r;->a:J

    iput-wide v6, v12, Lkotlin/jvm/internal/f0;->w:J

    const-wide/16 v7, 0x0

    goto :goto_8

    :cond_d
    invoke-virtual {v3, v6, v11}, Lan/d;->E(Lu2/r;F)J

    move-result-wide v7

    const-wide v9, 0x7fffffff7fffffffL

    and-long/2addr v9, v7

    const-wide v13, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v2, v9, v13

    if-eqz v2, :cond_f

    const/16 v2, 0x20

    shr-long/2addr v7, v2

    long-to-int v2, v7

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    new-instance v7, Ljava/lang/Float;

    invoke-direct {v7, v2}, Ljava/lang/Float;-><init>(F)V

    invoke-interface {v1, v6, v7}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v6}, Lu2/r;->l()Z

    move-result v2

    if-eqz v2, :cond_e

    return-object v6

    :cond_e
    const-wide/16 v7, 0x0

    iput-wide v7, v3, Lan/d;->x:J

    :goto_8
    move-object v2, v3

    move-object v3, v5

    move-wide v6, v7

    move v5, v11

    move-object v11, v12

    move-object/from16 v10, v17

    const/4 v8, 0x2

    :goto_9
    const/4 v9, 0x1

    goto/16 :goto_2

    :cond_f
    const-wide/16 v7, 0x0

    sget-object v2, Lu2/l;->y:Lu2/l;

    iput-object v1, v5, Lh0/o0;->w:Lc93/m;

    iput-object v0, v5, Lh0/o0;->x:Lu2/b;

    iput-object v12, v5, Lh0/o0;->y:Lkotlin/jvm/internal/f0;

    iput-object v3, v5, Lh0/o0;->z:Lan/d;

    iput-object v6, v5, Lh0/o0;->E:Lu2/r;

    iput v11, v5, Lh0/o0;->F:F

    const/4 v9, 0x2

    iput v9, v5, Lh0/o0;->H:I

    check-cast v0, Lu2/g0;

    invoke-virtual {v0, v2, v5}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_10

    :goto_a
    return-object v4

    :cond_10
    move-object v13, v1

    move-object v2, v3

    move-object v3, v5

    move-object v1, v6

    move v5, v11

    move-object v11, v12

    :goto_b
    invoke-virtual {v1}, Lu2/r;->l()Z

    move-result v1

    if-eqz v1, :cond_11

    :goto_c
    return-object v17

    :cond_11
    move-wide v6, v7

    move v8, v9

    move-object v1, v13

    move-object/from16 v10, v17

    goto :goto_9
.end method

.method public static final d(Lu2/b;JLs83/a;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p3, Lh0/p0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lh0/p0;

    iget v1, v0, Lh0/p0;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh0/p0;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh0/p0;

    invoke-direct {v0, p3}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lh0/p0;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/p0;->E:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lh0/p0;->y:Lkotlin/jvm/internal/b0;

    iget-object p1, v0, Lh0/p0;->x:Lkotlin/jvm/internal/g0;

    iget-object p2, v0, Lh0/p0;->w:Lu2/r;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p0, Lu2/g0;

    iget-object p3, p0, Lu2/g0;->F:Lu2/h0;

    iget-object p3, p3, Lu2/h0;->T:Lu2/k;

    invoke-static {p3, p1, p2}, Lh0/z0;->l(Lu2/k;J)Z

    move-result p3

    if-eqz p3, :cond_3

    goto :goto_4

    :cond_3
    iget-object p3, p0, Lu2/g0;->F:Lu2/h0;

    iget-object p3, p3, Lu2/h0;->T:Lu2/k;

    iget-object p3, p3, Lu2/k;->a:Ljava/lang/Object;

    move-object v2, p3

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v2, :cond_5

    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lu2/r;

    iget-wide v7, v7, Lu2/r;->a:J

    invoke-static {v7, v8, p1, p2}, Lu2/q;->a(JJ)Z

    move-result v7

    if-eqz v7, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_5
    move-object v6, v4

    :goto_2
    move-object p2, v6

    check-cast p2, Lu2/r;

    if-nez p2, :cond_6

    goto :goto_4

    :cond_6
    new-instance p1, Lkotlin/jvm/internal/g0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    new-instance p3, Lkotlin/jvm/internal/g0;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iput-object p2, p3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {p0}, Lu2/g0;->f()Lb3/j3;

    move-result-object v2

    invoke-interface {v2}, Lb3/j3;->c()J

    move-result-wide v5

    :try_start_1
    new-instance v2, Lkotlin/jvm/internal/b0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lh0/q0;

    invoke-direct {v7, v2, p3, p1, v4}, Lh0/q0;-><init>(Lkotlin/jvm/internal/b0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;Lq83/d;)V

    iput-object p2, v0, Lh0/p0;->w:Lu2/r;

    iput-object p1, v0, Lh0/p0;->x:Lkotlin/jvm/internal/g0;

    iput-object v2, v0, Lh0/p0;->y:Lkotlin/jvm/internal/b0;

    iput v3, v0, Lh0/p0;->E:I

    invoke-virtual {p0, v5, v6, v7, v0}, Lu2/g0;->k(JLc93/m;Ls83/a;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_7

    return-object v1

    :cond_7
    move-object p0, v2

    :goto_3
    iget-boolean p0, p0, Lkotlin/jvm/internal/b0;->w:Z

    if-eqz p0, :cond_9

    iget-object p0, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p0, Lu2/r;
    :try_end_1
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_1 .. :try_end_1} :catch_0

    if-nez p0, :cond_8

    return-object p2

    :cond_8
    return-object p0

    :cond_9
    :goto_4
    return-object v4

    :catch_0
    iget-object p0, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p0, Lu2/r;

    if-nez p0, :cond_a

    goto :goto_5

    :cond_a
    move-object p2, p0

    :goto_5
    return-object p2
.end method

.method public static final e(Lu2/b;JILh0/u0;Ls83/a;)Ljava/lang/Object;
    .locals 19

    move-wide/from16 v0, p1

    move-object/from16 v2, p5

    instance-of v3, v2, Lh0/r0;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lh0/r0;

    iget v4, v3, Lh0/r0;->H:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lh0/r0;->H:I

    goto :goto_0

    :cond_0
    new-instance v3, Lh0/r0;

    invoke-direct {v3, v2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lh0/r0;->G:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lh0/r0;->H:I

    const-wide/16 v6, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v5, :cond_3

    if-eq v5, v9, :cond_2

    if-ne v5, v8, :cond_1

    iget v0, v3, Lh0/r0;->F:F

    iget-object v1, v3, Lh0/r0;->E:Lu2/r;

    iget-object v5, v3, Lh0/r0;->z:Lan/d;

    iget-object v11, v3, Lh0/r0;->y:Lkotlin/jvm/internal/f0;

    iget-object v12, v3, Lh0/r0;->x:Lu2/b;

    iget-object v13, v3, Lh0/r0;->w:Lc93/m;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, v5

    move v9, v8

    move-object/from16 v17, v10

    move v5, v0

    move-wide v7, v6

    move-object v0, v12

    goto/16 :goto_b

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v0, v3, Lh0/r0;->F:F

    iget-object v1, v3, Lh0/r0;->z:Lan/d;

    iget-object v5, v3, Lh0/r0;->y:Lkotlin/jvm/internal/f0;

    iget-object v11, v3, Lh0/r0;->x:Lu2/b;

    iget-object v12, v3, Lh0/r0;->w:Lc93/m;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v18, v11

    move v11, v0

    move-object/from16 v0, v18

    move-object/from16 v18, v3

    move-object v3, v1

    move-object v1, v12

    move-object v12, v5

    :goto_1
    move-object/from16 v5, v18

    goto :goto_3

    :cond_3
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v2, Lh0/d2;->w:Lh0/d2;

    move-object/from16 v5, p0

    check-cast v5, Lu2/g0;

    iget-object v11, v5, Lu2/g0;->F:Lu2/h0;

    iget-object v11, v11, Lu2/h0;->T:Lu2/k;

    invoke-static {v11, v0, v1}, Lh0/z0;->l(Lu2/k;J)Z

    move-result v11

    if-eqz v11, :cond_4

    move-object/from16 v17, v10

    goto/16 :goto_c

    :cond_4
    invoke-virtual {v5}, Lu2/g0;->f()Lb3/j3;

    move-result-object v5

    move/from16 v11, p3

    invoke-static {v5, v11}, Lh0/z0;->m(Lb3/j3;I)F

    move-result v5

    new-instance v11, Lkotlin/jvm/internal/f0;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    iput-wide v0, v11, Lkotlin/jvm/internal/f0;->w:J

    new-instance v0, Lan/d;

    const/16 v1, 0x8

    invoke-direct {v0, v2, v6, v7, v1}, Lan/d;-><init>(Ljava/lang/Object;JI)V

    move-object/from16 v1, p4

    move-object v2, v0

    move-object/from16 v0, p0

    :goto_2
    iput-object v1, v3, Lh0/r0;->w:Lc93/m;

    iput-object v0, v3, Lh0/r0;->x:Lu2/b;

    iput-object v11, v3, Lh0/r0;->y:Lkotlin/jvm/internal/f0;

    iput-object v2, v3, Lh0/r0;->z:Lan/d;

    iput-object v10, v3, Lh0/r0;->E:Lu2/r;

    iput v5, v3, Lh0/r0;->F:F

    iput v9, v3, Lh0/r0;->H:I

    invoke-static {v0, v3}, Lu2/b;->H(Lu2/b;Ls83/a;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v4, :cond_5

    goto/16 :goto_a

    :cond_5
    move-object/from16 v18, v3

    move-object v3, v2

    move-object v2, v12

    move-object v12, v11

    move v11, v5

    goto :goto_1

    :goto_3
    check-cast v2, Lu2/k;

    iget-object v13, v2, Lu2/k;->a:Ljava/lang/Object;

    move-object v14, v13

    check-cast v14, Ljava/util/Collection;

    invoke-interface {v14}, Ljava/util/Collection;->size()I

    move-result v14

    const/4 v15, 0x0

    move v9, v15

    :goto_4
    if-ge v9, v14, :cond_7

    invoke-interface {v13, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v17, v10

    move-object/from16 v10, v16

    check-cast v10, Lu2/r;

    move/from16 p0, v9

    iget-wide v8, v10, Lu2/r;->a:J

    iget-wide v6, v12, Lkotlin/jvm/internal/f0;->w:J

    invoke-static {v8, v9, v6, v7}, Lu2/q;->a(JJ)Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_5

    :cond_6
    add-int/lit8 v9, p0, 0x1

    move-object/from16 v10, v17

    const-wide/16 v6, 0x0

    const/4 v8, 0x2

    goto :goto_4

    :cond_7
    move-object/from16 v17, v10

    move-object/from16 v16, v17

    :goto_5
    move-object/from16 v6, v16

    check-cast v6, Lu2/r;

    if-nez v6, :cond_8

    goto/16 :goto_c

    :cond_8
    invoke-virtual {v6}, Lu2/r;->l()Z

    move-result v7

    if-eqz v7, :cond_9

    goto/16 :goto_c

    :cond_9
    invoke-static {v6}, Lu2/d0;->e(Lu2/r;)Z

    move-result v7

    if-eqz v7, :cond_d

    iget-object v2, v2, Lu2/k;->a:Ljava/lang/Object;

    move-object v6, v2

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    :goto_6
    if-ge v15, v6, :cond_b

    invoke-interface {v2, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lu2/r;

    iget-boolean v8, v8, Lu2/r;->d:Z

    if-eqz v8, :cond_a

    goto :goto_7

    :cond_a
    add-int/lit8 v15, v15, 0x1

    goto :goto_6

    :cond_b
    move-object/from16 v7, v17

    :goto_7
    check-cast v7, Lu2/r;

    if-nez v7, :cond_c

    goto/16 :goto_c

    :cond_c
    iget-wide v6, v7, Lu2/r;->a:J

    iput-wide v6, v12, Lkotlin/jvm/internal/f0;->w:J

    const-wide/16 v7, 0x0

    goto :goto_8

    :cond_d
    invoke-virtual {v3, v6, v11}, Lan/d;->E(Lu2/r;F)J

    move-result-wide v7

    const-wide v9, 0x7fffffff7fffffffL

    and-long/2addr v9, v7

    const-wide v13, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v2, v9, v13

    if-eqz v2, :cond_f

    const-wide v9, 0xffffffffL

    and-long/2addr v7, v9

    long-to-int v2, v7

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    new-instance v7, Ljava/lang/Float;

    invoke-direct {v7, v2}, Ljava/lang/Float;-><init>(F)V

    invoke-interface {v1, v6, v7}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v6}, Lu2/r;->l()Z

    move-result v2

    if-eqz v2, :cond_e

    return-object v6

    :cond_e
    const-wide/16 v7, 0x0

    iput-wide v7, v3, Lan/d;->x:J

    :goto_8
    move-object v2, v3

    move-object v3, v5

    move-wide v6, v7

    move v5, v11

    move-object v11, v12

    move-object/from16 v10, v17

    const/4 v8, 0x2

    :goto_9
    const/4 v9, 0x1

    goto/16 :goto_2

    :cond_f
    const-wide/16 v7, 0x0

    sget-object v2, Lu2/l;->y:Lu2/l;

    iput-object v1, v5, Lh0/r0;->w:Lc93/m;

    iput-object v0, v5, Lh0/r0;->x:Lu2/b;

    iput-object v12, v5, Lh0/r0;->y:Lkotlin/jvm/internal/f0;

    iput-object v3, v5, Lh0/r0;->z:Lan/d;

    iput-object v6, v5, Lh0/r0;->E:Lu2/r;

    iput v11, v5, Lh0/r0;->F:F

    const/4 v9, 0x2

    iput v9, v5, Lh0/r0;->H:I

    check-cast v0, Lu2/g0;

    invoke-virtual {v0, v2, v5}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_10

    :goto_a
    return-object v4

    :cond_10
    move-object v13, v1

    move-object v2, v3

    move-object v3, v5

    move-object v1, v6

    move v5, v11

    move-object v11, v12

    :goto_b
    invoke-virtual {v1}, Lu2/r;->l()Z

    move-result v1

    if-eqz v1, :cond_11

    :goto_c
    return-object v17

    :cond_11
    move-wide v6, v7

    move v8, v9

    move-object v1, v13

    move-object/from16 v10, v17

    goto :goto_9
.end method

.method public static final f(Lu2/v;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 9

    new-instance v4, Le81/f;

    const/4 v0, 0x1

    invoke-direct {v4, p1, v0}, Le81/f;-><init>(Lkotlin/jvm/functions/Function1;I)V

    new-instance v7, Lh0/l0;

    const/4 p1, 0x0

    invoke-direct {v7, p2, p1}, Lh0/l0;-><init>(Lc93/a;I)V

    new-instance v1, Lgw1/a;

    const/16 p1, 0x1c

    invoke-direct {v1, p1}, Lgw1/a;-><init>(I)V

    new-instance v2, Lkotlin/jvm/internal/f0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lh0/s0;

    const/4 v8, 0x0

    const/4 v3, 0x0

    move-object v6, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v8}, Lh0/s0;-><init>(Lc93/a;Lkotlin/jvm/internal/f0;Lh0/d2;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-static {p0, v0, p5}, Lh0/q3;->g(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, p2

    :goto_0
    if-ne p0, p1, :cond_1

    return-object p0

    :cond_1
    return-object p2
.end method

.method public static synthetic g(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 6

    new-instance v1, Lgo1/a;

    const/16 v0, 0x16

    invoke-direct {v1, v0}, Lgo1/a;-><init>(I)V

    new-instance v2, Lgw1/a;

    const/16 v0, 0x1b

    invoke-direct {v2, v0}, Lgw1/a;-><init>(I)V

    new-instance v3, Lgw1/a;

    invoke-direct {v3, v0}, Lgw1/a;-><init>(I)V

    move-object v0, p0

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Lh0/z0;->f(Lu2/v;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static h(Lu2/v;Lc93/a;Lc93/a;Lc93/m;Lq83/d;I)Ljava/lang/Object;
    .locals 7

    new-instance v1, Lgo1/a;

    const/16 v0, 0x16

    invoke-direct {v1, v0}, Lgo1/a;-><init>(I)V

    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_0

    new-instance p1, Lgw1/a;

    const/16 v0, 0x1b

    invoke-direct {p1, v0}, Lgw1/a;-><init>(I)V

    :cond_0
    move-object v3, p1

    and-int/lit8 p1, p5, 0x4

    if-eqz p1, :cond_1

    new-instance p2, Lgw1/a;

    const/16 p1, 0x1b

    invoke-direct {p2, p1}, Lgw1/a;-><init>(I)V

    :cond_1
    move-object v4, p2

    new-instance v0, Lh0/v0;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p3

    invoke-direct/range {v0 .. v6}, Lh0/v0;-><init>(Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/a;Lc93/a;Lq83/d;I)V

    invoke-static {p0, v0, p4}, Lh0/q3;->g(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_2

    return-object p0

    :cond_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static i(Lu2/v;Lvy0/m;Lc93/a;Lc93/m;Lq83/d;I)Ljava/lang/Object;
    .locals 7

    and-int/lit8 p5, p5, 0x1

    if-eqz p5, :cond_0

    new-instance p1, Lgo1/a;

    const/16 p5, 0x16

    invoke-direct {p1, p5}, Lgo1/a;-><init>(I)V

    :cond_0
    move-object v1, p1

    new-instance v4, Lgw1/a;

    const/16 p1, 0x1b

    invoke-direct {v4, p1}, Lgw1/a;-><init>(I)V

    new-instance v0, Lh0/v0;

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v3, p2

    move-object v2, p3

    invoke-direct/range {v0 .. v6}, Lh0/v0;-><init>(Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/a;Lc93/a;Lq83/d;I)V

    invoke-static {p0, v0, p4}, Lh0/q3;->g(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_1

    return-object p0

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j(Lu2/b;JLkotlin/jvm/functions/Function1;Ls83/a;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p4, Lh0/w0;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lh0/w0;

    iget v1, v0, Lh0/w0;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh0/w0;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh0/w0;

    invoke-direct {v0, p4}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lh0/w0;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/w0;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lh0/w0;->x:Lkotlin/jvm/functions/Function1;

    iget-object p1, v0, Lh0/w0;->w:Lu2/b;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p3, p0

    move-object p0, p1

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_1
    iput-object p0, v0, Lh0/w0;->w:Lu2/b;

    iput-object p3, v0, Lh0/w0;->x:Lkotlin/jvm/functions/Function1;

    iput v3, v0, Lh0/w0;->z:I

    invoke-static {p0, p1, p2, v0}, Lh0/z0;->b(Lu2/b;JLs83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    check-cast p4, Lu2/r;

    if-nez p4, :cond_4

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    :cond_4
    invoke-static {p4}, Lu2/d0;->e(Lu2/r;)Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    :cond_5
    invoke-interface {p3, p4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide p1, p4, Lu2/r;->a:J

    goto :goto_1
.end method

.method public static final k(Lu2/b;JLd30/d1;Ls83/a;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p4

    instance-of v1, v0, Lh0/x0;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lh0/x0;

    iget v2, v1, Lh0/x0;->G:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lh0/x0;->G:I

    goto :goto_0

    :cond_0
    new-instance v1, Lh0/x0;

    invoke-direct {v1, v0}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object v0, v1, Lh0/x0;->F:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lh0/x0;->G:I

    const/4 v6, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v6, :cond_1

    iget-object v3, v1, Lh0/x0;->E:Lkotlin/jvm/internal/f0;

    iget-object v7, v1, Lh0/x0;->z:Lu2/b;

    iget-object v8, v1, Lh0/x0;->y:Lh0/d2;

    iget-object v9, v1, Lh0/x0;->x:Lu2/b;

    iget-object v10, v1, Lh0/x0;->w:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v16, v10

    move-object v10, v1

    move-object/from16 v1, v16

    goto :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Lh0/d2;->x:Lh0/d2;

    move-object/from16 v3, p0

    check-cast v3, Lu2/g0;

    iget-object v3, v3, Lu2/g0;->F:Lu2/h0;

    iget-object v3, v3, Lu2/h0;->T:Lu2/k;

    move-wide/from16 v7, p1

    invoke-static {v3, v7, v8}, Lh0/z0;->l(Lu2/k;J)Z

    move-result v3

    if-eqz v3, :cond_3

    move v15, v6

    :goto_1
    const/4 v5, 0x0

    goto/16 :goto_f

    :cond_3
    move-object v3, v0

    move-object v9, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    :goto_2
    new-instance v10, Lkotlin/jvm/internal/f0;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    iput-wide v7, v10, Lkotlin/jvm/internal/f0;->w:J

    move-object v7, v0

    move-object v8, v3

    move-object v3, v10

    :goto_3
    iput-object v1, v9, Lh0/x0;->w:Lkotlin/jvm/functions/Function1;

    iput-object v0, v9, Lh0/x0;->x:Lu2/b;

    iput-object v8, v9, Lh0/x0;->y:Lh0/d2;

    iput-object v7, v9, Lh0/x0;->z:Lu2/b;

    iput-object v3, v9, Lh0/x0;->E:Lkotlin/jvm/internal/f0;

    iput v6, v9, Lh0/x0;->G:I

    invoke-static {v7, v9}, Lu2/b;->H(Lu2/b;Ls83/a;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v2, :cond_4

    return-object v2

    :cond_4
    move-object/from16 v16, v9

    move-object v9, v0

    move-object v0, v10

    move-object/from16 v10, v16

    :goto_4
    check-cast v0, Lu2/k;

    iget-object v11, v0, Lu2/k;->a:Ljava/lang/Object;

    move-object v12, v11

    check-cast v12, Ljava/util/Collection;

    invoke-interface {v12}, Ljava/util/Collection;->size()I

    move-result v12

    const/4 v13, 0x0

    :goto_5
    if-ge v13, v12, :cond_6

    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, Lu2/r;

    iget-wide v4, v15, Lu2/r;->a:J

    move-object/from16 p0, v7

    iget-wide v6, v3, Lkotlin/jvm/internal/f0;->w:J

    invoke-static {v4, v5, v6, v7}, Lu2/q;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_6

    :cond_5
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v7, p0

    const/4 v6, 0x1

    goto :goto_5

    :cond_6
    move-object/from16 p0, v7

    const/4 v14, 0x0

    :goto_6
    check-cast v14, Lu2/r;

    if-nez v14, :cond_7

    const/4 v14, 0x0

    :goto_7
    const/4 v15, 0x1

    goto :goto_d

    :cond_7
    invoke-static {v14}, Lu2/d0;->e(Lu2/r;)Z

    move-result v4

    if-eqz v4, :cond_b

    iget-object v0, v0, Lu2/k;->a:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_8
    if-ge v5, v4, :cond_9

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lu2/r;

    iget-boolean v7, v7, Lu2/r;->d:Z

    if-eqz v7, :cond_8

    goto :goto_9

    :cond_8
    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    :cond_9
    const/4 v6, 0x0

    :goto_9
    check-cast v6, Lu2/r;

    if-nez v6, :cond_a

    goto :goto_7

    :cond_a
    iget-wide v4, v6, Lu2/r;->a:J

    iput-wide v4, v3, Lkotlin/jvm/internal/f0;->w:J

    const/4 v15, 0x1

    goto :goto_c

    :cond_b
    const/4 v15, 0x1

    invoke-static {v14, v15}, Lu2/d0;->k(Lu2/r;Z)J

    move-result-wide v4

    if-nez v8, :cond_c

    invoke-static {v4, v5}, Lh2/b;->d(J)F

    move-result v0

    goto :goto_b

    :cond_c
    sget-object v0, Lh0/d2;->w:Lh0/d2;

    if-ne v8, v0, :cond_d

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    :goto_a
    long-to-int v0, v4

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    goto :goto_b

    :cond_d
    const/16 v0, 0x20

    shr-long/2addr v4, v0

    goto :goto_a

    :goto_b
    const/4 v4, 0x0

    cmpg-float v0, v0, v4

    if-nez v0, :cond_e

    :goto_c
    move-object/from16 v7, p0

    move-object v0, v9

    move-object v9, v10

    move v6, v15

    goto/16 :goto_3

    :cond_e
    :goto_d
    if-nez v14, :cond_f

    :goto_e
    goto/16 :goto_1

    :cond_f
    invoke-virtual {v14}, Lu2/r;->l()Z

    move-result v0

    if-eqz v0, :cond_10

    goto :goto_e

    :cond_10
    invoke-static {v14}, Lu2/d0;->e(Lu2/r;)Z

    move-result v0

    if-eqz v0, :cond_12

    move-object v5, v14

    :goto_f
    if-eqz v5, :cond_11

    move v4, v15

    goto :goto_10

    :cond_11
    const/4 v4, 0x0

    :goto_10
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_12
    invoke-interface {v1, v14}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v3, v14, Lu2/r;->a:J

    move-wide/from16 v16, v3

    move-object v3, v8

    move-wide/from16 v7, v16

    move-object v0, v9

    move-object v9, v10

    move v6, v15

    goto/16 :goto_2
.end method

.method public static final l(Lu2/k;J)Z
    .locals 6

    iget-object p0, p0, Lu2/k;->a:Ljava/lang/Object;

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lu2/r;

    iget-wide v4, v4, Lu2/r;->a:J

    invoke-static {v4, v5, p1, p2}, Lu2/q;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    check-cast v3, Lu2/r;

    const/4 p0, 0x1

    if-eqz v3, :cond_2

    iget-boolean p1, v3, Lu2/r;->d:Z

    if-ne p1, p0, :cond_2

    move v1, p0

    :cond_2
    xor-int/2addr p0, v1

    return p0
.end method

.method public static final m(Lb3/j3;I)F
    .locals 1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    invoke-interface {p0}, Lb3/j3;->g()F

    move-result p0

    sget p1, Lh0/z0;->a:F

    mul-float/2addr p0, p1

    return p0

    :cond_0
    invoke-interface {p0}, Lb3/j3;->g()F

    move-result p0

    return p0
.end method

.method public static final n(Lu2/b;JLd30/d1;Ls83/a;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p4

    instance-of v1, v0, Lh0/y0;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lh0/y0;

    iget v2, v1, Lh0/y0;->G:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lh0/y0;->G:I

    goto :goto_0

    :cond_0
    new-instance v1, Lh0/y0;

    invoke-direct {v1, v0}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object v0, v1, Lh0/y0;->F:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lh0/y0;->G:I

    const/4 v6, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v6, :cond_1

    iget-object v3, v1, Lh0/y0;->E:Lkotlin/jvm/internal/f0;

    iget-object v7, v1, Lh0/y0;->z:Lu2/b;

    iget-object v8, v1, Lh0/y0;->y:Lh0/d2;

    iget-object v9, v1, Lh0/y0;->x:Lu2/b;

    iget-object v10, v1, Lh0/y0;->w:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v16, v10

    move-object v10, v1

    move-object/from16 v1, v16

    goto :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Lh0/d2;->w:Lh0/d2;

    move-object/from16 v3, p0

    check-cast v3, Lu2/g0;

    iget-object v3, v3, Lu2/g0;->F:Lu2/h0;

    iget-object v3, v3, Lu2/h0;->T:Lu2/k;

    move-wide/from16 v7, p1

    invoke-static {v3, v7, v8}, Lh0/z0;->l(Lu2/k;J)Z

    move-result v3

    if-eqz v3, :cond_3

    move v15, v6

    :goto_1
    const/4 v5, 0x0

    goto/16 :goto_f

    :cond_3
    move-object v3, v0

    move-object v9, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    :goto_2
    new-instance v10, Lkotlin/jvm/internal/f0;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    iput-wide v7, v10, Lkotlin/jvm/internal/f0;->w:J

    move-object v7, v0

    move-object v8, v3

    move-object v3, v10

    :goto_3
    iput-object v1, v9, Lh0/y0;->w:Lkotlin/jvm/functions/Function1;

    iput-object v0, v9, Lh0/y0;->x:Lu2/b;

    iput-object v8, v9, Lh0/y0;->y:Lh0/d2;

    iput-object v7, v9, Lh0/y0;->z:Lu2/b;

    iput-object v3, v9, Lh0/y0;->E:Lkotlin/jvm/internal/f0;

    iput v6, v9, Lh0/y0;->G:I

    invoke-static {v7, v9}, Lu2/b;->H(Lu2/b;Ls83/a;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v2, :cond_4

    return-object v2

    :cond_4
    move-object/from16 v16, v9

    move-object v9, v0

    move-object v0, v10

    move-object/from16 v10, v16

    :goto_4
    check-cast v0, Lu2/k;

    iget-object v11, v0, Lu2/k;->a:Ljava/lang/Object;

    move-object v12, v11

    check-cast v12, Ljava/util/Collection;

    invoke-interface {v12}, Ljava/util/Collection;->size()I

    move-result v12

    const/4 v13, 0x0

    :goto_5
    if-ge v13, v12, :cond_6

    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, Lu2/r;

    iget-wide v4, v15, Lu2/r;->a:J

    move-object/from16 p0, v7

    iget-wide v6, v3, Lkotlin/jvm/internal/f0;->w:J

    invoke-static {v4, v5, v6, v7}, Lu2/q;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_6

    :cond_5
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v7, p0

    const/4 v6, 0x1

    goto :goto_5

    :cond_6
    move-object/from16 p0, v7

    const/4 v14, 0x0

    :goto_6
    check-cast v14, Lu2/r;

    if-nez v14, :cond_7

    const/4 v14, 0x0

    :goto_7
    const/4 v15, 0x1

    goto :goto_d

    :cond_7
    invoke-static {v14}, Lu2/d0;->e(Lu2/r;)Z

    move-result v4

    if-eqz v4, :cond_b

    iget-object v0, v0, Lu2/k;->a:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_8
    if-ge v5, v4, :cond_9

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lu2/r;

    iget-boolean v7, v7, Lu2/r;->d:Z

    if-eqz v7, :cond_8

    goto :goto_9

    :cond_8
    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    :cond_9
    const/4 v6, 0x0

    :goto_9
    check-cast v6, Lu2/r;

    if-nez v6, :cond_a

    goto :goto_7

    :cond_a
    iget-wide v4, v6, Lu2/r;->a:J

    iput-wide v4, v3, Lkotlin/jvm/internal/f0;->w:J

    const/4 v15, 0x1

    goto :goto_c

    :cond_b
    const/4 v15, 0x1

    invoke-static {v14, v15}, Lu2/d0;->k(Lu2/r;Z)J

    move-result-wide v4

    if-nez v8, :cond_c

    invoke-static {v4, v5}, Lh2/b;->d(J)F

    move-result v0

    goto :goto_b

    :cond_c
    sget-object v0, Lh0/d2;->w:Lh0/d2;

    if-ne v8, v0, :cond_d

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    :goto_a
    long-to-int v0, v4

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    goto :goto_b

    :cond_d
    const/16 v0, 0x20

    shr-long/2addr v4, v0

    goto :goto_a

    :goto_b
    const/4 v4, 0x0

    cmpg-float v0, v0, v4

    if-nez v0, :cond_e

    :goto_c
    move-object/from16 v7, p0

    move-object v0, v9

    move-object v9, v10

    move v6, v15

    goto/16 :goto_3

    :cond_e
    :goto_d
    if-nez v14, :cond_f

    :goto_e
    goto/16 :goto_1

    :cond_f
    invoke-virtual {v14}, Lu2/r;->l()Z

    move-result v0

    if-eqz v0, :cond_10

    goto :goto_e

    :cond_10
    invoke-static {v14}, Lu2/d0;->e(Lu2/r;)Z

    move-result v0

    if-eqz v0, :cond_12

    move-object v5, v14

    :goto_f
    if-eqz v5, :cond_11

    move v4, v15

    goto :goto_10

    :cond_11
    const/4 v4, 0x0

    :goto_10
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_12
    invoke-interface {v1, v14}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v3, v14, Lu2/r;->a:J

    move-wide/from16 v16, v3

    move-object v3, v8

    move-wide/from16 v7, v16

    move-object v0, v9

    move-object v9, v10

    move v6, v15

    goto/16 :goto_2
.end method

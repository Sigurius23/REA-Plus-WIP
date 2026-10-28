.class public final Lh0/u3;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:J

.field public F:I

.field public G:I

.field public H:I

.field public synthetic I:Ljava/lang/Object;

.field public final synthetic J:Lcom/whoop/profile/view/edit/avatar/c;

.field public x:F

.field public y:F

.field public z:F


# direct methods
.method public constructor <init>(Lcom/whoop/profile/view/edit/avatar/c;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lh0/u3;->J:Lcom/whoop/profile/view/edit/avatar/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    new-instance v0, Lh0/u3;

    iget-object v1, p0, Lh0/u3;->J:Lcom/whoop/profile/view/edit/avatar/c;

    invoke-direct {v0, v1, p2}, Lh0/u3;-><init>(Lcom/whoop/profile/view/edit/avatar/c;Lq83/d;)V

    iput-object p1, v0, Lh0/u3;->I:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh0/u3;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/u3;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/u3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/u3;->H:I

    const-wide/16 v3, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v9, :cond_1

    if-ne v2, v6, :cond_0

    iget v2, v0, Lh0/u3;->G:I

    iget v10, v0, Lh0/u3;->z:F

    iget v11, v0, Lh0/u3;->F:I

    iget-wide v12, v0, Lh0/u3;->E:J

    iget v14, v0, Lh0/u3;->y:F

    iget v15, v0, Lh0/u3;->x:F

    iget-object v6, v0, Lh0/u3;->I:Ljava/lang/Object;

    check-cast v6, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move/from16 v16, v5

    move-object/from16 v5, p1

    goto/16 :goto_3

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget v2, v0, Lh0/u3;->G:I

    iget v6, v0, Lh0/u3;->z:F

    iget v10, v0, Lh0/u3;->F:I

    iget-wide v11, v0, Lh0/u3;->E:J

    iget v13, v0, Lh0/u3;->y:F

    iget v14, v0, Lh0/u3;->x:F

    iget-object v15, v0, Lh0/u3;->I:Ljava/lang/Object;

    check-cast v15, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lh0/u3;->I:Ljava/lang/Object;

    check-cast v2, Lu2/b;

    move-object v15, v2

    check-cast v15, Lu2/g0;

    invoke-virtual {v15}, Lu2/g0;->f()Lb3/j3;

    move-result-object v2

    invoke-interface {v2}, Lb3/j3;->g()F

    move-result v6

    iput-object v15, v0, Lh0/u3;->I:Ljava/lang/Object;

    iput v7, v0, Lh0/u3;->x:F

    iput v5, v0, Lh0/u3;->y:F

    iput-wide v3, v0, Lh0/u3;->E:J

    iput v8, v0, Lh0/u3;->F:I

    iput v6, v0, Lh0/u3;->z:F

    iput v8, v0, Lh0/u3;->G:I

    iput v9, v0, Lh0/u3;->H:I

    const/4 v2, 0x2

    invoke-static {v15, v0, v2}, Lh0/o3;->c(Lu2/b;Lq83/d;I)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v1, :cond_3

    goto :goto_2

    :cond_3
    move-wide v11, v3

    move v13, v5

    move v14, v7

    move v2, v8

    move v10, v2

    :goto_0
    move/from16 v24, v10

    move v10, v6

    move-object v6, v15

    move v15, v14

    move v14, v13

    move-wide v12, v11

    move/from16 v11, v24

    :goto_1
    iput-object v6, v0, Lh0/u3;->I:Ljava/lang/Object;

    iput v15, v0, Lh0/u3;->x:F

    iput v14, v0, Lh0/u3;->y:F

    iput-wide v12, v0, Lh0/u3;->E:J

    iput v11, v0, Lh0/u3;->F:I

    iput v10, v0, Lh0/u3;->z:F

    iput v2, v0, Lh0/u3;->G:I

    move/from16 v16, v5

    const/4 v5, 0x2

    iput v5, v0, Lh0/u3;->H:I

    invoke-static {v6, v0}, Lu2/b;->H(Lu2/b;Ls83/a;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_4

    :goto_2
    return-object v1

    :cond_4
    :goto_3
    check-cast v5, Lu2/k;

    move/from16 v17, v7

    iget-object v7, v5, Lu2/k;->a:Ljava/lang/Object;

    move-object/from16 v18, v7

    check-cast v18, Ljava/util/Collection;

    invoke-interface/range {v18 .. v18}, Ljava/util/Collection;->size()I

    move-result v3

    move v4, v8

    :goto_4
    if-ge v4, v3, :cond_6

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Lu2/r;

    invoke-virtual/range {v18 .. v18}, Lu2/r;->l()Z

    move-result v18

    if-eqz v18, :cond_5

    move v3, v9

    goto :goto_5

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_6
    move v3, v8

    :goto_5
    if-nez v3, :cond_10

    invoke-static {v5}, Lh0/q3;->l(Lu2/k;)F

    move-result v4

    invoke-static {v5}, Lh0/q3;->k(Lu2/k;)F

    move-result v18

    move/from16 p1, v10

    invoke-static {v5}, Lh0/q3;->j(Lu2/k;)J

    move-result-wide v9

    if-nez v11, :cond_8

    mul-float/2addr v14, v4

    add-float v15, v15, v18

    invoke-static {v12, v13, v9, v10}, Lh2/b;->h(JJ)J

    move-result-wide v12

    invoke-static {v5, v8}, Lh0/q3;->i(Lu2/k;Z)F

    move-result v21

    move-object/from16 v20, v1

    const/4 v8, 0x1

    int-to-float v1, v8

    sub-float/2addr v1, v14

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    mul-float v1, v1, v21

    const v23, 0x40490fdb    # (float)Math.PI

    mul-float v23, v23, v15

    mul-float v23, v23, v21

    const/high16 v21, 0x43340000    # 180.0f

    div-float v23, v23, v21

    invoke-static/range {v23 .. v23}, Ljava/lang/Math;->abs(F)F

    move-result v21

    invoke-static {v12, v13}, Lh2/b;->d(J)F

    move-result v23

    cmpl-float v1, v1, p1

    if-gtz v1, :cond_7

    cmpl-float v1, v21, p1

    if-gtz v1, :cond_7

    cmpl-float v1, v23, p1

    if-lez v1, :cond_9

    :cond_7
    move v11, v8

    const/4 v2, 0x0

    goto :goto_6

    :cond_8
    move-object/from16 v20, v1

    const/4 v8, 0x1

    :cond_9
    :goto_6
    if-eqz v11, :cond_e

    move-wide/from16 v21, v9

    const/4 v1, 0x0

    invoke-static {v5, v1}, Lh0/q3;->h(Lu2/k;Z)J

    move-result-wide v8

    if-eqz v2, :cond_a

    move/from16 v5, v17

    goto :goto_7

    :cond_a
    move/from16 v5, v18

    :goto_7
    cmpg-float v18, v5, v17

    if-nez v18, :cond_b

    cmpg-float v18, v4, v16

    if-nez v18, :cond_b

    move/from16 v18, v2

    move/from16 v19, v11

    move-wide/from16 v1, v21

    const-wide/16 v10, 0x0

    invoke-static {v1, v2, v10, v11}, Lh2/b;->c(JJ)Z

    move-result v21

    if-nez v21, :cond_c

    goto :goto_8

    :cond_b
    move/from16 v18, v2

    move/from16 v19, v11

    move-wide/from16 v1, v21

    const-wide/16 v10, 0x0

    :goto_8
    new-instance v10, Lh2/b;

    invoke-direct {v10, v8, v9}, Lh2/b;-><init>(J)V

    new-instance v8, Lh2/b;

    invoke-direct {v8, v1, v2}, Lh2/b;-><init>(J)V

    new-instance v1, Ljava/lang/Float;

    invoke-direct {v1, v4}, Ljava/lang/Float;-><init>(F)V

    new-instance v2, Ljava/lang/Float;

    invoke-direct {v2, v5}, Ljava/lang/Float;-><init>(F)V

    iget-object v4, v0, Lh0/u3;->J:Lcom/whoop/profile/view/edit/avatar/c;

    invoke-virtual {v4, v10, v8, v1, v2}, Lcom/whoop/profile/view/edit/avatar/c;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    move-object v1, v7

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_9
    if-ge v2, v1, :cond_f

    invoke-interface {v7, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu2/r;

    invoke-static {v4}, Lu2/d0;->l(Lu2/r;)Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-virtual {v4}, Lu2/r;->a()V

    :cond_d
    add-int/lit8 v2, v2, 0x1

    goto :goto_9

    :cond_e
    move/from16 v18, v2

    move/from16 v19, v11

    :cond_f
    move/from16 v2, v18

    move/from16 v11, v19

    goto :goto_a

    :cond_10
    move-object/from16 v20, v1

    move/from16 p1, v10

    :goto_a
    if-nez v3, :cond_12

    move-object v1, v7

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v3, 0x0

    :goto_b
    if-ge v3, v1, :cond_12

    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu2/r;

    iget-boolean v4, v4, Lu2/r;->d:Z

    if-eqz v4, :cond_11

    move/from16 v10, p1

    move/from16 v5, v16

    move/from16 v7, v17

    move-object/from16 v1, v20

    const-wide/16 v3, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    goto/16 :goto_1

    :cond_11
    add-int/lit8 v3, v3, 0x1

    goto :goto_b

    :cond_12
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

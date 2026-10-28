.class public final Lh0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li0/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ll83/e;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ll83/e;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lh0/c;->a:I

    iput-object p1, p0, Lh0/c;->b:Ljava/lang/Object;

    iput-object p2, p0, Lh0/c;->c:Ll83/e;

    iput-object p3, p0, Lh0/c;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(F)F
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    iget v2, v0, Lh0/c;->a:I

    packed-switch v2, :pswitch_data_0

    iget-object v2, v0, Lh0/c;->b:Ljava/lang/Object;

    check-cast v2, Lq0/y;

    invoke-virtual {v2}, Lq0/y;->l()Lq0/q;

    move-result-object v3

    iget-object v3, v3, Lq0/q;->n:Li0/n;

    invoke-virtual {v2}, Lq0/y;->l()Lq0/q;

    move-result-object v4

    iget-object v4, v4, Lq0/q;->a:Ljava/util/List;

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    const/high16 v7, 0x7f800000    # Float.POSITIVE_INFINITY

    const/4 v8, 0x0

    move v10, v7

    const/high16 v9, -0x800000    # Float.NEGATIVE_INFINITY

    :goto_0
    const/4 v11, 0x0

    if-ge v8, v5, :cond_2

    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lq0/d;

    invoke-virtual {v2}, Lq0/y;->l()Lq0/q;

    move-result-object v13

    invoke-static {v13}, Lds/p;->I(Lq0/q;)I

    move-result v13

    invoke-virtual {v2}, Lq0/y;->l()Lq0/q;

    move-result-object v14

    iget v14, v14, Lq0/q;->f:I

    neg-int v14, v14

    invoke-virtual {v2}, Lq0/y;->l()Lq0/q;

    move-result-object v15

    iget v15, v15, Lq0/q;->d:I

    const/high16 v16, -0x800000    # Float.NEGATIVE_INFINITY

    invoke-virtual {v2}, Lq0/y;->l()Lq0/q;

    move-result-object v6

    iget v6, v6, Lq0/q;->b:I

    iget v12, v12, Lq0/d;->k:I

    invoke-virtual {v2}, Lq0/y;->m()I

    invoke-interface {v3, v13, v6, v14, v15}, Li0/n;->a(IIII)I

    move-result v6

    int-to-float v6, v6

    int-to-float v12, v12

    sub-float/2addr v12, v6

    cmpg-float v6, v12, v11

    if-gtz v6, :cond_0

    cmpl-float v6, v12, v9

    if-lez v6, :cond_0

    move v9, v12

    :cond_0
    cmpl-float v6, v12, v11

    if-ltz v6, :cond_1

    cmpg-float v6, v12, v10

    if-gez v6, :cond_1

    move v10, v12

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_2
    const/high16 v16, -0x800000    # Float.NEGATIVE_INFINITY

    cmpg-float v3, v9, v16

    if-nez v3, :cond_3

    move v9, v10

    :cond_3
    cmpg-float v3, v10, v7

    if-nez v3, :cond_4

    move v10, v9

    :cond_4
    invoke-virtual {v2}, Lq0/y;->d()Z

    move-result v3

    if-nez v3, :cond_6

    invoke-static {v2, v1}, Ltx/f;->R(Lq0/y;F)Z

    move-result v3

    if-eqz v3, :cond_5

    move v9, v11

    move v10, v9

    goto :goto_1

    :cond_5
    move v10, v11

    :cond_6
    :goto_1
    invoke-virtual {v2}, Lq0/y;->c()Z

    move-result v3

    if-nez v3, :cond_7

    invoke-static {v2, v1}, Ltx/f;->R(Lq0/y;F)Z

    move-result v2

    move v9, v11

    if-nez v2, :cond_7

    move v10, v9

    :cond_7
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    iget-object v4, v0, Lh0/c;->c:Ll83/e;

    check-cast v4, Loq1/c;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v4, v1, v5, v6}, Loq1/c;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    cmpg-float v4, v1, v2

    if-nez v4, :cond_8

    goto :goto_2

    :cond_8
    cmpg-float v4, v1, v3

    if-nez v4, :cond_9

    goto :goto_2

    :cond_9
    cmpg-float v4, v1, v11

    if-nez v4, :cond_a

    goto :goto_2

    :cond_a
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Final Snapping Offset Should Be one of "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, " or 0.0"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lk0/a;->c(Ljava/lang/String;)V

    :goto_2
    cmpg-float v2, v1, v7

    if-nez v2, :cond_b

    goto :goto_3

    :cond_b
    cmpg-float v2, v1, v16

    if-nez v2, :cond_c

    goto :goto_3

    :cond_c
    move v11, v1

    :goto_3
    return v11

    :pswitch_0
    iget-object v2, v0, Lh0/c;->b:Ljava/lang/Object;

    check-cast v2, Lh0/p;

    invoke-virtual {v2}, Lh0/p;->f()F

    move-result v3

    invoke-virtual {v2}, Lh0/p;->c()Lh0/h1;

    move-result-object v4

    iget-object v5, v0, Lh0/c;->c:Ll83/e;

    check-cast v5, Lkotlin/jvm/functions/Function1;

    iget-object v6, v0, Lh0/c;->d:Ljava/lang/Object;

    check-cast v6, Lg1/r0;

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-nez v7, :cond_17

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v7

    const/4 v8, 0x0

    cmpl-float v7, v7, v8

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-lez v7, :cond_d

    move v7, v10

    goto :goto_4

    :cond_d
    move v7, v9

    :goto_4
    if-eqz v7, :cond_e

    cmpl-float v8, v1, v8

    if-lez v8, :cond_e

    move v8, v10

    goto :goto_5

    :cond_e
    move v8, v9

    :goto_5
    if-nez v7, :cond_f

    check-cast v4, Lh0/x;

    invoke-virtual {v4, v3}, Lh0/x;->a(F)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_f
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-virtual {v6}, Lg1/r0;->invoke()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    cmpl-float v1, v1, v6

    if-ltz v1, :cond_10

    check-cast v4, Lh0/x;

    invoke-virtual {v4, v3, v8}, Lh0/x;->b(FZ)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_8

    :cond_10
    check-cast v4, Lh0/x;

    invoke-virtual {v4, v3, v9}, Lh0/x;->b(FZ)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4, v1}, Lh0/x;->e(Ljava/lang/Object;)F

    move-result v6

    invoke-virtual {v4, v3, v10}, Lh0/x;->b(FZ)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4, v7}, Lh0/x;->e(Ljava/lang/Object;)F

    move-result v4

    sub-float v11, v6, v4

    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    move-result v11

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    invoke-interface {v5, v11}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    if-eqz v8, :cond_11

    goto :goto_6

    :cond_11
    move v6, v4

    :goto_6
    sub-float/2addr v6, v3

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v4

    cmpl-float v4, v4, v5

    if-ltz v4, :cond_12

    move v9, v10

    :cond_12
    if-ne v9, v10, :cond_13

    if-eqz v8, :cond_15

    goto :goto_7

    :cond_13
    if-nez v9, :cond_16

    if-eqz v8, :cond_14

    goto :goto_8

    :cond_14
    :goto_7
    move-object v1, v7

    :cond_15
    :goto_8
    invoke-virtual {v2}, Lh0/p;->c()Lh0/h1;

    move-result-object v2

    check-cast v2, Lh0/x;

    invoke-virtual {v2, v1}, Lh0/x;->e(Ljava/lang/Object;)F

    move-result v1

    sub-float/2addr v1, v3

    return v1

    :cond_16
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_17
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "The offset provided to computeTarget must not be NaN."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(FF)F
    .locals 16

    move-object/from16 v0, p0

    iget v1, v0, Lh0/c;->a:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lh0/c;->b:Ljava/lang/Object;

    check-cast v1, Lq0/y;

    invoke-virtual {v1}, Lq0/y;->n()I

    move-result v2

    iget-object v3, v1, Lq0/y;->p:Lp1/k1;

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lq0/q;

    iget v4, v4, Lq0/q;->c:I

    add-int/2addr v4, v2

    const/4 v2, 0x0

    if-nez v4, :cond_0

    goto :goto_2

    :cond_0
    cmpg-float v2, p1, v2

    if-gez v2, :cond_1

    iget v2, v1, Lq0/y;->e:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget v2, v1, Lq0/y;->e:I

    :goto_0
    int-to-float v5, v4

    div-float v5, p2, v5

    float-to-int v5, v5

    add-int/2addr v5, v2

    invoke-virtual {v1}, Lq0/y;->m()I

    move-result v6

    const/4 v7, 0x0

    invoke-static {v5, v7, v6}, Le93/b;->n(III)I

    move-result v5

    iget-object v6, v0, Lh0/c;->d:Ljava/lang/Object;

    check-cast v6, Lq0/t;

    invoke-virtual {v1}, Lq0/y;->n()I

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lq0/q;

    iget v3, v3, Lq0/q;->c:I

    int-to-long v8, v2

    iget v3, v6, Lq0/t;->a:I

    int-to-long v10, v3

    sub-long v12, v8, v10

    const-wide/16 v14, 0x0

    cmp-long v3, v12, v14

    if-gez v3, :cond_2

    move-wide v12, v14

    :cond_2
    long-to-int v3, v12

    add-long/2addr v8, v10

    const-wide/32 v10, 0x7fffffff

    cmp-long v6, v8, v10

    if-lez v6, :cond_3

    move-wide v8, v10

    :cond_3
    long-to-int v6, v8

    invoke-static {v5, v3, v6}, Le93/b;->n(III)I

    move-result v3

    invoke-virtual {v1}, Lq0/y;->m()I

    move-result v1

    invoke-static {v3, v7, v1}, Le93/b;->n(III)I

    move-result v1

    sub-int/2addr v1, v2

    mul-int/2addr v1, v4

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    sub-int/2addr v1, v4

    if-gez v1, :cond_4

    goto :goto_1

    :cond_4
    move v7, v1

    :goto_1
    if-nez v7, :cond_5

    int-to-float v2, v7

    goto :goto_2

    :cond_5
    int-to-float v1, v7

    invoke-static/range {p1 .. p1}, Ljava/lang/Math;->signum(F)F

    move-result v2

    mul-float/2addr v2, v1

    :goto_2
    return v2

    :pswitch_0
    const/4 v1, 0x0

    return v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

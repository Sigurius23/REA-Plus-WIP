.class public final Lk4/h;
.super Lk4/c;
.source "SourceFile"


# direct methods
.method public constructor <init>(Le4/s;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lk4/c;-><init>(Le4/s;I)V

    return-void
.end method


# virtual methods
.method public final apply()V
    .locals 13

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lj4/g;->m0:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    iget-object v5, p0, Lj4/g;->k0:Le4/s;

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v5, v4}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object v4

    invoke-virtual {v4}, Lj4/b;->g()V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    move-object v4, v3

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x7

    if-eqz v6, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object v8

    const/4 v9, 0x6

    if-nez v4, :cond_5

    iget-object v4, p0, Lj4/b;->N:Ljava/lang/Object;

    if-eqz v4, :cond_1

    invoke-virtual {v8, v4}, Lj4/b;->o(Ljava/lang/Object;)V

    iget v4, p0, Lj4/b;->l:I

    invoke-virtual {v8, v4}, Lj4/b;->k(I)Lj4/b;

    move-result-object v4

    iget v10, p0, Lj4/b;->r:I

    invoke-virtual {v4, v10}, Lj4/b;->m(I)V

    goto :goto_2

    :cond_1
    iget-object v4, p0, Lj4/b;->O:Ljava/lang/Object;

    if-eqz v4, :cond_2

    iput v9, v8, Lj4/b;->j0:I

    iput-object v4, v8, Lj4/b;->O:Ljava/lang/Object;

    iget v4, p0, Lj4/b;->l:I

    invoke-virtual {v8, v4}, Lj4/b;->k(I)Lj4/b;

    move-result-object v4

    iget v10, p0, Lj4/b;->r:I

    invoke-virtual {v4, v10}, Lj4/b;->m(I)V

    goto :goto_2

    :cond_2
    iget-object v4, p0, Lj4/b;->J:Ljava/lang/Object;

    if-eqz v4, :cond_3

    invoke-virtual {v8, v4}, Lj4/b;->o(Ljava/lang/Object;)V

    iget v4, p0, Lj4/b;->j:I

    invoke-virtual {v8, v4}, Lj4/b;->k(I)Lj4/b;

    move-result-object v4

    iget v10, p0, Lj4/b;->p:I

    invoke-virtual {v4, v10}, Lj4/b;->m(I)V

    goto :goto_2

    :cond_3
    iget-object v4, p0, Lj4/b;->K:Ljava/lang/Object;

    if-eqz v4, :cond_4

    iput v9, v8, Lj4/b;->j0:I

    iput-object v4, v8, Lj4/b;->O:Ljava/lang/Object;

    iget v4, p0, Lj4/b;->j:I

    invoke-virtual {v8, v4}, Lj4/b;->k(I)Lj4/b;

    move-result-object v4

    iget v10, p0, Lj4/b;->p:I

    invoke-virtual {v4, v10}, Lj4/b;->m(I)V

    goto :goto_2

    :cond_4
    iget-object v4, v8, Lj4/b;->a:Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8, v1}, Lj4/b;->o(Ljava/lang/Object;)V

    invoke-virtual {p0, v4}, Lk4/c;->y(Ljava/lang/String;)F

    move-result v10

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-virtual {v8, v10}, Lj4/b;->l(Ljava/lang/Float;)Lj4/b;

    move-result-object v10

    invoke-virtual {p0, v4}, Lk4/c;->x(Ljava/lang/String;)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v10, v4}, Lj4/b;->n(Ljava/lang/Float;)V

    :goto_2
    move-object v4, v8

    :cond_5
    if-eqz v3, :cond_6

    iget-object v10, v3, Lj4/b;->a:Ljava/lang/Object;

    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    iget-object v11, v8, Lj4/b;->a:Ljava/lang/Object;

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v11

    iget-object v12, v8, Lj4/b;->a:Ljava/lang/Object;

    iput v7, v3, Lj4/b;->j0:I

    iput-object v12, v3, Lj4/b;->P:Ljava/lang/Object;

    invoke-virtual {p0, v10}, Lk4/c;->w(Ljava/lang/String;)F

    move-result v7

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-virtual {v3, v7}, Lj4/b;->l(Ljava/lang/Float;)Lj4/b;

    move-result-object v7

    invoke-virtual {p0, v10}, Lk4/c;->v(Ljava/lang/String;)F

    move-result v10

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-virtual {v7, v10}, Lj4/b;->n(Ljava/lang/Float;)V

    iget-object v3, v3, Lj4/b;->a:Ljava/lang/Object;

    iput v9, v8, Lj4/b;->j0:I

    iput-object v3, v8, Lj4/b;->O:Ljava/lang/Object;

    invoke-virtual {p0, v11}, Lk4/c;->y(Ljava/lang/String;)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v8, v3}, Lj4/b;->l(Ljava/lang/Float;)Lj4/b;

    move-result-object v3

    invoke-virtual {p0, v11}, Lk4/c;->x(Ljava/lang/String;)F

    move-result v7

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-virtual {v3, v7}, Lj4/b;->n(Ljava/lang/Float;)V

    :cond_6
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v6, p0, Lk4/c;->o0:Ljava/util/HashMap;

    invoke-virtual {v6, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    const/high16 v9, -0x40800000    # -1.0f

    if-eqz v7, :cond_7

    invoke-virtual {v6, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    goto :goto_3

    :cond_7
    move v3, v9

    :goto_3
    cmpl-float v6, v3, v9

    if-eqz v6, :cond_8

    iput v3, v8, Lj4/b;->f:F

    :cond_8
    move-object v3, v8

    goto/16 :goto_1

    :cond_9
    if-eqz v3, :cond_e

    iget-object v2, p0, Lj4/b;->P:Ljava/lang/Object;

    if-eqz v2, :cond_a

    iput v7, v3, Lj4/b;->j0:I

    iput-object v2, v3, Lj4/b;->P:Ljava/lang/Object;

    iget v1, p0, Lj4/b;->m:I

    invoke-virtual {v3, v1}, Lj4/b;->k(I)Lj4/b;

    move-result-object v1

    iget v2, p0, Lj4/b;->s:I

    invoke-virtual {v1, v2}, Lj4/b;->m(I)V

    goto :goto_4

    :cond_a
    iget-object v2, p0, Lj4/b;->Q:Ljava/lang/Object;

    if-eqz v2, :cond_b

    invoke-virtual {v3, v2}, Lj4/b;->i(Ljava/lang/Object;)V

    iget v1, p0, Lj4/b;->m:I

    invoke-virtual {v3, v1}, Lj4/b;->k(I)Lj4/b;

    move-result-object v1

    iget v2, p0, Lj4/b;->s:I

    invoke-virtual {v1, v2}, Lj4/b;->m(I)V

    goto :goto_4

    :cond_b
    iget-object v2, p0, Lj4/b;->L:Ljava/lang/Object;

    if-eqz v2, :cond_c

    iput v7, v3, Lj4/b;->j0:I

    iput-object v2, v3, Lj4/b;->P:Ljava/lang/Object;

    iget v1, p0, Lj4/b;->k:I

    invoke-virtual {v3, v1}, Lj4/b;->k(I)Lj4/b;

    move-result-object v1

    iget v2, p0, Lj4/b;->q:I

    invoke-virtual {v1, v2}, Lj4/b;->m(I)V

    goto :goto_4

    :cond_c
    iget-object v2, p0, Lj4/b;->M:Ljava/lang/Object;

    if-eqz v2, :cond_d

    invoke-virtual {v3, v2}, Lj4/b;->i(Ljava/lang/Object;)V

    iget v1, p0, Lj4/b;->k:I

    invoke-virtual {v3, v1}, Lj4/b;->k(I)Lj4/b;

    move-result-object v1

    iget v2, p0, Lj4/b;->q:I

    invoke-virtual {v1, v2}, Lj4/b;->m(I)V

    goto :goto_4

    :cond_d
    iget-object v2, v3, Lj4/b;->a:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v1}, Lj4/b;->i(Ljava/lang/Object;)V

    invoke-virtual {p0, v2}, Lk4/c;->w(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v3, v1}, Lj4/b;->l(Ljava/lang/Float;)Lj4/b;

    move-result-object v1

    invoke-virtual {p0, v2}, Lk4/c;->v(Ljava/lang/String;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v1, v2}, Lj4/b;->n(Ljava/lang/Float;)V

    :cond_e
    :goto_4
    if-nez v4, :cond_f

    goto :goto_5

    :cond_f
    iget v1, p0, Lk4/c;->n0:F

    const/high16 v2, 0x3f000000    # 0.5f

    cmpl-float v2, v1, v2

    if-eqz v2, :cond_10

    iput v1, v4, Lj4/b;->h:F

    :cond_10
    iget-object v1, p0, Lk4/c;->t0:Lj4/i;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_13

    const/4 v0, 0x1

    if-eq v1, v0, :cond_12

    const/4 v0, 0x2

    if-eq v1, v0, :cond_11

    :goto_5
    return-void

    :cond_11
    iput v0, v4, Lj4/b;->d:I

    return-void

    :cond_12
    iput v0, v4, Lj4/b;->d:I

    return-void

    :cond_13
    iput v0, v4, Lj4/b;->d:I

    return-void
.end method

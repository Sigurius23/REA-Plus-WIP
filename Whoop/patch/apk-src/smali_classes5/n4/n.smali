.class public final Ln4/n;
.super Ln4/p;
.source "SourceFile"


# instance fields
.field public final k:Ln4/g;

.field public l:Ln4/a;


# direct methods
.method public constructor <init>(Lm4/e;)V
    .locals 2

    invoke-direct {p0, p1}, Ln4/p;-><init>(Lm4/e;)V

    new-instance p1, Ln4/g;

    invoke-direct {p1, p0}, Ln4/g;-><init>(Ln4/p;)V

    iput-object p1, p0, Ln4/n;->k:Ln4/g;

    const/4 v0, 0x0

    iput-object v0, p0, Ln4/n;->l:Ln4/a;

    iget-object v0, p0, Ln4/p;->h:Ln4/g;

    const/4 v1, 0x6

    iput v1, v0, Ln4/g;->e:I

    iget-object v0, p0, Ln4/p;->i:Ln4/g;

    const/4 v1, 0x7

    iput v1, v0, Ln4/g;->e:I

    const/16 v0, 0x8

    iput v0, p1, Ln4/g;->e:I

    const/4 p1, 0x1

    iput p1, p0, Ln4/p;->f:I

    return-void
.end method


# virtual methods
.method public final a(Ln4/e;)V
    .locals 10

    iget p1, p0, Ln4/p;->j:I

    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    const/4 v0, 0x3

    const/4 v1, 0x1

    if-eq p1, v0, :cond_e

    iget-object p1, p0, Ln4/p;->e:Ln4/h;

    iget-boolean v2, p1, Ln4/g;->c:Z

    const/high16 v3, 0x3f000000    # 0.5f

    const/4 v4, 0x0

    if-eqz v2, :cond_5

    iget-boolean v2, p1, Ln4/g;->j:Z

    if-nez v2, :cond_5

    iget v2, p0, Ln4/p;->d:I

    if-ne v2, v0, :cond_5

    iget-object v2, p0, Ln4/p;->b:Lm4/e;

    iget v5, v2, Lm4/e;->t:I

    const/4 v6, 0x2

    if-eq v5, v6, :cond_4

    if-eq v5, v0, :cond_0

    goto :goto_3

    :cond_0
    iget-object v5, v2, Lm4/e;->d:Ln4/l;

    iget-object v5, v5, Ln4/p;->e:Ln4/h;

    iget-boolean v6, v5, Ln4/g;->j:Z

    if-eqz v6, :cond_5

    iget v6, v2, Lm4/e;->Y:I

    const/4 v7, -0x1

    if-eq v6, v7, :cond_3

    if-eqz v6, :cond_2

    if-eq v6, v1, :cond_1

    move v2, v4

    goto :goto_2

    :cond_1
    iget v5, v5, Ln4/g;->g:I

    int-to-float v5, v5

    iget v2, v2, Lm4/e;->X:F

    :goto_0
    div-float/2addr v5, v2

    :goto_1
    add-float/2addr v5, v3

    float-to-int v2, v5

    goto :goto_2

    :cond_2
    iget v5, v5, Ln4/g;->g:I

    int-to-float v5, v5

    iget v2, v2, Lm4/e;->X:F

    mul-float/2addr v5, v2

    goto :goto_1

    :cond_3
    iget v5, v5, Ln4/g;->g:I

    int-to-float v5, v5

    iget v2, v2, Lm4/e;->X:F

    goto :goto_0

    :goto_2
    invoke-virtual {p1, v2}, Ln4/h;->d(I)V

    goto :goto_3

    :cond_4
    iget-object v5, v2, Lm4/e;->U:Lm4/f;

    if-eqz v5, :cond_5

    iget-object v5, v5, Lm4/e;->e:Ln4/n;

    iget-object v5, v5, Ln4/p;->e:Ln4/h;

    iget-boolean v6, v5, Ln4/g;->j:Z

    if-eqz v6, :cond_5

    iget v2, v2, Lm4/e;->A:F

    iget v5, v5, Ln4/g;->g:I

    int-to-float v5, v5

    mul-float/2addr v5, v2

    add-float/2addr v5, v3

    float-to-int v2, v5

    invoke-virtual {p1, v2}, Ln4/h;->d(I)V

    :cond_5
    :goto_3
    iget-object v2, p0, Ln4/p;->h:Ln4/g;

    iget-boolean v5, v2, Ln4/g;->c:Z

    iget-object v6, v2, Ln4/g;->l:Ljava/util/ArrayList;

    if-eqz v5, :cond_d

    iget-object v5, p0, Ln4/p;->i:Ln4/g;

    iget-boolean v7, v5, Ln4/g;->c:Z

    iget-object v8, v5, Ln4/g;->l:Ljava/util/ArrayList;

    if-nez v7, :cond_6

    goto/16 :goto_6

    :cond_6
    iget-boolean v7, v2, Ln4/g;->j:Z

    if-eqz v7, :cond_7

    iget-boolean v7, v5, Ln4/g;->j:Z

    if-eqz v7, :cond_7

    iget-boolean v7, p1, Ln4/g;->j:Z

    if-eqz v7, :cond_7

    goto/16 :goto_6

    :cond_7
    iget-boolean v7, p1, Ln4/g;->j:Z

    if-nez v7, :cond_8

    iget v7, p0, Ln4/p;->d:I

    if-ne v7, v0, :cond_8

    iget-object v7, p0, Ln4/p;->b:Lm4/e;

    iget v9, v7, Lm4/e;->s:I

    if-nez v9, :cond_8

    invoke-virtual {v7}, Lm4/e;->z()Z

    move-result v7

    if-nez v7, :cond_8

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln4/g;

    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln4/g;

    iget v0, v0, Ln4/g;->g:I

    iget v3, v2, Ln4/g;->f:I

    add-int/2addr v0, v3

    iget v1, v1, Ln4/g;->g:I

    iget v3, v5, Ln4/g;->f:I

    add-int/2addr v1, v3

    sub-int v3, v1, v0

    invoke-virtual {v2, v0}, Ln4/g;->d(I)V

    invoke-virtual {v5, v1}, Ln4/g;->d(I)V

    invoke-virtual {p1, v3}, Ln4/h;->d(I)V

    return-void

    :cond_8
    iget-boolean v7, p1, Ln4/g;->j:Z

    if-nez v7, :cond_a

    iget v7, p0, Ln4/p;->d:I

    if-ne v7, v0, :cond_a

    iget v0, p0, Ln4/p;->a:I

    if-ne v0, v1, :cond_a

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_a

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_a

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln4/g;

    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln4/g;

    iget v0, v0, Ln4/g;->g:I

    iget v7, v2, Ln4/g;->f:I

    add-int/2addr v0, v7

    iget v1, v1, Ln4/g;->g:I

    iget v7, v5, Ln4/g;->f:I

    add-int/2addr v1, v7

    sub-int/2addr v1, v0

    iget v0, p1, Ln4/h;->m:I

    if-ge v1, v0, :cond_9

    invoke-virtual {p1, v1}, Ln4/h;->d(I)V

    goto :goto_4

    :cond_9
    invoke-virtual {p1, v0}, Ln4/h;->d(I)V

    :cond_a
    :goto_4
    iget-boolean v0, p1, Ln4/g;->j:Z

    if-nez v0, :cond_b

    goto :goto_6

    :cond_b
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_d

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_d

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln4/g;

    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln4/g;

    iget v4, v0, Ln4/g;->g:I

    iget v6, v2, Ln4/g;->f:I

    add-int/2addr v6, v4

    iget v7, v1, Ln4/g;->g:I

    iget v8, v5, Ln4/g;->f:I

    add-int/2addr v8, v7

    iget-object v9, p0, Ln4/p;->b:Lm4/e;

    iget v9, v9, Lm4/e;->f0:F

    if-ne v0, v1, :cond_c

    move v9, v3

    goto :goto_5

    :cond_c
    move v4, v6

    move v7, v8

    :goto_5
    sub-int/2addr v7, v4

    iget v0, p1, Ln4/g;->g:I

    sub-int/2addr v7, v0

    int-to-float v0, v4

    add-float/2addr v0, v3

    int-to-float v1, v7

    mul-float/2addr v1, v9

    add-float/2addr v1, v0

    float-to-int v0, v1

    invoke-virtual {v2, v0}, Ln4/g;->d(I)V

    iget v0, v2, Ln4/g;->g:I

    iget p1, p1, Ln4/g;->g:I

    add-int/2addr v0, p1

    invoke-virtual {v5, v0}, Ln4/g;->d(I)V

    :cond_d
    :goto_6
    return-void

    :cond_e
    iget-object p1, p0, Ln4/p;->b:Lm4/e;

    iget-object v0, p1, Lm4/e;->K:Lm4/d;

    iget-object p1, p1, Lm4/e;->M:Lm4/d;

    invoke-virtual {p0, v0, p1, v1}, Ln4/p;->l(Lm4/d;Lm4/d;I)V

    return-void
.end method

.method public final d()V
    .locals 15

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-boolean v1, v0, Lm4/e;->a:Z

    iget-object v2, p0, Ln4/p;->e:Ln4/h;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lm4/e;->l()I

    move-result v0

    invoke-virtual {v2, v0}, Ln4/h;->d(I)V

    :cond_0
    iget-boolean v0, v2, Ln4/g;->j:Z

    iget-object v1, v2, Ln4/g;->k:Ljava/util/ArrayList;

    iget-object v3, v2, Ln4/g;->l:Ljava/util/ArrayList;

    const/4 v4, 0x4

    const/4 v5, 0x1

    const/4 v6, 0x3

    iget-object v7, p0, Ln4/p;->i:Ln4/g;

    iget-object v8, p0, Ln4/p;->h:Ln4/g;

    if-nez v0, :cond_3

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-object v9, v0, Lm4/e;->q0:[I

    aget v9, v9, v5

    iput v9, p0, Ln4/p;->d:I

    iget-boolean v0, v0, Lm4/e;->F:Z

    if-eqz v0, :cond_1

    new-instance v0, Ln4/a;

    invoke-direct {v0, p0}, Ln4/h;-><init>(Ln4/p;)V

    iput-object v0, p0, Ln4/n;->l:Ln4/a;

    :cond_1
    iget v0, p0, Ln4/p;->d:I

    if-eq v0, v6, :cond_4

    if-ne v0, v4, :cond_2

    iget-object v9, p0, Ln4/p;->b:Lm4/e;

    iget-object v9, v9, Lm4/e;->U:Lm4/f;

    if-eqz v9, :cond_2

    iget-object v10, v9, Lm4/e;->q0:[I

    aget v10, v10, v5

    if-ne v10, v5, :cond_2

    invoke-virtual {v9}, Lm4/e;->l()I

    move-result v0

    iget-object v1, p0, Ln4/p;->b:Lm4/e;

    iget-object v1, v1, Lm4/e;->K:Lm4/d;

    invoke-virtual {v1}, Lm4/d;->e()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Ln4/p;->b:Lm4/e;

    iget-object v1, v1, Lm4/e;->M:Lm4/d;

    invoke-virtual {v1}, Lm4/d;->e()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, v9, Lm4/e;->e:Ln4/n;

    iget-object v1, v1, Ln4/p;->h:Ln4/g;

    iget-object v3, p0, Ln4/p;->b:Lm4/e;

    iget-object v3, v3, Lm4/e;->K:Lm4/d;

    invoke-virtual {v3}, Lm4/d;->e()I

    move-result v3

    invoke-static {v8, v1, v3}, Ln4/p;->b(Ln4/g;Ln4/g;I)V

    iget-object v1, v9, Lm4/e;->e:Ln4/n;

    iget-object v1, v1, Ln4/p;->i:Ln4/g;

    iget-object v3, p0, Ln4/p;->b:Lm4/e;

    iget-object v3, v3, Lm4/e;->M:Lm4/d;

    invoke-virtual {v3}, Lm4/d;->e()I

    move-result v3

    neg-int v3, v3

    invoke-static {v7, v1, v3}, Ln4/p;->b(Ln4/g;Ln4/g;I)V

    invoke-virtual {v2, v0}, Ln4/h;->d(I)V

    return-void

    :cond_2
    if-ne v0, v5, :cond_4

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    invoke-virtual {v0}, Lm4/e;->l()I

    move-result v0

    invoke-virtual {v2, v0}, Ln4/h;->d(I)V

    goto :goto_0

    :cond_3
    iget v0, p0, Ln4/p;->d:I

    if-ne v0, v4, :cond_4

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-object v9, v0, Lm4/e;->U:Lm4/f;

    if-eqz v9, :cond_4

    iget-object v10, v9, Lm4/e;->q0:[I

    aget v10, v10, v5

    if-ne v10, v5, :cond_4

    iget-object v1, v9, Lm4/e;->e:Ln4/n;

    iget-object v1, v1, Ln4/p;->h:Ln4/g;

    iget-object v0, v0, Lm4/e;->K:Lm4/d;

    invoke-virtual {v0}, Lm4/d;->e()I

    move-result v0

    invoke-static {v8, v1, v0}, Ln4/p;->b(Ln4/g;Ln4/g;I)V

    iget-object v0, v9, Lm4/e;->e:Ln4/n;

    iget-object v0, v0, Ln4/p;->i:Ln4/g;

    iget-object v1, p0, Ln4/p;->b:Lm4/e;

    iget-object v1, v1, Lm4/e;->M:Lm4/d;

    invoke-virtual {v1}, Lm4/d;->e()I

    move-result v1

    neg-int v1, v1

    invoke-static {v7, v0, v1}, Ln4/p;->b(Ln4/g;Ln4/g;I)V

    return-void

    :cond_4
    :goto_0
    iget-boolean v0, v2, Ln4/g;->j:Z

    const/4 v9, 0x0

    const/4 v10, 0x2

    iget-object v11, p0, Ln4/n;->k:Ln4/g;

    if-eqz v0, :cond_d

    iget-object v12, p0, Ln4/p;->b:Lm4/e;

    iget-boolean v13, v12, Lm4/e;->a:Z

    if-eqz v13, :cond_d

    iget-object v0, v12, Lm4/e;->R:[Lm4/d;

    aget-object v1, v0, v10

    iget-object v3, v1, Lm4/d;->f:Lm4/d;

    if-eqz v3, :cond_8

    aget-object v13, v0, v6

    iget-object v13, v13, Lm4/d;->f:Lm4/d;

    if-eqz v13, :cond_8

    invoke-virtual {v12}, Lm4/e;->z()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-object v0, v0, Lm4/e;->R:[Lm4/d;

    aget-object v0, v0, v10

    invoke-virtual {v0}, Lm4/d;->e()I

    move-result v0

    iput v0, v8, Ln4/g;->f:I

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-object v0, v0, Lm4/e;->R:[Lm4/d;

    aget-object v0, v0, v6

    invoke-virtual {v0}, Lm4/d;->e()I

    move-result v0

    neg-int v0, v0

    iput v0, v7, Ln4/g;->f:I

    goto :goto_1

    :cond_5
    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-object v0, v0, Lm4/e;->R:[Lm4/d;

    aget-object v0, v0, v10

    invoke-static {v0}, Ln4/p;->h(Lm4/d;)Ln4/g;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v1, p0, Ln4/p;->b:Lm4/e;

    iget-object v1, v1, Lm4/e;->R:[Lm4/d;

    aget-object v1, v1, v10

    invoke-virtual {v1}, Lm4/d;->e()I

    move-result v1

    invoke-static {v8, v0, v1}, Ln4/p;->b(Ln4/g;Ln4/g;I)V

    :cond_6
    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-object v0, v0, Lm4/e;->R:[Lm4/d;

    aget-object v0, v0, v6

    invoke-static {v0}, Ln4/p;->h(Lm4/d;)Ln4/g;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v1, p0, Ln4/p;->b:Lm4/e;

    iget-object v1, v1, Lm4/e;->R:[Lm4/d;

    aget-object v1, v1, v6

    invoke-virtual {v1}, Lm4/d;->e()I

    move-result v1

    neg-int v1, v1

    invoke-static {v7, v0, v1}, Ln4/p;->b(Ln4/g;Ln4/g;I)V

    :cond_7
    iput-boolean v5, v8, Ln4/g;->b:Z

    iput-boolean v5, v7, Ln4/g;->b:Z

    :goto_1
    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-boolean v1, v0, Lm4/e;->F:Z

    if-eqz v1, :cond_1e

    iget v0, v0, Lm4/e;->b0:I

    invoke-static {v11, v8, v0}, Ln4/p;->b(Ln4/g;Ln4/g;I)V

    return-void

    :cond_8
    if-eqz v3, :cond_9

    invoke-static {v1}, Ln4/p;->h(Lm4/d;)Ln4/g;

    move-result-object v0

    if-eqz v0, :cond_1e

    iget-object v1, p0, Ln4/p;->b:Lm4/e;

    iget-object v1, v1, Lm4/e;->R:[Lm4/d;

    aget-object v1, v1, v10

    invoke-virtual {v1}, Lm4/d;->e()I

    move-result v1

    invoke-static {v8, v0, v1}, Ln4/p;->b(Ln4/g;Ln4/g;I)V

    iget v0, v2, Ln4/g;->g:I

    invoke-static {v7, v8, v0}, Ln4/p;->b(Ln4/g;Ln4/g;I)V

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-boolean v1, v0, Lm4/e;->F:Z

    if-eqz v1, :cond_1e

    iget v0, v0, Lm4/e;->b0:I

    invoke-static {v11, v8, v0}, Ln4/p;->b(Ln4/g;Ln4/g;I)V

    return-void

    :cond_9
    aget-object v1, v0, v6

    iget-object v3, v1, Lm4/d;->f:Lm4/d;

    if-eqz v3, :cond_b

    invoke-static {v1}, Ln4/p;->h(Lm4/d;)Ln4/g;

    move-result-object v0

    if-eqz v0, :cond_a

    iget-object v1, p0, Ln4/p;->b:Lm4/e;

    iget-object v1, v1, Lm4/e;->R:[Lm4/d;

    aget-object v1, v1, v6

    invoke-virtual {v1}, Lm4/d;->e()I

    move-result v1

    neg-int v1, v1

    invoke-static {v7, v0, v1}, Ln4/p;->b(Ln4/g;Ln4/g;I)V

    iget v0, v2, Ln4/g;->g:I

    neg-int v0, v0

    invoke-static {v8, v7, v0}, Ln4/p;->b(Ln4/g;Ln4/g;I)V

    :cond_a
    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-boolean v1, v0, Lm4/e;->F:Z

    if-eqz v1, :cond_1e

    iget v0, v0, Lm4/e;->b0:I

    invoke-static {v11, v8, v0}, Ln4/p;->b(Ln4/g;Ln4/g;I)V

    return-void

    :cond_b
    aget-object v0, v0, v4

    iget-object v1, v0, Lm4/d;->f:Lm4/d;

    if-eqz v1, :cond_c

    invoke-static {v0}, Ln4/p;->h(Lm4/d;)Ln4/g;

    move-result-object v0

    if-eqz v0, :cond_1e

    invoke-static {v11, v0, v9}, Ln4/p;->b(Ln4/g;Ln4/g;I)V

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget v0, v0, Lm4/e;->b0:I

    neg-int v0, v0

    invoke-static {v8, v11, v0}, Ln4/p;->b(Ln4/g;Ln4/g;I)V

    iget v0, v2, Ln4/g;->g:I

    invoke-static {v7, v8, v0}, Ln4/p;->b(Ln4/g;Ln4/g;I)V

    return-void

    :cond_c
    instance-of v0, v12, Lm4/j;

    if-nez v0, :cond_1e

    iget-object v0, v12, Lm4/e;->U:Lm4/f;

    if-eqz v0, :cond_1e

    const/4 v0, 0x7

    invoke-virtual {v12, v0}, Lm4/e;->j(I)Lm4/d;

    move-result-object v0

    iget-object v0, v0, Lm4/d;->f:Lm4/d;

    if-nez v0, :cond_1e

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-object v1, v0, Lm4/e;->U:Lm4/f;

    iget-object v1, v1, Lm4/e;->e:Ln4/n;

    iget-object v1, v1, Ln4/p;->h:Ln4/g;

    invoke-virtual {v0}, Lm4/e;->t()I

    move-result v0

    invoke-static {v8, v1, v0}, Ln4/p;->b(Ln4/g;Ln4/g;I)V

    iget v0, v2, Ln4/g;->g:I

    invoke-static {v7, v8, v0}, Ln4/p;->b(Ln4/g;Ln4/g;I)V

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-boolean v1, v0, Lm4/e;->F:Z

    if-eqz v1, :cond_1e

    iget v0, v0, Lm4/e;->b0:I

    invoke-static {v11, v8, v0}, Ln4/p;->b(Ln4/g;Ln4/g;I)V

    return-void

    :cond_d
    if-nez v0, :cond_12

    iget v0, p0, Ln4/p;->d:I

    if-ne v0, v6, :cond_12

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget v12, v0, Lm4/e;->t:I

    if-eq v12, v10, :cond_10

    if-eq v12, v6, :cond_e

    goto :goto_2

    :cond_e
    invoke-virtual {v0}, Lm4/e;->z()Z

    move-result v0

    if-nez v0, :cond_13

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget v12, v0, Lm4/e;->s:I

    if-ne v12, v6, :cond_f

    goto :goto_2

    :cond_f
    iget-object v0, v0, Lm4/e;->d:Ln4/l;

    iget-object v0, v0, Ln4/p;->e:Ln4/h;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v0, Ln4/g;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-boolean v5, v2, Ln4/g;->b:Z

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_10
    iget-object v0, v0, Lm4/e;->U:Lm4/f;

    if-nez v0, :cond_11

    goto :goto_2

    :cond_11
    iget-object v0, v0, Lm4/e;->e:Ln4/n;

    iget-object v0, v0, Ln4/p;->e:Ln4/h;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v0, Ln4/g;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-boolean v5, v2, Ln4/g;->b:Z

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_12
    invoke-virtual {v2, p0}, Ln4/g;->b(Ln4/p;)V

    :cond_13
    :goto_2
    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-object v1, v0, Lm4/e;->R:[Lm4/d;

    aget-object v12, v1, v10

    iget-object v13, v12, Lm4/d;->f:Lm4/d;

    if-eqz v13, :cond_17

    aget-object v14, v1, v6

    iget-object v14, v14, Lm4/d;->f:Lm4/d;

    if-eqz v14, :cond_17

    invoke-virtual {v0}, Lm4/e;->z()Z

    move-result v0

    if-eqz v0, :cond_14

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-object v0, v0, Lm4/e;->R:[Lm4/d;

    aget-object v0, v0, v10

    invoke-virtual {v0}, Lm4/d;->e()I

    move-result v0

    iput v0, v8, Ln4/g;->f:I

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-object v0, v0, Lm4/e;->R:[Lm4/d;

    aget-object v0, v0, v6

    invoke-virtual {v0}, Lm4/d;->e()I

    move-result v0

    neg-int v0, v0

    iput v0, v7, Ln4/g;->f:I

    goto :goto_3

    :cond_14
    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-object v0, v0, Lm4/e;->R:[Lm4/d;

    aget-object v0, v0, v10

    invoke-static {v0}, Ln4/p;->h(Lm4/d;)Ln4/g;

    move-result-object v0

    iget-object v1, p0, Ln4/p;->b:Lm4/e;

    iget-object v1, v1, Lm4/e;->R:[Lm4/d;

    aget-object v1, v1, v6

    invoke-static {v1}, Ln4/p;->h(Lm4/d;)Ln4/g;

    move-result-object v1

    if-eqz v0, :cond_15

    invoke-virtual {v0, p0}, Ln4/g;->b(Ln4/p;)V

    :cond_15
    if-eqz v1, :cond_16

    invoke-virtual {v1, p0}, Ln4/g;->b(Ln4/p;)V

    :cond_16
    iput v4, p0, Ln4/p;->j:I

    :goto_3
    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-boolean v0, v0, Lm4/e;->F:Z

    if-eqz v0, :cond_1d

    iget-object v0, p0, Ln4/n;->l:Ln4/a;

    invoke-virtual {p0, v11, v8, v5, v0}, Ln4/p;->c(Ln4/g;Ln4/g;ILn4/h;)V

    goto/16 :goto_4

    :cond_17
    const/4 v14, 0x0

    if-eqz v13, :cond_19

    invoke-static {v12}, Ln4/p;->h(Lm4/d;)Ln4/g;

    move-result-object v0

    if-eqz v0, :cond_1d

    iget-object v1, p0, Ln4/p;->b:Lm4/e;

    iget-object v1, v1, Lm4/e;->R:[Lm4/d;

    aget-object v1, v1, v10

    invoke-virtual {v1}, Lm4/d;->e()I

    move-result v1

    invoke-static {v8, v0, v1}, Ln4/p;->b(Ln4/g;Ln4/g;I)V

    invoke-virtual {p0, v7, v8, v5, v2}, Ln4/p;->c(Ln4/g;Ln4/g;ILn4/h;)V

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-boolean v0, v0, Lm4/e;->F:Z

    if-eqz v0, :cond_18

    iget-object v0, p0, Ln4/n;->l:Ln4/a;

    invoke-virtual {p0, v11, v8, v5, v0}, Ln4/p;->c(Ln4/g;Ln4/g;ILn4/h;)V

    :cond_18
    iget v0, p0, Ln4/p;->d:I

    if-ne v0, v6, :cond_1d

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget v1, v0, Lm4/e;->X:F

    cmpl-float v1, v1, v14

    if-lez v1, :cond_1d

    iget-object v0, v0, Lm4/e;->d:Ln4/l;

    iget v1, v0, Ln4/p;->d:I

    if-ne v1, v6, :cond_1d

    iget-object v0, v0, Ln4/p;->e:Ln4/h;

    iget-object v0, v0, Ln4/g;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-object v0, v0, Lm4/e;->d:Ln4/l;

    iget-object v0, v0, Ln4/p;->e:Ln4/h;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object p0, v2, Ln4/g;->a:Ln4/p;

    goto/16 :goto_4

    :cond_19
    aget-object v10, v1, v6

    iget-object v12, v10, Lm4/d;->f:Lm4/d;

    const/4 v13, -0x1

    if-eqz v12, :cond_1a

    invoke-static {v10}, Ln4/p;->h(Lm4/d;)Ln4/g;

    move-result-object v0

    if-eqz v0, :cond_1d

    iget-object v1, p0, Ln4/p;->b:Lm4/e;

    iget-object v1, v1, Lm4/e;->R:[Lm4/d;

    aget-object v1, v1, v6

    invoke-virtual {v1}, Lm4/d;->e()I

    move-result v1

    neg-int v1, v1

    invoke-static {v7, v0, v1}, Ln4/p;->b(Ln4/g;Ln4/g;I)V

    invoke-virtual {p0, v8, v7, v13, v2}, Ln4/p;->c(Ln4/g;Ln4/g;ILn4/h;)V

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-boolean v0, v0, Lm4/e;->F:Z

    if-eqz v0, :cond_1d

    iget-object v0, p0, Ln4/n;->l:Ln4/a;

    invoke-virtual {p0, v11, v8, v5, v0}, Ln4/p;->c(Ln4/g;Ln4/g;ILn4/h;)V

    goto :goto_4

    :cond_1a
    aget-object v1, v1, v4

    iget-object v4, v1, Lm4/d;->f:Lm4/d;

    if-eqz v4, :cond_1b

    invoke-static {v1}, Ln4/p;->h(Lm4/d;)Ln4/g;

    move-result-object v0

    if-eqz v0, :cond_1d

    invoke-static {v11, v0, v9}, Ln4/p;->b(Ln4/g;Ln4/g;I)V

    iget-object v0, p0, Ln4/n;->l:Ln4/a;

    invoke-virtual {p0, v8, v11, v13, v0}, Ln4/p;->c(Ln4/g;Ln4/g;ILn4/h;)V

    invoke-virtual {p0, v7, v8, v5, v2}, Ln4/p;->c(Ln4/g;Ln4/g;ILn4/h;)V

    goto :goto_4

    :cond_1b
    instance-of v1, v0, Lm4/j;

    if-nez v1, :cond_1d

    iget-object v1, v0, Lm4/e;->U:Lm4/f;

    if-eqz v1, :cond_1d

    iget-object v1, v1, Lm4/e;->e:Ln4/n;

    iget-object v1, v1, Ln4/p;->h:Ln4/g;

    invoke-virtual {v0}, Lm4/e;->t()I

    move-result v0

    invoke-static {v8, v1, v0}, Ln4/p;->b(Ln4/g;Ln4/g;I)V

    invoke-virtual {p0, v7, v8, v5, v2}, Ln4/p;->c(Ln4/g;Ln4/g;ILn4/h;)V

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-boolean v0, v0, Lm4/e;->F:Z

    if-eqz v0, :cond_1c

    iget-object v0, p0, Ln4/n;->l:Ln4/a;

    invoke-virtual {p0, v11, v8, v5, v0}, Ln4/p;->c(Ln4/g;Ln4/g;ILn4/h;)V

    :cond_1c
    iget v0, p0, Ln4/p;->d:I

    if-ne v0, v6, :cond_1d

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget v1, v0, Lm4/e;->X:F

    cmpl-float v1, v1, v14

    if-lez v1, :cond_1d

    iget-object v0, v0, Lm4/e;->d:Ln4/l;

    iget v1, v0, Ln4/p;->d:I

    if-ne v1, v6, :cond_1d

    iget-object v0, v0, Ln4/p;->e:Ln4/h;

    iget-object v0, v0, Ln4/g;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-object v0, v0, Lm4/e;->d:Ln4/l;

    iget-object v0, v0, Ln4/p;->e:Ln4/h;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object p0, v2, Ln4/g;->a:Ln4/p;

    :cond_1d
    :goto_4
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1e

    iput-boolean v5, v2, Ln4/g;->c:Z

    :cond_1e
    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Ln4/p;->h:Ln4/g;

    iget-boolean v1, v0, Ln4/g;->j:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Ln4/p;->b:Lm4/e;

    iget v0, v0, Ln4/g;->g:I

    iput v0, v1, Lm4/e;->a0:I

    :cond_0
    return-void
.end method

.method public final f()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Ln4/p;->c:Ln4/m;

    iget-object v0, p0, Ln4/p;->h:Ln4/g;

    invoke-virtual {v0}, Ln4/g;->c()V

    iget-object v0, p0, Ln4/p;->i:Ln4/g;

    invoke-virtual {v0}, Ln4/g;->c()V

    iget-object v0, p0, Ln4/n;->k:Ln4/g;

    invoke-virtual {v0}, Ln4/g;->c()V

    iget-object v0, p0, Ln4/p;->e:Ln4/h;

    invoke-virtual {v0}, Ln4/g;->c()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ln4/p;->g:Z

    return-void
.end method

.method public final k()Z
    .locals 2

    iget v0, p0, Ln4/p;->d:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget v0, v0, Lm4/e;->t:I

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final m()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Ln4/p;->g:Z

    iget-object v1, p0, Ln4/p;->h:Ln4/g;

    invoke-virtual {v1}, Ln4/g;->c()V

    iput-boolean v0, v1, Ln4/g;->j:Z

    iget-object v1, p0, Ln4/p;->i:Ln4/g;

    invoke-virtual {v1}, Ln4/g;->c()V

    iput-boolean v0, v1, Ln4/g;->j:Z

    iget-object v1, p0, Ln4/n;->k:Ln4/g;

    invoke-virtual {v1}, Ln4/g;->c()V

    iput-boolean v0, v1, Ln4/g;->j:Z

    iget-object v1, p0, Ln4/p;->e:Ln4/h;

    iput-boolean v0, v1, Ln4/g;->j:Z

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "VerticalRun "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ln4/p;->b:Lm4/e;

    iget-object v1, v1, Lm4/e;->i0:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

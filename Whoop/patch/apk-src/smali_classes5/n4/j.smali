.class public final Ln4/j;
.super Ln4/p;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lm4/i;)V
    .locals 1

    invoke-direct {p0, p1}, Ln4/p;-><init>(Lm4/e;)V

    iget-object v0, p1, Lm4/e;->d:Ln4/l;

    invoke-virtual {v0}, Ln4/l;->f()V

    iget-object v0, p1, Lm4/e;->e:Ln4/n;

    invoke-virtual {v0}, Ln4/n;->f()V

    iget p1, p1, Lm4/i;->v0:I

    iput p1, p0, Ln4/p;->f:I

    return-void
.end method


# virtual methods
.method public final a(Ln4/e;)V
    .locals 2

    iget-object p1, p0, Ln4/p;->h:Ln4/g;

    iget-boolean v0, p1, Ln4/g;->c:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p1, Ln4/g;->j:Z

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object v0, p1, Ln4/g;->l:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln4/g;

    iget-object v1, p0, Ln4/p;->b:Lm4/e;

    check-cast v1, Lm4/i;

    iget v0, v0, Ln4/g;->g:I

    int-to-float v0, v0

    iget v1, v1, Lm4/i;->r0:F

    mul-float/2addr v0, v1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    invoke-virtual {p1, v0}, Ln4/g;->d(I)V

    return-void
.end method

.method public final d()V
    .locals 7

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    move-object v1, v0

    check-cast v1, Lm4/i;

    iget v2, v1, Lm4/i;->s0:I

    iget v3, v1, Lm4/i;->t0:I

    iget v1, v1, Lm4/i;->v0:I

    const/4 v4, -0x1

    iget-object v5, p0, Ln4/p;->h:Ln4/g;

    const/4 v6, 0x1

    if-ne v1, v6, :cond_2

    if-eq v2, v4, :cond_0

    iget-object v1, v5, Ln4/g;->l:Ljava/util/ArrayList;

    iget-object v0, v0, Lm4/e;->U:Lm4/f;

    iget-object v0, v0, Lm4/e;->d:Ln4/l;

    iget-object v0, v0, Ln4/p;->h:Ln4/g;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-object v0, v0, Lm4/e;->U:Lm4/f;

    iget-object v0, v0, Lm4/e;->d:Ln4/l;

    iget-object v0, v0, Ln4/p;->h:Ln4/g;

    iget-object v0, v0, Ln4/g;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput v2, v5, Ln4/g;->f:I

    goto :goto_0

    :cond_0
    if-eq v3, v4, :cond_1

    iget-object v1, v5, Ln4/g;->l:Ljava/util/ArrayList;

    iget-object v0, v0, Lm4/e;->U:Lm4/f;

    iget-object v0, v0, Lm4/e;->d:Ln4/l;

    iget-object v0, v0, Ln4/p;->i:Ln4/g;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-object v0, v0, Lm4/e;->U:Lm4/f;

    iget-object v0, v0, Lm4/e;->d:Ln4/l;

    iget-object v0, v0, Ln4/p;->i:Ln4/g;

    iget-object v0, v0, Ln4/g;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-int v0, v3

    iput v0, v5, Ln4/g;->f:I

    goto :goto_0

    :cond_1
    iput-boolean v6, v5, Ln4/g;->b:Z

    iget-object v1, v5, Ln4/g;->l:Ljava/util/ArrayList;

    iget-object v0, v0, Lm4/e;->U:Lm4/f;

    iget-object v0, v0, Lm4/e;->d:Ln4/l;

    iget-object v0, v0, Ln4/p;->i:Ln4/g;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-object v0, v0, Lm4/e;->U:Lm4/f;

    iget-object v0, v0, Lm4/e;->d:Ln4/l;

    iget-object v0, v0, Ln4/p;->i:Ln4/g;

    iget-object v0, v0, Ln4/g;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-object v0, v0, Lm4/e;->d:Ln4/l;

    iget-object v0, v0, Ln4/p;->h:Ln4/g;

    invoke-virtual {p0, v0}, Ln4/j;->m(Ln4/g;)V

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-object v0, v0, Lm4/e;->d:Ln4/l;

    iget-object v0, v0, Ln4/p;->i:Ln4/g;

    invoke-virtual {p0, v0}, Ln4/j;->m(Ln4/g;)V

    return-void

    :cond_2
    if-eq v2, v4, :cond_3

    iget-object v1, v5, Ln4/g;->l:Ljava/util/ArrayList;

    iget-object v0, v0, Lm4/e;->U:Lm4/f;

    iget-object v0, v0, Lm4/e;->e:Ln4/n;

    iget-object v0, v0, Ln4/p;->h:Ln4/g;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-object v0, v0, Lm4/e;->U:Lm4/f;

    iget-object v0, v0, Lm4/e;->e:Ln4/n;

    iget-object v0, v0, Ln4/p;->h:Ln4/g;

    iget-object v0, v0, Ln4/g;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput v2, v5, Ln4/g;->f:I

    goto :goto_1

    :cond_3
    if-eq v3, v4, :cond_4

    iget-object v1, v5, Ln4/g;->l:Ljava/util/ArrayList;

    iget-object v0, v0, Lm4/e;->U:Lm4/f;

    iget-object v0, v0, Lm4/e;->e:Ln4/n;

    iget-object v0, v0, Ln4/p;->i:Ln4/g;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-object v0, v0, Lm4/e;->U:Lm4/f;

    iget-object v0, v0, Lm4/e;->e:Ln4/n;

    iget-object v0, v0, Ln4/p;->i:Ln4/g;

    iget-object v0, v0, Ln4/g;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-int v0, v3

    iput v0, v5, Ln4/g;->f:I

    goto :goto_1

    :cond_4
    iput-boolean v6, v5, Ln4/g;->b:Z

    iget-object v1, v5, Ln4/g;->l:Ljava/util/ArrayList;

    iget-object v0, v0, Lm4/e;->U:Lm4/f;

    iget-object v0, v0, Lm4/e;->e:Ln4/n;

    iget-object v0, v0, Ln4/p;->i:Ln4/g;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-object v0, v0, Lm4/e;->U:Lm4/f;

    iget-object v0, v0, Lm4/e;->e:Ln4/n;

    iget-object v0, v0, Ln4/p;->i:Ln4/g;

    iget-object v0, v0, Ln4/g;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-object v0, v0, Lm4/e;->e:Ln4/n;

    iget-object v0, v0, Ln4/p;->h:Ln4/g;

    invoke-virtual {p0, v0}, Ln4/j;->m(Ln4/g;)V

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    iget-object v0, v0, Lm4/e;->e:Ln4/n;

    iget-object v0, v0, Ln4/p;->i:Ln4/g;

    invoke-virtual {p0, v0}, Ln4/j;->m(Ln4/g;)V

    return-void
.end method

.method public final e()V
    .locals 4

    iget-object v0, p0, Ln4/p;->b:Lm4/e;

    move-object v1, v0

    check-cast v1, Lm4/i;

    iget v1, v1, Lm4/i;->v0:I

    const/4 v2, 0x1

    iget-object v3, p0, Ln4/p;->h:Ln4/g;

    if-ne v1, v2, :cond_0

    iget v1, v3, Ln4/g;->g:I

    iput v1, v0, Lm4/e;->Z:I

    return-void

    :cond_0
    iget v1, v3, Ln4/g;->g:I

    iput v1, v0, Lm4/e;->a0:I

    return-void
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Ln4/p;->h:Ln4/g;

    invoke-virtual {v0}, Ln4/g;->c()V

    return-void
.end method

.method public final k()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final m(Ln4/g;)V
    .locals 2

    iget-object v0, p0, Ln4/p;->h:Ln4/g;

    iget-object v1, v0, Ln4/g;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p1, Ln4/g;->l:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

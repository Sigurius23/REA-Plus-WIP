.class public final Lh/k;
.super Lg/t;
.source "SourceFile"


# instance fields
.field public d:Lbc3/c0;

.field public e:Lc93/m;

.field public f:Lf1/p1;

.field public g:Z


# virtual methods
.method public final c()V
    .locals 1

    invoke-super {p0}, Lg/t;->c()V

    iget-object v0, p0, Lh/k;->f:Lf1/p1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf1/p1;->d()V

    :cond_0
    iget-object v0, p0, Lh/k;->f:Lf1/p1;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lf1/p1;->v()V

    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lh/k;->g:Z

    return-void
.end method

.method public final d()V
    .locals 4

    iget-object v0, p0, Lh/k;->f:Lf1/p1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf1/p1;->p()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lf1/p1;->d()V

    const/4 v0, 0x0

    iput-object v0, p0, Lh/k;->f:Lf1/p1;

    :cond_0
    iget-object v0, p0, Lh/k;->f:Lf1/p1;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    new-instance v0, Lf1/p1;

    iget-object v2, p0, Lh/k;->d:Lbc3/c0;

    iget-object v3, p0, Lh/k;->e:Lc93/m;

    invoke-direct {v0, v2, v1, v3, p0}, Lf1/p1;-><init>(Lbc3/c0;ZLc93/m;Lh/k;)V

    iput-object v0, p0, Lh/k;->f:Lf1/p1;

    :cond_1
    iget-object v0, p0, Lh/k;->f:Lf1/p1;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lf1/p1;->h()V

    :cond_2
    iget-object v0, p0, Lh/k;->f:Lf1/p1;

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Lf1/p1;->v()V

    :goto_0
    iput-boolean v1, p0, Lh/k;->g:Z

    return-void
.end method

.method public final e(Lg/a;)V
    .locals 1

    invoke-super {p0, p1}, Lg/t;->e(Lg/a;)V

    iget-object v0, p0, Lh/k;->f:Lf1/p1;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lf1/p1;->t(Lg/a;)V

    :cond_0
    return-void
.end method

.method public final f(Lg/a;)V
    .locals 3

    invoke-super {p0, p1}, Lg/t;->f(Lg/a;)V

    iget-object p1, p0, Lh/k;->f:Lf1/p1;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lf1/p1;->d()V

    :cond_0
    invoke-virtual {p0}, Lg/t;->g()Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    new-instance p1, Lf1/p1;

    iget-object v1, p0, Lh/k;->d:Lbc3/c0;

    iget-object v2, p0, Lh/k;->e:Lc93/m;

    invoke-direct {p1, v1, v0, v2, p0}, Lf1/p1;-><init>(Lbc3/c0;ZLc93/m;Lh/k;)V

    iput-object p1, p0, Lh/k;->f:Lf1/p1;

    :cond_1
    iput-boolean v0, p0, Lh/k;->g:Z

    return-void
.end method

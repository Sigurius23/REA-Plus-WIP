.class public abstract Leb/i1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Leb/t;

.field public b:Z


# virtual methods
.method public abstract a()Leb/n0;
.end method

.method public final b()Leb/t;
    .locals 2

    iget-object v0, p0, Leb/i1;->a:Leb/t;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot access the Navigator\'s state until the Navigator is attached"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c(Leb/n0;Landroid/os/Bundle;Leb/x0;)Leb/n0;
    .locals 0

    return-object p1
.end method

.method public d(Ljava/util/List;Leb/x0;)V
    .locals 2

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object p1

    new-instance v0, Lb2/z;

    const/16 v1, 0x8

    invoke-direct {v0, v1, p0, p2}, Lb2/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, v0}, Lxb3/k;->A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;

    move-result-object p1

    new-instance p2, Lvb1/a;

    const/16 v0, 0x10

    invoke-direct {p2, v0}, Lvb1/a;-><init>(I)V

    new-instance v0, Lxb3/f;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, p2}, Lxb3/f;-><init>(Lxb3/i;ZLkotlin/jvm/functions/Function1;)V

    new-instance p1, Lxb3/e;

    invoke-direct {p1, v0}, Lxb3/e;-><init>(Lxb3/f;)V

    :goto_0
    invoke-virtual {p1}, Lxb3/e;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lxb3/e;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Leb/q;

    invoke-virtual {p0}, Leb/i1;->b()Leb/t;

    move-result-object v0

    invoke-virtual {v0, p2}, Leb/t;->h(Leb/q;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public e(Leb/t;)V
    .locals 0

    iput-object p1, p0, Leb/i1;->a:Leb/t;

    const/4 p1, 0x1

    iput-boolean p1, p0, Leb/i1;->b:Z

    return-void
.end method

.method public f(Leb/q;)V
    .locals 3

    iget-object v0, p1, Leb/q;->x:Leb/n0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    return-void

    :cond_1
    sget-object v2, Leb/v;->H:Leb/v;

    invoke-static {v2}, Lse/h;->P(Lkotlin/jvm/functions/Function1;)Leb/x0;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Leb/i1;->c(Leb/n0;Landroid/os/Bundle;Leb/x0;)Leb/n0;

    invoke-virtual {p0}, Leb/i1;->b()Leb/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Leb/t;->c(Leb/q;)V

    return-void
.end method

.method public g(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public h()Landroid/os/Bundle;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public i(Leb/q;Z)V
    .locals 3

    const-string v0, "popUpTo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Leb/i1;->b()Leb/t;

    move-result-object v0

    iget-object v0, v0, Leb/t;->e:Lec3/r1;

    iget-object v0, v0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v1

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {p0}, Leb/i1;->j()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/q;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {p0}, Leb/i1;->b()Leb/t;

    move-result-object p1

    invoke-virtual {p1, v0, p2}, Leb/t;->d(Leb/q;Z)V

    :cond_2
    return-void

    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "popBackStack was called with "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " which does not exist in back stack "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public j()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

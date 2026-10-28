.class public final Lp93/b;
.super Llb3/b;
.source "SourceFile"


# instance fields
.field public final synthetic y:Lp93/c;


# direct methods
.method public constructor <init>(Lp93/c;)V
    .locals 0

    iput-object p1, p0, Lp93/b;->y:Lp93/c;

    iget-object p1, p1, Lp93/c;->E:Lkb3/k;

    invoke-direct {p0, p1}, Llb3/b;-><init>(Lkb3/n;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Collection;
    .locals 10

    iget-object v0, p0, Lp93/b;->y:Lp93/c;

    iget v1, v0, Lp93/c;->H:I

    iget-object v2, v0, Lp93/c;->G:Lp93/k;

    sget-object v3, Lp93/g;->c:Lp93/g;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v1, Lp93/c;->L:Lva3/c;

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_0
    sget-object v4, Lp93/h;->c:Lp93/h;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v2, Lp93/c;->M:Lva3/c;

    new-instance v4, Lva3/c;

    sget-object v5, Lo93/n;->k:Lva3/e;

    invoke-virtual {v3, v1}, Lp93/k;->a(I)Lva3/h;

    move-result-object v1

    invoke-direct {v4, v5, v1}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    filled-new-array {v2, v4}, [Lva3/c;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_1
    sget-object v3, Lp93/j;->c:Lp93/j;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object v1, Lp93/c;->L:Lva3/c;

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_2
    sget-object v4, Lp93/i;->c:Lp93/i;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    sget-object v2, Lp93/c;->M:Lva3/c;

    new-instance v4, Lva3/c;

    sget-object v5, Lo93/n;->f:Lva3/e;

    invoke-virtual {v3, v1}, Lp93/k;->a(I)Lva3/h;

    move-result-object v1

    invoke-direct {v4, v5, v1}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    filled-new-array {v2, v4}, [Lva3/c;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    :goto_0
    iget-object v2, v0, Lp93/c;->F:Lr93/g0;

    check-cast v2, Lu93/g0;

    invoke-virtual {v2}, Lu93/g0;->J0()Lr93/b0;

    move-result-object v2

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lva3/c;

    invoke-static {v2, v5}, Lhg3/i;->L(Lr93/b0;Lva3/c;)Lr93/e;

    move-result-object v6

    if-eqz v6, :cond_4

    iget-object v5, v0, Lp93/c;->K:Ljava/util/List;

    invoke-interface {v6}, Lr93/h;->e()Llb3/q0;

    move-result-object v7

    invoke-interface {v7}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    invoke-static {v7, v5}, Lm83/s;->x1(ILjava/util/List;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v5, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lr93/x0;

    new-instance v9, Llb3/v0;

    invoke-interface {v8}, Lr93/h;->i()Llb3/c0;

    move-result-object v8

    invoke-direct {v9, v8}, Llb3/v0;-><init>(Llb3/y;)V

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    sget-object v5, Llb3/k0;->x:Lwe/o;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Llb3/k0;->y:Llb3/k0;

    invoke-static {v5, v6, v7}, Llb3/o;->h(Llb3/k0;Lr93/e;Ljava/util/List;)Llb3/c0;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Built-in class "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not found"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    invoke-static {v3}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0

    :cond_6
    sget v0, Lvb3/a;->a:I

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "should not be called"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d()Lr93/h;
    .locals 1

    iget-object v0, p0, Lp93/b;->y:Lp93/c;

    return-object v0
.end method

.method public final f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final g()Lr93/v0;
    .locals 1

    sget-object v0, Lr93/v0;->x:Lr93/v0;

    return-object v0
.end method

.method public final getParameters()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lp93/b;->y:Lp93/c;

    iget-object v0, v0, Lp93/c;->K:Ljava/util/List;

    return-object v0
.end method

.method public final l()Lr93/e;
    .locals 1

    iget-object v0, p0, Lp93/b;->y:Lp93/c;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp93/b;->y:Lp93/c;

    invoke-virtual {v0}, Lp93/c;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

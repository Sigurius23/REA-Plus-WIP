.class public abstract Lsn/h;
.super Lsn/a;
.source "SourceFile"


# instance fields
.field public final h:Ljava/util/HashMap;

.field public i:Landroid/os/Handler;

.field public j:Lko/j0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lsn/a;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lsn/h;->h:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    iget-object v0, p0, Lsn/h;->h:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsn/g;

    iget-object v2, v1, Lsn/g;->a:Lsn/a;

    iget-object v1, v1, Lsn/g;->b:Lsn/f;

    invoke-virtual {v2, v1}, Lsn/a;->b(Lsn/w;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final e()V
    .locals 3

    iget-object v0, p0, Lsn/h;->h:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsn/g;

    iget-object v2, v1, Lsn/g;->a:Lsn/a;

    iget-object v1, v1, Lsn/g;->b:Lsn/f;

    invoke-virtual {v2, v1}, Lsn/a;->d(Lsn/w;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public g()V
    .locals 2

    iget-object v0, p0, Lsn/h;->h:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsn/g;

    iget-object v1, v1, Lsn/g;->a:Lsn/a;

    invoke-virtual {v1}, Lsn/a;->g()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public m()V
    .locals 5

    iget-object v0, p0, Lsn/h;->h:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsn/g;

    iget-object v3, v2, Lsn/g;->a:Lsn/a;

    iget-object v4, v2, Lsn/g;->c:Lq/f;

    iget-object v2, v2, Lsn/g;->b:Lsn/f;

    invoke-virtual {v3, v2}, Lsn/a;->l(Lsn/w;)V

    invoke-virtual {v3, v4}, Lsn/a;->o(Lsn/a0;)V

    invoke-virtual {v3, v4}, Lsn/a;->n(Lvm/e;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public p(Ljava/lang/Object;Lsn/v;)Lsn/v;
    .locals 0

    return-object p2
.end method

.method public abstract q(Ljava/lang/Object;Lsn/a;Lrm/o1;)V
.end method

.method public final r(Ljava/lang/Object;Lsn/a;)V
    .locals 4

    iget-object v0, p0, Lsn/h;->h:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Llo/a;->e(Z)V

    new-instance v1, Lsn/f;

    invoke-direct {v1, p0, p1}, Lsn/f;-><init>(Lsn/h;Ljava/lang/Object;)V

    new-instance v2, Lq/f;

    invoke-direct {v2, p0, p1}, Lq/f;-><init>(Lsn/h;Ljava/lang/Object;)V

    new-instance v3, Lsn/g;

    invoke-direct {v3, p2, v1, v2}, Lsn/g;-><init>(Lsn/a;Lsn/f;Lq/f;)V

    invoke-virtual {v0, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lsn/h;->i:Landroid/os/Handler;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p2, Lsn/a;->c:Lsn/z;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lsn/z;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v3, Lsn/y;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object p1, v3, Lsn/y;->a:Landroid/os/Handler;

    iput-object v2, v3, Lsn/y;->b:Lsn/a0;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lsn/h;->i:Landroid/os/Handler;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p2, Lsn/a;->d:Lsn/z;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lsn/z;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v0, Lvm/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v2, v0, Lvm/d;->a:Lvm/e;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lsn/h;->j:Lko/j0;

    iget-object v0, p0, Lsn/a;->g:Lsm/f;

    invoke-static {v0}, Llo/a;->j(Ljava/lang/Object;)V

    invoke-virtual {p2, v1, p1, v0}, Lsn/a;->h(Lsn/w;Lko/j0;Lsm/f;)V

    iget-object p1, p0, Lsn/a;->b:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p2, v1}, Lsn/a;->b(Lsn/w;)V

    :cond_0
    return-void
.end method

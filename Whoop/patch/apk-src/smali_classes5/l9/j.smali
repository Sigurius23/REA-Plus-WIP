.class public abstract Ll9/j;
.super Ll9/a;
.source "SourceFile"


# instance fields
.field public final h:Ljava/util/HashMap;

.field public i:Landroid/os/Handler;

.field public j:Lz8/n;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ll9/a;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll9/j;->h:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    iget-object v0, p0, Ll9/j;->h:Ljava/util/HashMap;

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

    check-cast v1, Ll9/i;

    iget-object v2, v1, Ll9/i;->a:Ll9/a;

    iget-object v1, v1, Ll9/i;->b:Ll9/g;

    invoke-virtual {v2, v1}, Ll9/a;->b(Ll9/d0;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final e()V
    .locals 3

    iget-object v0, p0, Ll9/j;->h:Ljava/util/HashMap;

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

    check-cast v1, Ll9/i;

    iget-object v2, v1, Ll9/i;->a:Ll9/a;

    iget-object v1, v1, Ll9/i;->b:Ll9/g;

    invoke-virtual {v2, v1}, Ll9/a;->d(Ll9/d0;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public i()V
    .locals 2

    iget-object v0, p0, Ll9/j;->h:Ljava/util/HashMap;

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

    check-cast v1, Ll9/i;

    iget-object v1, v1, Ll9/i;->a:Ll9/a;

    invoke-virtual {v1}, Ll9/a;->i()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public o()V
    .locals 5

    iget-object v0, p0, Ll9/j;->h:Ljava/util/HashMap;

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

    check-cast v2, Ll9/i;

    iget-object v3, v2, Ll9/i;->a:Ll9/a;

    iget-object v4, v2, Ll9/i;->c:Ll9/h;

    iget-object v2, v2, Ll9/i;->b:Ll9/g;

    invoke-virtual {v3, v2}, Ll9/a;->n(Ll9/d0;)V

    invoke-virtual {v3, v4}, Ll9/a;->q(Ll9/i0;)V

    invoke-virtual {v3, v4}, Ll9/a;->p(Lg9/e;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public abstract s(Ljava/lang/Object;Ll9/c0;)Ll9/c0;
.end method

.method public t(JLjava/lang/Object;)J
    .locals 0

    return-wide p1
.end method

.method public u(ILjava/lang/Object;)I
    .locals 0

    return p1
.end method

.method public abstract v(Ljava/lang/Object;Ll9/a;Lu8/o0;)V
.end method

.method public final w(Ljava/lang/Object;Ll9/a;)V
    .locals 4

    iget-object v0, p0, Ll9/j;->h:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lva3/g;->d(Z)V

    new-instance v1, Ll9/g;

    invoke-direct {v1, p0, p1}, Ll9/g;-><init>(Ll9/j;Ljava/lang/Object;)V

    new-instance v2, Ll9/h;

    invoke-direct {v2, p0, p1}, Ll9/h;-><init>(Ll9/j;Ljava/lang/Object;)V

    new-instance v3, Ll9/i;

    invoke-direct {v3, p2, v1, v2}, Ll9/i;-><init>(Ll9/a;Ll9/g;Ll9/h;)V

    invoke-virtual {v0, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Ll9/j;->i:Landroid/os/Handler;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p2, Ll9/a;->c:Lg9/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lg9/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v3, Ll9/h0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object p1, v3, Ll9/h0;->a:Landroid/os/Handler;

    iput-object v2, v3, Ll9/h0;->b:Ljava/lang/Object;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Ll9/j;->i:Landroid/os/Handler;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p2, Ll9/a;->d:Lg9/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lg9/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v0, Lg9/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v2, v0, Lg9/c;->a:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Ll9/j;->j:Lz8/n;

    iget-object v0, p0, Ll9/a;->g:Lc9/n;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {p2, v1, p1, v0}, Ll9/a;->j(Ll9/d0;Lz8/n;Lc9/n;)V

    iget-object p1, p0, Ll9/a;->b:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p2, v1}, Ll9/a;->b(Ll9/d0;)V

    :cond_0
    return-void
.end method

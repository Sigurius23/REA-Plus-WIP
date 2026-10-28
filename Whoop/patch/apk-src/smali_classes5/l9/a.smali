.class public abstract Ll9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Ljava/util/HashSet;

.field public final c:Lg9/d;

.field public final d:Lg9/d;

.field public e:Landroid/os/Looper;

.field public f:Lu8/o0;

.field public g:Lc9/n;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll9/a;->a:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    iput-object v0, p0, Ll9/a;->b:Ljava/util/HashSet;

    new-instance v0, Lg9/d;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lg9/d;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILl9/c0;)V

    iput-object v0, p0, Ll9/a;->c:Lg9/d;

    new-instance v0, Lg9/d;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    invoke-direct {v0, v1, v2, v3}, Lg9/d;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILl9/c0;)V

    iput-object v0, p0, Ll9/a;->d:Lg9/d;

    return-void
.end method


# virtual methods
.method public abstract a(Ll9/c0;Lko/o;J)Ll9/a0;
.end method

.method public final b(Ll9/d0;)V
    .locals 2

    iget-object v0, p0, Ll9/a;->b:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v1

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ll9/a;->c()V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public final d(Ll9/d0;)V
    .locals 2

    iget-object v0, p0, Ll9/a;->e:Landroid/os/Looper;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Ll9/a;->b:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v1

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ll9/a;->e()V

    :cond_0
    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public f()Lu8/o0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract g()Lu8/x;
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public abstract i()V
.end method

.method public final j(Ll9/d0;Lz8/n;Lc9/n;)V
    .locals 2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Ll9/a;->e:Landroid/os/Looper;

    if-eqz v1, :cond_1

    if-ne v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, Lva3/g;->d(Z)V

    iput-object p3, p0, Ll9/a;->g:Lc9/n;

    iget-object p3, p0, Ll9/a;->f:Lu8/o0;

    iget-object v1, p0, Ll9/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Ll9/a;->e:Landroid/os/Looper;

    if-nez v1, :cond_2

    iput-object v0, p0, Ll9/a;->e:Landroid/os/Looper;

    iget-object p3, p0, Ll9/a;->b:Ljava/util/HashSet;

    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p2}, Ll9/a;->k(Lz8/n;)V

    return-void

    :cond_2
    if-eqz p3, :cond_3

    invoke-virtual {p0, p1}, Ll9/a;->d(Ll9/d0;)V

    invoke-interface {p1, p0, p3}, Ll9/d0;->a(Ll9/a;Lu8/o0;)V

    :cond_3
    return-void
.end method

.method public abstract k(Lz8/n;)V
.end method

.method public final l(Lu8/o0;)V
    .locals 2

    iput-object p1, p0, Ll9/a;->f:Lu8/o0;

    iget-object v0, p0, Ll9/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll9/d0;

    invoke-interface {v1, p0, p1}, Ll9/d0;->a(Ll9/a;Lu8/o0;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public abstract m(Ll9/a0;)V
.end method

.method public final n(Ll9/d0;)V
    .locals 1

    iget-object v0, p0, Ll9/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Ll9/a;->e:Landroid/os/Looper;

    iput-object p1, p0, Ll9/a;->f:Lu8/o0;

    iput-object p1, p0, Ll9/a;->g:Lc9/n;

    iget-object p1, p0, Ll9/a;->b:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->clear()V

    invoke-virtual {p0}, Ll9/a;->o()V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Ll9/a;->b(Ll9/d0;)V

    return-void
.end method

.method public abstract o()V
.end method

.method public final p(Lg9/e;)V
    .locals 4

    iget-object v0, p0, Ll9/a;->d:Lg9/d;

    iget-object v0, v0, Lg9/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg9/c;

    iget-object v3, v2, Lg9/c;->a:Ljava/lang/Object;

    if-ne v3, p1, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final q(Ll9/i0;)V
    .locals 4

    iget-object v0, p0, Ll9/a;->c:Lg9/d;

    iget-object v0, v0, Lg9/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll9/h0;

    iget-object v3, v2, Ll9/h0;->b:Ljava/lang/Object;

    if-ne v3, p1, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public abstract r(Lu8/x;)V
.end method

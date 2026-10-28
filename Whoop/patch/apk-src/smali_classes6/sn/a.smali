.class public abstract Lsn/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Ljava/util/HashSet;

.field public final c:Lsn/z;

.field public final d:Lsn/z;

.field public e:Landroid/os/Looper;

.field public f:Lrm/o1;

.field public g:Lsm/f;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lsn/a;->a:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    iput-object v0, p0, Lsn/a;->b:Ljava/util/HashSet;

    new-instance v0, Lsn/z;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsn/z;-><init>(I)V

    iput-object v0, p0, Lsn/a;->c:Lsn/z;

    new-instance v0, Lsn/z;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lsn/z;-><init>(I)V

    iput-object v0, p0, Lsn/a;->d:Lsn/z;

    return-void
.end method


# virtual methods
.method public abstract a(Lsn/v;Lko/o;J)Lsn/s;
.end method

.method public final b(Lsn/w;)V
    .locals 2

    iget-object v0, p0, Lsn/a;->b:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v1

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lsn/a;->c()V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public final d(Lsn/w;)V
    .locals 2

    iget-object v0, p0, Lsn/a;->e:Landroid/os/Looper;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lsn/a;->b:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v1

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lsn/a;->e()V

    :cond_0
    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public abstract f()Lrm/k0;
.end method

.method public abstract g()V
.end method

.method public final h(Lsn/w;Lko/j0;Lsm/f;)V
    .locals 2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Lsn/a;->e:Landroid/os/Looper;

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
    invoke-static {v1}, Llo/a;->e(Z)V

    iput-object p3, p0, Lsn/a;->g:Lsm/f;

    iget-object p3, p0, Lsn/a;->f:Lrm/o1;

    iget-object v1, p0, Lsn/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lsn/a;->e:Landroid/os/Looper;

    if-nez v1, :cond_2

    iput-object v0, p0, Lsn/a;->e:Landroid/os/Looper;

    iget-object p3, p0, Lsn/a;->b:Ljava/util/HashSet;

    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p2}, Lsn/a;->i(Lko/j0;)V

    return-void

    :cond_2
    if-eqz p3, :cond_3

    invoke-virtual {p0, p1}, Lsn/a;->d(Lsn/w;)V

    invoke-interface {p1, p0, p3}, Lsn/w;->a(Lsn/a;Lrm/o1;)V

    :cond_3
    return-void
.end method

.method public abstract i(Lko/j0;)V
.end method

.method public final j(Lrm/o1;)V
    .locals 2

    iput-object p1, p0, Lsn/a;->f:Lrm/o1;

    iget-object v0, p0, Lsn/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsn/w;

    invoke-interface {v1, p0, p1}, Lsn/w;->a(Lsn/a;Lrm/o1;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public abstract k(Lsn/s;)V
.end method

.method public final l(Lsn/w;)V
    .locals 1

    iget-object v0, p0, Lsn/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lsn/a;->e:Landroid/os/Looper;

    iput-object p1, p0, Lsn/a;->f:Lrm/o1;

    iput-object p1, p0, Lsn/a;->g:Lsm/f;

    iget-object p1, p0, Lsn/a;->b:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->clear()V

    invoke-virtual {p0}, Lsn/a;->m()V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lsn/a;->b(Lsn/w;)V

    return-void
.end method

.method public abstract m()V
.end method

.method public final n(Lvm/e;)V
    .locals 4

    iget-object v0, p0, Lsn/a;->d:Lsn/z;

    iget-object v0, v0, Lsn/z;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lvm/d;

    iget-object v3, v2, Lvm/d;->a:Lvm/e;

    if-ne v3, p1, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final o(Lsn/a0;)V
    .locals 4

    iget-object v0, p0, Lsn/a;->c:Lsn/z;

    iget-object v0, v0, Lsn/z;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsn/y;

    iget-object v3, v2, Lsn/y;->b:Lsn/a0;

    if-ne v3, p1, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.class public final Lbc3/m2;
.super Lhc3/u;
.source "SourceFile"


# instance fields
.field public final E:Ljava/lang/ThreadLocal;

.field private volatile threadLocalIsSet:Z


# direct methods
.method public constructor <init>(Lq83/j;Lq83/d;)V
    .locals 2

    sget-object v0, Lbc3/n2;->w:Lbc3/n2;

    invoke-interface {p1, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-interface {p1, v0}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-direct {p0, v0, p2}, Lhc3/u;-><init>(Lq83/j;Lq83/d;)V

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lbc3/m2;->E:Ljava/lang/ThreadLocal;

    invoke-interface {p2}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    sget-object v0, Lq83/e;->w:Lq83/e;

    invoke-interface {p2, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p2

    instance-of p2, p2, Lbc3/z;

    if-nez p2, :cond_1

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lhc3/b;->m(Lq83/j;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lhc3/b;->f(Lq83/j;Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lbc3/m2;->f0(Lq83/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final c0()V
    .locals 0

    invoke-virtual {p0}, Lbc3/m2;->e0()V

    return-void
.end method

.method public final d0()Z
    .locals 3

    iget-boolean v0, p0, Lbc3/m2;->threadLocalIsSet:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbc3/m2;->E:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lbc3/m2;->E:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->remove()V

    xor-int/2addr v0, v1

    return v0
.end method

.method public final e0()V
    .locals 2

    iget-boolean v0, p0, Lbc3/m2;->threadLocalIsSet:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbc3/m2;->E:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll83/k;

    if-eqz v0, :cond_0

    iget-object v1, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Lq83/j;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    invoke-static {v1, v0}, Lhc3/b;->f(Lq83/j;Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lbc3/m2;->E:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    :cond_1
    return-void
.end method

.method public final f0(Lq83/j;Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lbc3/m2;->threadLocalIsSet:Z

    iget-object v0, p0, Lbc3/m2;->E:Ljava/lang/ThreadLocal;

    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final l(Ljava/lang/Object;)V
    .locals 5

    invoke-virtual {p0}, Lbc3/m2;->e0()V

    invoke-static {p1}, Lbc3/f0;->C(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lhc3/u;->z:Lq83/d;

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lhc3/b;->m(Lq83/j;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lhc3/b;->d:Lhc3/x;

    if-eq v3, v4, :cond_0

    invoke-static {v0, v1, v3}, Lbc3/f0;->J(Lq83/d;Lq83/j;Ljava/lang/Object;)Lbc3/m2;

    move-result-object v2

    :cond_0
    :try_start_0
    invoke-interface {v0, p1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lbc3/m2;->d0()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    invoke-static {v1, v3}, Lhc3/b;->f(Lq83/j;Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lbc3/m2;->d0()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    invoke-static {v1, v3}, Lhc3/b;->f(Lq83/j;Ljava/lang/Object;)V

    :cond_4
    throw p1
.end method

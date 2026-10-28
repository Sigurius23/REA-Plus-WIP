.class public final Lx1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/Set;

.field public b:La2/c;

.field public final c:Lr1/c;

.field public d:La0/w0;

.field public e:Lr1/c;

.field public final f:Lr1/c;

.field public final g:Lr1/c;

.field public h:La0/w0;

.field public i:La0/v0;

.field public j:Ljava/util/ArrayList;

.field public k:La0/w0;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lr1/c;

    const/16 v1, 0x10

    new-array v2, v1, [Lp1/a2;

    invoke-direct {v0, v2}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iput-object v0, p0, Lx1/h;->c:Lr1/c;

    sget-object v2, La0/e1;->a:La0/w0;

    new-instance v2, La0/w0;

    invoke-direct {v2}, La0/w0;-><init>()V

    iput-object v2, p0, Lx1/h;->d:La0/w0;

    iput-object v0, p0, Lx1/h;->e:Lr1/c;

    new-instance v0, Lr1/c;

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iput-object v0, p0, Lx1/h;->f:Lr1/c;

    new-instance v0, Lr1/c;

    new-array v1, v1, [Lc93/a;

    invoke-direct {v0, v1}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iput-object v0, p0, Lx1/h;->g:Lr1/c;

    return-void
.end method

.method public static final f(Lp1/a2;Lr1/c;)Z
    .locals 5

    iget-object v0, p1, Lr1/c;->w:[Ljava/lang/Object;

    iget p1, p1, Lr1/c;->y:I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, p1, :cond_2

    aget-object v3, v0, v2

    check-cast v3, Lp1/a2;

    iget-object v3, v3, Lp1/a2;->a:Lp1/z1;

    instance-of v4, v3, Lx1/e;

    if-eqz v4, :cond_1

    check-cast v3, Lx1/e;

    invoke-virtual {v3}, Lx1/e;->b()Lr1/c;

    move-result-object v3

    invoke-virtual {v3, p0}, Lr1/c;->k(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p0, v3}, Lx1/h;->f(Lp1/a2;Lr1/c;)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method


# virtual methods
.method public final a()V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Lx1/h;->a:Ljava/util/Set;

    iput-object v0, p0, Lx1/h;->b:La2/c;

    iget-object v1, p0, Lx1/h;->c:Lr1/c;

    invoke-virtual {v1}, Lr1/c;->g()V

    iget-object v2, p0, Lx1/h;->d:La0/w0;

    invoke-virtual {v2}, La0/w0;->b()V

    iput-object v1, p0, Lx1/h;->e:Lr1/c;

    iget-object v1, p0, Lx1/h;->f:Lr1/c;

    invoke-virtual {v1}, Lr1/c;->g()V

    iget-object v1, p0, Lx1/h;->g:Lr1/c;

    invoke-virtual {v1}, Lr1/c;->g()V

    iput-object v0, p0, Lx1/h;->h:La0/w0;

    iput-object v0, p0, Lx1/h;->i:La0/v0;

    iput-object v0, p0, Lx1/h;->j:Ljava/util/ArrayList;

    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lx1/h;->a:Ljava/util/Set;

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "Compose:abandons"

    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp1/z1;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    invoke-interface {v1}, Lp1/z1;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_2
    :goto_2
    return-void
.end method

.method public final c()V
    .locals 6

    iget-object v0, p0, Lx1/h;->a:Ljava/util/Set;

    if-nez v0, :cond_0

    goto/16 :goto_8

    :cond_0
    const/4 v1, 0x0

    iput-object v1, p0, Lx1/h;->k:La0/w0;

    iget-object v1, p0, Lx1/h;->f:Lr1/c;

    iget v2, v1, Lr1/c;->y:I

    if-eqz v2, :cond_6

    const-string v2, "Compose:onForgotten"

    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    iget-object v2, p0, Lx1/h;->h:La0/w0;

    iget v3, v1, Lr1/c;->y:I

    add-int/lit8 v3, v3, -0x1

    :goto_0
    const/4 v4, -0x1

    if-ge v4, v3, :cond_5

    iget-object v4, v1, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v4, v4, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    instance-of v5, v4, Lp1/a2;

    if-eqz v5, :cond_1

    move-object v5, v4

    check-cast v5, Lp1/a2;

    iget-object v5, v5, Lp1/a2;->a:Lp1/z1;

    invoke-interface {v0, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    invoke-interface {v5}, Lp1/z1;->d()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_1
    :goto_1
    instance-of v5, v4, Lp1/i;

    if-eqz v5, :cond_3

    if-eqz v2, :cond_2

    invoke-virtual {v2, v4}, La0/w0;->c(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v5, v4

    check-cast v5, Lp1/i;

    invoke-interface {v5}, Lp1/i;->f()V

    goto :goto_2

    :cond_2
    move-object v5, v4

    check-cast v5, Lp1/i;

    invoke-interface {v5}, Lp1/i;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    :goto_2
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    :goto_3
    :try_start_2
    iget-object v1, p0, Lx1/h;->b:La2/c;

    if-eqz v1, :cond_4

    new-instance v2, Li;

    const/4 v3, 0x2

    invoke-direct {v2, v3, v1, v4}, Li;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v2}, Ldt/b;->Y(Ljava/lang/Throwable;Lc93/a;)Z

    :cond_4
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_5
    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto :goto_5

    :goto_4
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_6
    :goto_5
    iget-object v0, p0, Lx1/h;->c:Lr1/c;

    iget v1, v0, Lr1/c;->y:I

    if-eqz v1, :cond_a

    const-string v1, "Compose:onRemembered"

    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_3
    iget-object v1, p0, Lx1/h;->a:Ljava/util/Set;

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    iget-object v2, v0, Lr1/c;->w:[Ljava/lang/Object;

    iget v0, v0, Lr1/c;->y:I

    const/4 v3, 0x0

    :goto_6
    if-ge v3, v0, :cond_9

    aget-object v4, v2, v3

    check-cast v4, Lp1/a2;

    iget-object v5, v4, Lp1/a2;->a:Lp1/z1;

    invoke-interface {v1, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :try_start_4
    invoke-interface {v5}, Lp1/z1;->a()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :catchall_2
    move-exception v0

    :try_start_5
    iget-object v1, p0, Lx1/h;->b:La2/c;

    if-eqz v1, :cond_8

    new-instance v2, Li;

    const/4 v3, 0x2

    invoke-direct {v2, v3, v1, v4}, Li;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v2}, Ldt/b;->Y(Ljava/lang/Throwable;Lc93/a;)Z

    :cond_8
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :cond_9
    :goto_7
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :catchall_3
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_a
    :goto_8
    return-void
.end method

.method public final d()V
    .locals 5

    iget-object v0, p0, Lx1/h;->g:Lr1/c;

    iget v1, v0, Lr1/c;->y:I

    if-eqz v1, :cond_1

    const-string v1, "Compose:sideeffects"

    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    iget-object v1, v0, Lr1/c;->w:[Ljava/lang/Object;

    iget v2, v0, Lr1/c;->y:I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    check-cast v4, Lc93/a;

    invoke-interface {v4}, Lc93/a;->invoke()Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lr1/c;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_1
    return-void
.end method

.method public final e(Lp1/a2;)V
    .locals 2

    iget-object v0, p0, Lx1/h;->d:La0/w0;

    invoke-virtual {v0, p1}, La0/w0;->c(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lx1/h;->d:La0/w0;

    invoke-virtual {v0, p1}, La0/w0;->l(Ljava/lang/Object;)Z

    iget-object v0, p0, Lx1/h;->e:Lr1/c;

    invoke-virtual {v0, p1}, Lr1/c;->k(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lx1/h;->c:Lr1/c;

    invoke-virtual {v0, p1}, Lr1/c;->k(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, v0}, Lx1/h;->f(Lp1/a2;Lr1/c;)Z

    :cond_1
    :goto_0
    iget-object v0, p0, Lx1/h;->a:Ljava/util/Set;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p1, Lp1/a2;->a:Lp1/z1;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_3
    iget-object v0, p0, Lx1/h;->k:La0/w0;

    if-eqz v0, :cond_5

    invoke-virtual {v0, p1}, La0/w0;->c(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    return-void

    :cond_5
    :goto_2
    iget-object v0, p0, Lx1/h;->f:Lr1/c;

    invoke-virtual {v0, p1}, Lr1/c;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public final g(Ljava/util/Set;La2/c;)V
    .locals 0

    invoke-virtual {p0}, Lx1/h;->a()V

    iput-object p1, p0, Lx1/h;->a:Ljava/util/Set;

    iput-object p2, p0, Lx1/h;->b:La2/c;

    return-void
.end method

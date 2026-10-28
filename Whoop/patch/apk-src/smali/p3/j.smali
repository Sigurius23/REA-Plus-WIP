.class public final Lp3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp3/h;


# instance fields
.field public final a:Laj/c;

.field public final b:Lp3/a;

.field public final c:Lp0/n0;

.field public final d:Lp3/m;

.field public final e:Laj/d;

.field public final f:La6/i;


# direct methods
.method public constructor <init>(Laj/c;Lp3/a;)V
    .locals 5

    sget-object v0, Lp3/k;->a:Lp0/n0;

    new-instance v1, Lp3/m;

    sget-object v2, Lp3/k;->b:La3/p;

    invoke-direct {v1, v2}, Lp3/m;-><init>(La3/p;)V

    new-instance v2, Laj/d;

    const/16 v3, 0x17

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Laj/d;-><init>(IZ)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/j;->a:Laj/c;

    iput-object p2, p0, Lp3/j;->b:Lp3/a;

    iput-object v0, p0, Lp3/j;->c:Lp0/n0;

    iput-object v1, p0, Lp3/j;->d:Lp3/m;

    iput-object v2, p0, Lp3/j;->e:Laj/d;

    new-instance p1, La6/i;

    const/16 p2, 0x1c

    invoke-direct {p1, p0, p2}, La6/i;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lp3/j;->f:La6/i;

    return-void
.end method


# virtual methods
.method public final a(Lp3/a0;)Lp3/e0;
    .locals 5

    iget-object v0, p0, Lp3/j;->c:Lp0/n0;

    new-instance v1, Lbp0/n;

    const/16 v2, 0x1d

    invoke-direct {v1, v2, p0, p1}, Lbp0/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, v0, Lp0/n0;->x:Ljava/lang/Object;

    check-cast v2, Ljc/b;

    monitor-enter v2

    :try_start_0
    iget-object v3, v0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v3, La0/a0;

    invoke-virtual {v3, p1}, La0/a0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp3/e0;

    if-eqz v3, :cond_1

    invoke-interface {v3}, Lp3/e0;->b()Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_0

    monitor-exit v2

    return-object v3

    :cond_0
    :try_start_1
    iget-object v3, v0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v3, La0/a0;

    invoke-virtual {v3, p1}, La0/a0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp3/e0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    :goto_0
    monitor-exit v2

    :try_start_2
    new-instance v2, Lp3/b0;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0, p1}, Lp3/b0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lbp0/n;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp3/e0;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    iget-object v2, v0, Lp0/n0;->x:Ljava/lang/Object;

    check-cast v2, Ljc/b;

    monitor-enter v2

    :try_start_3
    iget-object v3, v0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v3, La0/a0;

    invoke-virtual {v3, p1}, La0/a0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_2

    invoke-interface {v1}, Lp3/e0;->b()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v0, v0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v0, La0/a0;

    invoke-virtual {v0, p1, v1}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_1
    monitor-exit v2

    return-object v1

    :goto_2
    monitor-exit v2

    throw p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Could not load font"

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :goto_3
    monitor-exit v2

    throw p1
.end method

.method public final b(Lp3/i;Lp3/r;II)Lp3/e0;
    .locals 6

    new-instance v0, Lp3/a0;

    iget-object v1, p0, Lp3/j;->b:Lp3/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v1, Lp3/a;->w:I

    if-eqz v1, :cond_1

    const v2, 0x7fffffff

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    iget p2, p2, Lp3/r;->w:I

    add-int/2addr p2, v1

    const/4 v1, 0x1

    const/16 v2, 0x3e8

    invoke-static {p2, v1, v2}, Le93/b;->n(III)I

    move-result p2

    new-instance v1, Lp3/r;

    invoke-direct {v1, p2}, Lp3/r;-><init>(I)V

    move-object v2, v1

    goto :goto_1

    :cond_1
    :goto_0
    move-object v2, p2

    :goto_1
    iget-object p2, p0, Lp3/j;->a:Laj/c;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x0

    move-object v1, p1

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lp3/a0;-><init>(Lp3/i;Lp3/r;IILjava/lang/Object;)V

    invoke-virtual {p0, v0}, Lp3/j;->a(Lp3/a0;)Lp3/e0;

    move-result-object p1

    return-object p1
.end method

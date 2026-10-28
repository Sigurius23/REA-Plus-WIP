.class public final Lzd3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/g0;


# static fields
.field public static final w:Lzd3/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzd3/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lzd3/a;->w:Lzd3/a;

    return-void
.end method


# virtual methods
.method public final intercept(Lud3/f0;)Lud3/x0;
    .locals 9

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lae3/i;

    iget-object v0, p1, Lae3/i;->a:Lzd3/o;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, v0, Lzd3/o;->Q:Z

    if-eqz v1, :cond_3

    iget-boolean v1, v0, Lzd3/o;->N:Z

    if-nez v1, :cond_2

    iget-boolean v1, v0, Lzd3/o;->M:Z

    if-nez v1, :cond_2

    iget-boolean v1, v0, Lzd3/o;->P:Z

    if-nez v1, :cond_2

    iget-boolean v1, v0, Lzd3/o;->O:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v1, :cond_2

    monitor-exit v0

    iget-object v1, v0, Lzd3/o;->I:Lzd3/h;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v1}, Lzd3/h;->a()Lzd3/p;

    move-result-object v2

    iget-object v3, v0, Lzd3/o;->w:Lud3/l0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v4, p1, Lae3/i;->g:I

    iget-object v5, v2, Lzd3/p;->h:Ls/m2;

    iget-object v6, v2, Lzd3/p;->j:Lce3/q;

    if-eqz v6, :cond_0

    new-instance v4, Lce3/r;

    invoke-direct {v4, v3, v2, p1, v6}, Lce3/r;-><init>(Lud3/l0;Lzd3/p;Lae3/i;Lce3/q;)V

    goto :goto_0

    :cond_0
    iget-object v6, v2, Lzd3/p;->e:Ljava/net/Socket;

    invoke-virtual {v6, v4}, Ljava/net/Socket;->setSoTimeout(I)V

    iget-object v6, v5, Ls/m2;->x:Ljava/lang/Object;

    check-cast v6, Lne3/j0;

    iget-object v6, v6, Lne3/j0;->w:Lne3/p0;

    invoke-interface {v6}, Lne3/p0;->timeout()Lne3/r0;

    move-result-object v6

    int-to-long v7, v4

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v6, v7, v8, v4}, Lne3/r0;->g(JLjava/util/concurrent/TimeUnit;)Lne3/r0;

    iget-object v6, v5, Ls/m2;->y:Ljava/lang/Object;

    check-cast v6, Lne3/h0;

    iget-object v6, v6, Lne3/h0;->w:Lne3/n0;

    invoke-interface {v6}, Lne3/n0;->timeout()Lne3/r0;

    move-result-object v6

    iget v7, p1, Lae3/i;->h:I

    int-to-long v7, v7

    invoke-virtual {v6, v7, v8, v4}, Lne3/r0;->g(JLjava/util/concurrent/TimeUnit;)Lne3/r0;

    new-instance v4, Lbe3/g;

    invoke-direct {v4, v3, v2, v5}, Lbe3/g;-><init>(Lud3/l0;Lae3/f;Ls/m2;)V

    :goto_0
    new-instance v2, Lzd3/g;

    iget-object v3, v0, Lzd3/o;->E:Lud3/a0;

    invoke-direct {v2, v0, v3, v1, v4}, Lzd3/g;-><init>(Lzd3/o;Lud3/a0;Lzd3/h;Lae3/g;)V

    iput-object v2, v0, Lzd3/o;->L:Lzd3/g;

    iput-object v2, v0, Lzd3/o;->S:Lzd3/g;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_1
    iput-boolean v1, v0, Lzd3/o;->M:Z

    iput-boolean v1, v0, Lzd3/o;->N:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    iget-boolean v0, v0, Lzd3/o;->R:Z

    if-nez v0, :cond_1

    const/4 v0, 0x0

    const/16 v1, 0x3d

    const/4 v3, 0x0

    invoke-static {p1, v3, v2, v0, v1}, Lae3/i;->a(Lae3/i;ILzd3/g;Lud3/o0;I)Lae3/i;

    move-result-object v0

    iget-object p1, p1, Lae3/i;->e:Lud3/o0;

    invoke-virtual {v0, p1}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :catchall_1
    move-exception p1

    goto :goto_1

    :cond_2
    :try_start_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const-string p1, "released"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_1
    monitor-exit v0

    throw p1
.end method

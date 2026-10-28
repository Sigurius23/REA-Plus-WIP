.class public final Landroidx/room/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Landroidx/room/v;

.field public final c:Landroid/content/Context;

.field public final d:Lbc3/c0;

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public f:I

.field public g:Landroidx/room/q;

.field public final h:Lec3/w1;

.field public final i:Landroidx/room/a0;

.field public final j:Landroidx/room/z;

.field public final k:Landroidx/room/b0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroidx/room/v;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/room/c0;->a:Ljava/lang/String;

    iput-object p3, p0, Landroidx/room/c0;->b:Landroidx/room/v;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Landroidx/room/c0;->c:Landroid/content/Context;

    iget-object p1, p3, Landroidx/room/v;->a:Landroidx/room/z0;

    invoke-virtual {p1}, Landroidx/room/z0;->getCoroutineScope()Lbc3/c0;

    move-result-object p1

    iput-object p1, p0, Landroidx/room/c0;->d:Lbc3/c0;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Landroidx/room/c0;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p1, 0x0

    sget-object p2, Ldc3/a;->w:Ldc3/a;

    invoke-static {p1, p1, p2}, Lec3/v;->a(IILdc3/a;)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Landroidx/room/c0;->h:Lec3/w1;

    iget-object p1, p3, Landroidx/room/v;->b:[Ljava/lang/String;

    new-instance p2, Landroidx/room/a0;

    invoke-direct {p2, p0, p1}, Landroidx/room/a0;-><init>(Landroidx/room/c0;[Ljava/lang/String;)V

    iput-object p2, p0, Landroidx/room/c0;->i:Landroidx/room/a0;

    new-instance p1, Landroidx/room/z;

    invoke-direct {p1, p0}, Landroidx/room/z;-><init>(Landroidx/room/c0;)V

    iput-object p1, p0, Landroidx/room/c0;->j:Landroidx/room/z;

    new-instance p1, Landroidx/room/b0;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Landroidx/room/b0;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Landroidx/room/c0;->k:Landroidx/room/b0;

    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/String;)Landroidx/room/y;
    .locals 3

    const-string v0, "resolvedTableNames"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/room/y;

    const/4 v1, 0x0

    iget-object v2, p0, Landroidx/room/c0;->h:Lec3/w1;

    invoke-direct {v0, v1, v2, p1}, Landroidx/room/y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final b(Landroid/content/Intent;)V
    .locals 3

    const-string v0, "serviceIntent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iget-object v1, p0, Landroidx/room/c0;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/room/c0;->c:Landroid/content/Context;

    iget-object v1, p0, Landroidx/room/c0;->k:Landroidx/room/b0;

    invoke-virtual {v0, p1, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    const-string p1, "observer"

    iget-object v0, p0, Landroidx/room/c0;->i:Landroidx/room/a0;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/room/c0;->b:Landroidx/room/v;

    invoke-virtual {p1, v0}, Landroidx/room/v;->a(Landroidx/room/s;)Z

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    iget-object v2, p0, Landroidx/room/c0;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/room/c0;->b:Landroidx/room/v;

    iget-object v1, p0, Landroidx/room/c0;->i:Landroidx/room/a0;

    invoke-virtual {v0, v1}, Landroidx/room/v;->c(Landroidx/room/s;)V

    :try_start_0
    iget-object v0, p0, Landroidx/room/c0;->g:Landroidx/room/q;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/room/c0;->j:Landroidx/room/z;

    iget v2, p0, Landroidx/room/c0;->f:I

    invoke-interface {v0, v1, v2}, Landroidx/room/q;->f0(Landroidx/room/o;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "ROOM"

    const-string v2, "Cannot unregister multi-instance invalidation callback"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    iget-object v0, p0, Landroidx/room/c0;->c:Landroid/content/Context;

    iget-object v1, p0, Landroidx/room/c0;->k:Landroidx/room/b0;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    :cond_1
    return-void
.end method

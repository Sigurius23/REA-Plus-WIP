.class public final Lko/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lbb/f;

.field public static final e:Lbb/f;

.field public static final f:Lbb/f;


# instance fields
.field public final a:Ljava/util/concurrent/ExecutorService;

.field public b:Lko/z;

.field public c:Ljava/io/IOException;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lbb/f;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v2, v3, v4, v1}, Lbb/f;-><init>(IJB)V

    sput-object v0, Lko/c0;->d:Lbb/f;

    new-instance v0, Lbb/f;

    const/4 v1, 0x2

    invoke-direct {v0, v1, v3, v4, v2}, Lbb/f;-><init>(IJB)V

    sput-object v0, Lko/c0;->e:Lbb/f;

    new-instance v0, Lbb/f;

    const/4 v1, 0x3

    invoke-direct {v0, v1, v3, v4, v2}, Lbb/f;-><init>(IJB)V

    sput-object v0, Lko/c0;->f:Lbb/f;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const-string v1, "ExoPlayer:Loader:"

    if-eqz v0, :cond_0

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    sget v0, Llo/y;->a:I

    new-instance v0, Lk33/a;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lk33/a;-><init>(Ljava/lang/String;I)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Lko/c0;->a:Ljava/util/concurrent/ExecutorService;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lko/c0;->b:Lko/z;

    invoke-static {v0}, Llo/a;->j(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lko/z;->a(Z)V

    return-void
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lko/c0;->b:Lko/z;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c(Lko/b0;)V
    .locals 3

    iget-object v0, p0, Lko/c0;->b:Lko/z;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lko/z;->a(Z)V

    :cond_0
    iget-object v0, p0, Lko/c0;->a:Ljava/util/concurrent/ExecutorService;

    if-eqz p1, :cond_1

    new-instance v1, Lbq/b;

    const/16 v2, 0xe

    invoke-direct {v1, p1, v2}, Lbq/b;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    return-void
.end method

.method public final d(Lko/a0;Lko/y;I)J
    .locals 9

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {v2}, Llo/a;->j(Ljava/lang/Object;)V

    const/4 v8, 0x0

    iput-object v8, p0, Lko/c0;->c:Ljava/io/IOException;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    new-instance v0, Lko/z;

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v7}, Lko/z;-><init>(Lko/c0;Landroid/os/Looper;Lko/a0;Lko/y;IJ)V

    iget-object p1, v1, Lko/c0;->b:Lko/z;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Llo/a;->i(Z)V

    iput-object v0, v1, Lko/c0;->b:Lko/z;

    iput-object v8, v0, Lko/z;->z:Ljava/io/IOException;

    iget-object p1, v1, Lko/c0;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-wide v6
.end method

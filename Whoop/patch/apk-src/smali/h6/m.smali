.class public final Lh6/m;
.super Lwb3/f;
.source "SourceFile"


# instance fields
.field public final synthetic c:Lwb3/f;

.field public final synthetic d:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method public constructor <init>(Lwb3/f;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh6/m;->c:Lwb3/f;

    iput-object p2, p0, Lh6/m;->d:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method


# virtual methods
.method public final S(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lh6/m;->d:Ljava/util/concurrent/ThreadPoolExecutor;

    :try_start_0
    iget-object v1, p0, Lh6/m;->c:Lwb3/f;

    invoke-virtual {v1, p1}, Lwb3/f;->S(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    throw p1
.end method

.method public final T(Lzt/q;)V
    .locals 2

    iget-object v0, p0, Lh6/m;->d:Ljava/util/concurrent/ThreadPoolExecutor;

    :try_start_0
    iget-object v1, p0, Lh6/m;->c:Lwb3/f;

    invoke-virtual {v1, p1}, Lwb3/f;->T(Lzt/q;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    throw p1
.end method

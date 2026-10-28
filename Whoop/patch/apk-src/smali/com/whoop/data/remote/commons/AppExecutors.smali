.class public Lcom/whoop/data/remote/commons/AppExecutors;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/commons/AppExecutors$MainThreadExecutor;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0016\u0018\u00002\u00020\u0001:\u0001\u0008B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B\t\u0008\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0007J\u0006\u0010\u0002\u001a\u00020\u0003J\u0006\u0010\u0004\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/whoop/data/remote/commons/AppExecutors;",
        "",
        "diskIO",
        "Ljava/util/concurrent/Executor;",
        "mainThread",
        "<init>",
        "(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V",
        "()V",
        "MainThreadExecutor",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final diskIO:Ljava/util/concurrent/Executor;

.field private final mainThread:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 4
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    const-string v1, "newSingleThreadExecutor(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/concurrent/Executor;

    .line 5
    new-instance v1, Lcom/whoop/data/remote/commons/AppExecutors$MainThreadExecutor;

    invoke-direct {v1}, Lcom/whoop/data/remote/commons/AppExecutors$MainThreadExecutor;-><init>()V

    .line 6
    invoke-direct {p0, v0, v1}, Lcom/whoop/data/remote/commons/AppExecutors;-><init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V
    .locals 1

    const-string v0, "diskIO"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mainThread"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/data/remote/commons/AppExecutors;->diskIO:Ljava/util/concurrent/Executor;

    .line 3
    iput-object p2, p0, Lcom/whoop/data/remote/commons/AppExecutors;->mainThread:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final diskIO()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/commons/AppExecutors;->diskIO:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public final mainThread()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/commons/AppExecutors;->mainThread:Ljava/util/concurrent/Executor;

    return-object v0
.end method

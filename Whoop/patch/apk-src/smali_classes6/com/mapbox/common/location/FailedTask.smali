.class public final Lcom/mapbox/common/location/FailedTask;
.super Lcom/google/android/gms/tasks/Task;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/tasks/Task<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\nJ\u000f\u0010\r\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ)\u0010\r\u001a\u00028\u0000\"\n\u0008\u0001\u0010\u0010*\u0004\u0018\u00010\u000f2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0011H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u0013J\u0013\u0010\u0014\u001a\u00060\u0003j\u0002`\u0004H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J%\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u001dJ%\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001b\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u001fJ-\u0010!\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001b\u001a\u00020\u001e2\u000e\u0010\u001c\u001a\n\u0012\u0006\u0008\u0000\u0012\u00028\u00000 H\u0016\u00a2\u0006\u0004\u0008!\u0010\"J-\u0010!\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\u001c\u001a\n\u0012\u0006\u0008\u0000\u0012\u00028\u00000 H\u0016\u00a2\u0006\u0004\u0008!\u0010#J%\u0010!\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u001b\u001a\n\u0012\u0006\u0008\u0000\u0012\u00028\u00000 H\u0016\u00a2\u0006\u0004\u0008!\u0010$J\u001d\u0010&\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001b\u001a\u00020%H\u0016\u00a2\u0006\u0004\u0008&\u0010\'R\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010(\u00a8\u0006)"
    }
    d2 = {
        "Lcom/mapbox/common/location/FailedTask;",
        "T",
        "Lcom/google/android/gms/tasks/Task;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "exception",
        "<init>",
        "(Ljava/lang/Exception;)V",
        "",
        "isComplete",
        "()Z",
        "isSuccessful",
        "isCanceled",
        "getResult",
        "()Ljava/lang/Object;",
        "",
        "X",
        "Ljava/lang/Class;",
        "exceptionType",
        "(Ljava/lang/Class;)Ljava/lang/Object;",
        "getException",
        "()Ljava/lang/Exception;",
        "Lcq/e;",
        "listener",
        "addOnFailureListener",
        "(Lcq/e;)Lcom/google/android/gms/tasks/Task;",
        "Ljava/util/concurrent/Executor;",
        "p0",
        "p1",
        "(Ljava/util/concurrent/Executor;Lcq/e;)Lcom/google/android/gms/tasks/Task;",
        "Landroid/app/Activity;",
        "(Landroid/app/Activity;Lcq/e;)Lcom/google/android/gms/tasks/Task;",
        "Lcq/f;",
        "addOnSuccessListener",
        "(Landroid/app/Activity;Lcq/f;)Lcom/google/android/gms/tasks/Task;",
        "(Ljava/util/concurrent/Executor;Lcq/f;)Lcom/google/android/gms/tasks/Task;",
        "(Lcq/f;)Lcom/google/android/gms/tasks/Task;",
        "Lcq/c;",
        "addOnCanceledListener",
        "(Lcq/c;)Lcom/google/android/gms/tasks/Task;",
        "Ljava/lang/Exception;",
        "common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final exception:Ljava/lang/Exception;


# direct methods
.method public constructor <init>(Ljava/lang/Exception;)V
    .locals 1

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/tasks/Task;-><init>()V

    iput-object p1, p0, Lcom/mapbox/common/location/FailedTask;->exception:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public addOnCanceledListener(Lcq/c;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcq/c;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public addOnFailureListener(Landroid/app/Activity;Lcq/e;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcq/e;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "p1"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    new-instance p1, Ll83/j;

    const-string p2, "Please use addOnFailureListener(listener: OnFailureListener)"

    .line 6
    invoke-direct {p1, p2}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 7
    throw p1
.end method

.method public addOnFailureListener(Lcq/e;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcq/e;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/mapbox/common/location/FailedTask;->exception:Ljava/lang/Exception;

    invoke-interface {p1, v0}, Lcq/e;->n(Ljava/lang/Exception;)V

    return-object p0
.end method

.method public addOnFailureListener(Ljava/util/concurrent/Executor;Lcq/e;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lcq/e;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "p1"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Ll83/j;

    const-string p2, "Please use addOnFailureListener(listener: OnFailureListener)"

    .line 3
    invoke-direct {p1, p2}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 4
    throw p1
.end method

.method public addOnSuccessListener(Landroid/app/Activity;Lcq/f;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcq/f;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "p1"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public addOnSuccessListener(Lcq/f;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcq/f;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "TT;>;"
        }
    .end annotation

    .line 2
    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public addOnSuccessListener(Ljava/util/concurrent/Executor;Lcq/f;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lcq/f;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "TT;>;"
        }
    .end annotation

    .line 3
    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "p1"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public getException()Ljava/lang/Exception;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/location/FailedTask;->exception:Ljava/lang/Exception;

    return-object v0
.end method

.method public getResult()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/tasks/RuntimeExecutionException;

    iget-object v1, p0, Lcom/mapbox/common/location/FailedTask;->exception:Ljava/lang/Exception;

    .line 2
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 3
    throw v0
.end method

.method public getResult(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<X:",
            "Ljava/lang/Throwable;",
            ">(",
            "Ljava/lang/Class<",
            "TX;>;)TT;"
        }
    .end annotation

    const-string v0, "exceptionType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/mapbox/common/location/FailedTask;->exception:Ljava/lang/Exception;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    iget-object p1, p0, Lcom/mapbox/common/location/FailedTask;->exception:Ljava/lang/Exception;

    throw p1

    .line 6
    :cond_0
    new-instance p1, Lcom/google/android/gms/tasks/RuntimeExecutionException;

    iget-object v0, p0, Lcom/mapbox/common/location/FailedTask;->exception:Ljava/lang/Exception;

    .line 7
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 8
    throw p1
.end method

.method public isCanceled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isComplete()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isSuccessful()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

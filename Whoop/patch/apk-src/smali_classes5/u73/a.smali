.class public final Lu73/a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Ln73/b;
.implements Ljava/lang/Runnable;


# instance fields
.field public final w:Lw73/e;


# direct methods
.method public constructor <init>(Lw73/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lu73/a;->w:Lw73/e;

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 0

    invoke-static {p0}, Lq73/c;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    return-void
.end method

.method public final isDisposed()Z
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln73/b;

    sget-object v1, Lq73/c;->w:Lq73/c;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final run()V
    .locals 2

    iget-object v0, p0, Lu73/a;->w:Lw73/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v1, v0, Lw73/e;->x:Ljava/lang/Object;

    check-cast v1, Ll9/e0;

    invoke-virtual {v1}, Ll9/e0;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-static {v1}, Lbi/g;->a0(Ljava/lang/Throwable;)V

    invoke-static {v1}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    :goto_0
    sget-object v1, Lq73/c;->w:Lq73/c;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    return-void
.end method

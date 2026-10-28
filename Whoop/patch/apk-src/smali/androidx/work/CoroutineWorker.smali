.class public abstract Landroidx/work/CoroutineWorker;
.super Lic/v;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008&\u0018\u00002\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0013\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000cH\u0086@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0008\u00a2\u0006\u0004\u0008\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u001aR \u0010\u001c\u001a\u00020\u001b8\u0016X\u0097\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010\u001d\u0012\u0004\u0008 \u0010\u0019\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006\""
    }
    d2 = {
        "Landroidx/work/CoroutineWorker;",
        "Lic/v;",
        "Landroid/content/Context;",
        "appContext",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Lds/v;",
        "Lic/u;",
        "startWork",
        "()Lds/v;",
        "Lic/m;",
        "getForegroundInfo",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lic/g;",
        "data",
        "Ll83/a0;",
        "setProgress",
        "(Lic/g;Lq83/d;)Ljava/lang/Object;",
        "foregroundInfo",
        "setForeground",
        "(Lic/m;Lq83/d;)Ljava/lang/Object;",
        "getForegroundInfoAsync",
        "onStopped",
        "()V",
        "Landroidx/work/WorkerParameters;",
        "Lbc3/z;",
        "coroutineContext",
        "Lbc3/z;",
        "getCoroutineContext",
        "()Lbc3/z;",
        "getCoroutineContext$annotations",
        "ic/f",
        "work-runtime_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final coroutineContext:Lbc3/z;

.field private final params:Landroidx/work/WorkerParameters;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lic/v;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    iput-object p2, p0, Landroidx/work/CoroutineWorker;->params:Landroidx/work/WorkerParameters;

    sget-object p1, Lic/f;->w:Lic/f;

    iput-object p1, p0, Landroidx/work/CoroutineWorker;->coroutineContext:Lbc3/z;

    return-void
.end method

.method public static synthetic getCoroutineContext$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method

.method public static synthetic getForegroundInfo$suspendImpl(Landroidx/work/CoroutineWorker;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/work/CoroutineWorker;",
            "Lq83/d<",
            "-",
            "Lic/m;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Not implemented"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract doWork(Lq83/d;)Ljava/lang/Object;
.end method

.method public getCoroutineContext()Lbc3/z;
    .locals 1

    iget-object v0, p0, Landroidx/work/CoroutineWorker;->coroutineContext:Lbc3/z;

    return-object v0
.end method

.method public getForegroundInfo(Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lic/m;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1}, Landroidx/work/CoroutineWorker;->getForegroundInfo$suspendImpl(Landroidx/work/CoroutineWorker;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getForegroundInfoAsync()Lds/v;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lds/v;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/work/CoroutineWorker;->getCoroutineContext()Lbc3/z;

    move-result-object v0

    invoke-static {}, Lbc3/f0;->c()Lbc3/l1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    new-instance v1, La20/b;

    const/16 v2, 0x1c

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3, v2}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, v1}, Lq83/g;->F(Lq83/j;Lc93/m;)Ld4/l;

    move-result-object v0

    return-object v0
.end method

.method public final onStopped()V
    .locals 0

    invoke-super {p0}, Lic/v;->onStopped()V

    return-void
.end method

.method public final setForeground(Lic/m;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lic/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lic/v;->setForegroundAsync(Lic/m;)Lds/v;

    move-result-object p1

    const-string v0, "setForegroundAsync(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Ltx/f;->x(Lds/v;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final setProgress(Lic/g;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lic/g;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lic/v;->setProgressAsync(Lic/g;)Lds/v;

    move-result-object p1

    const-string v0, "setProgressAsync(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Ltx/f;->x(Lds/v;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final startWork()Lds/v;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lds/v;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/work/CoroutineWorker;->getCoroutineContext()Lbc3/z;

    move-result-object v0

    sget-object v1, Lic/f;->w:Lic/f;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/work/CoroutineWorker;->getCoroutineContext()Lbc3/z;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/work/CoroutineWorker;->params:Landroidx/work/WorkerParameters;

    iget-object v0, v0, Landroidx/work/WorkerParameters;->g:Lq83/j;

    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {}, Lbc3/f0;->c()Lbc3/l1;

    move-result-object v1

    invoke-interface {v0, v1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    new-instance v1, Landroidx/room/z1;

    const/4 v2, 0x5

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3, v2}, Landroidx/room/z1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, v1}, Lq83/g;->F(Lq83/j;Lc93/m;)Ld4/l;

    move-result-object v0

    return-object v0
.end method

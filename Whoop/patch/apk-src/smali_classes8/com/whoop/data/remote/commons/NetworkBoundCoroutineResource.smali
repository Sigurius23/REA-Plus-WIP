.class public abstract Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008&\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0086@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0018\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u00a6@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00028\u0000H\u00a6@\u00a2\u0006\u0004\u0008\u000e\u0010\u0006J\u0010\u0010\u000f\u001a\u00028\u0000H\u00a6@\u00a2\u0006\u0004\u0008\u000f\u0010\u0006J\u0017\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\n\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource;",
        "T",
        "",
        "<init>",
        "()V",
        "get",
        "(Lq83/d;)Ljava/lang/Object;",
        "data",
        "",
        "shouldFetch",
        "(Ljava/lang/Object;)Z",
        "Ll83/a0;",
        "cache",
        "(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;",
        "fetchFromDb",
        "fetchFromNetwork",
        "dataFromServer",
        "shouldCache",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract cache(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract fetchFromDb(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract fetchFromNetwork(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public final get(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource$get$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource$get$1;

    iget v1, v0, Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource$get$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource$get$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource$get$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource$get$1;-><init>(Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource$get$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource$get$1;->label:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-object v2, v0, Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource$get$1;->L$0:Ljava/lang/Object;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v6, v0, Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource$get$1;->label:I

    invoke-virtual {p0, v0}, Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource;->fetchFromDb(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_1
    invoke-virtual {p0, p1}, Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource;->shouldFetch(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    return-object p1

    :cond_7
    iput-object p1, v0, Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource$get$1;->L$0:Ljava/lang/Object;

    iput v5, v0, Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource$get$1;->label:I

    invoke-virtual {p0, v0}, Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource;->fetchFromNetwork(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_8

    goto :goto_4

    :cond_8
    move-object v8, v2

    move-object v2, p1

    move-object p1, v8

    :goto_2
    invoke-virtual {p0, p1}, Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource;->shouldCache(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    iput-object v7, v0, Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource$get$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource$get$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource$get$1;->label:I

    invoke-virtual {p0, p1, v0}, Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource;->cache(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto :goto_4

    :cond_9
    :goto_3
    iput-object v7, v0, Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource$get$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource$get$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource$get$1;->label:I

    invoke-virtual {p0, v0}, Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource;->fetchFromDb(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    :goto_4
    return-object v1

    :cond_a
    return-object p1

    :cond_b
    return-object v2
.end method

.method public shouldCache(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public abstract shouldFetch(Ljava/lang/Object;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation
.end method

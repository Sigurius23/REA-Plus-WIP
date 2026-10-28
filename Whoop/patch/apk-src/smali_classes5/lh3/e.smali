.class public final Llh3/e;
.super Llh3/k;
.source "SourceFile"


# instance fields
.field public final x:Llh3/d;


# direct methods
.method public constructor <init>(Llh3/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lxg3/g;-><init>(Lxg3/e;)V

    iput-object p1, p0, Llh3/e;->x:Llh3/d;

    return-void
.end method

.method public static Y()Llh3/e;
    .locals 3

    new-instance v0, Llh3/e;

    new-instance v1, Llh3/d;

    invoke-direct {v1}, Llh3/d;-><init>()V

    sget-object v2, Llh3/d;->y:[Llh3/c;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Llh3/e;-><init>(Llh3/d;)V

    return-object v0
.end method


# virtual methods
.method public final onCompleted()V
    .locals 1

    iget-object v0, p0, Llh3/e;->x:Llh3/d;

    invoke-virtual {v0}, Llh3/d;->onCompleted()V

    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Llh3/e;->x:Llh3/d;

    invoke-virtual {v0, p1}, Llh3/d;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Llh3/e;->x:Llh3/d;

    invoke-virtual {v0, p1}, Llh3/d;->onNext(Ljava/lang/Object;)V

    return-void
.end method

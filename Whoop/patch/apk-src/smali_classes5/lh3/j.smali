.class public Llh3/j;
.super Llh3/k;
.source "SourceFile"


# instance fields
.field private final x:Lih3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lih3/b;"
        }
    .end annotation
.end field

.field private final y:Llh3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/k;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Llh3/k;)V
    .locals 2

    new-instance v0, Lch3/n;

    const/4 v1, 0x3

    invoke-direct {v0, p1, v1}, Lch3/n;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p0, v0}, Lxg3/g;-><init>(Lxg3/e;)V

    iput-object p1, p0, Llh3/j;->y:Llh3/k;

    new-instance v0, Lih3/b;

    invoke-direct {v0, p1}, Lih3/b;-><init>(Lxg3/h;)V

    iput-object v0, p0, Llh3/j;->x:Lih3/b;

    return-void
.end method


# virtual methods
.method public onCompleted()V
    .locals 1

    iget-object v0, p0, Llh3/j;->x:Lih3/b;

    invoke-virtual {v0}, Lih3/b;->onCompleted()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Llh3/j;->x:Lih3/b;

    invoke-virtual {v0, p1}, Lih3/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Llh3/j;->x:Lih3/b;

    invoke-virtual {v0, p1}, Lih3/b;->onNext(Ljava/lang/Object;)V

    return-void
.end method

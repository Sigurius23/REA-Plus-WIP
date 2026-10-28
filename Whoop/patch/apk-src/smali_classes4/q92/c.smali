.class public final Lq92/c;
.super Lc83/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc83/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lq92/c;",
        "Lc83/a;",
        "Lst0/f;",
        "<init>",
        "()V",
        "Lxg3/g;",
        "c",
        "()Lxg3/g;",
        "abstractData",
        "Ll83/a0;",
        "d",
        "(Lst0/f;)V",
        "",
        "throwable",
        "onError",
        "(Ljava/lang/Throwable;)V",
        "onComplete",
        "Llh3/e;",
        "x",
        "Llh3/e;",
        "pubSub",
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
.field private final x:Llh3/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/e;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lc83/a;-><init>()V

    invoke-static {}, Llh3/e;->Y()Llh3/e;

    move-result-object v0

    iput-object v0, p0, Lq92/c;->x:Llh3/e;

    return-void
.end method


# virtual methods
.method public final c()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Lst0/f;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lq92/c;->x:Llh3/e;

    return-object v0
.end method

.method public d(Lst0/f;)V
    .locals 1

    const-string v0, "abstractData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq92/c;->x:Llh3/e;

    invoke-virtual {v0, p1}, Llh3/e;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public onComplete()V
    .locals 1

    iget-object v0, p0, Lq92/c;->x:Llh3/e;

    invoke-virtual {v0}, Llh3/e;->onCompleted()V

    invoke-virtual {p0}, Lc83/a;->dispose()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "throwable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq92/c;->x:Llh3/e;

    invoke-virtual {v0, p1}, Llh3/e;->onError(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lc83/a;->dispose()V

    return-void
.end method

.method public bridge synthetic onNext(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lst0/f;

    invoke-virtual {p0, p1}, Lq92/c;->d(Lst0/f;)V

    return-void
.end method

.class public final Lq92/a$a;
.super Lh83/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq92/a;->b(Lc83/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lh83/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0003\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "q92/a$a",
        "Lh83/a;",
        "Lst0/f;",
        "Ll83/a0;",
        "onComplete",
        "()V",
        "t",
        "c",
        "(Lst0/f;)V",
        "",
        "onError",
        "(Ljava/lang/Throwable;)V",
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
.field final synthetic x:Lc83/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc83/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc83/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc83/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lq92/a$a;->x:Lc83/a;

    invoke-direct {p0}, Lh83/a;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lst0/f;)V
    .locals 1

    const-string v0, "t"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq92/a$a;->x:Lc83/a;

    invoke-interface {v0, p1}, Ll73/d;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public onComplete()V
    .locals 1

    iget-object v0, p0, Lq92/a$a;->x:Lc83/a;

    invoke-interface {v0}, Ll73/d;->onComplete()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "t"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq92/a$a;->x:Lc83/a;

    invoke-interface {v0, p1}, Ll73/d;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public bridge synthetic onNext(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lst0/f;

    invoke-virtual {p0, p1}, Lq92/a$a;->c(Lst0/f;)V

    return-void
.end method

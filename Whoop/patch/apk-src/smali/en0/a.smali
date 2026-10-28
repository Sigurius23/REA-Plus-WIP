.class public abstract Len0/a;
.super Lc83/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lc83/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0003\n\u0002\u0008\u0006\u0008&\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0003B\u0013\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00028\u0000H&\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Len0/a;",
        "",
        "T",
        "Lc83/a;",
        "Landroid/os/Handler;",
        "handler",
        "<init>",
        "(Landroid/os/Handler;)V",
        "returnedObj",
        "Ll83/a0;",
        "d",
        "(Ljava/lang/Object;)V",
        "onComplete",
        "()V",
        "abstractData",
        "onNext",
        "",
        "throwable",
        "onError",
        "(Ljava/lang/Throwable;)V",
        "x",
        "Landroid/os/Handler;",
        "essentials_release"
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
.field private x:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0}, Lc83/a;-><init>()V

    iput-object p1, p0, Len0/a;->x:Landroid/os/Handler;

    if-nez p1, :cond_0

    :try_start_0
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Len0/a;->x:Landroid/os/Handler;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static synthetic c(Len0/a;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Len0/a;->e(Len0/a;Ljava/lang/Object;)V

    return-void
.end method

.method private static final e(Len0/a;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Len0/a;->d(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public abstract d(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public onComplete()V
    .locals 0

    invoke-virtual {p0}, Lc83/a;->dispose()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "throwable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lc83/a;->dispose()V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    const-string v0, "abstractData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Len0/a;->x:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Landroidx/lifecycle/m;

    const/4 v2, 0x4

    invoke-direct {v1, v2, p0, p1}, Landroidx/lifecycle/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Len0/a;->d(Ljava/lang/Object;)V

    return-void
.end method

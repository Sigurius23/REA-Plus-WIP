.class public interface abstract Lvm0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008f\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J/\u0010\u000b\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u00072\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\tH&\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ+\u0010\u0011\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u00072\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0010\u001a\u00020\u000fH&\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H&\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\'\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H&\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H&\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0004H\u00a6@\u00a2\u0006\u0004\u0008$\u0010%\u00a8\u0006&\u00c0\u0006\u0003"
    }
    d2 = {
        "Lvm0/g;",
        "",
        "Lym0/b;",
        "result",
        "Ll83/a0;",
        "j",
        "(Lym0/b;)V",
        "T",
        "Lxm0/a;",
        "",
        "statusCode",
        "c",
        "(Lxm0/a;Ljava/lang/Integer;)V",
        "Lnm0/c;",
        "request",
        "Lvm0/h;",
        "lifecycle",
        "b",
        "(Lnm0/c;Lvm0/h;)V",
        "",
        "uri",
        "",
        "throwable",
        "a",
        "(Ljava/lang/String;Ljava/lang/Throwable;)V",
        "endpoint",
        "h",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V",
        "g",
        "(I)V",
        "e",
        "()V",
        "Lvm0/f;",
        "operation",
        "f",
        "(Lvm0/f;)V",
        "d",
        "(Lq83/d;)Ljava/lang/Object;",
        "cache_release"
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
.method public static synthetic i(Lvm0/g;Lxm0/a;Ljava/lang/Integer;ILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-interface {p0, p1, p2}, Lvm0/g;->c(Lxm0/a;Ljava/lang/Integer;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: reportApiStreamResult"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public abstract b(Lnm0/c;Lvm0/h;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lnm0/c<",
            "TT;>;",
            "Lvm0/h;",
            ")V"
        }
    .end annotation
.end method

.method public abstract c(Lxm0/a;Ljava/lang/Integer;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lxm0/a<",
            "TT;>;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation
.end method

.method public abstract d(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract e()V
.end method

.method public abstract f(Lvm0/f;)V
.end method

.method public abstract g(I)V
.end method

.method public abstract h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public abstract j(Lym0/b;)V
.end method

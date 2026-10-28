.class public interface abstract Lca2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\r\u0010\u0008J\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H&\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016\u00c0\u0006\u0003"
    }
    d2 = {
        "Lca2/f;",
        "",
        "Ljk0/d;",
        "strap",
        "",
        "jobTag",
        "Ll83/a0;",
        "b",
        "(Ljk0/d;Ljava/lang/String;)V",
        "",
        "processNow",
        "a",
        "(Ljk0/d;ZLjava/lang/String;)V",
        "d",
        "Lec3/l;",
        "Lts0/c;",
        "e",
        "(Ljava/lang/String;)Lec3/l;",
        "Ljava/lang/Runnable;",
        "listener",
        "f",
        "(Ljava/lang/Runnable;)Ljava/lang/Runnable;",
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
.method public static synthetic c(Lca2/f;Ljk0/d;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-string p2, ""

    :cond_0
    invoke-interface {p0, p1, p2}, Lca2/f;->b(Ljk0/d;Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: startSync"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract a(Ljk0/d;ZLjava/lang/String;)V
.end method

.method public abstract b(Ljk0/d;Ljava/lang/String;)V
.end method

.method public abstract d(Ljk0/d;Ljava/lang/String;)V
.end method

.method public abstract e(Ljava/lang/String;)Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation
.end method

.method public abstract f(Ljava/lang/Runnable;)Ljava/lang/Runnable;
.end method

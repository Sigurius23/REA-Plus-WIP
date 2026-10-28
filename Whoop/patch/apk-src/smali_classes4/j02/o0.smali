.class public interface abstract Lj02/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u000c2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\n\u00a8\u0006\u0010\u00c0\u0006\u0003"
    }
    d2 = {
        "Lj02/o0;",
        "",
        "Lj02/m0;",
        "navigationScreen",
        "Lj02/p0;",
        "b",
        "(Lj02/m0;)Lj02/p0;",
        "Lcom/whoop/navigation/e;",
        "navigationAction",
        "a",
        "(Lcom/whoop/navigation/e;)Lj02/p0;",
        "destination",
        "",
        "e",
        "(Lcom/whoop/navigation/e;)Z",
        "d",
        "navigation_release"
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
.method public static synthetic c(Lj02/o0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Z
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-interface {p0, p1}, Lj02/o0;->e(Lcom/whoop/navigation/e;)Z

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: navigateToShopTabIfConfigured"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract a(Lcom/whoop/navigation/e;)Lj02/p0;
.end method

.method public abstract b(Lj02/m0;)Lj02/p0;
    .annotation runtime Ll83/c;
    .end annotation
.end method

.method public abstract d(Lcom/whoop/navigation/e;)Lj02/p0;
.end method

.method public abstract e(Lcom/whoop/navigation/e;)Z
.end method

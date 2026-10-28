.class public interface abstract Lfw1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008p\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0004R\u0014\u0010\u0008\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0004\u0082\u0001\u0004\t\n\u000b\u000c\u00a8\u0006\r\u00c0\u0006\u0003"
    }
    d2 = {
        "Lfw1/c;",
        "",
        "",
        "a",
        "()Z",
        "isLoading",
        "isError",
        "b",
        "isSuccess",
        "Lfw1/a;",
        "Lfw1/e;",
        "Lfw1/f;",
        "Lfw1/g;",
        "membership_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a()Z
.end method

.method public b()Z
    .locals 1

    invoke-interface {p0}, Lfw1/c;->a()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p0}, Lfw1/c;->isError()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public abstract isError()Z
.end method

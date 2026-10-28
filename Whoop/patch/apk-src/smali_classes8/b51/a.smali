.class public interface abstract Lb51/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u000f\u0008f\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u001c\u0010\r\u001a\u00020\u00088&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR\u001c\u0010\u0010\u001a\u00020\u00088&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000e\u0010\n\"\u0004\u0008\u000f\u0010\u000cR\u001c\u0010\u0013\u001a\u00020\u00088&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0011\u0010\n\"\u0004\u0008\u0012\u0010\u000cR\u001c\u0010\u0016\u001a\u00020\u00088&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0014\u0010\n\"\u0004\u0008\u0015\u0010\u000c\u00a8\u0006\u0017\u00c0\u0006\u0003"
    }
    d2 = {
        "Lb51/a;",
        "",
        "",
        "px",
        "py",
        "",
        "c",
        "(II)Z",
        "",
        "a",
        "()F",
        "setX",
        "(F)V",
        "x",
        "b",
        "setY",
        "y",
        "getWidth",
        "setWidth",
        "width",
        "getHeight",
        "setHeight",
        "height",
        "design_release"
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
.method public abstract a()F
.end method

.method public abstract b()F
.end method

.method public c(II)Z
    .locals 2

    int-to-float p1, p1

    invoke-interface {p0}, Lb51/a;->a()F

    move-result v0

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    invoke-interface {p0}, Lb51/a;->a()F

    move-result v0

    invoke-interface {p0}, Lb51/a;->getWidth()F

    move-result v1

    add-float/2addr v1, v0

    cmpg-float p1, p1, v1

    if-gtz p1, :cond_0

    int-to-float p1, p2

    invoke-interface {p0}, Lb51/a;->b()F

    move-result p2

    cmpl-float p2, p1, p2

    if-ltz p2, :cond_0

    invoke-interface {p0}, Lb51/a;->b()F

    move-result p2

    invoke-interface {p0}, Lb51/a;->getHeight()F

    move-result v0

    add-float/2addr v0, p2

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public abstract getHeight()F
.end method

.method public abstract getWidth()F
.end method

.class public abstract Lz41/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lz41/k;",
        "Lb51/a;",
        "drawArea",
        "Lz41/k$a;",
        "a",
        "(Lz41/k;Lb51/a;)Lz41/k$a;",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lz41/k;Lb51/a;)Lz41/k$a;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "drawArea"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lz41/k$a;

    if-eqz v0, :cond_0

    new-instance p1, Lz41/k$a;

    check-cast p0, Lz41/k$a;

    invoke-virtual {p0}, Lz41/k$a;->a()F

    move-result v0

    invoke-virtual {p0}, Lz41/k$a;->b()F

    move-result p0

    invoke-direct {p1, v0, p0}, Lz41/k$a;-><init>(FF)V

    return-object p1

    :cond_0
    instance-of v0, p0, Lz41/k$b;

    if-eqz v0, :cond_1

    new-instance v0, Lz41/k$a;

    invoke-interface {p1}, Lb51/a;->getWidth()F

    move-result v1

    check-cast p0, Lz41/k$b;

    invoke-virtual {p0}, Lz41/k$b;->a()D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-interface {p1}, Lb51/a;->getHeight()F

    move-result p1

    invoke-virtual {p0}, Lz41/k$b;->b()D

    move-result-wide v2

    double-to-float p0, v2

    mul-float/2addr p1, p0

    invoke-direct {v0, v1, p1}, Lz41/k$a;-><init>(FF)V

    return-object v0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

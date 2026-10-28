.class public abstract Lcp0/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "",
        "configHeightPx",
        "measuredHeightPx",
        "rawImeHeightPx",
        "",
        "a",
        "(FFF)Z",
        "bottomEdgePx",
        "rootHeightPx",
        "fadePx",
        "Lcp0/h1;",
        "b",
        "(FFF)Lcp0/h1;",
        "coach-everywhere_release"
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
.method public static final a(FFF)Z
    .locals 3

    const/4 v0, 0x0

    cmpg-float v1, p2, v0

    const/4 v2, 0x0

    if-lez v1, :cond_1

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x3f000000    # 0.5f

    mul-float/2addr v0, p2

    const/high16 v1, 0x3fc00000    # 1.5f

    mul-float/2addr p2, v1

    sub-float/2addr p0, p1

    cmpg-float p1, v0, p0

    if-gtz p1, :cond_1

    cmpg-float p0, p0, p2

    if-gtz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    return v2
.end method

.method public static final b(FFF)Lcp0/h1;
    .locals 2

    cmpg-float v0, p1, p0

    if-gtz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sub-float p2, p0, p2

    const/4 v0, 0x0

    cmpg-float v1, p2, v0

    if-gez v1, :cond_1

    move p2, v0

    :cond_1
    new-instance v0, Lcp0/h1;

    sub-float/2addr p1, p2

    sub-float/2addr p0, p2

    div-float/2addr p0, p1

    invoke-direct {v0, p2, p1, p0}, Lcp0/h1;-><init>(FFF)V

    return-object v0
.end method

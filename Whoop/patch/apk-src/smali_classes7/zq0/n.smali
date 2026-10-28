.class public abstract Lzq0/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a+\u0010\n\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "",
        "touchRegionFixEnabled",
        "",
        "b",
        "(Z)F",
        "Lh2/b;",
        "",
        "containerWidth",
        "isRtl",
        "leadingFraction",
        "a",
        "(JIZF)Z",
        "community-everyday-stats_release"
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
.method public static final a(JIZF)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/16 v2, 0x20

    if-eqz p3, :cond_1

    shr-long/2addr p0, v2

    long-to-int p0, p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    int-to-float p1, p2

    const/high16 p2, 0x3f800000    # 1.0f

    sub-float/2addr p2, p4

    mul-float/2addr p2, p1

    cmpl-float p0, p0, p2

    if-lez p0, :cond_0

    return v1

    :cond_0
    return v0

    :cond_1
    shr-long/2addr p0, v2

    long-to-int p0, p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    int-to-float p1, p2

    mul-float/2addr p1, p4

    cmpg-float p0, p0, p1

    if-gtz p0, :cond_2

    return v1

    :cond_2
    return v0
.end method

.method public static final b(Z)F
    .locals 0

    if-eqz p0, :cond_0

    const p0, 0x3e99999a    # 0.3f

    return p0

    :cond_0
    const/high16 p0, 0x3f000000    # 0.5f

    return p0
.end method

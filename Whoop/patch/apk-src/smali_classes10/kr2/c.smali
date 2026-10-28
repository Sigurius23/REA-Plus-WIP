.class public abstract Lkr2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "",
        "pxHeight",
        "",
        "systemDensityValue",
        "a",
        "(IF)F",
        "user-journey_release"
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
.method public static final a(IF)F
    .locals 1

    const/16 v0, 0x7d0

    if-gt p0, v0, :cond_0

    const p0, 0x40266666    # 2.6f

    invoke-static {p1, p0}, Ljava/lang/Math;->min(FF)F

    move-result p0

    return p0

    :cond_0
    const/16 v0, 0x8fc

    if-gt p0, v0, :cond_1

    const p0, 0x402ccccd    # 2.7f

    invoke-static {p1, p0}, Ljava/lang/Math;->min(FF)F

    move-result p0

    return p0

    :cond_1
    const/16 v0, 0xa8c

    if-gt p0, v0, :cond_2

    const p0, 0x40333333    # 2.8f

    invoke-static {p1, p0}, Ljava/lang/Math;->min(FF)F

    move-result p0

    return p0

    :cond_2
    const/16 v0, 0xbb8

    if-gt p0, v0, :cond_3

    const p0, 0x404ccccd    # 3.2f

    invoke-static {p1, p0}, Ljava/lang/Math;->min(FF)F

    move-result p0

    return p0

    :cond_3
    return p1
.end method

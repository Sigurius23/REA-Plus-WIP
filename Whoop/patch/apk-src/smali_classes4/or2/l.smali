.class public abstract Lor2/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(F)F
    .locals 1

    const v0, 0x40228f5c    # 2.54f

    div-float/2addr p0, v0

    return p0
.end method

.method public static b(F)F
    .locals 1

    const v0, 0x400d1889

    mul-float/2addr p0, v0

    return p0
.end method

.method public static c(F)F
    .locals 1

    const v0, 0x400d1889

    div-float/2addr p0, v0

    return p0
.end method

.method public static d(D)I
    .locals 2

    const-wide v0, 0x3fce97bd6dd69499L    # 0.239005736

    mul-double/2addr p0, v0

    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    move-result-wide p0

    long-to-int p0, p0

    return p0
.end method

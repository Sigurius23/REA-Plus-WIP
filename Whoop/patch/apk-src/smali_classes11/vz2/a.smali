.class public abstract Lvz2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(I)I
    .locals 0

    mul-int/lit8 p0, p0, 0x10

    div-int/lit8 p0, p0, 0x9

    return p0
.end method

.method public static b(I)I
    .locals 0

    mul-int/lit8 p0, p0, 0x9

    div-int/lit8 p0, p0, 0x10

    return p0
.end method

.method public static c(II)Z
    .locals 0

    mul-int/lit8 p0, p0, 0x9

    div-int/lit8 p0, p0, 0x10

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

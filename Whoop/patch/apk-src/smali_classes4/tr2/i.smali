.class public abstract Ltr2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(I)C
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x4

    if-eq p0, v0, :cond_2

    const/16 v0, 0x8

    if-eq p0, v0, :cond_1

    const/16 v0, 0x10

    if-eq p0, v0, :cond_0

    const/16 p0, 0x3f

    return p0

    :cond_0
    const/16 p0, 0x45

    return p0

    :cond_1
    const/16 p0, 0x57

    return p0

    :cond_2
    const/16 p0, 0x49

    return p0

    :cond_3
    const/16 p0, 0x44

    return p0

    :cond_4
    const/16 p0, 0x56

    return p0
.end method

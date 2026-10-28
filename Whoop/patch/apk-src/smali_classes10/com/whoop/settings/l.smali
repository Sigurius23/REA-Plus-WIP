.class public abstract Lcom/whoop/settings/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0012\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\'\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u001f\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\'\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\'\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "",
        "isModal",
        "",
        "statusBarTop",
        "a",
        "(ZI)I",
        "modalTopPx",
        "nonModalTopPx",
        "b",
        "(ZII)I",
        "sectionGated",
        "c",
        "(ZZ)Z",
        "featureFlagEnabled",
        "movedToDeviceSettings",
        "d",
        "(ZZZ)Z",
        "giftGated",
        "shopGated",
        "e",
        "app_prodStandardRelease"
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
.method public static final a(ZI)I
    .locals 0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    return p1
.end method

.method public static final b(ZII)I
    .locals 0

    if-eqz p0, :cond_0

    return p1

    :cond_0
    return p2
.end method

.method public static final c(ZZ)Z
    .locals 0

    if-nez p0, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final d(ZZZ)Z
    .locals 0

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    if-nez p2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final e(ZZZ)Z
    .locals 0

    if-eqz p1, :cond_1

    invoke-static {p0, p2}, Lcom/whoop/settings/l;->c(ZZ)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

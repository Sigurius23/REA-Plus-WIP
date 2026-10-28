.class public abstract Lgi1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a-\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "enabled",
        "hasPermission",
        "hasRequestedBefore",
        "shouldShowPermissionRationale",
        "Lgi1/d;",
        "a",
        "(ZZZZ)Lgi1/d;",
        "isGranted",
        "b",
        "(Z)Lgi1/d;",
        "gps-tracking_release"
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
.method public static final a(ZZZZ)Lgi1/d;
    .locals 0

    if-nez p0, :cond_0

    sget-object p0, Lgi1/d$a;->a:Lgi1/d$a;

    return-object p0

    :cond_0
    if-eqz p1, :cond_1

    sget-object p0, Lgi1/d$b;->a:Lgi1/d$b;

    return-object p0

    :cond_1
    if-eqz p2, :cond_2

    if-nez p3, :cond_2

    sget-object p0, Lgi1/d$c;->a:Lgi1/d$c;

    return-object p0

    :cond_2
    sget-object p0, Lgi1/d$d;->a:Lgi1/d$d;

    return-object p0
.end method

.method public static final b(Z)Lgi1/d;
    .locals 0

    if-eqz p0, :cond_0

    sget-object p0, Lgi1/d$b;->a:Lgi1/d$b;

    return-object p0

    :cond_0
    sget-object p0, Lgi1/d$a;->a:Lgi1/d$a;

    return-object p0
.end method

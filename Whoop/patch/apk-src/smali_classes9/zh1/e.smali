.class public abstract Lzh1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Landroid/location/Location;",
        "Lfv1/b;",
        "b",
        "(Landroid/location/Location;)Lfv1/b;",
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
.method public static final synthetic a(Landroid/location/Location;)Lfv1/b;
    .locals 0

    invoke-static {p0}, Lzh1/e;->b(Landroid/location/Location;)Lfv1/b;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Landroid/location/Location;)Lfv1/b;
    .locals 13

    new-instance v0, Lfv1/b;

    invoke-virtual {p0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-virtual {p0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-virtual {p0}, Landroid/location/Location;->getAltitude()D

    move-result-wide v5

    invoke-virtual {p0}, Landroid/location/Location;->getAccuracy()F

    move-result v7

    float-to-double v7, v7

    invoke-virtual {p0}, Landroid/location/Location;->getVerticalAccuracyMeters()F

    move-result v9

    float-to-double v9, v9

    invoke-virtual {p0}, Landroid/location/Location;->getTime()J

    move-result-wide v11

    invoke-direct/range {v0 .. v12}, Lfv1/b;-><init>(DDDDDJ)V

    return-object v0
.end method

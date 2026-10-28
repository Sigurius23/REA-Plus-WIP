.class public abstract Lwk2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lfv1/b;",
        "Landroid/location/Location;",
        "b",
        "(Lfv1/b;)Landroid/location/Location;",
        "track-activity_release"
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
.method public static final synthetic a(Lfv1/b;)Landroid/location/Location;
    .locals 0

    invoke-static {p0}, Lwk2/h;->b(Lfv1/b;)Landroid/location/Location;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lfv1/b;)Landroid/location/Location;
    .locals 3

    new-instance v0, Landroid/location/Location;

    const-string v1, "track-session"

    invoke-direct {v0, v1}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lfv1/b;->c()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setLatitude(D)V

    invoke-virtual {p0}, Lfv1/b;->d()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setLongitude(D)V

    invoke-virtual {p0}, Lfv1/b;->a()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setAltitude(D)V

    invoke-virtual {p0}, Lfv1/b;->b()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/location/Location;->setAccuracy(F)V

    invoke-virtual {p0}, Lfv1/b;->e()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setTime(J)V

    return-object v0
.end method

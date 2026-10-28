.class public abstract Lki1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Landroid/location/Location;",
        "",
        "trigger",
        "Lyh1/a;",
        "a",
        "(Landroid/location/Location;Ljava/lang/String;)Lyh1/a;",
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
.method public static final a(Landroid/location/Location;Ljava/lang/String;)Lyh1/a;
    .locals 16

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/location/Location;->getSpeed()F

    move-result v0

    float-to-double v3, v0

    invoke-virtual {v1}, Landroid/location/Location;->hasSpeedAccuracy()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Landroid/location/Location;->getSpeedAccuracyMetersPerSecond()F

    move-result v0

    float-to-double v5, v0

    :goto_0
    move-wide v6, v5

    goto :goto_1

    :cond_0
    const-wide/16 v5, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {v1}, Landroid/location/Location;->hasSpeed()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v2, Lyh1/b;->d:Lyh1/b$a;

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v9}, Lyh1/b$a;->b(Lyh1/b$a;DLjava/lang/String;DILjava/lang/Object;)Lyh1/b;

    move-result-object v0

    :goto_2
    move-object v14, v0

    goto :goto_3

    :cond_1
    const/4 v0, 0x0

    goto :goto_2

    :goto_3
    new-instance v1, Lyh1/a;

    invoke-virtual/range {p0 .. p0}, Landroid/location/Location;->getTime()J

    move-result-wide v2

    invoke-virtual/range {p0 .. p0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    invoke-virtual/range {p0 .. p0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v6

    invoke-virtual/range {p0 .. p0}, Landroid/location/Location;->getAltitude()D

    move-result-wide v8

    invoke-virtual/range {p0 .. p0}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    float-to-double v10, v0

    invoke-virtual/range {p0 .. p0}, Landroid/location/Location;->getVerticalAccuracyMeters()F

    move-result v0

    float-to-double v12, v0

    move-object/from16 v15, p1

    invoke-direct/range {v1 .. v15}, Lyh1/a;-><init>(JDDDDDLyh1/b;Ljava/lang/String;)V

    return-object v1
.end method

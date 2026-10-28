.class public final Lcom/whoop/data/local/room/entity/GpsDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0012JL\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008!\u0010\"R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010#\u001a\u0004\u0008$\u0010\u0010\"\u0004\u0008%\u0010&R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\'\u001a\u0004\u0008(\u0010\u0012\"\u0004\u0008)\u0010*R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010\'\u001a\u0004\u0008+\u0010\u0012\"\u0004\u0008,\u0010*R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\'\u001a\u0004\u0008-\u0010\u0012\"\u0004\u0008.\u0010*R\"\u0010\u0008\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\'\u001a\u0004\u0008/\u0010\u0012\"\u0004\u00080\u0010*R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\'\u001a\u0004\u00081\u0010\u0012\"\u0004\u00082\u0010*\u00a8\u00063"
    }
    d2 = {
        "Lcom/whoop/data/local/room/entity/GpsDto;",
        "",
        "",
        "timeStamp",
        "",
        "latitude",
        "longitude",
        "altitude",
        "horizontalAccuracy",
        "verticalAccuracy",
        "<init>",
        "(JDDDDD)V",
        "Lp92/h$a;",
        "toRoutePoint",
        "()Lp92/h$a;",
        "component1",
        "()J",
        "component2",
        "()D",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "(JDDDDD)Lcom/whoop/data/local/room/entity/GpsDto;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "J",
        "getTimeStamp",
        "setTimeStamp",
        "(J)V",
        "D",
        "getLatitude",
        "setLatitude",
        "(D)V",
        "getLongitude",
        "setLongitude",
        "getAltitude",
        "setAltitude",
        "getHorizontalAccuracy",
        "setHorizontalAccuracy",
        "getVerticalAccuracy",
        "setVerticalAccuracy",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private altitude:D

.field private horizontalAccuracy:D

.field private latitude:D

.field private longitude:D

.field private timeStamp:J

.field private verticalAccuracy:D


# direct methods
.method public constructor <init>(JDDDDD)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/whoop/data/local/room/entity/GpsDto;->timeStamp:J

    iput-wide p3, p0, Lcom/whoop/data/local/room/entity/GpsDto;->latitude:D

    iput-wide p5, p0, Lcom/whoop/data/local/room/entity/GpsDto;->longitude:D

    iput-wide p7, p0, Lcom/whoop/data/local/room/entity/GpsDto;->altitude:D

    iput-wide p9, p0, Lcom/whoop/data/local/room/entity/GpsDto;->horizontalAccuracy:D

    iput-wide p11, p0, Lcom/whoop/data/local/room/entity/GpsDto;->verticalAccuracy:D

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/local/room/entity/GpsDto;JDDDDDILjava/lang/Object;)Lcom/whoop/data/local/room/entity/GpsDto;
    .locals 13

    and-int/lit8 v0, p13, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Lcom/whoop/data/local/room/entity/GpsDto;->timeStamp:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p13, 0x2

    if-eqz p1, :cond_1

    iget-wide p1, p0, Lcom/whoop/data/local/room/entity/GpsDto;->latitude:D

    move-wide v3, p1

    goto :goto_0

    :cond_1
    move-wide/from16 v3, p3

    :goto_0
    and-int/lit8 p1, p13, 0x4

    if-eqz p1, :cond_2

    iget-wide p1, p0, Lcom/whoop/data/local/room/entity/GpsDto;->longitude:D

    move-wide v5, p1

    goto :goto_1

    :cond_2
    move-wide/from16 v5, p5

    :goto_1
    and-int/lit8 p1, p13, 0x8

    if-eqz p1, :cond_3

    iget-wide p1, p0, Lcom/whoop/data/local/room/entity/GpsDto;->altitude:D

    move-wide v7, p1

    goto :goto_2

    :cond_3
    move-wide/from16 v7, p7

    :goto_2
    and-int/lit8 p1, p13, 0x10

    if-eqz p1, :cond_4

    iget-wide p1, p0, Lcom/whoop/data/local/room/entity/GpsDto;->horizontalAccuracy:D

    move-wide v9, p1

    goto :goto_3

    :cond_4
    move-wide/from16 v9, p9

    :goto_3
    and-int/lit8 p1, p13, 0x20

    if-eqz p1, :cond_5

    iget-wide p1, p0, Lcom/whoop/data/local/room/entity/GpsDto;->verticalAccuracy:D

    move-wide v11, p1

    :goto_4
    move-object v0, p0

    goto :goto_5

    :cond_5
    move-wide/from16 v11, p11

    goto :goto_4

    :goto_5
    invoke-virtual/range {v0 .. v12}, Lcom/whoop/data/local/room/entity/GpsDto;->copy(JDDDDD)Lcom/whoop/data/local/room/entity/GpsDto;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/GpsDto;->timeStamp:J

    return-wide v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/GpsDto;->latitude:D

    return-wide v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/GpsDto;->longitude:D

    return-wide v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/GpsDto;->altitude:D

    return-wide v0
.end method

.method public final component5()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/GpsDto;->horizontalAccuracy:D

    return-wide v0
.end method

.method public final component6()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/GpsDto;->verticalAccuracy:D

    return-wide v0
.end method

.method public final copy(JDDDDD)Lcom/whoop/data/local/room/entity/GpsDto;
    .locals 13

    new-instance v0, Lcom/whoop/data/local/room/entity/GpsDto;

    move-wide v1, p1

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move-wide/from16 v7, p7

    move-wide/from16 v9, p9

    move-wide/from16 v11, p11

    invoke-direct/range {v0 .. v12}, Lcom/whoop/data/local/room/entity/GpsDto;-><init>(JDDDDD)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/local/room/entity/GpsDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/local/room/entity/GpsDto;

    iget-wide v3, p0, Lcom/whoop/data/local/room/entity/GpsDto;->timeStamp:J

    iget-wide v5, p1, Lcom/whoop/data/local/room/entity/GpsDto;->timeStamp:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/data/local/room/entity/GpsDto;->latitude:D

    iget-wide v5, p1, Lcom/whoop/data/local/room/entity/GpsDto;->latitude:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/whoop/data/local/room/entity/GpsDto;->longitude:D

    iget-wide v5, p1, Lcom/whoop/data/local/room/entity/GpsDto;->longitude:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/whoop/data/local/room/entity/GpsDto;->altitude:D

    iget-wide v5, p1, Lcom/whoop/data/local/room/entity/GpsDto;->altitude:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/whoop/data/local/room/entity/GpsDto;->horizontalAccuracy:D

    iget-wide v5, p1, Lcom/whoop/data/local/room/entity/GpsDto;->horizontalAccuracy:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lcom/whoop/data/local/room/entity/GpsDto;->verticalAccuracy:D

    iget-wide v5, p1, Lcom/whoop/data/local/room/entity/GpsDto;->verticalAccuracy:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAltitude()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/GpsDto;->altitude:D

    return-wide v0
.end method

.method public final getHorizontalAccuracy()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/GpsDto;->horizontalAccuracy:D

    return-wide v0
.end method

.method public final getLatitude()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/GpsDto;->latitude:D

    return-wide v0
.end method

.method public final getLongitude()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/GpsDto;->longitude:D

    return-wide v0
.end method

.method public final getTimeStamp()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/GpsDto;->timeStamp:J

    return-wide v0
.end method

.method public final getVerticalAccuracy()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/GpsDto;->verticalAccuracy:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/GpsDto;->timeStamp:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/data/local/room/entity/GpsDto;->latitude:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/data/local/room/entity/GpsDto;->longitude:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/data/local/room/entity/GpsDto;->altitude:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/data/local/room/entity/GpsDto;->horizontalAccuracy:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v1, p0, Lcom/whoop/data/local/room/entity/GpsDto;->verticalAccuracy:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final setAltitude(D)V
    .locals 0

    iput-wide p1, p0, Lcom/whoop/data/local/room/entity/GpsDto;->altitude:D

    return-void
.end method

.method public final setHorizontalAccuracy(D)V
    .locals 0

    iput-wide p1, p0, Lcom/whoop/data/local/room/entity/GpsDto;->horizontalAccuracy:D

    return-void
.end method

.method public final setLatitude(D)V
    .locals 0

    iput-wide p1, p0, Lcom/whoop/data/local/room/entity/GpsDto;->latitude:D

    return-void
.end method

.method public final setLongitude(D)V
    .locals 0

    iput-wide p1, p0, Lcom/whoop/data/local/room/entity/GpsDto;->longitude:D

    return-void
.end method

.method public final setTimeStamp(J)V
    .locals 0

    iput-wide p1, p0, Lcom/whoop/data/local/room/entity/GpsDto;->timeStamp:J

    return-void
.end method

.method public final setVerticalAccuracy(D)V
    .locals 0

    iput-wide p1, p0, Lcom/whoop/data/local/room/entity/GpsDto;->verticalAccuracy:D

    return-void
.end method

.method public final toRoutePoint()Lp92/h$a;
    .locals 4

    new-instance v0, Landroid/location/Location;

    const-string v1, "GPS"

    invoke-direct {v0, v1}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/whoop/data/local/room/entity/GpsDto;->latitude:D

    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setLatitude(D)V

    iget-wide v1, p0, Lcom/whoop/data/local/room/entity/GpsDto;->longitude:D

    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setLongitude(D)V

    iget-wide v1, p0, Lcom/whoop/data/local/room/entity/GpsDto;->altitude:D

    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setAltitude(D)V

    iget-wide v1, p0, Lcom/whoop/data/local/room/entity/GpsDto;->horizontalAccuracy:D

    double-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/location/Location;->setAccuracy(F)V

    iget-wide v1, p0, Lcom/whoop/data/local/room/entity/GpsDto;->verticalAccuracy:D

    double-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/location/Location;->setVerticalAccuracyMeters(F)V

    new-instance v1, Lp92/h$a;

    iget-wide v2, p0, Lcom/whoop/data/local/room/entity/GpsDto;->timeStamp:J

    invoke-direct {v1, v0, v2, v3}, Lp92/h$a;-><init>(Landroid/location/Location;J)V

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/GpsDto;->timeStamp:J

    iget-wide v2, p0, Lcom/whoop/data/local/room/entity/GpsDto;->latitude:D

    iget-wide v4, p0, Lcom/whoop/data/local/room/entity/GpsDto;->longitude:D

    iget-wide v6, p0, Lcom/whoop/data/local/room/entity/GpsDto;->altitude:D

    iget-wide v8, p0, Lcom/whoop/data/local/room/entity/GpsDto;->horizontalAccuracy:D

    iget-wide v10, p0, Lcom/whoop/data/local/room/entity/GpsDto;->verticalAccuracy:D

    const-string v12, "GpsDto(timeStamp="

    const-string v13, ", latitude="

    invoke-static {v0, v1, v12, v13}, Lyb0/f;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", longitude="

    const-string v2, ", altitude="

    invoke-static {v0, v1, v4, v5, v2}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", horizontalAccuracy="

    const-string v2, ", verticalAccuracy="

    invoke-static {v0, v1, v8, v9, v2}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    const-string v1, ")"

    invoke-static {v10, v11, v1, v0}, Lq63/c;->f(DLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/mapbox/maps/GroupPerformanceStatistics;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final durationMillis:D

.field private final name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/mapbox/maps/loader/MapboxMapsInitializerImpl;

    invoke-static {v0}, Lcom/mapbox/common/BaseMapboxInitializer;->init(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(DLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/mapbox/maps/GroupPerformanceStatistics;->durationMillis:D

    iput-object p3, p0, Lcom/mapbox/maps/GroupPerformanceStatistics;->name:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_4

    const-class v2, Lcom/mapbox/maps/GroupPerformanceStatistics;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/mapbox/maps/GroupPerformanceStatistics;

    iget-wide v2, p0, Lcom/mapbox/maps/GroupPerformanceStatistics;->durationMillis:D

    iget-wide v4, p1, Lcom/mapbox/maps/GroupPerformanceStatistics;->durationMillis:D

    invoke-static {v2, v3, v4, v5}, Lcom/mapbox/bindgen/PartialEq;->compare(DD)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lcom/mapbox/maps/GroupPerformanceStatistics;->name:Ljava/lang/String;

    iget-object p1, p1, Lcom/mapbox/maps/GroupPerformanceStatistics;->name:Ljava/lang/String;

    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    return v0

    :cond_4
    :goto_0
    return v1
.end method

.method public getDurationMillis()D
    .locals 2

    iget-wide v0, p0, Lcom/mapbox/maps/GroupPerformanceStatistics;->durationMillis:D

    return-wide v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/GroupPerformanceStatistics;->name:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/mapbox/maps/GroupPerformanceStatistics;->durationMillis:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iget-object v1, p0, Lcom/mapbox/maps/GroupPerformanceStatistics;->name:Ljava/lang/String;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[durationMillis: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/mapbox/maps/GroupPerformanceStatistics;->durationMillis:D

    const-string v3, ", name: "

    invoke-static {v1, v2, v3, v0}, Lc13/a;->s(DLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v1, p0, Lcom/mapbox/maps/GroupPerformanceStatistics;->name:Ljava/lang/String;

    const-string v2, "]"

    invoke-static {v1, v2, v0}, Lc13/a;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

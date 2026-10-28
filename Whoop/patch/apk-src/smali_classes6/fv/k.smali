.class public final synthetic Lfv/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/TypeEvaluator;


# instance fields
.field public final synthetic a:Lfv/n;

.field public final synthetic b:D

.field public final synthetic c:Lcom/mapbox/maps/MercatorCoordinate;

.field public final synthetic d:Lcom/mapbox/maps/MercatorCoordinate;

.field public final synthetic e:D

.field public final synthetic f:Z

.field public final synthetic g:D

.field public final synthetic h:D

.field public final synthetic i:D


# direct methods
.method public synthetic constructor <init>(Lfv/n;DLcom/mapbox/maps/MercatorCoordinate;Lcom/mapbox/maps/MercatorCoordinate;DZDDD)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfv/k;->a:Lfv/n;

    iput-wide p2, p0, Lfv/k;->b:D

    iput-object p4, p0, Lfv/k;->c:Lcom/mapbox/maps/MercatorCoordinate;

    iput-object p5, p0, Lfv/k;->d:Lcom/mapbox/maps/MercatorCoordinate;

    iput-wide p6, p0, Lfv/k;->e:D

    iput-boolean p8, p0, Lfv/k;->f:Z

    iput-wide p9, p0, Lfv/k;->g:D

    iput-wide p11, p0, Lfv/k;->h:D

    iput-wide p13, p0, Lfv/k;->i:D

    return-void
.end method


# virtual methods
.method public final evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    check-cast p2, Lcom/mapbox/geojson/Point;

    check-cast p3, Lcom/mapbox/geojson/Point;

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    float-to-double p2, p1

    iget-wide v0, p0, Lfv/k;->b:D

    mul-double/2addr p2, v0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float p1, p1, v0

    if-nez p1, :cond_1

    const-wide/high16 p1, 0x3ff0000000000000L    # 1.0

    goto :goto_0

    :cond_1
    iget-boolean p1, p0, Lfv/k;->f:Z

    if-eqz p1, :cond_2

    const-wide/16 p1, 0x0

    goto :goto_0

    :cond_2
    iget-wide v0, p0, Lfv/k;->h:D

    invoke-static {v0, v1}, Ljava/lang/Math;->cosh(D)D

    move-result-wide v2

    const-wide v4, 0x3ff6b851eb851eb8L    # 1.42

    mul-double/2addr v4, p2

    add-double/2addr v4, v0

    invoke-static {v4, v5}, Ljava/lang/Math;->tanh(D)D

    move-result-wide p1

    mul-double/2addr p1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sinh(D)D

    move-result-wide v0

    sub-double/2addr p1, v0

    iget-wide v0, p0, Lfv/k;->g:D

    mul-double/2addr p1, v0

    const-wide v0, 0x4000219652bd3c36L    # 2.0164

    div-double/2addr p1, v0

    iget-wide v0, p0, Lfv/k;->i:D

    div-double/2addr p1, v0

    :goto_0
    new-instance p3, Lcom/mapbox/maps/MercatorCoordinate;

    iget-object v0, p0, Lfv/k;->c:Lcom/mapbox/maps/MercatorCoordinate;

    invoke-virtual {v0}, Lcom/mapbox/maps/MercatorCoordinate;->getX()D

    move-result-wide v1

    iget-object v3, p0, Lfv/k;->d:Lcom/mapbox/maps/MercatorCoordinate;

    invoke-virtual {v3}, Lcom/mapbox/maps/MercatorCoordinate;->getX()D

    move-result-wide v4

    invoke-virtual {v0}, Lcom/mapbox/maps/MercatorCoordinate;->getX()D

    move-result-wide v6

    sub-double/2addr v4, v6

    mul-double/2addr v4, p1

    add-double/2addr v4, v1

    invoke-virtual {v0}, Lcom/mapbox/maps/MercatorCoordinate;->getY()D

    move-result-wide v1

    invoke-virtual {v3}, Lcom/mapbox/maps/MercatorCoordinate;->getY()D

    move-result-wide v6

    invoke-virtual {v0}, Lcom/mapbox/maps/MercatorCoordinate;->getY()D

    move-result-wide v8

    sub-double/2addr v6, v8

    mul-double/2addr v6, p1

    add-double/2addr v6, v1

    invoke-direct {p3, v4, v5, v6, v7}, Lcom/mapbox/maps/MercatorCoordinate;-><init>(DD)V

    iget-object p1, p0, Lfv/k;->a:Lfv/n;

    iget-object p1, p1, Lfv/n;->b:Lcom/mapbox/maps/MapboxMap;

    iget-wide v0, p0, Lfv/k;->e:D

    invoke-interface {p1, p3, v0, v1}, Lmv/g;->unproject(Lcom/mapbox/maps/MercatorCoordinate;D)Lcom/mapbox/geojson/Point;

    move-result-object p1

    return-object p1
.end method

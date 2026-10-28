.class public final Lwp/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:D

.field public b:D

.field public c:D

.field public d:D


# virtual methods
.method public final a()Lcom/google/android/gms/maps/model/LatLngBounds;
    .locals 7

    iget-wide v0, p0, Lwp/f;->c:D

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "no included points"

    invoke-static {v1, v0}, Luo/w;->h(Ljava/lang/String;Z)V

    new-instance v0, Lcom/google/android/gms/maps/model/LatLngBounds;

    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v2, p0, Lwp/f;->a:D

    iget-wide v4, p0, Lwp/f;->c:D

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v3, p0, Lwp/f;->b:D

    iget-wide v5, p0, Lwp/f;->d:D

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/maps/model/LatLngBounds;-><init>(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V

    return-object v0
.end method

.method public final b(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 8

    const-string v0, "point must not be null"

    invoke-static {p1, v0}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Lwp/f;->a:D

    iget-wide v2, p1, Lcom/google/android/gms/maps/model/LatLng;->w:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lwp/f;->a:D

    iget-wide v0, p0, Lwp/f;->b:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lwp/f;->b:D

    iget-wide v0, p1, Lcom/google/android/gms/maps/model/LatLng;->x:D

    iget-wide v2, p0, Lwp/f;->c:D

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    move-result p1

    if-eqz p1, :cond_0

    iput-wide v0, p0, Lwp/f;->c:D

    iput-wide v0, p0, Lwp/f;->d:D

    return-void

    :cond_0
    iget-wide v2, p0, Lwp/f;->c:D

    iget-wide v4, p0, Lwp/f;->d:D

    cmpg-double p1, v2, v4

    if-gtz p1, :cond_1

    cmpg-double p1, v2, v0

    if-gtz p1, :cond_2

    cmpg-double p1, v0, v4

    if-lez p1, :cond_4

    goto :goto_0

    :cond_1
    cmpg-double p1, v2, v0

    if-lez p1, :cond_4

    cmpg-double p1, v0, v4

    if-gtz p1, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    sub-double/2addr v2, v0

    sub-double v4, v0, v4

    const-wide v6, 0x4076800000000000L    # 360.0

    add-double/2addr v4, v6

    add-double/2addr v2, v6

    rem-double/2addr v2, v6

    rem-double/2addr v4, v6

    cmpg-double p1, v2, v4

    if-gez p1, :cond_3

    iput-wide v0, p0, Lwp/f;->c:D

    return-void

    :cond_3
    iput-wide v0, p0, Lwp/f;->d:D

    :cond_4
    :goto_1
    return-void
.end method

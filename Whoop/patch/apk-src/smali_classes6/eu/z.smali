.class public final Leu/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Lcom/google/android/gms/maps/model/LatLngBounds;

.field public final c:Lwp/g;

.field public final d:Leu/c0;


# direct methods
.method public constructor <init>(ZLcom/google/android/gms/maps/model/LatLngBounds;Lwp/g;I)V
    .locals 2

    and-int/lit8 v0, p4, 0x4

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 v0, p4, 0x10

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object p2, v1

    :cond_1
    and-int/lit8 p4, p4, 0x20

    if-eqz p4, :cond_2

    move-object p3, v1

    :cond_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Leu/z;->a:Z

    iput-object p2, p0, Leu/z;->b:Lcom/google/android/gms/maps/model/LatLngBounds;

    iput-object p3, p0, Leu/z;->c:Lwp/g;

    sget-object p1, Leu/c0;->x:Leu/c0;

    iput-object p1, p0, Leu/z;->d:Leu/c0;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Leu/z;

    if-eqz v0, :cond_0

    check-cast p1, Leu/z;

    iget-boolean v0, p0, Leu/z;->a:Z

    iget-boolean v1, p1, Leu/z;->a:Z

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Leu/z;->b:Lcom/google/android/gms/maps/model/LatLngBounds;

    iget-object v1, p1, Leu/z;->b:Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Leu/z;->c:Lwp/g;

    iget-object v1, p1, Leu/z;->c:Lwp/g;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Leu/z;->d:Leu/c0;

    iget-object p1, p1, Leu/z;->d:Leu/c0;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 9

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iget-boolean v1, p0, Leu/z;->a:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/high16 v1, 0x41a80000    # 21.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    const/high16 v1, 0x40400000    # 3.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    iget-object v4, p0, Leu/z;->b:Lcom/google/android/gms/maps/model/LatLngBounds;

    iget-object v5, p0, Leu/z;->c:Lwp/g;

    iget-object v6, p0, Leu/z;->d:Leu/c0;

    move-object v1, v0

    move-object v3, v0

    filled-new-array/range {v0 .. v8}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MapProperties(isBuildingEnabled=false, isIndoorEnabled=false, isMyLocationEnabled="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Leu/z;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isTrafficEnabled=false, latLngBoundsForCameraTarget="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Leu/z;->b:Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mapStyleOptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Leu/z;->c:Lwp/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mapType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Leu/z;->d:Leu/c0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", maxZoomPreference=21.0, minZoomPreference=3.0)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/google/android/gms/maps/model/LatLngBounds;
.super Lvo/a;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/maps/model/LatLngBounds;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:Lcom/google/android/gms/maps/model/LatLng;

.field public final x:Lcom/google/android/gms/maps/model/LatLng;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv00/g0;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lv00/g0;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/maps/model/LatLngBounds;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "southwest must not be null."

    invoke-static {p1, v0}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "northeast must not be null."

    invoke-static {p2, v0}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p2, Lcom/google/android/gms/maps/model/LatLng;->w:D

    iget-wide v2, p1, Lcom/google/android/gms/maps/model/LatLng;->w:D

    cmpl-double v4, v0, v2

    if-ltz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_1

    iput-object p1, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->w:Lcom/google/android/gms/maps/model/LatLng;

    iput-object p2, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->x:Lcom/google/android/gms/maps/model/LatLng;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "southern latitude exceeds northern latitude ("

    const-string v4, " > "

    invoke-static {p2, v2, v3, v4}, Lb9/y;->s(Ljava/lang/String;DLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v2, ")"

    invoke-static {v0, v1, v2, p2}, Lq63/c;->f(DLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/maps/model/LatLng;)Z
    .locals 6

    const-string v0, "point must not be null."

    invoke-static {p1, v0}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p1, Lcom/google/android/gms/maps/model/LatLng;->w:D

    iget-object v2, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->w:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v3, v2, Lcom/google/android/gms/maps/model/LatLng;->w:D

    cmpg-double v3, v3, v0

    if-gtz v3, :cond_2

    iget-object v3, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->x:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v4, v3, Lcom/google/android/gms/maps/model/LatLng;->w:D

    cmpg-double v0, v0, v4

    if-gtz v0, :cond_2

    iget-wide v0, p1, Lcom/google/android/gms/maps/model/LatLng;->x:D

    iget-wide v4, v2, Lcom/google/android/gms/maps/model/LatLng;->x:D

    iget-wide v2, v3, Lcom/google/android/gms/maps/model/LatLng;->x:D

    cmpg-double p1, v4, v2

    if-gtz p1, :cond_0

    cmpg-double p1, v4, v0

    if-gtz p1, :cond_2

    cmpg-double p1, v0, v2

    if-gtz p1, :cond_2

    goto :goto_0

    :cond_0
    cmpg-double p1, v4, v0

    if-lez p1, :cond_1

    cmpg-double p1, v0, v2

    if-gtz p1, :cond_2

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/maps/model/LatLngBounds;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/maps/model/LatLngBounds;

    iget-object v1, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->w:Lcom/google/android/gms/maps/model/LatLng;

    iget-object v3, p1, Lcom/google/android/gms/maps/model/LatLngBounds;->w:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/maps/model/LatLng;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->x:Lcom/google/android/gms/maps/model/LatLng;

    iget-object p1, p1, Lcom/google/android/gms/maps/model/LatLngBounds;->x:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/maps/model/LatLng;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final f()Lcom/google/android/gms/maps/model/LatLng;
    .locals 11

    iget-object v0, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->w:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v1, v0, Lcom/google/android/gms/maps/model/LatLng;->w:D

    iget-object v3, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->x:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v4, v3, Lcom/google/android/gms/maps/model/LatLng;->w:D

    add-double/2addr v1, v4

    iget-wide v3, v3, Lcom/google/android/gms/maps/model/LatLng;->x:D

    iget-wide v5, v0, Lcom/google/android/gms/maps/model/LatLng;->x:D

    cmpg-double v0, v5, v3

    const-wide/high16 v7, 0x4000000000000000L    # 2.0

    if-gtz v0, :cond_0

    :goto_0
    add-double/2addr v3, v5

    div-double/2addr v3, v7

    goto :goto_1

    :cond_0
    const-wide v9, 0x4076800000000000L    # 360.0

    add-double/2addr v3, v9

    goto :goto_0

    :goto_1
    div-double/2addr v1, v7

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->w:Lcom/google/android/gms/maps/model/LatLng;

    iget-object v1, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->x:Lcom/google/android/gms/maps/model/LatLng;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Lpg3/p;

    invoke-direct {v0, p0}, Lpg3/p;-><init>(Ljava/lang/Object;)V

    const-string v1, "southwest"

    iget-object v2, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->w:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0, v2, v1}, Lpg3/p;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "northeast"

    iget-object v2, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->x:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0, v2, v1}, Lpg3/p;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lpg3/p;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const/16 v0, 0x4f45

    invoke-static {p1, v0}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result v0

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->w:Lcom/google/android/gms/maps/model/LatLng;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->x:Lcom/google/android/gms/maps/model/LatLng;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    invoke-static {p1, v0}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method

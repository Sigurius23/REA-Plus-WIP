.class public final Lev/c;
.super Lev/e;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lev/c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:F

.field public final w:Lcom/mapbox/maps/ImageHolder;

.field public final x:Lcom/mapbox/maps/ImageHolder;

.field public final y:Lcom/mapbox/maps/ImageHolder;

.field public final z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Leq/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Leq/b;-><init>(I)V

    sput-object v0, Lev/c;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/mapbox/maps/ImageHolder;Lcom/mapbox/maps/ImageHolder;Lcom/mapbox/maps/ImageHolder;Ljava/lang/String;F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lev/c;->w:Lcom/mapbox/maps/ImageHolder;

    .line 3
    iput-object p2, p0, Lev/c;->x:Lcom/mapbox/maps/ImageHolder;

    .line 4
    iput-object p3, p0, Lev/c;->y:Lcom/mapbox/maps/ImageHolder;

    .line 5
    iput-object p4, p0, Lev/c;->z:Ljava/lang/String;

    .line 6
    iput p5, p0, Lev/c;->E:F

    return-void
.end method

.method public synthetic constructor <init>(Lcom/mapbox/maps/ImageHolder;Lcom/mapbox/maps/ImageHolder;Lcom/mapbox/maps/ImageHolder;Ljava/lang/String;I)V
    .locals 6

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    move-object v4, p4

    const/high16 v5, 0x3f800000    # 1.0f

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 7
    invoke-direct/range {v0 .. v5}, Lev/c;-><init>(Lcom/mapbox/maps/ImageHolder;Lcom/mapbox/maps/ImageHolder;Lcom/mapbox/maps/ImageHolder;Ljava/lang/String;F)V

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lev/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lev/c;

    iget-object v1, p0, Lev/c;->w:Lcom/mapbox/maps/ImageHolder;

    iget-object v3, p1, Lev/c;->w:Lcom/mapbox/maps/ImageHolder;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lev/c;->x:Lcom/mapbox/maps/ImageHolder;

    iget-object v3, p1, Lev/c;->x:Lcom/mapbox/maps/ImageHolder;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lev/c;->y:Lcom/mapbox/maps/ImageHolder;

    iget-object v3, p1, Lev/c;->y:Lcom/mapbox/maps/ImageHolder;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lev/c;->z:Ljava/lang/String;

    iget-object v3, p1, Lev/c;->z:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lev/c;->E:F

    iget p1, p1, Lev/c;->E:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lev/c;->w:Lcom/mapbox/maps/ImageHolder;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/mapbox/maps/ImageHolder;->hashCode()I

    move-result v1

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lev/c;->x:Lcom/mapbox/maps/ImageHolder;

    if-nez v2, :cond_1

    move v2, v0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/mapbox/maps/ImageHolder;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lev/c;->y:Lcom/mapbox/maps/ImageHolder;

    if-nez v2, :cond_2

    move v2, v0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/mapbox/maps/ImageHolder;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lev/c;->z:Ljava/lang/String;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lev/c;->E:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LocationPuck2D(topImage="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lev/c;->w:Lcom/mapbox/maps/ImageHolder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bearingImage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lev/c;->x:Lcom/mapbox/maps/ImageHolder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shadowImage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lev/c;->y:Lcom/mapbox/maps/ImageHolder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", scaleExpression="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lev/c;->z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", opacity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lev/c;->E:F

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lr;->l(Ljava/lang/StringBuilder;FC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Lev/c;->w:Lcom/mapbox/maps/ImageHolder;

    if-nez v2, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Lcom/mapbox/maps/ImageHolder;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v2, p0, Lev/c;->x:Lcom/mapbox/maps/ImageHolder;

    if-nez v2, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Lcom/mapbox/maps/ImageHolder;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object v2, p0, Lev/c;->y:Lcom/mapbox/maps/ImageHolder;

    if-nez v2, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Lcom/mapbox/maps/ImageHolder;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_2
    iget-object p2, p0, Lev/c;->z:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lev/c;->E:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    return-void
.end method

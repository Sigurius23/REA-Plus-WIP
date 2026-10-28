.class public final Llv/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Llv/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:F

.field public final F:F

.field public final G:F

.field public final H:F

.field public final I:Z

.field public final J:Z

.field public final K:Z

.field public final L:Lcom/mapbox/maps/ImageHolder;

.field public final w:Z

.field public final x:I

.field public final y:F

.field public final z:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljz/h;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Ljz/h;-><init>(I)V

    sput-object v0, Llv/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZIFFFFFFZZZLcom/mapbox/maps/ImageHolder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Llv/b;->w:Z

    iput p2, p0, Llv/b;->x:I

    iput p3, p0, Llv/b;->y:F

    iput p4, p0, Llv/b;->z:F

    iput p5, p0, Llv/b;->E:F

    iput p6, p0, Llv/b;->F:F

    iput p7, p0, Llv/b;->G:F

    iput p8, p0, Llv/b;->H:F

    iput-boolean p9, p0, Llv/b;->I:Z

    iput-boolean p10, p0, Llv/b;->J:Z

    iput-boolean p11, p0, Llv/b;->K:Z

    iput-object p12, p0, Llv/b;->L:Lcom/mapbox/maps/ImageHolder;

    return-void
.end method


# virtual methods
.method public final b()Llv/a;
    .locals 2

    new-instance v0, Llv/a;

    invoke-direct {v0}, Llv/a;-><init>()V

    iget-boolean v1, p0, Llv/b;->w:Z

    iput-boolean v1, v0, Llv/a;->a:Z

    iget v1, p0, Llv/b;->x:I

    iput v1, v0, Llv/a;->b:I

    iget v1, p0, Llv/b;->y:F

    iput v1, v0, Llv/a;->c:F

    iget v1, p0, Llv/b;->z:F

    iput v1, v0, Llv/a;->d:F

    iget v1, p0, Llv/b;->E:F

    iput v1, v0, Llv/a;->e:F

    iget v1, p0, Llv/b;->F:F

    iput v1, v0, Llv/a;->f:F

    iget v1, p0, Llv/b;->G:F

    iput v1, v0, Llv/a;->g:F

    iget v1, p0, Llv/b;->H:F

    iput v1, v0, Llv/a;->h:F

    iget-boolean v1, p0, Llv/b;->I:Z

    iput-boolean v1, v0, Llv/a;->i:Z

    iget-boolean v1, p0, Llv/b;->J:Z

    iput-boolean v1, v0, Llv/a;->j:Z

    iget-boolean v1, p0, Llv/b;->K:Z

    iput-boolean v1, v0, Llv/a;->k:Z

    iget-object v1, p0, Llv/b;->L:Lcom/mapbox/maps/ImageHolder;

    iput-object v1, v0, Llv/a;->l:Lcom/mapbox/maps/ImageHolder;

    return-object v0
.end method

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
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    const-class v2, Llv/b;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    const-string v1, "null cannot be cast to non-null type com.mapbox.maps.plugin.compass.generated.CompassSettings"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Llv/b;

    iget-boolean v1, p0, Llv/b;->w:Z

    iget-boolean v3, p1, Llv/b;->w:Z

    if-ne v1, v3, :cond_3

    iget v1, p0, Llv/b;->x:I

    iget v3, p1, Llv/b;->x:I

    if-ne v1, v3, :cond_3

    iget v1, p0, Llv/b;->y:F

    iget v3, p1, Llv/b;->y:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-nez v1, :cond_3

    iget v1, p0, Llv/b;->z:F

    iget v3, p1, Llv/b;->z:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-nez v1, :cond_3

    iget v1, p0, Llv/b;->E:F

    iget v3, p1, Llv/b;->E:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-nez v1, :cond_3

    iget v1, p0, Llv/b;->F:F

    iget v3, p1, Llv/b;->F:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-nez v1, :cond_3

    iget v1, p0, Llv/b;->G:F

    iget v3, p1, Llv/b;->G:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-nez v1, :cond_3

    iget v1, p0, Llv/b;->H:F

    iget v3, p1, Llv/b;->H:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-nez v1, :cond_3

    iget-boolean v1, p0, Llv/b;->I:Z

    iget-boolean v3, p1, Llv/b;->I:Z

    if-ne v1, v3, :cond_3

    iget-boolean v1, p0, Llv/b;->J:Z

    iget-boolean v3, p1, Llv/b;->J:Z

    if-ne v1, v3, :cond_3

    iget-boolean v1, p0, Llv/b;->K:Z

    iget-boolean v3, p1, Llv/b;->K:Z

    if-ne v1, v3, :cond_3

    iget-object v1, p0, Llv/b;->L:Lcom/mapbox/maps/ImageHolder;

    iget-object p1, p1, Llv/b;->L:Lcom/mapbox/maps/ImageHolder;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v0

    :cond_3
    return v2
.end method

.method public final hashCode()I
    .locals 13

    iget-boolean v0, p0, Llv/b;->w:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget v0, p0, Llv/b;->x:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v0, p0, Llv/b;->y:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    iget v0, p0, Llv/b;->z:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    iget v0, p0, Llv/b;->E:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    iget v0, p0, Llv/b;->F:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    iget v0, p0, Llv/b;->G:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    iget v0, p0, Llv/b;->H:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    iget-boolean v0, p0, Llv/b;->I:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    iget-boolean v0, p0, Llv/b;->J:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    iget-boolean v0, p0, Llv/b;->K:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    iget-object v12, p0, Llv/b;->L:Lcom/mapbox/maps/ImageHolder;

    filled-new-array/range {v1 .. v12}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CompassSettings(enabled="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Llv/b;->w:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", position="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llv/b;->x:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",\n      marginLeft="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llv/b;->y:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", marginTop="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llv/b;->z:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", marginRight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llv/b;->E:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ",\n      marginBottom="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llv/b;->F:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", opacity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llv/b;->G:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", rotation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llv/b;->H:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", visibility="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llv/b;->I:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",\n      fadeWhenFacingNorth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llv/b;->J:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", clickable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llv/b;->K:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", image="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llv/b;->L:Lcom/mapbox/maps/ImageHolder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/s;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Llv/b;->w:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Llv/b;->x:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Llv/b;->y:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget v0, p0, Llv/b;->z:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget v0, p0, Llv/b;->E:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget v0, p0, Llv/b;->F:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget v0, p0, Llv/b;->G:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget v0, p0, Llv/b;->H:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget-boolean v0, p0, Llv/b;->I:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Llv/b;->J:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Llv/b;->K:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Llv/b;->L:Lcom/mapbox/maps/ImageHolder;

    if-nez v0, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/ImageHolder;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method

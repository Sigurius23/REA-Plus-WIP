.class public final Lpv/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lpv/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Z

.field public final F:I

.field public final G:Z

.field public final H:Z

.field public final I:Z

.field public final J:Lcom/mapbox/maps/ScreenCoordinate;

.field public final K:Z

.field public final L:Z

.field public final M:Z

.field public final N:Z

.field public final O:Z

.field public final P:F

.field public final Q:Z

.field public final w:Z

.field public final x:Z

.field public final y:Z

.field public final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpn/a;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lpn/a;-><init>(I)V

    sput-object v0, Lpv/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZZZZZIZZZLcom/mapbox/maps/ScreenCoordinate;ZZZZZFZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lpv/b;->w:Z

    iput-boolean p2, p0, Lpv/b;->x:Z

    iput-boolean p3, p0, Lpv/b;->y:Z

    iput-boolean p4, p0, Lpv/b;->z:Z

    iput-boolean p5, p0, Lpv/b;->E:Z

    iput p6, p0, Lpv/b;->F:I

    iput-boolean p7, p0, Lpv/b;->G:Z

    iput-boolean p8, p0, Lpv/b;->H:Z

    iput-boolean p9, p0, Lpv/b;->I:Z

    iput-object p10, p0, Lpv/b;->J:Lcom/mapbox/maps/ScreenCoordinate;

    iput-boolean p11, p0, Lpv/b;->K:Z

    iput-boolean p12, p0, Lpv/b;->L:Z

    iput-boolean p13, p0, Lpv/b;->M:Z

    iput-boolean p14, p0, Lpv/b;->N:Z

    iput-boolean p15, p0, Lpv/b;->O:Z

    move/from16 p1, p16

    iput p1, p0, Lpv/b;->P:F

    move/from16 p1, p17

    iput-boolean p1, p0, Lpv/b;->Q:Z

    return-void
.end method


# virtual methods
.method public final b()Lpv/a;
    .locals 3

    new-instance v0, Lpv/a;

    invoke-direct {v0}, Lpv/a;-><init>()V

    iget-boolean v1, p0, Lpv/b;->w:Z

    iput-boolean v1, v0, Lpv/a;->a:Z

    iget-boolean v1, p0, Lpv/b;->x:Z

    iput-boolean v1, v0, Lpv/a;->b:Z

    iget-boolean v1, p0, Lpv/b;->y:Z

    iput-boolean v1, v0, Lpv/a;->c:Z

    iget-boolean v1, p0, Lpv/b;->z:Z

    iput-boolean v1, v0, Lpv/a;->d:Z

    iget-boolean v1, p0, Lpv/b;->E:Z

    iput-boolean v1, v0, Lpv/a;->e:Z

    const-string v1, "scrollMode"

    iget v2, p0, Lpv/b;->F:I

    invoke-static {v2, v1}, Lih0/d0;->w(ILjava/lang/String;)V

    iput v2, v0, Lpv/a;->f:I

    iget-boolean v1, p0, Lpv/b;->G:Z

    iput-boolean v1, v0, Lpv/a;->g:Z

    iget-boolean v1, p0, Lpv/b;->H:Z

    iput-boolean v1, v0, Lpv/a;->h:Z

    iget-boolean v1, p0, Lpv/b;->I:Z

    iput-boolean v1, v0, Lpv/a;->i:Z

    iget-object v1, p0, Lpv/b;->J:Lcom/mapbox/maps/ScreenCoordinate;

    iput-object v1, v0, Lpv/a;->j:Lcom/mapbox/maps/ScreenCoordinate;

    iget-boolean v1, p0, Lpv/b;->K:Z

    iput-boolean v1, v0, Lpv/a;->k:Z

    iget-boolean v1, p0, Lpv/b;->L:Z

    iput-boolean v1, v0, Lpv/a;->l:Z

    iget-boolean v1, p0, Lpv/b;->M:Z

    iput-boolean v1, v0, Lpv/a;->m:Z

    iget-boolean v1, p0, Lpv/b;->N:Z

    iput-boolean v1, v0, Lpv/a;->n:Z

    iget-boolean v1, p0, Lpv/b;->O:Z

    iput-boolean v1, v0, Lpv/a;->o:Z

    iget v1, p0, Lpv/b;->P:F

    iput v1, v0, Lpv/a;->p:F

    iget-boolean v1, p0, Lpv/b;->Q:Z

    iput-boolean v1, v0, Lpv/a;->q:Z

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto/16 :goto_1

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const-class v1, Lpv/b;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v0, "null cannot be cast to non-null type com.mapbox.maps.plugin.gestures.generated.GesturesSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lpv/b;

    iget-boolean v0, p0, Lpv/b;->w:Z

    iget-boolean v1, p1, Lpv/b;->w:Z

    if-ne v0, v1, :cond_3

    iget-boolean v0, p0, Lpv/b;->x:Z

    iget-boolean v1, p1, Lpv/b;->x:Z

    if-ne v0, v1, :cond_3

    iget-boolean v0, p0, Lpv/b;->y:Z

    iget-boolean v1, p1, Lpv/b;->y:Z

    if-ne v0, v1, :cond_3

    iget-boolean v0, p0, Lpv/b;->z:Z

    iget-boolean v1, p1, Lpv/b;->z:Z

    if-ne v0, v1, :cond_3

    iget-boolean v0, p0, Lpv/b;->E:Z

    iget-boolean v1, p1, Lpv/b;->E:Z

    if-ne v0, v1, :cond_3

    iget v0, p0, Lpv/b;->F:I

    iget v1, p1, Lpv/b;->F:I

    if-ne v0, v1, :cond_3

    iget-boolean v0, p0, Lpv/b;->G:Z

    iget-boolean v1, p1, Lpv/b;->G:Z

    if-ne v0, v1, :cond_3

    iget-boolean v0, p0, Lpv/b;->H:Z

    iget-boolean v1, p1, Lpv/b;->H:Z

    if-ne v0, v1, :cond_3

    iget-boolean v0, p0, Lpv/b;->I:Z

    iget-boolean v1, p1, Lpv/b;->I:Z

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lpv/b;->J:Lcom/mapbox/maps/ScreenCoordinate;

    iget-object v1, p1, Lpv/b;->J:Lcom/mapbox/maps/ScreenCoordinate;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lpv/b;->K:Z

    iget-boolean v1, p1, Lpv/b;->K:Z

    if-ne v0, v1, :cond_3

    iget-boolean v0, p0, Lpv/b;->L:Z

    iget-boolean v1, p1, Lpv/b;->L:Z

    if-ne v0, v1, :cond_3

    iget-boolean v0, p0, Lpv/b;->M:Z

    iget-boolean v1, p1, Lpv/b;->M:Z

    if-ne v0, v1, :cond_3

    iget-boolean v0, p0, Lpv/b;->N:Z

    iget-boolean v1, p1, Lpv/b;->N:Z

    if-ne v0, v1, :cond_3

    iget-boolean v0, p0, Lpv/b;->O:Z

    iget-boolean v1, p1, Lpv/b;->O:Z

    if-ne v0, v1, :cond_3

    iget v0, p0, Lpv/b;->P:F

    iget v1, p1, Lpv/b;->P:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lpv/b;->Q:Z

    iget-boolean p1, p1, Lpv/b;->Q:Z

    if-ne v0, p1, :cond_3

    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_2
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 19

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lpv/b;->w:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget-boolean v1, v0, Lpv/b;->x:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iget-boolean v1, v0, Lpv/b;->y:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iget-boolean v1, v0, Lpv/b;->z:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    iget-boolean v1, v0, Lpv/b;->E:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    iget-boolean v1, v0, Lpv/b;->G:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    iget-boolean v1, v0, Lpv/b;->H:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    iget-boolean v1, v0, Lpv/b;->I:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    iget-boolean v1, v0, Lpv/b;->K:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    iget-boolean v1, v0, Lpv/b;->L:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    iget-boolean v1, v0, Lpv/b;->M:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    iget-boolean v1, v0, Lpv/b;->N:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    iget-boolean v1, v0, Lpv/b;->O:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v16

    iget v1, v0, Lpv/b;->P:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v17

    iget-boolean v1, v0, Lpv/b;->Q:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v18

    iget v1, v0, Lpv/b;->F:I

    invoke-static {v1}, Le4/p;->a(I)Ljava/lang/Integer;

    move-result-object v7

    iget-object v11, v0, Lpv/b;->J:Lcom/mapbox/maps/ScreenCoordinate;

    filled-new-array/range {v2 .. v18}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v1

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "GesturesSettings(rotateEnabled="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lpv/b;->w:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",\n      pinchToZoomEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpv/b;->x:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", scrollEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpv/b;->y:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",\n      simultaneousRotateAndPinchToZoomEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpv/b;->z:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",\n      pitchEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpv/b;->E:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", scrollMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    iget v2, p0, Lpv/b;->F:I

    if-eq v2, v1, :cond_2

    const/4 v1, 0x2

    if-eq v2, v1, :cond_1

    const/4 v1, 0x3

    if-eq v2, v1, :cond_0

    const-string v1, "null"

    goto :goto_0

    :cond_0
    const-string v1, "HORIZONTAL_AND_VERTICAL"

    goto :goto_0

    :cond_1
    const-string v1, "VERTICAL"

    goto :goto_0

    :cond_2
    const-string v1, "HORIZONTAL"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",\n      doubleTapToZoomInEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpv/b;->G:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",\n      doubleTouchToZoomOutEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpv/b;->H:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", quickZoomEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpv/b;->I:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",\n      focalPoint="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpv/b;->J:Lcom/mapbox/maps/ScreenCoordinate;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pinchToZoomDecelerationEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpv/b;->K:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",\n      rotateDecelerationEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpv/b;->L:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",\n      scrollDecelerationEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpv/b;->M:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",\n      increaseRotateThresholdWhenPinchingToZoom="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpv/b;->N:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",\n      increasePinchToZoomThresholdWhenRotating="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpv/b;->O:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",\n      zoomAnimationAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpv/b;->P:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ",\n      pinchScrollEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpv/b;->Q:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/s;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p2, p0, Lpv/b;->w:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lpv/b;->x:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lpv/b;->y:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lpv/b;->z:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lpv/b;->E:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 p2, 0x1

    iget v0, p0, Lpv/b;->F:I

    if-eq v0, p2, :cond_2

    const/4 p2, 0x2

    if-eq v0, p2, :cond_1

    const/4 p2, 0x3

    if-ne v0, p2, :cond_0

    const-string p2, "HORIZONTAL_AND_VERTICAL"

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    throw p1

    :cond_1
    const-string p2, "VERTICAL"

    goto :goto_0

    :cond_2
    const-string p2, "HORIZONTAL"

    :goto_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lpv/b;->G:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lpv/b;->H:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lpv/b;->I:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lpv/b;->J:Lcom/mapbox/maps/ScreenCoordinate;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-boolean p2, p0, Lpv/b;->K:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lpv/b;->L:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lpv/b;->M:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lpv/b;->N:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lpv/b;->O:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lpv/b;->P:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget-boolean p2, p0, Lpv/b;->Q:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

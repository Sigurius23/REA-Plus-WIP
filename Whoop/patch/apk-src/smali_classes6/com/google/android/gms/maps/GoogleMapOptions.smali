.class public final Lcom/google/android/gms/maps/GoogleMapOptions;
.super Lvo/a;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/maps/GoogleMapOptions;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public E:Ljava/lang/Boolean;

.field public F:Ljava/lang/Boolean;

.field public G:Ljava/lang/Boolean;

.field public H:Ljava/lang/Boolean;

.field public I:Ljava/lang/Boolean;

.field public J:Ljava/lang/Boolean;

.field public K:Ljava/lang/Boolean;

.field public L:Ljava/lang/Boolean;

.field public M:Ljava/lang/Boolean;

.field public N:Ljava/lang/Float;

.field public O:Ljava/lang/Float;

.field public P:Lcom/google/android/gms/maps/model/LatLngBounds;

.field public Q:Ljava/lang/Boolean;

.field public R:Ljava/lang/Integer;

.field public S:Ljava/lang/String;

.field public w:Ljava/lang/Boolean;

.field public x:Ljava/lang/Boolean;

.field public y:I

.field public z:Lcom/google/android/gms/maps/model/CameraPosition;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lsp/e;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lsp/e;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/maps/GoogleMapOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0xe9

    const/16 v1, 0xe1

    const/16 v2, 0xff

    const/16 v3, 0xec

    invoke-static {v2, v3, v0, v1}, Landroid/graphics/Color;->argb(IIII)I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->y:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->N:Ljava/lang/Float;

    iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->O:Ljava/lang/Float;

    iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->P:Lcom/google/android/gms/maps/model/LatLngBounds;

    iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->R:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->S:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Lpg3/p;

    invoke-direct {v0, p0}, Lpg3/p;-><init>(Ljava/lang/Object;)V

    iget v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->y:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "MapType"

    invoke-virtual {v0, v1, v2}, Lpg3/p;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "LiteMode"

    iget-object v2, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->K:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v1}, Lpg3/p;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "Camera"

    iget-object v2, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->z:Lcom/google/android/gms/maps/model/CameraPosition;

    invoke-virtual {v0, v2, v1}, Lpg3/p;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "CompassEnabled"

    iget-object v2, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->F:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v1}, Lpg3/p;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "ZoomControlsEnabled"

    iget-object v2, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->E:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v1}, Lpg3/p;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "ScrollGesturesEnabled"

    iget-object v2, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->G:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v1}, Lpg3/p;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "ZoomGesturesEnabled"

    iget-object v2, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->H:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v1}, Lpg3/p;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "TiltGesturesEnabled"

    iget-object v2, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->I:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v1}, Lpg3/p;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "RotateGesturesEnabled"

    iget-object v2, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->J:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v1}, Lpg3/p;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "ScrollGesturesEnabledDuringRotateOrZoom"

    iget-object v2, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->Q:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v1}, Lpg3/p;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "MapToolbarEnabled"

    iget-object v2, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->L:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v1}, Lpg3/p;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "AmbientEnabled"

    iget-object v2, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->M:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v1}, Lpg3/p;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "MinZoomPreference"

    iget-object v2, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->N:Ljava/lang/Float;

    invoke-virtual {v0, v2, v1}, Lpg3/p;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "MaxZoomPreference"

    iget-object v2, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->O:Ljava/lang/Float;

    invoke-virtual {v0, v2, v1}, Lpg3/p;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "BackgroundColor"

    iget-object v2, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->R:Ljava/lang/Integer;

    invoke-virtual {v0, v2, v1}, Lpg3/p;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "LatLngBoundsForCameraTarget"

    iget-object v2, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->P:Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-virtual {v0, v2, v1}, Lpg3/p;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "ZOrderOnTop"

    iget-object v2, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->w:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v1}, Lpg3/p;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "UseViewLifecycleInFragment"

    iget-object v2, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->x:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v1}, Lpg3/p;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lpg3/p;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const/16 v0, 0x4f45

    invoke-static {p1, v0}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->w:Ljava/lang/Boolean;

    invoke-static {v1}, Lrg/j;->q(Ljava/lang/Boolean;)B

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x4

    invoke-static {p1, v2, v3}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->x:Ljava/lang/Boolean;

    invoke-static {v1}, Lrg/j;->q(Ljava/lang/Boolean;)B

    move-result v1

    const/4 v2, 0x3

    invoke-static {p1, v2, v3}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    iget v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->y:I

    invoke-static {p1, v3, v3}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->z:Lcom/google/android/gms/maps/model/CameraPosition;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    iget-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->E:Ljava/lang/Boolean;

    invoke-static {v1}, Lrg/j;->q(Ljava/lang/Boolean;)B

    move-result v1

    const/4 v2, 0x6

    invoke-static {p1, v2, v3}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->F:Ljava/lang/Boolean;

    invoke-static {v1}, Lrg/j;->q(Ljava/lang/Boolean;)B

    move-result v1

    const/4 v2, 0x7

    invoke-static {p1, v2, v3}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->G:Ljava/lang/Boolean;

    invoke-static {v1}, Lrg/j;->q(Ljava/lang/Boolean;)B

    move-result v1

    const/16 v2, 0x8

    invoke-static {p1, v2, v3}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->H:Ljava/lang/Boolean;

    invoke-static {v1}, Lrg/j;->q(Ljava/lang/Boolean;)B

    move-result v1

    const/16 v2, 0x9

    invoke-static {p1, v2, v3}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->I:Ljava/lang/Boolean;

    invoke-static {v1}, Lrg/j;->q(Ljava/lang/Boolean;)B

    move-result v1

    const/16 v2, 0xa

    invoke-static {p1, v2, v3}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->J:Ljava/lang/Boolean;

    invoke-static {v1}, Lrg/j;->q(Ljava/lang/Boolean;)B

    move-result v1

    const/16 v2, 0xb

    invoke-static {p1, v2, v3}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->K:Ljava/lang/Boolean;

    invoke-static {v1}, Lrg/j;->q(Ljava/lang/Boolean;)B

    move-result v1

    const/16 v2, 0xc

    invoke-static {p1, v2, v3}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->L:Ljava/lang/Boolean;

    invoke-static {v1}, Lrg/j;->q(Ljava/lang/Boolean;)B

    move-result v1

    const/16 v2, 0xe

    invoke-static {p1, v2, v3}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->M:Ljava/lang/Boolean;

    invoke-static {v1}, Lrg/j;->q(Ljava/lang/Boolean;)B

    move-result v1

    const/16 v2, 0xf

    invoke-static {p1, v2, v3}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    const/16 v1, 0x10

    iget-object v2, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->N:Ljava/lang/Float;

    invoke-static {p1, v1, v2}, Lvo/c;->g(Landroid/os/Parcel;ILjava/lang/Float;)V

    const/16 v1, 0x11

    iget-object v2, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->O:Ljava/lang/Float;

    invoke-static {p1, v1, v2}, Lvo/c;->g(Landroid/os/Parcel;ILjava/lang/Float;)V

    const/16 v1, 0x12

    iget-object v2, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->P:Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->Q:Ljava/lang/Boolean;

    invoke-static {p2}, Lrg/j;->q(Ljava/lang/Boolean;)B

    move-result p2

    const/16 v1, 0x13

    invoke-static {p1, v1, v3}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/16 p2, 0x14

    iget-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->R:Ljava/lang/Integer;

    invoke-static {p1, p2, v1}, Lvo/c;->k(Landroid/os/Parcel;ILjava/lang/Integer;)V

    const/16 p2, 0x15

    iget-object v1, p0, Lcom/google/android/gms/maps/GoogleMapOptions;->S:Ljava/lang/String;

    invoke-static {p1, p2, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    invoke-static {p1, v0}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method

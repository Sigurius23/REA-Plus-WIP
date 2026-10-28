.class public Lwp/i;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lwp/i;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public E:F

.field public F:F

.field public G:Z

.field public H:Z

.field public I:Z

.field public J:F

.field public K:F

.field public L:F

.field public M:F

.field public N:F

.field public O:I

.field public P:Landroid/view/View;

.field public Q:I

.field public R:Ljava/lang/String;

.field public S:F

.field public w:Lcom/google/android/gms/maps/model/LatLng;

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/String;

.field public z:Lwp/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv00/g0;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lv00/g0;-><init>(I)V

    sput-object v0, Lwp/i;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const/16 v0, 0x4f45

    invoke-static {p1, v0}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result v0

    const/4 v1, 0x2

    iget-object v2, p0, Lwp/i;->w:Lcom/google/android/gms/maps/model/LatLng;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/4 p2, 0x3

    iget-object v1, p0, Lwp/i;->x:Ljava/lang/String;

    invoke-static {p1, p2, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    iget-object p2, p0, Lwp/i;->y:Ljava/lang/String;

    const/4 v1, 0x4

    invoke-static {p1, v1, p2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    iget-object p2, p0, Lwp/i;->z:Lwp/b;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    iget-object p2, p2, Lwp/b;->a:Lcp/a;

    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p2

    :goto_0
    const/4 v2, 0x5

    invoke-static {p1, v2, p2}, Lvo/c;->h(Landroid/os/Parcel;ILandroid/os/IBinder;)V

    iget p2, p0, Lwp/i;->E:F

    const/4 v2, 0x6

    invoke-static {p1, v2, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Lwp/i;->F:F

    const/4 v2, 0x7

    invoke-static {p1, v2, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget-boolean p2, p0, Lwp/i;->G:Z

    const/16 v2, 0x8

    invoke-static {p1, v2, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lwp/i;->H:Z

    const/16 v2, 0x9

    invoke-static {p1, v2, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lwp/i;->I:Z

    const/16 v2, 0xa

    invoke-static {p1, v2, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lwp/i;->J:F

    const/16 v2, 0xb

    invoke-static {p1, v2, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Lwp/i;->K:F

    const/16 v2, 0xc

    invoke-static {p1, v2, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Lwp/i;->L:F

    const/16 v2, 0xd

    invoke-static {p1, v2, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Lwp/i;->M:F

    const/16 v2, 0xe

    invoke-static {p1, v2, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Lwp/i;->N:F

    const/16 v2, 0xf

    invoke-static {p1, v2, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Lwp/i;->O:I

    const/16 v2, 0x11

    invoke-static {p1, v2, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lwp/i;->P:Landroid/view/View;

    new-instance v2, Lcp/b;

    invoke-direct {v2, p2}, Lcp/b;-><init>(Ljava/lang/Object;)V

    const/16 p2, 0x12

    invoke-static {p1, p2, v2}, Lvo/c;->h(Landroid/os/Parcel;ILandroid/os/IBinder;)V

    iget p2, p0, Lwp/i;->Q:I

    const/16 v2, 0x13

    invoke-static {p1, v2, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/16 p2, 0x14

    iget-object v2, p0, Lwp/i;->R:Ljava/lang/String;

    invoke-static {p1, p2, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    iget p2, p0, Lwp/i;->S:F

    const/16 v2, 0x15

    invoke-static {p1, v2, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    invoke-static {p1, v0}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method

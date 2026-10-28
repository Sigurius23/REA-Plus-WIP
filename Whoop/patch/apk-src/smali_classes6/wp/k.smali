.class public final Lwp/k;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lwp/k;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:Lcom/google/android/gms/maps/model/LatLng;

.field public final x:Ljava/lang/String;

.field public final y:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv00/g0;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lv00/g0;-><init>(I)V

    sput-object v0, Lwp/k;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwp/k;->w:Lcom/google/android/gms/maps/model/LatLng;

    iput-object p2, p0, Lwp/k;->x:Ljava/lang/String;

    iput-object p3, p0, Lwp/k;->y:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const/16 v0, 0x4f45

    invoke-static {p1, v0}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result v0

    const/4 v1, 0x2

    iget-object v2, p0, Lwp/k;->w:Lcom/google/android/gms/maps/model/LatLng;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/4 p2, 0x3

    iget-object v1, p0, Lwp/k;->x:Ljava/lang/String;

    invoke-static {p1, p2, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 p2, 0x4

    iget-object v1, p0, Lwp/k;->y:Ljava/lang/String;

    invoke-static {p1, p2, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    invoke-static {p1, v0}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method

.class public final Lcom/google/android/gms/identity/intents/model/UserAddress;
.super Lvo/a;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/identity/intents/model/UserAddress;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public E:Ljava/lang/String;

.field public F:Ljava/lang/String;

.field public G:Ljava/lang/String;

.field public H:Ljava/lang/String;

.field public I:Ljava/lang/String;

.field public J:Ljava/lang/String;

.field public K:Ljava/lang/String;

.field public L:Ljava/lang/String;

.field public M:Z

.field public N:Ljava/lang/String;

.field public O:Ljava/lang/String;

.field public w:Ljava/lang/String;

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgp/r0;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lgp/r0;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/identity/intents/model/UserAddress;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const/16 p2, 0x4f45

    invoke-static {p1, p2}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result p2

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->w:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->x:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->y:Ljava/lang/String;

    const/4 v1, 0x4

    invoke-static {p1, v1, v0}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v0, 0x5

    iget-object v2, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->z:Ljava/lang/String;

    invoke-static {p1, v0, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v0, 0x6

    iget-object v2, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->E:Ljava/lang/String;

    invoke-static {p1, v0, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v0, 0x7

    iget-object v2, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->F:Ljava/lang/String;

    invoke-static {p1, v0, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/16 v0, 0x8

    iget-object v2, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->G:Ljava/lang/String;

    invoke-static {p1, v0, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/16 v0, 0x9

    iget-object v2, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->H:Ljava/lang/String;

    invoke-static {p1, v0, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/16 v0, 0xa

    iget-object v2, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->I:Ljava/lang/String;

    invoke-static {p1, v0, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/16 v0, 0xb

    iget-object v2, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->J:Ljava/lang/String;

    invoke-static {p1, v0, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/16 v0, 0xc

    iget-object v2, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->K:Ljava/lang/String;

    invoke-static {p1, v0, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/16 v0, 0xd

    iget-object v2, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->L:Ljava/lang/String;

    invoke-static {p1, v0, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    iget-boolean v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->M:Z

    const/16 v2, 0xe

    invoke-static {p1, v2, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/16 v0, 0xf

    iget-object v1, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->N:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/16 v0, 0x10

    iget-object v1, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->O:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    invoke-static {p1, p2}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method

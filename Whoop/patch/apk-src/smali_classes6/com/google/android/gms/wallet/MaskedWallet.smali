.class public final Lcom/google/android/gms/wallet/MaskedWallet;
.super Lvo/a;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/wallet/MaskedWallet;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public E:Ldq/v;

.field public F:Ldq/v;

.field public G:[Ldq/g;

.field public H:[Ldq/h;

.field public I:Lcom/google/android/gms/identity/intents/model/UserAddress;

.field public J:Lcom/google/android/gms/identity/intents/model/UserAddress;

.field public K:[Ldq/e;

.field public w:Ljava/lang/String;

.field public x:Ljava/lang/String;

.field public y:[Ljava/lang/String;

.field public z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldq/x;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ldq/x;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/wallet/MaskedWallet;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const/16 v0, 0x4f45

    invoke-static {p1, v0}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result v0

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/wallet/MaskedWallet;->w:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/wallet/MaskedWallet;->x:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/google/android/gms/wallet/MaskedWallet;->y:[Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lvo/c;->n(Landroid/os/Parcel;I[Ljava/lang/String;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/google/android/gms/wallet/MaskedWallet;->z:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/google/android/gms/wallet/MaskedWallet;->E:Ldq/v;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/google/android/gms/wallet/MaskedWallet;->F:Ldq/v;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/google/android/gms/wallet/MaskedWallet;->G:[Ldq/g;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->p(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/google/android/gms/wallet/MaskedWallet;->H:[Ldq/h;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->p(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    const/16 v1, 0xa

    iget-object v2, p0, Lcom/google/android/gms/wallet/MaskedWallet;->I:Lcom/google/android/gms/identity/intents/model/UserAddress;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/16 v1, 0xb

    iget-object v2, p0, Lcom/google/android/gms/wallet/MaskedWallet;->J:Lcom/google/android/gms/identity/intents/model/UserAddress;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/16 v1, 0xc

    iget-object v2, p0, Lcom/google/android/gms/wallet/MaskedWallet;->K:[Ldq/e;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->p(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    invoke-static {p1, v0}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method

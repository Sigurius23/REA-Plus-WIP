.class public final Lcom/google/android/gms/wallet/FullWallet;
.super Lvo/a;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/wallet/FullWallet;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public E:Ldq/v;

.field public F:Ldq/v;

.field public G:[Ljava/lang/String;

.field public H:Lcom/google/android/gms/identity/intents/model/UserAddress;

.field public I:Lcom/google/android/gms/identity/intents/model/UserAddress;

.field public J:[Ldq/e;

.field public K:Ldq/n;

.field public w:Ljava/lang/String;

.field public x:Ljava/lang/String;

.field public y:Ldq/w;

.field public z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldq/x;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Ldq/x;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/wallet/FullWallet;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const/16 v0, 0x4f45

    invoke-static {p1, v0}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result v0

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/wallet/FullWallet;->w:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/wallet/FullWallet;->x:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/google/android/gms/wallet/FullWallet;->y:Ldq/w;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/google/android/gms/wallet/FullWallet;->z:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/google/android/gms/wallet/FullWallet;->E:Ldq/v;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/google/android/gms/wallet/FullWallet;->F:Ldq/v;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/google/android/gms/wallet/FullWallet;->G:[Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lvo/c;->n(Landroid/os/Parcel;I[Ljava/lang/String;)V

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/google/android/gms/wallet/FullWallet;->H:Lcom/google/android/gms/identity/intents/model/UserAddress;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/16 v1, 0xa

    iget-object v2, p0, Lcom/google/android/gms/wallet/FullWallet;->I:Lcom/google/android/gms/identity/intents/model/UserAddress;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/16 v1, 0xb

    iget-object v2, p0, Lcom/google/android/gms/wallet/FullWallet;->J:[Ldq/e;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->p(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    const/16 v1, 0xc

    iget-object v2, p0, Lcom/google/android/gms/wallet/FullWallet;->K:Ldq/n;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    invoke-static {p1, v0}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method

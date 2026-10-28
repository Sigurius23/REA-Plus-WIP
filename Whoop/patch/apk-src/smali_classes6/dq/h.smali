.class public final Ldq/h;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ldq/h;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:I

.field public final x:Ljava/lang/String;

.field public final y:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldq/x;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Ldq/x;-><init>(I)V

    sput-object v0, Ldq/h;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/wallet/wobs/CommonWalletObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ldq/h;->w:I

    iput-object p3, p0, Ldq/h;->x:Ljava/lang/String;

    const/4 p3, 0x3

    if-ge p1, p3, :cond_0

    new-instance p1, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    invoke-direct {p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;-><init>()V

    iput-object p2, p1, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->w:Ljava/lang/String;

    iput-object p1, p0, Ldq/h;->y:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    return-void

    :cond_0
    iput-object p4, p0, Ldq/h;->y:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const/16 v0, 0x4f45

    invoke-static {p1, v0}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x4

    invoke-static {p1, v1, v2}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget v1, p0, Ldq/h;->w:I

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v1, 0x3

    iget-object v3, p0, Ldq/h;->x:Ljava/lang/String;

    invoke-static {p1, v1, v3}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    iget-object v1, p0, Ldq/h;->y:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    invoke-static {p1, v2, v1, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    invoke-static {p1, v0}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method

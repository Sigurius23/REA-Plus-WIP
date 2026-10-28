.class public final Lro/g;
.super Lto/d;
.source "SourceFile"


# instance fields
.field public final synthetic k:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/k;I)V
    .locals 0

    iput p2, p0, Lro/g;->k:I

    const-string p2, "GoogleApiClient must not be null"

    invoke-static {p1, p2}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;-><init>(Lcom/google/android/gms/common/api/k;)V

    const-string p1, "Api must not be null"

    sget-object p2, Loo/a;->a:Lcom/google/android/gms/common/api/f;

    invoke-static {p2, p1}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic X(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    iget v0, p0, Lro/g;->k:I

    return-object p1
.end method

.method public final c0(Lcom/google/android/gms/common/api/d;)V
    .locals 4

    iget v0, p0, Lro/g;->k:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lro/e;

    invoke-virtual {p1}, Luo/c;->j()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lro/k;

    new-instance v1, Lro/f;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lro/f;-><init>(Lro/g;I)V

    iget-object p1, p1, Lro/e;->z:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-virtual {v0}, Lip/a;->s()Landroid/os/Parcel;

    move-result-object v2

    sget v3, Lip/i;->a:I

    invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    invoke-static {v2, p1}, Lip/i;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x67

    invoke-virtual {v0, v2, p1}, Lip/a;->X(Landroid/os/Parcel;I)V

    return-void

    :pswitch_0
    check-cast p1, Lro/e;

    invoke-virtual {p1}, Luo/c;->j()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lro/k;

    new-instance v1, Lro/f;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lro/f;-><init>(Lro/g;I)V

    iget-object p1, p1, Lro/e;->z:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-virtual {v0}, Lip/a;->s()Landroid/os/Parcel;

    move-result-object v2

    sget v3, Lip/i;->a:I

    invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    invoke-static {v2, p1}, Lip/i;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x66

    invoke-virtual {v0, v2, p1}, Lip/a;->X(Landroid/os/Parcel;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

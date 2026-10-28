.class public final Lro/f;
.super Lip/h;
.source "SourceFile"

# interfaces
.implements Lro/j;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lro/g;


# direct methods
.method public constructor <init>(Lro/g;I)V
    .locals 0

    iput p2, p0, Lro/f;->g:I

    iput-object p1, p0, Lro/f;->h:Lro/g;

    const-string p1, "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks"

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lip/h;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public P(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget v0, p0, Lro/f;->g:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lro/f;->h:Lro/g;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->a0(Lcom/google/android/gms/common/api/m;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public S(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget v0, p0, Lro/f;->g:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lro/f;->h:Lro/g;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->a0(Lcom/google/android/gms/common/api/m;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final k0(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 0

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return p1

    :pswitch_0
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lip/i;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    invoke-static {p2}, Lip/i;->b(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lro/j;->P(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_0

    :pswitch_1
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lip/i;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    invoke-static {p2}, Lip/i;->b(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lro/j;->S(Lcom/google/android/gms/common/api/Status;)V

    :goto_0
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    const/4 p1, 0x1

    return p1

    :pswitch_2
    sget-object p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lip/i;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lip/i;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    invoke-static {p2}, Lip/i;->b(Landroid/os/Parcel;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_data_0
    .packed-switch 0x65
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

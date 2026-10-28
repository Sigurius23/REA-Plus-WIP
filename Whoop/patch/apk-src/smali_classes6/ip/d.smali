.class public final Lip/d;
.super Lip/h;
.source "SourceFile"

# interfaces
.implements Lto/g;


# instance fields
.field public final synthetic g:I

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 2
    const-string v0, "com.google.android.gms.common.api.internal.IStatusCallback"

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lip/h;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(ILcq/i;)V
    .locals 0

    .line 1
    iput p1, p0, Lip/d;->g:I

    iput-object p2, p0, Lip/d;->h:Ljava/lang/Object;

    invoke-direct {p0}, Lip/d;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcq/q;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lip/d;->g:I

    .line 3
    invoke-direct {p0}, Lip/d;-><init>()V

    iput-object p1, p0, Lip/d;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final J(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    iget v0, p0, Lip/d;->g:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lip/d;->h:Ljava/lang/Object;

    check-cast v0, Lcq/q;

    invoke-virtual {v0, p1}, Lcq/q;->b(Lvo/a;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lip/d;->h:Ljava/lang/Object;

    check-cast v0, Lcq/i;

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Ls3/d;->q(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcq/i;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lip/d;->h:Ljava/lang/Object;

    check-cast v0, Lcq/i;

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Ls3/d;->q(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcq/i;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final j0(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 0

    const/4 p3, 0x1

    if-ne p1, p3, :cond_0

    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Ljp/a;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    invoke-static {p2}, Ljp/a;->b(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lto/g;->J(Lcom/google/android/gms/common/api/Status;)V

    return p3

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

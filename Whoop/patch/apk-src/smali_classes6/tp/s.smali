.class public Ltp/s;
.super Lip/h;
.source "SourceFile"

# interfaces
.implements Lnp/d;


# instance fields
.field public final synthetic g:I

.field public final h:Lcq/i;


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "com.google.android.gms.location.internal.IFusedLocationProviderCallback"

    const/4 v1, 0x2

    .line 1
    invoke-direct {p0, v0, v1}, Lip/h;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(ILcq/i;)V
    .locals 0

    iput p1, p0, Ltp/s;->g:I

    packed-switch p1, :pswitch_data_0

    iput-object p2, p0, Ltp/s;->h:Lcq/i;

    .line 2
    invoke-direct {p0}, Ltp/s;-><init>()V

    return-void

    .line 3
    :pswitch_0
    invoke-direct {p0}, Ltp/s;-><init>()V

    iput-object p2, p0, Ltp/s;->h:Lcq/i;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method private final n0()V
    .locals 0

    return-void
.end method

.method private o0()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final V(Lnp/b;)V
    .locals 5

    iget v0, p0, Ltp/s;->g:I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p1, Lnp/b;->w:Lcom/google/android/gms/common/api/Status;

    iget-object v0, p0, Ltp/s;->h:Lcq/i;

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Ls3/d;->q(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcq/i;)V

    return-void

    :pswitch_0
    iget-object p1, p1, Lnp/b;->w:Lcom/google/android/gms/common/api/Status;

    iget-object v0, p0, Ltp/s;->h:Lcq/i;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/common/api/ApiException;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    const-string v2, "Got null status from location service"

    const/4 v3, 0x0

    const/16 v4, 0x8

    invoke-direct {v1, v4, v2, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/a;)V

    invoke-direct {p1, v1}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v0, p1}, Lcq/i;->c(Ljava/lang/Exception;)Z

    goto :goto_0

    :cond_0
    iget v1, p1, Lcom/google/android/gms/common/api/Status;->w:I

    if-nez v1, :cond_1

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1}, Lcq/i;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Ls3/d;->g(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/ApiException;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcq/i;->c(Ljava/lang/Exception;)Z

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public i0()V
    .locals 1

    iget v0, p0, Ltp/s;->g:I

    return-void
.end method

.method public final m0(Landroid/os/Parcel;I)Z
    .locals 1

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 p1, 0x2

    if-eq p2, p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-interface {p0}, Lnp/d;->i0()V

    return v0

    :cond_1
    sget-object p2, Lnp/b;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, p2}, Lnp/l;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lnp/b;

    invoke-interface {p0, p1}, Lnp/d;->V(Lnp/b;)V

    return v0
.end method

.class public final Lcp/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcp/f;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lev/i;


# direct methods
.method public constructor <init>(Lev/i;I)V
    .locals 0

    iput p2, p0, Lcp/e;->a:I

    packed-switch p2, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcp/e;->b:Lev/i;

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcp/e;->b:Lev/i;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcp/e;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x5

    return v0

    :pswitch_0
    const/4 v0, 0x4

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()V
    .locals 3

    iget v0, p0, Lcp/e;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcp/e;->b:Lev/i;

    iget-object v0, v0, Lev/i;->a:Ljava/lang/Object;

    check-cast v0, Lq30/w0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v0, v0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v0, Lvp/f;

    invoke-virtual {v0}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :pswitch_0
    iget-object v0, p0, Lcp/e;->b:Lev/i;

    iget-object v0, v0, Lev/i;->a:Ljava/lang/Object;

    check-cast v0, Lq30/w0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_1
    iget-object v0, v0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v0, Lvp/f;

    invoke-virtual {v0}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v1

    const/16 v2, 0xc

    invoke-virtual {v0, v1, v2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

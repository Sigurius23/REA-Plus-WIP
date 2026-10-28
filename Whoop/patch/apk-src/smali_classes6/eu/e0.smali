.class public final Leu/e0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lup/b;


# direct methods
.method public synthetic constructor <init>(Lup/b;I)V
    .locals 0

    iput p2, p0, Leu/e0;->w:I

    iput-object p1, p0, Leu/e0;->x:Lup/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Leu/e0;->w:I

    const-string v1, "it"

    const/16 v2, 0x10

    const/16 v3, 0x14

    const/16 v4, 0x12

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    iget-object v6, p0, Leu/e0;->x:Lup/b;

    const-string v7, "$this$set"

    packed-switch v0, :pswitch_data_0

    check-cast p1, Leu/b0;

    check-cast p2, Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object p1, v6, Lup/b;->a:Lvp/e;

    invoke-virtual {p1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p2}, Lop/h;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p2, 0x5f

    invoke-virtual {p1, v0, p2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v5

    :catch_0
    move-exception p1

    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :pswitch_0
    check-cast p1, Leu/b0;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_1
    iget-object p1, v6, Lup/b;->a:Lvp/e;

    invoke-virtual {p1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    sget v1, Lop/h;->a:I

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p1, v0, v4}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v5

    :catch_1
    move-exception p1

    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :pswitch_1
    check-cast p1, Leu/b0;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_2
    iget-object p1, v6, Lup/b;->a:Lvp/e;

    invoke-virtual {p1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    sget v1, Lop/h;->a:I

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/16 p2, 0x16

    invoke-virtual {p1, v0, p2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    return-object v5

    :catch_2
    move-exception p1

    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :pswitch_2
    check-cast p1, Leu/b0;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_3
    iget-object p1, v6, Lup/b;->a:Lvp/e;

    invoke-virtual {p1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    sget v1, Lop/h;->a:I

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p1, v0, v3}, Lip/a;->j0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_3

    return-object v5

    :catch_3
    move-exception p1

    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :pswitch_3
    check-cast p1, Leu/b0;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_4
    iget-object p1, v6, Lup/b;->a:Lvp/e;

    invoke-virtual {p1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    sget v1, Lop/h;->a:I

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/16 p2, 0x29

    invoke-virtual {p1, v0, p2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_4

    return-object v5

    :catch_4
    move-exception p1

    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :pswitch_4
    check-cast p1, Leu/b0;

    if-nez p2, :cond_0

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, v6, Lup/b;->a:Lvp/e;

    :try_start_5
    invoke-virtual {p1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lop/h;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 v0, 0x18

    invoke-virtual {p1, p2, v0}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_5

    return-object v5

    :catch_5
    move-exception p1

    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_0
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_5
    check-cast p1, Leu/b0;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Lup/b;->b()Lty/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_6
    iget-object p1, p1, Lty/c;->x:Ljava/lang/Object;

    check-cast p1, Lvp/b;

    invoke-virtual {p1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    sget v1, Lop/h;->a:I

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 p2, 0x5

    invoke-virtual {p1, v0, p2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_6

    return-object v5

    :catch_6
    move-exception p1

    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :pswitch_6
    check-cast p1, Leu/b0;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Lup/b;->b()Lty/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_7
    iget-object p1, p1, Lty/c;->x:Ljava/lang/Object;

    check-cast p1, Lvp/b;

    invoke-virtual {p1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    sget v1, Lop/h;->a:I

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 p2, 0x1

    invoke-virtual {p1, v0, p2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_7
    .catch Landroid/os/RemoteException; {:try_start_7 .. :try_end_7} :catch_7

    return-object v5

    :catch_7
    move-exception p1

    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :pswitch_7
    check-cast p1, Leu/b0;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Lup/b;->b()Lty/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_8
    iget-object p1, p1, Lty/c;->x:Ljava/lang/Object;

    check-cast p1, Lvp/b;

    invoke-virtual {p1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    sget v1, Lop/h;->a:I

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 p2, 0x6

    invoke-virtual {p1, v0, p2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_8
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_8} :catch_8

    return-object v5

    :catch_8
    move-exception p1

    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :pswitch_8
    check-cast p1, Leu/b0;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Lup/b;->b()Lty/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_9
    iget-object p1, p1, Lty/c;->x:Ljava/lang/Object;

    check-cast p1, Lvp/b;

    invoke-virtual {p1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    sget v1, Lop/h;->a:I

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p1, v0, v3}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_9
    .catch Landroid/os/RemoteException; {:try_start_9 .. :try_end_9} :catch_9

    return-object v5

    :catch_9
    move-exception p1

    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :pswitch_9
    check-cast p1, Leu/b0;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Lup/b;->b()Lty/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_a
    iget-object p1, p1, Lty/c;->x:Ljava/lang/Object;

    check-cast p1, Lvp/b;

    invoke-virtual {p1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    sget v1, Lop/h;->a:I

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 p2, 0x4

    invoke-virtual {p1, v0, p2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_a
    .catch Landroid/os/RemoteException; {:try_start_a .. :try_end_a} :catch_a

    return-object v5

    :catch_a
    move-exception p1

    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :pswitch_a
    check-cast p1, Leu/b0;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Lup/b;->b()Lty/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_b
    iget-object p1, p1, Lty/c;->x:Ljava/lang/Object;

    check-cast p1, Lvp/b;

    invoke-virtual {p1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    sget v1, Lop/h;->a:I

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 p2, 0x7

    invoke-virtual {p1, v0, p2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_b
    .catch Landroid/os/RemoteException; {:try_start_b .. :try_end_b} :catch_b

    return-object v5

    :catch_b
    move-exception p1

    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :pswitch_b
    check-cast p1, Leu/b0;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Lup/b;->b()Lty/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_c
    iget-object p1, p1, Lty/c;->x:Ljava/lang/Object;

    check-cast p1, Lvp/b;

    invoke-virtual {p1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    sget v1, Lop/h;->a:I

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 p2, 0x3

    invoke-virtual {p1, v0, p2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_c
    .catch Landroid/os/RemoteException; {:try_start_c .. :try_end_c} :catch_c

    return-object v5

    :catch_c
    move-exception p1

    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :pswitch_c
    check-cast p1, Leu/b0;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Lup/b;->b()Lty/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_d
    iget-object p1, p1, Lty/c;->x:Ljava/lang/Object;

    check-cast p1, Lvp/b;

    invoke-virtual {p1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    sget v1, Lop/h;->a:I

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p1, v0, v4}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_d
    .catch Landroid/os/RemoteException; {:try_start_d .. :try_end_d} :catch_d

    return-object v5

    :catch_d
    move-exception p1

    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :pswitch_d
    check-cast p1, Leu/b0;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Lup/b;->b()Lty/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_e
    iget-object p1, p1, Lty/c;->x:Ljava/lang/Object;

    check-cast p1, Lvp/b;

    invoke-virtual {p1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    sget v1, Lop/h;->a:I

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p1, v0, v2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_e
    .catch Landroid/os/RemoteException; {:try_start_e .. :try_end_e} :catch_e

    return-object v5

    :catch_e
    move-exception p1

    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :pswitch_e
    check-cast p1, Leu/b0;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Lup/b;->b()Lty/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_f
    iget-object p1, p1, Lty/c;->x:Ljava/lang/Object;

    check-cast p1, Lvp/b;

    invoke-virtual {p1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    sget v1, Lop/h;->a:I

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 p2, 0x2

    invoke-virtual {p1, v0, p2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_f
    .catch Landroid/os/RemoteException; {:try_start_f .. :try_end_f} :catch_f

    return-object v5

    :catch_f
    move-exception p1

    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :pswitch_f
    check-cast p1, Leu/b0;

    check-cast p2, Ll0/k1;

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Leu/b0;->c:Ly3/c;

    iget-object v1, p1, Leu/b0;->d:Ly3/m;

    invoke-interface {p2, v1}, Ll0/k1;->b(Ly3/m;)F

    move-result v1

    invoke-interface {v0, v1}, Ly3/c;->F(F)I

    move-result v1

    invoke-interface {p2}, Ll0/k1;->d()F

    move-result v2

    invoke-interface {v0, v2}, Ly3/c;->F(F)I

    move-result v2

    iget-object p1, p1, Leu/b0;->d:Ly3/m;

    invoke-interface {p2, p1}, Ll0/k1;->c(Ly3/m;)F

    move-result p1

    invoke-interface {v0, p1}, Ly3/c;->F(F)I

    move-result p1

    invoke-interface {p2}, Ll0/k1;->a()F

    move-result p2

    invoke-interface {v0, p2}, Ly3/c;->F(F)I

    move-result p2

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_10
    iget-object v0, v6, Lup/b;->a:Lvp/e;

    invoke-virtual {v0}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/16 p1, 0x27

    invoke-virtual {v0, v3, p1}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_10
    .catch Landroid/os/RemoteException; {:try_start_10 .. :try_end_10} :catch_10

    return-object v5

    :catch_10
    move-exception p1

    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :pswitch_10
    check-cast p1, Leu/b0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_11
    iget-object p1, v6, Lup/b;->a:Lvp/e;

    invoke-virtual {p1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeFloat(F)V

    const/16 p2, 0x5c

    invoke-virtual {p1, v0, p2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_11
    .catch Landroid/os/RemoteException; {:try_start_11 .. :try_end_11} :catch_11

    return-object v5

    :catch_11
    move-exception p1

    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :pswitch_11
    check-cast p1, Leu/b0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_12
    iget-object p1, v6, Lup/b;->a:Lvp/e;

    invoke-virtual {p1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeFloat(F)V

    const/16 p2, 0x5d

    invoke-virtual {p1, v0, p2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_12
    .catch Landroid/os/RemoteException; {:try_start_12 .. :try_end_12} :catch_12

    return-object v5

    :catch_12
    move-exception p1

    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :pswitch_12
    check-cast p1, Leu/b0;

    check-cast p2, Leu/c0;

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p2, Leu/c0;->w:I

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_13
    iget-object p2, v6, Lup/b;->a:Lvp/e;

    invoke-virtual {p2}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2, v0, v2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_13
    .catch Landroid/os/RemoteException; {:try_start_13 .. :try_end_13} :catch_13

    return-object v5

    :catch_13
    move-exception p1

    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :pswitch_13
    check-cast p1, Leu/b0;

    check-cast p2, Lwp/g;

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_14
    iget-object p1, v6, Lup/b;->a:Lvp/e;

    invoke-virtual {p1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p2}, Lop/h;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p2, 0x5b

    invoke-virtual {p1, v0, p2}, Lip/a;->j0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V
    :try_end_14
    .catch Landroid/os/RemoteException; {:try_start_14 .. :try_end_14} :catch_14

    return-object v5

    :catch_14
    move-exception p1

    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

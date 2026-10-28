.class public abstract Lip/h;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# instance fields
.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lip/h;->f:I

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput p2, p0, Lip/h;->f:I

    packed-switch p2, :pswitch_data_0

    .line 2
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 3
    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void

    .line 4
    :pswitch_0
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 5
    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void

    .line 6
    :pswitch_1
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 7
    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void

    .line 8
    :pswitch_2
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 9
    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .locals 1

    iget v0, p0, Lip/h;->f:I

    return-object p0
.end method

.method public abstract j0(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
.end method

.method public abstract k0(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
.end method

.method public abstract l0(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
.end method

.method public abstract m0(Landroid/os/Parcel;I)Z
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 5

    iget v0, p0, Lip/h;->f:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    const v3, 0xffffff

    const/4 v4, 0x1

    packed-switch v0, :pswitch_data_0

    if-le p1, v3, :cond_0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p3

    if-eqz p3, :cond_1

    :goto_0
    move v2, v4

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Landroid/os/Binder;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_1
    move-object p3, p0

    check-cast p3, Lsr/f;

    iget-object p4, p3, Lsr/f;->g:Lcq/i;

    iget-object v0, p3, Lsr/f;->h:Lsr/h;

    if-eq p1, v1, :cond_5

    const/4 v1, 0x3

    if-eq p1, v1, :cond_4

    const/4 p3, 0x4

    if-eq p1, p3, :cond_3

    const/4 p3, 0x5

    if-eq p1, p3, :cond_2

    goto :goto_1

    :cond_2
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2}, Lxr/n;->a(Landroid/os/Parcel;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    invoke-static {p2}, Lxr/n;->b(Landroid/os/Parcel;)V

    iget-object p1, v0, Lsr/h;->e:Lxr/b;

    invoke-virtual {p1, p4}, Lxr/b;->c(Lcq/i;)V

    goto :goto_0

    :cond_3
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2}, Lxr/n;->a(Landroid/os/Parcel;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    invoke-static {p2}, Lxr/n;->b(Landroid/os/Parcel;)V

    iget-object p1, v0, Lsr/h;->e:Lxr/b;

    invoke-virtual {p1, p4}, Lxr/b;->c(Lcq/i;)V

    goto :goto_0

    :cond_4
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2}, Lxr/n;->a(Landroid/os/Parcel;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    invoke-static {p2}, Lxr/n;->b(Landroid/os/Parcel;)V

    invoke-interface {p3, p1}, Lxr/s;->b(Landroid/os/Bundle;)V

    goto :goto_0

    :cond_5
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2}, Lxr/n;->a(Landroid/os/Parcel;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    invoke-static {p2}, Lxr/n;->b(Landroid/os/Parcel;)V

    invoke-interface {p3, p1}, Lxr/s;->U(Landroid/os/Bundle;)V

    goto :goto_0

    :goto_1
    return v2

    :pswitch_0
    if-le p1, v3, :cond_6

    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p3

    if-eqz p3, :cond_7

    :goto_2
    move v2, v4

    goto/16 :goto_5

    :cond_6
    invoke-virtual {p0}, Landroid/os/Binder;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_7
    move-object p3, p0

    check-cast p3, Lur/f;

    if-ne p1, v1, :cond_b

    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    sget p4, Lvr/a;->a:I

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p4

    if-nez p4, :cond_8

    const/4 p1, 0x0

    goto :goto_3

    :cond_8
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Parcelable;

    :goto_3
    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {p2}, Landroid/os/Parcel;->dataAvail()I

    move-result p2

    if-gtz p2, :cond_a

    iget-object p2, p3, Lur/f;->i:Lur/g;

    iget-object p2, p2, Lur/g;->a:Lvr/i;

    if-eqz p2, :cond_9

    iget-object p4, p3, Lur/f;->h:Lcq/i;

    iget-object v0, p2, Lvr/i;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p2, Lvr/i;->e:Ljava/util/HashSet;

    invoke-virtual {v1, p4}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance p4, Lvr/h;

    invoke-direct {p4, p2, v2}, Lvr/h;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2}, Lvr/i;->a()Landroid/os/Handler;

    move-result-object p2

    invoke-virtual {p2, p4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_4

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_9
    :goto_4
    iget-object p2, p3, Lur/f;->g:Ldb/j0;

    const-string p4, "onGetLaunchReviewFlowInfo"

    new-array v0, v2, [Ljava/lang/Object;

    invoke-virtual {p2, p4, v0}, Ldb/j0;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p2, "confirmation_intent"

    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/app/PendingIntent;

    const-string p4, "is_review_no_op"

    invoke-virtual {p1, p4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    new-instance p4, Lur/c;

    invoke-direct {p4, p2, p1}, Lur/c;-><init>(Landroid/app/PendingIntent;Z)V

    iget-object p1, p3, Lur/f;->h:Lcq/i;

    invoke-virtual {p1, p4}, Lcq/i;->d(Ljava/lang/Object;)V

    goto :goto_2

    :cond_a
    new-instance p1, Landroid/os/BadParcelableException;

    const-string p3, "Parcel data not fully consumed, unread size: "

    invoke-static {p2, p3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/BadParcelableException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    :goto_5
    return v2

    :pswitch_1
    if-le p1, v3, :cond_c

    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p4

    if-eqz p4, :cond_d

    goto :goto_6

    :cond_c
    invoke-virtual {p0}, Landroid/os/Binder;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_d
    invoke-virtual {p0, p1, p2, p3}, Lip/h;->l0(ILandroid/os/Parcel;Landroid/os/Parcel;)Z

    move-result v4

    :goto_6
    return v4

    :pswitch_2
    if-le p1, v3, :cond_e

    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p3

    if-eqz p3, :cond_f

    goto :goto_7

    :cond_e
    invoke-virtual {p0}, Landroid/os/Binder;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_f
    invoke-virtual {p0, p2, p1}, Lip/h;->m0(Landroid/os/Parcel;I)Z

    move-result v4

    :goto_7
    return v4

    :pswitch_3
    if-le p1, v3, :cond_10

    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p4

    if-eqz p4, :cond_11

    goto :goto_8

    :cond_10
    invoke-virtual {p0}, Landroid/os/Binder;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_11
    invoke-virtual {p0, p1, p2, p3}, Lip/h;->j0(ILandroid/os/Parcel;Landroid/os/Parcel;)Z

    move-result v4

    :goto_8
    return v4

    :pswitch_4
    if-le p1, v3, :cond_12

    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p4

    if-eqz p4, :cond_13

    goto :goto_9

    :cond_12
    invoke-virtual {p0}, Landroid/os/Binder;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_13
    invoke-virtual {p0, p1, p2, p3}, Lip/h;->k0(ILandroid/os/Parcel;Landroid/os/Parcel;)Z

    move-result v4

    :goto_9
    return v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

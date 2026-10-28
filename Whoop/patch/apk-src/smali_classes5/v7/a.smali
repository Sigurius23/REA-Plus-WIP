.class public final Lv7/a;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcq/i;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lv7/a;->f:I

    .line 1
    iput-object p1, p0, Lv7/a;->g:Ljava/lang/Object;

    .line 2
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 3
    const-string p1, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks"

    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lds/w;I)V
    .locals 0

    iput p2, p0, Lv7/a;->f:I

    packed-switch p2, :pswitch_data_0

    .line 4
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 5
    const-string p2, "androidx.health.platform.client.service.IDeleteDataCallback"

    invoke-virtual {p0, p0, p2}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 6
    iput-object p1, p0, Lv7/a;->g:Ljava/lang/Object;

    return-void

    .line 7
    :pswitch_0
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 8
    const-string p2, "androidx.health.platform.client.service.IReadDataRangeCallback"

    invoke-virtual {p0, p0, p2}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 9
    iput-object p1, p0, Lv7/a;->g:Ljava/lang/Object;

    return-void

    .line 10
    :pswitch_1
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 11
    const-string p2, "androidx.health.platform.client.service.IInsertDataCallback"

    invoke-virtual {p0, p0, p2}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 12
    iput-object p1, p0, Lv7/a;->g:Ljava/lang/Object;

    return-void

    .line 13
    :pswitch_2
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 14
    const-string p2, "androidx.health.platform.client.service.IGetChangesTokenCallback"

    invoke-virtual {p0, p0, p2}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 15
    iput-object p1, p0, Lv7/a;->g:Ljava/lang/Object;

    return-void

    .line 16
    :pswitch_3
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 17
    const-string p2, "androidx.health.platform.client.service.IGetChangesCallback"

    invoke-virtual {p0, p0, p2}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 18
    iput-object p1, p0, Lv7/a;->g:Ljava/lang/Object;

    return-void

    .line 19
    :pswitch_4
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 20
    const-string p2, "androidx.health.platform.client.service.IFilterGrantedPermissionsCallback"

    invoke-virtual {p0, p0, p2}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 21
    iput-object p1, p0, Lv7/a;->g:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .locals 1

    iget v0, p0, Lv7/a;->f:I

    return-object p0
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 9

    iget v0, p0, Lv7/a;->f:I

    const-string v1, "response"

    const-string v2, "error"

    const/4 v3, 0x2

    const v4, 0x5f4e5446

    iget-object v5, p0, Lv7/a;->g:Ljava/lang/Object;

    const v6, 0xffffff

    const/4 v7, 0x1

    const/4 v8, 0x0

    packed-switch v0, :pswitch_data_0

    if-le p1, v6, :cond_0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, Landroid/os/Binder;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_1
    if-ne p1, v7, :cond_5

    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    sget p3, Lmp/k;->a:I

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p3

    if-nez p3, :cond_2

    move-object p1, v8

    goto :goto_0

    :cond_2
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Parcelable;

    :goto_0
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    sget-object p3, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p4

    if-nez p4, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {p3, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p3

    move-object v8, p3

    check-cast v8, Landroid/os/Parcelable;

    :goto_1
    check-cast v8, Landroid/app/PendingIntent;

    invoke-virtual {p2}, Landroid/os/Parcel;->dataAvail()I

    move-result p2

    if-gtz p2, :cond_4

    iget-object p2, p0, Lv7/a;->g:Ljava/lang/Object;

    check-cast p2, Lcq/i;

    invoke-static {p1, v8, p2}, Ls3/d;->q(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcq/i;)V

    goto :goto_2

    :cond_4
    new-instance p1, Landroid/os/BadParcelableException;

    const-string p3, "Parcel data not fully consumed, unread size: "

    invoke-static {p2, p3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/BadParcelableException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    const/4 v7, 0x0

    :goto_2
    return v7

    :pswitch_0
    check-cast v5, Lds/w;

    const-string v0, "androidx.health.platform.client.service.IReadDataRangeCallback"

    if-lt p1, v7, :cond_6

    if-gt p1, v6, :cond_6

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_6
    if-ne p1, v4, :cond_7

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_3

    :cond_7
    if-eq p1, v7, :cond_a

    if-eq p1, v3, :cond_8

    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v7

    goto :goto_3

    :cond_8
    sget-object p1, Lt7/c;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p3

    if-eqz p3, :cond_9

    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v8

    :cond_9
    check-cast v8, Lt7/c;

    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8}, Lx7/a;->a(Lt7/c;)Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {v5, p1}, Lds/n;->k(Ljava/lang/Throwable;)Z

    goto :goto_3

    :cond_a
    sget-object p1, Lf8/d;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p3

    if-eqz p3, :cond_b

    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v8

    :cond_b
    check-cast v8, Lf8/d;

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, v8, Lf8/d;->x:Landroidx/health/platform/client/proto/t2;

    invoke-virtual {v5, p1}, Lds/w;->l(Ljava/lang/Object;)Z

    :goto_3
    return v7

    :pswitch_1
    check-cast v5, Lds/w;

    const-string v0, "androidx.health.platform.client.service.IInsertDataCallback"

    if-lt p1, v7, :cond_c

    if-gt p1, v6, :cond_c

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_c
    if-ne p1, v4, :cond_d

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_4

    :cond_d
    if-eq p1, v7, :cond_10

    if-eq p1, v3, :cond_e

    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v7

    goto :goto_4

    :cond_e
    sget-object p1, Lt7/c;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p3

    if-eqz p3, :cond_f

    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v8

    :cond_f
    check-cast v8, Lt7/c;

    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8}, Lx7/a;->a(Lt7/c;)Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {v5, p1}, Lds/n;->k(Ljava/lang/Throwable;)Z

    goto :goto_4

    :cond_10
    sget-object p1, Lf8/c;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p3

    if-eqz p3, :cond_11

    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v8

    :cond_11
    check-cast v8, Lf8/c;

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, v8, Lf8/c;->x:Landroidx/health/platform/client/proto/w0;

    invoke-virtual {v5, p1}, Lds/w;->l(Ljava/lang/Object;)Z

    :goto_4
    return v7

    :pswitch_2
    check-cast v5, Lds/w;

    const-string v0, "androidx.health.platform.client.service.IGetChangesTokenCallback"

    if-lt p1, v7, :cond_12

    if-gt p1, v6, :cond_12

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_12
    if-ne p1, v4, :cond_13

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_5

    :cond_13
    if-eq p1, v7, :cond_16

    if-eq p1, v3, :cond_14

    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v7

    goto :goto_5

    :cond_14
    sget-object p1, Lt7/c;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p3

    if-eqz p3, :cond_15

    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v8

    :cond_15
    check-cast v8, Lt7/c;

    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8}, Lx7/a;->a(Lt7/c;)Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {v5, p1}, Lds/n;->k(Ljava/lang/Throwable;)Z

    goto :goto_5

    :cond_16
    sget-object p1, Lf8/b;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p3

    if-eqz p3, :cond_17

    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v8

    :cond_17
    check-cast v8, Lf8/b;

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, v8, Lf8/b;->x:Landroidx/health/platform/client/proto/q2;

    invoke-virtual {v5, p1}, Lds/w;->l(Ljava/lang/Object;)Z

    :goto_5
    return v7

    :pswitch_3
    check-cast v5, Lds/w;

    const-string v0, "androidx.health.platform.client.service.IGetChangesCallback"

    if-lt p1, v7, :cond_18

    if-gt p1, v6, :cond_18

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_18
    if-ne p1, v4, :cond_19

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_6

    :cond_19
    if-eq p1, v7, :cond_1c

    if-eq p1, v3, :cond_1a

    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v7

    goto :goto_6

    :cond_1a
    sget-object p1, Lt7/c;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p3

    if-eqz p3, :cond_1b

    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v8

    :cond_1b
    check-cast v8, Lt7/c;

    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8}, Lx7/a;->a(Lt7/c;)Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {v5, p1}, Lds/n;->k(Ljava/lang/Throwable;)Z

    goto :goto_6

    :cond_1c
    sget-object p1, Lf8/a;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p3

    if-eqz p3, :cond_1d

    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v8

    :cond_1d
    check-cast v8, Lf8/a;

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, v8, Lf8/a;->x:Landroidx/health/platform/client/proto/p2;

    invoke-virtual {v5, p1}, Lds/w;->l(Ljava/lang/Object;)Z

    :goto_6
    return v7

    :pswitch_4
    check-cast v5, Lds/w;

    const-string v0, "androidx.health.platform.client.service.IFilterGrantedPermissionsCallback"

    if-lt p1, v7, :cond_1e

    if-gt p1, v6, :cond_1e

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_1e
    if-ne p1, v4, :cond_1f

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_8

    :cond_1f
    if-eq p1, v7, :cond_22

    if-eq p1, v3, :cond_20

    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v7

    goto :goto_8

    :cond_20
    sget-object p1, Lt7/c;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p3

    if-eqz p3, :cond_21

    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v8

    :cond_21
    check-cast v8, Lt7/c;

    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8}, Lx7/a;->a(Lt7/c;)Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {v5, p1}, Lds/n;->k(Ljava/lang/Throwable;)Z

    goto :goto_8

    :cond_22
    sget-object p1, Landroidx/health/platform/client/permission/Permission;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2, p1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Ljava/util/ArrayList;

    const/16 p3, 0xa

    invoke-static {p1, p3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_23

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroidx/health/platform/client/permission/Permission;

    iget-object p3, p3, Landroidx/health/platform/client/permission/Permission;->x:Landroidx/health/platform/client/proto/w1;

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_23
    invoke-static {p2}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v5, p1}, Lds/w;->l(Ljava/lang/Object;)Z

    :goto_8
    return v7

    :pswitch_5
    check-cast v5, Lds/w;

    const-string v0, "androidx.health.platform.client.service.IDeleteDataCallback"

    if-lt p1, v7, :cond_24

    if-gt p1, v6, :cond_24

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_24
    if-ne p1, v4, :cond_25

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_9

    :cond_25
    if-eq p1, v7, :cond_28

    if-eq p1, v3, :cond_26

    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v7

    goto :goto_9

    :cond_26
    sget-object p1, Lt7/c;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p3

    if-eqz p3, :cond_27

    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v8

    :cond_27
    check-cast v8, Lt7/c;

    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8}, Lx7/a;->a(Lt7/c;)Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {v5, p1}, Lds/n;->k(Ljava/lang/Throwable;)Z

    goto :goto_9

    :cond_28
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v5, p1}, Lds/w;->l(Ljava/lang/Object;)Z

    :goto_9
    return v7

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

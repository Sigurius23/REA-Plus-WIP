.class public final synthetic Lqm2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh5/u;
.implements Llo/h;
.implements Lz7/c;
.implements Lcq/d;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lqm2/c;->w:I

    iput-object p2, p0, Lqm2/c;->x:Ljava/lang/Object;

    iput-object p3, p0, Lqm2/c;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lu0/y0;)Lcom/google/android/material/datepicker/n;
    .locals 4

    iget-object p1, p0, Lqm2/c;->x:Ljava/lang/Object;

    check-cast p1, Lu0/r1;

    iget-object v0, p0, Lqm2/c;->y:Ljava/lang/Object;

    check-cast v0, Ll3/e;

    iget-object p1, p1, Lu0/r1;->a:Lp1/k1;

    invoke-virtual {p1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll3/r0;

    const/4 v1, 0x0

    if-nez p1, :cond_0

    new-instance p1, Lty1/e;

    const/4 v0, 0x5

    invoke-direct {p1, v0}, Lty1/e;-><init>(I)V

    new-instance v0, Lcom/google/android/material/datepicker/n;

    invoke-direct {v0, v1, v1, p1}, Lcom/google/android/material/datepicker/n;-><init>(IILc93/a;)V

    return-object v0

    :cond_0
    invoke-static {v0, p1}, Lu0/r1;->c(Ll3/e;Ll3/r0;)Ll3/e;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance p1, Lty1/e;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Lty1/e;-><init>(I)V

    new-instance v0, Lcom/google/android/material/datepicker/n;

    invoke-direct {v0, v1, v1, p1}, Lcom/google/android/material/datepicker/n;-><init>(IILc93/a;)V

    return-object v0

    :cond_1
    iget v1, v0, Ll3/e;->b:I

    iget v0, v0, Ll3/e;->c:I

    invoke-virtual {p1, v1, v0}, Ll3/r0;->j(II)Li2/j;

    move-result-object p1

    invoke-virtual {p1}, Li2/j;->g()Lh2/c;

    move-result-object p1

    invoke-static {p1}, Lvo/c;->c(Lh2/c;)Ly3/k;

    move-result-object p1

    invoke-virtual {p1}, Ly3/k;->c()I

    move-result v0

    invoke-virtual {p1}, Ly3/k;->a()I

    move-result v1

    new-instance v2, Lsc0/c;

    const/16 v3, 0xd

    invoke-direct {v2, p1, v3}, Lsc0/c;-><init>(Ljava/lang/Object;I)V

    new-instance p1, Lcom/google/android/material/datepicker/n;

    invoke-direct {p1, v0, v1, v2}, Lcom/google/android/material/datepicker/n;-><init>(IILc93/a;)V

    return-object p1
.end method

.method public b(Lio/getstream/android/video/generated/models/VideoEvent;)V
    .locals 8

    iget-object v0, p0, Lqm2/c;->x:Ljava/lang/Object;

    check-cast v0, Lt23/s0;

    iget-object v1, p0, Lqm2/c;->y:Ljava/lang/Object;

    check-cast v1, Ldc3/u;

    invoke-virtual {v0}, Lt23/s0;->b()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->x:Lb23/g;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    const/4 v6, 0x0

    if-eqz v3, :cond_0

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/VideoEvent;->getEventType()Ljava/lang/String;

    move-result-object v3

    const-string v7, "[livestreamFlow] #track; event.type: "

    invoke-static {v7, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v4, v5, v3, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    instance-of v2, p1, Lv33/z;

    if-eqz v2, :cond_2

    move-object v2, p1

    check-cast v2, Lv33/z;

    iget-object v3, v2, Lv33/z;->b:Ljava/lang/String;

    iget-object v4, v2, Lv33/z;->a:Ljava/lang/String;

    sget-object v5, Lstream/video/sfu/models/ParticipantSource;->PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED:Lstream/video/sfu/models/ParticipantSource;

    invoke-virtual {v0, v3, v4, v5}, Lt23/s0;->d(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/ParticipantSource;)Lt23/g2;

    move-result-object v3

    iget-object v2, v2, Lv33/z;->c:Lstream/video/sfu/models/TrackType;

    sget-object v4, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_VIDEO:Lstream/video/sfu/models/TrackType;

    if-ne v2, v4, :cond_1

    iget-object v2, v3, Lt23/g2;->k:Lec3/h2;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v6, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    sget-object v4, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_AUDIO:Lstream/video/sfu/models/TrackType;

    if-ne v2, v4, :cond_2

    iget-object v2, v3, Lt23/g2;->o:Lec3/h2;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v6, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    instance-of v2, p1, Lv33/a0;

    if-eqz v2, :cond_4

    check-cast p1, Lv33/a0;

    iget-object v2, p1, Lv33/a0;->b:Ljava/lang/String;

    iget-object v3, p1, Lv33/a0;->a:Ljava/lang/String;

    sget-object v4, Lstream/video/sfu/models/ParticipantSource;->PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED:Lstream/video/sfu/models/ParticipantSource;

    invoke-virtual {v0, v2, v3, v4}, Lt23/s0;->d(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/ParticipantSource;)Lt23/g2;

    move-result-object v2

    iget-object p1, p1, Lv33/a0;->c:Lstream/video/sfu/models/TrackType;

    sget-object v3, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_VIDEO:Lstream/video/sfu/models/TrackType;

    if-ne p1, v3, :cond_3

    iget-object p1, v2, Lt23/g2;->k:Lec3/h2;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v6, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    sget-object v3, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_AUDIO:Lstream/video/sfu/models/TrackType;

    if-ne p1, v3, :cond_4

    iget-object p1, v2, Lt23/g2;->o:Lec3/h2;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v6, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_4
    :goto_1
    invoke-static {v0, v1}, Lt23/k0;->f(Lt23/s0;Ldc3/u;)V

    return-void
.end method

.method public c(Landroid/os/IInterface;Lds/w;)V
    .locals 7

    iget v0, p0, Lqm2/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lqm2/c;->x:Ljava/lang/Object;

    check-cast v0, Lv7/b;

    iget-object v1, p0, Lqm2/c;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/health/platform/client/proto/i2;

    check-cast p1, Lg8/c;

    const-string v2, "this$0"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lv7/b;->b()Le8/e;

    move-result-object v0

    new-instance v2, Le8/c;

    invoke-direct {v2, v1}, Le8/c;-><init>(Landroidx/health/platform/client/proto/i2;)V

    new-instance v1, Lv7/a;

    const/4 v3, 0x3

    invoke-direct {v1, p2, v3}, Lv7/a;-><init>(Lds/w;I)V

    check-cast p1, Lg8/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object p2

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    :try_start_0
    const-string v4, "androidx.health.platform.client.service.IHealthDataService"

    invoke-virtual {p2, v4}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    invoke-static {p2, v0}, Lx30/s0;->N(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {p2, v2}, Lx30/s0;->N(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->writeStrongInterface(Landroid/os/IInterface;)V

    iget-object p1, p1, Lg8/a;->f:Landroid/os/IBinder;

    const/16 v0, 0x11

    const/4 v1, 0x0

    invoke-interface {p1, v0, p2, v3, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lqm2/c;->x:Ljava/lang/Object;

    check-cast v0, Lv7/b;

    iget-object v1, p0, Lqm2/c;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/health/platform/client/proto/g2;

    check-cast p1, Lg8/c;

    const-string v2, "this$0"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lv7/b;->b()Le8/e;

    move-result-object v0

    new-instance v2, Le8/b;

    invoke-direct {v2, v1}, Le8/b;-><init>(Landroidx/health/platform/client/proto/g2;)V

    new-instance v1, Lv7/a;

    const/4 v3, 0x2

    invoke-direct {v1, p2, v3}, Lv7/a;-><init>(Lds/w;I)V

    check-cast p1, Lg8/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object p2

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    :try_start_1
    const-string v4, "androidx.health.platform.client.service.IHealthDataService"

    invoke-virtual {p2, v4}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    invoke-static {p2, v0}, Lx30/s0;->N(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {p2, v2}, Lx30/s0;->N(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->writeStrongInterface(Landroid/os/IInterface;)V

    iget-object p1, p1, Lg8/a;->f:Landroid/os/IBinder;

    const/16 v0, 0x12

    const/4 v1, 0x0

    invoke-interface {p1, v0, p2, v3, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_1
    move-exception p1

    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    throw p1

    :pswitch_1
    iget-object v0, p0, Lqm2/c;->x:Ljava/lang/Object;

    check-cast v0, Lv7/b;

    iget-object v1, p0, Lqm2/c;->y:Ljava/lang/Object;

    check-cast v1, Le8/d;

    check-cast p1, Lg8/c;

    const-string v2, "this$0"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lv7/b;->b()Le8/e;

    move-result-object v0

    new-instance v2, Lv7/a;

    const/4 v3, 0x5

    invoke-direct {v2, p2, v3}, Lv7/a;-><init>(Lds/w;I)V

    check-cast p1, Lg8/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object p2

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    :try_start_2
    const-string v4, "androidx.health.platform.client.service.IHealthDataService"

    invoke-virtual {p2, v4}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    invoke-static {p2, v0}, Lx30/s0;->N(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {p2, v1}, Lx30/s0;->N(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-virtual {p2, v2}, Landroid/os/Parcel;->writeStrongInterface(Landroid/os/IInterface;)V

    iget-object p1, p1, Lg8/a;->f:Landroid/os/IBinder;

    const/16 v0, 0x10

    const/4 v1, 0x0

    invoke-interface {p1, v0, p2, v3, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    throw p1

    :pswitch_2
    iget-object v0, p0, Lqm2/c;->x:Ljava/lang/Object;

    check-cast v0, Lv7/b;

    iget-object v1, p0, Lqm2/c;->y:Ljava/lang/Object;

    check-cast v1, Le8/a;

    check-cast p1, Lg8/c;

    const-string v2, "this$0"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lv7/b;->b()Le8/e;

    move-result-object v0

    new-instance v2, Lv7/a;

    const/4 v3, 0x0

    invoke-direct {v2, p2, v3}, Lv7/a;-><init>(Lds/w;I)V

    check-cast p1, Lg8/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object p2

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    :try_start_3
    const-string v4, "androidx.health.platform.client.service.IHealthDataService"

    invoke-virtual {p2, v4}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    invoke-static {p2, v0}, Lx30/s0;->N(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {p2, v1}, Lx30/s0;->N(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-virtual {p2, v2}, Landroid/os/Parcel;->writeStrongInterface(Landroid/os/IInterface;)V

    iget-object p1, p1, Lg8/a;->f:Landroid/os/IBinder;

    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-interface {p1, v0, p2, v3, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_3
    move-exception p1

    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    throw p1

    :pswitch_3
    iget-object v0, p0, Lqm2/c;->x:Ljava/lang/Object;

    check-cast v0, Lv7/b;

    iget-object v1, p0, Lqm2/c;->y:Ljava/lang/Object;

    check-cast v1, Le8/f;

    check-cast p1, Lg8/c;

    const-string v2, "this$0"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lv7/b;->b()Le8/e;

    move-result-object v0

    new-instance v2, Lv7/a;

    const/4 v3, 0x4

    invoke-direct {v2, p2, v3}, Lv7/a;-><init>(Lds/w;I)V

    check-cast p1, Lg8/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object p2

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    :try_start_4
    const-string v4, "androidx.health.platform.client.service.IHealthDataService"

    invoke-virtual {p2, v4}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    invoke-static {p2, v0}, Lx30/s0;->N(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {p2, v1}, Lx30/s0;->N(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-virtual {p2, v2}, Landroid/os/Parcel;->writeStrongInterface(Landroid/os/IInterface;)V

    iget-object p1, p1, Lg8/a;->f:Landroid/os/IBinder;

    const/16 v0, 0xa

    const/4 v1, 0x0

    invoke-interface {p1, v0, p2, v3, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_4
    move-exception p1

    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    throw p1

    :pswitch_4
    iget-object v0, p0, Lqm2/c;->x:Ljava/lang/Object;

    check-cast v0, Lv7/b;

    iget-object v1, p0, Lqm2/c;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    check-cast p1, Lg8/c;

    const-string v2, "this$0"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lv7/b;->b()Le8/e;

    move-result-object v0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/health/platform/client/proto/w1;

    new-instance v4, Landroidx/health/platform/client/permission/Permission;

    invoke-direct {v4, v3}, Landroidx/health/platform/client/permission/Permission;-><init>(Landroidx/health/platform/client/proto/w1;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Lv7/a;

    const/4 v3, 0x1

    invoke-direct {v2, p2, v3}, Lv7/a;-><init>(Lds/w;I)V

    check-cast p1, Lg8/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object p2

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    :try_start_5
    const-string v4, "androidx.health.platform.client.service.IHealthDataService"

    invoke-virtual {p2, v4}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    invoke-static {p2, v0}, Lx30/s0;->N(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v4, 0x0

    move v5, v4

    :goto_1
    if-ge v5, v0, :cond_1

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/os/Parcelable;

    invoke-static {p2, v6}, Lx30/s0;->N(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->writeStrongInterface(Landroid/os/IInterface;)V

    iget-object p1, p1, Lg8/a;->f:Landroid/os/IBinder;

    const/16 v0, 0x17

    invoke-interface {p1, v0, p2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_5
    move-exception p1

    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    throw p1

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lqm2/c;->x:Ljava/lang/Object;

    check-cast v0, Lrm/v0;

    iget-object v1, p0, Lqm2/c;->y:Ljava/lang/Object;

    check-cast v1, Lio/s;

    check-cast p1, Lrm/z0;

    iget-object v0, v0, Lrm/v0;->h:Lsn/x0;

    invoke-interface {p1, v0, v1}, Lrm/z0;->e(Lsn/x0;Lio/s;)V

    return-void
.end method

.method public o(Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 2

    iget-object v0, p0, Lqm2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;

    iget-object v1, p0, Lqm2/c;->y:Ljava/lang/Object;

    check-cast v1, Landroid/view/View;

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;->X(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;Landroid/view/View;Landroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object p1

    return-object p1
.end method

.method public q(Lcom/google/android/gms/tasks/Task;)V
    .locals 5

    iget v0, p0, Lqm2/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p0, Lqm2/c;->x:Ljava/lang/Object;

    check-cast p1, Lzt/h;

    iget-object v0, p0, Lqm2/c;->y:Ljava/lang/Object;

    check-cast v0, Landroid/content/Intent;

    invoke-virtual {p1, v0}, Lzt/h;->b(Landroid/content/Intent;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lqm2/c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lqm2/c;->y:Ljava/lang/Object;

    check-cast v1, Landroid/app/Activity;

    const-string v2, "launchTask"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object p1, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    const-string v0, "PlayStoreHandler: Play Store review requested via ReviewManagerFactory."

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/crypto/tink/internal/l0;->a0([Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    sget-object v2, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to request review flow: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    if-eqz v0, :cond_2

    invoke-static {v1, v0}, Ls4/a;->h(Landroid/app/Activity;Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
    .end packed-switch
.end method

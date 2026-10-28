.class public final Landroid/support/v4/media/session/k;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/media/session/d;


# static fields
.field public static final synthetic g:I


# instance fields
.field public final f:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(Landroid/support/v4/media/session/l;)V
    .locals 1

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    const-string v0, "android.support.v4.media.session.IMediaSession"

    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroid/support/v4/media/session/k;->f:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final A()Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public final B(Landroid/support/v4/media/session/b;)V
    .locals 5

    iget-object v0, p0, Landroid/support/v4/media/session/k;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/media/session/l;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result v1

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v2

    new-instance v3, Lr8/a;

    const-string v4, "android.media.session.MediaController"

    invoke-direct {v3, v4, v1, v2}, Lr8/a;-><init>(Ljava/lang/String;II)V

    iget-object v1, v0, Landroid/support/v4/media/session/l;->d:Landroid/os/RemoteCallbackList;

    invoke-virtual {v1, p1, v3}, Landroid/os/RemoteCallbackList;->register(Landroid/os/IInterface;Ljava/lang/Object;)Z

    iget-object p1, v0, Landroid/support/v4/media/session/l;->c:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final C(Landroid/support/v4/media/RatingCompat;)V
    .locals 0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final D(Landroid/support/v4/media/MediaDescriptionCompat;)V
    .locals 0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final E()Z
    .locals 1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public final F(Landroid/support/v4/media/MediaDescriptionCompat;)V
    .locals 0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final G(II)V
    .locals 0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final I()Ljava/lang/CharSequence;
    .locals 1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public final L(Landroid/support/v4/media/session/b;)V
    .locals 2

    iget-object v0, p0, Landroid/support/v4/media/session/k;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/media/session/l;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, v0, Landroid/support/v4/media/session/l;->d:Landroid/os/RemoteCallbackList;

    invoke-virtual {v1, p1}, Landroid/os/RemoteCallbackList;->unregister(Landroid/os/IInterface;)Z

    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    iget-object p1, v0, Landroid/support/v4/media/session/l;->c:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final M(II)V
    .locals 0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final N()V
    .locals 1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public final O(J)V
    .locals 0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final Q(F)V
    .locals 0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final T(Z)V
    .locals 0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final W()Landroid/support/v4/media/session/PlaybackStateCompat;
    .locals 30

    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v4/media/session/k;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/media/session/l;

    if-eqz v1, :cond_7

    iget-object v2, v1, Landroid/support/v4/media/session/l;->e:Landroid/support/v4/media/session/PlaybackStateCompat;

    iget-object v1, v1, Landroid/support/v4/media/session/l;->f:Landroid/support/v4/media/MediaMetadataCompat;

    if-eqz v2, :cond_6

    iget v3, v2, Landroid/support/v4/media/session/PlaybackStateCompat;->z:F

    iget-wide v4, v2, Landroid/support/v4/media/session/PlaybackStateCompat;->H:J

    iget v6, v2, Landroid/support/v4/media/session/PlaybackStateCompat;->w:I

    iget-wide v7, v2, Landroid/support/v4/media/session/PlaybackStateCompat;->x:J

    const-wide/16 v9, -0x1

    cmp-long v11, v7, v9

    if-nez v11, :cond_0

    goto/16 :goto_1

    :cond_0
    const/4 v11, 0x3

    if-eq v6, v11, :cond_1

    const/4 v11, 0x4

    if-eq v6, v11, :cond_1

    const/4 v11, 0x5

    if-ne v6, v11, :cond_6

    :cond_1
    const-wide/16 v11, 0x0

    cmp-long v6, v4, v11

    if-lez v6, :cond_6

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v24

    sub-long v4, v24, v4

    long-to-float v4, v4

    mul-float/2addr v3, v4

    float-to-long v3, v3

    add-long/2addr v3, v7

    if-eqz v1, :cond_2

    iget-object v1, v1, Landroid/support/v4/media/MediaMetadataCompat;->w:Landroid/os/Bundle;

    const-string v5, "android.media.metadata.DURATION"

    invoke-virtual {v1, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v1, v5, v11, v12}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v9

    :cond_2
    cmp-long v1, v9, v11

    if-ltz v1, :cond_3

    cmp-long v1, v3, v9

    if-lez v1, :cond_3

    move-wide v15, v9

    goto :goto_0

    :cond_3
    cmp-long v1, v3, v11

    if-gez v1, :cond_4

    move-wide v15, v11

    goto :goto_0

    :cond_4
    move-wide v15, v3

    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-wide v3, v2, Landroid/support/v4/media/session/PlaybackStateCompat;->y:J

    iget-wide v5, v2, Landroid/support/v4/media/session/PlaybackStateCompat;->E:J

    iget v7, v2, Landroid/support/v4/media/session/PlaybackStateCompat;->F:I

    iget-object v8, v2, Landroid/support/v4/media/session/PlaybackStateCompat;->G:Ljava/lang/CharSequence;

    iget-object v9, v2, Landroid/support/v4/media/session/PlaybackStateCompat;->I:Ljava/util/ArrayList;

    if-eqz v9, :cond_5

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_5
    iget-wide v9, v2, Landroid/support/v4/media/session/PlaybackStateCompat;->J:J

    iget-object v11, v2, Landroid/support/v4/media/session/PlaybackStateCompat;->K:Landroid/os/Bundle;

    iget v14, v2, Landroid/support/v4/media/session/PlaybackStateCompat;->w:I

    iget v2, v2, Landroid/support/v4/media/session/PlaybackStateCompat;->z:F

    new-instance v13, Landroid/support/v4/media/session/PlaybackStateCompat;

    move-object/from16 v26, v1

    move/from16 v19, v2

    move-wide/from16 v17, v3

    move-wide/from16 v20, v5

    move/from16 v22, v7

    move-object/from16 v23, v8

    move-wide/from16 v27, v9

    move-object/from16 v29, v11

    invoke-direct/range {v13 .. v29}, Landroid/support/v4/media/session/PlaybackStateCompat;-><init>(IJJFJILjava/lang/CharSequence;JLjava/util/ArrayList;JLandroid/os/Bundle;)V

    move-object v2, v13

    :cond_6
    :goto_1
    return-object v2

    :cond_7
    const/4 v1, 0x0

    return-object v1
.end method

.method public final Y()V
    .locals 1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public final Z()V
    .locals 0

    return-void
.end method

.method public final a0(I)V
    .locals 0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final asBinder()Landroid/os/IBinder;
    .locals 0

    return-object p0
.end method

.method public final b0(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final c()Landroid/support/v4/media/MediaMetadataCompat;
    .locals 1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public final d()J
    .locals 1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public final d0()I
    .locals 1

    iget-object v0, p0, Landroid/support/v4/media/session/k;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/media/session/l;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public final e(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final e0()Landroid/support/v4/media/session/ParcelableVolumeInfo;
    .locals 1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public final f(Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final g()Landroid/app/PendingIntent;
    .locals 1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public final g0(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final getExtras()Landroid/os/Bundle;
    .locals 1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public final getTag()Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/media/session/k;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/media/session/l;

    return-void
.end method

.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final j()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/media/session/k;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/media/session/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    return-object v0
.end method

.method public final k(Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final l(Landroid/view/KeyEvent;)Z
    .locals 0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final m(Landroid/support/v4/media/RatingCompat;Landroid/os/Bundle;)V
    .locals 0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final n(Landroid/support/v4/media/MediaDescriptionCompat;I)V
    .locals 0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final next()V
    .locals 1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 4

    const-string v0, "android.support.v4.media.session.IMediaSession"

    const/4 v1, 0x1

    if-lt p1, v1, :cond_0

    const v2, 0xffffff

    if-gt p1, v2, :cond_0

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_0
    const v2, 0x5f4e5446

    if-ne p1, v2, :cond_1

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    :cond_1
    const-string v0, "android.support.v4.media.session.IMediaControllerCallback"

    const/4 v2, 0x0

    const/4 v3, 0x0

    packed-switch p1, :pswitch_data_0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1

    :pswitch_0
    sget-object p1, Landroid/support/v4/media/RatingCompat;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lbp/b;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/support/v4/media/RatingCompat;

    sget-object p4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lbp/b;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Bundle;

    invoke-interface {p0, p1, p2}, Landroid/support/v4/media/session/d;->m(Landroid/support/v4/media/RatingCompat;Landroid/os/Bundle;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_1
    invoke-interface {p0}, Landroid/support/v4/media/session/d;->j()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1, v1}, Lbp/b;->L(Landroid/os/Parcel;Landroid/os/Parcelable;I)V

    return v1

    :pswitch_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readFloat()F

    move-result p1

    invoke-interface {p0, p1}, Landroid/support/v4/media/session/d;->Q(F)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_3
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-interface {p0, p1}, Landroid/support/v4/media/session/d;->z(I)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_4
    invoke-interface {p0}, Landroid/support/v4/media/session/d;->p()I

    move-result p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    :pswitch_5
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_2

    move v3, v1

    :cond_2
    invoke-interface {p0, v3}, Landroid/support/v4/media/session/d;->T(Z)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_6
    invoke-interface {p0}, Landroid/support/v4/media/session/d;->t()V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    :pswitch_7
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-interface {p0, p1}, Landroid/support/v4/media/session/d;->r(I)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_8
    sget-object p1, Landroid/support/v4/media/MediaDescriptionCompat;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lbp/b;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/support/v4/media/MediaDescriptionCompat;

    invoke-interface {p0, p1}, Landroid/support/v4/media/session/d;->D(Landroid/support/v4/media/MediaDescriptionCompat;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_9
    sget-object p1, Landroid/support/v4/media/MediaDescriptionCompat;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lbp/b;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/support/v4/media/MediaDescriptionCompat;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-interface {p0, p1, p2}, Landroid/support/v4/media/session/d;->n(Landroid/support/v4/media/MediaDescriptionCompat;I)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_a
    sget-object p1, Landroid/support/v4/media/MediaDescriptionCompat;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lbp/b;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/support/v4/media/MediaDescriptionCompat;

    invoke-interface {p0, p1}, Landroid/support/v4/media/session/d;->F(Landroid/support/v4/media/MediaDescriptionCompat;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_b
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_c
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-interface {p0, p1}, Landroid/support/v4/media/session/d;->a0(I)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_d
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    :pswitch_e
    invoke-interface {p0}, Landroid/support/v4/media/session/d;->d0()I

    move-result p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    :pswitch_f
    sget-object p1, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lbp/b;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    sget-object p4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lbp/b;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Bundle;

    invoke-interface {p0, p1, p2}, Landroid/support/v4/media/session/d;->f(Landroid/net/Uri;Landroid/os/Bundle;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_10
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    sget-object p4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lbp/b;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Bundle;

    invoke-interface {p0, p2, p1}, Landroid/support/v4/media/session/d;->g0(Landroid/os/Bundle;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_11
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    sget-object p4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lbp/b;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Bundle;

    invoke-interface {p0, p2, p1}, Landroid/support/v4/media/session/d;->u(Landroid/os/Bundle;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_12
    invoke-interface {p0}, Landroid/support/v4/media/session/d;->prepare()V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_13
    invoke-interface {p0}, Landroid/support/v4/media/session/d;->h()V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    :pswitch_14
    invoke-interface {p0}, Landroid/support/v4/media/session/d;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1, v1}, Lbp/b;->L(Landroid/os/Parcel;Landroid/os/Parcelable;I)V

    return v1

    :pswitch_15
    invoke-interface {p0}, Landroid/support/v4/media/session/d;->I()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    if-eqz p1, :cond_3

    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {p1, p3, v1}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    return v1

    :cond_3
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    :pswitch_16
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    const/4 p1, -0x1

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    :pswitch_17
    invoke-interface {p0}, Landroid/support/v4/media/session/d;->W()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1, v1}, Lbp/b;->L(Landroid/os/Parcel;Landroid/os/Parcelable;I)V

    return v1

    :pswitch_18
    invoke-interface {p0}, Landroid/support/v4/media/session/d;->c()Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1, v1}, Lbp/b;->L(Landroid/os/Parcel;Landroid/os/Parcelable;I)V

    return v1

    :pswitch_19
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    sget-object p4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lbp/b;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Bundle;

    invoke-interface {p0, p2, p1}, Landroid/support/v4/media/session/d;->e(Landroid/os/Bundle;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_1a
    sget-object p1, Landroid/support/v4/media/RatingCompat;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lbp/b;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/support/v4/media/RatingCompat;

    invoke-interface {p0, p1}, Landroid/support/v4/media/session/d;->C(Landroid/support/v4/media/RatingCompat;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_1b
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide p1

    invoke-interface {p0, p1, p2}, Landroid/support/v4/media/session/d;->O(J)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_1c
    invoke-interface {p0}, Landroid/support/v4/media/session/d;->w()V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_1d
    invoke-interface {p0}, Landroid/support/v4/media/session/d;->N()V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_1e
    invoke-interface {p0}, Landroid/support/v4/media/session/d;->previous()V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_1f
    invoke-interface {p0}, Landroid/support/v4/media/session/d;->next()V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_20
    invoke-interface {p0}, Landroid/support/v4/media/session/d;->stop()V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_21
    invoke-interface {p0}, Landroid/support/v4/media/session/d;->pause()V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_22
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide p1

    invoke-interface {p0, p1, p2}, Landroid/support/v4/media/session/d;->x(J)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_23
    sget-object p1, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lbp/b;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    sget-object p4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lbp/b;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Bundle;

    invoke-interface {p0, p1, p2}, Landroid/support/v4/media/session/d;->k(Landroid/net/Uri;Landroid/os/Bundle;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_24
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    sget-object p4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lbp/b;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Bundle;

    invoke-interface {p0, p2, p1}, Landroid/support/v4/media/session/d;->b0(Landroid/os/Bundle;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_25
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    sget-object p4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lbp/b;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Bundle;

    invoke-interface {p0, p2, p1}, Landroid/support/v4/media/session/d;->i(Landroid/os/Bundle;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_26
    invoke-interface {p0}, Landroid/support/v4/media/session/d;->Y()V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_27
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p4

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    invoke-interface {p0, p1, p4}, Landroid/support/v4/media/session/d;->M(II)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_28
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p4

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    invoke-interface {p0, p1, p4}, Landroid/support/v4/media/session/d;->G(II)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_29
    invoke-interface {p0}, Landroid/support/v4/media/session/d;->e0()Landroid/support/v4/media/session/ParcelableVolumeInfo;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1, v1}, Lbp/b;->L(Landroid/os/Parcel;Landroid/os/Parcelable;I)V

    return v1

    :pswitch_2a
    invoke-interface {p0}, Landroid/support/v4/media/session/d;->d()J

    move-result-wide p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1, p2}, Landroid/os/Parcel;->writeLong(J)V

    return v1

    :pswitch_2b
    invoke-interface {p0}, Landroid/support/v4/media/session/d;->g()Landroid/app/PendingIntent;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1, v1}, Lbp/b;->L(Landroid/os/Parcel;Landroid/os/Parcelable;I)V

    return v1

    :pswitch_2c
    invoke-interface {p0}, Landroid/support/v4/media/session/d;->getTag()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    :pswitch_2d
    invoke-interface {p0}, Landroid/support/v4/media/session/d;->A()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    :pswitch_2e
    invoke-interface {p0}, Landroid/support/v4/media/session/d;->E()Z

    move-result p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    :pswitch_2f
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    if-eqz p2, :cond_5

    instance-of p4, p2, Landroid/support/v4/media/session/b;

    if-eqz p4, :cond_5

    move-object v2, p2

    check-cast v2, Landroid/support/v4/media/session/b;

    goto :goto_0

    :cond_5
    new-instance v2, Landroid/support/v4/media/session/a;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object p1, v2, Landroid/support/v4/media/session/a;->f:Landroid/os/IBinder;

    :goto_0
    invoke-interface {p0, v2}, Landroid/support/v4/media/session/d;->L(Landroid/support/v4/media/session/b;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_30
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_1

    :cond_6
    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    if-eqz p2, :cond_7

    instance-of p4, p2, Landroid/support/v4/media/session/b;

    if-eqz p4, :cond_7

    move-object v2, p2

    check-cast v2, Landroid/support/v4/media/session/b;

    goto :goto_1

    :cond_7
    new-instance v2, Landroid/support/v4/media/session/a;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object p1, v2, Landroid/support/v4/media/session/a;->f:Landroid/os/IBinder;

    :goto_1
    invoke-interface {p0, v2}, Landroid/support/v4/media/session/d;->B(Landroid/support/v4/media/session/b;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_31
    sget-object p1, Landroid/view/KeyEvent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lbp/b;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/KeyEvent;

    invoke-interface {p0, p1}, Landroid/support/v4/media/session/d;->l(Landroid/view/KeyEvent;)Z

    move-result p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    :pswitch_32
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    sget-object p4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lbp/b;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/os/Bundle;

    sget-object v0, Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v0}, Lbp/b;->d(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;

    invoke-interface {p0, p1, p4, p2}, Landroid/support/v4/media/session/d;->v(Ljava/lang/String;Landroid/os/Bundle;Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
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

.method public final p()I
    .locals 1

    iget-object v0, p0, Landroid/support/v4/media/session/k;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/media/session/l;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public final pause()V
    .locals 1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public final prepare()V
    .locals 1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public final previous()V
    .locals 1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public final r(I)V
    .locals 0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final stop()V
    .locals 1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public final t()V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/media/session/k;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/media/session/l;

    return-void
.end method

.method public final u(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final v(Ljava/lang/String;Landroid/os/Bundle;Landroid/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper;)V
    .locals 0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final w()V
    .locals 1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public final x(J)V
    .locals 0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final z(I)V
    .locals 0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.class public final Lsm/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrm/z0;
.implements Lsn/a0;
.implements Lvm/e;


# instance fields
.field public final E:Landroid/util/SparseArray;

.field public F:Ld9/p;

.field public G:Lrm/b1;

.field public H:Llo/v;

.field public I:Z

.field public final w:Llo/t;

.field public final x:Lrm/m1;

.field public final y:Lrm/n1;

.field public final z:La30/w0;


# direct methods
.method public constructor <init>(Llo/t;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lsm/d;->w:Llo/t;

    new-instance v0, Ld9/p;

    sget v1, Llo/y;->a:I

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    :goto_0
    new-instance v2, Lsm/b;

    const/16 v3, 0x10

    invoke-direct {v2, v3}, Lsm/b;-><init>(I)V

    invoke-direct {v0, v1, p1, v2}, Ld9/p;-><init>(Landroid/os/Looper;Llo/t;Llo/i;)V

    iput-object v0, p0, Lsm/d;->F:Ld9/p;

    new-instance p1, Lrm/m1;

    invoke-direct {p1}, Lrm/m1;-><init>()V

    iput-object p1, p0, Lsm/d;->x:Lrm/m1;

    new-instance v0, Lrm/n1;

    invoke-direct {v0}, Lrm/n1;-><init>()V

    iput-object v0, p0, Lsm/d;->y:Lrm/n1;

    new-instance v0, La30/w0;

    invoke-direct {v0, p1}, La30/w0;-><init>(Lrm/m1;)V

    iput-object v0, p0, Lsm/d;->z:La30/w0;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lsm/d;->E:Landroid/util/SparseArray;

    return-void
.end method


# virtual methods
.method public final A(ILsn/v;Lsn/m;Ll9/y;Ljava/io/IOException;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lsm/d;->w(ILsn/v;)Lsm/a;

    move-result-object p1

    new-instance p2, Lsm/c;

    const/16 p3, 0x10

    invoke-direct {p2, p3}, Lsm/c;-><init>(I)V

    const/16 p3, 0x3eb

    invoke-virtual {p0, p1, p3, p2}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final B(Lrm/u;Landroid/os/Looper;)V
    .locals 3

    iget-object v0, p0, Lsm/d;->G:Lrm/b1;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lsm/d;->z:La30/w0;

    iget-object v0, v0, La30/w0;->y:Ljava/lang/Object;

    check-cast v0, Lzr/g0;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Llo/a;->i(Z)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lsm/d;->G:Lrm/b1;

    const/4 v0, 0x0

    iget-object v1, p0, Lsm/d;->w:Llo/t;

    invoke-virtual {v1, p2, v0}, Llo/t;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Llo/v;

    move-result-object v0

    iput-object v0, p0, Lsm/d;->H:Llo/v;

    iget-object v0, p0, Lsm/d;->F:Ld9/p;

    new-instance v1, Lrm/p;

    invoke-direct {v1, p0, p1}, Lrm/p;-><init>(Lsm/d;Lrm/b1;)V

    iget-object p1, v0, Ld9/p;->b:Ljava/lang/Object;

    check-cast p1, Llo/t;

    new-instance v2, Ld9/p;

    iget-object v0, v0, Ld9/p;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v2, v0, p2, p1, v1}, Ld9/p;-><init>(Ljava/util/concurrent/CopyOnWriteArraySet;Landroid/os/Looper;Llo/t;Llo/i;)V

    iput-object v2, p0, Lsm/d;->F:Ld9/p;

    return-void
.end method

.method public final G(ILsn/v;Ll9/y;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lsm/d;->w(ILsn/v;)Lsm/a;

    move-result-object p1

    new-instance p2, Lsm/b;

    const/16 p3, 0x1d

    invoke-direct {p2, p3}, Lsm/b;-><init>(I)V

    const/16 p3, 0x3ed

    invoke-virtual {p0, p1, p3, p2}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final a(Lrm/w0;)V
    .locals 2

    invoke-virtual {p0}, Lsm/d;->t()Lsm/a;

    move-result-object p1

    new-instance v0, Lsm/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lsm/b;-><init>(I)V

    const/16 v1, 0xc

    invoke-virtual {p0, p1, v1, v0}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final a0(ILsn/v;Lsn/m;Ll9/y;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lsm/d;->w(ILsn/v;)Lsm/a;

    move-result-object p1

    new-instance p2, Lsm/c;

    const/16 p3, 0xa

    invoke-direct {p2, p3}, Lsm/c;-><init>(I)V

    const/16 p3, 0x3ea

    invoke-virtual {p0, p1, p3, p2}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final b(Lrm/i;)V
    .locals 2

    invoke-virtual {p0}, Lsm/d;->t()Lsm/a;

    move-result-object p1

    new-instance v0, Lsm/c;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lsm/c;-><init>(I)V

    const/16 v1, 0x1d

    invoke-virtual {p0, p1, v1, v0}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final c(Lrm/k0;I)V
    .locals 1

    invoke-virtual {p0}, Lsm/d;->t()Lsm/a;

    move-result-object p1

    new-instance p2, Lsm/b;

    const/16 v0, 0xa

    invoke-direct {p2, v0}, Lsm/b;-><init>(I)V

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0, p2}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final d(ILsn/v;Lsn/m;Ll9/y;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lsm/d;->w(ILsn/v;)Lsm/a;

    move-result-object p1

    new-instance p2, Lsm/c;

    const/4 p3, 0x0

    invoke-direct {p2, p3}, Lsm/c;-><init>(I)V

    const/16 p3, 0x3e8

    invoke-virtual {p0, p1, p3, p2}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final e(Lsn/x0;Lio/s;)V
    .locals 1

    invoke-virtual {p0}, Lsm/d;->t()Lsm/a;

    move-result-object p1

    new-instance p2, Lsm/c;

    const/4 v0, 0x2

    invoke-direct {p2, v0}, Lsm/c;-><init>(I)V

    invoke-virtual {p0, p1, v0, p2}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final f(IZ)V
    .locals 1

    invoke-virtual {p0}, Lsm/d;->t()Lsm/a;

    move-result-object p1

    new-instance p2, Lsm/c;

    const/4 v0, 0x6

    invoke-direct {p2, v0}, Lsm/c;-><init>(I)V

    const/16 v0, 0x1e

    invoke-virtual {p0, p1, v0, p2}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final g(I)V
    .locals 4

    iget-object p1, p0, Lsm/d;->G:Lrm/b1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lsm/d;->z:La30/w0;

    iget-object v1, v0, La30/w0;->y:Ljava/lang/Object;

    check-cast v1, Lzr/g0;

    iget-object v2, v0, La30/w0;->F:Ljava/lang/Object;

    check-cast v2, Lsn/v;

    iget-object v3, v0, La30/w0;->x:Ljava/lang/Object;

    check-cast v3, Lrm/m1;

    invoke-static {p1, v1, v2, v3}, La30/w0;->p(Lrm/b1;Lzr/g0;Lsn/v;Lrm/m1;)Lsn/v;

    move-result-object v1

    iput-object v1, v0, La30/w0;->E:Ljava/lang/Object;

    check-cast p1, Lrm/u;

    invoke-virtual {p1}, Lrm/u;->b0()Lrm/o1;

    move-result-object p1

    invoke-virtual {v0, p1}, La30/w0;->L(Lrm/o1;)V

    invoke-virtual {p0}, Lsm/d;->t()Lsm/a;

    move-result-object p1

    new-instance v0, Lsm/c;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lsm/c;-><init>(I)V

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final h(ILsn/v;Ll9/y;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lsm/d;->w(ILsn/v;)Lsm/a;

    move-result-object p1

    new-instance p2, Lsm/b;

    const/4 p3, 0x5

    invoke-direct {p2, p3}, Lsm/b;-><init>(I)V

    const/16 p3, 0x3ec

    invoke-virtual {p0, p1, p3, p2}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final i(Lin/c;)V
    .locals 2

    invoke-virtual {p0}, Lsm/d;->t()Lsm/a;

    move-result-object p1

    new-instance v0, Lsm/c;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lsm/c;-><init>(I)V

    const/16 v1, 0x1c

    invoke-virtual {p0, p1, v1, v0}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final j(Lrm/x0;)V
    .locals 2

    invoke-virtual {p0}, Lsm/d;->t()Lsm/a;

    move-result-object p1

    new-instance v0, Lsm/b;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lsm/b;-><init>(I)V

    const/16 v1, 0xd

    invoke-virtual {p0, p1, v1, v0}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final k(Lrm/y0;)V
    .locals 0

    return-void
.end method

.method public final l(Lcom/google/android/exoplayer2/PlaybackException;)V
    .locals 2

    instance-of v0, p1, Lcom/google/android/exoplayer2/ExoPlaybackException;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/exoplayer2/ExoPlaybackException;

    iget-object p1, p1, Lcom/google/android/exoplayer2/ExoPlaybackException;->H:Lsn/t;

    if-eqz p1, :cond_0

    new-instance v0, Lsn/v;

    invoke-direct {v0, p1}, Lsn/t;-><init>(Lsn/t;)V

    invoke-virtual {p0, v0}, Lsm/d;->v(Lsn/v;)Lsm/a;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lsm/d;->t()Lsm/a;

    move-result-object p1

    :goto_0
    new-instance v0, Lsm/b;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lsm/b;-><init>(I)V

    const/16 v1, 0xa

    invoke-virtual {p0, p1, v1, v0}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final m()V
    .locals 3

    invoke-virtual {p0}, Lsm/d;->t()Lsm/a;

    move-result-object v0

    new-instance v1, Lsm/b;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lsm/b;-><init>(I)V

    const/4 v2, -0x1

    invoke-virtual {p0, v0, v2, v1}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final n(Lcom/google/android/exoplayer2/PlaybackException;)V
    .locals 2

    instance-of v0, p1, Lcom/google/android/exoplayer2/ExoPlaybackException;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/exoplayer2/ExoPlaybackException;

    iget-object p1, p1, Lcom/google/android/exoplayer2/ExoPlaybackException;->H:Lsn/t;

    if-eqz p1, :cond_0

    new-instance v0, Lsn/v;

    invoke-direct {v0, p1}, Lsn/t;-><init>(Lsn/t;)V

    invoke-virtual {p0, v0}, Lsm/d;->v(Lsn/v;)Lsm/a;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lsm/d;->t()Lsm/a;

    move-result-object p1

    :goto_0
    new-instance v0, Lsm/b;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lsm/b;-><init>(I)V

    const/16 v1, 0xa

    invoke-virtual {p0, p1, v1, v0}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final o(Lio/w;)V
    .locals 2

    invoke-virtual {p0}, Lsm/d;->t()Lsm/a;

    move-result-object p1

    new-instance v0, Lsm/b;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lsm/b;-><init>(I)V

    const/16 v1, 0x13

    invoke-virtual {p0, p1, v1, v0}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final onCues(Ljava/util/List;)V
    .locals 2

    invoke-virtual {p0}, Lsm/d;->t()Lsm/a;

    move-result-object p1

    new-instance v0, Lsm/b;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lsm/b;-><init>(I)V

    const/16 v1, 0x1b

    invoke-virtual {p0, p1, v1, v0}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final onIsLoadingChanged(Z)V
    .locals 2

    invoke-virtual {p0}, Lsm/d;->t()Lsm/a;

    move-result-object p1

    new-instance v0, Lsm/c;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lsm/c;-><init>(I)V

    const/4 v1, 0x3

    invoke-virtual {p0, p1, v1, v0}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final onIsPlayingChanged(Z)V
    .locals 2

    invoke-virtual {p0}, Lsm/d;->t()Lsm/a;

    move-result-object p1

    new-instance v0, Lsm/c;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lsm/c;-><init>(I)V

    const/4 v1, 0x7

    invoke-virtual {p0, p1, v1, v0}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final onPlayWhenReadyChanged(ZI)V
    .locals 1

    invoke-virtual {p0}, Lsm/d;->t()Lsm/a;

    move-result-object p1

    new-instance p2, Lsm/b;

    const/16 v0, 0x8

    invoke-direct {p2, v0}, Lsm/b;-><init>(I)V

    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0, p2}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final onPlaybackStateChanged(I)V
    .locals 2

    invoke-virtual {p0}, Lsm/d;->t()Lsm/a;

    move-result-object p1

    new-instance v0, Lsm/b;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lsm/b;-><init>(I)V

    const/4 v1, 0x4

    invoke-virtual {p0, p1, v1, v0}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final onPlaybackSuppressionReasonChanged(I)V
    .locals 2

    invoke-virtual {p0}, Lsm/d;->t()Lsm/a;

    move-result-object p1

    new-instance v0, Lsm/b;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lsm/b;-><init>(I)V

    const/4 v1, 0x6

    invoke-virtual {p0, p1, v1, v0}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final onPlayerStateChanged(ZI)V
    .locals 1

    invoke-virtual {p0}, Lsm/d;->t()Lsm/a;

    move-result-object p1

    new-instance p2, Lsm/b;

    const/4 v0, 0x2

    invoke-direct {p2, v0}, Lsm/b;-><init>(I)V

    const/4 v0, -0x1

    invoke-virtual {p0, p1, v0, p2}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final onRenderedFirstFrame()V
    .locals 0

    return-void
.end method

.method public final onRepeatModeChanged(I)V
    .locals 2

    invoke-virtual {p0}, Lsm/d;->t()Lsm/a;

    move-result-object p1

    new-instance v0, Lsm/b;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lsm/b;-><init>(I)V

    const/16 v1, 0x8

    invoke-virtual {p0, p1, v1, v0}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final onShuffleModeEnabledChanged(Z)V
    .locals 2

    invoke-virtual {p0}, Lsm/d;->t()Lsm/a;

    move-result-object p1

    new-instance v0, Lsm/c;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lsm/c;-><init>(I)V

    const/16 v1, 0x9

    invoke-virtual {p0, p1, v1, v0}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final onSkipSilenceEnabledChanged(Z)V
    .locals 2

    invoke-virtual {p0}, Lsm/d;->y()Lsm/a;

    move-result-object p1

    new-instance v0, Lsm/c;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lsm/c;-><init>(I)V

    const/16 v1, 0x17

    invoke-virtual {p0, p1, v1, v0}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final onSurfaceSizeChanged(II)V
    .locals 1

    invoke-virtual {p0}, Lsm/d;->y()Lsm/a;

    move-result-object p1

    new-instance p2, Lsm/b;

    const/4 v0, 0x6

    invoke-direct {p2, v0}, Lsm/b;-><init>(I)V

    const/16 v0, 0x18

    invoke-virtual {p0, p1, v0, p2}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final p(Lrm/a1;Lrm/a1;I)V
    .locals 2

    const/4 p1, 0x1

    if-ne p3, p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lsm/d;->I:Z

    :cond_0
    iget-object p1, p0, Lsm/d;->G:Lrm/b1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p0, Lsm/d;->z:La30/w0;

    iget-object p3, p2, La30/w0;->y:Ljava/lang/Object;

    check-cast p3, Lzr/g0;

    iget-object v0, p2, La30/w0;->F:Ljava/lang/Object;

    check-cast v0, Lsn/v;

    iget-object v1, p2, La30/w0;->x:Ljava/lang/Object;

    check-cast v1, Lrm/m1;

    invoke-static {p1, p3, v0, v1}, La30/w0;->p(Lrm/b1;Lzr/g0;Lsn/v;Lrm/m1;)Lsn/v;

    move-result-object p1

    iput-object p1, p2, La30/w0;->E:Ljava/lang/Object;

    invoke-virtual {p0}, Lsm/d;->t()Lsm/a;

    move-result-object p1

    new-instance p2, Lsm/c;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Lsm/c;-><init>(I)V

    const/16 p3, 0xb

    invoke-virtual {p0, p1, p3, p2}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final q(Lmo/r;)V
    .locals 2

    invoke-virtual {p0}, Lsm/d;->y()Lsm/a;

    move-result-object p1

    new-instance v0, Lsm/c;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lsm/c;-><init>(I)V

    const/16 v1, 0x19

    invoke-virtual {p0, p1, v1, v0}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final r(Lrm/q1;)V
    .locals 2

    invoke-virtual {p0}, Lsm/d;->t()Lsm/a;

    move-result-object p1

    new-instance v0, Lsm/b;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lsm/b;-><init>(I)V

    const/4 v1, 0x2

    invoke-virtual {p0, p1, v1, v0}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final s(Lrm/m0;)V
    .locals 2

    invoke-virtual {p0}, Lsm/d;->t()Lsm/a;

    move-result-object p1

    new-instance v0, Lsm/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsm/b;-><init>(I)V

    const/16 v1, 0xe

    invoke-virtual {p0, p1, v1, v0}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final t()Lsm/a;
    .locals 1

    iget-object v0, p0, Lsm/d;->z:La30/w0;

    iget-object v0, v0, La30/w0;->E:Ljava/lang/Object;

    check-cast v0, Lsn/v;

    invoke-virtual {p0, v0}, Lsm/d;->v(Lsn/v;)Lsm/a;

    move-result-object v0

    return-object v0
.end method

.method public final u(Lrm/o1;ILsn/v;)Lsm/a;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v4, p1

    move/from16 v5, p2

    invoke-virtual {v4}, Lrm/o1;->p()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object/from16 v6, p3

    :goto_0
    iget-object v1, v0, Lsm/d;->w:Llo/t;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-object v1, v0, Lsm/d;->G:Lrm/b1;

    check-cast v1, Lrm/u;

    invoke-virtual {v1}, Lrm/u;->b0()Lrm/o1;

    move-result-object v1

    invoke-virtual {v4, v1}, Lrm/o1;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Lsm/d;->G:Lrm/b1;

    check-cast v1, Lrm/u;

    invoke-virtual {v1}, Lrm/u;->Y()I

    move-result v1

    if-ne v5, v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    const-wide/16 v7, 0x0

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lsn/t;->a()Z

    move-result v9

    if-eqz v9, :cond_2

    if-eqz v1, :cond_5

    iget-object v1, v0, Lsm/d;->G:Lrm/b1;

    check-cast v1, Lrm/u;

    invoke-virtual {v1}, Lrm/u;->W()I

    move-result v1

    iget v9, v6, Lsn/t;->b:I

    if-ne v1, v9, :cond_5

    iget-object v1, v0, Lsm/d;->G:Lrm/b1;

    check-cast v1, Lrm/u;

    invoke-virtual {v1}, Lrm/u;->X()I

    move-result v1

    iget v9, v6, Lsn/t;->c:I

    if-ne v1, v9, :cond_5

    iget-object v1, v0, Lsm/d;->G:Lrm/b1;

    check-cast v1, Lrm/u;

    invoke-virtual {v1}, Lrm/u;->Z()J

    move-result-wide v7

    goto :goto_2

    :cond_2
    if-eqz v1, :cond_3

    iget-object v1, v0, Lsm/d;->G:Lrm/b1;

    check-cast v1, Lrm/u;

    invoke-virtual {v1}, Lrm/u;->V()J

    move-result-wide v7

    goto :goto_2

    :cond_3
    invoke-virtual {v4}, Lrm/o1;->p()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, v0, Lsm/d;->y:Lrm/n1;

    invoke-virtual {v4, v5, v1, v7, v8}, Lrm/o1;->m(ILrm/n1;J)Lrm/n1;

    move-result-object v1

    iget-wide v7, v1, Lrm/n1;->M:J

    invoke-static {v7, v8}, Llo/y;->G(J)J

    move-result-wide v7

    :cond_5
    :goto_2
    iget-object v1, v0, Lsm/d;->z:La30/w0;

    iget-object v1, v1, La30/w0;->E:Ljava/lang/Object;

    move-object v11, v1

    check-cast v11, Lsn/v;

    new-instance v1, Lsm/a;

    iget-object v9, v0, Lsm/d;->G:Lrm/b1;

    check-cast v9, Lrm/u;

    invoke-virtual {v9}, Lrm/u;->b0()Lrm/o1;

    move-result-object v9

    iget-object v10, v0, Lsm/d;->G:Lrm/b1;

    check-cast v10, Lrm/u;

    invoke-virtual {v10}, Lrm/u;->Y()I

    move-result v10

    iget-object v12, v0, Lsm/d;->G:Lrm/b1;

    check-cast v12, Lrm/u;

    invoke-virtual {v12}, Lrm/u;->Z()J

    move-result-wide v12

    iget-object v14, v0, Lsm/d;->G:Lrm/b1;

    check-cast v14, Lrm/u;

    invoke-virtual {v14}, Lrm/u;->B0()V

    iget-object v14, v14, Lrm/u;->K0:Lrm/v0;

    iget-wide v14, v14, Lrm/v0;->r:J

    invoke-static {v14, v15}, Llo/y;->G(J)J

    move-result-wide v14

    invoke-direct/range {v1 .. v15}, Lsm/a;-><init>(JLrm/o1;ILsn/v;JLrm/o1;ILsn/v;JJ)V

    return-object v1
.end method

.method public final v(Lsn/v;)Lsm/a;
    .locals 3

    iget-object v0, p0, Lsm/d;->G:Lrm/b1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object v1, v0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lsm/d;->z:La30/w0;

    iget-object v1, v1, La30/w0;->z:Ljava/lang/Object;

    check-cast v1, Lzr/b1;

    invoke-virtual {v1, p1}, Lzr/b1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrm/o1;

    :goto_0
    if-eqz p1, :cond_2

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p1, Lsn/t;->a:Ljava/lang/Object;

    iget-object v2, p0, Lsm/d;->x:Lrm/m1;

    invoke-virtual {v1, v0, v2}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    move-result-object v0

    iget v0, v0, Lrm/m1;->y:I

    invoke-virtual {p0, v1, v0, p1}, Lsm/d;->u(Lrm/o1;ILsn/v;)Lsm/a;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_1
    iget-object p1, p0, Lsm/d;->G:Lrm/b1;

    check-cast p1, Lrm/u;

    invoke-virtual {p1}, Lrm/u;->Y()I

    move-result p1

    iget-object v1, p0, Lsm/d;->G:Lrm/b1;

    check-cast v1, Lrm/u;

    invoke-virtual {v1}, Lrm/u;->b0()Lrm/o1;

    move-result-object v1

    invoke-virtual {v1}, Lrm/o1;->o()I

    move-result v2

    if-ge p1, v2, :cond_3

    goto :goto_2

    :cond_3
    sget-object v1, Lrm/o1;->w:Lrm/l1;

    :goto_2
    invoke-virtual {p0, v1, p1, v0}, Lsm/d;->u(Lrm/o1;ILsn/v;)Lsm/a;

    move-result-object p1

    return-object p1
.end method

.method public final w(ILsn/v;)Lsm/a;
    .locals 2

    iget-object v0, p0, Lsm/d;->G:Lrm/b1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lrm/o1;->w:Lrm/l1;

    if-eqz p2, :cond_1

    iget-object v1, p0, Lsm/d;->z:La30/w0;

    iget-object v1, v1, La30/w0;->z:Ljava/lang/Object;

    check-cast v1, Lzr/b1;

    invoke-virtual {v1, p2}, Lzr/b1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrm/o1;

    if-eqz v1, :cond_0

    invoke-virtual {p0, p2}, Lsm/d;->v(Lsn/v;)Lsm/a;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, v0, p1, p2}, Lsm/d;->u(Lrm/o1;ILsn/v;)Lsm/a;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p2, p0, Lsm/d;->G:Lrm/b1;

    check-cast p2, Lrm/u;

    invoke-virtual {p2}, Lrm/u;->b0()Lrm/o1;

    move-result-object p2

    invoke-virtual {p2}, Lrm/o1;->o()I

    move-result v1

    if-ge p1, v1, :cond_2

    move-object v0, p2

    :cond_2
    const/4 p2, 0x0

    invoke-virtual {p0, v0, p1, p2}, Lsm/d;->u(Lrm/o1;ILsn/v;)Lsm/a;

    move-result-object p1

    return-object p1
.end method

.method public final x(ILsn/v;Lsn/m;Ll9/y;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lsm/d;->w(ILsn/v;)Lsm/a;

    move-result-object p1

    new-instance p2, Lsm/c;

    const/16 p3, 0xe

    invoke-direct {p2, p3}, Lsm/c;-><init>(I)V

    const/16 p3, 0x3e9

    invoke-virtual {p0, p1, p3, p2}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void
.end method

.method public final y()Lsm/a;
    .locals 1

    iget-object v0, p0, Lsm/d;->z:La30/w0;

    iget-object v0, v0, La30/w0;->G:Ljava/lang/Object;

    check-cast v0, Lsn/v;

    invoke-virtual {p0, v0}, Lsm/d;->v(Lsn/v;)Lsm/a;

    move-result-object v0

    return-object v0
.end method

.method public final z(Lsm/a;ILlo/h;)V
    .locals 1

    iget-object v0, p0, Lsm/d;->E:Landroid/util/SparseArray;

    invoke-virtual {v0, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-object p1, p0, Lsm/d;->F:Ld9/p;

    invoke-virtual {p1, p2, p3}, Ld9/p;->i(ILlo/h;)V

    return-void
.end method

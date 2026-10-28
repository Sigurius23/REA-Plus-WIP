.class public final Lrm/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;
.implements Lsn/r;


# instance fields
.field public final E:Lio/x;

.field public final F:Lrm/h;

.field public final G:Lko/e;

.field public final H:Llo/v;

.field public final I:Landroid/os/HandlerThread;

.field public final J:Landroid/os/Looper;

.field public final K:Lrm/n1;

.field public final L:Lrm/m1;

.field public final M:J

.field public final N:Lb9/l;

.field public final O:Ljava/util/ArrayList;

.field public final P:Llo/t;

.field public final Q:Lrm/m;

.field public final R:Lrm/p0;

.field public final S:Lb9/b1;

.field public final T:Lb9/i;

.field public final U:J

.field public V:Lrm/h1;

.field public W:Lrm/v0;

.field public X:Lrm/x;

.field public Y:Z

.field public Z:Z

.field public a0:Z

.field public b0:Z

.field public c0:Z

.field public d0:I

.field public e0:Z

.field public f0:Z

.field public g0:Z

.field public h0:Z

.field public i0:I

.field public j0:Lrm/y;

.field public k0:J

.field public l0:I

.field public m0:Z

.field public n0:Lcom/google/android/exoplayer2/ExoPlaybackException;

.field public o0:J

.field public final w:[Lrm/d;

.field public final x:Ljava/util/Set;

.field public final y:[Lrm/d;

.field public final z:Lio/r;


# direct methods
.method public constructor <init>([Lrm/d;Lio/r;Lio/x;Lrm/h;Lko/e;IZLsm/d;Lrm/h1;Lb9/i;JLandroid/os/Looper;Llo/t;Lrm/m;Lsm/f;)V
    .locals 5

    move-object/from16 v0, p14

    move-object/from16 v1, p16

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v2, p15

    iput-object v2, p0, Lrm/z;->Q:Lrm/m;

    iput-object p1, p0, Lrm/z;->w:[Lrm/d;

    iput-object p2, p0, Lrm/z;->z:Lio/r;

    iput-object p3, p0, Lrm/z;->E:Lio/x;

    iput-object p4, p0, Lrm/z;->F:Lrm/h;

    iput-object p5, p0, Lrm/z;->G:Lko/e;

    iput p6, p0, Lrm/z;->d0:I

    iput-boolean p7, p0, Lrm/z;->e0:Z

    move-object v2, p9

    iput-object v2, p0, Lrm/z;->V:Lrm/h1;

    move-object v2, p10

    iput-object v2, p0, Lrm/z;->T:Lb9/i;

    move-wide/from16 v2, p11

    iput-wide v2, p0, Lrm/z;->U:J

    const/4 v2, 0x0

    iput-boolean v2, p0, Lrm/z;->Z:Z

    iput-object v0, p0, Lrm/z;->P:Llo/t;

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v3, p0, Lrm/z;->o0:J

    iget-wide v3, p4, Lrm/h;->g:J

    iput-wide v3, p0, Lrm/z;->M:J

    invoke-static {p3}, Lrm/v0;->i(Lio/x;)Lrm/v0;

    move-result-object p3

    iput-object p3, p0, Lrm/z;->W:Lrm/v0;

    new-instance p4, Lrm/x;

    invoke-direct {p4, p3}, Lrm/x;-><init>(Lrm/v0;)V

    iput-object p4, p0, Lrm/z;->X:Lrm/x;

    array-length p3, p1

    new-array p3, p3, [Lrm/d;

    iput-object p3, p0, Lrm/z;->y:[Lrm/d;

    :goto_0
    array-length p3, p1

    if-ge v2, p3, :cond_0

    aget-object p3, p1, v2

    iput v2, p3, Lrm/d;->z:I

    iput-object v1, p3, Lrm/d;->E:Lsm/f;

    iget-object p4, p0, Lrm/z;->y:[Lrm/d;

    aput-object p3, p4, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lb9/l;

    invoke-direct {p1, p0, v0}, Lb9/l;-><init>(Lrm/z;Llo/t;)V

    iput-object p1, p0, Lrm/z;->N:Lb9/l;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lrm/z;->O:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lrm/z;->x:Ljava/util/Set;

    new-instance p1, Lrm/n1;

    invoke-direct {p1}, Lrm/n1;-><init>()V

    iput-object p1, p0, Lrm/z;->K:Lrm/n1;

    new-instance p1, Lrm/m1;

    invoke-direct {p1}, Lrm/m1;-><init>()V

    iput-object p1, p0, Lrm/z;->L:Lrm/m1;

    iput-object p0, p2, Lio/r;->a:Lrm/z;

    iput-object p5, p2, Lio/r;->b:Lko/e;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lrm/z;->m0:Z

    new-instance p1, Landroid/os/Handler;

    move-object/from16 p2, p13

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p2, Lrm/p0;

    invoke-direct {p2, p1, p8}, Lrm/p0;-><init>(Landroid/os/Handler;Lsm/d;)V

    iput-object p2, p0, Lrm/z;->R:Lrm/p0;

    new-instance p2, Lb9/b1;

    invoke-direct {p2, p0, p8, p1, v1}, Lb9/b1;-><init>(Lrm/z;Lsm/d;Landroid/os/Handler;Lsm/f;)V

    iput-object p2, p0, Lrm/z;->S:Lb9/b1;

    new-instance p1, Landroid/os/HandlerThread;

    const-string p2, "ExoPlayer:Playback"

    const/16 p3, -0x10

    invoke-direct {p1, p2, p3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object p1, p0, Lrm/z;->I:Landroid/os/HandlerThread;

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p1

    iput-object p1, p0, Lrm/z;->J:Landroid/os/Looper;

    invoke-virtual {v0, p1, p0}, Llo/t;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Llo/v;

    move-result-object p1

    iput-object p1, p0, Lrm/z;->H:Llo/v;

    return-void
.end method

.method public static E(Lrm/o1;Lrm/y;ZIZLrm/n1;Lrm/m1;)Landroid/util/Pair;
    .locals 9

    iget-object v0, p1, Lrm/y;->a:Lrm/o1;

    invoke-virtual {p0}, Lrm/o1;->p()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {v0}, Lrm/o1;->p()Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v2, p0

    goto :goto_0

    :cond_1
    move-object v2, v0

    :goto_0
    :try_start_0
    iget v5, p1, Lrm/y;->b:I

    iget-wide v6, p1, Lrm/y;->c:J

    move-object v3, p5

    move-object v4, p6

    invoke-virtual/range {v2 .. v7}, Lrm/o1;->i(Lrm/n1;Lrm/m1;IJ)Landroid/util/Pair;

    move-result-object p5
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v5, v4

    move-object v4, v3

    invoke-virtual {p0, v2}, Lrm/o1;->equals(Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_2

    goto :goto_1

    :cond_2
    iget-object p6, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {p0, p6}, Lrm/o1;->b(Ljava/lang/Object;)I

    move-result p6

    const/4 v0, -0x1

    if-eq p6, v0, :cond_4

    iget-object p2, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v2, p2, v5}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    move-result-object p2

    iget-boolean p2, p2, Lrm/m1;->F:Z

    if-eqz p2, :cond_3

    iget p2, v5, Lrm/m1;->y:I

    const-wide/16 p3, 0x0

    invoke-virtual {v2, p2, v4, p3, p4}, Lrm/o1;->m(ILrm/n1;J)Lrm/n1;

    move-result-object p2

    iget p2, p2, Lrm/n1;->O:I

    iget-object p3, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v2, p3}, Lrm/o1;->b(Ljava/lang/Object;)I

    move-result p3

    if-ne p2, p3, :cond_3

    iget-object p2, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {p0, p2, v5}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    move-result-object p2

    iget v6, p2, Lrm/m1;->y:I

    iget-wide v7, p1, Lrm/y;->c:J

    move-object v3, p0

    invoke-virtual/range {v3 .. v8}, Lrm/o1;->i(Lrm/n1;Lrm/m1;IJ)Landroid/util/Pair;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_1
    return-object p5

    :cond_4
    move-object v3, p0

    if-eqz p2, :cond_5

    iget-object p0, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    move p2, p3

    move p3, p4

    move-object p5, v2

    move-object p6, v3

    move-object p1, v5

    move-object p4, p0

    move-object p0, v4

    invoke-static/range {p0 .. p6}, Lrm/z;->F(Lrm/n1;Lrm/m1;IZLjava/lang/Object;Lrm/o1;Lrm/o1;)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_5

    invoke-virtual {v3, p2, v5}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    move-result-object p0

    iget v6, p0, Lrm/m1;->y:I

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    invoke-virtual/range {v3 .. v8}, Lrm/o1;->i(Lrm/n1;Lrm/m1;IJ)Landroid/util/Pair;

    move-result-object p0

    return-object p0

    :catch_0
    :cond_5
    :goto_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static F(Lrm/n1;Lrm/m1;IZLjava/lang/Object;Lrm/o1;Lrm/o1;)Ljava/lang/Object;
    .locals 9

    invoke-virtual {p5, p4}, Lrm/o1;->b(Ljava/lang/Object;)I

    move-result p4

    invoke-virtual {p5}, Lrm/o1;->h()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    move v4, p4

    move p4, v1

    :goto_0
    if-ge v2, v0, :cond_1

    if-ne p4, v1, :cond_1

    move-object v6, p0

    move-object v5, p1

    move v7, p2

    move v8, p3

    move-object v3, p5

    invoke-virtual/range {v3 .. v8}, Lrm/o1;->d(ILrm/m1;Lrm/n1;IZ)I

    move-result v4

    if-ne v4, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v3, v4}, Lrm/o1;->l(I)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p6, p0}, Lrm/o1;->b(Ljava/lang/Object;)I

    move-result p4

    add-int/lit8 v2, v2, 0x1

    move-object p5, v3

    move-object p1, v5

    move-object p0, v6

    move p2, v7

    move p3, v8

    goto :goto_0

    :cond_1
    :goto_1
    if-ne p4, v1, :cond_2

    const/4 p0, 0x0

    return-object p0

    :cond_2
    invoke-virtual {p6, p4}, Lrm/o1;->l(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static M(Lrm/d;J)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lrm/d;->K:Z

    instance-of v0, p0, Lxn/i;

    if-eqz v0, :cond_0

    check-cast p0, Lxn/i;

    iget-boolean v0, p0, Lrm/d;->K:Z

    invoke-static {v0}, Llo/a;->i(Z)V

    iput-wide p1, p0, Lxn/i;->a0:J

    :cond_0
    return-void
.end method

.method public static q(Lrm/d;)Z
    .locals 0

    iget p0, p0, Lrm/d;->F:I

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final A(ZZZZ)V
    .locals 29

    move-object/from16 v1, p0

    iget-object v0, v1, Lrm/z;->H:Llo/v;

    const/4 v2, 0x2

    iget-object v0, v0, Llo/v;->a:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V

    const/4 v2, 0x0

    iput-object v2, v1, Lrm/z;->n0:Lcom/google/android/exoplayer2/ExoPlaybackException;

    const/4 v3, 0x0

    iput-boolean v3, v1, Lrm/z;->b0:Z

    iget-object v0, v1, Lrm/z;->N:Lb9/l;

    iput-boolean v3, v0, Lb9/l;->y:Z

    iget-object v0, v0, Lb9/l;->z:Ljava/lang/Object;

    check-cast v0, Lb9/l1;

    iget-boolean v4, v0, Lb9/l1;->z:Z

    if-eqz v4, :cond_0

    invoke-virtual {v0}, Lb9/l1;->c()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lb9/l1;->a(J)V

    iput-boolean v3, v0, Lb9/l1;->z:Z

    :cond_0
    const-wide v4, 0xe8d4a51000L

    iput-wide v4, v1, Lrm/z;->k0:J

    iget-object v4, v1, Lrm/z;->w:[Lrm/d;

    array-length v5, v4

    move v6, v3

    :goto_0
    const-string v7, "ExoPlayerImplInternal"

    if-ge v6, v5, :cond_1

    aget-object v0, v4, v6

    :try_start_0
    invoke-virtual {v1, v0}, Lrm/z;->b(Lrm/d;)V
    :try_end_0
    .catch Lcom/google/android/exoplayer2/ExoPlaybackException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    :goto_1
    const-string v8, "Disable failed."

    invoke-static {v7, v8, v0}, Llo/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_3

    iget-object v4, v1, Lrm/z;->w:[Lrm/d;

    array-length v5, v4

    move v6, v3

    :goto_3
    if-ge v6, v5, :cond_3

    aget-object v0, v4, v6

    iget-object v8, v1, Lrm/z;->x:Ljava/util/Set;

    invoke-interface {v8, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    :try_start_1
    invoke-virtual {v0}, Lrm/d;->v()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_4

    :catch_2
    move-exception v0

    const-string v8, "Reset failed."

    invoke-static {v7, v8, v0}, Llo/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_3
    iput v3, v1, Lrm/z;->i0:I

    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget-object v4, v0, Lrm/v0;->b:Lsn/v;

    iget-wide v5, v0, Lrm/v0;->s:J

    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget-object v0, v0, Lrm/v0;->b:Lsn/v;

    invoke-virtual {v0}, Lsn/t;->a()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget-object v7, v1, Lrm/z;->L:Lrm/m1;

    iget-object v8, v0, Lrm/v0;->b:Lsn/v;

    iget-object v0, v0, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v0}, Lrm/o1;->p()Z

    move-result v9

    if-nez v9, :cond_5

    iget-object v8, v8, Lsn/t;->a:Ljava/lang/Object;

    invoke-virtual {v0, v8, v7}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    move-result-object v0

    iget-boolean v0, v0, Lrm/m1;->F:Z

    if-eqz v0, :cond_4

    goto :goto_5

    :cond_4
    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget-wide v7, v0, Lrm/v0;->s:J

    goto :goto_6

    :cond_5
    :goto_5
    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget-wide v7, v0, Lrm/v0;->c:J

    :goto_6
    if-eqz p2, :cond_6

    iput-object v2, v1, Lrm/z;->j0:Lrm/y;

    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget-object v0, v0, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v1, v0}, Lrm/z;->h(Lrm/o1;)Landroid/util/Pair;

    move-result-object v0

    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Lsn/v;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget-object v0, v0, Lrm/v0;->b:Lsn/v;

    invoke-virtual {v4, v0}, Lsn/t;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v0, :cond_6

    const/4 v0, 0x1

    :goto_7
    move-wide v9, v5

    move-object v6, v4

    goto :goto_8

    :cond_6
    move v0, v3

    goto :goto_7

    :goto_8
    iget-object v4, v1, Lrm/z;->R:Lrm/p0;

    invoke-virtual {v4}, Lrm/p0;->b()V

    iput-boolean v3, v1, Lrm/z;->c0:Z

    new-instance v4, Lrm/v0;

    iget-object v5, v1, Lrm/z;->W:Lrm/v0;

    iget-object v11, v5, Lrm/v0;->a:Lrm/o1;

    move-object v12, v11

    iget v11, v5, Lrm/v0;->e:I

    if-eqz p4, :cond_7

    goto :goto_9

    :cond_7
    iget-object v2, v5, Lrm/v0;->f:Lcom/google/android/exoplayer2/ExoPlaybackException;

    :goto_9
    if-eqz v0, :cond_8

    sget-object v13, Lsn/x0;->z:Lsn/x0;

    :goto_a
    move-object v14, v13

    goto :goto_b

    :cond_8
    iget-object v13, v5, Lrm/v0;->h:Lsn/x0;

    goto :goto_a

    :goto_b
    if-eqz v0, :cond_9

    iget-object v13, v1, Lrm/z;->E:Lio/x;

    :goto_c
    move-object v15, v13

    goto :goto_d

    :cond_9
    iget-object v13, v5, Lrm/v0;->i:Lio/x;

    goto :goto_c

    :goto_d
    if-eqz v0, :cond_a

    sget-object v0, Lzr/g0;->x:Lzr/e0;

    sget-object v0, Lzr/w0;->E:Lzr/w0;

    :goto_e
    move-object/from16 v16, v0

    goto :goto_f

    :cond_a
    iget-object v0, v5, Lrm/v0;->j:Ljava/util/List;

    goto :goto_e

    :goto_f
    iget-boolean v0, v5, Lrm/v0;->l:Z

    iget v13, v5, Lrm/v0;->m:I

    iget-object v5, v5, Lrm/v0;->n:Lrm/w0;

    iget-boolean v3, v1, Lrm/z;->h0:Z

    const/16 v28, 0x0

    move/from16 v19, v13

    const/4 v13, 0x0

    const-wide/16 v23, 0x0

    move-object/from16 v17, v6

    move-wide/from16 v21, v9

    move-wide/from16 v25, v9

    move/from16 v18, v0

    move/from16 v27, v3

    move-object/from16 v20, v5

    move-object v5, v12

    move-object v12, v2

    invoke-direct/range {v4 .. v28}, Lrm/v0;-><init>(Lrm/o1;Lsn/v;JJILcom/google/android/exoplayer2/ExoPlaybackException;ZLsn/x0;Lio/x;Ljava/util/List;Lsn/v;ZILrm/w0;JJJZZ)V

    iput-object v4, v1, Lrm/z;->W:Lrm/v0;

    if-eqz p3, :cond_c

    iget-object v2, v1, Lrm/z;->S:Lb9/b1;

    iget-object v3, v2, Lb9/b1;->e:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_10
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lrm/s0;

    :try_start_2
    iget-object v0, v5, Lrm/s0;->a:Lsn/a;

    iget-object v6, v5, Lrm/s0;->b:Lrm/r0;

    invoke-virtual {v0, v6}, Lsn/a;->l(Lsn/w;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_3

    goto :goto_11

    :catch_3
    move-exception v0

    const-string v6, "MediaSourceList"

    const-string v7, "Failed to release child source."

    invoke-static {v6, v7, v0}, Llo/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_11
    iget-object v0, v5, Lrm/s0;->a:Lsn/a;

    iget-object v6, v5, Lrm/s0;->c:Lq/f;

    invoke-virtual {v0, v6}, Lsn/a;->o(Lsn/a0;)V

    iget-object v0, v5, Lrm/s0;->a:Lsn/a;

    invoke-virtual {v0, v6}, Lsn/a;->n(Lvm/e;)V

    goto :goto_10

    :cond_b
    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    iget-object v0, v2, Lb9/b1;->f:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    const/4 v3, 0x0

    iput-boolean v3, v2, Lb9/b1;->g:Z

    :cond_c
    return-void
.end method

.method public final B()V
    .locals 1

    iget-object v0, p0, Lrm/z;->R:Lrm/p0;

    iget-object v0, v0, Lrm/p0;->h:Lrm/n0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lrm/n0;->f:Lrm/o0;

    iget-boolean v0, v0, Lrm/o0;->h:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lrm/z;->Z:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lrm/z;->a0:Z

    return-void
.end method

.method public final C(J)V
    .locals 6

    iget-object v0, p0, Lrm/z;->R:Lrm/p0;

    iget-object v1, v0, Lrm/p0;->h:Lrm/n0;

    if-nez v1, :cond_0

    const-wide v1, 0xe8d4a51000L

    :goto_0
    add-long/2addr p1, v1

    goto :goto_1

    :cond_0
    iget-wide v1, v1, Lrm/n0;->o:J

    goto :goto_0

    :goto_1
    iput-wide p1, p0, Lrm/z;->k0:J

    iget-object v1, p0, Lrm/z;->N:Lb9/l;

    iget-object v1, v1, Lb9/l;->z:Ljava/lang/Object;

    check-cast v1, Lb9/l1;

    invoke-virtual {v1, p1, p2}, Lb9/l1;->a(J)V

    iget-object p1, p0, Lrm/z;->w:[Lrm/d;

    array-length p2, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_2
    if-ge v2, p2, :cond_2

    aget-object v3, p1, v2

    invoke-static {v3}, Lrm/z;->q(Lrm/d;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-wide v4, p0, Lrm/z;->k0:J

    iput-boolean v1, v3, Lrm/d;->K:Z

    iput-wide v4, v3, Lrm/d;->J:J

    invoke-virtual {v3, v4, v5, v1}, Lrm/d;->n(JZ)V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    iget-object p1, v0, Lrm/p0;->h:Lrm/n0;

    :goto_3
    if-eqz p1, :cond_5

    iget-object p2, p1, Lrm/n0;->n:Lio/x;

    iget-object p2, p2, Lio/x;->c:[Lio/o;

    array-length v0, p2

    move v2, v1

    :goto_4
    if-ge v2, v0, :cond_4

    aget-object v3, p2, v2

    if-eqz v3, :cond_3

    invoke-interface {v3}, Lio/o;->h()V

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    iget-object p1, p1, Lrm/n0;->l:Lrm/n0;

    goto :goto_3

    :cond_5
    return-void
.end method

.method public final D(Lrm/o1;Lrm/o1;)V
    .locals 0

    invoke-virtual {p1}, Lrm/o1;->p()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Lrm/o1;->p()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lrm/z;->O:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    if-gez p2, :cond_1

    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-void

    :cond_1
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lr;->t(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final G(JJ)V
    .locals 3

    iget-object v0, p0, Lrm/z;->H:Llo/v;

    iget-object v1, v0, Llo/v;->a:Landroid/os/Handler;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V

    add-long/2addr p1, p3

    iget-object p3, v0, Llo/v;->a:Landroid/os/Handler;

    invoke-virtual {p3, v2, p1, p2}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    return-void
.end method

.method public final H(Z)V
    .locals 11

    iget-object v0, p0, Lrm/z;->R:Lrm/p0;

    iget-object v0, v0, Lrm/p0;->h:Lrm/n0;

    iget-object v0, v0, Lrm/n0;->f:Lrm/o0;

    iget-object v2, v0, Lrm/o0;->a:Lsn/v;

    iget-object v0, p0, Lrm/z;->W:Lrm/v0;

    iget-wide v3, v0, Lrm/v0;->s:J

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lrm/z;->J(Lsn/v;JZZ)J

    move-result-wide v3

    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget-wide v5, v0, Lrm/v0;->s:J

    cmp-long v0, v3, v5

    if-eqz v0, :cond_0

    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget-wide v5, v0, Lrm/v0;->c:J

    iget-wide v7, v0, Lrm/v0;->d:J

    const/4 v10, 0x5

    move v9, p1

    invoke-virtual/range {v1 .. v10}, Lrm/z;->o(Lsn/v;JJJZI)Lrm/v0;

    move-result-object p1

    iput-object p1, v1, Lrm/z;->W:Lrm/v0;

    :cond_0
    return-void
.end method

.method public final I(Lrm/y;)V
    .locals 18

    move-object/from16 v1, p0

    iget-object v0, v1, Lrm/z;->X:Lrm/x;

    const/4 v9, 0x1

    invoke-virtual {v0, v9}, Lrm/x;->a(I)V

    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget-object v2, v0, Lrm/v0;->a:Lrm/o1;

    iget v5, v1, Lrm/z;->d0:I

    iget-boolean v6, v1, Lrm/z;->e0:Z

    iget-object v7, v1, Lrm/z;->K:Lrm/n1;

    iget-object v8, v1, Lrm/z;->L:Lrm/m1;

    const/4 v4, 0x1

    move-object/from16 v3, p1

    invoke-static/range {v2 .. v8}, Lrm/z;->E(Lrm/o1;Lrm/y;ZIZLrm/n1;Lrm/m1;)Landroid/util/Pair;

    move-result-object v0

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v8, 0x0

    if-nez v0, :cond_0

    iget-object v2, v1, Lrm/z;->W:Lrm/v0;

    iget-object v2, v2, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v1, v2}, Lrm/z;->h(Lrm/o1;)Landroid/util/Pair;

    move-result-object v2

    iget-object v10, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v10, Lsn/v;

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    iget-object v2, v1, Lrm/z;->W:Lrm/v0;

    iget-object v2, v2, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v2}, Lrm/o1;->p()Z

    move-result v2

    xor-int/2addr v2, v9

    move-wide v5, v6

    :goto_0
    const-wide/16 v15, 0x0

    goto :goto_4

    :cond_0
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v10, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Long;

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    iget-wide v13, v3, Lrm/y;->c:J

    cmp-long v10, v13, v6

    if-nez v10, :cond_1

    move-wide v13, v6

    goto :goto_1

    :cond_1
    move-wide v13, v11

    :goto_1
    iget-object v10, v1, Lrm/z;->R:Lrm/p0;

    iget-object v15, v1, Lrm/z;->W:Lrm/v0;

    iget-object v15, v15, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v10, v15, v2, v11, v12}, Lrm/p0;->m(Lrm/o1;Ljava/lang/Object;J)Lsn/v;

    move-result-object v10

    invoke-virtual {v10}, Lsn/t;->a()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, v1, Lrm/z;->W:Lrm/v0;

    iget-object v2, v2, Lrm/v0;->a:Lrm/o1;

    iget-object v6, v10, Lsn/t;->a:Ljava/lang/Object;

    iget-object v7, v1, Lrm/z;->L:Lrm/m1;

    invoke-virtual {v2, v6, v7}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    iget-object v2, v1, Lrm/z;->L:Lrm/m1;

    iget v6, v10, Lsn/t;->b:I

    invoke-virtual {v2, v6}, Lrm/m1;->f(I)I

    move-result v2

    iget v6, v10, Lsn/t;->c:I

    if-ne v2, v6, :cond_2

    iget-object v2, v1, Lrm/z;->L:Lrm/m1;

    iget-object v2, v2, Lrm/m1;->G:Ltn/b;

    iget-wide v6, v2, Ltn/b;->x:J

    move-wide v11, v6

    goto :goto_2

    :cond_2
    const-wide/16 v11, 0x0

    :goto_2
    move v2, v9

    move-wide v5, v13

    goto :goto_0

    :cond_3
    const-wide/16 v15, 0x0

    iget-wide v4, v3, Lrm/y;->c:J

    cmp-long v2, v4, v6

    if-nez v2, :cond_4

    move v2, v9

    goto :goto_3

    :cond_4
    move v2, v8

    :goto_3
    move-wide v5, v13

    :goto_4
    :try_start_0
    iget-object v4, v1, Lrm/z;->W:Lrm/v0;

    iget-object v4, v4, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v4}, Lrm/o1;->p()Z

    move-result v4

    if-eqz v4, :cond_5

    iput-object v3, v1, Lrm/z;->j0:Lrm/y;

    goto :goto_7

    :catchall_0
    move-exception v0

    move v9, v2

    :goto_5
    move-object v2, v10

    :goto_6
    move-wide v3, v11

    goto/16 :goto_13

    :cond_5
    const/4 v3, 0x4

    if-nez v0, :cond_7

    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget v0, v0, Lrm/v0;->e:I

    if-eq v0, v9, :cond_6

    invoke-virtual {v1, v3}, Lrm/z;->W(I)V

    :cond_6
    invoke-virtual {v1, v8, v9, v8, v9}, Lrm/z;->A(ZZZZ)V

    :goto_7
    move v9, v2

    move-object v2, v10

    move-wide v3, v11

    goto/16 :goto_10

    :cond_7
    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget-object v0, v0, Lrm/v0;->b:Lsn/v;

    invoke-virtual {v10, v0}, Lsn/t;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_b

    :try_start_1
    iget-object v0, v1, Lrm/z;->R:Lrm/p0;

    iget-object v0, v0, Lrm/p0;->h:Lrm/n0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v0, :cond_8

    :try_start_2
    iget-boolean v4, v0, Lrm/n0;->d:Z

    if-eqz v4, :cond_8

    cmp-long v4, v11, v15

    if-eqz v4, :cond_8

    iget-object v0, v0, Lrm/n0;->a:Ljava/lang/Object;

    iget-object v4, v1, Lrm/z;->V:Lrm/h1;

    invoke-interface {v0, v11, v12, v4}, Lsn/s;->v(JLrm/h1;)J

    move-result-wide v13
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_8

    :cond_8
    move-wide v13, v11

    :goto_8
    :try_start_3
    invoke-static {v13, v14}, Llo/y;->G(J)J

    move-result-wide v15

    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget-wide v8, v0, Lrm/v0;->s:J

    invoke-static {v8, v9}, Llo/y;->G(J)J

    move-result-wide v8

    cmp-long v0, v15, v8

    if-nez v0, :cond_9

    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget v4, v0, Lrm/v0;->e:I

    const/4 v8, 0x2

    if-eq v4, v8, :cond_a

    const/4 v8, 0x3

    if-ne v4, v8, :cond_9

    goto :goto_9

    :cond_9
    move v9, v2

    move-wide v15, v5

    move-object v2, v10

    goto :goto_b

    :cond_a
    :goto_9
    iget-wide v3, v0, Lrm/v0;->s:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move v9, v2

    move-object v2, v10

    const/4 v10, 0x2

    move-wide v7, v3

    :goto_a
    invoke-virtual/range {v1 .. v10}, Lrm/z;->o(Lsn/v;JJJZI)Lrm/v0;

    move-result-object v0

    iput-object v0, v1, Lrm/z;->W:Lrm/v0;

    return-void

    :catchall_1
    move-exception v0

    move v9, v2

    move-wide v15, v5

    goto :goto_5

    :cond_b
    move v9, v2

    move-wide v15, v5

    move-object v2, v10

    move-wide v13, v11

    :goto_b
    :try_start_4
    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget v0, v0, Lrm/v0;->e:I

    if-ne v0, v3, :cond_c

    const/4 v6, 0x1

    goto :goto_c

    :cond_c
    const/4 v6, 0x0

    :goto_c
    iget-object v0, v1, Lrm/z;->R:Lrm/p0;

    iget-object v3, v0, Lrm/p0;->h:Lrm/n0;

    iget-object v0, v0, Lrm/p0;->i:Lrm/n0;

    if-eq v3, v0, :cond_d

    const/4 v5, 0x1

    :goto_d
    move-wide v3, v13

    goto :goto_e

    :cond_d
    const/4 v5, 0x0

    goto :goto_d

    :goto_e
    invoke-virtual/range {v1 .. v6}, Lrm/z;->J(Lsn/v;JZZ)J

    move-result-wide v13
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    cmp-long v0, v11, v13

    if-eqz v0, :cond_e

    const/16 v17, 0x1

    goto :goto_f

    :cond_e
    const/16 v17, 0x0

    :goto_f
    or-int v8, v9, v17

    :try_start_5
    iget-object v0, v1, Lrm/z;->W:Lrm/v0;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    move-object v3, v2

    :try_start_6
    iget-object v2, v0, Lrm/v0;->a:Lrm/o1;

    iget-object v5, v0, Lrm/v0;->b:Lsn/v;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    move-object v4, v2

    move-wide v6, v15

    :try_start_7
    invoke-virtual/range {v1 .. v7}, Lrm/z;->f0(Lrm/o1;Lsn/v;Lrm/o1;Lsn/v;J)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    move-object v2, v3

    move-wide v5, v6

    move v9, v8

    move-wide v3, v13

    :goto_10
    const/4 v10, 0x2

    move-wide v7, v3

    move-object/from16 v1, p0

    goto :goto_a

    :catchall_2
    move-exception v0

    move-object v2, v3

    move-wide v5, v6

    :goto_11
    move v9, v8

    move-wide v3, v13

    goto :goto_13

    :catchall_3
    move-exception v0

    move-object v2, v3

    :goto_12
    move-wide v5, v15

    goto :goto_11

    :catchall_4
    move-exception v0

    goto :goto_12

    :catchall_5
    move-exception v0

    move-wide v5, v15

    goto/16 :goto_6

    :goto_13
    const/4 v10, 0x2

    move-wide v7, v3

    invoke-virtual/range {v1 .. v10}, Lrm/z;->o(Lsn/v;JJJZI)Lrm/v0;

    move-result-object v2

    iput-object v2, v1, Lrm/z;->W:Lrm/v0;

    throw v0
.end method

.method public final J(Lsn/v;JZZ)J
    .locals 8

    invoke-virtual {p0}, Lrm/z;->b0()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lrm/z;->b0:Z

    const/4 v1, 0x2

    if-nez p5, :cond_0

    iget-object p5, p0, Lrm/z;->W:Lrm/v0;

    iget p5, p5, Lrm/v0;->e:I

    const/4 v2, 0x3

    if-ne p5, v2, :cond_1

    :cond_0
    invoke-virtual {p0, v1}, Lrm/z;->W(I)V

    :cond_1
    iget-object p5, p0, Lrm/z;->R:Lrm/p0;

    iget-object v2, p5, Lrm/p0;->h:Lrm/n0;

    move-object v3, v2

    :goto_0
    if-eqz v3, :cond_3

    iget-object v4, v3, Lrm/n0;->f:Lrm/o0;

    iget-object v4, v4, Lrm/o0;->a:Lsn/v;

    invoke-virtual {p1, v4}, Lsn/t;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    iget-object v3, v3, Lrm/n0;->l:Lrm/n0;

    goto :goto_0

    :cond_3
    :goto_1
    if-nez p4, :cond_4

    if-ne v2, v3, :cond_4

    if-eqz v3, :cond_7

    iget-wide v4, v3, Lrm/n0;->o:J

    add-long/2addr v4, p2

    const-wide/16 v6, 0x0

    cmp-long p1, v4, v6

    if-gez p1, :cond_7

    :cond_4
    iget-object p1, p0, Lrm/z;->w:[Lrm/d;

    array-length p4, p1

    move v2, v0

    :goto_2
    if-ge v2, p4, :cond_5

    aget-object v4, p1, v2

    invoke-virtual {p0, v4}, Lrm/z;->b(Lrm/d;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    if-eqz v3, :cond_7

    :goto_3
    iget-object p4, p5, Lrm/p0;->h:Lrm/n0;

    if-eq p4, v3, :cond_6

    invoke-virtual {p5}, Lrm/p0;->a()Lrm/n0;

    goto :goto_3

    :cond_6
    invoke-virtual {p5, v3}, Lrm/p0;->k(Lrm/n0;)Z

    const-wide v4, 0xe8d4a51000L

    iput-wide v4, v3, Lrm/n0;->o:J

    array-length p1, p1

    new-array p1, p1, [Z

    invoke-virtual {p0, p1}, Lrm/z;->e([Z)V

    :cond_7
    if-eqz v3, :cond_a

    iget-object p1, v3, Lrm/n0;->a:Ljava/lang/Object;

    invoke-virtual {p5, v3}, Lrm/p0;->k(Lrm/n0;)Z

    iget-boolean p4, v3, Lrm/n0;->d:Z

    if-nez p4, :cond_8

    iget-object p1, v3, Lrm/n0;->f:Lrm/o0;

    invoke-virtual {p1, p2, p3}, Lrm/o0;->b(J)Lrm/o0;

    move-result-object p1

    iput-object p1, v3, Lrm/n0;->f:Lrm/o0;

    goto :goto_4

    :cond_8
    iget-boolean p4, v3, Lrm/n0;->e:Z

    if-eqz p4, :cond_9

    invoke-interface {p1, p2, p3}, Lsn/s;->e(J)J

    move-result-wide p2

    iget-wide p4, p0, Lrm/z;->M:J

    sub-long p4, p2, p4

    invoke-interface {p1, p4, p5}, Lsn/s;->i(J)V

    :cond_9
    :goto_4
    invoke-virtual {p0, p2, p3}, Lrm/z;->C(J)V

    invoke-virtual {p0}, Lrm/z;->s()V

    goto :goto_5

    :cond_a
    invoke-virtual {p5}, Lrm/p0;->b()V

    invoke-virtual {p0, p2, p3}, Lrm/z;->C(J)V

    :goto_5
    invoke-virtual {p0, v0}, Lrm/z;->k(Z)V

    iget-object p1, p0, Lrm/z;->H:Llo/v;

    invoke-virtual {p1, v1}, Llo/v;->c(I)Z

    return-wide p2
.end method

.method public final K(Lrm/d1;)V
    .locals 5

    iget-object v0, p0, Lrm/z;->H:Llo/v;

    iget-object v1, p1, Lrm/d1;->f:Landroid/os/Looper;

    iget-object v2, p0, Lrm/z;->J:Landroid/os/Looper;

    if-ne v1, v2, :cond_2

    monitor-enter p1

    monitor-exit p1

    const/4 v1, 0x1

    :try_start_0
    iget-object v2, p1, Lrm/d1;->a:Lrm/c1;

    iget v3, p1, Lrm/d1;->d:I

    iget-object v4, p1, Lrm/d1;->e:Ljava/lang/Object;

    invoke-interface {v2, v3, v4}, Lrm/c1;->a(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1, v1}, Lrm/d1;->b(Z)V

    iget-object p1, p0, Lrm/z;->W:Lrm/v0;

    iget p1, p1, Lrm/v0;->e:I

    const/4 v1, 0x3

    const/4 v2, 0x2

    if-eq p1, v1, :cond_1

    if-ne p1, v2, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    invoke-virtual {v0, v2}, Llo/v;->c(I)Z

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p1, v1}, Lrm/d1;->b(Z)V

    throw v0

    :cond_2
    const/16 v1, 0xf

    invoke-virtual {v0, v1, p1}, Llo/v;->a(ILjava/lang/Object;)Llo/u;

    move-result-object p1

    invoke-virtual {p1}, Llo/u;->b()V

    return-void
.end method

.method public final L(Lrm/d1;)V
    .locals 3

    iget-object v0, p1, Lrm/d1;->f:Landroid/os/Looper;

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v0, "TAG"

    const-string v1, "Trying to send message on a dead thread."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lrm/d1;->b(Z)V

    return-void

    :cond_0
    const/4 v1, 0x0

    iget-object v2, p0, Lrm/z;->P:Llo/t;

    invoke-virtual {v2, v0, v1}, Llo/t;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Llo/v;

    move-result-object v0

    new-instance v1, Llr/e;

    invoke-direct {v1, p0, p1}, Llr/e;-><init>(Lrm/z;Lrm/d1;)V

    iget-object p1, v0, Llo/v;->a:Landroid/os/Handler;

    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final N(ZLjava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 4

    iget-boolean v0, p0, Lrm/z;->f0:Z

    if-eq v0, p1, :cond_1

    iput-boolean p1, p0, Lrm/z;->f0:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lrm/z;->w:[Lrm/d;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    invoke-static {v2}, Lrm/z;->q(Lrm/d;)Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v3, p0, Lrm/z;->x:Ljava/util/Set;

    invoke-interface {v3, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lrm/d;->v()V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    monitor-enter p0

    const/4 p1, 0x1

    :try_start_0
    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    return-void
.end method

.method public final O(Lrm/w;)V
    .locals 7

    iget-object v0, p0, Lrm/z;->X:Lrm/x;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lrm/x;->a(I)V

    iget v0, p1, Lrm/w;->c:I

    iget-object v1, p1, Lrm/w;->b:Lsn/u0;

    iget-object v2, p1, Lrm/w;->a:Ljava/util/ArrayList;

    const/4 v3, -0x1

    if-eq v0, v3, :cond_0

    new-instance v0, Lrm/y;

    new-instance v3, Lrm/e1;

    invoke-direct {v3, v2, v1}, Lrm/e1;-><init>(Ljava/util/ArrayList;Lsn/u0;)V

    iget v4, p1, Lrm/w;->c:I

    iget-wide v5, p1, Lrm/w;->d:J

    invoke-direct {v0, v3, v4, v5, v6}, Lrm/y;-><init>(Lrm/o1;IJ)V

    iput-object v0, p0, Lrm/z;->j0:Lrm/y;

    :cond_0
    iget-object p1, p0, Lrm/z;->S:Lb9/b1;

    iget-object v0, p1, Lb9/b1;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {p1, v4, v3}, Lb9/b1;->l(II)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p1, v0, v2, v1}, Lb9/b1;->a(ILjava/util/ArrayList;Lsn/u0;)Lrm/o1;

    move-result-object p1

    invoke-virtual {p0, p1, v4}, Lrm/z;->l(Lrm/o1;Z)V

    return-void
.end method

.method public final P(Z)V
    .locals 3

    iget-boolean v0, p0, Lrm/z;->h0:Z

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lrm/z;->h0:Z

    iget-object v0, p0, Lrm/z;->W:Lrm/v0;

    iget v1, v0, Lrm/v0;->e:I

    if-nez p1, :cond_2

    const/4 v2, 0x4

    if-eq v1, v2, :cond_2

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lrm/z;->H:Llo/v;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Llo/v;->c(I)Z

    return-void

    :cond_2
    :goto_0
    invoke-virtual {v0, p1}, Lrm/v0;->c(Z)Lrm/v0;

    move-result-object p1

    iput-object p1, p0, Lrm/z;->W:Lrm/v0;

    return-void
.end method

.method public final Q(Z)V
    .locals 1

    iput-boolean p1, p0, Lrm/z;->Z:Z

    invoke-virtual {p0}, Lrm/z;->B()V

    iget-boolean p1, p0, Lrm/z;->a0:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lrm/z;->R:Lrm/p0;

    iget-object v0, p1, Lrm/p0;->i:Lrm/n0;

    iget-object p1, p1, Lrm/p0;->h:Lrm/n0;

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lrm/z;->H(Z)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lrm/z;->k(Z)V

    :cond_0
    return-void
.end method

.method public final R(IIZZ)V
    .locals 3

    iget-object v0, p0, Lrm/z;->X:Lrm/x;

    invoke-virtual {v0, p4}, Lrm/x;->a(I)V

    iget-object p4, p0, Lrm/z;->X:Lrm/x;

    const/4 v0, 0x1

    iput-boolean v0, p4, Lrm/x;->a:Z

    iput-boolean v0, p4, Lrm/x;->f:Z

    iput p2, p4, Lrm/x;->g:I

    iget-object p2, p0, Lrm/z;->W:Lrm/v0;

    invoke-virtual {p2, p1, p3}, Lrm/v0;->d(IZ)Lrm/v0;

    move-result-object p1

    iput-object p1, p0, Lrm/z;->W:Lrm/v0;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lrm/z;->b0:Z

    iget-object p2, p0, Lrm/z;->R:Lrm/p0;

    iget-object p2, p2, Lrm/p0;->h:Lrm/n0;

    :goto_0
    if-eqz p2, :cond_2

    iget-object p4, p2, Lrm/n0;->n:Lio/x;

    iget-object p4, p4, Lio/x;->c:[Lio/o;

    array-length v0, p4

    move v1, p1

    :goto_1
    if-ge v1, v0, :cond_1

    aget-object v2, p4, v1

    if-eqz v2, :cond_0

    invoke-interface {v2, p3}, Lio/o;->k(Z)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    iget-object p2, p2, Lrm/n0;->l:Lrm/n0;

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lrm/z;->X()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lrm/z;->b0()V

    invoke-virtual {p0}, Lrm/z;->e0()V

    return-void

    :cond_3
    iget-object p1, p0, Lrm/z;->W:Lrm/v0;

    iget p1, p1, Lrm/v0;->e:I

    const/4 p2, 0x3

    iget-object p3, p0, Lrm/z;->H:Llo/v;

    const/4 p4, 0x2

    if-ne p1, p2, :cond_4

    invoke-virtual {p0}, Lrm/z;->Z()V

    invoke-virtual {p3, p4}, Llo/v;->c(I)Z

    return-void

    :cond_4
    if-ne p1, p4, :cond_5

    invoke-virtual {p3, p4}, Llo/v;->c(I)Z

    :cond_5
    return-void
.end method

.method public final S(Lrm/w0;)V
    .locals 2

    iget-object v0, p0, Lrm/z;->N:Lb9/l;

    invoke-virtual {v0, p1}, Lb9/l;->f(Lrm/w0;)V

    invoke-virtual {v0}, Lb9/l;->b()Lrm/w0;

    move-result-object p1

    const/4 v0, 0x1

    iget v1, p1, Lrm/w0;->w:F

    invoke-virtual {p0, p1, v1, v0, v0}, Lrm/z;->n(Lrm/w0;FZZ)V

    return-void
.end method

.method public final T(I)V
    .locals 2

    iput p1, p0, Lrm/z;->d0:I

    iget-object v0, p0, Lrm/z;->W:Lrm/v0;

    iget-object v0, v0, Lrm/v0;->a:Lrm/o1;

    iget-object v1, p0, Lrm/z;->R:Lrm/p0;

    iput p1, v1, Lrm/p0;->f:I

    invoke-virtual {v1, v0}, Lrm/p0;->n(Lrm/o1;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lrm/z;->H(Z)V

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lrm/z;->k(Z)V

    return-void
.end method

.method public final U(Z)V
    .locals 2

    iput-boolean p1, p0, Lrm/z;->e0:Z

    iget-object v0, p0, Lrm/z;->W:Lrm/v0;

    iget-object v0, v0, Lrm/v0;->a:Lrm/o1;

    iget-object v1, p0, Lrm/z;->R:Lrm/p0;

    iput-boolean p1, v1, Lrm/p0;->g:Z

    invoke-virtual {v1, v0}, Lrm/p0;->n(Lrm/o1;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lrm/z;->H(Z)V

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lrm/z;->k(Z)V

    return-void
.end method

.method public final V(Lsn/u0;)V
    .locals 6

    iget-object v0, p0, Lrm/z;->X:Lrm/x;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lrm/x;->a(I)V

    iget-object v0, p0, Lrm/z;->S:Lb9/b1;

    iget-object v1, v0, Lb9/b1;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget-object v2, p1, Lsn/u0;->b:[I

    array-length v2, v2

    if-eq v2, v1, :cond_0

    new-instance v2, Lsn/u0;

    new-instance v3, Ljava/util/Random;

    iget-object p1, p1, Lsn/u0;->a:Ljava/util/Random;

    invoke-virtual {p1}, Ljava/util/Random;->nextLong()J

    move-result-wide v4

    invoke-direct {v3, v4, v5}, Ljava/util/Random;-><init>(J)V

    invoke-direct {v2, v3}, Lsn/u0;-><init>(Ljava/util/Random;)V

    invoke-virtual {v2, v1}, Lsn/u0;->a(I)Lsn/u0;

    move-result-object p1

    :cond_0
    iput-object p1, v0, Lb9/b1;->l:Ljava/lang/Object;

    invoke-virtual {v0}, Lb9/b1;->c()Lrm/o1;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lrm/z;->l(Lrm/o1;Z)V

    return-void
.end method

.method public final W(I)V
    .locals 3

    iget-object v0, p0, Lrm/z;->W:Lrm/v0;

    iget v1, v0, Lrm/v0;->e:I

    if-eq v1, p1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, p0, Lrm/z;->o0:J

    :cond_0
    invoke-virtual {v0, p1}, Lrm/v0;->g(I)Lrm/v0;

    move-result-object p1

    iput-object p1, p0, Lrm/z;->W:Lrm/v0;

    :cond_1
    return-void
.end method

.method public final X()Z
    .locals 2

    iget-object v0, p0, Lrm/z;->W:Lrm/v0;

    iget-boolean v1, v0, Lrm/v0;->l:Z

    if-eqz v1, :cond_0

    iget v0, v0, Lrm/v0;->m:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final Y(Lrm/o1;Lsn/v;)Z
    .locals 2

    invoke-virtual {p2}, Lsn/t;->a()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lrm/o1;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p2, Lsn/t;->a:Ljava/lang/Object;

    iget-object v0, p0, Lrm/z;->L:Lrm/m1;

    invoke-virtual {p1, p2, v0}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    move-result-object p2

    iget p2, p2, Lrm/m1;->y:I

    iget-object v0, p0, Lrm/z;->K:Lrm/n1;

    invoke-virtual {p1, p2, v0}, Lrm/o1;->n(ILrm/n1;)V

    invoke-virtual {v0}, Lrm/n1;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-boolean p1, v0, Lrm/n1;->I:Z

    if-eqz p1, :cond_1

    iget-wide p1, v0, Lrm/n1;->F:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p1, v0

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final Z()V
    .locals 7

    const/4 v0, 0x0

    iput-boolean v0, p0, Lrm/z;->b0:Z

    iget-object v1, p0, Lrm/z;->N:Lb9/l;

    const/4 v2, 0x1

    iput-boolean v2, v1, Lb9/l;->y:Z

    iget-object v1, v1, Lb9/l;->z:Ljava/lang/Object;

    check-cast v1, Lb9/l1;

    invoke-virtual {v1}, Lb9/l1;->g()V

    iget-object v1, p0, Lrm/z;->w:[Lrm/d;

    array-length v3, v1

    move v4, v0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v1, v4

    invoke-static {v5}, Lrm/z;->q(Lrm/d;)Z

    move-result v6

    if-eqz v6, :cond_1

    iget v6, v5, Lrm/d;->F:I

    if-ne v6, v2, :cond_0

    move v6, v2

    goto :goto_1

    :cond_0
    move v6, v0

    :goto_1
    invoke-static {v6}, Llo/a;->i(Z)V

    const/4 v6, 0x2

    iput v6, v5, Lrm/d;->F:I

    invoke-virtual {v5}, Lrm/d;->p()V

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final a(Lrm/w;I)V
    .locals 2

    iget-object v0, p0, Lrm/z;->X:Lrm/x;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lrm/x;->a(I)V

    const/4 v0, -0x1

    iget-object v1, p0, Lrm/z;->S:Lb9/b1;

    if-ne p2, v0, :cond_0

    iget-object p2, v1, Lb9/b1;->b:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    :cond_0
    iget-object v0, p1, Lrm/w;->a:Ljava/util/ArrayList;

    iget-object p1, p1, Lrm/w;->b:Lsn/u0;

    invoke-virtual {v1, p2, v0, p1}, Lb9/b1;->a(ILjava/util/ArrayList;Lsn/u0;)Lrm/o1;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Lrm/z;->l(Lrm/o1;Z)V

    return-void
.end method

.method public final a0(ZZ)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lrm/z;->f0:Z

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move p1, v0

    goto :goto_1

    :cond_1
    :goto_0
    move p1, v1

    :goto_1
    invoke-virtual {p0, p1, v0, v1, v0}, Lrm/z;->A(ZZZZ)V

    iget-object p1, p0, Lrm/z;->X:Lrm/x;

    invoke-virtual {p1, p2}, Lrm/x;->a(I)V

    iget-object p1, p0, Lrm/z;->F:Lrm/h;

    invoke-virtual {p1, v1}, Lrm/h;->b(Z)V

    invoke-virtual {p0, v1}, Lrm/z;->W(I)V

    return-void
.end method

.method public final b(Lrm/d;)V
    .locals 5

    invoke-static {p1}, Lrm/z;->q(Lrm/d;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lrm/z;->N:Lb9/l;

    iget-object v1, v0, Lb9/l;->F:Ljava/lang/Object;

    check-cast v1, Lrm/d;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne p1, v1, :cond_1

    iput-object v2, v0, Lb9/l;->G:Ljava/lang/Object;

    iput-object v2, v0, Lb9/l;->F:Ljava/lang/Object;

    iput-boolean v3, v0, Lb9/l;->x:Z

    :cond_1
    iget v0, p1, Lrm/d;->F:I

    const/4 v1, 0x0

    const/4 v4, 0x2

    if-ne v0, v4, :cond_3

    if-ne v0, v4, :cond_2

    move v0, v3

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    invoke-static {v0}, Llo/a;->i(Z)V

    iput v3, p1, Lrm/d;->F:I

    invoke-virtual {p1}, Lrm/d;->q()V

    :cond_3
    iget v0, p1, Lrm/d;->F:I

    if-ne v0, v3, :cond_4

    move v0, v3

    goto :goto_1

    :cond_4
    move v0, v1

    :goto_1
    invoke-static {v0}, Llo/a;->i(Z)V

    iget-object v0, p1, Lrm/d;->x:Lxl/a;

    invoke-virtual {v0}, Lxl/a;->j()V

    iput v1, p1, Lrm/d;->F:I

    iput-object v2, p1, Lrm/d;->G:Lsn/r0;

    iput-object v2, p1, Lrm/d;->H:[Lrm/c0;

    iput-boolean v1, p1, Lrm/d;->K:Z

    invoke-virtual {p1}, Lrm/d;->l()V

    iget p1, p0, Lrm/z;->i0:I

    sub-int/2addr p1, v3

    iput p1, p0, Lrm/z;->i0:I

    return-void
.end method

.method public final b0()V
    .locals 8

    iget-object v0, p0, Lrm/z;->N:Lb9/l;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lb9/l;->y:Z

    iget-object v0, v0, Lb9/l;->z:Ljava/lang/Object;

    check-cast v0, Lb9/l1;

    iget-boolean v2, v0, Lb9/l1;->z:Z

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lb9/l1;->c()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lb9/l1;->a(J)V

    iput-boolean v1, v0, Lb9/l1;->z:Z

    :cond_0
    iget-object v0, p0, Lrm/z;->w:[Lrm/d;

    array-length v2, v0

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_3

    aget-object v4, v0, v3

    invoke-static {v4}, Lrm/z;->q(Lrm/d;)Z

    move-result v5

    if-eqz v5, :cond_2

    iget v5, v4, Lrm/d;->F:I

    const/4 v6, 0x2

    if-ne v5, v6, :cond_2

    const/4 v7, 0x1

    if-ne v5, v6, :cond_1

    move v5, v7

    goto :goto_1

    :cond_1
    move v5, v1

    :goto_1
    invoke-static {v5}, Llo/a;->i(Z)V

    iput v7, v4, Lrm/d;->F:I

    invoke-virtual {v4}, Lrm/d;->q()V

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final c(Lsn/t0;)V
    .locals 2

    check-cast p1, Lsn/s;

    iget-object v0, p0, Lrm/z;->H:Llo/v;

    const/16 v1, 0x9

    invoke-virtual {v0, v1, p1}, Llo/v;->a(ILjava/lang/Object;)Llo/u;

    move-result-object p1

    invoke-virtual {p1}, Llo/u;->b()V

    return-void
.end method

.method public final c0()V
    .locals 29

    move-object/from16 v0, p0

    iget-object v1, v0, Lrm/z;->R:Lrm/p0;

    iget-object v1, v1, Lrm/p0;->j:Lrm/n0;

    iget-boolean v2, v0, Lrm/z;->c0:Z

    if-nez v2, :cond_1

    if-eqz v1, :cond_0

    iget-object v1, v1, Lrm/n0;->a:Ljava/lang/Object;

    invoke-interface {v1}, Lsn/t0;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move v11, v1

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v1, 0x1

    goto :goto_0

    :goto_2
    iget-object v1, v0, Lrm/z;->W:Lrm/v0;

    iget-boolean v2, v1, Lrm/v0;->g:Z

    if-eq v11, v2, :cond_2

    new-instance v2, Lrm/v0;

    iget-object v3, v1, Lrm/v0;->a:Lrm/o1;

    iget-object v4, v1, Lrm/v0;->b:Lsn/v;

    iget-wide v5, v1, Lrm/v0;->c:J

    iget-wide v7, v1, Lrm/v0;->d:J

    iget v9, v1, Lrm/v0;->e:I

    iget-object v10, v1, Lrm/v0;->f:Lcom/google/android/exoplayer2/ExoPlaybackException;

    iget-object v12, v1, Lrm/v0;->h:Lsn/x0;

    iget-object v13, v1, Lrm/v0;->i:Lio/x;

    iget-object v14, v1, Lrm/v0;->j:Ljava/util/List;

    iget-object v15, v1, Lrm/v0;->k:Lsn/v;

    move-object/from16 v16, v2

    iget-boolean v2, v1, Lrm/v0;->l:Z

    move/from16 v17, v2

    iget v2, v1, Lrm/v0;->m:I

    move/from16 v18, v2

    iget-object v2, v1, Lrm/v0;->n:Lrm/w0;

    move-object/from16 v20, v2

    move-object/from16 v19, v3

    iget-wide v2, v1, Lrm/v0;->q:J

    move-wide/from16 v21, v2

    iget-wide v2, v1, Lrm/v0;->r:J

    move-wide/from16 v23, v2

    iget-wide v2, v1, Lrm/v0;->s:J

    move-wide/from16 v25, v2

    iget-boolean v2, v1, Lrm/v0;->o:Z

    iget-boolean v1, v1, Lrm/v0;->p:Z

    move-object/from16 v3, v19

    move-wide/from16 v27, v25

    move/from16 v26, v1

    move/from16 v25, v2

    move-object/from16 v2, v16

    move/from16 v16, v17

    move/from16 v17, v18

    move-object/from16 v18, v20

    move-wide/from16 v19, v21

    move-wide/from16 v21, v23

    move-wide/from16 v23, v27

    invoke-direct/range {v2 .. v26}, Lrm/v0;-><init>(Lrm/o1;Lsn/v;JJILcom/google/android/exoplayer2/ExoPlaybackException;ZLsn/x0;Lio/x;Ljava/util/List;Lsn/v;ZILrm/w0;JJJZZ)V

    iput-object v2, v0, Lrm/z;->W:Lrm/v0;

    :cond_2
    return-void
.end method

.method public final d()V
    .locals 45

    move-object/from16 v1, p0

    iget-object v0, v1, Lrm/z;->P:Llo/t;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v11

    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget-object v0, v0, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v0}, Lrm/o1;->p()Z

    move-result v0

    const-wide/high16 v13, -0x8000000000000000L

    const/4 v15, 0x0

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v10, 0x0

    if-nez v0, :cond_0

    iget-object v0, v1, Lrm/z;->S:Lb9/b1;

    iget-boolean v0, v0, Lb9/b1;->g:Z

    if-nez v0, :cond_2

    :cond_0
    move-wide/from16 v18, v13

    const/4 v14, 0x1

    :cond_1
    :goto_0
    move v13, v10

    goto/16 :goto_1c

    :cond_2
    iget-object v0, v1, Lrm/z;->R:Lrm/p0;

    iget-wide v3, v1, Lrm/z;->k0:J

    iget-object v0, v0, Lrm/p0;->j:Lrm/n0;

    if-eqz v0, :cond_4

    iget-object v5, v0, Lrm/n0;->l:Lrm/n0;

    if-nez v5, :cond_3

    const/4 v5, 0x1

    goto :goto_1

    :cond_3
    move v5, v10

    :goto_1
    invoke-static {v5}, Llo/a;->i(Z)V

    iget-boolean v5, v0, Lrm/n0;->d:Z

    if-eqz v5, :cond_4

    iget-object v5, v0, Lrm/n0;->a:Ljava/lang/Object;

    iget-wide v6, v0, Lrm/n0;->o:J

    sub-long/2addr v3, v6

    invoke-interface {v5, v3, v4}, Lsn/t0;->n(J)V

    :cond_4
    iget-object v0, v1, Lrm/z;->R:Lrm/p0;

    iget-object v3, v0, Lrm/p0;->j:Lrm/n0;

    if-eqz v3, :cond_7

    iget-object v4, v3, Lrm/n0;->f:Lrm/o0;

    iget-boolean v4, v4, Lrm/o0;->i:Z

    if-nez v4, :cond_6

    iget-boolean v4, v3, Lrm/n0;->d:Z

    if-eqz v4, :cond_6

    iget-boolean v4, v3, Lrm/n0;->e:Z

    if-eqz v4, :cond_5

    iget-object v3, v3, Lrm/n0;->a:Ljava/lang/Object;

    invoke-interface {v3}, Lsn/t0;->m()J

    move-result-wide v3

    cmp-long v3, v3, v13

    if-nez v3, :cond_6

    :cond_5
    iget-object v3, v0, Lrm/p0;->j:Lrm/n0;

    iget-object v3, v3, Lrm/n0;->f:Lrm/o0;

    iget-wide v3, v3, Lrm/o0;->e:J

    cmp-long v3, v3, v8

    if-eqz v3, :cond_6

    iget v0, v0, Lrm/p0;->k:I

    const/16 v3, 0x64

    if-ge v0, v3, :cond_6

    goto :goto_2

    :cond_6
    move-wide/from16 v16, v8

    move-wide/from16 v18, v13

    const/16 v23, 0x1

    goto/16 :goto_7

    :cond_7
    :goto_2
    iget-object v0, v1, Lrm/z;->R:Lrm/p0;

    iget-wide v3, v1, Lrm/z;->k0:J

    iget-object v5, v1, Lrm/z;->W:Lrm/v0;

    iget-object v6, v0, Lrm/p0;->j:Lrm/n0;

    if-nez v6, :cond_8

    iget-object v3, v5, Lrm/v0;->a:Lrm/o1;

    iget-object v4, v5, Lrm/v0;->b:Lsn/v;

    iget-wide v6, v5, Lrm/v0;->c:J

    move-object/from16 v17, v3

    const/16 v23, 0x1

    iget-wide v2, v5, Lrm/v0;->s:J

    move-object/from16 v16, v0

    move-wide/from16 v21, v2

    move-object/from16 v18, v4

    move-wide/from16 v19, v6

    invoke-virtual/range {v16 .. v22}, Lrm/p0;->d(Lrm/o1;Lsn/v;JJ)Lrm/o0;

    move-result-object v0

    goto :goto_3

    :cond_8
    const/16 v23, 0x1

    iget-object v2, v5, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v0, v2, v6, v3, v4}, Lrm/p0;->c(Lrm/o1;Lrm/n0;J)Lrm/o0;

    move-result-object v0

    :goto_3
    if-eqz v0, :cond_d

    iget-object v2, v1, Lrm/z;->R:Lrm/p0;

    iget-object v3, v1, Lrm/z;->y:[Lrm/d;

    iget-object v4, v1, Lrm/z;->z:Lio/r;

    iget-object v5, v1, Lrm/z;->F:Lrm/h;

    iget-object v5, v5, Lrm/h;->a:Lko/o;

    iget-object v6, v1, Lrm/z;->S:Lb9/b1;

    iget-object v7, v1, Lrm/z;->E:Lio/x;

    move-wide/from16 v16, v8

    iget-object v8, v2, Lrm/p0;->j:Lrm/n0;

    if-nez v8, :cond_9

    const-wide v8, 0xe8d4a51000L

    move-wide/from16 v18, v13

    :goto_4
    move-wide/from16 v26, v8

    goto :goto_5

    :cond_9
    move-wide/from16 v18, v13

    iget-wide v13, v8, Lrm/n0;->o:J

    iget-object v8, v8, Lrm/n0;->f:Lrm/o0;

    iget-wide v8, v8, Lrm/o0;->e:J

    add-long/2addr v13, v8

    iget-wide v8, v0, Lrm/o0;->b:J

    sub-long v8, v13, v8

    goto :goto_4

    :goto_5
    new-instance v24, Lrm/n0;

    move-object/from16 v31, v0

    move-object/from16 v25, v3

    move-object/from16 v28, v4

    move-object/from16 v29, v5

    move-object/from16 v30, v6

    move-object/from16 v32, v7

    invoke-direct/range {v24 .. v32}, Lrm/n0;-><init>([Lrm/d;JLio/r;Lko/o;Lb9/b1;Lrm/o0;Lio/x;)V

    move-object/from16 v3, v24

    iget-object v4, v2, Lrm/p0;->j:Lrm/n0;

    if-eqz v4, :cond_b

    iget-object v5, v4, Lrm/n0;->l:Lrm/n0;

    if-ne v3, v5, :cond_a

    goto :goto_6

    :cond_a
    invoke-virtual {v4}, Lrm/n0;->b()V

    iput-object v3, v4, Lrm/n0;->l:Lrm/n0;

    invoke-virtual {v4}, Lrm/n0;->c()V

    goto :goto_6

    :cond_b
    iput-object v3, v2, Lrm/p0;->h:Lrm/n0;

    iput-object v3, v2, Lrm/p0;->i:Lrm/n0;

    :goto_6
    iput-object v15, v2, Lrm/p0;->l:Ljava/lang/Object;

    iput-object v3, v2, Lrm/p0;->j:Lrm/n0;

    iget v4, v2, Lrm/p0;->k:I

    add-int/lit8 v4, v4, 0x1

    iput v4, v2, Lrm/p0;->k:I

    invoke-virtual {v2}, Lrm/p0;->j()V

    iget-object v2, v3, Lrm/n0;->a:Ljava/lang/Object;

    iget-wide v4, v0, Lrm/o0;->b:J

    invoke-interface {v2, v1, v4, v5}, Lsn/s;->b(Lsn/r;J)V

    iget-object v2, v1, Lrm/z;->R:Lrm/p0;

    iget-object v2, v2, Lrm/p0;->h:Lrm/n0;

    if-ne v2, v3, :cond_c

    iget-wide v2, v0, Lrm/o0;->b:J

    invoke-virtual {v1, v2, v3}, Lrm/z;->C(J)V

    :cond_c
    invoke-virtual {v1, v10}, Lrm/z;->k(Z)V

    goto :goto_7

    :cond_d
    move-wide/from16 v16, v8

    move-wide/from16 v18, v13

    :goto_7
    iget-boolean v0, v1, Lrm/z;->c0:Z

    if-eqz v0, :cond_e

    invoke-virtual {v1}, Lrm/z;->p()Z

    move-result v0

    iput-boolean v0, v1, Lrm/z;->c0:Z

    invoke-virtual {v1}, Lrm/z;->c0()V

    goto :goto_8

    :cond_e
    invoke-virtual {v1}, Lrm/z;->s()V

    :goto_8
    iget-object v0, v1, Lrm/z;->w:[Lrm/d;

    iget-object v2, v1, Lrm/z;->R:Lrm/p0;

    iget-object v3, v2, Lrm/p0;->i:Lrm/n0;

    if-nez v3, :cond_10

    :cond_f
    :goto_9
    move/from16 v14, v23

    goto/16 :goto_12

    :cond_10
    iget-object v4, v3, Lrm/n0;->l:Lrm/n0;

    if-eqz v4, :cond_11

    iget-boolean v4, v1, Lrm/z;->a0:Z

    if-eqz v4, :cond_12

    :cond_11
    move/from16 v14, v23

    goto/16 :goto_f

    :cond_12
    iget-boolean v4, v3, Lrm/n0;->d:Z

    if-nez v4, :cond_13

    goto :goto_9

    :cond_13
    move v4, v10

    :goto_a
    array-length v5, v0

    if-ge v4, v5, :cond_15

    aget-object v5, v0, v4

    iget-object v6, v3, Lrm/n0;->c:[Lsn/r0;

    aget-object v6, v6, v4

    iget-object v7, v5, Lrm/d;->G:Lsn/r0;

    if-ne v7, v6, :cond_f

    if-eqz v6, :cond_14

    invoke-virtual {v5}, Lrm/d;->i()Z

    move-result v6

    if-nez v6, :cond_14

    iget-object v6, v3, Lrm/n0;->l:Lrm/n0;

    iget-object v7, v3, Lrm/n0;->f:Lrm/o0;

    iget-boolean v7, v7, Lrm/o0;->f:Z

    if-eqz v7, :cond_f

    iget-boolean v7, v6, Lrm/n0;->d:Z

    if-eqz v7, :cond_f

    instance-of v7, v5, Lxn/i;

    if-nez v7, :cond_14

    instance-of v7, v5, Lin/f;

    if-nez v7, :cond_14

    iget-wide v7, v5, Lrm/d;->J:J

    invoke-virtual {v6}, Lrm/n0;->e()J

    move-result-wide v5

    cmp-long v5, v7, v5

    if-ltz v5, :cond_f

    :cond_14
    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    :cond_15
    iget-object v4, v3, Lrm/n0;->l:Lrm/n0;

    iget-boolean v5, v4, Lrm/n0;->d:Z

    if-nez v5, :cond_16

    iget-wide v5, v1, Lrm/z;->k0:J

    invoke-virtual {v4}, Lrm/n0;->e()J

    move-result-wide v7

    cmp-long v4, v5, v7

    if-gez v4, :cond_16

    goto :goto_9

    :cond_16
    iget-object v8, v3, Lrm/n0;->n:Lio/x;

    iget-object v4, v2, Lrm/p0;->i:Lrm/n0;

    if-eqz v4, :cond_17

    iget-object v4, v4, Lrm/n0;->l:Lrm/n0;

    if-eqz v4, :cond_17

    move/from16 v4, v23

    goto :goto_b

    :cond_17
    move v4, v10

    :goto_b
    invoke-static {v4}, Llo/a;->i(Z)V

    iget-object v4, v2, Lrm/p0;->i:Lrm/n0;

    iget-object v4, v4, Lrm/n0;->l:Lrm/n0;

    iput-object v4, v2, Lrm/p0;->i:Lrm/n0;

    invoke-virtual {v2}, Lrm/p0;->j()V

    iget-object v9, v2, Lrm/p0;->i:Lrm/n0;

    iget-object v13, v9, Lrm/n0;->n:Lio/x;

    iget-object v2, v1, Lrm/z;->W:Lrm/v0;

    iget-object v2, v2, Lrm/v0;->a:Lrm/o1;

    iget-object v4, v9, Lrm/n0;->f:Lrm/o0;

    iget-object v4, v4, Lrm/o0;->a:Lsn/v;

    iget-object v3, v3, Lrm/n0;->f:Lrm/o0;

    iget-object v5, v3, Lrm/o0;->a:Lsn/v;

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    move-object v3, v4

    move-object v4, v2

    move/from16 v14, v23

    invoke-virtual/range {v1 .. v7}, Lrm/z;->f0(Lrm/o1;Lsn/v;Lrm/o1;Lsn/v;J)V

    iget-boolean v2, v9, Lrm/n0;->d:Z

    if-eqz v2, :cond_19

    iget-object v2, v9, Lrm/n0;->a:Ljava/lang/Object;

    invoke-interface {v2}, Lsn/s;->f()J

    move-result-wide v2

    cmp-long v2, v2, v16

    if-eqz v2, :cond_19

    invoke-virtual {v9}, Lrm/n0;->e()J

    move-result-wide v2

    array-length v4, v0

    move v5, v10

    :goto_c
    if-ge v5, v4, :cond_20

    aget-object v6, v0, v5

    iget-object v7, v6, Lrm/d;->G:Lsn/r0;

    if-eqz v7, :cond_18

    invoke-static {v6, v2, v3}, Lrm/z;->M(Lrm/d;J)V

    :cond_18
    add-int/lit8 v5, v5, 0x1

    goto :goto_c

    :cond_19
    move v2, v10

    :goto_d
    array-length v3, v0

    if-ge v2, v3, :cond_20

    invoke-virtual {v8, v2}, Lio/x;->b(I)Z

    move-result v3

    invoke-virtual {v13, v2}, Lio/x;->b(I)Z

    move-result v4

    if-eqz v3, :cond_1c

    aget-object v3, v0, v2

    iget-boolean v3, v3, Lrm/d;->K:Z

    if-nez v3, :cond_1c

    iget-object v3, v1, Lrm/z;->y:[Lrm/d;

    aget-object v3, v3, v2

    iget v3, v3, Lrm/d;->w:I

    const/4 v5, -0x2

    if-ne v3, v5, :cond_1a

    move v3, v14

    goto :goto_e

    :cond_1a
    move v3, v10

    :goto_e
    iget-object v5, v8, Lio/x;->b:[Lrm/g1;

    aget-object v5, v5, v2

    iget-object v6, v13, Lio/x;->b:[Lrm/g1;

    aget-object v6, v6, v2

    if-eqz v4, :cond_1b

    invoke-virtual {v6, v5}, Lrm/g1;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1b

    if-eqz v3, :cond_1c

    :cond_1b
    aget-object v3, v0, v2

    invoke-virtual {v9}, Lrm/n0;->e()J

    move-result-wide v4

    invoke-static {v3, v4, v5}, Lrm/z;->M(Lrm/d;J)V

    :cond_1c
    add-int/lit8 v2, v2, 0x1

    goto :goto_d

    :goto_f
    iget-object v2, v3, Lrm/n0;->f:Lrm/o0;

    iget-boolean v2, v2, Lrm/o0;->i:Z

    if-nez v2, :cond_1d

    iget-boolean v2, v1, Lrm/z;->a0:Z

    if-eqz v2, :cond_20

    :cond_1d
    move v2, v10

    :goto_10
    array-length v4, v0

    if-ge v2, v4, :cond_20

    aget-object v4, v0, v2

    iget-object v5, v3, Lrm/n0;->c:[Lsn/r0;

    aget-object v5, v5, v2

    if-eqz v5, :cond_1f

    iget-object v6, v4, Lrm/d;->G:Lsn/r0;

    if-ne v6, v5, :cond_1f

    invoke-virtual {v4}, Lrm/d;->i()Z

    move-result v5

    if-eqz v5, :cond_1f

    iget-object v5, v3, Lrm/n0;->f:Lrm/o0;

    iget-wide v5, v5, Lrm/o0;->e:J

    cmp-long v7, v5, v16

    if-eqz v7, :cond_1e

    cmp-long v7, v5, v18

    if-eqz v7, :cond_1e

    iget-wide v7, v3, Lrm/n0;->o:J

    add-long/2addr v7, v5

    goto :goto_11

    :cond_1e
    move-wide/from16 v7, v16

    :goto_11
    invoke-static {v4, v7, v8}, Lrm/z;->M(Lrm/d;J)V

    :cond_1f
    add-int/lit8 v2, v2, 0x1

    goto :goto_10

    :cond_20
    :goto_12
    iget-object v0, v1, Lrm/z;->R:Lrm/p0;

    iget-object v2, v0, Lrm/p0;->i:Lrm/n0;

    if-eqz v2, :cond_2a

    iget-object v0, v0, Lrm/p0;->h:Lrm/n0;

    if-eq v0, v2, :cond_2a

    iget-boolean v0, v2, Lrm/n0;->g:Z

    if-eqz v0, :cond_21

    goto/16 :goto_18

    :cond_21
    iget-object v0, v2, Lrm/n0;->n:Lio/x;

    iget-object v3, v2, Lrm/n0;->c:[Lsn/r0;

    move v4, v10

    move v5, v4

    :goto_13
    iget-object v6, v1, Lrm/z;->w:[Lrm/d;

    array-length v7, v6

    if-ge v5, v7, :cond_29

    aget-object v6, v6, v5

    invoke-static {v6}, Lrm/z;->q(Lrm/d;)Z

    move-result v7

    if-nez v7, :cond_22

    goto :goto_17

    :cond_22
    iget-object v7, v6, Lrm/d;->G:Lsn/r0;

    aget-object v8, v3, v5

    if-eq v7, v8, :cond_23

    move v7, v14

    goto :goto_14

    :cond_23
    move v7, v10

    :goto_14
    invoke-virtual {v0, v5}, Lio/x;->b(I)Z

    move-result v8

    if-eqz v8, :cond_24

    if-nez v7, :cond_24

    goto :goto_17

    :cond_24
    iget-boolean v7, v6, Lrm/d;->K:Z

    if-nez v7, :cond_27

    iget-object v7, v0, Lio/x;->c:[Lio/o;

    aget-object v7, v7, v5

    if-eqz v7, :cond_25

    invoke-interface {v7}, Lio/o;->length()I

    move-result v8

    goto :goto_15

    :cond_25
    move v8, v10

    :goto_15
    new-array v9, v8, [Lrm/c0;

    move v13, v10

    :goto_16
    if-ge v13, v8, :cond_26

    invoke-interface {v7, v13}, Lio/o;->d(I)Lrm/c0;

    move-result-object v20

    aput-object v20, v9, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_16

    :cond_26
    aget-object v22, v3, v5

    invoke-virtual {v2}, Lrm/n0;->e()J

    move-result-wide v23

    iget-wide v7, v2, Lrm/n0;->o:J

    move-object/from16 v20, v6

    move-wide/from16 v25, v7

    move-object/from16 v21, v9

    invoke-virtual/range {v20 .. v26}, Lrm/d;->u([Lrm/c0;Lsn/r0;JJ)V

    goto :goto_17

    :cond_27
    invoke-virtual {v6}, Lrm/d;->j()Z

    move-result v7

    if-eqz v7, :cond_28

    invoke-virtual {v1, v6}, Lrm/z;->b(Lrm/d;)V

    goto :goto_17

    :cond_28
    move v4, v14

    :goto_17
    add-int/lit8 v5, v5, 0x1

    goto :goto_13

    :cond_29
    if-nez v4, :cond_2a

    array-length v0, v6

    new-array v0, v0, [Z

    invoke-virtual {v1, v0}, Lrm/z;->e([Z)V

    :cond_2a
    :goto_18
    iget-object v0, v1, Lrm/z;->R:Lrm/p0;

    move v2, v10

    :goto_19
    invoke-virtual {v1}, Lrm/z;->X()Z

    move-result v3

    if-nez v3, :cond_2b

    :goto_1a
    goto/16 :goto_0

    :cond_2b
    iget-boolean v3, v1, Lrm/z;->a0:Z

    if-eqz v3, :cond_2c

    goto :goto_1a

    :cond_2c
    iget-object v3, v0, Lrm/p0;->h:Lrm/n0;

    if-nez v3, :cond_2d

    goto :goto_1a

    :cond_2d
    iget-object v3, v3, Lrm/n0;->l:Lrm/n0;

    if-eqz v3, :cond_1

    iget-wide v4, v1, Lrm/z;->k0:J

    invoke-virtual {v3}, Lrm/n0;->e()J

    move-result-wide v6

    cmp-long v4, v4, v6

    if-ltz v4, :cond_1

    iget-boolean v3, v3, Lrm/n0;->g:Z

    if-eqz v3, :cond_1

    if-eqz v2, :cond_2e

    invoke-virtual {v1}, Lrm/z;->t()V

    :cond_2e
    invoke-virtual {v0}, Lrm/p0;->a()Lrm/n0;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v1, Lrm/z;->W:Lrm/v0;

    iget-object v3, v3, Lrm/v0;->b:Lsn/v;

    iget-object v3, v3, Lsn/t;->a:Ljava/lang/Object;

    iget-object v4, v2, Lrm/n0;->f:Lrm/o0;

    iget-object v4, v4, Lrm/o0;->a:Lsn/v;

    iget-object v4, v4, Lsn/t;->a:Ljava/lang/Object;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2f

    iget-object v3, v1, Lrm/z;->W:Lrm/v0;

    iget-object v3, v3, Lrm/v0;->b:Lsn/v;

    iget v4, v3, Lsn/t;->b:I

    const/4 v5, -0x1

    if-ne v4, v5, :cond_2f

    iget-object v4, v2, Lrm/n0;->f:Lrm/o0;

    iget-object v4, v4, Lrm/o0;->a:Lsn/v;

    iget v6, v4, Lsn/t;->b:I

    if-ne v6, v5, :cond_2f

    iget v3, v3, Lsn/t;->e:I

    iget v4, v4, Lsn/t;->e:I

    if-eq v3, v4, :cond_2f

    move v3, v14

    goto :goto_1b

    :cond_2f
    move v3, v10

    :goto_1b
    iget-object v2, v2, Lrm/n0;->f:Lrm/o0;

    iget-object v4, v2, Lrm/o0;->a:Lsn/v;

    move v5, v3

    move-object v6, v4

    iget-wide v3, v2, Lrm/o0;->b:J

    iget-wide v7, v2, Lrm/o0;->c:J

    xor-int/lit8 v9, v5, 0x1

    move v2, v10

    const/4 v10, 0x0

    move v13, v2

    move-object v2, v6

    move-wide v5, v7

    move-wide v7, v3

    invoke-virtual/range {v1 .. v10}, Lrm/z;->o(Lsn/v;JJJZI)Lrm/v0;

    move-result-object v2

    iput-object v2, v1, Lrm/z;->W:Lrm/v0;

    invoke-virtual {v1}, Lrm/z;->B()V

    invoke-virtual {v1}, Lrm/z;->e0()V

    move v10, v13

    move v2, v14

    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    goto/16 :goto_19

    :goto_1c
    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget v0, v0, Lrm/v0;->e:I

    if-eq v0, v14, :cond_66

    const/4 v3, 0x4

    if-ne v0, v3, :cond_30

    goto/16 :goto_38

    :cond_30
    iget-object v0, v1, Lrm/z;->R:Lrm/p0;

    iget-object v0, v0, Lrm/p0;->h:Lrm/n0;

    const-wide/16 v4, 0xa

    if-nez v0, :cond_31

    invoke-virtual {v1, v11, v12, v4, v5}, Lrm/z;->G(JJ)V

    return-void

    :cond_31
    const-string v6, "doSomeWork"

    invoke-static {v6}, Llo/a;->c(Ljava/lang/String;)V

    invoke-virtual {v1}, Lrm/z;->e0()V

    iget-boolean v6, v0, Lrm/n0;->d:Z

    const-wide/16 v7, 0x3e8

    if-eqz v6, :cond_3b

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v9

    mul-long/2addr v9, v7

    iget-object v6, v0, Lrm/n0;->a:Ljava/lang/Object;

    move/from16 v23, v14

    iget-object v14, v1, Lrm/z;->W:Lrm/v0;

    iget-wide v7, v14, Lrm/v0;->s:J

    iget-wide v4, v1, Lrm/z;->M:J

    sub-long/2addr v7, v4

    invoke-interface {v6, v7, v8}, Lsn/s;->i(J)V

    move v6, v13

    move/from16 v4, v23

    move v5, v4

    :goto_1d
    iget-object v7, v1, Lrm/z;->w:[Lrm/d;

    array-length v8, v7

    if-ge v6, v8, :cond_3a

    aget-object v7, v7, v6

    invoke-static {v7}, Lrm/z;->q(Lrm/d;)Z

    move-result v8

    if-nez v8, :cond_32

    goto/16 :goto_24

    :cond_32
    iget-wide v2, v1, Lrm/z;->k0:J

    invoke-virtual {v7, v2, v3, v9, v10}, Lrm/d;->t(JJ)V

    if-eqz v4, :cond_33

    invoke-virtual {v7}, Lrm/d;->j()Z

    move-result v2

    if-eqz v2, :cond_33

    move/from16 v2, v23

    goto :goto_1e

    :cond_33
    move v2, v13

    :goto_1e
    iget-object v3, v0, Lrm/n0;->c:[Lsn/r0;

    aget-object v3, v3, v6

    iget-object v4, v7, Lrm/d;->G:Lsn/r0;

    if-eq v3, v4, :cond_34

    move/from16 v3, v23

    goto :goto_1f

    :cond_34
    move v3, v13

    :goto_1f
    if-nez v3, :cond_35

    invoke-virtual {v7}, Lrm/d;->i()Z

    move-result v4

    if-eqz v4, :cond_35

    move/from16 v4, v23

    goto :goto_20

    :cond_35
    move v4, v13

    :goto_20
    if-nez v3, :cond_37

    if-nez v4, :cond_37

    invoke-virtual {v7}, Lrm/d;->k()Z

    move-result v3

    if-nez v3, :cond_37

    invoke-virtual {v7}, Lrm/d;->j()Z

    move-result v3

    if-eqz v3, :cond_36

    goto :goto_21

    :cond_36
    move v3, v13

    goto :goto_22

    :cond_37
    :goto_21
    move/from16 v3, v23

    :goto_22
    if-eqz v5, :cond_38

    if-eqz v3, :cond_38

    move/from16 v4, v23

    goto :goto_23

    :cond_38
    move v4, v13

    :goto_23
    if-nez v3, :cond_39

    iget-object v3, v7, Lrm/d;->G:Lsn/r0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v3}, Lsn/r0;->c()V

    :cond_39
    move v5, v4

    move v4, v2

    :goto_24
    add-int/lit8 v6, v6, 0x1

    const/4 v3, 0x4

    goto :goto_1d

    :cond_3a
    move v2, v4

    goto :goto_25

    :cond_3b
    move/from16 v23, v14

    iget-object v2, v0, Lrm/n0;->a:Ljava/lang/Object;

    invoke-interface {v2}, Lsn/s;->h()V

    move/from16 v2, v23

    move v5, v2

    :goto_25
    iget-object v3, v0, Lrm/n0;->f:Lrm/o0;

    iget-wide v3, v3, Lrm/o0;->e:J

    if-eqz v2, :cond_3d

    iget-boolean v2, v0, Lrm/n0;->d:Z

    if-eqz v2, :cond_3d

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v3, v6

    if-eqz v2, :cond_3c

    iget-object v2, v1, Lrm/z;->W:Lrm/v0;

    iget-wide v9, v2, Lrm/v0;->s:J

    cmp-long v2, v3, v9

    if-gtz v2, :cond_3e

    :cond_3c
    move/from16 v10, v23

    goto :goto_26

    :cond_3d
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    :cond_3e
    move v10, v13

    :goto_26
    if-eqz v10, :cond_3f

    iget-boolean v2, v1, Lrm/z;->a0:Z

    if-eqz v2, :cond_3f

    iput-boolean v13, v1, Lrm/z;->a0:Z

    iget-object v2, v1, Lrm/z;->W:Lrm/v0;

    iget v2, v2, Lrm/v0;->m:I

    const/4 v3, 0x5

    invoke-virtual {v1, v2, v3, v13, v13}, Lrm/z;->R(IIZZ)V

    :cond_3f
    if-eqz v10, :cond_40

    iget-object v3, v0, Lrm/n0;->f:Lrm/o0;

    iget-boolean v3, v3, Lrm/o0;->i:Z

    if-eqz v3, :cond_40

    const/4 v14, 0x4

    invoke-virtual {v1, v14}, Lrm/z;->W(I)V

    invoke-virtual {v1}, Lrm/z;->b0()V

    goto/16 :goto_31

    :cond_40
    iget-object v3, v1, Lrm/z;->W:Lrm/v0;

    iget v4, v3, Lrm/v0;->e:I

    const/4 v8, 0x2

    if-ne v4, v8, :cond_4e

    iget-object v4, v1, Lrm/z;->R:Lrm/p0;

    iget v9, v1, Lrm/z;->i0:I

    if-nez v9, :cond_41

    invoke-virtual {v1}, Lrm/z;->r()Z

    move-result v10

    move-wide/from16 v33, v6

    goto/16 :goto_2d

    :cond_41
    if-nez v5, :cond_42

    move-wide/from16 v33, v6

    move v10, v13

    goto/16 :goto_2d

    :cond_42
    iget-boolean v9, v3, Lrm/v0;->g:Z

    if-nez v9, :cond_45

    :cond_43
    move-wide/from16 v33, v6

    :cond_44
    :goto_27
    move/from16 v10, v23

    goto/16 :goto_2d

    :cond_45
    iget-object v3, v3, Lrm/v0;->a:Lrm/o1;

    iget-object v9, v4, Lrm/p0;->h:Lrm/n0;

    iget-object v9, v9, Lrm/n0;->f:Lrm/o0;

    iget-object v9, v9, Lrm/o0;->a:Lsn/v;

    invoke-virtual {v1, v3, v9}, Lrm/z;->Y(Lrm/o1;Lsn/v;)Z

    move-result v3

    if-eqz v3, :cond_46

    iget-object v3, v1, Lrm/z;->T:Lb9/i;

    iget-wide v9, v3, Lb9/i;->i:J

    goto :goto_28

    :cond_46
    move-wide v9, v6

    :goto_28
    iget-object v3, v4, Lrm/p0;->j:Lrm/n0;

    iget-boolean v4, v3, Lrm/n0;->d:Z

    if-eqz v4, :cond_48

    iget-boolean v4, v3, Lrm/n0;->e:Z

    if-eqz v4, :cond_47

    iget-object v4, v3, Lrm/n0;->a:Ljava/lang/Object;

    invoke-interface {v4}, Lsn/t0;->m()J

    move-result-wide v24

    cmp-long v4, v24, v18

    if-nez v4, :cond_48

    :cond_47
    iget-object v4, v3, Lrm/n0;->f:Lrm/o0;

    iget-boolean v4, v4, Lrm/o0;->i:Z

    if-eqz v4, :cond_48

    move/from16 v4, v23

    goto :goto_29

    :cond_48
    move v4, v13

    :goto_29
    iget-object v8, v3, Lrm/n0;->f:Lrm/o0;

    iget-object v8, v8, Lrm/o0;->a:Lsn/v;

    invoke-virtual {v8}, Lsn/t;->a()Z

    move-result v8

    if-eqz v8, :cond_49

    iget-boolean v3, v3, Lrm/n0;->d:Z

    if-nez v3, :cond_49

    move/from16 v3, v23

    goto :goto_2a

    :cond_49
    move v3, v13

    :goto_2a
    if-nez v4, :cond_43

    if-nez v3, :cond_43

    iget-object v3, v1, Lrm/z;->F:Lrm/h;

    iget-object v4, v1, Lrm/z;->W:Lrm/v0;

    iget-wide v13, v4, Lrm/v0;->q:J

    iget-object v4, v1, Lrm/z;->R:Lrm/p0;

    iget-object v4, v4, Lrm/p0;->j:Lrm/n0;

    move-wide/from16 v33, v6

    if-nez v4, :cond_4a

    move-object v8, v3

    const-wide/16 v2, 0x0

    goto :goto_2b

    :cond_4a
    move-object v8, v3

    iget-wide v2, v1, Lrm/z;->k0:J

    iget-wide v6, v4, Lrm/n0;->o:J

    sub-long/2addr v2, v6

    sub-long/2addr v13, v2

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v13, v14}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    move-wide v2, v6

    :goto_2b
    iget-object v4, v1, Lrm/z;->N:Lb9/l;

    invoke-virtual {v4}, Lb9/l;->b()Lrm/w0;

    move-result-object v4

    iget v4, v4, Lrm/w0;->w:F

    iget-boolean v6, v1, Lrm/z;->b0:Z

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v2, v3}, Llo/y;->s(FJ)J

    move-result-wide v2

    if-eqz v6, :cond_4b

    iget-wide v6, v8, Lrm/h;->e:J

    goto :goto_2c

    :cond_4b
    iget-wide v6, v8, Lrm/h;->d:J

    :goto_2c
    cmp-long v4, v9, v33

    if-eqz v4, :cond_4c

    const-wide/16 v13, 0x2

    div-long/2addr v9, v13

    invoke-static {v9, v10, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    :cond_4c
    const-wide/16 v25, 0x0

    cmp-long v4, v6, v25

    if-lez v4, :cond_44

    cmp-long v2, v2, v6

    if-gez v2, :cond_44

    iget-object v2, v8, Lrm/h;->a:Lko/o;

    monitor-enter v2

    :try_start_0
    iget v3, v2, Lko/o;->e:I

    iget v4, v2, Lko/o;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    mul-int/2addr v3, v4

    monitor-exit v2

    iget v2, v8, Lrm/h;->h:I

    if-lt v3, v2, :cond_4d

    goto/16 :goto_27

    :cond_4d
    const/4 v10, 0x0

    goto :goto_2d

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :goto_2d
    const/4 v2, 0x3

    if-eqz v10, :cond_4f

    invoke-virtual {v1, v2}, Lrm/z;->W(I)V

    iput-object v15, v1, Lrm/z;->n0:Lcom/google/android/exoplayer2/ExoPlaybackException;

    invoke-virtual {v1}, Lrm/z;->X()Z

    move-result v3

    if-eqz v3, :cond_58

    invoke-virtual {v1}, Lrm/z;->Z()V

    goto :goto_31

    :cond_4e
    move-wide/from16 v33, v6

    const/4 v2, 0x3

    :cond_4f
    iget-object v3, v1, Lrm/z;->W:Lrm/v0;

    iget v3, v3, Lrm/v0;->e:I

    if-ne v3, v2, :cond_58

    iget v2, v1, Lrm/z;->i0:I

    if-nez v2, :cond_50

    invoke-virtual {v1}, Lrm/z;->r()Z

    move-result v2

    if-eqz v2, :cond_51

    goto :goto_31

    :cond_50
    if-nez v5, :cond_58

    :cond_51
    invoke-virtual {v1}, Lrm/z;->X()Z

    move-result v2

    iput-boolean v2, v1, Lrm/z;->b0:Z

    const/4 v8, 0x2

    invoke-virtual {v1, v8}, Lrm/z;->W(I)V

    iget-boolean v2, v1, Lrm/z;->b0:Z

    if-eqz v2, :cond_57

    iget-object v2, v1, Lrm/z;->R:Lrm/p0;

    iget-object v2, v2, Lrm/p0;->h:Lrm/n0;

    :goto_2e
    if-eqz v2, :cond_54

    iget-object v3, v2, Lrm/n0;->n:Lio/x;

    iget-object v3, v3, Lio/x;->c:[Lio/o;

    array-length v4, v3

    const/4 v10, 0x0

    :goto_2f
    if-ge v10, v4, :cond_53

    aget-object v5, v3, v10

    if-eqz v5, :cond_52

    invoke-interface {v5}, Lio/o;->p()V

    :cond_52
    add-int/lit8 v10, v10, 0x1

    goto :goto_2f

    :cond_53
    iget-object v2, v2, Lrm/n0;->l:Lrm/n0;

    goto :goto_2e

    :cond_54
    iget-object v2, v1, Lrm/z;->T:Lb9/i;

    iget-wide v3, v2, Lb9/i;->i:J

    cmp-long v5, v3, v33

    if-nez v5, :cond_55

    goto :goto_30

    :cond_55
    iget-wide v5, v2, Lb9/i;->c:J

    add-long/2addr v3, v5

    iput-wide v3, v2, Lb9/i;->i:J

    iget-wide v5, v2, Lb9/i;->h:J

    cmp-long v7, v5, v33

    if-eqz v7, :cond_56

    cmp-long v3, v3, v5

    if-lez v3, :cond_56

    iput-wide v5, v2, Lb9/i;->i:J

    :cond_56
    move-wide/from16 v6, v33

    iput-wide v6, v2, Lb9/i;->m:J

    :cond_57
    :goto_30
    invoke-virtual {v1}, Lrm/z;->b0()V

    :cond_58
    :goto_31
    iget-object v2, v1, Lrm/z;->W:Lrm/v0;

    iget v2, v2, Lrm/v0;->e:I

    const/4 v8, 0x2

    if-ne v2, v8, :cond_5b

    const/4 v10, 0x0

    :goto_32
    iget-object v2, v1, Lrm/z;->w:[Lrm/d;

    array-length v3, v2

    if-ge v10, v3, :cond_5a

    aget-object v2, v2, v10

    invoke-static {v2}, Lrm/z;->q(Lrm/d;)Z

    move-result v2

    if-eqz v2, :cond_59

    iget-object v2, v1, Lrm/z;->w:[Lrm/d;

    aget-object v2, v2, v10

    iget-object v2, v2, Lrm/d;->G:Lsn/r0;

    iget-object v3, v0, Lrm/n0;->c:[Lsn/r0;

    aget-object v3, v3, v10

    if-ne v2, v3, :cond_59

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v2}, Lsn/r0;->c()V

    :cond_59
    add-int/lit8 v10, v10, 0x1

    goto :goto_32

    :cond_5a
    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget-boolean v2, v0, Lrm/v0;->g:Z

    if-nez v2, :cond_5b

    iget-wide v2, v0, Lrm/v0;->r:J

    const-wide/32 v4, 0x7a120

    cmp-long v0, v2, v4

    if-gez v0, :cond_5b

    invoke-virtual {v1}, Lrm/z;->p()Z

    move-result v0

    if-eqz v0, :cond_5b

    move/from16 v10, v23

    goto :goto_33

    :cond_5b
    const/4 v10, 0x0

    :goto_33
    if-nez v10, :cond_5c

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v6, v1, Lrm/z;->o0:J

    goto :goto_34

    :cond_5c
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    iget-wide v2, v1, Lrm/z;->o0:J

    cmp-long v0, v2, v6

    if-nez v0, :cond_5d

    iget-object v0, v1, Lrm/z;->P:Llo/t;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iput-wide v2, v1, Lrm/z;->o0:J

    goto :goto_34

    :cond_5d
    iget-object v0, v1, Lrm/z;->P:Llo/t;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, v1, Lrm/z;->o0:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0xfa0

    cmp-long v0, v2, v4

    if-gez v0, :cond_65

    :goto_34
    iget-boolean v0, v1, Lrm/z;->h0:Z

    iget-object v2, v1, Lrm/z;->W:Lrm/v0;

    iget-boolean v3, v2, Lrm/v0;->o:Z

    if-eq v0, v3, :cond_5e

    invoke-virtual {v2, v0}, Lrm/v0;->c(Z)Lrm/v0;

    move-result-object v0

    iput-object v0, v1, Lrm/z;->W:Lrm/v0;

    :cond_5e
    invoke-virtual {v1}, Lrm/z;->X()Z

    move-result v0

    if-eqz v0, :cond_5f

    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget v0, v0, Lrm/v0;->e:I

    const/4 v2, 0x3

    if-eq v0, v2, :cond_60

    :cond_5f
    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget v0, v0, Lrm/v0;->e:I

    const/4 v8, 0x2

    if-ne v0, v8, :cond_62

    :cond_60
    iget-boolean v0, v1, Lrm/z;->h0:Z

    if-eqz v0, :cond_61

    iget-boolean v0, v1, Lrm/z;->g0:Z

    if-eqz v0, :cond_61

    const/4 v10, 0x0

    goto :goto_35

    :cond_61
    const-wide/16 v2, 0xa

    invoke-virtual {v1, v11, v12, v2, v3}, Lrm/z;->G(JJ)V

    move/from16 v10, v23

    :goto_35
    xor-int/lit8 v10, v10, 0x1

    goto :goto_37

    :cond_62
    iget v2, v1, Lrm/z;->i0:I

    if-eqz v2, :cond_63

    const/4 v14, 0x4

    if-eq v0, v14, :cond_63

    const-wide/16 v2, 0x3e8

    invoke-virtual {v1, v11, v12, v2, v3}, Lrm/z;->G(JJ)V

    goto :goto_36

    :cond_63
    iget-object v0, v1, Lrm/z;->H:Llo/v;

    iget-object v0, v0, Llo/v;->a:Landroid/os/Handler;

    const/4 v8, 0x2

    invoke-virtual {v0, v8}, Landroid/os/Handler;->removeMessages(I)V

    :goto_36
    const/4 v10, 0x0

    :goto_37
    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget-boolean v2, v0, Lrm/v0;->p:Z

    if-eq v2, v10, :cond_64

    new-instance v20, Lrm/v0;

    iget-object v2, v0, Lrm/v0;->a:Lrm/o1;

    iget-object v3, v0, Lrm/v0;->b:Lsn/v;

    iget-wide v4, v0, Lrm/v0;->c:J

    iget-wide v6, v0, Lrm/v0;->d:J

    iget v8, v0, Lrm/v0;->e:I

    iget-object v9, v0, Lrm/v0;->f:Lcom/google/android/exoplayer2/ExoPlaybackException;

    iget-boolean v11, v0, Lrm/v0;->g:Z

    iget-object v12, v0, Lrm/v0;->h:Lsn/x0;

    iget-object v13, v0, Lrm/v0;->i:Lio/x;

    iget-object v14, v0, Lrm/v0;->j:Ljava/util/List;

    iget-object v15, v0, Lrm/v0;->k:Lsn/v;

    move-object/from16 v21, v2

    iget-boolean v2, v0, Lrm/v0;->l:Z

    move/from16 v34, v2

    iget v2, v0, Lrm/v0;->m:I

    move/from16 v35, v2

    iget-object v2, v0, Lrm/v0;->n:Lrm/w0;

    move-object/from16 v36, v2

    move-object/from16 v22, v3

    iget-wide v2, v0, Lrm/v0;->q:J

    move-wide/from16 v37, v2

    iget-wide v2, v0, Lrm/v0;->r:J

    move-wide/from16 v39, v2

    iget-wide v2, v0, Lrm/v0;->s:J

    iget-boolean v0, v0, Lrm/v0;->o:Z

    move/from16 v43, v0

    move-wide/from16 v41, v2

    move-wide/from16 v23, v4

    move-wide/from16 v25, v6

    move/from16 v27, v8

    move-object/from16 v28, v9

    move/from16 v44, v10

    move/from16 v29, v11

    move-object/from16 v30, v12

    move-object/from16 v31, v13

    move-object/from16 v32, v14

    move-object/from16 v33, v15

    invoke-direct/range {v20 .. v44}, Lrm/v0;-><init>(Lrm/o1;Lsn/v;JJILcom/google/android/exoplayer2/ExoPlaybackException;ZLsn/x0;Lio/x;Ljava/util/List;Lsn/v;ZILrm/w0;JJJZZ)V

    move-object/from16 v0, v20

    iput-object v0, v1, Lrm/z;->W:Lrm/v0;

    :cond_64
    const/4 v13, 0x0

    iput-boolean v13, v1, Lrm/z;->g0:Z

    invoke-static {}, Llo/a;->o()V

    return-void

    :cond_65
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Playback stuck buffering and not loading"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_66
    :goto_38
    iget-object v0, v1, Lrm/z;->H:Llo/v;

    iget-object v0, v0, Llo/v;->a:Landroid/os/Handler;

    const/4 v8, 0x2

    invoke-virtual {v0, v8}, Landroid/os/Handler;->removeMessages(I)V

    return-void
.end method

.method public final d0(Lio/x;)V
    .locals 6

    iget-object p1, p1, Lio/x;->c:[Lio/o;

    iget-object v0, p0, Lrm/z;->F:Lrm/h;

    iget v1, v0, Lrm/h;->f:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_2

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, p0, Lrm/z;->w:[Lrm/d;

    array-length v4, v3

    const/high16 v5, 0xc80000

    if-ge v1, v4, :cond_1

    aget-object v4, p1, v1

    if-eqz v4, :cond_0

    aget-object v3, v3, v1

    iget v3, v3, Lrm/d;->w:I

    const/high16 v4, 0x20000

    packed-switch v3, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    move v5, v4

    goto :goto_1

    :pswitch_1
    const/high16 v5, 0x7d00000

    goto :goto_1

    :pswitch_2
    const/high16 v5, 0x89a0000

    :goto_1
    :pswitch_3
    add-int/2addr v2, v5

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    :cond_2
    iput v1, v0, Lrm/h;->h:I

    iget-object p1, v0, Lrm/h;->a:Lko/o;

    invoke-virtual {p1, v1}, Lko/o;->a(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final e([Z)V
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, Lrm/z;->R:Lrm/p0;

    iget-object v2, v1, Lrm/p0;->i:Lrm/n0;

    iget-object v3, v2, Lrm/n0;->n:Lio/x;

    const/4 v5, 0x0

    :goto_0
    iget-object v6, v0, Lrm/z;->w:[Lrm/d;

    array-length v7, v6

    iget-object v8, v0, Lrm/z;->x:Ljava/util/Set;

    if-ge v5, v7, :cond_1

    invoke-virtual {v3, v5}, Lio/x;->b(I)Z

    move-result v7

    if-nez v7, :cond_0

    aget-object v7, v6, v5

    invoke-interface {v8, v7}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    aget-object v6, v6, v5

    invoke-virtual {v6}, Lrm/d;->v()V

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_1
    array-length v7, v6

    if-ge v5, v7, :cond_e

    invoke-virtual {v3, v5}, Lio/x;->b(I)Z

    move-result v7

    if-eqz v7, :cond_c

    aget-boolean v7, p1, v5

    aget-object v10, v6, v5

    invoke-static {v10}, Lrm/z;->q(Lrm/d;)Z

    move-result v11

    if-eqz v11, :cond_2

    goto/16 :goto_a

    :cond_2
    iget-object v11, v1, Lrm/p0;->i:Lrm/n0;

    iget-object v12, v1, Lrm/p0;->h:Lrm/n0;

    if-ne v11, v12, :cond_3

    const/4 v12, 0x1

    goto :goto_2

    :cond_3
    const/4 v12, 0x0

    :goto_2
    iget-object v13, v11, Lrm/n0;->n:Lio/x;

    iget-object v14, v13, Lio/x;->b:[Lrm/g1;

    aget-object v14, v14, v5

    iget-object v13, v13, Lio/x;->c:[Lio/o;

    aget-object v13, v13, v5

    if-eqz v13, :cond_4

    invoke-interface {v13}, Lio/o;->length()I

    move-result v15

    goto :goto_3

    :cond_4
    const/4 v15, 0x0

    :goto_3
    new-array v4, v15, [Lrm/c0;

    const/4 v9, 0x0

    const/16 v17, 0x1

    :goto_4
    if-ge v9, v15, :cond_5

    invoke-interface {v13, v9}, Lio/o;->d(I)Lrm/c0;

    move-result-object v16

    aput-object v16, v4, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_5
    invoke-virtual {v0}, Lrm/z;->X()Z

    move-result v9

    if-eqz v9, :cond_6

    iget-object v9, v0, Lrm/z;->W:Lrm/v0;

    iget v9, v9, Lrm/v0;->e:I

    const/4 v13, 0x3

    if-ne v9, v13, :cond_6

    move/from16 v9, v17

    goto :goto_5

    :cond_6
    const/4 v9, 0x0

    :goto_5
    if-nez v7, :cond_7

    if-eqz v9, :cond_7

    move/from16 v7, v17

    goto :goto_6

    :cond_7
    const/4 v7, 0x0

    :goto_6
    iget v13, v0, Lrm/z;->i0:I

    add-int/lit8 v13, v13, 0x1

    iput v13, v0, Lrm/z;->i0:I

    invoke-interface {v8, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v13, v11, Lrm/n0;->c:[Lsn/r0;

    aget-object v13, v13, v5

    move-object/from16 v18, v3

    move-object v15, v4

    iget-wide v3, v0, Lrm/z;->k0:J

    invoke-virtual {v11}, Lrm/n0;->e()J

    move-result-wide v19

    move/from16 v22, v5

    move-object/from16 v21, v6

    iget-wide v5, v11, Lrm/n0;->o:J

    iget v11, v10, Lrm/d;->F:I

    if-nez v11, :cond_8

    move/from16 v11, v17

    goto :goto_7

    :cond_8
    const/4 v11, 0x0

    :goto_7
    invoke-static {v11}, Llo/a;->i(Z)V

    iput-object v14, v10, Lrm/d;->y:Lrm/g1;

    move/from16 v11, v17

    iput v11, v10, Lrm/d;->F:I

    invoke-virtual {v10, v7, v12}, Lrm/d;->m(ZZ)V

    move-object v12, v13

    move-object v11, v15

    move-wide/from16 v13, v19

    move-wide v15, v5

    invoke-virtual/range {v10 .. v16}, Lrm/d;->u([Lrm/c0;Lsn/r0;JJ)V

    const/4 v5, 0x0

    iput-boolean v5, v10, Lrm/d;->K:Z

    iput-wide v3, v10, Lrm/d;->J:J

    invoke-virtual {v10, v3, v4, v7}, Lrm/d;->n(JZ)V

    new-instance v3, Lrm/v;

    invoke-direct {v3, v0}, Lrm/v;-><init>(Lrm/z;)V

    const/16 v4, 0xb

    invoke-interface {v10, v4, v3}, Lrm/c1;->a(ILjava/lang/Object;)V

    iget-object v3, v0, Lrm/z;->N:Lb9/l;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v10}, Lrm/d;->g()Llo/l;

    move-result-object v4

    const/4 v6, 0x2

    if-eqz v4, :cond_a

    iget-object v7, v3, Lb9/l;->G:Ljava/lang/Object;

    check-cast v7, Llo/l;

    if-eq v4, v7, :cond_a

    if-nez v7, :cond_9

    iput-object v4, v3, Lb9/l;->G:Ljava/lang/Object;

    iput-object v10, v3, Lb9/l;->F:Ljava/lang/Object;

    iget-object v3, v3, Lb9/l;->z:Ljava/lang/Object;

    check-cast v3, Lb9/l1;

    iget-object v3, v3, Lb9/l1;->F:Ljava/lang/Object;

    check-cast v3, Lrm/w0;

    check-cast v4, Ltm/v;

    invoke-virtual {v4, v3}, Ltm/v;->f(Lrm/w0;)V

    goto :goto_8

    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Multiple renderer media clocks enabled."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    new-instance v2, Lcom/google/android/exoplayer2/ExoPlaybackException;

    const/16 v3, 0x3e8

    invoke-direct {v2, v6, v1, v3}, Lcom/google/android/exoplayer2/ExoPlaybackException;-><init>(ILjava/lang/Exception;I)V

    throw v2

    :cond_a
    :goto_8
    if-eqz v9, :cond_d

    iget v3, v10, Lrm/d;->F:I

    const/4 v11, 0x1

    if-ne v3, v11, :cond_b

    const/4 v9, 0x1

    goto :goto_9

    :cond_b
    move v9, v5

    :goto_9
    invoke-static {v9}, Llo/a;->i(Z)V

    iput v6, v10, Lrm/d;->F:I

    invoke-virtual {v10}, Lrm/d;->p()V

    goto :goto_b

    :cond_c
    :goto_a
    move-object/from16 v18, v3

    move/from16 v22, v5

    move-object/from16 v21, v6

    const/4 v5, 0x0

    :cond_d
    :goto_b
    add-int/lit8 v3, v22, 0x1

    move v5, v3

    move-object/from16 v3, v18

    move-object/from16 v6, v21

    goto/16 :goto_1

    :cond_e
    const/4 v11, 0x1

    iput-boolean v11, v2, Lrm/n0;->g:Z

    return-void
.end method

.method public final e0()V
    .locals 25

    move-object/from16 v0, p0

    iget-object v1, v0, Lrm/z;->R:Lrm/p0;

    iget-object v1, v1, Lrm/p0;->h:Lrm/n0;

    if-nez v1, :cond_0

    goto/16 :goto_e

    :cond_0
    iget-boolean v2, v1, Lrm/n0;->d:Z

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v2, :cond_1

    iget-object v2, v1, Lrm/n0;->a:Ljava/lang/Object;

    invoke-interface {v2}, Lsn/s;->f()J

    move-result-wide v2

    goto :goto_0

    :cond_1
    move-wide v2, v10

    :goto_0
    cmp-long v4, v2, v10

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eqz v4, :cond_2

    invoke-virtual {v0, v2, v3}, Lrm/z;->C(J)V

    iget-object v1, v0, Lrm/z;->W:Lrm/v0;

    iget-wide v4, v1, Lrm/v0;->s:J

    cmp-long v1, v2, v4

    if-eqz v1, :cond_10

    iget-object v1, v0, Lrm/z;->W:Lrm/v0;

    iget-object v4, v1, Lrm/v0;->b:Lsn/v;

    iget-wide v5, v1, Lrm/v0;->c:J

    const/4 v8, 0x1

    const/4 v9, 0x5

    move-object v1, v4

    move-wide v4, v5

    move-wide v6, v2

    invoke-virtual/range {v0 .. v9}, Lrm/z;->o(Lsn/v;JJJZI)Lrm/v0;

    move-result-object v1

    iput-object v1, v0, Lrm/z;->W:Lrm/v0;

    goto/16 :goto_7

    :cond_2
    iget-object v2, v0, Lrm/z;->N:Lb9/l;

    iget-object v3, v0, Lrm/z;->R:Lrm/p0;

    iget-object v3, v3, Lrm/p0;->i:Lrm/n0;

    if-eq v1, v3, :cond_3

    move v3, v12

    goto :goto_1

    :cond_3
    move v3, v13

    :goto_1
    iget-object v4, v2, Lb9/l;->z:Ljava/lang/Object;

    check-cast v4, Lb9/l1;

    iget-object v5, v2, Lb9/l;->F:Ljava/lang/Object;

    check-cast v5, Lrm/d;

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Lrm/d;->j()Z

    move-result v5

    if-nez v5, :cond_7

    iget-object v5, v2, Lb9/l;->F:Ljava/lang/Object;

    check-cast v5, Lrm/d;

    invoke-virtual {v5}, Lrm/d;->k()Z

    move-result v5

    if-nez v5, :cond_4

    if-nez v3, :cond_7

    iget-object v3, v2, Lb9/l;->F:Ljava/lang/Object;

    check-cast v3, Lrm/d;

    invoke-virtual {v3}, Lrm/d;->i()Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    iget-object v3, v2, Lb9/l;->G:Ljava/lang/Object;

    check-cast v3, Llo/l;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v3}, Llo/l;->c()J

    move-result-wide v5

    iget-boolean v7, v2, Lb9/l;->x:Z

    if-eqz v7, :cond_6

    invoke-virtual {v4}, Lb9/l1;->c()J

    move-result-wide v7

    cmp-long v7, v5, v7

    if-gez v7, :cond_5

    iget-boolean v3, v4, Lb9/l1;->z:Z

    if-eqz v3, :cond_8

    invoke-virtual {v4}, Lb9/l1;->c()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Lb9/l1;->a(J)V

    iput-boolean v13, v4, Lb9/l1;->z:Z

    goto :goto_3

    :cond_5
    iput-boolean v13, v2, Lb9/l;->x:Z

    iget-boolean v7, v2, Lb9/l;->y:Z

    if-eqz v7, :cond_6

    invoke-virtual {v4}, Lb9/l1;->g()V

    :cond_6
    invoke-virtual {v4, v5, v6}, Lb9/l1;->a(J)V

    invoke-interface {v3}, Llo/l;->b()Lrm/w0;

    move-result-object v3

    iget-object v5, v4, Lb9/l1;->F:Ljava/lang/Object;

    check-cast v5, Lrm/w0;

    invoke-virtual {v3, v5}, Lrm/w0;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    invoke-virtual {v4, v3}, Lb9/l1;->f(Lrm/w0;)V

    iget-object v4, v2, Lb9/l;->E:Landroid/os/Handler$Callback;

    check-cast v4, Lrm/z;

    iget-object v4, v4, Lrm/z;->H:Llo/v;

    const/16 v5, 0x10

    invoke-virtual {v4, v5, v3}, Llo/v;->a(ILjava/lang/Object;)Llo/u;

    move-result-object v3

    invoke-virtual {v3}, Llo/u;->b()V

    goto :goto_3

    :cond_7
    :goto_2
    iput-boolean v12, v2, Lb9/l;->x:Z

    iget-boolean v3, v2, Lb9/l;->y:Z

    if-eqz v3, :cond_8

    invoke-virtual {v4}, Lb9/l1;->g()V

    :cond_8
    :goto_3
    invoke-virtual {v2}, Lb9/l;->c()J

    move-result-wide v2

    iput-wide v2, v0, Lrm/z;->k0:J

    iget-wide v4, v1, Lrm/n0;->o:J

    sub-long/2addr v2, v4

    iget-object v1, v0, Lrm/z;->W:Lrm/v0;

    iget-wide v4, v1, Lrm/v0;->s:J

    iget-object v1, v0, Lrm/z;->O:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_f

    iget-object v1, v0, Lrm/z;->W:Lrm/v0;

    iget-object v1, v1, Lrm/v0;->b:Lsn/v;

    invoke-virtual {v1}, Lsn/t;->a()Z

    move-result v1

    if-eqz v1, :cond_9

    goto :goto_6

    :cond_9
    iget-boolean v1, v0, Lrm/z;->m0:Z

    if-eqz v1, :cond_a

    iput-boolean v13, v0, Lrm/z;->m0:Z

    :cond_a
    iget-object v1, v0, Lrm/z;->W:Lrm/v0;

    iget-object v4, v1, Lrm/v0;->a:Lrm/o1;

    iget-object v1, v1, Lrm/v0;->b:Lsn/v;

    iget-object v1, v1, Lsn/t;->a:Ljava/lang/Object;

    invoke-virtual {v4, v1}, Lrm/o1;->b(Ljava/lang/Object;)I

    iget v1, v0, Lrm/z;->l0:I

    iget-object v4, v0, Lrm/z;->O:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-lez v1, :cond_c

    iget-object v4, v0, Lrm/z;->O:Ljava/util/ArrayList;

    add-int/lit8 v5, v1, -0x1

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_b

    goto :goto_4

    :cond_b
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    :cond_c
    :goto_4
    iget-object v4, v0, Lrm/z;->O:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v1, v4, :cond_e

    iget-object v4, v0, Lrm/z;->O:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_d

    goto :goto_5

    :cond_d
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    :cond_e
    :goto_5
    iput v1, v0, Lrm/z;->l0:I

    :cond_f
    :goto_6
    iget-object v1, v0, Lrm/z;->W:Lrm/v0;

    iput-wide v2, v1, Lrm/v0;->s:J

    :cond_10
    :goto_7
    iget-object v1, v0, Lrm/z;->R:Lrm/p0;

    iget-object v1, v1, Lrm/p0;->j:Lrm/n0;

    iget-object v2, v0, Lrm/z;->W:Lrm/v0;

    invoke-virtual {v1}, Lrm/n0;->d()J

    move-result-wide v3

    iput-wide v3, v2, Lrm/v0;->q:J

    iget-object v1, v0, Lrm/z;->W:Lrm/v0;

    iget-wide v2, v1, Lrm/v0;->q:J

    iget-object v4, v0, Lrm/z;->R:Lrm/p0;

    iget-object v4, v4, Lrm/p0;->j:Lrm/n0;

    const-wide/16 v5, 0x0

    if-nez v4, :cond_11

    move-wide v2, v5

    goto :goto_8

    :cond_11
    iget-wide v7, v0, Lrm/z;->k0:J

    iget-wide v14, v4, Lrm/n0;->o:J

    sub-long/2addr v7, v14

    sub-long/2addr v2, v7

    invoke-static {v5, v6, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    :goto_8
    iput-wide v2, v1, Lrm/v0;->r:J

    iget-object v1, v0, Lrm/z;->W:Lrm/v0;

    iget-boolean v2, v1, Lrm/v0;->l:Z

    if-eqz v2, :cond_19

    iget v2, v1, Lrm/v0;->e:I

    const/4 v3, 0x3

    if-ne v2, v3, :cond_19

    iget-object v2, v1, Lrm/v0;->a:Lrm/o1;

    iget-object v1, v1, Lrm/v0;->b:Lsn/v;

    invoke-virtual {v0, v2, v1}, Lrm/z;->Y(Lrm/o1;Lsn/v;)Z

    move-result v1

    if-eqz v1, :cond_19

    iget-object v1, v0, Lrm/z;->W:Lrm/v0;

    iget-object v2, v1, Lrm/v0;->n:Lrm/w0;

    iget v2, v2, Lrm/w0;->w:F

    const/high16 v4, 0x3f800000    # 1.0f

    cmpl-float v2, v2, v4

    if-nez v2, :cond_19

    iget-object v2, v0, Lrm/z;->T:Lb9/i;

    iget-object v7, v1, Lrm/v0;->a:Lrm/o1;

    iget-object v8, v1, Lrm/v0;->b:Lsn/v;

    iget-object v8, v8, Lsn/t;->a:Ljava/lang/Object;

    iget-wide v14, v1, Lrm/v0;->s:J

    invoke-virtual {v0, v7, v8, v14, v15}, Lrm/z;->f(Lrm/o1;Ljava/lang/Object;J)J

    move-result-wide v7

    iget-object v1, v0, Lrm/z;->W:Lrm/v0;

    iget-wide v14, v1, Lrm/v0;->q:J

    iget-object v1, v0, Lrm/z;->R:Lrm/p0;

    iget-object v1, v1, Lrm/p0;->j:Lrm/n0;

    if-nez v1, :cond_12

    move-wide/from16 v16, v10

    move v9, v12

    move/from16 v18, v13

    move-wide v10, v5

    goto :goto_9

    :cond_12
    move-wide/from16 v16, v10

    iget-wide v10, v0, Lrm/z;->k0:J

    move v9, v12

    move/from16 v18, v13

    iget-wide v12, v1, Lrm/n0;->o:J

    sub-long/2addr v10, v12

    sub-long/2addr v14, v10

    invoke-static {v5, v6, v14, v15}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v10

    :goto_9
    iget-wide v12, v2, Lb9/i;->d:J

    cmp-long v1, v12, v16

    if-nez v1, :cond_13

    goto/16 :goto_d

    :cond_13
    sub-long v10, v7, v10

    iget-wide v12, v2, Lb9/i;->n:J

    cmp-long v1, v12, v16

    if-nez v1, :cond_14

    iput-wide v10, v2, Lb9/i;->n:J

    iput-wide v5, v2, Lb9/i;->o:J

    goto :goto_a

    :cond_14
    long-to-float v1, v12

    const v5, 0x3f7fbe77    # 0.999f

    mul-float/2addr v1, v5

    long-to-float v6, v10

    const v12, 0x3a831200    # 9.999871E-4f

    mul-float/2addr v6, v12

    add-float/2addr v6, v1

    float-to-long v13, v6

    invoke-static {v10, v11, v13, v14}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v13

    iput-wide v13, v2, Lb9/i;->n:J

    sub-long/2addr v10, v13

    invoke-static {v10, v11}, Ljava/lang/Math;->abs(J)J

    move-result-wide v10

    iget-wide v13, v2, Lb9/i;->o:J

    long-to-float v1, v13

    mul-float/2addr v5, v1

    long-to-float v1, v10

    mul-float/2addr v12, v1

    add-float/2addr v12, v5

    float-to-long v5, v12

    iput-wide v5, v2, Lb9/i;->o:J

    :goto_a
    iget-wide v5, v2, Lb9/i;->m:J

    cmp-long v1, v5, v16

    const-wide/16 v5, 0x3e8

    if-eqz v1, :cond_15

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v10

    iget-wide v12, v2, Lb9/i;->m:J

    sub-long/2addr v10, v12

    cmp-long v1, v10, v5

    if-gez v1, :cond_15

    iget v4, v2, Lb9/i;->l:F

    goto/16 :goto_d

    :cond_15
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v10

    iput-wide v10, v2, Lb9/i;->m:J

    iget-wide v10, v2, Lb9/i;->n:J

    const-wide/16 v12, 0x3

    iget-wide v14, v2, Lb9/i;->o:J

    mul-long/2addr v14, v12

    add-long v23, v14, v10

    iget-wide v10, v2, Lb9/i;->i:J

    cmp-long v1, v10, v23

    const v10, 0x33d6bf95    # 1.0E-7f

    if-lez v1, :cond_16

    invoke-static {v5, v6}, Llo/y;->z(J)J

    move-result-wide v5

    iget v1, v2, Lb9/i;->l:F

    sub-float/2addr v1, v4

    long-to-float v5, v5

    mul-float/2addr v1, v5

    float-to-long v11, v1

    iget v1, v2, Lb9/i;->j:F

    sub-float/2addr v1, v4

    mul-float/2addr v1, v5

    float-to-long v5, v1

    add-long/2addr v11, v5

    iget-wide v5, v2, Lb9/i;->f:J

    iget-wide v13, v2, Lb9/i;->i:J

    sub-long/2addr v13, v11

    new-array v1, v3, [J

    aput-wide v23, v1, v18

    aput-wide v5, v1, v9

    const/4 v3, 0x2

    aput-wide v13, v1, v3

    invoke-static {v1}, Lvp/c;->i0([J)J

    move-result-wide v5

    iput-wide v5, v2, Lb9/i;->i:J

    goto :goto_b

    :cond_16
    iget v1, v2, Lb9/i;->l:F

    sub-float/2addr v1, v4

    const/4 v3, 0x0

    invoke-static {v3, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    div-float/2addr v1, v10

    float-to-long v5, v1

    sub-long v19, v7, v5

    iget-wide v5, v2, Lb9/i;->i:J

    move-wide/from16 v21, v5

    invoke-static/range {v19 .. v24}, Llo/y;->i(JJJ)J

    move-result-wide v5

    iput-wide v5, v2, Lb9/i;->i:J

    iget-wide v11, v2, Lb9/i;->h:J

    cmp-long v1, v11, v16

    if-eqz v1, :cond_17

    cmp-long v1, v5, v11

    if-lez v1, :cond_17

    iput-wide v11, v2, Lb9/i;->i:J

    :cond_17
    :goto_b
    iget-wide v5, v2, Lb9/i;->i:J

    sub-long/2addr v7, v5

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    move-result-wide v5

    iget-wide v11, v2, Lb9/i;->b:J

    cmp-long v1, v5, v11

    if-gez v1, :cond_18

    iput v4, v2, Lb9/i;->l:F

    goto :goto_c

    :cond_18
    long-to-float v1, v7

    mul-float/2addr v10, v1

    add-float/2addr v10, v4

    iget v1, v2, Lb9/i;->k:F

    iget v3, v2, Lb9/i;->j:F

    invoke-static {v10, v1, v3}, Llo/y;->g(FFF)F

    move-result v1

    iput v1, v2, Lb9/i;->l:F

    :goto_c
    iget v4, v2, Lb9/i;->l:F

    :goto_d
    iget-object v1, v0, Lrm/z;->N:Lb9/l;

    invoke-virtual {v1}, Lb9/l;->b()Lrm/w0;

    move-result-object v1

    iget v1, v1, Lrm/w0;->w:F

    cmpl-float v1, v1, v4

    if-eqz v1, :cond_19

    iget-object v1, v0, Lrm/z;->N:Lb9/l;

    iget-object v2, v0, Lrm/z;->W:Lrm/v0;

    iget-object v2, v2, Lrm/v0;->n:Lrm/w0;

    new-instance v3, Lrm/w0;

    iget v2, v2, Lrm/w0;->x:F

    invoke-direct {v3, v4, v2}, Lrm/w0;-><init>(FF)V

    invoke-virtual {v1, v3}, Lb9/l;->f(Lrm/w0;)V

    iget-object v1, v0, Lrm/z;->W:Lrm/v0;

    iget-object v1, v1, Lrm/v0;->n:Lrm/w0;

    iget-object v2, v0, Lrm/z;->N:Lb9/l;

    invoke-virtual {v2}, Lb9/l;->b()Lrm/w0;

    move-result-object v2

    iget v2, v2, Lrm/w0;->w:F

    move/from16 v3, v18

    invoke-virtual {v0, v1, v2, v3, v3}, Lrm/z;->n(Lrm/w0;FZZ)V

    :cond_19
    :goto_e
    return-void
.end method

.method public final f(Lrm/o1;Ljava/lang/Object;J)J
    .locals 5

    iget-object v0, p0, Lrm/z;->L:Lrm/m1;

    invoke-virtual {p1, p2, v0}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    move-result-object p2

    iget p2, p2, Lrm/m1;->y:I

    iget-object v1, p0, Lrm/z;->K:Lrm/n1;

    invoke-virtual {p1, p2, v1}, Lrm/o1;->n(ILrm/n1;)V

    iget-wide p1, v1, Lrm/n1;->F:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p1, v2

    if-eqz p1, :cond_2

    invoke-virtual {v1}, Lrm/n1;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-boolean p1, v1, Lrm/n1;->I:Z

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    iget-wide p1, v1, Lrm/n1;->G:J

    sget v4, Llo/y;->a:I

    cmp-long v2, p1, v2

    if-nez v2, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    goto :goto_0

    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    add-long/2addr p1, v2

    :goto_0
    iget-wide v1, v1, Lrm/n1;->F:J

    sub-long/2addr p1, v1

    invoke-static {p1, p2}, Llo/y;->z(J)J

    move-result-wide p1

    iget-wide v0, v0, Lrm/m1;->E:J

    add-long/2addr p3, v0

    sub-long/2addr p1, p3

    return-wide p1

    :cond_2
    :goto_1
    return-wide v2
.end method

.method public final f0(Lrm/o1;Lsn/v;Lrm/o1;Lsn/v;J)V
    .locals 8

    invoke-virtual {p0, p1, p2}, Lrm/z;->Y(Lrm/o1;Lsn/v;)Z

    move-result v0

    iget-object v1, p2, Lsn/t;->a:Ljava/lang/Object;

    if-nez v0, :cond_1

    invoke-virtual {p2}, Lsn/t;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lrm/w0;->z:Lrm/w0;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lrm/z;->W:Lrm/v0;

    iget-object p1, p1, Lrm/v0;->n:Lrm/w0;

    :goto_0
    iget-object p2, p0, Lrm/z;->N:Lb9/l;

    invoke-virtual {p2}, Lb9/l;->b()Lrm/w0;

    move-result-object p3

    invoke-virtual {p3, p1}, Lrm/w0;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_7

    invoke-virtual {p2, p1}, Lb9/l;->f(Lrm/w0;)V

    return-void

    :cond_1
    iget-object p2, p0, Lrm/z;->L:Lrm/m1;

    invoke-virtual {p1, v1, p2}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    move-result-object v0

    iget v0, v0, Lrm/m1;->y:I

    iget-object v2, p0, Lrm/z;->K:Lrm/n1;

    invoke-virtual {p1, v0, v2}, Lrm/o1;->n(ILrm/n1;)V

    iget-object v0, v2, Lrm/n1;->K:Lrm/h0;

    sget v3, Llo/y;->a:I

    iget-object v3, p0, Lrm/z;->T:Lb9/i;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v4, v0, Lrm/h0;->w:J

    invoke-static {v4, v5}, Llo/y;->z(J)J

    move-result-wide v4

    iput-wide v4, v3, Lb9/i;->d:J

    iget-wide v4, v0, Lrm/h0;->x:J

    invoke-static {v4, v5}, Llo/y;->z(J)J

    move-result-wide v4

    iput-wide v4, v3, Lb9/i;->g:J

    iget-wide v4, v0, Lrm/h0;->y:J

    invoke-static {v4, v5}, Llo/y;->z(J)J

    move-result-wide v4

    iput-wide v4, v3, Lb9/i;->h:J

    iget v4, v0, Lrm/h0;->z:F

    const v5, -0x800001

    cmpl-float v6, v4, v5

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_2
    const v4, 0x3f7851ec    # 0.97f

    :goto_1
    iput v4, v3, Lb9/i;->k:F

    iget v0, v0, Lrm/h0;->E:F

    cmpl-float v5, v0, v5

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    const v0, 0x3f83d70a    # 1.03f

    :goto_2
    iput v0, v3, Lb9/i;->j:F

    const/high16 v5, 0x3f800000    # 1.0f

    cmpl-float v4, v4, v5

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v4, :cond_4

    cmpl-float v0, v0, v5

    if-nez v0, :cond_4

    iput-wide v6, v3, Lb9/i;->d:J

    :cond_4
    invoke-virtual {v3}, Lb9/i;->a()V

    cmp-long v0, p5, v6

    if-eqz v0, :cond_5

    invoke-virtual {p0, p1, v1, p5, p6}, Lrm/z;->f(Lrm/o1;Ljava/lang/Object;J)J

    move-result-wide p1

    iput-wide p1, v3, Lb9/i;->e:J

    invoke-virtual {v3}, Lb9/i;->a()V

    return-void

    :cond_5
    iget-object p1, v2, Lrm/n1;->w:Ljava/lang/Object;

    invoke-virtual {p3}, Lrm/o1;->p()Z

    move-result p5

    if-nez p5, :cond_6

    iget-object p4, p4, Lsn/t;->a:Ljava/lang/Object;

    invoke-virtual {p3, p4, p2}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    move-result-object p2

    iget p2, p2, Lrm/m1;->y:I

    const-wide/16 p4, 0x0

    invoke-virtual {p3, p2, v2, p4, p5}, Lrm/o1;->m(ILrm/n1;J)Lrm/n1;

    move-result-object p2

    iget-object p2, p2, Lrm/n1;->w:Ljava/lang/Object;

    goto :goto_3

    :cond_6
    const/4 p2, 0x0

    :goto_3
    invoke-static {p2, p1}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    iput-wide v6, v3, Lb9/i;->e:J

    invoke-virtual {v3}, Lb9/i;->a()V

    :cond_7
    return-void
.end method

.method public final g(Lsn/s;)V
    .locals 2

    iget-object v0, p0, Lrm/z;->H:Llo/v;

    const/16 v1, 0x8

    invoke-virtual {v0, v1, p1}, Llo/v;->a(ILjava/lang/Object;)Llo/u;

    move-result-object p1

    invoke-virtual {p1}, Llo/u;->b()V

    return-void
.end method

.method public final declared-synchronized g0(Lb9/n;J)V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lrm/z;->P:Llo/t;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    add-long/2addr v0, p2

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p1}, Lb9/n;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_0

    const-wide/16 v3, 0x0

    cmp-long v3, p2, v3

    if-lez v3, :cond_0

    :try_start_1
    iget-object v3, p0, Lrm/z;->P:Llo/t;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, p2, p3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    const/4 p2, 0x1

    move v2, p2

    :goto_1
    :try_start_2
    iget-object p2, p0, Lrm/z;->P:Llo/t;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p2

    sub-long p2, v0, p2

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final h(Lrm/o1;)Landroid/util/Pair;
    .locals 9

    invoke-virtual {p1}, Lrm/o1;->p()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    sget-object p1, Lrm/v0;->t:Lsn/v;

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1

    :cond_0
    iget-boolean v0, p0, Lrm/z;->e0:Z

    invoke-virtual {p1, v0}, Lrm/o1;->a(Z)I

    move-result v6

    iget-object v5, p0, Lrm/z;->L:Lrm/m1;

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    iget-object v4, p0, Lrm/z;->K:Lrm/n1;

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lrm/o1;->i(Lrm/n1;Lrm/m1;IJ)Landroid/util/Pair;

    move-result-object p1

    iget-object v0, p0, Lrm/z;->R:Lrm/p0;

    iget-object v4, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v0, v3, v4, v1, v2}, Lrm/p0;->m(Lrm/o1;Ljava/lang/Object;J)Lsn/v;

    move-result-object v0

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v0}, Lsn/t;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, v0, Lsn/t;->a:Ljava/lang/Object;

    iget-object v4, p0, Lrm/z;->L:Lrm/m1;

    invoke-virtual {v3, p1, v4}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    iget p1, v0, Lsn/t;->c:I

    iget v3, v0, Lsn/t;->b:I

    invoke-virtual {v4, v3}, Lrm/m1;->f(I)I

    move-result v3

    if-ne p1, v3, :cond_1

    iget-object p1, v4, Lrm/m1;->G:Ltn/b;

    iget-wide v1, p1, Ltn/b;->x:J

    :cond_1
    move-wide v4, v1

    :cond_2
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 7

    const-string v0, "Playback error"

    const-string v1, "ExoPlayerImplInternal"

    const/16 v2, 0x3e8

    const/4 v3, 0x0

    const/4 v4, 0x1

    :try_start_0
    iget v5, p1, Landroid/os/Message;->what:I

    packed-switch v5, :pswitch_data_0

    return v3

    :pswitch_0
    invoke-virtual {p0, v4}, Lrm/z;->H(Z)V

    goto/16 :goto_e

    :catch_0
    move-exception p1

    goto/16 :goto_5

    :catch_1
    move-exception p1

    goto/16 :goto_6

    :catch_2
    move-exception p1

    goto/16 :goto_7

    :catch_3
    move-exception p1

    goto/16 :goto_8

    :catch_4
    move-exception p1

    goto/16 :goto_9

    :catch_5
    move-exception p1

    goto/16 :goto_c

    :catch_6
    move-exception p1

    goto/16 :goto_d

    :pswitch_1
    iget p1, p1, Landroid/os/Message;->arg1:I

    if-ne p1, v4, :cond_0

    move p1, v4

    goto :goto_0

    :cond_0
    move p1, v3

    :goto_0
    invoke-virtual {p0, p1}, Lrm/z;->P(Z)V

    goto/16 :goto_e

    :pswitch_2
    iget p1, p1, Landroid/os/Message;->arg1:I

    if-eqz p1, :cond_1

    move p1, v4

    goto :goto_1

    :cond_1
    move p1, v3

    :goto_1
    invoke-virtual {p0, p1}, Lrm/z;->Q(Z)V

    goto/16 :goto_e

    :pswitch_3
    invoke-virtual {p0}, Lrm/z;->u()V

    goto/16 :goto_e

    :pswitch_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lsn/u0;

    invoke-virtual {p0, p1}, Lrm/z;->V(Lsn/u0;)V

    goto/16 :goto_e

    :pswitch_5
    iget v5, p1, Landroid/os/Message;->arg1:I

    iget v6, p1, Landroid/os/Message;->arg2:I

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lsn/u0;

    invoke-virtual {p0, v5, v6, p1}, Lrm/z;->y(IILsn/u0;)V

    goto/16 :goto_e

    :pswitch_6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {p1}, Lr;->t(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lrm/z;->v()V

    const/4 p1, 0x0

    throw p1

    :pswitch_7
    iget-object v5, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v5, Lrm/w;

    iget p1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {p0, v5, p1}, Lrm/z;->a(Lrm/w;I)V

    goto/16 :goto_e

    :pswitch_8
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lrm/w;

    invoke-virtual {p0, p1}, Lrm/z;->O(Lrm/w;)V

    goto/16 :goto_e

    :pswitch_9
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lrm/w0;

    iget v5, p1, Lrm/w0;->w:F

    invoke-virtual {p0, p1, v5, v4, v3}, Lrm/z;->n(Lrm/w0;FZZ)V

    goto/16 :goto_e

    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lrm/d1;

    invoke-virtual {p0, p1}, Lrm/z;->L(Lrm/d1;)V

    goto/16 :goto_e

    :pswitch_b
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lrm/d1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, p1}, Lrm/z;->K(Lrm/d1;)V

    goto/16 :goto_e

    :pswitch_c
    iget v5, p1, Landroid/os/Message;->arg1:I

    if-eqz v5, :cond_2

    move v5, v4

    goto :goto_2

    :cond_2
    move v5, v3

    :goto_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p0, v5, p1}, Lrm/z;->N(ZLjava/util/concurrent/atomic/AtomicBoolean;)V

    goto/16 :goto_e

    :pswitch_d
    iget p1, p1, Landroid/os/Message;->arg1:I

    if-eqz p1, :cond_3

    move p1, v4

    goto :goto_3

    :cond_3
    move p1, v3

    :goto_3
    invoke-virtual {p0, p1}, Lrm/z;->U(Z)V

    goto/16 :goto_e

    :pswitch_e
    iget p1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {p0, p1}, Lrm/z;->T(I)V

    goto/16 :goto_e

    :pswitch_f
    invoke-virtual {p0}, Lrm/z;->z()V

    goto/16 :goto_e

    :pswitch_10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lsn/s;

    invoke-virtual {p0, p1}, Lrm/z;->i(Lsn/s;)V

    goto/16 :goto_e

    :pswitch_11
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lsn/s;

    invoke-virtual {p0, p1}, Lrm/z;->m(Lsn/s;)V

    goto/16 :goto_e

    :pswitch_12
    invoke-virtual {p0}, Lrm/z;->x()V

    return v4

    :pswitch_13
    invoke-virtual {p0, v3, v4}, Lrm/z;->a0(ZZ)V

    goto/16 :goto_e

    :pswitch_14
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lrm/h1;

    iput-object p1, p0, Lrm/z;->V:Lrm/h1;

    goto/16 :goto_e

    :pswitch_15
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lrm/w0;

    invoke-virtual {p0, p1}, Lrm/z;->S(Lrm/w0;)V

    goto/16 :goto_e

    :pswitch_16
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lrm/y;

    invoke-virtual {p0, p1}, Lrm/z;->I(Lrm/y;)V

    goto/16 :goto_e

    :pswitch_17
    invoke-virtual {p0}, Lrm/z;->d()V

    goto/16 :goto_e

    :pswitch_18
    iget v5, p1, Landroid/os/Message;->arg1:I

    if-eqz v5, :cond_4

    move v5, v4

    goto :goto_4

    :cond_4
    move v5, v3

    :goto_4
    iget p1, p1, Landroid/os/Message;->arg2:I

    invoke-virtual {p0, p1, v4, v5, v4}, Lrm/z;->R(IIZZ)V

    goto/16 :goto_e

    :pswitch_19
    invoke-virtual {p0}, Lrm/z;->w()V
    :try_end_0
    .catch Lcom/google/android/exoplayer2/ExoPlaybackException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Lcom/google/android/exoplayer2/drm/DrmSession$DrmSessionException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Lcom/google/android/exoplayer2/ParserException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lcom/google/android/exoplayer2/upstream/DataSourceException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/google/android/exoplayer2/source/BehindLiveWindowException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_e

    :goto_5
    instance-of v5, p1, Ljava/lang/IllegalStateException;

    if-nez v5, :cond_5

    instance-of v5, p1, Ljava/lang/IllegalArgumentException;

    if-eqz v5, :cond_6

    :cond_5
    const/16 v2, 0x3ec

    :cond_6
    new-instance v5, Lcom/google/android/exoplayer2/ExoPlaybackException;

    const/4 v6, 0x2

    invoke-direct {v5, v6, p1, v2}, Lcom/google/android/exoplayer2/ExoPlaybackException;-><init>(ILjava/lang/Exception;I)V

    invoke-static {v1, v0, v5}, Llo/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v4, v3}, Lrm/z;->a0(ZZ)V

    iget-object p1, p0, Lrm/z;->W:Lrm/v0;

    invoke-virtual {p1, v5}, Lrm/v0;->e(Lcom/google/android/exoplayer2/ExoPlaybackException;)Lrm/v0;

    move-result-object p1

    iput-object p1, p0, Lrm/z;->W:Lrm/v0;

    goto/16 :goto_e

    :goto_6
    const/16 v0, 0x7d0

    invoke-virtual {p0, p1, v0}, Lrm/z;->j(Ljava/io/IOException;I)V

    goto/16 :goto_e

    :goto_7
    const/16 v0, 0x3ea

    invoke-virtual {p0, p1, v0}, Lrm/z;->j(Ljava/io/IOException;I)V

    goto/16 :goto_e

    :goto_8
    iget v0, p1, Lcom/google/android/exoplayer2/upstream/DataSourceException;->w:I

    invoke-virtual {p0, p1, v0}, Lrm/z;->j(Ljava/io/IOException;I)V

    goto/16 :goto_e

    :goto_9
    iget-boolean v0, p1, Lcom/google/android/exoplayer2/ParserException;->w:Z

    iget v1, p1, Lcom/google/android/exoplayer2/ParserException;->x:I

    if-ne v1, v4, :cond_8

    if-eqz v0, :cond_7

    const/16 v0, 0xbb9

    :goto_a
    move v2, v0

    goto :goto_b

    :cond_7
    const/16 v0, 0xbbb

    goto :goto_a

    :cond_8
    const/4 v3, 0x4

    if-ne v1, v3, :cond_a

    if-eqz v0, :cond_9

    const/16 v0, 0xbba

    goto :goto_a

    :cond_9
    const/16 v0, 0xbbc

    goto :goto_a

    :cond_a
    :goto_b
    invoke-virtual {p0, p1, v2}, Lrm/z;->j(Ljava/io/IOException;I)V

    goto :goto_e

    :goto_c
    iget v0, p1, Lcom/google/android/exoplayer2/drm/DrmSession$DrmSessionException;->w:I

    invoke-virtual {p0, p1, v0}, Lrm/z;->j(Ljava/io/IOException;I)V

    goto :goto_e

    :goto_d
    iget v2, p1, Lcom/google/android/exoplayer2/ExoPlaybackException;->y:I

    if-ne v2, v4, :cond_b

    iget-object v2, p0, Lrm/z;->R:Lrm/p0;

    iget-object v2, v2, Lrm/p0;->i:Lrm/n0;

    if-eqz v2, :cond_b

    iget-object v2, v2, Lrm/n0;->f:Lrm/o0;

    iget-object v2, v2, Lrm/o0;->a:Lsn/v;

    invoke-virtual {p1, v2}, Lcom/google/android/exoplayer2/ExoPlaybackException;->a(Lsn/t;)Lcom/google/android/exoplayer2/ExoPlaybackException;

    move-result-object p1

    :cond_b
    iget-boolean v2, p1, Lcom/google/android/exoplayer2/ExoPlaybackException;->I:Z

    if-eqz v2, :cond_c

    iget-object v2, p0, Lrm/z;->n0:Lcom/google/android/exoplayer2/ExoPlaybackException;

    if-nez v2, :cond_c

    const-string v0, "Recoverable renderer error"

    invoke-static {v1, v0, p1}, Llo/a;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    iput-object p1, p0, Lrm/z;->n0:Lcom/google/android/exoplayer2/ExoPlaybackException;

    const/16 v0, 0x19

    iget-object v1, p0, Lrm/z;->H:Llo/v;

    invoke-virtual {v1, v0, p1}, Llo/v;->a(ILjava/lang/Object;)Llo/u;

    move-result-object p1

    iget-object v0, v1, Llo/v;->a:Landroid/os/Handler;

    iget-object v1, p1, Llo/u;->a:Landroid/os/Message;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    invoke-virtual {p1}, Llo/u;->a()V

    goto :goto_e

    :cond_c
    iget-object v2, p0, Lrm/z;->n0:Lcom/google/android/exoplayer2/ExoPlaybackException;

    if-eqz v2, :cond_d

    invoke-virtual {v2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    iget-object p1, p0, Lrm/z;->n0:Lcom/google/android/exoplayer2/ExoPlaybackException;

    :cond_d
    invoke-static {v1, v0, p1}, Llo/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v4, v3}, Lrm/z;->a0(ZZ)V

    iget-object v0, p0, Lrm/z;->W:Lrm/v0;

    invoke-virtual {v0, p1}, Lrm/v0;->e(Lcom/google/android/exoplayer2/ExoPlaybackException;)Lrm/v0;

    move-result-object p1

    iput-object p1, p0, Lrm/z;->W:Lrm/v0;

    :goto_e
    invoke-virtual {p0}, Lrm/z;->t()V

    return v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
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

.method public final i(Lsn/s;)V
    .locals 5

    iget-object v0, p0, Lrm/z;->R:Lrm/p0;

    iget-object v0, v0, Lrm/p0;->j:Lrm/n0;

    if-eqz v0, :cond_2

    iget-object v1, v0, Lrm/n0;->a:Ljava/lang/Object;

    if-ne v1, p1, :cond_2

    iget-wide v1, p0, Lrm/z;->k0:J

    if-eqz v0, :cond_1

    iget-object p1, v0, Lrm/n0;->l:Lrm/n0;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Llo/a;->i(Z)V

    iget-boolean p1, v0, Lrm/n0;->d:Z

    if-eqz p1, :cond_1

    iget-object p1, v0, Lrm/n0;->a:Ljava/lang/Object;

    iget-wide v3, v0, Lrm/n0;->o:J

    sub-long/2addr v1, v3

    invoke-interface {p1, v1, v2}, Lsn/t0;->n(J)V

    :cond_1
    invoke-virtual {p0}, Lrm/z;->s()V

    :cond_2
    return-void
.end method

.method public final j(Ljava/io/IOException;I)V
    .locals 2

    new-instance v0, Lcom/google/android/exoplayer2/ExoPlaybackException;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1, p2}, Lcom/google/android/exoplayer2/ExoPlaybackException;-><init>(ILjava/lang/Exception;I)V

    iget-object p1, p0, Lrm/z;->R:Lrm/p0;

    iget-object p1, p1, Lrm/p0;->h:Lrm/n0;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lrm/n0;->f:Lrm/o0;

    iget-object p1, p1, Lrm/o0;->a:Lsn/v;

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/ExoPlaybackException;->a(Lsn/t;)Lcom/google/android/exoplayer2/ExoPlaybackException;

    move-result-object v0

    :cond_0
    const-string p1, "ExoPlayerImplInternal"

    const-string p2, "Playback error"

    invoke-static {p1, p2, v0}, Llo/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v1, v1}, Lrm/z;->a0(ZZ)V

    iget-object p1, p0, Lrm/z;->W:Lrm/v0;

    invoke-virtual {p1, v0}, Lrm/v0;->e(Lcom/google/android/exoplayer2/ExoPlaybackException;)Lrm/v0;

    move-result-object p1

    iput-object p1, p0, Lrm/z;->W:Lrm/v0;

    return-void
.end method

.method public final k(Z)V
    .locals 12

    iget-object v0, p0, Lrm/z;->R:Lrm/p0;

    iget-object v0, v0, Lrm/p0;->j:Lrm/n0;

    if-nez v0, :cond_0

    iget-object v1, p0, Lrm/z;->W:Lrm/v0;

    iget-object v1, v1, Lrm/v0;->b:Lsn/v;

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lrm/n0;->f:Lrm/o0;

    iget-object v1, v1, Lrm/o0;->a:Lsn/v;

    :goto_0
    iget-object v2, p0, Lrm/z;->W:Lrm/v0;

    iget-object v2, v2, Lrm/v0;->k:Lsn/v;

    invoke-virtual {v2, v1}, Lsn/t;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v3, p0, Lrm/z;->W:Lrm/v0;

    invoke-virtual {v3, v1}, Lrm/v0;->a(Lsn/v;)Lrm/v0;

    move-result-object v1

    iput-object v1, p0, Lrm/z;->W:Lrm/v0;

    :cond_1
    iget-object v1, p0, Lrm/z;->W:Lrm/v0;

    if-nez v0, :cond_2

    iget-wide v3, v1, Lrm/v0;->s:J

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lrm/n0;->d()J

    move-result-wide v3

    :goto_1
    iput-wide v3, v1, Lrm/v0;->q:J

    iget-object v1, p0, Lrm/z;->W:Lrm/v0;

    iget-wide v3, v1, Lrm/v0;->q:J

    iget-object v5, p0, Lrm/z;->R:Lrm/p0;

    iget-object v5, v5, Lrm/p0;->j:Lrm/n0;

    const-wide/16 v6, 0x0

    if-nez v5, :cond_3

    goto :goto_2

    :cond_3
    iget-wide v8, p0, Lrm/z;->k0:J

    iget-wide v10, v5, Lrm/n0;->o:J

    sub-long/2addr v8, v10

    sub-long/2addr v3, v8

    invoke-static {v6, v7, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    :goto_2
    iput-wide v6, v1, Lrm/v0;->r:J

    if-eqz v2, :cond_4

    if-eqz p1, :cond_5

    :cond_4
    if-eqz v0, :cond_5

    iget-boolean p1, v0, Lrm/n0;->d:Z

    if-eqz p1, :cond_5

    iget-object p1, v0, Lrm/n0;->n:Lio/x;

    invoke-virtual {p0, p1}, Lrm/z;->d0(Lio/x;)V

    :cond_5
    return-void
.end method

.method public final l(Lrm/o1;Z)V
    .locals 39

    move-object/from16 v1, p0

    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget-object v3, v1, Lrm/z;->j0:Lrm/y;

    iget-object v9, v1, Lrm/z;->R:Lrm/p0;

    iget v4, v1, Lrm/z;->d0:I

    iget-boolean v5, v1, Lrm/z;->e0:Z

    iget-object v2, v1, Lrm/z;->K:Lrm/n1;

    iget-object v8, v1, Lrm/z;->L:Lrm/m1;

    invoke-virtual/range {p1 .. p1}, Lrm/o1;->p()Z

    move-result v6

    const/4 v12, 0x4

    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v6, :cond_0

    new-instance v18, Lb9/j0;

    sget-object v19, Lrm/v0;->t:Lsn/v;

    const/16 v25, 0x1

    const/16 v26, 0x0

    const-wide/16 v20, 0x0

    const-wide v22, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v24, 0x0

    invoke-direct/range {v18 .. v26}, Lb9/j0;-><init>(Ljava/lang/Object;JJZZZ)V

    move-object/from16 v2, p1

    move-object/from16 v8, v18

    const-wide/16 v20, 0x0

    goto/16 :goto_16

    :cond_0
    iget-object v14, v0, Lrm/v0;->b:Lsn/v;

    iget-object v6, v14, Lsn/t;->a:Ljava/lang/Object;

    iget-object v7, v0, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v7}, Lrm/o1;->p()Z

    move-result v19

    if-nez v19, :cond_2

    iget-object v13, v14, Lsn/t;->a:Ljava/lang/Object;

    invoke-virtual {v7, v13, v8}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    move-result-object v7

    iget-boolean v7, v7, Lrm/m1;->F:Z

    if-eqz v7, :cond_1

    goto :goto_0

    :cond_1
    const/4 v13, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v13, 0x1

    :goto_1
    iget-object v7, v0, Lrm/v0;->b:Lsn/v;

    invoke-virtual {v7}, Lsn/t;->a()Z

    move-result v7

    if-nez v7, :cond_4

    if-eqz v13, :cond_3

    goto :goto_2

    :cond_3
    iget-wide v10, v0, Lrm/v0;->s:J

    goto :goto_3

    :cond_4
    :goto_2
    iget-wide v10, v0, Lrm/v0;->c:J

    :goto_3
    if-eqz v3, :cond_8

    move-object v7, v6

    move v6, v5

    move v5, v4

    const/4 v4, 0x1

    move-object v15, v7

    move-object v7, v2

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v8}, Lrm/z;->E(Lrm/o1;Lrm/y;ZIZLrm/n1;Lrm/m1;)Landroid/util/Pair;

    move-result-object v4

    if-nez v4, :cond_5

    invoke-virtual {v2, v6}, Lrm/o1;->a(Z)I

    move-result v3

    move/from16 v23, v3

    move-wide v3, v10

    move-object v6, v15

    const/4 v5, 0x0

    const/4 v15, 0x1

    const/16 v18, 0x0

    goto :goto_6

    :cond_5
    iget-wide v5, v3, Lrm/y;->c:J

    cmp-long v3, v5, v16

    if-nez v3, :cond_6

    iget-object v3, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v2, v3, v8}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    move-result-object v3

    iget v3, v3, Lrm/m1;->y:I

    move-wide/from16 v23, v10

    move-object v6, v15

    const/4 v5, 0x0

    move v15, v3

    goto :goto_4

    :cond_6
    iget-object v6, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v3, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    move-wide/from16 v23, v3

    const/4 v5, 0x1

    const/4 v15, -0x1

    :goto_4
    iget v3, v0, Lrm/v0;->e:I

    if-ne v3, v12, :cond_7

    const/4 v3, 0x1

    goto :goto_5

    :cond_7
    const/4 v3, 0x0

    :goto_5
    move/from16 v18, v5

    move v5, v3

    move-wide/from16 v3, v23

    move/from16 v23, v15

    const/4 v15, 0x0

    :goto_6
    move/from16 v34, v5

    move/from16 v35, v15

    move/from16 v36, v18

    move/from16 v2, v23

    const/4 v15, -0x1

    const-wide/16 v20, 0x0

    move-wide v4, v3

    move-object v3, v7

    goto/16 :goto_c

    :cond_8
    move-object v7, v2

    move-object v15, v6

    move-object/from16 v2, p1

    move v6, v5

    move v5, v4

    iget-object v3, v0, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v3}, Lrm/o1;->p()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-virtual {v2, v6}, Lrm/o1;->a(Z)I

    move-result v3

    move v2, v3

    move-object v3, v7

    :goto_7
    move-wide v4, v10

    move-object v6, v15

    const/4 v15, -0x1

    const-wide/16 v20, 0x0

    :goto_8
    const/16 v34, 0x0

    const/16 v35, 0x0

    :goto_9
    const/16 v36, 0x0

    goto/16 :goto_c

    :cond_9
    invoke-virtual {v2, v15}, Lrm/o1;->b(Ljava/lang/Object;)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_b

    move-object v3, v7

    iget-object v7, v0, Lrm/v0;->a:Lrm/o1;

    move-object v4, v8

    move-object v8, v2

    move-object v2, v3

    move-object v3, v4

    move v4, v5

    move v5, v6

    move-object v6, v15

    invoke-static/range {v2 .. v8}, Lrm/z;->F(Lrm/n1;Lrm/m1;IZLjava/lang/Object;Lrm/o1;Lrm/o1;)Ljava/lang/Object;

    move-result-object v4

    move-object v15, v3

    move-object v3, v2

    move-object v2, v8

    move-object v8, v15

    move-object v15, v6

    move v6, v5

    if-nez v4, :cond_a

    invoke-virtual {v2, v6}, Lrm/o1;->a(Z)I

    move-result v4

    const/4 v7, 0x1

    goto :goto_a

    :cond_a
    invoke-virtual {v2, v4, v8}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    move-result-object v4

    iget v4, v4, Lrm/m1;->y:I

    const/4 v7, 0x0

    :goto_a
    move v2, v4

    move/from16 v35, v7

    move-wide v4, v10

    move-object v6, v15

    const/4 v15, -0x1

    const-wide/16 v20, 0x0

    const/16 v34, 0x0

    goto :goto_9

    :cond_b
    move-object v3, v7

    cmp-long v4, v10, v16

    if-nez v4, :cond_c

    invoke-virtual {v2, v15, v8}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    move-result-object v4

    iget v4, v4, Lrm/m1;->y:I

    move v2, v4

    goto :goto_7

    :cond_c
    if-eqz v13, :cond_e

    iget-object v4, v0, Lrm/v0;->a:Lrm/o1;

    iget-object v5, v14, Lsn/t;->a:Ljava/lang/Object;

    invoke-virtual {v4, v5, v8}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    iget-object v4, v0, Lrm/v0;->a:Lrm/o1;

    iget v5, v8, Lrm/m1;->y:I

    const-wide/16 v6, 0x0

    invoke-virtual {v4, v5, v3, v6, v7}, Lrm/o1;->m(ILrm/n1;J)Lrm/n1;

    move-result-object v4

    iget v4, v4, Lrm/n1;->O:I

    iget-object v5, v0, Lrm/v0;->a:Lrm/o1;

    iget-object v6, v14, Lsn/t;->a:Ljava/lang/Object;

    invoke-virtual {v5, v6}, Lrm/o1;->b(Ljava/lang/Object;)I

    move-result v5

    if-ne v4, v5, :cond_d

    iget-wide v4, v8, Lrm/m1;->E:J

    add-long v6, v10, v4

    invoke-virtual {v2, v15, v8}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    move-result-object v4

    iget v5, v4, Lrm/m1;->y:I

    move-object v4, v8

    const-wide/16 v20, 0x0

    invoke-virtual/range {v2 .. v7}, Lrm/o1;->i(Lrm/n1;Lrm/m1;IJ)Landroid/util/Pair;

    move-result-object v5

    iget-object v6, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v2, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    goto :goto_b

    :cond_d
    const-wide/16 v20, 0x0

    move-wide v4, v10

    move-object v6, v15

    :goto_b
    const/4 v2, -0x1

    const/4 v15, -0x1

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x1

    goto :goto_c

    :cond_e
    const-wide/16 v20, 0x0

    move-wide v4, v10

    move-object v6, v15

    const/4 v2, -0x1

    const/4 v15, -0x1

    goto/16 :goto_8

    :goto_c
    if-eq v2, v15, :cond_f

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    move v5, v2

    move-object v4, v8

    move-object/from16 v2, p1

    invoke-virtual/range {v2 .. v7}, Lrm/o1;->i(Lrm/n1;Lrm/m1;IJ)Landroid/util/Pair;

    move-result-object v3

    iget-object v6, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    move-wide/from16 v32, v16

    goto :goto_d

    :cond_f
    move-object/from16 v2, p1

    move-wide/from16 v32, v4

    :goto_d
    invoke-virtual {v9, v2, v6, v4, v5}, Lrm/p0;->m(Lrm/o1;Ljava/lang/Object;J)Lsn/v;

    move-result-object v3

    iget v7, v3, Lsn/t;->e:I

    if-eq v7, v15, :cond_11

    iget v9, v14, Lsn/t;->e:I

    if-eq v9, v15, :cond_10

    if-lt v7, v9, :cond_10

    goto :goto_e

    :cond_10
    const/4 v7, 0x0

    goto :goto_f

    :cond_11
    :goto_e
    const/4 v7, 0x1

    :goto_f
    iget-object v9, v14, Lsn/t;->a:Ljava/lang/Object;

    invoke-virtual {v9, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_12

    invoke-virtual {v14}, Lsn/t;->a()Z

    move-result v9

    if-nez v9, :cond_12

    invoke-virtual {v3}, Lsn/t;->a()Z

    move-result v9

    if-nez v9, :cond_12

    if-eqz v7, :cond_12

    const/4 v7, 0x1

    goto :goto_10

    :cond_12
    const/4 v7, 0x0

    :goto_10
    invoke-virtual {v2, v6, v8}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    move-result-object v6

    if-nez v13, :cond_14

    cmp-long v9, v10, v32

    if-nez v9, :cond_14

    iget-object v9, v14, Lsn/t;->a:Ljava/lang/Object;

    iget v10, v14, Lsn/t;->c:I

    iget v11, v14, Lsn/t;->b:I

    iget-object v13, v3, Lsn/t;->a:Ljava/lang/Object;

    invoke-virtual {v9, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_13

    goto :goto_12

    :cond_13
    invoke-virtual {v14}, Lsn/t;->a()Z

    move-result v9

    if-eqz v9, :cond_15

    invoke-virtual {v6, v11}, Lrm/m1;->g(I)Z

    move-result v9

    if-eqz v9, :cond_15

    invoke-virtual {v6, v11, v10}, Lrm/m1;->e(II)I

    move-result v9

    if-eq v9, v12, :cond_14

    invoke-virtual {v6, v11, v10}, Lrm/m1;->e(II)I

    move-result v6

    const/4 v9, 0x2

    if-eq v6, v9, :cond_14

    :goto_11
    const/4 v6, 0x1

    goto :goto_13

    :cond_14
    :goto_12
    const/4 v6, 0x0

    goto :goto_13

    :cond_15
    invoke-virtual {v3}, Lsn/t;->a()Z

    move-result v9

    if-eqz v9, :cond_14

    iget v9, v3, Lsn/t;->b:I

    invoke-virtual {v6, v9}, Lrm/m1;->g(I)Z

    move-result v6

    if-eqz v6, :cond_14

    goto :goto_11

    :goto_13
    if-nez v7, :cond_16

    if-eqz v6, :cond_17

    :cond_16
    move-object v3, v14

    :cond_17
    invoke-virtual {v3}, Lsn/t;->a()Z

    move-result v6

    if-eqz v6, :cond_18

    invoke-virtual {v3, v14}, Lsn/t;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_19

    iget-wide v4, v0, Lrm/v0;->s:J

    :cond_18
    move-wide/from16 v30, v4

    goto :goto_15

    :cond_19
    iget-object v0, v3, Lsn/t;->a:Ljava/lang/Object;

    invoke-virtual {v2, v0, v8}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    iget v0, v3, Lsn/t;->c:I

    iget v4, v3, Lsn/t;->b:I

    invoke-virtual {v8, v4}, Lrm/m1;->f(I)I

    move-result v4

    if-ne v0, v4, :cond_1a

    iget-object v0, v8, Lrm/m1;->G:Ltn/b;

    iget-wide v6, v0, Ltn/b;->x:J

    goto :goto_14

    :cond_1a
    move-wide/from16 v6, v20

    :goto_14
    move-wide/from16 v30, v6

    :goto_15
    new-instance v28, Lb9/j0;

    move-object/from16 v29, v3

    invoke-direct/range {v28 .. v36}, Lb9/j0;-><init>(Ljava/lang/Object;JJZZZ)V

    move-object/from16 v8, v28

    :goto_16
    iget-object v0, v8, Lb9/j0;->f:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Lsn/v;

    iget-wide v10, v8, Lb9/j0;->b:J

    iget-boolean v6, v8, Lb9/j0;->c:Z

    iget-wide v13, v8, Lb9/j0;->a:J

    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget-object v0, v0, Lrm/v0;->b:Lsn/v;

    invoke-virtual {v0, v9}, Lsn/t;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget-wide v3, v0, Lrm/v0;->s:J

    cmp-long v0, v13, v3

    if-eqz v0, :cond_1b

    goto :goto_17

    :cond_1b
    const/4 v15, 0x0

    goto :goto_18

    :cond_1c
    :goto_17
    const/4 v15, 0x1

    :goto_18
    const/16 v18, 0x3

    :try_start_0
    iget-boolean v0, v8, Lb9/j0;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_a

    if-eqz v0, :cond_1e

    :try_start_1
    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget v0, v0, Lrm/v0;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v4, 0x1

    if-eq v0, v4, :cond_1d

    :try_start_2
    invoke-virtual {v1, v12}, Lrm/z;->W(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1d
    const/4 v5, 0x0

    goto :goto_19

    :catchall_0
    move-exception v0

    move-wide/from16 v37, v10

    move-object v11, v2

    move-object v2, v9

    move-wide/from16 v9, v37

    move/from16 v19, v4

    const/4 v12, 0x0

    goto/16 :goto_2e

    :goto_19
    :try_start_3
    invoke-virtual {v1, v5, v5, v5, v4}, Lrm/z;->A(ZZZZ)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1b

    :catchall_1
    move-exception v0

    :goto_1a
    move-wide/from16 v37, v10

    move-object v11, v2

    move-object v2, v9

    move-wide/from16 v9, v37

    move/from16 v19, v4

    move v12, v5

    goto/16 :goto_2e

    :catchall_2
    move-exception v0

    const/4 v4, 0x1

    const/4 v5, 0x0

    goto :goto_1a

    :cond_1e
    const/4 v4, 0x1

    const/4 v5, 0x0

    :goto_1b
    if-nez v15, :cond_26

    :try_start_4
    iget-object v2, v1, Lrm/z;->R:Lrm/p0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_7

    move/from16 v19, v4

    move/from16 v27, v5

    :try_start_5
    iget-wide v4, v1, Lrm/z;->k0:J
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    :try_start_6
    iget-object v0, v1, Lrm/z;->w:[Lrm/d;

    iget-object v6, v2, Lrm/p0;->i:Lrm/n0;

    if-nez v6, :cond_1f

    move-object/from16 v3, p1

    move-wide/from16 v6, v20

    :goto_1c
    move/from16 v12, v27

    goto/16 :goto_20

    :cond_1f
    move-wide/from16 v20, v4

    iget-wide v3, v6, Lrm/n0;->o:J

    iget-boolean v5, v6, Lrm/n0;->d:Z

    if-nez v5, :cond_20

    move-wide v6, v3

    move-wide/from16 v4, v20

    move/from16 v12, v27

    move-object/from16 v3, p1

    goto :goto_20

    :cond_20
    move-wide v4, v3

    move/from16 v3, v27

    :goto_1d
    array-length v7, v0

    if-ge v3, v7, :cond_24

    aget-object v7, v0, v3

    invoke-static {v7}, Lrm/z;->q(Lrm/d;)Z

    move-result v7

    if-eqz v7, :cond_23

    aget-object v7, v0, v3

    iget-object v12, v7, Lrm/d;->G:Lsn/r0;

    move-object/from16 v25, v0

    iget-object v0, v6, Lrm/n0;->c:[Lsn/r0;

    aget-object v0, v0, v3

    if-eq v12, v0, :cond_21

    :goto_1e
    move-object v0, v2

    move v12, v3

    goto :goto_1f

    :cond_21
    move-object v0, v2

    move v12, v3

    iget-wide v2, v7, Lrm/d;->J:J

    const-wide/high16 v28, -0x8000000000000000L

    cmp-long v7, v2, v28

    if-nez v7, :cond_22

    move-object/from16 v3, p1

    move-object v2, v0

    move-wide/from16 v4, v20

    move/from16 v12, v27

    move-wide/from16 v6, v28

    goto :goto_20

    :cond_22
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    goto :goto_1f

    :cond_23
    move-object/from16 v25, v0

    goto :goto_1e

    :goto_1f
    add-int/lit8 v3, v12, 0x1

    move-object v2, v0

    move-object/from16 v0, v25

    const/4 v12, 0x4

    goto :goto_1d

    :cond_24
    move-object/from16 v3, p1

    move-wide v6, v4

    move-wide/from16 v4, v20

    goto :goto_1c

    :goto_20
    :try_start_7
    invoke-virtual/range {v2 .. v7}, Lrm/p0;->o(Lrm/o1;JJ)Z

    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    move-object v7, v3

    if-nez v0, :cond_25

    :try_start_8
    invoke-virtual {v1, v12}, Lrm/z;->H(Z)V

    :cond_25
    move-object v2, v9

    goto/16 :goto_27

    :catchall_3
    move-exception v0

    :goto_21
    move-object v2, v9

    :goto_22
    move-wide v9, v10

    move-object v11, v7

    goto/16 :goto_2e

    :catchall_4
    move-exception v0

    move-object v7, v3

    goto :goto_21

    :catchall_5
    move-exception v0

    goto :goto_23

    :catchall_6
    move-exception v0

    :goto_23
    move-object/from16 v7, p1

    move/from16 v12, v27

    goto :goto_21

    :catchall_7
    move-exception v0

    move-object/from16 v7, p1

    move/from16 v19, v4

    move v12, v5

    goto :goto_21

    :cond_26
    move-object v7, v2

    move/from16 v19, v4

    move v12, v5

    invoke-virtual {v7}, Lrm/o1;->p()Z

    move-result v0

    if-nez v0, :cond_25

    iget-object v0, v1, Lrm/z;->R:Lrm/p0;

    iget-object v0, v0, Lrm/p0;->h:Lrm/n0;

    :goto_24
    if-eqz v0, :cond_28

    iget-object v2, v0, Lrm/n0;->f:Lrm/o0;

    iget-object v2, v2, Lrm/o0;->a:Lsn/v;

    invoke-virtual {v2, v9}, Lsn/t;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_27

    iget-object v2, v1, Lrm/z;->R:Lrm/p0;

    iget-object v3, v0, Lrm/n0;->f:Lrm/o0;

    invoke-virtual {v2, v7, v3}, Lrm/p0;->g(Lrm/o1;Lrm/o0;)Lrm/o0;

    move-result-object v2

    iput-object v2, v0, Lrm/n0;->f:Lrm/o0;

    invoke-virtual {v0}, Lrm/n0;->h()V

    :cond_27
    iget-object v0, v0, Lrm/n0;->l:Lrm/n0;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    goto :goto_24

    :cond_28
    :try_start_9
    iget-object v0, v1, Lrm/z;->R:Lrm/p0;

    iget-object v2, v0, Lrm/p0;->h:Lrm/n0;

    iget-object v0, v0, Lrm/p0;->i:Lrm/n0;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    if-eq v2, v0, :cond_29

    move/from16 v5, v19

    :goto_25
    move-object v2, v9

    move-wide v3, v13

    goto :goto_26

    :cond_29
    move v5, v12

    goto :goto_25

    :goto_26
    :try_start_a
    invoke-virtual/range {v1 .. v6}, Lrm/z;->J(Lsn/v;JZZ)J

    move-result-wide v13
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    goto :goto_27

    :catchall_8
    move-exception v0

    move-wide v13, v3

    goto :goto_22

    :catchall_9
    move-exception v0

    goto :goto_21

    :goto_27
    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget-object v4, v0, Lrm/v0;->a:Lrm/o1;

    iget-object v5, v0, Lrm/v0;->b:Lsn/v;

    iget-boolean v0, v8, Lb9/j0;->e:Z

    if-eqz v0, :cond_2a

    move-object v3, v2

    move-object v2, v7

    move-wide v6, v13

    goto :goto_28

    :cond_2a
    move-object v3, v2

    move-object v2, v7

    move-wide/from16 v6, v16

    :goto_28
    invoke-virtual/range {v1 .. v7}, Lrm/z;->f0(Lrm/o1;Lsn/v;Lrm/o1;Lsn/v;J)V

    if-nez v15, :cond_2c

    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget-wide v4, v0, Lrm/v0;->c:J

    cmp-long v0, v10, v4

    if-eqz v0, :cond_2b

    goto :goto_29

    :cond_2b
    move-object v11, v2

    goto :goto_2d

    :cond_2c
    :goto_29
    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget-object v4, v0, Lrm/v0;->b:Lsn/v;

    iget-object v4, v4, Lsn/t;->a:Ljava/lang/Object;

    iget-object v0, v0, Lrm/v0;->a:Lrm/o1;

    if-eqz v15, :cond_2d

    if-eqz p2, :cond_2d

    invoke-virtual {v0}, Lrm/o1;->p()Z

    move-result v5

    if-nez v5, :cond_2d

    iget-object v5, v1, Lrm/z;->L:Lrm/m1;

    invoke-virtual {v0, v4, v5}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    move-result-object v0

    iget-boolean v0, v0, Lrm/m1;->F:Z

    if-nez v0, :cond_2d

    move/from16 v9, v19

    goto :goto_2a

    :cond_2d
    move v9, v12

    :goto_2a
    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget-wide v7, v0, Lrm/v0;->d:J

    invoke-virtual {v2, v4}, Lrm/o1;->b(Ljava/lang/Object;)I

    move-result v0

    const/4 v15, -0x1

    if-ne v0, v15, :cond_2e

    move-wide v5, v10

    const/4 v10, 0x4

    :goto_2b
    move-object v11, v2

    move-object v2, v3

    move-wide v3, v13

    goto :goto_2c

    :cond_2e
    move-wide v5, v10

    move/from16 v10, v18

    goto :goto_2b

    :goto_2c
    invoke-virtual/range {v1 .. v10}, Lrm/z;->o(Lsn/v;JJJZI)Lrm/v0;

    move-result-object v0

    iput-object v0, v1, Lrm/z;->W:Lrm/v0;

    :goto_2d
    invoke-virtual {v1}, Lrm/z;->B()V

    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    iget-object v0, v0, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v1, v11, v0}, Lrm/z;->D(Lrm/o1;Lrm/o1;)V

    iget-object v0, v1, Lrm/z;->W:Lrm/v0;

    invoke-virtual {v0, v11}, Lrm/v0;->h(Lrm/o1;)Lrm/v0;

    move-result-object v0

    iput-object v0, v1, Lrm/z;->W:Lrm/v0;

    invoke-virtual {v11}, Lrm/o1;->p()Z

    move-result v0

    if-nez v0, :cond_2f

    const/4 v7, 0x0

    iput-object v7, v1, Lrm/z;->j0:Lrm/y;

    :cond_2f
    invoke-virtual {v1, v12}, Lrm/z;->k(Z)V

    return-void

    :catchall_a
    move-exception v0

    move-wide/from16 v37, v10

    move-object v11, v2

    move-object v2, v9

    move-wide/from16 v9, v37

    const/4 v12, 0x0

    const/16 v19, 0x1

    :goto_2e
    iget-object v3, v1, Lrm/z;->W:Lrm/v0;

    iget-object v4, v3, Lrm/v0;->a:Lrm/o1;

    iget-object v5, v3, Lrm/v0;->b:Lsn/v;

    iget-boolean v3, v8, Lb9/j0;->e:Z

    if-eqz v3, :cond_30

    move-wide v6, v13

    :goto_2f
    move-object v3, v2

    move-object v2, v11

    goto :goto_30

    :cond_30
    move-wide/from16 v6, v16

    goto :goto_2f

    :goto_30
    invoke-virtual/range {v1 .. v7}, Lrm/z;->f0(Lrm/o1;Lsn/v;Lrm/o1;Lsn/v;J)V

    move-object v11, v2

    move-object v2, v3

    if-nez v15, :cond_31

    iget-object v3, v1, Lrm/z;->W:Lrm/v0;

    iget-wide v3, v3, Lrm/v0;->c:J

    cmp-long v3, v9, v3

    if-eqz v3, :cond_34

    :cond_31
    iget-object v3, v1, Lrm/z;->W:Lrm/v0;

    iget-object v4, v3, Lrm/v0;->b:Lsn/v;

    iget-object v4, v4, Lsn/t;->a:Ljava/lang/Object;

    iget-object v3, v3, Lrm/v0;->a:Lrm/o1;

    if-eqz v15, :cond_32

    if-eqz p2, :cond_32

    invoke-virtual {v3}, Lrm/o1;->p()Z

    move-result v5

    if-nez v5, :cond_32

    iget-object v5, v1, Lrm/z;->L:Lrm/m1;

    invoke-virtual {v3, v4, v5}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    move-result-object v3

    iget-boolean v3, v3, Lrm/m1;->F:Z

    if-nez v3, :cond_32

    move/from16 v7, v19

    goto :goto_31

    :cond_32
    move v7, v12

    :goto_31
    iget-object v3, v1, Lrm/z;->W:Lrm/v0;

    iget-wide v5, v3, Lrm/v0;->d:J

    invoke-virtual {v11, v4}, Lrm/o1;->b(Ljava/lang/Object;)I

    move-result v3

    const/4 v15, -0x1

    if-ne v3, v15, :cond_33

    move-wide v3, v9

    const/4 v10, 0x4

    :goto_32
    move v9, v7

    move-wide v7, v5

    move-wide v5, v3

    move-wide v3, v13

    goto :goto_33

    :cond_33
    move-wide v3, v9

    move/from16 v10, v18

    goto :goto_32

    :goto_33
    invoke-virtual/range {v1 .. v10}, Lrm/z;->o(Lsn/v;JJJZI)Lrm/v0;

    move-result-object v2

    iput-object v2, v1, Lrm/z;->W:Lrm/v0;

    :cond_34
    invoke-virtual {v1}, Lrm/z;->B()V

    iget-object v2, v1, Lrm/z;->W:Lrm/v0;

    iget-object v2, v2, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v1, v11, v2}, Lrm/z;->D(Lrm/o1;Lrm/o1;)V

    iget-object v2, v1, Lrm/z;->W:Lrm/v0;

    invoke-virtual {v2, v11}, Lrm/v0;->h(Lrm/o1;)Lrm/v0;

    move-result-object v2

    iput-object v2, v1, Lrm/z;->W:Lrm/v0;

    invoke-virtual {v11}, Lrm/o1;->p()Z

    move-result v2

    if-nez v2, :cond_35

    const/4 v7, 0x0

    iput-object v7, v1, Lrm/z;->j0:Lrm/y;

    :cond_35
    invoke-virtual {v1, v12}, Lrm/z;->k(Z)V

    throw v0
.end method

.method public final m(Lsn/s;)V
    .locals 12

    iget-object v0, p0, Lrm/z;->R:Lrm/p0;

    iget-object v1, v0, Lrm/p0;->j:Lrm/n0;

    if-eqz v1, :cond_2

    iget-object v2, v1, Lrm/n0;->a:Ljava/lang/Object;

    if-ne v2, p1, :cond_2

    iget-object p1, p0, Lrm/z;->N:Lb9/l;

    invoke-virtual {p1}, Lb9/l;->b()Lrm/w0;

    move-result-object p1

    iget p1, p1, Lrm/w0;->w:F

    iget-object v2, p0, Lrm/z;->W:Lrm/v0;

    iget-object v2, v2, Lrm/v0;->a:Lrm/o1;

    const/4 v3, 0x1

    iput-boolean v3, v1, Lrm/n0;->d:Z

    iget-object v3, v1, Lrm/n0;->a:Ljava/lang/Object;

    invoke-interface {v3}, Lsn/s;->k()Lsn/x0;

    move-result-object v3

    iput-object v3, v1, Lrm/n0;->m:Lsn/x0;

    invoke-virtual {v1, p1, v2}, Lrm/n0;->g(FLrm/o1;)Lio/x;

    move-result-object v2

    iget-object p1, v1, Lrm/n0;->f:Lrm/o0;

    iget-wide v3, p1, Lrm/o0;->b:J

    iget-wide v5, p1, Lrm/o0;->e:J

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v5, v7

    if-eqz p1, :cond_0

    cmp-long p1, v3, v5

    if-ltz p1, :cond_0

    const-wide/16 v3, 0x1

    sub-long/2addr v5, v3

    const-wide/16 v3, 0x0

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    :cond_0
    iget-object p1, v1, Lrm/n0;->i:[Lrm/d;

    array-length p1, p1

    new-array v6, p1, [Z

    const/4 v5, 0x0

    invoke-virtual/range {v1 .. v6}, Lrm/n0;->a(Lio/x;JZ[Z)J

    move-result-wide v2

    iget-wide v4, v1, Lrm/n0;->o:J

    iget-object p1, v1, Lrm/n0;->f:Lrm/o0;

    iget-wide v6, p1, Lrm/o0;->b:J

    sub-long/2addr v6, v2

    add-long/2addr v6, v4

    iput-wide v6, v1, Lrm/n0;->o:J

    invoke-virtual {p1, v2, v3}, Lrm/o0;->b(J)Lrm/o0;

    move-result-object p1

    iput-object p1, v1, Lrm/n0;->f:Lrm/o0;

    iget-object p1, v1, Lrm/n0;->n:Lio/x;

    invoke-virtual {p0, p1}, Lrm/z;->d0(Lio/x;)V

    iget-object p1, v0, Lrm/p0;->h:Lrm/n0;

    if-ne v1, p1, :cond_1

    iget-object p1, v1, Lrm/n0;->f:Lrm/o0;

    iget-wide v2, p1, Lrm/o0;->b:J

    invoke-virtual {p0, v2, v3}, Lrm/z;->C(J)V

    iget-object p1, p0, Lrm/z;->w:[Lrm/d;

    array-length p1, p1

    new-array p1, p1, [Z

    invoke-virtual {p0, p1}, Lrm/z;->e([Z)V

    iget-object p1, p0, Lrm/z;->W:Lrm/v0;

    iget-object v3, p1, Lrm/v0;->b:Lsn/v;

    iget-object v0, v1, Lrm/n0;->f:Lrm/o0;

    iget-wide v4, v0, Lrm/o0;->b:J

    iget-wide v6, p1, Lrm/v0;->c:J

    const/4 v10, 0x0

    const/4 v11, 0x5

    move-wide v8, v4

    move-object v2, p0

    invoke-virtual/range {v2 .. v11}, Lrm/z;->o(Lsn/v;JJJZI)Lrm/v0;

    move-result-object p1

    iput-object p1, v2, Lrm/z;->W:Lrm/v0;

    goto :goto_0

    :cond_1
    move-object v2, p0

    :goto_0
    invoke-virtual {p0}, Lrm/z;->s()V

    return-void

    :cond_2
    move-object v2, p0

    return-void
.end method

.method public final n(Lrm/w0;FZZ)V
    .locals 4

    if-eqz p3, :cond_1

    if-eqz p4, :cond_0

    iget-object p3, p0, Lrm/z;->X:Lrm/x;

    const/4 p4, 0x1

    invoke-virtual {p3, p4}, Lrm/x;->a(I)V

    :cond_0
    iget-object p3, p0, Lrm/z;->W:Lrm/v0;

    invoke-virtual {p3, p1}, Lrm/v0;->f(Lrm/w0;)Lrm/v0;

    move-result-object p3

    iput-object p3, p0, Lrm/z;->W:Lrm/v0;

    :cond_1
    iget p3, p1, Lrm/w0;->w:F

    iget-object p4, p0, Lrm/z;->R:Lrm/p0;

    iget-object p4, p4, Lrm/p0;->h:Lrm/n0;

    :goto_0
    const/4 v0, 0x0

    if-eqz p4, :cond_4

    iget-object v1, p4, Lrm/n0;->n:Lio/x;

    iget-object v1, v1, Lio/x;->c:[Lio/o;

    array-length v2, v1

    :goto_1
    if-ge v0, v2, :cond_3

    aget-object v3, v1, v0

    if-eqz v3, :cond_2

    invoke-interface {v3, p3}, Lio/o;->f(F)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    iget-object p4, p4, Lrm/n0;->l:Lrm/n0;

    goto :goto_0

    :cond_4
    iget-object p3, p0, Lrm/z;->w:[Lrm/d;

    array-length p4, p3

    :goto_2
    if-ge v0, p4, :cond_6

    aget-object v1, p3, v0

    if-eqz v1, :cond_5

    iget v2, p1, Lrm/w0;->w:F

    invoke-virtual {v1, p2, v2}, Lrm/d;->w(FF)V

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_6
    return-void
.end method

.method public final o(Lsn/v;JJJZI)Lrm/v0;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-wide/from16 v5, p4

    move/from16 v1, p9

    iget-boolean v3, v0, Lrm/z;->m0:Z

    const/4 v7, 0x0

    if-nez v3, :cond_1

    iget-object v3, v0, Lrm/z;->W:Lrm/v0;

    iget-wide v8, v3, Lrm/v0;->s:J

    cmp-long v3, p2, v8

    if-nez v3, :cond_1

    iget-object v3, v0, Lrm/z;->W:Lrm/v0;

    iget-object v3, v3, Lrm/v0;->b:Lsn/v;

    invoke-virtual {v2, v3}, Lsn/t;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    move v3, v7

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v3, 0x1

    :goto_1
    iput-boolean v3, v0, Lrm/z;->m0:Z

    invoke-virtual {v0}, Lrm/z;->B()V

    iget-object v3, v0, Lrm/z;->W:Lrm/v0;

    iget-object v8, v3, Lrm/v0;->h:Lsn/x0;

    iget-object v9, v3, Lrm/v0;->i:Lio/x;

    iget-object v10, v3, Lrm/v0;->j:Ljava/util/List;

    iget-object v11, v0, Lrm/z;->S:Lb9/b1;

    iget-boolean v11, v11, Lb9/b1;->g:Z

    if-eqz v11, :cond_9

    iget-object v3, v0, Lrm/z;->R:Lrm/p0;

    iget-object v3, v3, Lrm/p0;->h:Lrm/n0;

    if-nez v3, :cond_2

    sget-object v8, Lsn/x0;->z:Lsn/x0;

    goto :goto_2

    :cond_2
    iget-object v8, v3, Lrm/n0;->m:Lsn/x0;

    :goto_2
    if-nez v3, :cond_3

    iget-object v9, v0, Lrm/z;->E:Lio/x;

    goto :goto_3

    :cond_3
    iget-object v9, v3, Lrm/n0;->n:Lio/x;

    :goto_3
    iget-object v10, v9, Lio/x;->c:[Lio/o;

    new-instance v11, Lzr/d0;

    const/4 v12, 0x4

    invoke-direct {v11, v12}, Lzr/a0;-><init>(I)V

    array-length v12, v10

    move v13, v7

    move v14, v13

    :goto_4
    if-ge v13, v12, :cond_6

    aget-object v15, v10, v13

    if-eqz v15, :cond_5

    invoke-interface {v15, v7}, Lio/o;->d(I)Lrm/c0;

    move-result-object v15

    iget-object v15, v15, Lrm/c0;->J:Lin/c;

    if-nez v15, :cond_4

    new-instance v15, Lin/c;

    new-array v4, v7, [Lin/b;

    invoke-direct {v15, v4}, Lin/c;-><init>([Lin/b;)V

    invoke-virtual {v11, v15}, Lzr/a0;->a(Ljava/lang/Object;)V

    goto :goto_5

    :cond_4
    invoke-virtual {v11, v15}, Lzr/a0;->a(Ljava/lang/Object;)V

    const/4 v14, 0x1

    :cond_5
    :goto_5
    add-int/lit8 v13, v13, 0x1

    goto :goto_4

    :cond_6
    if-eqz v14, :cond_7

    invoke-virtual {v11}, Lzr/d0;->f()Lzr/w0;

    move-result-object v4

    :goto_6
    move-object v10, v4

    goto :goto_7

    :cond_7
    sget-object v4, Lzr/g0;->x:Lzr/e0;

    sget-object v4, Lzr/w0;->E:Lzr/w0;

    goto :goto_6

    :goto_7
    if-eqz v3, :cond_8

    iget-object v4, v3, Lrm/n0;->f:Lrm/o0;

    iget-wide v11, v4, Lrm/o0;->c:J

    cmp-long v11, v11, v5

    if-eqz v11, :cond_8

    invoke-virtual {v4, v5, v6}, Lrm/o0;->a(J)Lrm/o0;

    move-result-object v4

    iput-object v4, v3, Lrm/n0;->f:Lrm/o0;

    :cond_8
    :goto_8
    move-object v11, v8

    move-object v12, v9

    move-object v13, v10

    goto :goto_9

    :cond_9
    iget-object v3, v3, Lrm/v0;->b:Lsn/v;

    invoke-virtual {v2, v3}, Lsn/t;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    sget-object v8, Lsn/x0;->z:Lsn/x0;

    iget-object v9, v0, Lrm/z;->E:Lio/x;

    sget-object v10, Lzr/w0;->E:Lzr/w0;

    goto :goto_8

    :goto_9
    if-eqz p8, :cond_c

    iget-object v3, v0, Lrm/z;->X:Lrm/x;

    iget-boolean v4, v3, Lrm/x;->d:Z

    if-eqz v4, :cond_b

    iget v4, v3, Lrm/x;->e:I

    const/4 v8, 0x5

    if-eq v4, v8, :cond_b

    if-ne v1, v8, :cond_a

    const/4 v4, 0x1

    goto :goto_a

    :cond_a
    move v4, v7

    :goto_a
    invoke-static {v4}, Llo/a;->e(Z)V

    goto :goto_b

    :cond_b
    const/4 v4, 0x1

    iput-boolean v4, v3, Lrm/x;->a:Z

    iput-boolean v4, v3, Lrm/x;->d:Z

    iput v1, v3, Lrm/x;->e:I

    :cond_c
    :goto_b
    iget-object v1, v0, Lrm/z;->W:Lrm/v0;

    iget-wide v3, v1, Lrm/v0;->q:J

    iget-object v7, v0, Lrm/z;->R:Lrm/p0;

    iget-object v7, v7, Lrm/p0;->j:Lrm/n0;

    if-nez v7, :cond_d

    const-wide/16 v9, 0x0

    :goto_c
    move-wide/from16 v3, p2

    move-wide/from16 v7, p6

    goto :goto_d

    :cond_d
    iget-wide v14, v0, Lrm/z;->k0:J

    iget-wide v8, v7, Lrm/n0;->o:J

    sub-long/2addr v14, v8

    sub-long/2addr v3, v14

    const-wide/16 v7, 0x0

    invoke-static {v7, v8, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    move-wide v9, v8

    goto :goto_c

    :goto_d
    invoke-virtual/range {v1 .. v13}, Lrm/v0;->b(Lsn/v;JJJJLsn/x0;Lio/x;Ljava/util/List;)Lrm/v0;

    move-result-object v1

    return-object v1
.end method

.method public final p()Z
    .locals 4

    iget-object v0, p0, Lrm/z;->R:Lrm/p0;

    iget-object v0, v0, Lrm/p0;->j:Lrm/n0;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v1, v0, Lrm/n0;->d:Z

    if-nez v1, :cond_1

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_1
    iget-object v0, v0, Lrm/n0;->a:Ljava/lang/Object;

    invoke-interface {v0}, Lsn/t0;->d()J

    move-result-wide v0

    :goto_0
    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    :goto_1
    const/4 v0, 0x0

    return v0

    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public final r()Z
    .locals 5

    iget-object v0, p0, Lrm/z;->R:Lrm/p0;

    iget-object v0, v0, Lrm/p0;->h:Lrm/n0;

    iget-object v1, v0, Lrm/n0;->f:Lrm/o0;

    iget-wide v1, v1, Lrm/o0;->e:J

    iget-boolean v0, v0, Lrm/n0;->d:Z

    if-eqz v0, :cond_1

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v1, v3

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrm/z;->W:Lrm/v0;

    iget-wide v3, v0, Lrm/v0;->s:J

    cmp-long v0, v3, v1

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Lrm/z;->X()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final s()V
    .locals 14

    iget-object v0, p0, Lrm/z;->R:Lrm/p0;

    invoke-virtual {p0}, Lrm/z;->p()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    move v1, v3

    goto/16 :goto_4

    :cond_0
    iget-object v1, v0, Lrm/p0;->j:Lrm/n0;

    iget-boolean v4, v1, Lrm/n0;->d:Z

    const-wide/16 v5, 0x0

    if-nez v4, :cond_1

    move-wide v7, v5

    goto :goto_0

    :cond_1
    iget-object v1, v1, Lrm/n0;->a:Ljava/lang/Object;

    invoke-interface {v1}, Lsn/t0;->d()J

    move-result-wide v7

    :goto_0
    iget-object v1, p0, Lrm/z;->R:Lrm/p0;

    iget-object v1, v1, Lrm/p0;->j:Lrm/n0;

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    iget-wide v9, p0, Lrm/z;->k0:J

    iget-wide v11, v1, Lrm/n0;->o:J

    sub-long/2addr v9, v11

    sub-long/2addr v7, v9

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    :goto_1
    iget-object v1, p0, Lrm/z;->F:Lrm/h;

    iget-object v4, p0, Lrm/z;->N:Lb9/l;

    invoke-virtual {v4}, Lb9/l;->b()Lrm/w0;

    move-result-object v4

    iget v4, v4, Lrm/w0;->w:F

    iget-wide v7, v1, Lrm/h;->c:J

    iget-object v9, v1, Lrm/h;->a:Lko/o;

    monitor-enter v9

    :try_start_0
    iget v10, v9, Lko/o;->e:I

    iget v11, v9, Lko/o;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    mul-int/2addr v10, v11

    monitor-exit v9

    iget v9, v1, Lrm/h;->h:I

    if-lt v10, v9, :cond_3

    move v9, v2

    goto :goto_2

    :cond_3
    move v9, v3

    :goto_2
    iget-wide v10, v1, Lrm/h;->b:J

    const/high16 v12, 0x3f800000    # 1.0f

    cmpl-float v12, v4, v12

    if-lez v12, :cond_4

    invoke-static {v4, v10, v11}, Llo/y;->p(FJ)J

    move-result-wide v10

    invoke-static {v10, v11, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v10

    :cond_4
    const-wide/32 v12, 0x7a120

    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v10

    cmp-long v4, v5, v10

    if-gez v4, :cond_5

    xor-int/lit8 v4, v9, 0x1

    iput-boolean v4, v1, Lrm/h;->i:Z

    if-eqz v9, :cond_7

    cmp-long v4, v5, v12

    if-gez v4, :cond_7

    const-string v4, "DefaultLoadControl"

    const-string v5, "Target buffer size reached with less than 500ms of buffered media data."

    invoke-static {v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :cond_5
    cmp-long v4, v5, v7

    if-gez v4, :cond_6

    if-eqz v9, :cond_7

    :cond_6
    iput-boolean v3, v1, Lrm/h;->i:Z

    :cond_7
    :goto_3
    iget-boolean v1, v1, Lrm/h;->i:Z

    :goto_4
    iput-boolean v1, p0, Lrm/z;->c0:Z

    if-eqz v1, :cond_9

    iget-object v0, v0, Lrm/p0;->j:Lrm/n0;

    iget-wide v4, p0, Lrm/z;->k0:J

    iget-object v1, v0, Lrm/n0;->l:Lrm/n0;

    if-nez v1, :cond_8

    goto :goto_5

    :cond_8
    move v2, v3

    :goto_5
    invoke-static {v2}, Llo/a;->i(Z)V

    iget-wide v1, v0, Lrm/n0;->o:J

    sub-long/2addr v4, v1

    iget-object v0, v0, Lrm/n0;->a:Ljava/lang/Object;

    invoke-interface {v0, v4, v5}, Lsn/t0;->u(J)Z

    :cond_9
    invoke-virtual {p0}, Lrm/z;->c0()V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final t()V
    .locals 5

    iget-object v0, p0, Lrm/z;->X:Lrm/x;

    iget-object v1, p0, Lrm/z;->W:Lrm/v0;

    iget-boolean v2, v0, Lrm/x;->a:Z

    iget-object v3, v0, Lrm/x;->b:Lrm/v0;

    if-eq v3, v1, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    or-int/2addr v2, v3

    iput-boolean v2, v0, Lrm/x;->a:Z

    iput-object v1, v0, Lrm/x;->b:Lrm/v0;

    if-eqz v2, :cond_1

    iget-object v1, p0, Lrm/z;->Q:Lrm/m;

    iget-object v1, v1, Lrm/m;->w:Lrm/u;

    iget-object v2, v1, Lrm/u;->J:Llo/v;

    new-instance v3, Lr5/b;

    const/4 v4, 0x7

    invoke-direct {v3, v4, v1, v0}, Lr5/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, v2, Llo/v;->a:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    new-instance v0, Lrm/x;

    iget-object v1, p0, Lrm/z;->W:Lrm/v0;

    invoke-direct {v0, v1}, Lrm/x;-><init>(Lrm/v0;)V

    iput-object v0, p0, Lrm/z;->X:Lrm/x;

    :cond_1
    return-void
.end method

.method public final u()V
    .locals 2

    iget-object v0, p0, Lrm/z;->S:Lb9/b1;

    invoke-virtual {v0}, Lb9/b1;->c()Lrm/o1;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lrm/z;->l(Lrm/o1;Z)V

    return-void
.end method

.method public final v()V
    .locals 2

    iget-object v0, p0, Lrm/z;->X:Lrm/x;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lrm/x;->a(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final w()V
    .locals 7

    iget-object v0, p0, Lrm/z;->X:Lrm/x;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lrm/x;->a(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0, v0, v1}, Lrm/z;->A(ZZZZ)V

    iget-object v2, p0, Lrm/z;->F:Lrm/h;

    invoke-virtual {v2, v0}, Lrm/h;->b(Z)V

    iget-object v2, p0, Lrm/z;->W:Lrm/v0;

    iget-object v2, v2, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v2}, Lrm/o1;->p()Z

    move-result v2

    const/4 v3, 0x2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    invoke-virtual {p0, v2}, Lrm/z;->W(I)V

    iget-object v2, p0, Lrm/z;->G:Lko/e;

    check-cast v2, Lko/q;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, p0, Lrm/z;->S:Lb9/b1;

    iget-object v5, v4, Lb9/b1;->b:Ljava/util/ArrayList;

    iget-boolean v6, v4, Lb9/b1;->g:Z

    xor-int/2addr v6, v1

    invoke-static {v6}, Llo/a;->i(Z)V

    iput-object v2, v4, Lb9/b1;->m:Ljava/lang/Object;

    :goto_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lrm/t0;

    invoke-virtual {v4, v2}, Lb9/b1;->i(Lrm/t0;)V

    iget-object v6, v4, Lb9/b1;->f:Ljava/util/HashSet;

    invoke-virtual {v6, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    iput-boolean v1, v4, Lb9/b1;->g:Z

    iget-object v0, p0, Lrm/z;->H:Llo/v;

    invoke-virtual {v0, v3}, Llo/v;->c(I)Z

    return-void
.end method

.method public final x()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0, v1, v0}, Lrm/z;->A(ZZZZ)V

    iget-object v0, p0, Lrm/z;->F:Lrm/h;

    invoke-virtual {v0, v1}, Lrm/h;->b(Z)V

    invoke-virtual {p0, v1}, Lrm/z;->W(I)V

    iget-object v0, p0, Lrm/z;->I:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    monitor-enter p0

    :try_start_0
    iput-boolean v1, p0, Lrm/z;->Y:Z

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final y(IILsn/u0;)V
    .locals 4

    iget-object v0, p0, Lrm/z;->X:Lrm/x;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lrm/x;->a(I)V

    iget-object v0, p0, Lrm/z;->S:Lb9/b1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    if-ltz p1, :cond_0

    if-gt p1, p2, :cond_0

    iget-object v3, v0, Lb9/b1;->b:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-gt p2, v3, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-static {v1}, Llo/a;->e(Z)V

    iput-object p3, v0, Lb9/b1;->l:Ljava/lang/Object;

    invoke-virtual {v0, p1, p2}, Lb9/b1;->l(II)V

    invoke-virtual {v0}, Lb9/b1;->c()Lrm/o1;

    move-result-object p1

    invoke-virtual {p0, p1, v2}, Lrm/z;->l(Lrm/o1;Z)V

    return-void
.end method

.method public final z()V
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lrm/z;->N:Lb9/l;

    invoke-virtual {v1}, Lb9/l;->b()Lrm/w0;

    move-result-object v1

    iget v1, v1, Lrm/w0;->w:F

    iget-object v2, v0, Lrm/z;->R:Lrm/p0;

    iget-object v3, v2, Lrm/p0;->h:Lrm/n0;

    iget-object v2, v2, Lrm/p0;->i:Lrm/n0;

    const/4 v10, 0x1

    move-object v4, v3

    move v3, v10

    :goto_0
    if-eqz v4, :cond_d

    iget-boolean v5, v4, Lrm/n0;->d:Z

    if-nez v5, :cond_0

    goto/16 :goto_7

    :cond_0
    iget-object v5, v0, Lrm/z;->W:Lrm/v0;

    iget-object v5, v5, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v4, v1, v5}, Lrm/n0;->g(FLrm/o1;)Lio/x;

    move-result-object v5

    iget-object v6, v4, Lrm/n0;->n:Lio/x;

    iget-object v7, v5, Lio/x;->c:[Lio/o;

    const/4 v8, 0x0

    if-eqz v6, :cond_5

    iget-object v9, v6, Lio/x;->c:[Lio/o;

    array-length v9, v9

    array-length v11, v7

    if-eq v9, v11, :cond_1

    goto :goto_2

    :cond_1
    move v9, v8

    :goto_1
    array-length v11, v7

    if-ge v9, v11, :cond_3

    invoke-virtual {v5, v6, v9}, Lio/x;->a(Lio/x;I)Z

    move-result v11

    if-nez v11, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_3
    if-ne v4, v2, :cond_4

    move v3, v8

    :cond_4
    iget-object v4, v4, Lrm/n0;->l:Lrm/n0;

    goto :goto_0

    :cond_5
    :goto_2
    const/4 v1, 0x4

    if-eqz v3, :cond_b

    iget-object v2, v0, Lrm/z;->R:Lrm/p0;

    iget-object v11, v2, Lrm/p0;->h:Lrm/n0;

    invoke-virtual {v2, v11}, Lrm/p0;->k(Lrm/n0;)Z

    move-result v15

    iget-object v2, v0, Lrm/z;->w:[Lrm/d;

    array-length v2, v2

    new-array v2, v2, [Z

    iget-object v3, v0, Lrm/z;->W:Lrm/v0;

    iget-wide v13, v3, Lrm/v0;->s:J

    move-object/from16 v16, v2

    move-object v12, v5

    invoke-virtual/range {v11 .. v16}, Lrm/n0;->a(Lio/x;JZ[Z)J

    move-result-wide v2

    iget-object v4, v0, Lrm/z;->W:Lrm/v0;

    iget v5, v4, Lrm/v0;->e:I

    if-eq v5, v1, :cond_6

    iget-wide v4, v4, Lrm/v0;->s:J

    cmp-long v4, v2, v4

    if-eqz v4, :cond_6

    move v4, v8

    move v8, v10

    goto :goto_3

    :cond_6
    move v4, v8

    :goto_3
    iget-object v5, v0, Lrm/z;->W:Lrm/v0;

    move v6, v1

    iget-object v1, v5, Lrm/v0;->b:Lsn/v;

    iget-wide v12, v5, Lrm/v0;->c:J

    iget-wide v14, v5, Lrm/v0;->d:J

    const/4 v9, 0x5

    move-wide/from16 v17, v12

    move v12, v4

    move-wide/from16 v4, v17

    move v13, v6

    move-wide v6, v14

    invoke-virtual/range {v0 .. v9}, Lrm/z;->o(Lsn/v;JJJZI)Lrm/v0;

    move-result-object v1

    iput-object v1, v0, Lrm/z;->W:Lrm/v0;

    if-eqz v8, :cond_7

    invoke-virtual {v0, v2, v3}, Lrm/z;->C(J)V

    :cond_7
    iget-object v1, v0, Lrm/z;->w:[Lrm/d;

    array-length v1, v1

    new-array v1, v1, [Z

    move v8, v12

    :goto_4
    iget-object v2, v0, Lrm/z;->w:[Lrm/d;

    array-length v3, v2

    if-ge v8, v3, :cond_a

    aget-object v2, v2, v8

    invoke-static {v2}, Lrm/z;->q(Lrm/d;)Z

    move-result v3

    aput-boolean v3, v1, v8

    iget-object v4, v11, Lrm/n0;->c:[Lsn/r0;

    aget-object v4, v4, v8

    if-eqz v3, :cond_9

    iget-object v3, v2, Lrm/d;->G:Lsn/r0;

    if-eq v4, v3, :cond_8

    invoke-virtual {v0, v2}, Lrm/z;->b(Lrm/d;)V

    goto :goto_5

    :cond_8
    aget-boolean v3, v16, v8

    if-eqz v3, :cond_9

    iget-wide v3, v0, Lrm/z;->k0:J

    iput-boolean v12, v2, Lrm/d;->K:Z

    iput-wide v3, v2, Lrm/d;->J:J

    invoke-virtual {v2, v3, v4, v12}, Lrm/d;->n(JZ)V

    :cond_9
    :goto_5
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_a
    invoke-virtual {v0, v1}, Lrm/z;->e([Z)V

    goto :goto_6

    :cond_b
    move v13, v1

    iget-object v1, v0, Lrm/z;->R:Lrm/p0;

    invoke-virtual {v1, v4}, Lrm/p0;->k(Lrm/n0;)Z

    iget-boolean v1, v4, Lrm/n0;->d:Z

    if-eqz v1, :cond_c

    iget-object v1, v4, Lrm/n0;->f:Lrm/o0;

    iget-wide v1, v1, Lrm/o0;->b:J

    iget-wide v6, v0, Lrm/z;->k0:J

    iget-wide v8, v4, Lrm/n0;->o:J

    sub-long/2addr v6, v8

    invoke-static {v1, v2, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    iget-object v1, v4, Lrm/n0;->i:[Lrm/d;

    array-length v1, v1

    new-array v9, v1, [Z

    const/4 v8, 0x0

    invoke-virtual/range {v4 .. v9}, Lrm/n0;->a(Lio/x;JZ[Z)J

    :cond_c
    :goto_6
    invoke-virtual {v0, v10}, Lrm/z;->k(Z)V

    iget-object v1, v0, Lrm/z;->W:Lrm/v0;

    iget v1, v1, Lrm/v0;->e:I

    if-eq v1, v13, :cond_d

    invoke-virtual {v0}, Lrm/z;->s()V

    invoke-virtual {v0}, Lrm/z;->e0()V

    iget-object v1, v0, Lrm/z;->H:Llo/v;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Llo/v;->c(I)Z

    :cond_d
    :goto_7
    return-void
.end method

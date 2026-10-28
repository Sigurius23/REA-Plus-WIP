.class public final Lrm/u;
.super La2/a;
.source "SourceFile"

# interfaces
.implements Lrm/k;


# instance fields
.field public final A0:I

.field public final B0:Ltm/d;

.field public final C0:F

.field public D0:Z

.field public final E:Lb9/m1;

.field public E0:Ljava/util/List;

.field public final F:Landroid/content/Context;

.field public final F0:Z

.field public final G:Lrm/u;

.field public G0:Z

.field public final H:[Lrm/d;

.field public final H0:Lrm/i;

.field public final I:Lio/r;

.field public I0:Lmo/r;

.field public final J:Llo/v;

.field public J0:Lrm/m0;

.field public final K:Lrm/m;

.field public K0:Lrm/v0;

.field public final L:Lrm/z;

.field public L0:I

.field public final M:Ld9/p;

.field public M0:J

.field public final N:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final O:Lrm/m1;

.field public final P:Ljava/util/ArrayList;

.field public final Q:Z

.field public final R:Lsn/u;

.field public final S:Lsm/d;

.field public final T:Landroid/os/Looper;

.field public final U:Lko/e;

.field public final V:J

.field public final W:J

.field public final X:Llo/t;

.field public final Y:Lrm/r;

.field public final Z:Lrm/s;

.field public final a0:Lf1/p1;

.field public final b0:Lrm/c;

.field public final c0:Lrm/j1;

.field public final d0:Lng3/n;

.field public final e0:Lng3/o;

.field public final f0:J

.field public g0:I

.field public h0:Z

.field public i0:I

.field public j0:I

.field public k0:Z

.field public l0:I

.field public final m0:Lrm/h1;

.field public n0:Lsn/u0;

.field public o0:Lrm/x0;

.field public p0:Lrm/m0;

.field public q0:Landroid/media/AudioTrack;

.field public r0:Ljava/lang/Object;

.field public s0:Landroid/view/Surface;

.field public t0:Landroid/view/SurfaceHolder;

.field public u0:Lno/m;

.field public v0:Z

.field public w0:Landroid/view/TextureView;

.field public final x0:I

.field public final y:Lio/x;

.field public y0:I

.field public final z:Lrm/x0;

.field public z0:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "goog.exo.exoplayer"

    invoke-static {v0}, Lrm/a0;->a(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lrm/j;)V
    .locals 31

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, " [ExoPlayerLib/2.17.1] ["

    const/4 v3, 0x6

    invoke-direct {v1, v3}, La2/a;-><init>(I)V

    new-instance v4, Lb9/m1;

    const/4 v5, 0x2

    invoke-direct {v4, v5}, Lb9/m1;-><init>(I)V

    iput-object v4, v1, Lrm/u;->E:Lb9/m1;

    :try_start_0
    const-string v4, "ExoPlayerImpl"

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Llo/y;->e:Ljava/lang/String;

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    add-int/lit8 v8, v8, 0x1e

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    add-int/2addr v8, v9

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v8, "Init "

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v2, v0, Lrm/j;->a:Landroid/content/Context;

    iget-object v4, v0, Lrm/j;->g:Landroid/os/Looper;

    iget-object v6, v0, Lrm/j;->b:Llo/t;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    iput-object v7, v1, Lrm/u;->F:Landroid/content/Context;

    new-instance v7, Lsm/d;

    invoke-direct {v7, v6}, Lsm/d;-><init>(Llo/t;)V

    iput-object v7, v1, Lrm/u;->S:Lsm/d;

    iget-object v7, v0, Lrm/j;->h:Ltm/d;

    iput-object v7, v1, Lrm/u;->B0:Ltm/d;

    iget v7, v0, Lrm/j;->i:I

    iput v7, v1, Lrm/u;->x0:I

    const/4 v7, 0x0

    iput-boolean v7, v1, Lrm/u;->D0:Z

    iget-wide v8, v0, Lrm/j;->p:J

    iput-wide v8, v1, Lrm/u;->f0:J

    new-instance v12, Lrm/r;

    invoke-direct {v12, v1}, Lrm/r;-><init>(Lrm/u;)V

    iput-object v12, v1, Lrm/u;->Y:Lrm/r;

    new-instance v8, Lrm/s;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    iput-object v8, v1, Lrm/u;->Z:Lrm/s;

    new-instance v11, Landroid/os/Handler;

    invoke-direct {v11, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iget-object v8, v0, Lrm/j;->c:Lb9/d;

    invoke-virtual {v8}, Lb9/d;->get()Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Lq3/i;

    move-object v13, v12

    move-object v14, v12

    move-object v15, v12

    invoke-virtual/range {v10 .. v15}, Lq3/i;->e(Landroid/os/Handler;Lrm/r;Lrm/r;Lrm/r;Lrm/r;)[Lrm/d;

    move-result-object v8

    iput-object v8, v1, Lrm/u;->H:[Lrm/d;

    array-length v9, v8

    const/4 v10, 0x1

    if-lez v9, :cond_0

    move v9, v10

    goto :goto_0

    :cond_0
    move v9, v7

    :goto_0
    invoke-static {v9}, Llo/a;->i(Z)V

    iget-object v9, v0, Lrm/j;->e:Lyr/i;

    invoke-interface {v9}, Lyr/i;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lio/r;

    iput-object v9, v1, Lrm/u;->I:Lio/r;

    iget-object v9, v0, Lrm/j;->d:Lb9/d;

    invoke-virtual {v9}, Lb9/d;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lsn/u;

    iput-object v9, v1, Lrm/u;->R:Lsn/u;

    iget-object v9, v0, Lrm/j;->f:Lb9/d;

    invoke-virtual {v9}, Lb9/d;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lko/e;

    iput-object v9, v1, Lrm/u;->U:Lko/e;

    iget-boolean v9, v0, Lrm/j;->j:Z

    iput-boolean v9, v1, Lrm/u;->Q:Z

    iget-object v9, v0, Lrm/j;->k:Lrm/h1;

    iput-object v9, v1, Lrm/u;->m0:Lrm/h1;

    iget-wide v12, v0, Lrm/j;->l:J

    iput-wide v12, v1, Lrm/u;->V:J

    iget-wide v12, v0, Lrm/j;->m:J

    iput-wide v12, v1, Lrm/u;->W:J

    iput-object v4, v1, Lrm/u;->T:Landroid/os/Looper;

    iput-object v6, v1, Lrm/u;->X:Llo/t;

    iput-object v1, v1, Lrm/u;->G:Lrm/u;

    new-instance v9, Ld9/p;

    new-instance v12, Lqa/b;

    invoke-direct {v12, v1}, Lqa/b;-><init>(Lrm/u;)V

    invoke-direct {v9, v4, v6, v12}, Ld9/p;-><init>(Landroid/os/Looper;Llo/t;Llo/i;)V

    iput-object v9, v1, Lrm/u;->M:Ld9/p;

    new-instance v4, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v4}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v4, v1, Lrm/u;->N:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lrm/u;->P:Ljava/util/ArrayList;

    new-instance v4, Lsn/u0;

    invoke-direct {v4}, Lsn/u0;-><init>()V

    iput-object v4, v1, Lrm/u;->n0:Lsn/u0;

    new-instance v4, Lio/x;

    array-length v6, v8

    new-array v6, v6, [Lrm/g1;

    array-length v8, v8

    new-array v8, v8, [Lio/o;

    sget-object v9, Lrm/q1;->x:Lrm/q1;

    const/4 v12, 0x0

    invoke-direct {v4, v6, v8, v9, v12}, Lio/x;-><init>([Lrm/g1;[Lio/o;Lrm/q1;Lio/q;)V

    iput-object v4, v1, Lrm/u;->y:Lio/x;

    new-instance v4, Lrm/m1;

    invoke-direct {v4}, Lrm/m1;-><init>()V

    iput-object v4, v1, Lrm/u;->O:Lrm/m1;

    new-instance v4, Landroid/util/SparseBooleanArray;

    invoke-direct {v4}, Landroid/util/SparseBooleanArray;-><init>()V

    const/16 v6, 0x14

    new-array v8, v6, [I

    fill-array-data v8, :array_0

    move v9, v7

    :goto_1
    if-ge v9, v6, :cond_1

    aget v13, v8, v9

    const/4 v14, 0x0

    xor-int/2addr v14, v10

    invoke-static {v14}, Llo/a;->i(Z)V

    invoke-virtual {v4, v13, v10}, Landroid/util/SparseBooleanArray;->append(IZ)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_1
    iget-object v6, v1, Lrm/u;->I:Lio/r;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v6, 0x0

    xor-int/2addr v6, v10

    invoke-static {v6}, Llo/a;->i(Z)V

    const/16 v6, 0x1d

    invoke-virtual {v4, v6, v10}, Landroid/util/SparseBooleanArray;->append(IZ)V

    new-instance v8, Lrm/x0;

    const/4 v9, 0x0

    xor-int/2addr v9, v10

    invoke-static {v9}, Llo/a;->i(Z)V

    new-instance v9, Llo/f;

    invoke-direct {v9, v4}, Llo/f;-><init>(Landroid/util/SparseBooleanArray;)V

    invoke-direct {v8, v9}, Lrm/x0;-><init>(Llo/f;)V

    iput-object v8, v1, Lrm/u;->z:Lrm/x0;

    new-instance v4, Landroid/util/SparseBooleanArray;

    invoke-direct {v4}, Landroid/util/SparseBooleanArray;-><init>()V

    move v8, v7

    :goto_2
    iget-object v13, v9, Llo/f;->a:Landroid/util/SparseBooleanArray;

    invoke-virtual {v13}, Landroid/util/SparseBooleanArray;->size()I

    move-result v13

    if-ge v8, v13, :cond_2

    invoke-virtual {v9, v8}, Llo/f;->a(I)I

    move-result v13

    const/4 v14, 0x0

    xor-int/2addr v14, v10

    invoke-static {v14}, Llo/a;->i(Z)V

    invoke-virtual {v4, v13, v10}, Landroid/util/SparseBooleanArray;->append(IZ)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_2
    const/4 v8, 0x0

    xor-int/2addr v8, v10

    invoke-static {v8}, Llo/a;->i(Z)V

    const/4 v8, 0x4

    invoke-virtual {v4, v8, v10}, Landroid/util/SparseBooleanArray;->append(IZ)V

    const/4 v9, 0x0

    xor-int/2addr v9, v10

    invoke-static {v9}, Llo/a;->i(Z)V

    const/16 v9, 0xa

    invoke-virtual {v4, v9, v10}, Landroid/util/SparseBooleanArray;->append(IZ)V

    new-instance v13, Lrm/x0;

    const/4 v14, 0x0

    xor-int/2addr v14, v10

    invoke-static {v14}, Llo/a;->i(Z)V

    new-instance v14, Llo/f;

    invoke-direct {v14, v4}, Llo/f;-><init>(Landroid/util/SparseBooleanArray;)V

    invoke-direct {v13, v14}, Lrm/x0;-><init>(Llo/f;)V

    iput-object v13, v1, Lrm/u;->o0:Lrm/x0;

    iget-object v4, v1, Lrm/u;->X:Llo/t;

    iget-object v13, v1, Lrm/u;->T:Landroid/os/Looper;

    invoke-virtual {v4, v13, v12}, Llo/t;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Llo/v;

    move-result-object v4

    iput-object v4, v1, Lrm/u;->J:Llo/v;

    new-instance v4, Lrm/m;

    invoke-direct {v4, v1}, Lrm/m;-><init>(Lrm/u;)V

    iput-object v4, v1, Lrm/u;->K:Lrm/m;

    iget-object v13, v1, Lrm/u;->y:Lio/x;

    invoke-static {v13}, Lrm/v0;->i(Lio/x;)Lrm/v0;

    move-result-object v13

    iput-object v13, v1, Lrm/u;->K0:Lrm/v0;

    iget-object v13, v1, Lrm/u;->S:Lsm/d;

    iget-object v14, v1, Lrm/u;->G:Lrm/u;

    iget-object v15, v1, Lrm/u;->T:Landroid/os/Looper;

    invoke-virtual {v13, v14, v15}, Lsm/d;->B(Lrm/u;Landroid/os/Looper;)V

    sget v13, Llo/y;->a:I

    const/16 v14, 0x1f

    if-ge v13, v14, :cond_3

    new-instance v14, Lsm/f;

    invoke-direct {v14}, Lsm/f;-><init>()V

    :goto_3
    move-object/from16 v29, v14

    move v14, v13

    goto :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_9

    :cond_3
    invoke-static {}, Lrm/o;->a()Lsm/f;

    move-result-object v14

    goto :goto_3

    :goto_4
    new-instance v13, Lrm/z;

    move v15, v14

    iget-object v14, v1, Lrm/u;->H:[Lrm/d;

    move/from16 v16, v15

    iget-object v15, v1, Lrm/u;->I:Lio/r;

    iget-object v3, v1, Lrm/u;->y:Lio/x;

    new-instance v17, Lrm/h;

    invoke-direct/range {v17 .. v17}, Lrm/h;-><init>()V

    iget-object v8, v1, Lrm/u;->U:Lko/e;

    iget v9, v1, Lrm/u;->g0:I

    iget-boolean v6, v1, Lrm/u;->h0:Z

    iget-object v5, v1, Lrm/u;->S:Lsm/d;

    iget-object v10, v1, Lrm/u;->m0:Lrm/h1;

    iget-object v12, v0, Lrm/j;->n:Lb9/i;

    move-object/from16 v18, v8

    iget-wide v7, v0, Lrm/j;->o:J

    iget-object v0, v1, Lrm/u;->T:Landroid/os/Looper;

    move-object/from16 v26, v0

    iget-object v0, v1, Lrm/u;->X:Llo/t;

    move-object/from16 v27, v0

    move-object/from16 v28, v4

    move-object/from16 v21, v5

    move/from16 v20, v6

    move-wide/from16 v24, v7

    move/from16 v19, v9

    move-object/from16 v22, v10

    move-object/from16 v23, v12

    move/from16 v0, v16

    move-object/from16 v16, v3

    invoke-direct/range {v13 .. v29}, Lrm/z;-><init>([Lrm/d;Lio/r;Lio/x;Lrm/h;Lko/e;IZLsm/d;Lrm/h1;Lb9/i;JLandroid/os/Looper;Llo/t;Lrm/m;Lsm/f;)V

    iput-object v13, v1, Lrm/u;->L:Lrm/z;

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, v1, Lrm/u;->C0:F

    const/4 v3, 0x0

    iput v3, v1, Lrm/u;->g0:I

    sget-object v3, Lrm/m0;->h0:Lrm/m0;

    iput-object v3, v1, Lrm/u;->p0:Lrm/m0;

    iput-object v3, v1, Lrm/u;->J0:Lrm/m0;

    const/4 v3, -0x1

    iput v3, v1, Lrm/u;->L0:I

    const/16 v4, 0x15

    if-ge v0, v4, :cond_6

    iget-object v0, v1, Lrm/u;->q0:Landroid/media/AudioTrack;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, v1, Lrm/u;->q0:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    const/4 v0, 0x0

    iput-object v0, v1, Lrm/u;->q0:Landroid/media/AudioTrack;

    :cond_4
    iget-object v0, v1, Lrm/u;->q0:Landroid/media/AudioTrack;

    if-nez v0, :cond_5

    new-instance v3, Landroid/media/AudioTrack;

    const/4 v4, 0x3

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v5, 0xfa0

    const/4 v6, 0x4

    const/4 v7, 0x2

    const/4 v8, 0x2

    invoke-direct/range {v3 .. v10}, Landroid/media/AudioTrack;-><init>(IIIIIII)V

    iput-object v3, v1, Lrm/u;->q0:Landroid/media/AudioTrack;

    :cond_5
    iget-object v0, v1, Lrm/u;->q0:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result v0

    iput v0, v1, Lrm/u;->A0:I

    goto :goto_6

    :cond_6
    iget-object v0, v1, Lrm/u;->F:Landroid/content/Context;

    const-string v4, "audio"

    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    if-nez v0, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {v0}, Landroid/media/AudioManager;->generateAudioSessionId()I

    move-result v3

    :goto_5
    iput v3, v1, Lrm/u;->A0:I

    :goto_6
    sget-object v0, Lzr/w0;->E:Lzr/w0;

    iput-object v0, v1, Lrm/u;->E0:Ljava/util/List;

    const/4 v0, 0x1

    iput-boolean v0, v1, Lrm/u;->F0:Z

    iget-object v0, v1, Lrm/u;->S:Lsm/d;

    invoke-virtual {v1, v0}, Lrm/u;->Q(Lrm/z0;)V

    iget-object v0, v1, Lrm/u;->U:Lko/e;

    new-instance v3, Landroid/os/Handler;

    iget-object v4, v1, Lrm/u;->T:Landroid/os/Looper;

    invoke-direct {v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iget-object v4, v1, Lrm/u;->S:Lsm/d;

    check-cast v0, Lko/q;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lko/q;->b:Lko/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lko/d;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_8
    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lko/c;

    iget-object v7, v6, Lko/c;->b:Lsm/d;

    if-ne v7, v4, :cond_8

    const/4 v7, 0x1

    iput-boolean v7, v6, Lko/c;->c:Z

    invoke-virtual {v0, v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_9
    new-instance v5, Lko/c;

    invoke-direct {v5, v3, v4}, Lko/c;-><init>(Landroid/os/Handler;Lsm/d;)V

    invoke-virtual {v0, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v1, Lrm/u;->Y:Lrm/r;

    iget-object v3, v1, Lrm/u;->N:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v3, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    new-instance v0, Lf1/p1;

    iget-object v3, v1, Lrm/u;->Y:Lrm/r;

    invoke-direct {v0, v2, v11, v3}, Lf1/p1;-><init>(Landroid/content/Context;Landroid/os/Handler;Lrm/r;)V

    iput-object v0, v1, Lrm/u;->a0:Lf1/p1;

    invoke-virtual {v0}, Lf1/p1;->u()V

    new-instance v0, Lrm/c;

    iget-object v3, v1, Lrm/u;->Y:Lrm/r;

    invoke-direct {v0, v2, v11, v3}, Lrm/c;-><init>(Landroid/content/Context;Landroid/os/Handler;Lrm/r;)V

    iput-object v0, v1, Lrm/u;->b0:Lrm/c;

    sget v0, Llo/y;->a:I

    new-instance v0, Lrm/j1;

    iget-object v3, v1, Lrm/u;->Y:Lrm/r;

    invoke-direct {v0, v2, v11, v3}, Lrm/j1;-><init>(Landroid/content/Context;Landroid/os/Handler;Lrm/r;)V

    iput-object v0, v1, Lrm/u;->c0:Lrm/j1;

    iget-object v3, v1, Lrm/u;->B0:Ltm/d;

    iget v3, v3, Ltm/d;->y:I

    invoke-static {v3}, Llo/y;->t(I)I

    move-result v3

    iget v4, v0, Lrm/j1;->b:I

    if-ne v4, v3, :cond_a

    goto :goto_8

    :cond_a
    iput v3, v0, Lrm/j1;->b:I

    invoke-virtual {v0}, Lrm/j1;->d()V

    iget-object v3, v0, Lrm/j1;->f:Ljava/lang/Object;

    check-cast v3, Lrm/r;

    iget-object v3, v3, Lrm/r;->w:Lrm/u;

    iget-object v4, v3, Lrm/u;->c0:Lrm/j1;

    invoke-static {v4}, Lrm/u;->T(Lrm/j1;)Lrm/i;

    move-result-object v4

    iget-object v5, v3, Lrm/u;->H0:Lrm/i;

    invoke-virtual {v4, v5}, Lrm/i;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_b

    iput-object v4, v3, Lrm/u;->H0:Lrm/i;

    iget-object v3, v3, Lrm/u;->M:Ld9/p;

    new-instance v5, Lrm/p;

    const/4 v6, 0x2

    invoke-direct {v5, v4, v6}, Lrm/p;-><init>(Ljava/lang/Object;I)V

    const/16 v4, 0x1d

    invoke-virtual {v3, v4, v5}, Ld9/p;->i(ILlo/h;)V

    :cond_b
    :goto_8
    new-instance v3, Lng3/n;

    const/16 v4, 0x17

    invoke-direct {v3, v4}, Lng3/n;-><init>(I)V

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    const-string v6, "power"

    invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/os/PowerManager;

    iput-object v3, v1, Lrm/u;->d0:Lng3/n;

    new-instance v3, Lng3/o;

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Lng3/o;-><init>(IZ)V

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v4, "wifi"

    invoke-virtual {v2, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/wifi/WifiManager;

    iput-object v3, v1, Lrm/u;->e0:Lng3/o;

    invoke-static {v0}, Lrm/u;->T(Lrm/j1;)Lrm/i;

    move-result-object v0

    iput-object v0, v1, Lrm/u;->H0:Lrm/i;

    sget-object v0, Lmo/r;->E:Lmo/r;

    iput-object v0, v1, Lrm/u;->I0:Lmo/r;

    iget v0, v1, Lrm/u;->A0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v2, 0xa

    const/4 v7, 0x1

    invoke-virtual {v1, v7, v2, v0}, Lrm/u;->r0(IILjava/lang/Object;)V

    iget v0, v1, Lrm/u;->A0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v6, 0x2

    invoke-virtual {v1, v6, v2, v0}, Lrm/u;->r0(IILjava/lang/Object;)V

    iget-object v0, v1, Lrm/u;->B0:Ltm/d;

    const/4 v2, 0x3

    invoke-virtual {v1, v7, v2, v0}, Lrm/u;->r0(IILjava/lang/Object;)V

    iget v0, v1, Lrm/u;->x0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x4

    invoke-virtual {v1, v6, v2, v0}, Lrm/u;->r0(IILjava/lang/Object;)V

    const/16 v30, 0x0

    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x5

    invoke-virtual {v1, v6, v2, v0}, Lrm/u;->r0(IILjava/lang/Object;)V

    iget-boolean v0, v1, Lrm/u;->D0:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/16 v2, 0x9

    const/4 v7, 0x1

    invoke-virtual {v1, v7, v2, v0}, Lrm/u;->r0(IILjava/lang/Object;)V

    iget-object v0, v1, Lrm/u;->Z:Lrm/s;

    const/4 v2, 0x7

    const/4 v6, 0x2

    invoke-virtual {v1, v6, v2, v0}, Lrm/u;->r0(IILjava/lang/Object;)V

    iget-object v0, v1, Lrm/u;->Z:Lrm/s;

    const/16 v2, 0x8

    const/4 v3, 0x6

    invoke-virtual {v1, v3, v2, v0}, Lrm/u;->r0(IILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, v1, Lrm/u;->E:Lb9/m1;

    invoke-virtual {v0}, Lb9/m1;->c()Z

    return-void

    :goto_9
    iget-object v2, v1, Lrm/u;->E:Lb9/m1;

    invoke-virtual {v2}, Lb9/m1;->c()Z

    throw v0

    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0xd
        0xe
        0xf
        0x10
        0x11
        0x12
        0x13
        0x14
        0x1e
        0x15
        0x16
        0x17
        0x18
        0x19
        0x1a
        0x1b
        0x1c
    .end array-data
.end method

.method public static T(Lrm/j1;)Lrm/i;
    .locals 5

    new-instance v0, Lrm/i;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lrm/j1;->g:Ljava/lang/Object;

    check-cast v1, Landroid/media/AudioManager;

    sget v2, Llo/y;->a:I

    const/16 v3, 0x1c

    const/4 v4, 0x0

    if-lt v2, v3, :cond_0

    iget v2, p0, Lrm/j1;->b:I

    invoke-virtual {v1, v2}, Landroid/media/AudioManager;->getStreamMinVolume(I)I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    iget p0, p0, Lrm/j1;->b:I

    invoke-virtual {v1, p0}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result p0

    invoke-direct {v0, v4, v2, p0}, Lrm/i;-><init>(III)V

    return-object v0
.end method

.method public static f0(Lrm/v0;)J
    .locals 6

    new-instance v0, Lrm/n1;

    invoke-direct {v0}, Lrm/n1;-><init>()V

    new-instance v1, Lrm/m1;

    invoke-direct {v1}, Lrm/m1;-><init>()V

    iget-object v2, p0, Lrm/v0;->a:Lrm/o1;

    iget-object v3, p0, Lrm/v0;->b:Lsn/v;

    iget-object v3, v3, Lsn/t;->a:Ljava/lang/Object;

    invoke-virtual {v2, v3, v1}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    iget-wide v2, p0, Lrm/v0;->c:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v2, v4

    if-nez v4, :cond_0

    iget-object p0, p0, Lrm/v0;->a:Lrm/o1;

    iget v1, v1, Lrm/m1;->y:I

    const-wide/16 v2, 0x0

    invoke-virtual {p0, v1, v0, v2, v3}, Lrm/o1;->m(ILrm/n1;J)Lrm/n1;

    move-result-object p0

    iget-wide v0, p0, Lrm/n1;->M:J

    return-wide v0

    :cond_0
    iget-wide v0, v1, Lrm/m1;->E:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public static h0(Lrm/v0;)Z
    .locals 2

    iget v0, p0, Lrm/v0;->e:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lrm/v0;->l:Z

    if-eqz v0, :cond_0

    iget p0, p0, Lrm/v0;->m:I

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final A0()V
    .locals 4

    invoke-virtual {p0}, Lrm/u;->e0()I

    move-result v0

    const/4 v1, 0x1

    iget-object v2, p0, Lrm/u;->e0:Lng3/o;

    iget-object v3, p0, Lrm/u;->d0:Lng3/n;

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1
    invoke-virtual {p0}, Lrm/u;->B0()V

    iget-object v0, p0, Lrm/u;->K0:Lrm/v0;

    iget-boolean v0, v0, Lrm/v0;->p:Z

    invoke-virtual {p0}, Lrm/u;->d0()Z

    move-result v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lrm/u;->d0()Z

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_2
    :goto_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final B0()V
    .locals 6

    iget-object v0, p0, Lrm/u;->E:Lb9/m1;

    monitor-enter v0

    const/4 v1, 0x0

    :goto_0
    :try_start_0
    iget-boolean v2, v0, Lb9/m1;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v3, 0x1

    if-nez v2, :cond_0

    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_3

    :catch_0
    move v1, v3

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    monitor-exit v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lrm/u;->T:Landroid/os/Looper;

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v0, v1, :cond_4

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lrm/u;->T:Landroid/os/Looper;

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    sget v2, Llo/y;->a:I

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "Player is accessed on the wrong thread.\nCurrent thread: \'"

    const-string v4, "\'\nExpected thread: \'"

    const-string v5, "\'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread"

    invoke-static {v2, v0, v4, v1, v5}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lrm/u;->F0:Z

    if-nez v1, :cond_3

    const-string v1, "ExoPlayerImpl"

    iget-boolean v2, p0, Lrm/u;->G0:Z

    if-eqz v2, :cond_2

    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2}, Ljava/lang/IllegalStateException;-><init>()V

    :goto_1
    invoke-static {v1, v0, v2}, Llo/a;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    iput-boolean v3, p0, Lrm/u;->G0:Z

    goto :goto_2

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    :goto_2
    return-void

    :goto_3
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method

.method public final Q(Lrm/z0;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lrm/u;->M:Ld9/p;

    iget-boolean v1, v0, Ld9/p;->a:Z

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, Ld9/p;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v1, Llo/j;

    invoke-direct {v1, p1}, Llo/j;-><init>(Lrm/z0;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final R()Lrm/m0;
    .locals 5

    invoke-virtual {p0}, Lrm/u;->b0()Lrm/o1;

    move-result-object v0

    invoke-virtual {v0}, Lrm/o1;->p()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lrm/u;->J0:Lrm/m0;

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lrm/u;->Y()I

    move-result v1

    iget-object v2, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v2, Lrm/n1;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lrm/o1;->m(ILrm/n1;J)Lrm/n1;

    move-result-object v0

    iget-object v0, v0, Lrm/n1;->y:Lrm/k0;

    iget-object v1, p0, Lrm/u;->J0:Lrm/m0;

    invoke-virtual {v1}, Lrm/m0;->a()Lrm/l0;

    move-result-object v1

    iget-object v0, v0, Lrm/k0;->z:Lrm/m0;

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    iget-object v2, v0, Lrm/m0;->w:Ljava/lang/CharSequence;

    if-eqz v2, :cond_2

    iput-object v2, v1, Lrm/l0;->a:Ljava/lang/CharSequence;

    :cond_2
    iget-object v2, v0, Lrm/m0;->x:Ljava/lang/CharSequence;

    if-eqz v2, :cond_3

    iput-object v2, v1, Lrm/l0;->b:Ljava/lang/CharSequence;

    :cond_3
    iget-object v2, v0, Lrm/m0;->y:Ljava/lang/CharSequence;

    if-eqz v2, :cond_4

    iput-object v2, v1, Lrm/l0;->c:Ljava/lang/CharSequence;

    :cond_4
    iget-object v2, v0, Lrm/m0;->z:Ljava/lang/CharSequence;

    if-eqz v2, :cond_5

    iput-object v2, v1, Lrm/l0;->d:Ljava/lang/CharSequence;

    :cond_5
    iget-object v2, v0, Lrm/m0;->E:Ljava/lang/CharSequence;

    if-eqz v2, :cond_6

    iput-object v2, v1, Lrm/l0;->e:Ljava/lang/CharSequence;

    :cond_6
    iget-object v2, v0, Lrm/m0;->F:Ljava/lang/CharSequence;

    if-eqz v2, :cond_7

    iput-object v2, v1, Lrm/l0;->f:Ljava/lang/CharSequence;

    :cond_7
    iget-object v2, v0, Lrm/m0;->G:Ljava/lang/CharSequence;

    if-eqz v2, :cond_8

    iput-object v2, v1, Lrm/l0;->g:Ljava/lang/CharSequence;

    :cond_8
    iget-object v2, v0, Lrm/m0;->H:Landroid/net/Uri;

    if-eqz v2, :cond_9

    iput-object v2, v1, Lrm/l0;->h:Landroid/net/Uri;

    :cond_9
    iget-object v2, v0, Lrm/m0;->I:Lrm/f1;

    if-eqz v2, :cond_a

    iput-object v2, v1, Lrm/l0;->i:Lrm/f1;

    :cond_a
    iget-object v2, v0, Lrm/m0;->J:Lrm/f1;

    if-eqz v2, :cond_b

    iput-object v2, v1, Lrm/l0;->j:Lrm/f1;

    :cond_b
    iget-object v2, v0, Lrm/m0;->K:[B

    if-eqz v2, :cond_c

    iget-object v3, v0, Lrm/m0;->L:Ljava/lang/Integer;

    invoke-virtual {v2}, [B->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    iput-object v2, v1, Lrm/l0;->k:[B

    iput-object v3, v1, Lrm/l0;->l:Ljava/lang/Integer;

    :cond_c
    iget-object v2, v0, Lrm/m0;->M:Landroid/net/Uri;

    if-eqz v2, :cond_d

    iput-object v2, v1, Lrm/l0;->m:Landroid/net/Uri;

    :cond_d
    iget-object v2, v0, Lrm/m0;->N:Ljava/lang/Integer;

    if-eqz v2, :cond_e

    iput-object v2, v1, Lrm/l0;->n:Ljava/lang/Integer;

    :cond_e
    iget-object v2, v0, Lrm/m0;->O:Ljava/lang/Integer;

    if-eqz v2, :cond_f

    iput-object v2, v1, Lrm/l0;->o:Ljava/lang/Integer;

    :cond_f
    iget-object v2, v0, Lrm/m0;->P:Ljava/lang/Integer;

    if-eqz v2, :cond_10

    iput-object v2, v1, Lrm/l0;->p:Ljava/lang/Integer;

    :cond_10
    iget-object v2, v0, Lrm/m0;->Q:Ljava/lang/Boolean;

    if-eqz v2, :cond_11

    iput-object v2, v1, Lrm/l0;->q:Ljava/lang/Boolean;

    :cond_11
    iget-object v2, v0, Lrm/m0;->R:Ljava/lang/Integer;

    if-eqz v2, :cond_12

    iput-object v2, v1, Lrm/l0;->r:Ljava/lang/Integer;

    :cond_12
    iget-object v2, v0, Lrm/m0;->S:Ljava/lang/Integer;

    if-eqz v2, :cond_13

    iput-object v2, v1, Lrm/l0;->r:Ljava/lang/Integer;

    :cond_13
    iget-object v2, v0, Lrm/m0;->T:Ljava/lang/Integer;

    if-eqz v2, :cond_14

    iput-object v2, v1, Lrm/l0;->s:Ljava/lang/Integer;

    :cond_14
    iget-object v2, v0, Lrm/m0;->U:Ljava/lang/Integer;

    if-eqz v2, :cond_15

    iput-object v2, v1, Lrm/l0;->t:Ljava/lang/Integer;

    :cond_15
    iget-object v2, v0, Lrm/m0;->V:Ljava/lang/Integer;

    if-eqz v2, :cond_16

    iput-object v2, v1, Lrm/l0;->u:Ljava/lang/Integer;

    :cond_16
    iget-object v2, v0, Lrm/m0;->W:Ljava/lang/Integer;

    if-eqz v2, :cond_17

    iput-object v2, v1, Lrm/l0;->v:Ljava/lang/Integer;

    :cond_17
    iget-object v2, v0, Lrm/m0;->X:Ljava/lang/Integer;

    if-eqz v2, :cond_18

    iput-object v2, v1, Lrm/l0;->w:Ljava/lang/Integer;

    :cond_18
    iget-object v2, v0, Lrm/m0;->Y:Ljava/lang/CharSequence;

    if-eqz v2, :cond_19

    iput-object v2, v1, Lrm/l0;->x:Ljava/lang/CharSequence;

    :cond_19
    iget-object v2, v0, Lrm/m0;->Z:Ljava/lang/CharSequence;

    if-eqz v2, :cond_1a

    iput-object v2, v1, Lrm/l0;->y:Ljava/lang/CharSequence;

    :cond_1a
    iget-object v2, v0, Lrm/m0;->a0:Ljava/lang/CharSequence;

    if-eqz v2, :cond_1b

    iput-object v2, v1, Lrm/l0;->z:Ljava/lang/CharSequence;

    :cond_1b
    iget-object v2, v0, Lrm/m0;->b0:Ljava/lang/Integer;

    if-eqz v2, :cond_1c

    iput-object v2, v1, Lrm/l0;->A:Ljava/lang/Integer;

    :cond_1c
    iget-object v2, v0, Lrm/m0;->c0:Ljava/lang/Integer;

    if-eqz v2, :cond_1d

    iput-object v2, v1, Lrm/l0;->B:Ljava/lang/Integer;

    :cond_1d
    iget-object v2, v0, Lrm/m0;->d0:Ljava/lang/CharSequence;

    if-eqz v2, :cond_1e

    iput-object v2, v1, Lrm/l0;->C:Ljava/lang/CharSequence;

    :cond_1e
    iget-object v2, v0, Lrm/m0;->e0:Ljava/lang/CharSequence;

    if-eqz v2, :cond_1f

    iput-object v2, v1, Lrm/l0;->D:Ljava/lang/CharSequence;

    :cond_1f
    iget-object v2, v0, Lrm/m0;->f0:Ljava/lang/CharSequence;

    if-eqz v2, :cond_20

    iput-object v2, v1, Lrm/l0;->E:Ljava/lang/CharSequence;

    :cond_20
    iget-object v0, v0, Lrm/m0;->g0:Landroid/os/Bundle;

    if-eqz v0, :cond_21

    iput-object v0, v1, Lrm/l0;->F:Landroid/os/Bundle;

    :cond_21
    :goto_0
    new-instance v0, Lrm/m0;

    invoke-direct {v0, v1}, Lrm/m0;-><init>(Lrm/l0;)V

    return-object v0
.end method

.method public final S()V
    .locals 1

    invoke-virtual {p0}, Lrm/u;->B0()V

    invoke-virtual {p0}, Lrm/u;->p0()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lrm/u;->w0(Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, Lrm/u;->l0(II)V

    return-void
.end method

.method public final U(Lrm/c1;)Lrm/d1;
    .locals 8

    invoke-virtual {p0}, Lrm/u;->c0()I

    move-result v0

    new-instance v1, Lrm/d1;

    iget-object v2, p0, Lrm/u;->K0:Lrm/v0;

    iget-object v4, v2, Lrm/v0;->a:Lrm/o1;

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    const/4 v0, 0x0

    :cond_0
    move v5, v0

    iget-object v6, p0, Lrm/u;->X:Llo/t;

    iget-object v2, p0, Lrm/u;->L:Lrm/z;

    iget-object v7, v2, Lrm/z;->J:Landroid/os/Looper;

    move-object v3, p1

    invoke-direct/range {v1 .. v7}, Lrm/d1;-><init>(Lrm/z;Lrm/c1;Lrm/o1;ILlo/t;Landroid/os/Looper;)V

    return-object v1
.end method

.method public final V()J
    .locals 7

    invoke-virtual {p0}, Lrm/u;->B0()V

    invoke-virtual {p0}, Lrm/u;->i0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lrm/u;->K0:Lrm/v0;

    iget-object v1, v0, Lrm/v0;->a:Lrm/o1;

    iget-object v0, v0, Lrm/v0;->b:Lsn/v;

    iget-object v0, v0, Lsn/t;->a:Ljava/lang/Object;

    iget-object v2, p0, Lrm/u;->O:Lrm/m1;

    invoke-virtual {v1, v0, v2}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    iget-object v0, p0, Lrm/u;->K0:Lrm/v0;

    iget-wide v3, v0, Lrm/v0;->c:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v3, v5

    if-nez v1, :cond_0

    iget-object v0, v0, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {p0}, Lrm/u;->Y()I

    move-result v1

    iget-object v2, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v2, Lrm/n1;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lrm/o1;->m(ILrm/n1;J)Lrm/n1;

    move-result-object v0

    iget-wide v0, v0, Lrm/n1;->M:J

    invoke-static {v0, v1}, Llo/y;->G(J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-wide v0, v2, Lrm/m1;->E:J

    invoke-static {v0, v1}, Llo/y;->G(J)J

    move-result-wide v0

    iget-object v2, p0, Lrm/u;->K0:Lrm/v0;

    iget-wide v2, v2, Lrm/v0;->c:J

    invoke-static {v2, v3}, Llo/y;->G(J)J

    move-result-wide v2

    add-long/2addr v2, v0

    return-wide v2

    :cond_1
    invoke-virtual {p0}, Lrm/u;->Z()J

    move-result-wide v0

    return-wide v0
.end method

.method public final W()I
    .locals 1

    invoke-virtual {p0}, Lrm/u;->B0()V

    invoke-virtual {p0}, Lrm/u;->i0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrm/u;->K0:Lrm/v0;

    iget-object v0, v0, Lrm/v0;->b:Lsn/v;

    iget v0, v0, Lsn/t;->b:I

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public final X()I
    .locals 1

    invoke-virtual {p0}, Lrm/u;->B0()V

    invoke-virtual {p0}, Lrm/u;->i0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrm/u;->K0:Lrm/v0;

    iget-object v0, v0, Lrm/v0;->b:Lsn/v;

    iget v0, v0, Lsn/t;->c:I

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public final Y()I
    .locals 2

    invoke-virtual {p0}, Lrm/u;->B0()V

    invoke-virtual {p0}, Lrm/u;->c0()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return v0
.end method

.method public final Z()J
    .locals 2

    invoke-virtual {p0}, Lrm/u;->B0()V

    iget-object v0, p0, Lrm/u;->K0:Lrm/v0;

    invoke-virtual {p0, v0}, Lrm/u;->a0(Lrm/v0;)J

    move-result-wide v0

    invoke-static {v0, v1}, Llo/y;->G(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final a0(Lrm/v0;)J
    .locals 4

    iget-object v0, p1, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v0}, Lrm/o1;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lrm/u;->M0:J

    invoke-static {v0, v1}, Llo/y;->z(J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object v0, p1, Lrm/v0;->b:Lsn/v;

    invoke-virtual {v0}, Lsn/t;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p1, Lrm/v0;->s:J

    return-wide v0

    :cond_1
    iget-object v0, p1, Lrm/v0;->a:Lrm/o1;

    iget-object v1, p1, Lrm/v0;->b:Lsn/v;

    iget-wide v2, p1, Lrm/v0;->s:J

    iget-object p1, v1, Lsn/t;->a:Ljava/lang/Object;

    iget-object v1, p0, Lrm/u;->O:Lrm/m1;

    invoke-virtual {v0, p1, v1}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    iget-wide v0, v1, Lrm/m1;->E:J

    add-long/2addr v2, v0

    return-wide v2
.end method

.method public final b0()Lrm/o1;
    .locals 1

    invoke-virtual {p0}, Lrm/u;->B0()V

    iget-object v0, p0, Lrm/u;->K0:Lrm/v0;

    iget-object v0, v0, Lrm/v0;->a:Lrm/o1;

    return-object v0
.end method

.method public final c0()I
    .locals 3

    iget-object v0, p0, Lrm/u;->K0:Lrm/v0;

    iget-object v0, v0, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v0}, Lrm/o1;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lrm/u;->L0:I

    return v0

    :cond_0
    iget-object v0, p0, Lrm/u;->K0:Lrm/v0;

    iget-object v1, v0, Lrm/v0;->a:Lrm/o1;

    iget-object v0, v0, Lrm/v0;->b:Lsn/v;

    iget-object v0, v0, Lsn/t;->a:Ljava/lang/Object;

    iget-object v2, p0, Lrm/u;->O:Lrm/m1;

    invoke-virtual {v1, v0, v2}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    move-result-object v0

    iget v0, v0, Lrm/m1;->y:I

    return v0
.end method

.method public final d0()Z
    .locals 1

    invoke-virtual {p0}, Lrm/u;->B0()V

    iget-object v0, p0, Lrm/u;->K0:Lrm/v0;

    iget-boolean v0, v0, Lrm/v0;->l:Z

    return v0
.end method

.method public final e0()I
    .locals 1

    invoke-virtual {p0}, Lrm/u;->B0()V

    iget-object v0, p0, Lrm/u;->K0:Lrm/v0;

    iget v0, v0, Lrm/v0;->e:I

    return v0
.end method

.method public final g0()Lio/f;
    .locals 1

    invoke-virtual {p0}, Lrm/u;->B0()V

    iget-object v0, p0, Lrm/u;->I:Lio/r;

    check-cast v0, Lio/m;

    iget-object v0, v0, Lio/m;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/f;

    return-object v0
.end method

.method public final i0()Z
    .locals 1

    invoke-virtual {p0}, Lrm/u;->B0()V

    iget-object v0, p0, Lrm/u;->K0:Lrm/v0;

    iget-object v0, v0, Lrm/v0;->b:Lsn/v;

    invoke-virtual {v0}, Lsn/t;->a()Z

    move-result v0

    return v0
.end method

.method public final j0(Lrm/v0;Lrm/o1;Landroid/util/Pair;)Lrm/v0;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    invoke-virtual {v1}, Lrm/o1;->p()Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v3, :cond_1

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move v3, v4

    goto :goto_1

    :cond_1
    :goto_0
    move v3, v5

    :goto_1
    invoke-static {v3}, Llo/a;->e(Z)V

    move-object/from16 v3, p1

    iget-object v6, v3, Lrm/v0;->a:Lrm/o1;

    invoke-virtual/range {p1 .. p2}, Lrm/v0;->h(Lrm/o1;)Lrm/v0;

    move-result-object v7

    invoke-virtual {v1}, Lrm/o1;->p()Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v8, Lrm/v0;->t:Lsn/v;

    iget-wide v1, v0, Lrm/u;->M0:J

    invoke-static {v1, v2}, Llo/y;->z(J)J

    move-result-wide v9

    sget-object v17, Lsn/x0;->z:Lsn/x0;

    iget-object v1, v0, Lrm/u;->y:Lio/x;

    sget-object v19, Lzr/w0;->E:Lzr/w0;

    const-wide/16 v15, 0x0

    move-wide v11, v9

    move-wide v13, v9

    move-object/from16 v18, v1

    invoke-virtual/range {v7 .. v19}, Lrm/v0;->b(Lsn/v;JJJJLsn/x0;Lio/x;Ljava/util/List;)Lrm/v0;

    move-result-object v1

    invoke-virtual {v1, v8}, Lrm/v0;->a(Lsn/v;)Lrm/v0;

    move-result-object v1

    iget-wide v2, v1, Lrm/v0;->s:J

    iput-wide v2, v1, Lrm/v0;->q:J

    return-object v1

    :cond_2
    iget-object v3, v7, Lrm/v0;->b:Lsn/v;

    iget-object v3, v3, Lsn/t;->a:Ljava/lang/Object;

    sget v8, Llo/y;->a:I

    iget-object v8, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    new-instance v9, Lsn/v;

    iget-object v10, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-direct {v9, v10}, Lsn/v;-><init>(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object v9, v7, Lrm/v0;->b:Lsn/v;

    :goto_2
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    invoke-virtual {v0}, Lrm/u;->V()J

    move-result-wide v12

    invoke-static {v12, v13}, Llo/y;->z(J)J

    move-result-wide v12

    invoke-virtual {v6}, Lrm/o1;->p()Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, v0, Lrm/u;->O:Lrm/m1;

    invoke-virtual {v6, v3, v2}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    move-result-object v2

    iget-wide v2, v2, Lrm/m1;->E:J

    sub-long/2addr v12, v2

    :cond_4
    if-eqz v8, :cond_5

    cmp-long v2, v10, v12

    if-gez v2, :cond_6

    :cond_5
    move v1, v8

    move-object v8, v9

    move-wide v9, v10

    goto/16 :goto_6

    :cond_6
    if-nez v2, :cond_a

    iget-object v2, v7, Lrm/v0;->k:Lsn/v;

    iget-object v2, v2, Lsn/t;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lrm/o1;->b(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_8

    iget-object v3, v0, Lrm/u;->O:Lrm/m1;

    invoke-virtual {v1, v2, v3, v4}, Lrm/o1;->f(ILrm/m1;Z)Lrm/m1;

    move-result-object v2

    iget v2, v2, Lrm/m1;->y:I

    iget-object v3, v9, Lsn/t;->a:Ljava/lang/Object;

    iget-object v4, v0, Lrm/u;->O:Lrm/m1;

    invoke-virtual {v1, v3, v4}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    move-result-object v3

    iget v3, v3, Lrm/m1;->y:I

    if-eq v2, v3, :cond_7

    goto :goto_3

    :cond_7
    return-object v7

    :cond_8
    :goto_3
    iget-object v2, v9, Lsn/t;->a:Ljava/lang/Object;

    iget-object v3, v0, Lrm/u;->O:Lrm/m1;

    invoke-virtual {v1, v2, v3}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    invoke-virtual {v9}, Lsn/t;->a()Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, v0, Lrm/u;->O:Lrm/m1;

    iget v2, v9, Lsn/t;->b:I

    iget v3, v9, Lsn/t;->c:I

    invoke-virtual {v1, v2, v3}, Lrm/m1;->a(II)J

    move-result-wide v1

    :goto_4
    move-object v8, v9

    goto :goto_5

    :cond_9
    iget-object v1, v0, Lrm/u;->O:Lrm/m1;

    iget-wide v1, v1, Lrm/m1;->z:J

    goto :goto_4

    :goto_5
    iget-wide v9, v7, Lrm/v0;->s:J

    iget-wide v11, v7, Lrm/v0;->s:J

    iget-wide v13, v7, Lrm/v0;->d:J

    iget-wide v3, v7, Lrm/v0;->s:J

    sub-long v15, v1, v3

    iget-object v3, v7, Lrm/v0;->h:Lsn/x0;

    iget-object v4, v7, Lrm/v0;->i:Lio/x;

    iget-object v5, v7, Lrm/v0;->j:Ljava/util/List;

    move-object/from16 v17, v3

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    invoke-virtual/range {v7 .. v19}, Lrm/v0;->b(Lsn/v;JJJJLsn/x0;Lio/x;Ljava/util/List;)Lrm/v0;

    move-result-object v3

    invoke-virtual {v3, v8}, Lrm/v0;->a(Lsn/v;)Lrm/v0;

    move-result-object v3

    iput-wide v1, v3, Lrm/v0;->q:J

    return-object v3

    :cond_a
    move-object v8, v9

    invoke-virtual {v8}, Lsn/t;->a()Z

    move-result v1

    xor-int/2addr v1, v5

    invoke-static {v1}, Llo/a;->i(Z)V

    iget-wide v1, v7, Lrm/v0;->r:J

    sub-long v3, v10, v12

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x0

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v15

    iget-wide v1, v7, Lrm/v0;->q:J

    iget-object v3, v7, Lrm/v0;->k:Lsn/v;

    iget-object v4, v7, Lrm/v0;->b:Lsn/v;

    invoke-virtual {v3, v4}, Lsn/t;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    add-long v1, v10, v15

    :cond_b
    iget-object v3, v7, Lrm/v0;->h:Lsn/x0;

    iget-object v4, v7, Lrm/v0;->i:Lio/x;

    iget-object v5, v7, Lrm/v0;->j:Ljava/util/List;

    move-wide v9, v10

    move-wide v11, v9

    move-wide v13, v9

    move-object/from16 v17, v3

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    invoke-virtual/range {v7 .. v19}, Lrm/v0;->b(Lsn/v;JJJJLsn/x0;Lio/x;Ljava/util/List;)Lrm/v0;

    move-result-object v3

    iput-wide v1, v3, Lrm/v0;->q:J

    return-object v3

    :goto_6
    invoke-virtual {v8}, Lsn/t;->a()Z

    move-result v2

    xor-int/2addr v2, v5

    invoke-static {v2}, Llo/a;->i(Z)V

    if-nez v1, :cond_c

    sget-object v2, Lsn/x0;->z:Lsn/x0;

    :goto_7
    move-object/from16 v17, v2

    goto :goto_8

    :cond_c
    iget-object v2, v7, Lrm/v0;->h:Lsn/x0;

    goto :goto_7

    :goto_8
    if-nez v1, :cond_d

    iget-object v2, v0, Lrm/u;->y:Lio/x;

    :goto_9
    move-object/from16 v18, v2

    goto :goto_a

    :cond_d
    iget-object v2, v7, Lrm/v0;->i:Lio/x;

    goto :goto_9

    :goto_a
    if-nez v1, :cond_e

    sget-object v1, Lzr/g0;->x:Lzr/e0;

    sget-object v1, Lzr/w0;->E:Lzr/w0;

    :goto_b
    move-object/from16 v19, v1

    goto :goto_c

    :cond_e
    iget-object v1, v7, Lrm/v0;->j:Ljava/util/List;

    goto :goto_b

    :goto_c
    const-wide/16 v15, 0x0

    move-wide v11, v9

    move-wide v13, v9

    invoke-virtual/range {v7 .. v19}, Lrm/v0;->b(Lsn/v;JJJJLsn/x0;Lio/x;Ljava/util/List;)Lrm/v0;

    move-result-object v1

    invoke-virtual {v1, v8}, Lrm/v0;->a(Lsn/v;)Lrm/v0;

    move-result-object v1

    iput-wide v9, v1, Lrm/v0;->q:J

    return-object v1
.end method

.method public final k0(Lrm/o1;IJ)Landroid/util/Pair;
    .locals 6

    invoke-virtual {p1}, Lrm/o1;->p()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_1

    iput p2, p0, Lrm/u;->L0:I

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p3, p1

    if-nez p1, :cond_0

    move-wide p3, v1

    :cond_0
    iput-wide p3, p0, Lrm/u;->M0:J

    const/4 p1, 0x0

    return-object p1

    :cond_1
    const/4 v0, -0x1

    if-eq p2, v0, :cond_3

    invoke-virtual {p1}, Lrm/o1;->o()I

    move-result v0

    if-lt p2, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    move v3, p2

    goto :goto_2

    :cond_3
    :goto_1
    iget-boolean p2, p0, Lrm/u;->h0:Z

    invoke-virtual {p1, p2}, Lrm/o1;->a(Z)I

    move-result p2

    iget-object p3, p0, La2/a;->x:Ljava/lang/Object;

    check-cast p3, Lrm/n1;

    invoke-virtual {p1, p2, p3, v1, v2}, Lrm/o1;->m(ILrm/n1;J)Lrm/n1;

    move-result-object p3

    iget-wide p3, p3, Lrm/n1;->M:J

    invoke-static {p3, p4}, Llo/y;->G(J)J

    move-result-wide p3

    goto :goto_0

    :goto_2
    iget-object p2, p0, La2/a;->x:Ljava/lang/Object;

    move-object v1, p2

    check-cast v1, Lrm/n1;

    iget-object v2, p0, Lrm/u;->O:Lrm/m1;

    invoke-static {p3, p4}, Llo/y;->z(J)J

    move-result-wide v4

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lrm/o1;->i(Lrm/n1;Lrm/m1;IJ)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method public final l0(II)V
    .locals 2

    iget v0, p0, Lrm/u;->y0:I

    if-ne p1, v0, :cond_1

    iget v0, p0, Lrm/u;->z0:I

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iput p1, p0, Lrm/u;->y0:I

    iput p2, p0, Lrm/u;->z0:I

    new-instance v0, Lb9/s;

    const/4 v1, 0x1

    invoke-direct {v0, p1, p2, v1}, Lb9/s;-><init>(III)V

    iget-object p1, p0, Lrm/u;->M:Ld9/p;

    const/16 p2, 0x18

    invoke-virtual {p1, p2, v0}, Ld9/p;->i(ILlo/h;)V

    return-void
.end method

.method public final m0()V
    .locals 14

    invoke-virtual {p0}, Lrm/u;->B0()V

    invoke-virtual {p0}, Lrm/u;->d0()Z

    move-result v0

    iget-object v1, p0, Lrm/u;->b0:Lrm/c;

    const/4 v2, 0x2

    invoke-virtual {v1, v2, v0}, Lrm/c;->c(IZ)I

    move-result v1

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    if-eq v1, v3, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    invoke-virtual {p0, v1, v4, v0}, Lrm/u;->y0(IIZ)V

    iget-object v0, p0, Lrm/u;->K0:Lrm/v0;

    iget v1, v0, Lrm/v0;->e:I

    if-eq v1, v3, :cond_1

    return-void

    :cond_1
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lrm/v0;->e(Lcom/google/android/exoplayer2/ExoPlaybackException;)Lrm/v0;

    move-result-object v0

    iget-object v1, v0, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v1}, Lrm/o1;->p()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v2, 0x4

    :cond_2
    invoke-virtual {v0, v2}, Lrm/v0;->g(I)Lrm/v0;

    move-result-object v5

    iget v0, p0, Lrm/u;->i0:I

    add-int/2addr v0, v3

    iput v0, p0, Lrm/u;->i0:I

    iget-object v0, p0, Lrm/u;->L:Lrm/z;

    iget-object v0, v0, Lrm/z;->H:Llo/v;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Llo/v;->b()Llo/u;

    move-result-object v1

    iget-object v0, v0, Llo/v;->a:Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    iput-object v0, v1, Llo/u;->a:Landroid/os/Message;

    invoke-virtual {v1}, Llo/u;->b()V

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v13, -0x1

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x5

    move-object v4, p0

    invoke-virtual/range {v4 .. v13}, Lrm/u;->z0(Lrm/v0;IIZZIJI)V

    return-void
.end method

.method public final n0()V
    .locals 8

    const-string v0, "ExoPlayerImpl"

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Llo/y;->e:Ljava/lang/String;

    sget-object v3, Lrm/a0;->a:Ljava/util/HashSet;

    const-class v3, Lrm/a0;

    monitor-enter v3

    :try_start_0
    sget-object v4, Lrm/a0;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v3

    const/16 v3, 0x24

    invoke-static {v3, v1}, Lq63/c;->b(ILjava/lang/String;)I

    move-result v3

    invoke-static {v3, v2}, Lq63/c;->b(ILjava/lang/String;)I

    move-result v3

    invoke-static {v3, v4}, Lq63/c;->b(ILjava/lang/String;)I

    move-result v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Release "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " [ExoPlayerLib/2.17.1] ["

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] ["

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lrm/u;->B0()V

    sget v0, Llo/y;->a:I

    const/16 v1, 0x15

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lrm/u;->q0:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    iput-object v2, p0, Lrm/u;->q0:Landroid/media/AudioTrack;

    :cond_0
    iget-object v0, p0, Lrm/u;->a0:Lf1/p1;

    invoke-virtual {v0}, Lf1/p1;->u()V

    iget-object v0, p0, Lrm/u;->c0:Lrm/j1;

    iget-object v1, v0, Lrm/j1;->h:Ljava/lang/Object;

    check-cast v1, Ld9/e;

    if-eqz v1, :cond_1

    :try_start_1
    iget-object v3, v0, Lrm/j1;->d:Ljava/lang/Object;

    check-cast v3, Landroid/content/Context;

    invoke-virtual {v3, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v3, "StreamVolumeManager"

    const-string v4, "Error unregistering stream volume receiver"

    invoke-static {v3, v4, v1}, Llo/a;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_0
    iput-object v2, v0, Lrm/j1;->h:Ljava/lang/Object;

    :cond_1
    iget-object v0, p0, Lrm/u;->d0:Lng3/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lrm/u;->e0:Lng3/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lrm/u;->b0:Lrm/c;

    iput-object v2, v0, Lrm/c;->c:Lrm/r;

    invoke-virtual {v0}, Lrm/c;->a()V

    iget-object v0, p0, Lrm/u;->L:Lrm/z;

    monitor-enter v0

    :try_start_2
    iget-boolean v1, v0, Lrm/z;->Y:Z

    const/4 v3, 0x1

    if-nez v1, :cond_3

    iget-object v1, v0, Lrm/z;->I:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, v0, Lrm/z;->H:Llo/v;

    const/4 v4, 0x7

    invoke-virtual {v1, v4}, Llo/v;->c(I)Z

    new-instance v1, Lb9/n;

    const/4 v4, 0x4

    invoke-direct {v1, v0, v4}, Lb9/n;-><init>(Ljava/lang/Object;I)V

    iget-wide v4, v0, Lrm/z;->U:J

    invoke-virtual {v0, v1, v4, v5}, Lrm/z;->g0(Lb9/n;J)V

    iget-boolean v1, v0, Lrm/z;->Y:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    goto :goto_2

    :catchall_0
    move-exception v1

    goto/16 :goto_5

    :cond_3
    :goto_1
    monitor-exit v0

    move v1, v3

    :goto_2
    if-nez v1, :cond_4

    iget-object v0, p0, Lrm/u;->M:Ld9/p;

    new-instance v1, Lqa/b;

    const/16 v4, 0xb

    invoke-direct {v1, v4}, Lqa/b;-><init>(I)V

    const/16 v4, 0xa

    invoke-virtual {v0, v4, v1}, Ld9/p;->i(ILlo/h;)V

    :cond_4
    iget-object v0, p0, Lrm/u;->M:Ld9/p;

    iget-object v1, v0, Ld9/p;->e:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_5
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Llo/j;

    iget-object v6, v0, Ld9/p;->d:Ljava/lang/Object;

    check-cast v6, Llo/i;

    iput-boolean v3, v5, Llo/j;->d:Z

    iget-boolean v7, v5, Llo/j;->c:Z

    if-eqz v7, :cond_5

    iget-object v7, v5, Llo/j;->a:Ljava/lang/Object;

    iget-object v5, v5, Llo/j;->b:Llo/e;

    invoke-virtual {v5}, Llo/e;->b()Llo/f;

    move-result-object v5

    invoke-interface {v6, v7, v5}, Llo/i;->a(Ljava/lang/Object;Llo/f;)V

    goto :goto_3

    :cond_6
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    iput-boolean v3, v0, Ld9/p;->a:Z

    iget-object v0, p0, Lrm/u;->J:Llo/v;

    iget-object v0, v0, Llo/v;->a:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Lrm/u;->U:Lko/e;

    iget-object v1, p0, Lrm/u;->S:Lsm/d;

    check-cast v0, Lko/q;

    iget-object v0, v0, Lko/q;->b:Lko/d;

    iget-object v0, v0, Lko/d;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_7
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lko/c;

    iget-object v6, v5, Lko/c;->b:Lsm/d;

    if-ne v6, v1, :cond_7

    iput-boolean v3, v5, Lko/c;->c:Z

    invoke-virtual {v0, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    iget-object v0, p0, Lrm/u;->K0:Lrm/v0;

    invoke-virtual {v0, v3}, Lrm/v0;->g(I)Lrm/v0;

    move-result-object v0

    iput-object v0, p0, Lrm/u;->K0:Lrm/v0;

    iget-object v1, v0, Lrm/v0;->b:Lsn/v;

    invoke-virtual {v0, v1}, Lrm/v0;->a(Lsn/v;)Lrm/v0;

    move-result-object v0

    iput-object v0, p0, Lrm/u;->K0:Lrm/v0;

    iget-wide v3, v0, Lrm/v0;->s:J

    iput-wide v3, v0, Lrm/v0;->q:J

    iget-object v0, p0, Lrm/u;->K0:Lrm/v0;

    const-wide/16 v3, 0x0

    iput-wide v3, v0, Lrm/v0;->r:J

    iget-object v0, p0, Lrm/u;->S:Lsm/d;

    iget-object v1, v0, Lsm/d;->H:Llo/v;

    invoke-static {v1}, Llo/a;->j(Ljava/lang/Object;)V

    new-instance v3, Llr/e;

    const/16 v4, 0x14

    invoke-direct {v3, v0, v4}, Llr/e;-><init>(Ljava/lang/Object;I)V

    iget-object v0, v1, Llo/v;->a:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-virtual {p0}, Lrm/u;->p0()V

    iget-object v0, p0, Lrm/u;->s0:Landroid/view/Surface;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    iput-object v2, p0, Lrm/u;->s0:Landroid/view/Surface;

    :cond_9
    sget-object v0, Lzr/w0;->E:Lzr/w0;

    iput-object v0, p0, Lrm/u;->E0:Ljava/util/List;

    return-void

    :goto_5
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1

    :catchall_1
    move-exception v0

    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0
.end method

.method public final o0(Lrm/z0;)V
    .locals 7

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lrm/u;->M:Ld9/p;

    iget-object v1, v0, Ld9/p;->e:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llo/j;

    iget-object v4, v3, Llo/j;->a:Ljava/lang/Object;

    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, v0, Ld9/p;->d:Ljava/lang/Object;

    check-cast v4, Llo/i;

    const/4 v5, 0x1

    iput-boolean v5, v3, Llo/j;->d:Z

    iget-boolean v5, v3, Llo/j;->c:Z

    if-eqz v5, :cond_1

    iget-object v5, v3, Llo/j;->a:Ljava/lang/Object;

    iget-object v6, v3, Llo/j;->b:Llo/e;

    invoke-virtual {v6}, Llo/e;->b()Llo/f;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Llo/i;->a(Ljava/lang/Object;Llo/f;)V

    :cond_1
    invoke-virtual {v1, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final p0()V
    .locals 4

    iget-object v0, p0, Lrm/u;->u0:Lno/m;

    iget-object v1, p0, Lrm/u;->Y:Lrm/r;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrm/u;->Z:Lrm/s;

    invoke-virtual {p0, v0}, Lrm/u;->U(Lrm/c1;)Lrm/d1;

    move-result-object v0

    iget-boolean v3, v0, Lrm/d1;->g:Z

    xor-int/lit8 v3, v3, 0x1

    invoke-static {v3}, Llo/a;->i(Z)V

    const/16 v3, 0x2710

    iput v3, v0, Lrm/d1;->d:I

    iget-boolean v3, v0, Lrm/d1;->g:Z

    xor-int/lit8 v3, v3, 0x1

    invoke-static {v3}, Llo/a;->i(Z)V

    iput-object v2, v0, Lrm/d1;->e:Ljava/lang/Object;

    invoke-virtual {v0}, Lrm/d1;->c()V

    iget-object v0, p0, Lrm/u;->u0:Lno/m;

    iget-object v0, v0, Lno/m;->w:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    iput-object v2, p0, Lrm/u;->u0:Lno/m;

    :cond_0
    iget-object v0, p0, Lrm/u;->w0:Landroid/view/TextureView;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    move-result-object v0

    if-eq v0, v1, :cond_1

    const-string v0, "ExoPlayerImpl"

    const-string v3, "SurfaceTextureListener already unset or replaced."

    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lrm/u;->w0:Landroid/view/TextureView;

    invoke-virtual {v0, v2}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    :goto_0
    iput-object v2, p0, Lrm/u;->w0:Landroid/view/TextureView;

    :cond_2
    iget-object v0, p0, Lrm/u;->t0:Landroid/view/SurfaceHolder;

    if-eqz v0, :cond_3

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    iput-object v2, p0, Lrm/u;->t0:Landroid/view/SurfaceHolder;

    :cond_3
    return-void
.end method

.method public final q0(IJ)V
    .locals 10

    invoke-virtual {p0}, Lrm/u;->B0()V

    iget-object v2, p0, Lrm/u;->S:Lsm/d;

    iget-boolean v3, v2, Lsm/d;->I:Z

    const/4 v4, 0x1

    if-nez v3, :cond_0

    invoke-virtual {v2}, Lsm/d;->t()Lsm/a;

    move-result-object v3

    iput-boolean v4, v2, Lsm/d;->I:Z

    new-instance v5, Lsm/b;

    const/4 v6, 0x3

    invoke-direct {v5, v6}, Lsm/b;-><init>(I)V

    const/4 v6, -0x1

    invoke-virtual {v2, v3, v6, v5}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    :cond_0
    iget-object v2, p0, Lrm/u;->K0:Lrm/v0;

    iget-object v2, v2, Lrm/v0;->a:Lrm/o1;

    if-ltz p1, :cond_4

    invoke-virtual {v2}, Lrm/o1;->p()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Lrm/o1;->o()I

    move-result v3

    if-ge p1, v3, :cond_4

    :cond_1
    iget v3, p0, Lrm/u;->i0:I

    add-int/2addr v3, v4

    iput v3, p0, Lrm/u;->i0:I

    invoke-virtual {p0}, Lrm/u;->i0()Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v1, "ExoPlayerImpl"

    const-string v2, "seekTo ignored because an ad is playing"

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v1, Lrm/x;

    iget-object v2, p0, Lrm/u;->K0:Lrm/v0;

    invoke-direct {v1, v2}, Lrm/x;-><init>(Lrm/v0;)V

    invoke-virtual {v1, v4}, Lrm/x;->a(I)V

    iget-object v2, p0, Lrm/u;->K:Lrm/m;

    iget-object v2, v2, Lrm/m;->w:Lrm/u;

    iget-object v3, v2, Lrm/u;->J:Llo/v;

    new-instance v4, Lr5/b;

    const/4 v5, 0x7

    invoke-direct {v4, v5, v2, v1}, Lr5/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, v3, Llo/v;->a:Landroid/os/Handler;

    invoke-virtual {v1, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_2
    invoke-virtual {p0}, Lrm/u;->e0()I

    move-result v3

    if-ne v3, v4, :cond_3

    goto :goto_0

    :cond_3
    const/4 v4, 0x2

    :goto_0
    invoke-virtual {p0}, Lrm/u;->Y()I

    move-result v9

    iget-object v3, p0, Lrm/u;->K0:Lrm/v0;

    invoke-virtual {v3, v4}, Lrm/v0;->g(I)Lrm/v0;

    move-result-object v3

    invoke-virtual {p0, v2, p1, p2, p3}, Lrm/u;->k0(Lrm/o1;IJ)Landroid/util/Pair;

    move-result-object v6

    invoke-virtual {p0, v3, v2, v6}, Lrm/u;->j0(Lrm/v0;Lrm/o1;Landroid/util/Pair;)Lrm/v0;

    move-result-object v3

    invoke-static {p2, p3}, Llo/y;->z(J)J

    move-result-wide v4

    iget-object v6, p0, Lrm/u;->L:Lrm/z;

    iget-object v6, v6, Lrm/z;->H:Llo/v;

    new-instance v7, Lrm/y;

    invoke-direct {v7, v2, p1, v4, v5}, Lrm/y;-><init>(Lrm/o1;IJ)V

    const/4 v1, 0x3

    invoke-virtual {v6, v1, v7}, Llo/v;->a(ILjava/lang/Object;)Llo/u;

    move-result-object v1

    invoke-virtual {v1}, Llo/u;->b()V

    const/4 v6, 0x1

    invoke-virtual {p0, v3}, Lrm/u;->a0(Lrm/v0;)J

    move-result-wide v7

    const/4 v2, 0x0

    move-object v1, v3

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x1

    move-object v0, p0

    invoke-virtual/range {v0 .. v9}, Lrm/u;->z0(Lrm/v0;IIZZIJI)V

    return-void

    :cond_4
    new-instance v0, Lcom/google/android/exoplayer2/IllegalSeekPositionException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final r0(IILjava/lang/Object;)V
    .locals 5

    iget-object v0, p0, Lrm/u;->H:[Lrm/d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget v4, v3, Lrm/d;->w:I

    if-ne v4, p1, :cond_0

    invoke-virtual {p0, v3}, Lrm/u;->U(Lrm/c1;)Lrm/d1;

    move-result-object v3

    iget-boolean v4, v3, Lrm/d1;->g:Z

    xor-int/lit8 v4, v4, 0x1

    invoke-static {v4}, Llo/a;->i(Z)V

    iput p2, v3, Lrm/d1;->d:I

    iget-boolean v4, v3, Lrm/d1;->g:Z

    xor-int/lit8 v4, v4, 0x1

    invoke-static {v4}, Llo/a;->i(Z)V

    iput-object p3, v3, Lrm/d1;->e:Ljava/lang/Object;

    invoke-virtual {v3}, Lrm/d1;->c()V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final s0(Landroid/view/SurfaceHolder;)V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lrm/u;->v0:Z

    iput-object p1, p0, Lrm/u;->t0:Landroid/view/SurfaceHolder;

    iget-object v1, p0, Lrm/u;->Y:Lrm/r;

    invoke-interface {p1, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    iget-object p1, p0, Lrm/u;->t0:Landroid/view/SurfaceHolder;

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/Surface;->isValid()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lrm/u;->t0:Landroid/view/SurfaceHolder;

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lrm/u;->l0(II)V

    return-void

    :cond_0
    invoke-virtual {p0, v0, v0}, Lrm/u;->l0(II)V

    return-void
.end method

.method public final t0(Z)V
    .locals 2

    invoke-virtual {p0}, Lrm/u;->B0()V

    iget-object v0, p0, Lrm/u;->b0:Lrm/c;

    invoke-virtual {p0}, Lrm/u;->e0()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Lrm/c;->c(IZ)I

    move-result v0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    if-eq v0, v1, :cond_0

    const/4 v1, 0x2

    :cond_0
    invoke-virtual {p0, v0, v1, p1}, Lrm/u;->y0(IIZ)V

    return-void
.end method

.method public final u0(I)V
    .locals 4

    invoke-virtual {p0}, Lrm/u;->B0()V

    iget v0, p0, Lrm/u;->g0:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lrm/u;->g0:I

    iget-object v0, p0, Lrm/u;->L:Lrm/z;

    iget-object v0, v0, Lrm/z;->H:Llo/v;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Llo/v;->b()Llo/u;

    move-result-object v1

    iget-object v0, v0, Llo/v;->a:Landroid/os/Handler;

    const/16 v2, 0xb

    const/4 v3, 0x0

    invoke-virtual {v0, v2, p1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v0

    iput-object v0, v1, Llo/u;->a:Landroid/os/Message;

    invoke-virtual {v1}, Llo/u;->b()V

    new-instance v0, Lb9/t;

    const/4 v1, 0x4

    invoke-direct {v0, p1, v1}, Lb9/t;-><init>(II)V

    iget-object p1, p0, Lrm/u;->M:Ld9/p;

    const/16 v1, 0x8

    invoke-virtual {p1, v1, v0}, Ld9/p;->g(ILlo/h;)V

    invoke-virtual {p0}, Lrm/u;->x0()V

    invoke-virtual {p1}, Ld9/p;->b()V

    :cond_0
    return-void
.end method

.method public final v0(Lio/w;)V
    .locals 3

    invoke-virtual {p0}, Lrm/u;->B0()V

    iget-object v0, p0, Lrm/u;->I:Lio/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v0, Lio/m;

    iget-object v1, v0, Lio/m;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/f;

    invoke-virtual {p1, v2}, Lio/w;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    instance-of v2, p1, Lio/f;

    if-eqz v2, :cond_1

    move-object v2, p1

    check-cast v2, Lio/f;

    invoke-virtual {v0, v2}, Lio/m;->f(Lio/f;)V

    :cond_1
    new-instance v2, Lio/g;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/f;

    invoke-direct {v2, v1}, Lio/g;-><init>(Lio/f;)V

    invoke-virtual {v2, p1}, Lio/v;->b(Lio/w;)V

    new-instance v1, Lio/f;

    invoke-direct {v1, v2}, Lio/f;-><init>(Lio/g;)V

    invoke-virtual {v0, v1}, Lio/m;->f(Lio/f;)V

    new-instance v0, Lmm/d;

    const/16 v1, 0x1d

    invoke-direct {v0, p1, v1}, Lmm/d;-><init>(Ljava/lang/Object;I)V

    iget-object p1, p0, Lrm/u;->M:Ld9/p;

    const/16 v1, 0x13

    invoke-virtual {p1, v1, v0}, Ld9/p;->i(ILlo/h;)V

    return-void
.end method

.method public final w0(Ljava/lang/Object;)V
    .locals 11

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, p0, Lrm/u;->H:[Lrm/d;

    array-length v4, v3

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    const/4 v7, 0x2

    const/4 v8, 0x1

    if-ge v6, v4, :cond_1

    aget-object v9, v3, v6

    iget v10, v9, Lrm/d;->w:I

    if-ne v10, v7, :cond_0

    invoke-virtual {p0, v9}, Lrm/u;->U(Lrm/c1;)Lrm/d1;

    move-result-object v7

    iget-boolean v9, v7, Lrm/d1;->g:Z

    xor-int/2addr v9, v8

    invoke-static {v9}, Llo/a;->i(Z)V

    iput v8, v7, Lrm/d1;->d:I

    iget-boolean v9, v7, Lrm/d1;->g:Z

    xor-int/2addr v8, v9

    invoke-static {v8}, Llo/a;->i(Z)V

    iput-object p1, v7, Lrm/d1;->e:Ljava/lang/Object;

    invoke-virtual {v7}, Lrm/d1;->c()V

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lrm/u;->r0:Ljava/lang/Object;

    if-eqz v3, :cond_3

    if-eq v3, p1, :cond_3

    :try_start_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lrm/d1;

    iget-wide v9, p0, Lrm/u;->f0:J

    invoke-virtual {v3, v9, v10}, Lrm/d1;->a(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move v2, v8

    goto :goto_2

    :catch_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    :cond_2
    move v2, v5

    :goto_2
    iget-object v3, p0, Lrm/u;->r0:Ljava/lang/Object;

    iget-object v4, p0, Lrm/u;->s0:Landroid/view/Surface;

    if-ne v3, v4, :cond_4

    invoke-virtual {v4}, Landroid/view/Surface;->release()V

    const/4 v3, 0x0

    iput-object v3, p0, Lrm/u;->s0:Landroid/view/Surface;

    goto :goto_3

    :cond_3
    move v2, v5

    :cond_4
    :goto_3
    iput-object p1, p0, Lrm/u;->r0:Ljava/lang/Object;

    if-eqz v2, :cond_6

    new-instance v1, Lcom/google/android/exoplayer2/ExoTimeoutException;

    const-string v2, "Detaching surface timed out."

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    new-instance v2, Lcom/google/android/exoplayer2/ExoPlaybackException;

    const/16 v3, 0x3eb

    invoke-direct {v2, v7, v1, v3}, Lcom/google/android/exoplayer2/ExoPlaybackException;-><init>(ILjava/lang/Exception;I)V

    iget-object v1, p0, Lrm/u;->K0:Lrm/v0;

    iget-object v3, v1, Lrm/v0;->b:Lsn/v;

    invoke-virtual {v1, v3}, Lrm/v0;->a(Lsn/v;)Lrm/v0;

    move-result-object v1

    iget-wide v3, v1, Lrm/v0;->s:J

    iput-wide v3, v1, Lrm/v0;->q:J

    const-wide/16 v3, 0x0

    iput-wide v3, v1, Lrm/v0;->r:J

    invoke-virtual {v1, v8}, Lrm/v0;->g(I)Lrm/v0;

    move-result-object v1

    invoke-virtual {v1, v2}, Lrm/v0;->e(Lcom/google/android/exoplayer2/ExoPlaybackException;)Lrm/v0;

    move-result-object v1

    iget v2, p0, Lrm/u;->i0:I

    add-int/2addr v2, v8

    iput v2, p0, Lrm/u;->i0:I

    iget-object v2, p0, Lrm/u;->L:Lrm/z;

    iget-object v2, v2, Lrm/z;->H:Llo/v;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Llo/v;->b()Llo/u;

    move-result-object v3

    iget-object v2, v2, Llo/v;->a:Landroid/os/Handler;

    const/4 v4, 0x6

    invoke-virtual {v2, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    iput-object v2, v3, Llo/u;->a:Landroid/os/Message;

    invoke-virtual {v3}, Llo/u;->b()V

    iget-object v2, v1, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v2}, Lrm/o1;->p()Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lrm/u;->K0:Lrm/v0;

    iget-object v2, v2, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v2}, Lrm/o1;->p()Z

    move-result v2

    if-nez v2, :cond_5

    move v5, v8

    :cond_5
    invoke-virtual {p0, v1}, Lrm/u;->a0(Lrm/v0;)J

    move-result-wide v7

    const/4 v9, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v6, 0x4

    move-object v0, p0

    invoke-virtual/range {v0 .. v9}, Lrm/u;->z0(Lrm/v0;IIZZIJI)V

    :cond_6
    return-void
.end method

.method public final x0()V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lrm/u;->o0:Lrm/x0;

    sget v2, Llo/y;->a:I

    iget-object v2, v0, Lrm/u;->G:Lrm/u;

    invoke-virtual {v2}, Lrm/u;->i0()Z

    move-result v3

    invoke-virtual {v2}, La2/a;->D()Z

    move-result v4

    invoke-virtual {v2}, Lrm/u;->b0()Lrm/o1;

    move-result-object v5

    invoke-virtual {v5}, Lrm/o1;->p()Z

    move-result v6

    const/4 v8, 0x1

    const/4 v9, -0x1

    if-eqz v6, :cond_0

    move v5, v9

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lrm/u;->Y()I

    move-result v6

    invoke-virtual {v2}, Lrm/u;->B0()V

    iget v10, v2, Lrm/u;->g0:I

    if-ne v10, v8, :cond_1

    const/4 v10, 0x0

    :cond_1
    invoke-virtual {v2}, Lrm/u;->B0()V

    iget-boolean v11, v2, Lrm/u;->h0:Z

    invoke-virtual {v5, v6, v10, v11}, Lrm/o1;->k(IIZ)I

    move-result v5

    :goto_0
    if-eq v5, v9, :cond_2

    move v5, v8

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    invoke-virtual {v2}, Lrm/u;->b0()Lrm/o1;

    move-result-object v6

    invoke-virtual {v6}, Lrm/o1;->p()Z

    move-result v10

    if-eqz v10, :cond_3

    move v6, v9

    goto :goto_2

    :cond_3
    invoke-virtual {v2}, Lrm/u;->Y()I

    move-result v10

    invoke-virtual {v2}, Lrm/u;->B0()V

    iget v11, v2, Lrm/u;->g0:I

    if-ne v11, v8, :cond_4

    const/4 v11, 0x0

    :cond_4
    invoke-virtual {v2}, Lrm/u;->B0()V

    iget-boolean v12, v2, Lrm/u;->h0:Z

    invoke-virtual {v6, v10, v11, v12}, Lrm/o1;->e(IIZ)I

    move-result v6

    :goto_2
    if-eq v6, v9, :cond_5

    move v6, v8

    goto :goto_3

    :cond_5
    const/4 v6, 0x0

    :goto_3
    invoke-virtual {v2}, La2/a;->C()Z

    move-result v9

    invoke-virtual {v2}, La2/a;->B()Z

    move-result v10

    invoke-virtual {v2}, Lrm/u;->b0()Lrm/o1;

    move-result-object v2

    invoke-virtual {v2}, Lrm/o1;->p()Z

    move-result v2

    new-instance v11, Lq30/u0;

    const/16 v12, 0xa

    invoke-direct {v11, v12}, Lq30/u0;-><init>(I)V

    iget-object v13, v11, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v13, Llo/e;

    iget-object v14, v0, Lrm/u;->z:Lrm/x0;

    iget-object v14, v14, Lrm/x0;->w:Llo/f;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v15, 0x0

    :goto_4
    iget-object v7, v14, Llo/f;->a:Landroid/util/SparseBooleanArray;

    invoke-virtual {v7}, Landroid/util/SparseBooleanArray;->size()I

    move-result v7

    if-ge v15, v7, :cond_6

    invoke-virtual {v14, v15}, Llo/f;->a(I)I

    move-result v7

    invoke-virtual {v13, v7}, Llo/e;->a(I)V

    add-int/lit8 v15, v15, 0x1

    goto :goto_4

    :cond_6
    xor-int/lit8 v7, v3, 0x1

    const/4 v14, 0x4

    invoke-virtual {v11, v14, v7}, Lq30/u0;->y(IZ)V

    if-eqz v4, :cond_7

    if-nez v3, :cond_7

    move v14, v8

    goto :goto_5

    :cond_7
    const/4 v14, 0x0

    :goto_5
    const/4 v15, 0x5

    invoke-virtual {v11, v15, v14}, Lq30/u0;->y(IZ)V

    if-eqz v5, :cond_8

    if-nez v3, :cond_8

    move v14, v8

    goto :goto_6

    :cond_8
    const/4 v14, 0x0

    :goto_6
    const/4 v15, 0x6

    invoke-virtual {v11, v15, v14}, Lq30/u0;->y(IZ)V

    if-nez v2, :cond_a

    if-nez v5, :cond_9

    if-eqz v9, :cond_9

    if-eqz v4, :cond_a

    :cond_9
    if-nez v3, :cond_a

    move v5, v8

    goto :goto_7

    :cond_a
    const/4 v5, 0x0

    :goto_7
    const/4 v14, 0x7

    invoke-virtual {v11, v14, v5}, Lq30/u0;->y(IZ)V

    if-eqz v6, :cond_b

    if-nez v3, :cond_b

    move v5, v8

    goto :goto_8

    :cond_b
    const/4 v5, 0x0

    :goto_8
    const/16 v14, 0x8

    invoke-virtual {v11, v14, v5}, Lq30/u0;->y(IZ)V

    if-nez v2, :cond_d

    if-nez v6, :cond_c

    if-eqz v9, :cond_d

    if-eqz v10, :cond_d

    :cond_c
    if-nez v3, :cond_d

    move v2, v8

    goto :goto_9

    :cond_d
    const/4 v2, 0x0

    :goto_9
    const/16 v5, 0x9

    invoke-virtual {v11, v5, v2}, Lq30/u0;->y(IZ)V

    invoke-virtual {v11, v12, v7}, Lq30/u0;->y(IZ)V

    if-eqz v4, :cond_e

    if-nez v3, :cond_e

    move v2, v8

    goto :goto_a

    :cond_e
    const/4 v2, 0x0

    :goto_a
    const/16 v5, 0xb

    invoke-virtual {v11, v5, v2}, Lq30/u0;->y(IZ)V

    if-eqz v4, :cond_f

    if-nez v3, :cond_f

    move v7, v8

    goto :goto_b

    :cond_f
    const/4 v7, 0x0

    :goto_b
    const/16 v2, 0xc

    invoke-virtual {v11, v2, v7}, Lq30/u0;->y(IZ)V

    new-instance v2, Lrm/x0;

    invoke-virtual {v13}, Llo/e;->b()Llo/f;

    move-result-object v3

    invoke-direct {v2, v3}, Lrm/x0;-><init>(Llo/f;)V

    iput-object v2, v0, Lrm/u;->o0:Lrm/x0;

    invoke-virtual {v2, v1}, Lrm/x0;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    new-instance v1, Lrm/m;

    invoke-direct {v1, v0}, Lrm/m;-><init>(Lrm/u;)V

    iget-object v2, v0, Lrm/u;->M:Ld9/p;

    const/16 v3, 0xd

    invoke-virtual {v2, v3, v1}, Ld9/p;->g(ILlo/h;)V

    :cond_10
    return-void
.end method

.method public final y0(IIZ)V
    .locals 10

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz p3, :cond_0

    const/4 v4, -0x1

    if-eq p1, v4, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    if-eqz v4, :cond_1

    if-eq p1, v3, :cond_1

    move v2, v3

    :cond_1
    iget-object v1, p0, Lrm/u;->K0:Lrm/v0;

    iget-boolean v5, v1, Lrm/v0;->l:Z

    if-ne v5, v4, :cond_2

    iget v5, v1, Lrm/v0;->m:I

    if-ne v5, v2, :cond_2

    return-void

    :cond_2
    iget v5, p0, Lrm/u;->i0:I

    add-int/2addr v5, v3

    iput v5, p0, Lrm/u;->i0:I

    invoke-virtual {v1, v2, v4}, Lrm/v0;->d(IZ)Lrm/v0;

    move-result-object v1

    iget-object v5, p0, Lrm/u;->L:Lrm/z;

    iget-object v5, v5, Lrm/z;->H:Llo/v;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Llo/v;->b()Llo/u;

    move-result-object v6

    iget-object v5, v5, Llo/v;->a:Landroid/os/Handler;

    invoke-virtual {v5, v3, v4, v2}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v2

    iput-object v2, v6, Llo/u;->a:Landroid/os/Message;

    invoke-virtual {v6}, Llo/u;->b()V

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v9, -0x1

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x5

    move-object v0, p0

    move v3, p2

    invoke-virtual/range {v0 .. v9}, Lrm/u;->z0(Lrm/v0;IIZZIJI)V

    return-void
.end method

.method public final z0(Lrm/v0;IIZZIJI)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p6

    iget-object v3, v0, Lrm/u;->K0:Lrm/v0;

    iput-object v1, v0, Lrm/u;->K0:Lrm/v0;

    iget-object v4, v3, Lrm/v0;->a:Lrm/o1;

    iget-object v5, v1, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v4, v5}, Lrm/o1;->equals(Ljava/lang/Object;)Z

    move-result v4

    iget-object v5, v0, La2/a;->x:Ljava/lang/Object;

    check-cast v5, Lrm/n1;

    iget-object v6, v0, Lrm/u;->O:Lrm/m1;

    const/4 v7, -0x1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iget-object v9, v3, Lrm/v0;->a:Lrm/o1;

    iget-object v10, v3, Lrm/v0;->b:Lsn/v;

    iget-object v11, v1, Lrm/v0;->a:Lrm/o1;

    iget-object v12, v1, Lrm/v0;->b:Lsn/v;

    invoke-virtual {v11}, Lrm/o1;->p()Z

    move-result v13

    const/16 v16, 0x0

    const-wide/16 v14, 0x0

    if-eqz v13, :cond_0

    invoke-virtual {v9}, Lrm/o1;->p()Z

    move-result v13

    if-eqz v13, :cond_0

    new-instance v4, Landroid/util/Pair;

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v4, v5, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v17, 0x3

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v11}, Lrm/o1;->p()Z

    move-result v13

    const/16 v17, 0x3

    invoke-virtual {v9}, Lrm/o1;->p()Z

    move-result v7

    if-eq v13, v7, :cond_1

    new-instance v4, Landroid/util/Pair;

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object v7, v10, Lsn/t;->a:Ljava/lang/Object;

    invoke-virtual {v9, v7, v6}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    move-result-object v7

    iget v7, v7, Lrm/m1;->y:I

    invoke-virtual {v9, v7, v5, v14, v15}, Lrm/o1;->m(ILrm/n1;J)Lrm/n1;

    move-result-object v7

    iget-object v7, v7, Lrm/n1;->w:Ljava/lang/Object;

    iget-object v9, v12, Lsn/t;->a:Ljava/lang/Object;

    invoke-virtual {v11, v9, v6}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    move-result-object v6

    iget v6, v6, Lrm/m1;->y:I

    invoke-virtual {v11, v6, v5, v14, v15}, Lrm/o1;->m(ILrm/n1;J)Lrm/n1;

    move-result-object v5

    iget-object v5, v5, Lrm/n1;->w:Ljava/lang/Object;

    invoke-virtual {v7, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    if-eqz p5, :cond_2

    if-nez v2, :cond_2

    const/4 v5, 0x1

    goto :goto_0

    :cond_2
    if-eqz p5, :cond_3

    const/4 v5, 0x1

    if-ne v2, v5, :cond_3

    const/4 v5, 0x2

    goto :goto_0

    :cond_3
    if-nez v4, :cond_4

    move/from16 v5, v17

    :goto_0
    new-instance v4, Landroid/util/Pair;

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-direct {v4, v6, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_5
    if-eqz p5, :cond_6

    if-nez v2, :cond_6

    iget-wide v4, v10, Lsn/t;->d:J

    iget-wide v6, v12, Lsn/t;->d:J

    cmp-long v4, v4, v6

    if-gez v4, :cond_6

    new-instance v4, Landroid/util/Pair;

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_6
    new-instance v4, Landroid/util/Pair;

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v4, v5, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    iget-object v5, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v6, v0, Lrm/u;->p0:Lrm/m0;

    if-eqz v5, :cond_8

    iget-object v8, v1, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v8}, Lrm/o1;->p()Z

    move-result v8

    if-nez v8, :cond_7

    iget-object v8, v1, Lrm/v0;->a:Lrm/o1;

    iget-object v9, v1, Lrm/v0;->b:Lsn/v;

    iget-object v9, v9, Lsn/t;->a:Ljava/lang/Object;

    iget-object v10, v0, Lrm/u;->O:Lrm/m1;

    invoke-virtual {v8, v9, v10}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    move-result-object v8

    iget v8, v8, Lrm/m1;->y:I

    iget-object v9, v1, Lrm/v0;->a:Lrm/o1;

    iget-object v10, v0, La2/a;->x:Ljava/lang/Object;

    check-cast v10, Lrm/n1;

    invoke-virtual {v9, v8, v10, v14, v15}, Lrm/o1;->m(ILrm/n1;J)Lrm/n1;

    move-result-object v8

    iget-object v8, v8, Lrm/n1;->y:Lrm/k0;

    goto :goto_2

    :cond_7
    const/4 v8, 0x0

    :goto_2
    sget-object v9, Lrm/m0;->h0:Lrm/m0;

    iput-object v9, v0, Lrm/u;->J0:Lrm/m0;

    goto :goto_3

    :cond_8
    const/4 v8, 0x0

    :goto_3
    if-nez v5, :cond_9

    iget-object v9, v3, Lrm/v0;->j:Ljava/util/List;

    iget-object v10, v1, Lrm/v0;->j:Ljava/util/List;

    invoke-interface {v9, v10}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_c

    :cond_9
    iget-object v6, v0, Lrm/u;->J0:Lrm/m0;

    invoke-virtual {v6}, Lrm/m0;->a()Lrm/l0;

    move-result-object v6

    iget-object v9, v1, Lrm/v0;->j:Ljava/util/List;

    move/from16 v10, v16

    :goto_4
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v11

    if-ge v10, v11, :cond_b

    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lin/c;

    move/from16 v12, v16

    :goto_5
    iget-object v13, v11, Lin/c;->w:[Lin/b;

    array-length v7, v13

    if-ge v12, v7, :cond_a

    aget-object v7, v13, v12

    invoke-interface {v7, v6}, Lin/b;->w(Lrm/l0;)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_5

    :cond_a
    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_b
    new-instance v7, Lrm/m0;

    invoke-direct {v7, v6}, Lrm/m0;-><init>(Lrm/l0;)V

    iput-object v7, v0, Lrm/u;->J0:Lrm/m0;

    invoke-virtual {v0}, Lrm/u;->R()Lrm/m0;

    move-result-object v6

    :cond_c
    iget-object v7, v0, Lrm/u;->p0:Lrm/m0;

    invoke-virtual {v6, v7}, Lrm/m0;->equals(Ljava/lang/Object;)Z

    move-result v7

    iput-object v6, v0, Lrm/u;->p0:Lrm/m0;

    iget-boolean v6, v3, Lrm/v0;->l:Z

    iget-boolean v9, v1, Lrm/v0;->l:Z

    if-eq v6, v9, :cond_d

    const/4 v6, 0x1

    goto :goto_6

    :cond_d
    move/from16 v6, v16

    :goto_6
    iget v9, v3, Lrm/v0;->e:I

    iget v10, v1, Lrm/v0;->e:I

    if-eq v9, v10, :cond_e

    const/4 v9, 0x1

    goto :goto_7

    :cond_e
    move/from16 v9, v16

    :goto_7
    if-nez v9, :cond_f

    if-eqz v6, :cond_10

    :cond_f
    invoke-virtual {v0}, Lrm/u;->A0()V

    :cond_10
    iget-boolean v10, v3, Lrm/v0;->g:Z

    iget-boolean v11, v1, Lrm/v0;->g:Z

    if-eq v10, v11, :cond_11

    const/4 v10, 0x1

    goto :goto_8

    :cond_11
    move/from16 v10, v16

    :goto_8
    iget-object v11, v3, Lrm/v0;->a:Lrm/o1;

    iget-object v12, v1, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v11, v12}, Lrm/o1;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_12

    iget-object v11, v0, Lrm/u;->M:Ld9/p;

    new-instance v12, Lrm/n;

    const/4 v13, 0x0

    move/from16 v14, p2

    invoke-direct {v12, v1, v14, v13}, Lrm/n;-><init>(Lrm/v0;II)V

    move/from16 v13, v16

    invoke-virtual {v11, v13, v12}, Ld9/p;->g(ILlo/h;)V

    :cond_12
    if-eqz p5, :cond_1a

    new-instance v11, Lrm/m1;

    invoke-direct {v11}, Lrm/m1;-><init>()V

    iget-object v12, v3, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v12}, Lrm/o1;->p()Z

    move-result v12

    if-nez v12, :cond_13

    iget-object v12, v3, Lrm/v0;->b:Lsn/v;

    iget-object v12, v12, Lsn/t;->a:Ljava/lang/Object;

    iget-object v13, v3, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v13, v12, v11}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    iget v13, v11, Lrm/m1;->y:I

    iget-object v14, v3, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v14, v12}, Lrm/o1;->b(Ljava/lang/Object;)I

    move-result v14

    iget-object v15, v3, Lrm/v0;->a:Lrm/o1;

    move/from16 v16, v5

    iget-object v5, v0, La2/a;->x:Ljava/lang/Object;

    check-cast v5, Lrm/n1;

    move/from16 v19, v6

    move/from16 v18, v7

    const-wide/16 v6, 0x0

    invoke-virtual {v15, v13, v5, v6, v7}, Lrm/o1;->m(ILrm/n1;J)Lrm/n1;

    move-result-object v5

    iget-object v5, v5, Lrm/n1;->w:Ljava/lang/Object;

    iget-object v6, v0, La2/a;->x:Ljava/lang/Object;

    check-cast v6, Lrm/n1;

    iget-object v6, v6, Lrm/n1;->y:Lrm/k0;

    move-object/from16 v21, v5

    move-object/from16 v23, v6

    move-object/from16 v24, v12

    move/from16 v22, v13

    move/from16 v25, v14

    goto :goto_9

    :cond_13
    move/from16 v16, v5

    move/from16 v19, v6

    move/from16 v18, v7

    move/from16 v22, p9

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, -0x1

    :goto_9
    if-nez v2, :cond_16

    iget-object v5, v3, Lrm/v0;->b:Lsn/v;

    invoke-virtual {v5}, Lsn/t;->a()Z

    move-result v5

    if-eqz v5, :cond_14

    iget-object v5, v3, Lrm/v0;->b:Lsn/v;

    iget v6, v5, Lsn/t;->b:I

    iget v5, v5, Lsn/t;->c:I

    invoke-virtual {v11, v6, v5}, Lrm/m1;->a(II)J

    move-result-wide v5

    invoke-static {v3}, Lrm/u;->f0(Lrm/v0;)J

    move-result-wide v11

    goto :goto_c

    :cond_14
    iget-object v5, v3, Lrm/v0;->b:Lsn/v;

    iget v5, v5, Lsn/t;->e:I

    const/4 v6, -0x1

    if-eq v5, v6, :cond_15

    iget-object v5, v0, Lrm/u;->K0:Lrm/v0;

    invoke-static {v5}, Lrm/u;->f0(Lrm/v0;)J

    move-result-wide v5

    :goto_a
    move-wide v11, v5

    goto :goto_c

    :cond_15
    iget-wide v5, v11, Lrm/m1;->E:J

    iget-wide v11, v11, Lrm/m1;->z:J

    :goto_b
    add-long/2addr v5, v11

    goto :goto_a

    :cond_16
    iget-object v5, v3, Lrm/v0;->b:Lsn/v;

    invoke-virtual {v5}, Lsn/t;->a()Z

    move-result v5

    if-eqz v5, :cond_17

    iget-wide v5, v3, Lrm/v0;->s:J

    invoke-static {v3}, Lrm/u;->f0(Lrm/v0;)J

    move-result-wide v11

    goto :goto_c

    :cond_17
    iget-wide v5, v11, Lrm/m1;->E:J

    iget-wide v11, v3, Lrm/v0;->s:J

    goto :goto_b

    :goto_c
    new-instance v20, Lrm/a1;

    invoke-static {v5, v6}, Llo/y;->G(J)J

    move-result-wide v26

    invoke-static {v11, v12}, Llo/y;->G(J)J

    move-result-wide v28

    iget-object v5, v3, Lrm/v0;->b:Lsn/v;

    iget v6, v5, Lsn/t;->b:I

    iget v5, v5, Lsn/t;->c:I

    move/from16 v31, v5

    move/from16 v30, v6

    invoke-direct/range {v20 .. v31}, Lrm/a1;-><init>(Ljava/lang/Object;ILrm/k0;Ljava/lang/Object;IJJII)V

    move-object/from16 v5, v20

    iget-object v6, v0, La2/a;->x:Ljava/lang/Object;

    check-cast v6, Lrm/n1;

    invoke-virtual {v0}, Lrm/u;->Y()I

    move-result v7

    iget-object v11, v0, Lrm/u;->K0:Lrm/v0;

    iget-object v11, v11, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v11}, Lrm/o1;->p()Z

    move-result v11

    if-nez v11, :cond_18

    iget-object v11, v0, Lrm/u;->K0:Lrm/v0;

    iget-object v12, v11, Lrm/v0;->b:Lsn/v;

    iget-object v12, v12, Lsn/t;->a:Ljava/lang/Object;

    iget-object v11, v11, Lrm/v0;->a:Lrm/o1;

    iget-object v13, v0, Lrm/u;->O:Lrm/m1;

    invoke-virtual {v11, v12, v13}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    iget-object v11, v0, Lrm/u;->K0:Lrm/v0;

    iget-object v11, v11, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v11, v12}, Lrm/o1;->b(Ljava/lang/Object;)I

    move-result v11

    iget-object v13, v0, Lrm/u;->K0:Lrm/v0;

    iget-object v13, v13, Lrm/v0;->a:Lrm/o1;

    const-wide/16 v14, 0x0

    invoke-virtual {v13, v7, v6, v14, v15}, Lrm/o1;->m(ILrm/n1;J)Lrm/n1;

    move-result-object v13

    iget-object v13, v13, Lrm/n1;->w:Ljava/lang/Object;

    iget-object v6, v6, Lrm/n1;->y:Lrm/k0;

    move-object/from16 v23, v6

    move/from16 v25, v11

    move-object/from16 v24, v12

    move-object/from16 v21, v13

    goto :goto_d

    :cond_18
    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, -0x1

    :goto_d
    invoke-static/range {p7 .. p8}, Llo/y;->G(J)J

    move-result-wide v26

    new-instance v20, Lrm/a1;

    iget-object v6, v0, Lrm/u;->K0:Lrm/v0;

    iget-object v6, v6, Lrm/v0;->b:Lsn/v;

    invoke-virtual {v6}, Lsn/t;->a()Z

    move-result v6

    if-eqz v6, :cond_19

    iget-object v6, v0, Lrm/u;->K0:Lrm/v0;

    invoke-static {v6}, Lrm/u;->f0(Lrm/v0;)J

    move-result-wide v11

    invoke-static {v11, v12}, Llo/y;->G(J)J

    move-result-wide v11

    move-wide/from16 v28, v11

    goto :goto_e

    :cond_19
    move-wide/from16 v28, v26

    :goto_e
    iget-object v6, v0, Lrm/u;->K0:Lrm/v0;

    iget-object v6, v6, Lrm/v0;->b:Lsn/v;

    iget v11, v6, Lsn/t;->b:I

    iget v6, v6, Lsn/t;->c:I

    move/from16 v31, v6

    move/from16 v22, v7

    move/from16 v30, v11

    invoke-direct/range {v20 .. v31}, Lrm/a1;-><init>(Ljava/lang/Object;ILrm/k0;Ljava/lang/Object;IJJII)V

    move-object/from16 v6, v20

    iget-object v7, v0, Lrm/u;->M:Ld9/p;

    new-instance v11, Lb9/x;

    const/4 v12, 0x2

    invoke-direct {v11, v5, v2, v6, v12}, Lb9/x;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    const/16 v2, 0xb

    invoke-virtual {v7, v2, v11}, Ld9/p;->g(ILlo/h;)V

    goto :goto_f

    :cond_1a
    move/from16 v16, v5

    move/from16 v19, v6

    move/from16 v18, v7

    :goto_f
    if-eqz v16, :cond_1b

    iget-object v2, v0, Lrm/u;->M:Ld9/p;

    new-instance v5, Lb9/v;

    const/4 v6, 0x3

    invoke-direct {v5, v8, v4, v6}, Lb9/v;-><init>(Ljava/lang/Object;II)V

    const/4 v4, 0x1

    invoke-virtual {v2, v4, v5}, Ld9/p;->g(ILlo/h;)V

    :cond_1b
    iget-object v2, v3, Lrm/v0;->f:Lcom/google/android/exoplayer2/ExoPlaybackException;

    iget-object v4, v1, Lrm/v0;->f:Lcom/google/android/exoplayer2/ExoPlaybackException;

    if-eq v2, v4, :cond_1c

    iget-object v2, v0, Lrm/u;->M:Ld9/p;

    new-instance v4, Lrm/l;

    const/4 v5, 0x0

    invoke-direct {v4, v1, v5}, Lrm/l;-><init>(Lrm/v0;I)V

    const/16 v5, 0xa

    invoke-virtual {v2, v5, v4}, Ld9/p;->g(ILlo/h;)V

    iget-object v2, v1, Lrm/v0;->f:Lcom/google/android/exoplayer2/ExoPlaybackException;

    if-eqz v2, :cond_1c

    iget-object v2, v0, Lrm/u;->M:Ld9/p;

    new-instance v4, Lrm/l;

    const/4 v6, 0x1

    invoke-direct {v4, v1, v6}, Lrm/l;-><init>(Lrm/v0;I)V

    invoke-virtual {v2, v5, v4}, Ld9/p;->g(ILlo/h;)V

    :cond_1c
    iget-object v2, v3, Lrm/v0;->i:Lio/x;

    iget-object v4, v1, Lrm/v0;->i:Lio/x;

    if-eq v2, v4, :cond_1d

    iget-object v2, v0, Lrm/u;->I:Lio/r;

    iget-object v4, v4, Lio/x;->e:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v4, Lio/q;

    new-instance v2, Lio/s;

    iget-object v4, v1, Lrm/v0;->i:Lio/x;

    iget-object v4, v4, Lio/x;->c:[Lio/o;

    invoke-direct {v2, v4}, Lio/s;-><init>([Lio/o;)V

    iget-object v4, v0, Lrm/u;->M:Ld9/p;

    new-instance v5, Lqm2/c;

    const/4 v6, 0x1

    invoke-direct {v5, v6, v1, v2}, Lqm2/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x2

    invoke-virtual {v4, v2, v5}, Ld9/p;->g(ILlo/h;)V

    iget-object v4, v0, Lrm/u;->M:Ld9/p;

    new-instance v5, Lrm/l;

    const/4 v6, 0x2

    invoke-direct {v5, v1, v6}, Lrm/l;-><init>(Lrm/v0;I)V

    invoke-virtual {v4, v2, v5}, Ld9/p;->g(ILlo/h;)V

    :cond_1d
    if-nez v18, :cond_1e

    iget-object v2, v0, Lrm/u;->p0:Lrm/m0;

    iget-object v4, v0, Lrm/u;->M:Ld9/p;

    new-instance v5, Lmm/d;

    const/16 v6, 0x1c

    invoke-direct {v5, v2, v6}, Lmm/d;-><init>(Ljava/lang/Object;I)V

    const/16 v2, 0xe

    invoke-virtual {v4, v2, v5}, Ld9/p;->g(ILlo/h;)V

    :cond_1e
    if-eqz v10, :cond_1f

    iget-object v2, v0, Lrm/u;->M:Ld9/p;

    new-instance v4, Lrm/l;

    const/4 v5, 0x3

    invoke-direct {v4, v1, v5}, Lrm/l;-><init>(Lrm/v0;I)V

    move/from16 v5, v17

    invoke-virtual {v2, v5, v4}, Ld9/p;->g(ILlo/h;)V

    :cond_1f
    if-nez v9, :cond_20

    if-eqz v19, :cond_21

    :cond_20
    iget-object v2, v0, Lrm/u;->M:Ld9/p;

    new-instance v4, Lrm/l;

    const/4 v5, 0x4

    invoke-direct {v4, v1, v5}, Lrm/l;-><init>(Lrm/v0;I)V

    const/4 v6, -0x1

    invoke-virtual {v2, v6, v4}, Ld9/p;->g(ILlo/h;)V

    :cond_21
    if-eqz v9, :cond_22

    iget-object v2, v0, Lrm/u;->M:Ld9/p;

    new-instance v4, Lrm/l;

    const/4 v5, 0x5

    invoke-direct {v4, v1, v5}, Lrm/l;-><init>(Lrm/v0;I)V

    const/4 v5, 0x4

    invoke-virtual {v2, v5, v4}, Ld9/p;->g(ILlo/h;)V

    :cond_22
    if-eqz v19, :cond_23

    iget-object v2, v0, Lrm/u;->M:Ld9/p;

    new-instance v4, Lrm/n;

    const/4 v5, 0x1

    move/from16 v6, p3

    invoke-direct {v4, v1, v6, v5}, Lrm/n;-><init>(Lrm/v0;II)V

    const/4 v5, 0x5

    invoke-virtual {v2, v5, v4}, Ld9/p;->g(ILlo/h;)V

    :cond_23
    iget v2, v3, Lrm/v0;->m:I

    iget v4, v1, Lrm/v0;->m:I

    if-eq v2, v4, :cond_24

    iget-object v2, v0, Lrm/u;->M:Ld9/p;

    new-instance v4, Lrm/l;

    const/4 v5, 0x6

    invoke-direct {v4, v1, v5}, Lrm/l;-><init>(Lrm/v0;I)V

    invoke-virtual {v2, v5, v4}, Ld9/p;->g(ILlo/h;)V

    :cond_24
    invoke-static {v3}, Lrm/u;->h0(Lrm/v0;)Z

    move-result v2

    invoke-static {v1}, Lrm/u;->h0(Lrm/v0;)Z

    move-result v4

    if-eq v2, v4, :cond_25

    iget-object v2, v0, Lrm/u;->M:Ld9/p;

    new-instance v4, Lrm/l;

    const/4 v5, 0x7

    invoke-direct {v4, v1, v5}, Lrm/l;-><init>(Lrm/v0;I)V

    invoke-virtual {v2, v5, v4}, Ld9/p;->g(ILlo/h;)V

    :cond_25
    iget-object v2, v3, Lrm/v0;->n:Lrm/w0;

    iget-object v4, v1, Lrm/v0;->n:Lrm/w0;

    invoke-virtual {v2, v4}, Lrm/w0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_26

    iget-object v2, v0, Lrm/u;->M:Ld9/p;

    new-instance v4, Lrm/l;

    const/16 v5, 0x8

    invoke-direct {v4, v1, v5}, Lrm/l;-><init>(Lrm/v0;I)V

    const/16 v5, 0xc

    invoke-virtual {v2, v5, v4}, Ld9/p;->g(ILlo/h;)V

    :cond_26
    if-eqz p4, :cond_27

    iget-object v2, v0, Lrm/u;->M:Ld9/p;

    new-instance v4, Lqa/b;

    const/16 v5, 0xd

    invoke-direct {v4, v5}, Lqa/b;-><init>(I)V

    const/4 v6, -0x1

    invoke-virtual {v2, v6, v4}, Ld9/p;->g(ILlo/h;)V

    :cond_27
    invoke-virtual {v0}, Lrm/u;->x0()V

    iget-object v2, v0, Lrm/u;->M:Ld9/p;

    invoke-virtual {v2}, Ld9/p;->b()V

    iget-boolean v2, v3, Lrm/v0;->o:Z

    iget-boolean v4, v1, Lrm/v0;->o:Z

    if-eq v2, v4, :cond_28

    iget-object v2, v0, Lrm/u;->N:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_28

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lrm/r;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_10

    :cond_28
    iget-boolean v2, v3, Lrm/v0;->p:Z

    iget-boolean v1, v1, Lrm/v0;->p:Z

    if-eq v2, v1, :cond_29

    iget-object v1, v0, Lrm/u;->N:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_29

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lrm/r;

    iget-object v2, v2, Lrm/r;->w:Lrm/u;

    invoke-virtual {v2}, Lrm/u;->A0()V

    goto :goto_11

    :cond_29
    return-void
.end method

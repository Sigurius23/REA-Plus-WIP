.class public final Lb9/f0;
.super La2/a;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/exoplayer/ExoPlayer;


# instance fields
.field public A0:Z

.field public B0:Lw8/c;

.field public final C0:Z

.field public D0:Z

.field public final E:Lb9/m1;

.field public final E0:I

.field public final F:Landroid/content/Context;

.field public F0:Z

.field public final G:Lb9/f0;

.field public G0:Lu8/y0;

.field public final H:[Lb9/f;

.field public H0:Lu8/a0;

.field public final I:[Lb9/f;

.field public I0:Lb9/c1;

.field public final J:Lb3/b;

.field public J0:I

.field public final K:Lx8/r;

.field public K0:J

.field public final L:Lb9/u;

.field public final M:Lb9/l0;

.field public final N:Lx8/i;

.field public final O:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final P:Lu8/m0;

.field public final Q:Ljava/util/ArrayList;

.field public final R:Z

.field public final S:Ll9/b0;

.field public final T:Lc9/h;

.field public final U:Landroid/os/Looper;

.field public final V:Lp9/d;

.field public final W:J

.field public final X:J

.field public final Y:J

.field public final Z:Lx8/p;

.field public final a0:Lb9/c0;

.field public final b0:Lb9/d0;

.field public final c0:Lb9/b;

.field public final d0:Lb9/m1;

.field public final e0:Lb9/m1;

.field public final f0:J

.field public final g0:Lb30/m;

.field public h0:I

.field public i0:Z

.field public j0:I

.field public k0:I

.field public l0:Z

.field public final m0:Lb9/k1;

.field public n0:Ll9/c1;

.field public final o0:Lb9/q;

.field public p0:Lu8/f0;

.field public q0:Lu8/a0;

.field public r0:Ljava/lang/Object;

.field public s0:Landroid/view/Surface;

.field public t0:Landroid/view/SurfaceHolder;

.field public u0:Ls9/i;

.field public v0:Z

.field public w0:Landroid/view/TextureView;

.field public final x0:I

.field public final y:Lo9/v;

.field public y0:Lx8/o;

.field public final z:Lu8/f0;

.field public z0:Lu8/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "media3.exoplayer"

    invoke-static {v0}, Lu8/y;->a(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lb9/p;)V
    .locals 34

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v3, " [AndroidXMedia3/1.6.1] ["

    const-string v5, "Init "

    const/4 v9, 0x7

    invoke-direct {v1, v9}, La2/a;-><init>(I)V

    new-instance v6, Lb9/m1;

    invoke-direct {v6, v9}, Lb9/m1;-><init>(I)V

    iput-object v6, v1, Lb9/f0;->E:Lb9/m1;

    :try_start_0
    const-string v6, "ExoPlayerImpl"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lx8/t;->b:Ljava/lang/String;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "]"

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Lx8/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v10, v0, Lb9/p;->a:Landroid/content/Context;

    iget-object v3, v0, Lb9/p;->g:Landroid/os/Looper;

    iget-object v5, v0, Lb9/p;->b:Lx8/p;

    invoke-virtual {v10}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    iput-object v6, v1, Lb9/f0;->F:Landroid/content/Context;

    new-instance v6, Lc9/h;

    invoke-direct {v6, v5}, Lc9/h;-><init>(Lx8/p;)V

    iput-object v6, v1, Lb9/f0;->T:Lc9/h;

    iget v6, v0, Lb9/p;->h:I

    iput v6, v1, Lb9/f0;->E0:I

    iget-object v6, v0, Lb9/p;->i:Lu8/d;

    iput-object v6, v1, Lb9/f0;->z0:Lu8/d;

    iget v6, v0, Lb9/p;->k:I

    iput v6, v1, Lb9/f0;->x0:I

    iput-boolean v2, v1, Lb9/f0;->A0:Z

    iget-wide v6, v0, Lb9/p;->s:J

    iput-wide v6, v1, Lb9/f0;->f0:J

    new-instance v13, Lb9/c0;

    invoke-direct {v13, v1}, Lb9/c0;-><init>(Lb9/f0;)V

    iput-object v13, v1, Lb9/f0;->a0:Lb9/c0;

    new-instance v6, Lb9/d0;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iput-object v6, v1, Lb9/f0;->b0:Lb9/d0;

    new-instance v12, Landroid/os/Handler;

    invoke-direct {v12, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iget-object v6, v0, Lb9/p;->c:Lb9/d;

    invoke-virtual {v6}, Lb9/d;->get()Ljava/lang/Object;

    move-result-object v6

    move-object v11, v6

    check-cast v11, Lio/sentry/internal/debugmeta/c;

    move-object v14, v13

    move-object v15, v13

    move-object/from16 v16, v13

    invoke-virtual/range {v11 .. v16}, Lio/sentry/internal/debugmeta/c;->n(Landroid/os/Handler;Lb9/c0;Lb9/c0;Lb9/c0;Lb9/c0;)[Lb9/f;

    move-result-object v6

    iput-object v6, v1, Lb9/f0;->H:[Lb9/f;

    array-length v7, v6

    const/4 v11, 0x1

    if-lez v7, :cond_0

    move v7, v11

    goto :goto_0

    :cond_0
    move v7, v2

    :goto_0
    invoke-static {v7}, Lva3/g;->i(Z)V

    array-length v6, v6

    new-array v6, v6, [Lb9/f;

    iput-object v6, v1, Lb9/f0;->I:[Lb9/f;

    move v6, v2

    :goto_1
    iget-object v7, v1, Lb9/f0;->I:[Lb9/f;

    array-length v8, v7

    const/4 v12, 0x0

    if-ge v6, v8, :cond_1

    iget-object v8, v1, Lb9/f0;->H:[Lb9/f;

    aget-object v8, v8, v6

    iget v8, v8, Lb9/f;->x:I

    aput-object v12, v7, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_1
    iget-object v6, v0, Lb9/p;->e:Lb9/d;

    invoke-virtual {v6}, Lb9/d;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lb3/b;

    iput-object v6, v1, Lb9/f0;->J:Lb3/b;

    iget-object v6, v0, Lb9/p;->d:Lyr/i;

    invoke-interface {v6}, Lyr/i;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll9/b0;

    iput-object v6, v1, Lb9/f0;->S:Ll9/b0;

    iget-object v6, v0, Lb9/p;->f:Lb9/d;

    invoke-virtual {v6}, Lb9/d;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lp9/d;

    iput-object v6, v1, Lb9/f0;->V:Lp9/d;

    iget-boolean v6, v0, Lb9/p;->l:Z

    iput-boolean v6, v1, Lb9/f0;->R:Z

    iget-object v6, v0, Lb9/p;->m:Lb9/k1;

    iput-object v6, v1, Lb9/f0;->m0:Lb9/k1;

    iget-wide v6, v0, Lb9/p;->n:J

    iput-wide v6, v1, Lb9/f0;->W:J

    iget-wide v6, v0, Lb9/p;->o:J

    iput-wide v6, v1, Lb9/f0;->X:J

    iget-wide v6, v0, Lb9/p;->p:J

    iput-wide v6, v1, Lb9/f0;->Y:J

    iput-object v3, v1, Lb9/f0;->U:Landroid/os/Looper;

    iput-object v5, v1, Lb9/f0;->Z:Lx8/p;

    iput-object v1, v1, Lb9/f0;->G:Lb9/f0;

    new-instance v6, Lx8/i;

    new-instance v7, Lb9/u;

    invoke-direct {v7, v1}, Lb9/u;-><init>(Lb9/f0;)V

    invoke-direct {v6, v3, v5, v7}, Lx8/i;-><init>(Landroid/os/Looper;Lx8/p;Lx8/g;)V

    iput-object v6, v1, Lb9/f0;->N:Lx8/i;

    new-instance v3, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v3, v1, Lb9/f0;->O:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v1, Lb9/f0;->Q:Ljava/util/ArrayList;

    new-instance v3, Ll9/c1;

    invoke-direct {v3}, Ll9/c1;-><init>()V

    iput-object v3, v1, Lb9/f0;->n0:Ll9/c1;

    sget-object v3, Lb9/q;->a:Lb9/q;

    iput-object v3, v1, Lb9/f0;->o0:Lb9/q;

    new-instance v3, Lo9/v;

    iget-object v5, v1, Lb9/f0;->H:[Lb9/f;

    array-length v6, v5

    new-array v6, v6, [Lb9/i1;

    array-length v5, v5

    new-array v5, v5, [Lo9/s;

    sget-object v7, Lu8/v0;->b:Lu8/v0;

    invoke-direct {v3, v6, v5, v7, v12}, Lo9/v;-><init>([Lb9/i1;[Lo9/s;Lu8/v0;Ljava/lang/Object;)V

    iput-object v3, v1, Lb9/f0;->y:Lo9/v;

    new-instance v3, Lu8/m0;

    invoke-direct {v3}, Lu8/m0;-><init>()V

    iput-object v3, v1, Lb9/f0;->P:Lu8/m0;

    new-instance v3, Landroid/util/SparseBooleanArray;

    invoke-direct {v3}, Landroid/util/SparseBooleanArray;-><init>()V

    const/16 v5, 0x14

    new-array v6, v5, [I

    fill-array-data v6, :array_0

    move v7, v2

    :goto_2
    if-ge v7, v5, :cond_2

    aget v8, v6, v7

    const/4 v13, 0x0

    xor-int/2addr v13, v11

    invoke-static {v13}, Lva3/g;->i(Z)V

    invoke-virtual {v3, v8, v11}, Landroid/util/SparseBooleanArray;->append(IZ)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_2
    iget-object v5, v1, Lb9/f0;->J:Lb3/b;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x0

    xor-int/2addr v5, v11

    invoke-static {v5}, Lva3/g;->i(Z)V

    const/16 v5, 0x1d

    invoke-virtual {v3, v5, v11}, Landroid/util/SparseBooleanArray;->append(IZ)V

    new-instance v5, Lu8/f0;

    const/4 v6, 0x0

    xor-int/2addr v6, v11

    invoke-static {v6}, Lva3/g;->i(Z)V

    new-instance v6, Lu8/n;

    invoke-direct {v6, v3}, Lu8/n;-><init>(Landroid/util/SparseBooleanArray;)V

    invoke-direct {v5, v6}, Lu8/f0;-><init>(Lu8/n;)V

    iput-object v5, v1, Lb9/f0;->z:Lu8/f0;

    new-instance v3, Landroid/util/SparseBooleanArray;

    invoke-direct {v3}, Landroid/util/SparseBooleanArray;-><init>()V

    move v5, v2

    :goto_3
    iget-object v7, v6, Lu8/n;->a:Landroid/util/SparseBooleanArray;

    invoke-virtual {v7}, Landroid/util/SparseBooleanArray;->size()I

    move-result v7

    if-ge v5, v7, :cond_3

    invoke-virtual {v6, v5}, Lu8/n;->a(I)I

    move-result v7

    const/4 v8, 0x0

    xor-int/2addr v8, v11

    invoke-static {v8}, Lva3/g;->i(Z)V

    invoke-virtual {v3, v7, v11}, Landroid/util/SparseBooleanArray;->append(IZ)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    xor-int/2addr v5, v11

    invoke-static {v5}, Lva3/g;->i(Z)V

    const/4 v13, 0x4

    invoke-virtual {v3, v13, v11}, Landroid/util/SparseBooleanArray;->append(IZ)V

    const/4 v5, 0x0

    xor-int/2addr v5, v11

    invoke-static {v5}, Lva3/g;->i(Z)V

    const/16 v5, 0xa

    invoke-virtual {v3, v5, v11}, Landroid/util/SparseBooleanArray;->append(IZ)V

    new-instance v5, Lu8/f0;

    const/4 v6, 0x0

    xor-int/2addr v6, v11

    invoke-static {v6}, Lva3/g;->i(Z)V

    new-instance v6, Lu8/n;

    invoke-direct {v6, v3}, Lu8/n;-><init>(Landroid/util/SparseBooleanArray;)V

    invoke-direct {v5, v6}, Lu8/f0;-><init>(Lu8/n;)V

    iput-object v5, v1, Lb9/f0;->p0:Lu8/f0;

    iget-object v3, v1, Lb9/f0;->Z:Lx8/p;

    iget-object v5, v1, Lb9/f0;->U:Landroid/os/Looper;

    invoke-virtual {v3, v5, v12}, Lx8/p;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lx8/r;

    move-result-object v3

    iput-object v3, v1, Lb9/f0;->K:Lx8/r;

    new-instance v3, Lb9/u;

    invoke-direct {v3, v1}, Lb9/u;-><init>(Lb9/f0;)V

    iput-object v3, v1, Lb9/f0;->L:Lb9/u;

    iget-object v5, v1, Lb9/f0;->y:Lo9/v;

    invoke-static {v5}, Lb9/c1;->j(Lo9/v;)Lb9/c1;

    move-result-object v5

    iput-object v5, v1, Lb9/f0;->I0:Lb9/c1;

    iget-object v5, v1, Lb9/f0;->T:Lc9/h;

    iget-object v6, v1, Lb9/f0;->G:Lb9/f0;

    iget-object v7, v1, Lb9/f0;->U:Landroid/os/Looper;

    invoke-virtual {v5, v6, v7}, Lc9/h;->m(Lb9/f0;Landroid/os/Looper;)V

    new-instance v5, Lc9/n;

    iget-object v6, v0, Lb9/p;->v:Ljava/lang/String;

    invoke-direct {v5, v6}, Lc9/n;-><init>(Ljava/lang/String;)V

    new-instance v14, Lb9/l0;

    iget-object v15, v1, Lb9/f0;->F:Landroid/content/Context;

    iget-object v6, v1, Lb9/f0;->H:[Lb9/f;

    iget-object v7, v1, Lb9/f0;->I:[Lb9/f;

    iget-object v8, v1, Lb9/f0;->J:Lb3/b;

    iget-object v9, v1, Lb9/f0;->y:Lo9/v;

    new-instance v20, Lb9/k;

    invoke-direct/range {v20 .. v20}, Lb9/k;-><init>()V

    iget-object v13, v1, Lb9/f0;->V:Lp9/d;

    iget v12, v1, Lb9/f0;->h0:I

    iget-boolean v11, v1, Lb9/f0;->i0:Z

    iget-object v2, v1, Lb9/f0;->T:Lc9/h;

    move-object/from16 v24, v2

    iget-object v2, v1, Lb9/f0;->m0:Lb9/k1;

    move-object/from16 v25, v2

    iget-object v2, v0, Lb9/p;->q:Lb9/i;

    move-object/from16 v26, v2

    move-object/from16 v31, v3

    iget-wide v2, v0, Lb9/p;->r:J

    move-wide/from16 v27, v2

    iget-object v2, v1, Lb9/f0;->U:Landroid/os/Looper;

    iget-object v3, v1, Lb9/f0;->Z:Lx8/p;

    move-object/from16 v29, v2

    iget-object v2, v1, Lb9/f0;->o0:Lb9/q;

    move-object/from16 v33, v2

    move-object/from16 v30, v3

    move-object/from16 v32, v5

    move-object/from16 v16, v6

    move-object/from16 v17, v7

    move-object/from16 v18, v8

    move-object/from16 v19, v9

    move/from16 v23, v11

    move/from16 v22, v12

    move-object/from16 v21, v13

    invoke-direct/range {v14 .. v33}, Lb9/l0;-><init>(Landroid/content/Context;[Lb9/f;[Lb9/f;Lb3/b;Lo9/v;Lb9/k;Lp9/d;IZLc9/h;Lb9/k1;Lb9/i;JLandroid/os/Looper;Lx8/p;Lb9/u;Lc9/n;Lb9/q;)V

    move-object/from16 v2, v32

    iput-object v14, v1, Lb9/f0;->M:Lb9/l0;

    iget-object v5, v14, Lb9/l0;->J:Landroid/os/Looper;

    const/4 v3, 0x0

    iput v3, v1, Lb9/f0;->h0:I

    sget-object v3, Lu8/a0;->B:Lu8/a0;

    iput-object v3, v1, Lb9/f0;->q0:Lu8/a0;

    iput-object v3, v1, Lb9/f0;->H0:Lu8/a0;

    const/4 v9, -0x1

    iput v9, v1, Lb9/f0;->J0:I

    sget-object v3, Lw8/c;->b:Lw8/c;

    iput-object v3, v1, Lb9/f0;->B0:Lw8/c;

    const/4 v3, 0x1

    iput-boolean v3, v1, Lb9/f0;->C0:Z

    iget-object v3, v1, Lb9/f0;->T:Lc9/h;

    invoke-virtual {v1, v3}, Lb9/f0;->Q(Lu8/h0;)V

    iget-object v3, v1, Lb9/f0;->V:Lp9/d;

    new-instance v6, Landroid/os/Handler;

    iget-object v7, v1, Lb9/f0;->U:Landroid/os/Looper;

    invoke-direct {v6, v7}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iget-object v7, v1, Lb9/f0;->T:Lc9/h;

    check-cast v3, Lp9/f;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v3, Lp9/f;->c:Lko/d;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v3, Lko/d;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_4
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lp9/c;

    iget-object v12, v11, Lp9/c;->b:Lc9/h;

    if-ne v12, v7, :cond_4

    const/4 v12, 0x1

    iput-boolean v12, v11, Lp9/c;->c:Z

    invoke-virtual {v3, v11}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_5
    new-instance v8, Lp9/c;

    invoke-direct {v8, v6, v7}, Lp9/c;-><init>(Landroid/os/Handler;Lc9/h;)V

    invoke-virtual {v3, v8}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, v1, Lb9/f0;->a0:Lb9/c0;

    iget-object v6, v1, Lb9/f0;->O:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v6, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    sget v3, Lx8/t;->a:I

    const/16 v11, 0x1f

    if-lt v3, v11, :cond_6

    iget-object v3, v1, Lb9/f0;->F:Landroid/content/Context;

    iget-boolean v6, v0, Lb9/p;->t:Z

    iget-object v7, v1, Lb9/f0;->Z:Lx8/p;

    iget-object v8, v14, Lb9/l0;->J:Landroid/os/Looper;

    const/4 v12, 0x0

    invoke-virtual {v7, v8, v12}, Lx8/p;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lx8/r;

    move-result-object v7

    new-instance v8, Lb9/z;

    invoke-direct {v8, v3, v6, v1, v2}, Lb9/z;-><init>(Landroid/content/Context;ZLb9/f0;Lc9/n;)V

    invoke-virtual {v7, v8}, Lx8/r;->c(Ljava/lang/Runnable;)Z

    :cond_6
    new-instance v3, Lb30/m;

    iget-object v6, v1, Lb9/f0;->U:Landroid/os/Looper;

    iget-object v7, v1, Lb9/f0;->Z:Lx8/p;

    new-instance v8, Lb9/u;

    invoke-direct {v8, v1}, Lb9/u;-><init>(Lb9/f0;)V

    invoke-direct/range {v3 .. v8}, Lb30/m;-><init>(Ljava/lang/Object;Landroid/os/Looper;Landroid/os/Looper;Lx8/p;Lb9/u;)V

    move-object/from16 v17, v5

    iput-object v3, v1, Lb9/f0;->g0:Lb30/m;

    new-instance v2, Landroidx/fragment/app/m;

    const/16 v5, 0x8

    invoke-direct {v2, v1, v5}, Landroidx/fragment/app/m;-><init>(Ljava/lang/Object;I)V

    iget-object v3, v3, Lb30/m;->x:Ljava/lang/Object;

    check-cast v3, Lx8/r;

    invoke-virtual {v3, v2}, Lx8/r;->c(Ljava/lang/Runnable;)Z

    new-instance v15, Lb9/b;

    iget-object v2, v0, Lb9/p;->a:Landroid/content/Context;

    iget-object v3, v0, Lb9/p;->g:Landroid/os/Looper;

    iget-object v6, v1, Lb9/f0;->a0:Lb9/c0;

    iget-object v7, v1, Lb9/f0;->Z:Lx8/p;

    move-object/from16 v16, v2

    move-object/from16 v18, v3

    move-object/from16 v19, v6

    move-object/from16 v20, v7

    invoke-direct/range {v15 .. v20}, Lb9/b;-><init>(Landroid/content/Context;Landroid/os/Looper;Landroid/os/Looper;Lb9/c0;Lx8/p;)V

    move-object/from16 v2, v17

    iput-object v15, v1, Lb9/f0;->c0:Lb9/b;

    invoke-virtual {v15}, Lb9/b;->z()V

    new-instance v3, Lb9/m1;

    iget-object v6, v1, Lb9/f0;->Z:Lx8/p;

    const/4 v7, 0x0

    invoke-direct {v3, v10, v2, v6, v7}, Lb9/m1;-><init>(Landroid/content/Context;Landroid/os/Looper;Lx8/p;I)V

    iput-object v3, v1, Lb9/f0;->d0:Lb9/m1;

    new-instance v3, Lb9/m1;

    iget-object v6, v1, Lb9/f0;->Z:Lx8/p;

    const/4 v12, 0x1

    invoke-direct {v3, v10, v2, v6, v12}, Lb9/m1;-><init>(Landroid/content/Context;Landroid/os/Looper;Lx8/p;I)V

    iput-object v3, v1, Lb9/f0;->e0:Lb9/m1;

    sget v2, Lu8/i;->c:I

    sget-object v2, Lu8/y0;->d:Lu8/y0;

    iput-object v2, v1, Lb9/f0;->G0:Lu8/y0;

    sget-object v2, Lx8/o;->c:Lx8/o;

    iput-object v2, v1, Lb9/f0;->y0:Lx8/o;

    iget-object v2, v1, Lb9/f0;->z0:Lu8/d;

    iget-boolean v0, v0, Lb9/p;->j:Z

    iget-object v3, v14, Lb9/l0;->H:Lx8/r;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lx8/r;->b()Lx8/q;

    move-result-object v6

    iget-object v3, v3, Lx8/r;->a:Landroid/os/Handler;

    const/4 v7, 0x0

    invoke-virtual {v3, v11, v0, v7, v2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    iput-object v0, v6, Lx8/q;->a:Landroid/os/Message;

    invoke-virtual {v6}, Lx8/q;->b()V

    iget-object v0, v1, Lb9/f0;->z0:Lu8/d;

    const/4 v2, 0x3

    const/4 v12, 0x1

    invoke-virtual {v1, v12, v2, v0}, Lb9/f0;->v0(IILjava/lang/Object;)V

    iget v0, v1, Lb9/f0;->x0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v3, 0x4

    invoke-virtual {v1, v2, v3, v0}, Lb9/f0;->v0(IILjava/lang/Object;)V

    const/4 v0, 0x5

    invoke-virtual {v1, v2, v0, v4}, Lb9/f0;->v0(IILjava/lang/Object;)V

    iget-boolean v0, v1, Lb9/f0;->A0:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/16 v3, 0x9

    const/4 v12, 0x1

    invoke-virtual {v1, v12, v3, v0}, Lb9/f0;->v0(IILjava/lang/Object;)V

    iget-object v0, v1, Lb9/f0;->b0:Lb9/d0;

    const/4 v3, 0x7

    invoke-virtual {v1, v2, v3, v0}, Lb9/f0;->v0(IILjava/lang/Object;)V

    iget-object v0, v1, Lb9/f0;->b0:Lb9/d0;

    const/4 v2, 0x6

    invoke-virtual {v1, v2, v5, v0}, Lb9/f0;->v0(IILjava/lang/Object;)V

    iget v0, v1, Lb9/f0;->E0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v2, 0x10

    invoke-virtual {v1, v9, v2, v0}, Lb9/f0;->v0(IILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, v1, Lb9/f0;->E:Lb9/m1;

    invoke-virtual {v0}, Lb9/m1;->c()Z

    return-void

    :goto_5
    iget-object v2, v1, Lb9/f0;->E:Lb9/m1;

    invoke-virtual {v2}, Lb9/m1;->c()Z

    throw v0

    nop

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
        0x1f
        0x14
        0x1e
        0x15
        0x23
        0x16
        0x18
        0x1b
        0x1c
        0x20
    .end array-data
.end method

.method public static j0(Lb9/c1;)J
    .locals 6

    new-instance v0, Lu8/n0;

    invoke-direct {v0}, Lu8/n0;-><init>()V

    new-instance v1, Lu8/m0;

    invoke-direct {v1}, Lu8/m0;-><init>()V

    iget-object v2, p0, Lb9/c1;->a:Lu8/o0;

    iget-object v3, p0, Lb9/c1;->b:Ll9/c0;

    iget-object v3, v3, Ll9/c0;->a:Ljava/lang/Object;

    invoke-virtual {v2, v3, v1}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    iget-wide v2, p0, Lb9/c1;->c:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v2, v4

    if-nez v4, :cond_0

    iget-object p0, p0, Lb9/c1;->a:Lu8/o0;

    iget v1, v1, Lu8/m0;->c:I

    const-wide/16 v2, 0x0

    invoke-virtual {p0, v1, v0, v2, v3}, Lu8/o0;->m(ILu8/n0;J)Lu8/n0;

    move-result-object p0

    iget-wide v0, p0, Lu8/n0;->l:J

    return-wide v0

    :cond_0
    iget-wide v0, v1, Lu8/m0;->e:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public static m0(Lb9/c1;I)Lb9/c1;
    .locals 1

    invoke-virtual {p0, p1}, Lb9/c1;->h(I)Lb9/c1;

    move-result-object p0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lb9/c1;->b(Z)Lb9/c1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A0(Lu8/e0;)V
    .locals 10

    invoke-virtual {p0}, Lb9/f0;->L0()V

    iget-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    iget-object v0, v0, Lb9/c1;->o:Lu8/e0;

    invoke-virtual {v0, p1}, Lu8/e0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    invoke-virtual {v0, p1}, Lb9/c1;->g(Lu8/e0;)Lb9/c1;

    move-result-object v2

    iget v0, p0, Lb9/f0;->j0:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lb9/f0;->j0:I

    iget-object v0, p0, Lb9/f0;->M:Lb9/l0;

    iget-object v0, v0, Lb9/l0;->H:Lx8/r;

    const/4 v1, 0x4

    invoke-virtual {v0, v1, p1}, Lx8/r;->a(ILjava/lang/Object;)Lx8/q;

    move-result-object p1

    invoke-virtual {p1}, Lx8/q;->b()V

    const/4 v8, -0x1

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x5

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    move-object v1, p0

    invoke-virtual/range {v1 .. v9}, Lb9/f0;->J0(Lb9/c1;IZIJIZ)V

    return-void
.end method

.method public final B0(I)V
    .locals 4

    invoke-virtual {p0}, Lb9/f0;->L0()V

    iget v0, p0, Lb9/f0;->h0:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lb9/f0;->h0:I

    iget-object v0, p0, Lb9/f0;->M:Lb9/l0;

    iget-object v0, v0, Lb9/l0;->H:Lx8/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lx8/r;->b()Lx8/q;

    move-result-object v1

    iget-object v0, v0, Lx8/r;->a:Landroid/os/Handler;

    const/16 v2, 0xb

    const/4 v3, 0x0

    invoke-virtual {v0, v2, p1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v0

    iput-object v0, v1, Lx8/q;->a:Landroid/os/Message;

    invoke-virtual {v1}, Lx8/q;->b()V

    new-instance v0, Lb9/t;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lb9/t;-><init>(II)V

    iget-object p1, p0, Lb9/f0;->N:Lx8/i;

    const/16 v1, 0x8

    invoke-virtual {p1, v1, v0}, Lx8/i;->c(ILx8/f;)V

    invoke-virtual {p0}, Lb9/f0;->H0()V

    invoke-virtual {p1}, Lx8/i;->b()V

    :cond_0
    return-void
.end method

.method public final C0(Z)V
    .locals 4

    invoke-virtual {p0}, Lb9/f0;->L0()V

    iget-boolean v0, p0, Lb9/f0;->i0:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lb9/f0;->i0:Z

    iget-object v0, p0, Lb9/f0;->M:Lb9/l0;

    iget-object v0, v0, Lb9/l0;->H:Lx8/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lx8/r;->b()Lx8/q;

    move-result-object v1

    iget-object v0, v0, Lx8/r;->a:Landroid/os/Handler;

    const/16 v2, 0xc

    const/4 v3, 0x0

    invoke-virtual {v0, v2, p1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v0

    iput-object v0, v1, Lx8/q;->a:Landroid/os/Message;

    invoke-virtual {v1}, Lx8/q;->b()V

    new-instance v0, Lb9/w;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lb9/w;-><init>(ZI)V

    iget-object p1, p0, Lb9/f0;->N:Lx8/i;

    const/16 v1, 0x9

    invoke-virtual {p1, v1, v0}, Lx8/i;->c(ILx8/f;)V

    invoke-virtual {p0}, Lb9/f0;->H0()V

    invoke-virtual {p1}, Lx8/i;->b()V

    :cond_0
    return-void
.end method

.method public final D0(Lu8/t0;)V
    .locals 3

    invoke-virtual {p0}, Lb9/f0;->L0()V

    iget-object v0, p0, Lb9/f0;->J:Lb3/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v0, Lo9/q;

    invoke-virtual {v0}, Lo9/q;->N()Lo9/j;

    move-result-object v1

    invoke-virtual {p1, v1}, Lu8/t0;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    instance-of v1, p1, Lo9/j;

    if-eqz v1, :cond_1

    move-object v1, p1

    check-cast v1, Lo9/j;

    invoke-virtual {v0, v1}, Lo9/q;->R(Lo9/j;)V

    :cond_1
    new-instance v1, Lo9/i;

    invoke-virtual {v0}, Lo9/q;->N()Lo9/j;

    move-result-object v2

    invoke-direct {v1, v2}, Lo9/i;-><init>(Lo9/j;)V

    invoke-virtual {v1, p1}, Lu8/s0;->b(Lu8/t0;)V

    new-instance v2, Lo9/j;

    invoke-direct {v2, v1}, Lo9/j;-><init>(Lo9/i;)V

    invoke-virtual {v0, v2}, Lo9/q;->R(Lo9/j;)V

    new-instance v0, Lab/g0;

    const/4 v1, 0x5

    invoke-direct {v0, p1, v1}, Lab/g0;-><init>(Ljava/lang/Object;I)V

    iget-object p1, p0, Lb9/f0;->N:Lx8/i;

    const/16 v1, 0x13

    invoke-virtual {p1, v1, v0}, Lx8/i;->e(ILx8/f;)V

    return-void
.end method

.method public final E0(Ljava/lang/Object;)V
    .locals 11

    iget-object v0, p0, Lb9/f0;->r0:Ljava/lang/Object;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    if-eq v0, p1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v0, :cond_1

    iget-wide v4, p0, Lb9/f0;->f0:J

    goto :goto_1

    :cond_1
    move-wide v4, v2

    :goto_1
    iget-object v6, p0, Lb9/f0;->M:Lb9/l0;

    monitor-enter v6

    :try_start_0
    iget-boolean v7, v6, Lb9/l0;->d0:Z

    if-nez v7, :cond_4

    iget-object v7, v6, Lb9/l0;->J:Landroid/os/Looper;

    invoke-virtual {v7}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Thread;->isAlive()Z

    move-result v7

    if-nez v7, :cond_2

    goto :goto_2

    :cond_2
    new-instance v7, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v7}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iget-object v8, v6, Lb9/l0;->H:Lx8/r;

    new-instance v9, Landroid/util/Pair;

    invoke-direct {v9, p1, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v10, 0x1e

    invoke-virtual {v8, v10, v9}, Lx8/r;->a(ILjava/lang/Object;)Lx8/q;

    move-result-object v8

    invoke-virtual {v8}, Lx8/q;->b()V

    cmp-long v2, v4, v2

    if-eqz v2, :cond_3

    new-instance v1, Lb9/n;

    const/4 v2, 0x2

    invoke-direct {v1, v7, v2}, Lb9/n;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v6, v1, v4, v5}, Lb9/l0;->w0(Lyr/i;J)V

    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v6

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_3
    monitor-exit v6

    goto :goto_3

    :cond_4
    :goto_2
    monitor-exit v6

    :goto_3
    if-eqz v0, :cond_5

    iget-object v0, p0, Lb9/f0;->r0:Ljava/lang/Object;

    iget-object v2, p0, Lb9/f0;->s0:Landroid/view/Surface;

    if-ne v0, v2, :cond_5

    invoke-virtual {v2}, Landroid/view/Surface;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lb9/f0;->s0:Landroid/view/Surface;

    :cond_5
    iput-object p1, p0, Lb9/f0;->r0:Ljava/lang/Object;

    if-nez v1, :cond_6

    new-instance p1, Landroidx/media3/exoplayer/ExoTimeoutException;

    const-string v0, "Detaching surface timed out."

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    new-instance v0, Landroidx/media3/exoplayer/ExoPlaybackException;

    const/4 v1, 0x2

    const/16 v2, 0x3eb

    invoke-direct {v0, v1, p1, v2}, Landroidx/media3/exoplayer/ExoPlaybackException;-><init>(ILjava/lang/Exception;I)V

    invoke-virtual {p0, v0}, Lb9/f0;->G0(Landroidx/media3/exoplayer/ExoPlaybackException;)V

    :cond_6
    return-void

    :goto_4
    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final F0()V
    .locals 4

    invoke-virtual {p0}, Lb9/f0;->L0()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lb9/f0;->G0(Landroidx/media3/exoplayer/ExoPlaybackException;)V

    new-instance v0, Lw8/c;

    sget-object v1, Lzr/w0;->E:Lzr/w0;

    iget-object v2, p0, Lb9/f0;->I0:Lb9/c1;

    iget-wide v2, v2, Lb9/c1;->s:J

    invoke-direct {v0, v1}, Lw8/c;-><init>(Ljava/util/List;)V

    iput-object v0, p0, Lb9/f0;->B0:Lw8/c;

    return-void
.end method

.method public final G0(Landroidx/media3/exoplayer/ExoPlaybackException;)V
    .locals 11

    iget-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    iget-object v1, v0, Lb9/c1;->b:Ll9/c0;

    invoke-virtual {v0, v1}, Lb9/c1;->c(Ll9/c0;)Lb9/c1;

    move-result-object v0

    iget-wide v1, v0, Lb9/c1;->s:J

    iput-wide v1, v0, Lb9/c1;->q:J

    const-wide/16 v1, 0x0

    iput-wide v1, v0, Lb9/c1;->r:J

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lb9/f0;->m0(Lb9/c1;I)Lb9/c1;

    move-result-object v0

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Lb9/c1;->f(Landroidx/media3/exoplayer/ExoPlaybackException;)Lb9/c1;

    move-result-object v0

    :cond_0
    move-object v3, v0

    iget p1, p0, Lb9/f0;->j0:I

    add-int/2addr p1, v1

    iput p1, p0, Lb9/f0;->j0:I

    iget-object p1, p0, Lb9/f0;->M:Lb9/l0;

    iget-object p1, p1, Lb9/l0;->H:Lx8/r;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lx8/r;->b()Lx8/q;

    move-result-object v0

    iget-object p1, p1, Lx8/r;->a:Landroid/os/Handler;

    const/4 v1, 0x6

    invoke-virtual {p1, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p1

    iput-object p1, v0, Lx8/q;->a:Landroid/os/Message;

    invoke-virtual {v0}, Lx8/q;->b()V

    const/4 v9, -0x1

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x5

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    move-object v2, p0

    invoke-virtual/range {v2 .. v10}, Lb9/f0;->J0(Lb9/c1;IZIJIZ)V

    return-void
.end method

.method public final H(IJZ)V
    .locals 10

    invoke-virtual {p0}, Lb9/f0;->L0()V

    const/4 v2, -0x1

    if-ne p1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v3, 0x1

    if-ltz p1, :cond_1

    move v4, v3

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    invoke-static {v4}, Lva3/g;->d(Z)V

    iget-object v4, p0, Lb9/f0;->I0:Lb9/c1;

    iget-object v4, v4, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v4}, Lu8/o0;->p()Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v4}, Lu8/o0;->o()I

    move-result v5

    if-lt p1, v5, :cond_2

    :goto_1
    return-void

    :cond_2
    iget-object v5, p0, Lb9/f0;->T:Lc9/h;

    iget-boolean v6, v5, Lc9/h;->I:Z

    if-nez v6, :cond_3

    invoke-virtual {v5}, Lc9/h;->g()Lc9/a;

    move-result-object v6

    iput-boolean v3, v5, Lc9/h;->I:Z

    new-instance v7, Lab/a;

    const/16 v8, 0x1d

    invoke-direct {v7, v8}, Lab/a;-><init>(I)V

    invoke-virtual {v5, v6, v2, v7}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    :cond_3
    iget v2, p0, Lb9/f0;->j0:I

    add-int/2addr v2, v3

    iput v2, p0, Lb9/f0;->j0:I

    invoke-virtual {p0}, Lb9/f0;->l0()Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v1, "ExoPlayerImpl"

    const-string v2, "seekTo ignored because an ad is playing"

    invoke-static {v1, v2}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lab/y;

    iget-object v2, p0, Lb9/f0;->I0:Lb9/c1;

    invoke-direct {v1, v2}, Lab/y;-><init>(Lb9/c1;)V

    invoke-virtual {v1, v3}, Lab/y;->c(I)V

    iget-object v2, p0, Lb9/f0;->L:Lb9/u;

    iget-object v2, v2, Lb9/u;->w:Lb9/f0;

    iget-object v3, v2, Lb9/f0;->K:Lx8/r;

    new-instance v4, La8/c;

    const/4 v5, 0x3

    invoke-direct {v4, v5, v2, v1}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v4}, Lx8/r;->c(Ljava/lang/Runnable;)Z

    return-void

    :cond_4
    iget-object v2, p0, Lb9/f0;->I0:Lb9/c1;

    iget v3, v2, Lb9/c1;->e:I

    const/4 v5, 0x3

    if-eq v3, v5, :cond_5

    const/4 v6, 0x4

    if-ne v3, v6, :cond_6

    invoke-virtual {v4}, Lu8/o0;->p()Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    iget-object v2, p0, Lb9/f0;->I0:Lb9/c1;

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Lb9/c1;->h(I)Lb9/c1;

    move-result-object v2

    :cond_6
    invoke-virtual {p0}, Lb9/f0;->Z()I

    move-result v7

    invoke-virtual {p0, v4, p1, p2, p3}, Lb9/f0;->o0(Lu8/o0;IJ)Landroid/util/Pair;

    move-result-object v3

    invoke-virtual {p0, v2, v4, v3}, Lb9/f0;->n0(Lb9/c1;Lu8/o0;Landroid/util/Pair;)Lb9/c1;

    move-result-object v2

    invoke-static {p2, p3}, Lx8/t;->J(J)J

    move-result-wide v8

    iget-object v3, p0, Lb9/f0;->M:Lb9/l0;

    iget-object v3, v3, Lb9/l0;->H:Lx8/r;

    new-instance v6, Lb9/k0;

    invoke-direct {v6, v4, p1, v8, v9}, Lb9/k0;-><init>(Lu8/o0;IJ)V

    invoke-virtual {v3, v5, v6}, Lx8/r;->a(ILjava/lang/Object;)Lx8/q;

    move-result-object v1

    invoke-virtual {v1}, Lx8/q;->b()V

    const/4 v4, 0x1

    invoke-virtual {p0, v2}, Lb9/f0;->b0(Lb9/c1;)J

    move-result-wide v5

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x1

    move-object v0, p0

    move v8, p4

    invoke-virtual/range {v0 .. v8}, Lb9/f0;->J0(Lb9/c1;IZIJIZ)V

    return-void
.end method

.method public final H0()V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lb9/f0;->p0:Lu8/f0;

    sget v2, Lx8/t;->a:I

    iget-object v2, v0, Lb9/f0;->G:Lb9/f0;

    invoke-virtual {v2}, Lb9/f0;->l0()Z

    move-result v3

    invoke-virtual {v2}, La2/a;->D()Z

    move-result v4

    invoke-virtual {v2}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v5

    invoke-virtual {v5}, Lu8/o0;->p()Z

    move-result v6

    const/4 v8, 0x1

    const/4 v9, -0x1

    if-eqz v6, :cond_0

    move v5, v9

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lb9/f0;->Z()I

    move-result v6

    invoke-virtual {v2}, Lb9/f0;->L0()V

    iget v10, v2, Lb9/f0;->h0:I

    if-ne v10, v8, :cond_1

    const/4 v10, 0x0

    :cond_1
    invoke-virtual {v2}, Lb9/f0;->L0()V

    iget-boolean v11, v2, Lb9/f0;->i0:Z

    invoke-virtual {v5, v6, v10, v11}, Lu8/o0;->k(IIZ)I

    move-result v5

    :goto_0
    if-eq v5, v9, :cond_2

    move v5, v8

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    invoke-virtual {v2}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v6

    invoke-virtual {v6}, Lu8/o0;->p()Z

    move-result v10

    if-eqz v10, :cond_3

    move v6, v9

    goto :goto_2

    :cond_3
    invoke-virtual {v2}, Lb9/f0;->Z()I

    move-result v10

    invoke-virtual {v2}, Lb9/f0;->L0()V

    iget v11, v2, Lb9/f0;->h0:I

    if-ne v11, v8, :cond_4

    const/4 v11, 0x0

    :cond_4
    invoke-virtual {v2}, Lb9/f0;->L0()V

    iget-boolean v12, v2, Lb9/f0;->i0:Z

    invoke-virtual {v6, v10, v11, v12}, Lu8/o0;->e(IIZ)I

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

    invoke-virtual {v2}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v2

    invoke-virtual {v2}, Lu8/o0;->p()Z

    move-result v2

    new-instance v11, Lty/c;

    const/4 v12, 0x6

    invoke-direct {v11, v12}, Lty/c;-><init>(I)V

    iget-object v13, v11, Lty/c;->x:Ljava/lang/Object;

    check-cast v13, Llo/e;

    iget-object v14, v0, Lb9/f0;->z:Lu8/f0;

    iget-object v14, v14, Lu8/f0;->a:Lu8/n;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v15, 0x0

    :goto_4
    iget-object v7, v14, Lu8/n;->a:Landroid/util/SparseBooleanArray;

    invoke-virtual {v7}, Landroid/util/SparseBooleanArray;->size()I

    move-result v7

    if-ge v15, v7, :cond_6

    invoke-virtual {v14, v15}, Lu8/n;->a(I)I

    move-result v7

    invoke-virtual {v13, v7}, Llo/e;->a(I)V

    add-int/lit8 v15, v15, 0x1

    goto :goto_4

    :cond_6
    xor-int/lit8 v7, v3, 0x1

    const/4 v14, 0x4

    invoke-virtual {v11, v14, v7}, Lty/c;->j(IZ)V

    if-eqz v4, :cond_7

    if-nez v3, :cond_7

    move v14, v8

    goto :goto_5

    :cond_7
    const/4 v14, 0x0

    :goto_5
    const/4 v15, 0x5

    invoke-virtual {v11, v15, v14}, Lty/c;->j(IZ)V

    if-eqz v5, :cond_8

    if-nez v3, :cond_8

    move v14, v8

    goto :goto_6

    :cond_8
    const/4 v14, 0x0

    :goto_6
    invoke-virtual {v11, v12, v14}, Lty/c;->j(IZ)V

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
    const/4 v12, 0x7

    invoke-virtual {v11, v12, v5}, Lty/c;->j(IZ)V

    if-eqz v6, :cond_b

    if-nez v3, :cond_b

    move v5, v8

    goto :goto_8

    :cond_b
    const/4 v5, 0x0

    :goto_8
    const/16 v12, 0x8

    invoke-virtual {v11, v12, v5}, Lty/c;->j(IZ)V

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

    invoke-virtual {v11, v5, v2}, Lty/c;->j(IZ)V

    const/16 v2, 0xa

    invoke-virtual {v11, v2, v7}, Lty/c;->j(IZ)V

    if-eqz v4, :cond_e

    if-nez v3, :cond_e

    move v2, v8

    goto :goto_a

    :cond_e
    const/4 v2, 0x0

    :goto_a
    const/16 v5, 0xb

    invoke-virtual {v11, v5, v2}, Lty/c;->j(IZ)V

    if-eqz v4, :cond_f

    if-nez v3, :cond_f

    move v7, v8

    goto :goto_b

    :cond_f
    const/4 v7, 0x0

    :goto_b
    const/16 v2, 0xc

    invoke-virtual {v11, v2, v7}, Lty/c;->j(IZ)V

    new-instance v2, Lu8/f0;

    invoke-virtual {v13}, Llo/e;->c()Lu8/n;

    move-result-object v3

    invoke-direct {v2, v3}, Lu8/f0;-><init>(Lu8/n;)V

    iput-object v2, v0, Lb9/f0;->p0:Lu8/f0;

    invoke-virtual {v2, v1}, Lu8/f0;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    new-instance v1, Lb9/u;

    invoke-direct {v1, v0}, Lb9/u;-><init>(Lb9/f0;)V

    iget-object v2, v0, Lb9/f0;->N:Lx8/i;

    const/16 v3, 0xd

    invoke-virtual {v2, v3, v1}, Lx8/i;->c(ILx8/f;)V

    :cond_10
    return-void
.end method

.method public final I0(IZ)V
    .locals 13

    iget-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    iget v1, v0, Lb9/c1;->n:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    if-nez p2, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-boolean v4, v0, Lb9/c1;->l:Z

    if-ne v4, p2, :cond_1

    if-ne v1, v3, :cond_1

    iget v1, v0, Lb9/c1;->m:I

    if-ne v1, p1, :cond_1

    return-void

    :cond_1
    iget v1, p0, Lb9/f0;->j0:I

    add-int/2addr v1, v2

    iput v1, p0, Lb9/f0;->j0:I

    iget-boolean v1, v0, Lb9/c1;->p:Z

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lb9/c1;->a()Lb9/c1;

    move-result-object v0

    :cond_2
    invoke-virtual {v0, p1, v3, p2}, Lb9/c1;->e(IIZ)Lb9/c1;

    move-result-object v5

    shl-int/lit8 v0, v3, 0x4

    or-int/2addr p1, v0

    iget-object v0, p0, Lb9/f0;->M:Lb9/l0;

    iget-object v0, v0, Lb9/l0;->H:Lx8/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lx8/r;->b()Lx8/q;

    move-result-object v1

    iget-object v0, v0, Lx8/r;->a:Landroid/os/Handler;

    invoke-virtual {v0, v2, p2, p1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p1

    iput-object p1, v1, Lx8/q;->a:Landroid/os/Message;

    invoke-virtual {v1}, Lx8/q;->b()V

    const/4 v11, -0x1

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x5

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v4, p0

    invoke-virtual/range {v4 .. v12}, Lb9/f0;->J0(Lb9/c1;IZIJIZ)V

    return-void
.end method

.method public final J0(Lb9/c1;IZIJIZ)V
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p4

    iget-object v3, v0, Lb9/f0;->I0:Lb9/c1;

    iput-object v1, v0, Lb9/f0;->I0:Lb9/c1;

    iget-object v4, v3, Lb9/c1;->a:Lu8/o0;

    iget-object v5, v1, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v4, v5}, Lu8/o0;->equals(Ljava/lang/Object;)Z

    move-result v4

    iget-object v5, v0, La2/a;->x:Ljava/lang/Object;

    check-cast v5, Lu8/n0;

    iget-object v6, v0, Lb9/f0;->P:Lu8/m0;

    const/4 v7, -0x1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iget-object v9, v3, Lb9/c1;->a:Lu8/o0;

    iget-object v10, v3, Lb9/c1;->b:Ll9/c0;

    iget-object v11, v1, Lb9/c1;->a:Lu8/o0;

    iget-object v12, v1, Lb9/c1;->b:Ll9/c0;

    invoke-virtual {v11}, Lu8/o0;->p()Z

    move-result v13

    const/16 v16, 0x0

    const/16 v17, 0x2

    const-wide/16 v14, 0x0

    const/16 v18, 0x3

    if-eqz v13, :cond_0

    invoke-virtual {v9}, Lu8/o0;->p()Z

    move-result v13

    if-eqz v13, :cond_0

    new-instance v5, Landroid/util/Pair;

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v5, v6, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v11}, Lu8/o0;->p()Z

    move-result v13

    invoke-virtual {v9}, Lu8/o0;->p()Z

    move-result v7

    if-eq v13, v7, :cond_1

    new-instance v5, Landroid/util/Pair;

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_1
    iget-object v7, v10, Ll9/c0;->a:Ljava/lang/Object;

    invoke-virtual {v9, v7, v6}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    move-result-object v7

    iget v7, v7, Lu8/m0;->c:I

    invoke-virtual {v9, v7, v5, v14, v15}, Lu8/o0;->m(ILu8/n0;J)Lu8/n0;

    move-result-object v7

    iget-object v7, v7, Lu8/n0;->a:Ljava/lang/Object;

    iget-object v9, v12, Ll9/c0;->a:Ljava/lang/Object;

    invoke-virtual {v11, v9, v6}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    move-result-object v6

    iget v6, v6, Lu8/m0;->c:I

    invoke-virtual {v11, v6, v5, v14, v15}, Lu8/o0;->m(ILu8/n0;J)Lu8/n0;

    move-result-object v5

    iget-object v5, v5, Lu8/n0;->a:Ljava/lang/Object;

    invoke-virtual {v7, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    if-eqz p3, :cond_2

    if-nez v2, :cond_2

    const/4 v5, 0x1

    goto :goto_0

    :cond_2
    if-eqz p3, :cond_3

    const/4 v5, 0x1

    if-ne v2, v5, :cond_3

    move/from16 v5, v17

    goto :goto_0

    :cond_3
    if-nez v4, :cond_4

    move/from16 v5, v18

    :goto_0
    new-instance v6, Landroid/util/Pair;

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-direct {v6, v7, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v5, v6

    goto :goto_1

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_5
    if-eqz p3, :cond_6

    if-nez v2, :cond_6

    iget-wide v5, v10, Ll9/c0;->d:J

    iget-wide v9, v12, Ll9/c0;->d:J

    cmp-long v5, v5, v9

    if-gez v5, :cond_6

    new-instance v5, Landroid/util/Pair;

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_6
    if-eqz p3, :cond_7

    const/4 v5, 0x1

    if-ne v2, v5, :cond_7

    if-eqz p8, :cond_7

    new-instance v5, Landroid/util/Pair;

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_7
    new-instance v5, Landroid/util/Pair;

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v5, v6, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    iget-object v6, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-eqz v6, :cond_9

    iget-object v8, v1, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v8}, Lu8/o0;->p()Z

    move-result v8

    if-nez v8, :cond_8

    iget-object v8, v1, Lb9/c1;->a:Lu8/o0;

    iget-object v9, v1, Lb9/c1;->b:Ll9/c0;

    iget-object v9, v9, Ll9/c0;->a:Ljava/lang/Object;

    iget-object v10, v0, Lb9/f0;->P:Lu8/m0;

    invoke-virtual {v8, v9, v10}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    move-result-object v8

    iget v8, v8, Lu8/m0;->c:I

    iget-object v9, v1, Lb9/c1;->a:Lu8/o0;

    iget-object v10, v0, La2/a;->x:Ljava/lang/Object;

    check-cast v10, Lu8/n0;

    invoke-virtual {v9, v8, v10, v14, v15}, Lu8/o0;->m(ILu8/n0;J)Lu8/n0;

    move-result-object v8

    iget-object v8, v8, Lu8/n0;->c:Lu8/x;

    goto :goto_2

    :cond_8
    const/4 v8, 0x0

    :goto_2
    sget-object v9, Lu8/a0;->B:Lu8/a0;

    iput-object v9, v0, Lb9/f0;->H0:Lu8/a0;

    goto :goto_3

    :cond_9
    const/4 v8, 0x0

    :goto_3
    if-nez v6, :cond_a

    iget-object v9, v3, Lb9/c1;->j:Ljava/util/List;

    iget-object v10, v1, Lb9/c1;->j:Ljava/util/List;

    invoke-interface {v9, v10}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_d

    :cond_a
    iget-object v9, v0, Lb9/f0;->H0:Lu8/a0;

    invoke-virtual {v9}, Lu8/a0;->a()Lu8/z;

    move-result-object v9

    iget-object v10, v1, Lb9/c1;->j:Ljava/util/List;

    move/from16 v11, v16

    :goto_4
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v12

    if-ge v11, v12, :cond_c

    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lu8/c0;

    move/from16 v13, v16

    :goto_5
    iget-object v7, v12, Lu8/c0;->a:[Lu8/b0;

    array-length v14, v7

    if-ge v13, v14, :cond_b

    aget-object v7, v7, v13

    invoke-interface {v7, v9}, Lu8/b0;->a(Lu8/z;)V

    add-int/lit8 v13, v13, 0x1

    const-wide/16 v14, 0x0

    goto :goto_5

    :cond_b
    add-int/lit8 v11, v11, 0x1

    const-wide/16 v14, 0x0

    goto :goto_4

    :cond_c
    new-instance v7, Lu8/a0;

    invoke-direct {v7, v9}, Lu8/a0;-><init>(Lu8/z;)V

    iput-object v7, v0, Lb9/f0;->H0:Lu8/a0;

    :cond_d
    invoke-virtual {v0}, Lb9/f0;->R()Lu8/a0;

    move-result-object v7

    iget-object v9, v0, Lb9/f0;->q0:Lu8/a0;

    invoke-virtual {v7, v9}, Lu8/a0;->equals(Ljava/lang/Object;)Z

    move-result v9

    iput-object v7, v0, Lb9/f0;->q0:Lu8/a0;

    iget-boolean v7, v3, Lb9/c1;->l:Z

    iget-boolean v10, v1, Lb9/c1;->l:Z

    if-eq v7, v10, :cond_e

    const/4 v7, 0x1

    goto :goto_6

    :cond_e
    move/from16 v7, v16

    :goto_6
    iget v10, v3, Lb9/c1;->e:I

    iget v11, v1, Lb9/c1;->e:I

    if-eq v10, v11, :cond_f

    const/4 v10, 0x1

    goto :goto_7

    :cond_f
    move/from16 v10, v16

    :goto_7
    if-nez v10, :cond_10

    if-eqz v7, :cond_11

    :cond_10
    invoke-virtual {v0}, Lb9/f0;->K0()V

    :cond_11
    iget-boolean v11, v3, Lb9/c1;->g:Z

    iget-boolean v12, v1, Lb9/c1;->g:Z

    if-eq v11, v12, :cond_12

    const/4 v11, 0x1

    goto :goto_8

    :cond_12
    move/from16 v11, v16

    :goto_8
    if-nez v4, :cond_13

    iget-object v4, v0, Lb9/f0;->N:Lx8/i;

    new-instance v12, Lb9/v;

    const/4 v13, 0x0

    move/from16 v14, p2

    invoke-direct {v12, v1, v14, v13}, Lb9/v;-><init>(Ljava/lang/Object;II)V

    move/from16 v13, v16

    invoke-virtual {v4, v13, v12}, Lx8/i;->c(ILx8/f;)V

    :cond_13
    if-eqz p3, :cond_1b

    new-instance v4, Lu8/m0;

    invoke-direct {v4}, Lu8/m0;-><init>()V

    iget-object v12, v3, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v12}, Lu8/o0;->p()Z

    move-result v12

    if-nez v12, :cond_14

    iget-object v12, v3, Lb9/c1;->b:Ll9/c0;

    iget-object v12, v12, Ll9/c0;->a:Ljava/lang/Object;

    iget-object v13, v3, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v13, v12, v4}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    iget v13, v4, Lu8/m0;->c:I

    iget-object v14, v3, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v14, v12}, Lu8/o0;->b(Ljava/lang/Object;)I

    move-result v14

    iget-object v15, v3, Lb9/c1;->a:Lu8/o0;

    move/from16 v16, v6

    iget-object v6, v0, La2/a;->x:Ljava/lang/Object;

    check-cast v6, Lu8/n0;

    move/from16 v19, v9

    move/from16 v20, v10

    const-wide/16 v9, 0x0

    invoke-virtual {v15, v13, v6, v9, v10}, Lu8/o0;->m(ILu8/n0;J)Lu8/n0;

    move-result-object v6

    iget-object v6, v6, Lu8/n0;->a:Ljava/lang/Object;

    iget-object v9, v0, La2/a;->x:Ljava/lang/Object;

    check-cast v9, Lu8/n0;

    iget-object v9, v9, Lu8/n0;->c:Lu8/x;

    move-object/from16 v22, v6

    move-object/from16 v24, v9

    move-object/from16 v25, v12

    move/from16 v23, v13

    move/from16 v26, v14

    goto :goto_9

    :cond_14
    move/from16 v16, v6

    move/from16 v19, v9

    move/from16 v20, v10

    move/from16 v23, p7

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, -0x1

    :goto_9
    if-nez v2, :cond_17

    iget-object v6, v3, Lb9/c1;->b:Ll9/c0;

    invoke-virtual {v6}, Ll9/c0;->b()Z

    move-result v6

    if-eqz v6, :cond_15

    iget-object v6, v3, Lb9/c1;->b:Ll9/c0;

    iget v9, v6, Ll9/c0;->b:I

    iget v6, v6, Ll9/c0;->c:I

    invoke-virtual {v4, v9, v6}, Lu8/m0;->a(II)J

    move-result-wide v9

    invoke-static {v3}, Lb9/f0;->j0(Lb9/c1;)J

    move-result-wide v12

    goto :goto_c

    :cond_15
    iget-object v6, v3, Lb9/c1;->b:Ll9/c0;

    iget v6, v6, Ll9/c0;->e:I

    const/4 v9, -0x1

    if-eq v6, v9, :cond_16

    iget-object v4, v0, Lb9/f0;->I0:Lb9/c1;

    invoke-static {v4}, Lb9/f0;->j0(Lb9/c1;)J

    move-result-wide v9

    :goto_a
    move-wide v12, v9

    goto :goto_c

    :cond_16
    iget-wide v9, v4, Lu8/m0;->e:J

    iget-wide v12, v4, Lu8/m0;->d:J

    :goto_b
    add-long/2addr v9, v12

    goto :goto_a

    :cond_17
    iget-object v6, v3, Lb9/c1;->b:Ll9/c0;

    invoke-virtual {v6}, Ll9/c0;->b()Z

    move-result v6

    if-eqz v6, :cond_18

    iget-wide v9, v3, Lb9/c1;->s:J

    invoke-static {v3}, Lb9/f0;->j0(Lb9/c1;)J

    move-result-wide v12

    goto :goto_c

    :cond_18
    iget-wide v9, v4, Lu8/m0;->e:J

    iget-wide v12, v3, Lb9/c1;->s:J

    goto :goto_b

    :goto_c
    new-instance v21, Lu8/i0;

    invoke-static {v9, v10}, Lx8/t;->U(J)J

    move-result-wide v27

    invoke-static {v12, v13}, Lx8/t;->U(J)J

    move-result-wide v29

    iget-object v4, v3, Lb9/c1;->b:Ll9/c0;

    iget v6, v4, Ll9/c0;->b:I

    iget v4, v4, Ll9/c0;->c:I

    move/from16 v32, v4

    move/from16 v31, v6

    invoke-direct/range {v21 .. v32}, Lu8/i0;-><init>(Ljava/lang/Object;ILu8/x;Ljava/lang/Object;IJJII)V

    move-object/from16 v4, v21

    iget-object v6, v0, La2/a;->x:Ljava/lang/Object;

    check-cast v6, Lu8/n0;

    invoke-virtual {v0}, Lb9/f0;->Z()I

    move-result v9

    iget-object v10, v0, Lb9/f0;->I0:Lb9/c1;

    iget-object v10, v10, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v10}, Lu8/o0;->p()Z

    move-result v10

    if-nez v10, :cond_19

    iget-object v10, v0, Lb9/f0;->I0:Lb9/c1;

    iget-object v12, v10, Lb9/c1;->b:Ll9/c0;

    iget-object v12, v12, Ll9/c0;->a:Ljava/lang/Object;

    iget-object v10, v10, Lb9/c1;->a:Lu8/o0;

    iget-object v13, v0, Lb9/f0;->P:Lu8/m0;

    invoke-virtual {v10, v12, v13}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    iget-object v10, v0, Lb9/f0;->I0:Lb9/c1;

    iget-object v10, v10, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v10, v12}, Lu8/o0;->b(Ljava/lang/Object;)I

    move-result v10

    iget-object v13, v0, Lb9/f0;->I0:Lb9/c1;

    iget-object v13, v13, Lb9/c1;->a:Lu8/o0;

    const-wide/16 v14, 0x0

    invoke-virtual {v13, v9, v6, v14, v15}, Lu8/o0;->m(ILu8/n0;J)Lu8/n0;

    move-result-object v13

    iget-object v13, v13, Lu8/n0;->a:Ljava/lang/Object;

    iget-object v6, v6, Lu8/n0;->c:Lu8/x;

    move-object/from16 v24, v6

    move/from16 v26, v10

    move-object/from16 v25, v12

    move-object/from16 v22, v13

    goto :goto_d

    :cond_19
    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, -0x1

    :goto_d
    invoke-static/range {p5 .. p6}, Lx8/t;->U(J)J

    move-result-wide v27

    new-instance v21, Lu8/i0;

    iget-object v6, v0, Lb9/f0;->I0:Lb9/c1;

    iget-object v6, v6, Lb9/c1;->b:Ll9/c0;

    invoke-virtual {v6}, Ll9/c0;->b()Z

    move-result v6

    if-eqz v6, :cond_1a

    iget-object v6, v0, Lb9/f0;->I0:Lb9/c1;

    invoke-static {v6}, Lb9/f0;->j0(Lb9/c1;)J

    move-result-wide v12

    invoke-static {v12, v13}, Lx8/t;->U(J)J

    move-result-wide v12

    move-wide/from16 v29, v12

    goto :goto_e

    :cond_1a
    move-wide/from16 v29, v27

    :goto_e
    iget-object v6, v0, Lb9/f0;->I0:Lb9/c1;

    iget-object v6, v6, Lb9/c1;->b:Ll9/c0;

    iget v10, v6, Ll9/c0;->b:I

    iget v6, v6, Ll9/c0;->c:I

    move/from16 v32, v6

    move/from16 v23, v9

    move/from16 v31, v10

    invoke-direct/range {v21 .. v32}, Lu8/i0;-><init>(Ljava/lang/Object;ILu8/x;Ljava/lang/Object;IJJII)V

    move-object/from16 v6, v21

    iget-object v9, v0, Lb9/f0;->N:Lx8/i;

    new-instance v10, Lb9/x;

    const/4 v12, 0x0

    invoke-direct {v10, v4, v2, v6, v12}, Lb9/x;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    const/16 v2, 0xb

    invoke-virtual {v9, v2, v10}, Lx8/i;->c(ILx8/f;)V

    goto :goto_f

    :cond_1b
    move/from16 v16, v6

    move/from16 v19, v9

    move/from16 v20, v10

    :goto_f
    if-eqz v16, :cond_1c

    iget-object v2, v0, Lb9/f0;->N:Lx8/i;

    new-instance v4, Lb9/v;

    const/4 v6, 0x1

    invoke-direct {v4, v8, v5, v6}, Lb9/v;-><init>(Ljava/lang/Object;II)V

    const/4 v5, 0x1

    invoke-virtual {v2, v5, v4}, Lx8/i;->c(ILx8/f;)V

    :cond_1c
    iget-object v2, v3, Lb9/c1;->f:Landroidx/media3/exoplayer/ExoPlaybackException;

    iget-object v4, v1, Lb9/c1;->f:Landroidx/media3/exoplayer/ExoPlaybackException;

    if-eq v2, v4, :cond_1d

    iget-object v2, v0, Lb9/f0;->N:Lx8/i;

    new-instance v4, Lb9/r;

    const/16 v5, 0x8

    invoke-direct {v4, v1, v5}, Lb9/r;-><init>(Lb9/c1;I)V

    const/16 v5, 0xa

    invoke-virtual {v2, v5, v4}, Lx8/i;->c(ILx8/f;)V

    iget-object v2, v1, Lb9/c1;->f:Landroidx/media3/exoplayer/ExoPlaybackException;

    if-eqz v2, :cond_1d

    iget-object v2, v0, Lb9/f0;->N:Lx8/i;

    new-instance v4, Lb9/r;

    const/16 v6, 0x9

    invoke-direct {v4, v1, v6}, Lb9/r;-><init>(Lb9/c1;I)V

    invoke-virtual {v2, v5, v4}, Lx8/i;->c(ILx8/f;)V

    :cond_1d
    iget-object v2, v3, Lb9/c1;->i:Lo9/v;

    iget-object v4, v1, Lb9/c1;->i:Lo9/v;

    if-eq v2, v4, :cond_1e

    iget-object v2, v0, Lb9/f0;->J:Lb3/b;

    iget-object v4, v4, Lo9/v;->e:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v4, Lo9/u;

    iget-object v2, v0, Lb9/f0;->N:Lx8/i;

    new-instance v4, Lb9/r;

    const/4 v5, 0x0

    invoke-direct {v4, v1, v5}, Lb9/r;-><init>(Lb9/c1;I)V

    move/from16 v5, v17

    invoke-virtual {v2, v5, v4}, Lx8/i;->c(ILx8/f;)V

    :cond_1e
    if-nez v19, :cond_1f

    iget-object v2, v0, Lb9/f0;->q0:Lu8/a0;

    iget-object v4, v0, Lb9/f0;->N:Lx8/i;

    new-instance v5, Lab/g0;

    const/4 v6, 0x4

    invoke-direct {v5, v2, v6}, Lab/g0;-><init>(Ljava/lang/Object;I)V

    const/16 v2, 0xe

    invoke-virtual {v4, v2, v5}, Lx8/i;->c(ILx8/f;)V

    :cond_1f
    if-eqz v11, :cond_20

    iget-object v2, v0, Lb9/f0;->N:Lx8/i;

    new-instance v4, Lb9/r;

    const/4 v5, 0x1

    invoke-direct {v4, v1, v5}, Lb9/r;-><init>(Lb9/c1;I)V

    move/from16 v5, v18

    invoke-virtual {v2, v5, v4}, Lx8/i;->c(ILx8/f;)V

    :cond_20
    if-nez v20, :cond_21

    if-eqz v7, :cond_22

    :cond_21
    iget-object v2, v0, Lb9/f0;->N:Lx8/i;

    new-instance v4, Lb9/r;

    const/4 v5, 0x2

    invoke-direct {v4, v1, v5}, Lb9/r;-><init>(Lb9/c1;I)V

    const/4 v9, -0x1

    invoke-virtual {v2, v9, v4}, Lx8/i;->c(ILx8/f;)V

    :cond_22
    if-eqz v20, :cond_23

    iget-object v2, v0, Lb9/f0;->N:Lx8/i;

    new-instance v4, Lb9/r;

    const/4 v5, 0x3

    invoke-direct {v4, v1, v5}, Lb9/r;-><init>(Lb9/c1;I)V

    const/4 v5, 0x4

    invoke-virtual {v2, v5, v4}, Lx8/i;->c(ILx8/f;)V

    :cond_23
    if-nez v7, :cond_24

    iget v2, v3, Lb9/c1;->m:I

    iget v4, v1, Lb9/c1;->m:I

    if-eq v2, v4, :cond_25

    :cond_24
    iget-object v2, v0, Lb9/f0;->N:Lx8/i;

    new-instance v4, Lb9/r;

    const/4 v5, 0x4

    invoke-direct {v4, v1, v5}, Lb9/r;-><init>(Lb9/c1;I)V

    const/4 v5, 0x5

    invoke-virtual {v2, v5, v4}, Lx8/i;->c(ILx8/f;)V

    :cond_25
    iget v2, v3, Lb9/c1;->n:I

    iget v4, v1, Lb9/c1;->n:I

    if-eq v2, v4, :cond_26

    iget-object v2, v0, Lb9/f0;->N:Lx8/i;

    new-instance v4, Lb9/r;

    const/4 v5, 0x5

    invoke-direct {v4, v1, v5}, Lb9/r;-><init>(Lb9/c1;I)V

    const/4 v5, 0x6

    invoke-virtual {v2, v5, v4}, Lx8/i;->c(ILx8/f;)V

    :cond_26
    invoke-virtual {v3}, Lb9/c1;->l()Z

    move-result v2

    invoke-virtual {v1}, Lb9/c1;->l()Z

    move-result v4

    if-eq v2, v4, :cond_27

    iget-object v2, v0, Lb9/f0;->N:Lx8/i;

    new-instance v4, Lb9/r;

    const/4 v5, 0x6

    invoke-direct {v4, v1, v5}, Lb9/r;-><init>(Lb9/c1;I)V

    const/4 v5, 0x7

    invoke-virtual {v2, v5, v4}, Lx8/i;->c(ILx8/f;)V

    :cond_27
    iget-object v2, v3, Lb9/c1;->o:Lu8/e0;

    iget-object v4, v1, Lb9/c1;->o:Lu8/e0;

    invoke-virtual {v2, v4}, Lu8/e0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_28

    iget-object v2, v0, Lb9/f0;->N:Lx8/i;

    new-instance v4, Lb9/r;

    const/4 v5, 0x7

    invoke-direct {v4, v1, v5}, Lb9/r;-><init>(Lb9/c1;I)V

    const/16 v5, 0xc

    invoke-virtual {v2, v5, v4}, Lx8/i;->c(ILx8/f;)V

    :cond_28
    invoke-virtual {v0}, Lb9/f0;->H0()V

    iget-object v2, v0, Lb9/f0;->N:Lx8/i;

    invoke-virtual {v2}, Lx8/i;->b()V

    iget-boolean v2, v3, Lb9/c1;->p:Z

    iget-boolean v1, v1, Lb9/c1;->p:Z

    if-eq v2, v1, :cond_29

    iget-object v1, v0, Lb9/f0;->O:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_29

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb9/c0;

    iget-object v2, v2, Lb9/c0;->w:Lb9/f0;

    invoke-virtual {v2}, Lb9/f0;->K0()V

    goto :goto_10

    :cond_29
    return-void
.end method

.method public final K0()V
    .locals 6

    invoke-virtual {p0}, Lb9/f0;->i0()I

    move-result v0

    iget-object v1, p0, Lb9/f0;->e0:Lb9/m1;

    iget-object v2, p0, Lb9/f0;->d0:Lb9/m1;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v0, v4, :cond_3

    const/4 v5, 0x2

    if-eq v0, v5, :cond_1

    const/4 v5, 0x3

    if-eq v0, v5, :cond_1

    const/4 v4, 0x4

    if-ne v0, v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1
    invoke-virtual {p0}, Lb9/f0;->L0()V

    iget-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    iget-boolean v0, v0, Lb9/c1;->p:Z

    invoke-virtual {p0}, Lb9/f0;->g0()Z

    move-result v5

    if-eqz v5, :cond_2

    if-nez v0, :cond_2

    move v3, v4

    :cond_2
    invoke-virtual {v2, v3}, Lb9/m1;->d(Z)V

    invoke-virtual {p0}, Lb9/f0;->g0()Z

    move-result v0

    invoke-virtual {v1, v0}, Lb9/m1;->d(Z)V

    return-void

    :cond_3
    :goto_0
    invoke-virtual {v2, v3}, Lb9/m1;->d(Z)V

    invoke-virtual {v1, v3}, Lb9/m1;->d(Z)V

    return-void
.end method

.method public final L0()V
    .locals 5

    iget-object v0, p0, Lb9/f0;->E:Lb9/m1;

    invoke-virtual {v0}, Lb9/m1;->a()V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lb9/f0;->U:Landroid/os/Looper;

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v2

    if-eq v0, v2, :cond_2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    sget v2, Lx8/t;->a:I

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "\'\nExpected thread: \'"

    const-string v3, "\'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread"

    const-string v4, "Player is accessed on the wrong thread.\nCurrent thread: \'"

    invoke-static {v4, v0, v2, v1, v3}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lb9/f0;->C0:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Lb9/f0;->D0:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    :goto_0
    const-string v2, "ExoPlayerImpl"

    invoke-static {v2, v0, v1}, Lx8/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb9/f0;->D0:Z

    return-void

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    return-void
.end method

.method public final Q(Lu8/h0;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lb9/f0;->N:Lx8/i;

    invoke-virtual {v0, p1}, Lx8/i;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final R()Lu8/a0;
    .locals 5

    invoke-virtual {p0}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v0

    invoke-virtual {v0}, Lu8/o0;->p()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lb9/f0;->H0:Lu8/a0;

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lb9/f0;->Z()I

    move-result v1

    iget-object v2, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v2, Lu8/n0;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lu8/o0;->m(ILu8/n0;J)Lu8/n0;

    move-result-object v0

    iget-object v0, v0, Lu8/n0;->c:Lu8/x;

    iget-object v1, p0, Lb9/f0;->H0:Lu8/a0;

    invoke-virtual {v1}, Lu8/a0;->a()Lu8/z;

    move-result-object v1

    iget-object v0, v0, Lu8/x;->d:Lu8/a0;

    if-nez v0, :cond_1

    goto/16 :goto_1

    :cond_1
    iget-object v2, v0, Lu8/a0;->A:Lzr/g0;

    iget-object v3, v0, Lu8/a0;->f:[B

    iget-object v4, v0, Lu8/a0;->a:Ljava/lang/CharSequence;

    if-eqz v4, :cond_2

    iput-object v4, v1, Lu8/z;->a:Ljava/lang/CharSequence;

    :cond_2
    iget-object v4, v0, Lu8/a0;->b:Ljava/lang/CharSequence;

    if-eqz v4, :cond_3

    iput-object v4, v1, Lu8/z;->b:Ljava/lang/CharSequence;

    :cond_3
    iget-object v4, v0, Lu8/a0;->c:Ljava/lang/CharSequence;

    if-eqz v4, :cond_4

    iput-object v4, v1, Lu8/z;->c:Ljava/lang/CharSequence;

    :cond_4
    iget-object v4, v0, Lu8/a0;->d:Ljava/lang/CharSequence;

    if-eqz v4, :cond_5

    iput-object v4, v1, Lu8/z;->d:Ljava/lang/CharSequence;

    :cond_5
    iget-object v4, v0, Lu8/a0;->e:Ljava/lang/CharSequence;

    if-eqz v4, :cond_6

    iput-object v4, v1, Lu8/z;->e:Ljava/lang/CharSequence;

    :cond_6
    if-eqz v3, :cond_8

    iget-object v4, v0, Lu8/a0;->g:Ljava/lang/Integer;

    if-nez v3, :cond_7

    const/4 v3, 0x0

    goto :goto_0

    :cond_7
    invoke-virtual {v3}, [B->clone()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    :goto_0
    iput-object v3, v1, Lu8/z;->f:[B

    iput-object v4, v1, Lu8/z;->g:Ljava/lang/Integer;

    :cond_8
    iget-object v3, v0, Lu8/a0;->h:Ljava/lang/Integer;

    if-eqz v3, :cond_9

    iput-object v3, v1, Lu8/z;->h:Ljava/lang/Integer;

    :cond_9
    iget-object v3, v0, Lu8/a0;->i:Ljava/lang/Integer;

    if-eqz v3, :cond_a

    iput-object v3, v1, Lu8/z;->i:Ljava/lang/Integer;

    :cond_a
    iget-object v3, v0, Lu8/a0;->j:Ljava/lang/Integer;

    if-eqz v3, :cond_b

    iput-object v3, v1, Lu8/z;->j:Ljava/lang/Integer;

    :cond_b
    iget-object v3, v0, Lu8/a0;->k:Ljava/lang/Boolean;

    if-eqz v3, :cond_c

    iput-object v3, v1, Lu8/z;->k:Ljava/lang/Boolean;

    :cond_c
    iget-object v3, v0, Lu8/a0;->l:Ljava/lang/Integer;

    if-eqz v3, :cond_d

    iput-object v3, v1, Lu8/z;->l:Ljava/lang/Integer;

    :cond_d
    iget-object v3, v0, Lu8/a0;->m:Ljava/lang/Integer;

    if-eqz v3, :cond_e

    iput-object v3, v1, Lu8/z;->l:Ljava/lang/Integer;

    :cond_e
    iget-object v3, v0, Lu8/a0;->n:Ljava/lang/Integer;

    if-eqz v3, :cond_f

    iput-object v3, v1, Lu8/z;->m:Ljava/lang/Integer;

    :cond_f
    iget-object v3, v0, Lu8/a0;->o:Ljava/lang/Integer;

    if-eqz v3, :cond_10

    iput-object v3, v1, Lu8/z;->n:Ljava/lang/Integer;

    :cond_10
    iget-object v3, v0, Lu8/a0;->p:Ljava/lang/Integer;

    if-eqz v3, :cond_11

    iput-object v3, v1, Lu8/z;->o:Ljava/lang/Integer;

    :cond_11
    iget-object v3, v0, Lu8/a0;->q:Ljava/lang/Integer;

    if-eqz v3, :cond_12

    iput-object v3, v1, Lu8/z;->p:Ljava/lang/Integer;

    :cond_12
    iget-object v3, v0, Lu8/a0;->r:Ljava/lang/Integer;

    if-eqz v3, :cond_13

    iput-object v3, v1, Lu8/z;->q:Ljava/lang/Integer;

    :cond_13
    iget-object v3, v0, Lu8/a0;->s:Ljava/lang/CharSequence;

    if-eqz v3, :cond_14

    iput-object v3, v1, Lu8/z;->r:Ljava/lang/CharSequence;

    :cond_14
    iget-object v3, v0, Lu8/a0;->t:Ljava/lang/CharSequence;

    if-eqz v3, :cond_15

    iput-object v3, v1, Lu8/z;->s:Ljava/lang/CharSequence;

    :cond_15
    iget-object v3, v0, Lu8/a0;->u:Ljava/lang/CharSequence;

    if-eqz v3, :cond_16

    iput-object v3, v1, Lu8/z;->t:Ljava/lang/CharSequence;

    :cond_16
    iget-object v3, v0, Lu8/a0;->v:Ljava/lang/Integer;

    if-eqz v3, :cond_17

    iput-object v3, v1, Lu8/z;->u:Ljava/lang/Integer;

    :cond_17
    iget-object v3, v0, Lu8/a0;->w:Ljava/lang/Integer;

    if-eqz v3, :cond_18

    iput-object v3, v1, Lu8/z;->v:Ljava/lang/Integer;

    :cond_18
    iget-object v3, v0, Lu8/a0;->x:Ljava/lang/CharSequence;

    if-eqz v3, :cond_19

    iput-object v3, v1, Lu8/z;->w:Ljava/lang/CharSequence;

    :cond_19
    iget-object v3, v0, Lu8/a0;->y:Ljava/lang/CharSequence;

    if-eqz v3, :cond_1a

    iput-object v3, v1, Lu8/z;->x:Ljava/lang/CharSequence;

    :cond_1a
    iget-object v0, v0, Lu8/a0;->z:Ljava/lang/Integer;

    if-eqz v0, :cond_1b

    iput-object v0, v1, Lu8/z;->y:Ljava/lang/Integer;

    :cond_1b
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1c

    invoke-static {v2}, Lzr/g0;->m(Ljava/util/Collection;)Lzr/g0;

    move-result-object v0

    iput-object v0, v1, Lu8/z;->z:Lzr/g0;

    :cond_1c
    :goto_1
    new-instance v0, Lu8/a0;

    invoke-direct {v0, v1}, Lu8/a0;-><init>(Lu8/z;)V

    return-object v0
.end method

.method public final S()V
    .locals 1

    invoke-virtual {p0}, Lb9/f0;->L0()V

    invoke-virtual {p0}, Lb9/f0;->u0()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lb9/f0;->E0(Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, Lb9/f0;->p0(II)V

    return-void
.end method

.method public final T(Lzr/w0;)Ljava/util/ArrayList;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    iget v2, p1, Lzr/w0;->z:I

    if-ge v1, v2, :cond_0

    invoke-virtual {p1, v1}, Lzr/w0;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu8/x;

    iget-object v3, p0, Lb9/f0;->S:Ll9/b0;

    invoke-interface {v3, v2}, Ll9/b0;->b(Lu8/x;)Ll9/a;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final U(Lb9/e1;)Lb9/f1;
    .locals 7

    iget-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    invoke-virtual {p0, v0}, Lb9/f0;->e0(Lb9/c1;)I

    move-result v0

    new-instance v1, Lb9/f1;

    iget-object v2, p0, Lb9/f0;->I0:Lb9/c1;

    iget-object v4, v2, Lb9/c1;->a:Lu8/o0;

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    const/4 v0, 0x0

    :cond_0
    move v5, v0

    iget-object v2, p0, Lb9/f0;->M:Lb9/l0;

    iget-object v6, v2, Lb9/l0;->J:Landroid/os/Looper;

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Lb9/f1;-><init>(Lb9/d1;Lb9/e1;Lu8/o0;ILandroid/os/Looper;)V

    return-object v1
.end method

.method public final V()J
    .locals 5

    invoke-virtual {p0}, Lb9/f0;->L0()V

    iget-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    iget-object v0, v0, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v0}, Lu8/o0;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lb9/f0;->K0:J

    return-wide v0

    :cond_0
    iget-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    iget-object v1, v0, Lb9/c1;->k:Ll9/c0;

    iget-wide v1, v1, Ll9/c0;->d:J

    iget-object v3, v0, Lb9/c1;->b:Ll9/c0;

    iget-wide v3, v3, Ll9/c0;->d:J

    cmp-long v1, v1, v3

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {p0}, Lb9/f0;->Z()I

    move-result v1

    iget-object v4, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v4, Lu8/n0;

    invoke-virtual {v0, v1, v4, v2, v3}, Lu8/o0;->m(ILu8/n0;J)Lu8/n0;

    move-result-object v0

    iget-wide v0, v0, Lu8/n0;->m:J

    invoke-static {v0, v1}, Lx8/t;->U(J)J

    move-result-wide v0

    return-wide v0

    :cond_1
    iget-wide v0, v0, Lb9/c1;->q:J

    iget-object v4, p0, Lb9/f0;->I0:Lb9/c1;

    iget-object v4, v4, Lb9/c1;->k:Ll9/c0;

    invoke-virtual {v4}, Ll9/c0;->b()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    iget-object v1, v0, Lb9/c1;->a:Lu8/o0;

    iget-object v0, v0, Lb9/c1;->k:Ll9/c0;

    iget-object v0, v0, Ll9/c0;->a:Ljava/lang/Object;

    iget-object v4, p0, Lb9/f0;->P:Lu8/m0;

    invoke-virtual {v1, v0, v4}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    move-result-object v0

    iget-object v1, p0, Lb9/f0;->I0:Lb9/c1;

    iget-object v1, v1, Lb9/c1;->k:Ll9/c0;

    iget v1, v1, Ll9/c0;->b:I

    invoke-virtual {v0, v1}, Lu8/m0;->d(I)J

    goto :goto_0

    :cond_2
    move-wide v2, v0

    :goto_0
    iget-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    iget-object v1, v0, Lb9/c1;->a:Lu8/o0;

    iget-object v0, v0, Lb9/c1;->k:Ll9/c0;

    iget-object v0, v0, Ll9/c0;->a:Ljava/lang/Object;

    iget-object v4, p0, Lb9/f0;->P:Lu8/m0;

    invoke-virtual {v1, v0, v4}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    iget-wide v0, v4, Lu8/m0;->e:J

    add-long/2addr v2, v0

    invoke-static {v2, v3}, Lx8/t;->U(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final W(Lb9/c1;)J
    .locals 7

    iget-object v0, p1, Lb9/c1;->b:Ll9/c0;

    iget-wide v1, p1, Lb9/c1;->c:J

    iget-object v3, p1, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v0}, Ll9/c0;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lb9/c1;->b:Ll9/c0;

    iget-object v0, v0, Ll9/c0;->a:Ljava/lang/Object;

    iget-object v4, p0, Lb9/f0;->P:Lu8/m0;

    invoke-virtual {v3, v0, v4}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v1, v5

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lb9/f0;->e0(Lb9/c1;)I

    move-result p1

    iget-object v0, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v0, Lu8/n0;

    const-wide/16 v1, 0x0

    invoke-virtual {v3, p1, v0, v1, v2}, Lu8/o0;->m(ILu8/n0;J)Lu8/n0;

    move-result-object p1

    iget-wide v0, p1, Lu8/n0;->l:J

    invoke-static {v0, v1}, Lx8/t;->U(J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-wide v3, v4, Lu8/m0;->e:J

    invoke-static {v3, v4}, Lx8/t;->U(J)J

    move-result-wide v3

    invoke-static {v1, v2}, Lx8/t;->U(J)J

    move-result-wide v0

    add-long/2addr v0, v3

    return-wide v0

    :cond_1
    invoke-virtual {p0, p1}, Lb9/f0;->b0(Lb9/c1;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lx8/t;->U(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final X()I
    .locals 1

    invoke-virtual {p0}, Lb9/f0;->L0()V

    invoke-virtual {p0}, Lb9/f0;->l0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    iget-object v0, v0, Lb9/c1;->b:Ll9/c0;

    iget v0, v0, Ll9/c0;->b:I

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public final Y()I
    .locals 1

    invoke-virtual {p0}, Lb9/f0;->L0()V

    invoke-virtual {p0}, Lb9/f0;->l0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    iget-object v0, v0, Lb9/c1;->b:Ll9/c0;

    iget v0, v0, Ll9/c0;->c:I

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public final Z()I
    .locals 2

    invoke-virtual {p0}, Lb9/f0;->L0()V

    iget-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    invoke-virtual {p0, v0}, Lb9/f0;->e0(Lb9/c1;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return v0
.end method

.method public final a0()J
    .locals 2

    invoke-virtual {p0}, Lb9/f0;->L0()V

    iget-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    invoke-virtual {p0, v0}, Lb9/f0;->b0(Lb9/c1;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lx8/t;->U(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final b0(Lb9/c1;)J
    .locals 4

    iget-object v0, p1, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v0}, Lu8/o0;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lb9/f0;->K0:J

    invoke-static {v0, v1}, Lx8/t;->J(J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-boolean v0, p1, Lb9/c1;->p:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lb9/c1;->k()J

    move-result-wide v0

    goto :goto_0

    :cond_1
    iget-wide v0, p1, Lb9/c1;->s:J

    :goto_0
    iget-object v2, p1, Lb9/c1;->b:Ll9/c0;

    invoke-virtual {v2}, Ll9/c0;->b()Z

    move-result v2

    if-eqz v2, :cond_2

    return-wide v0

    :cond_2
    iget-object v2, p1, Lb9/c1;->a:Lu8/o0;

    iget-object p1, p1, Lb9/c1;->b:Ll9/c0;

    iget-object p1, p1, Ll9/c0;->a:Ljava/lang/Object;

    iget-object v3, p0, Lb9/f0;->P:Lu8/m0;

    invoke-virtual {v2, p1, v3}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    iget-wide v2, v3, Lu8/m0;->e:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final c0()Lu8/o0;
    .locals 1

    invoke-virtual {p0}, Lb9/f0;->L0()V

    iget-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    iget-object v0, v0, Lb9/c1;->a:Lu8/o0;

    return-object v0
.end method

.method public final d0()Lu8/v0;
    .locals 1

    invoke-virtual {p0}, Lb9/f0;->L0()V

    iget-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    iget-object v0, v0, Lb9/c1;->i:Lo9/v;

    iget-object v0, v0, Lo9/v;->d:Lu8/v0;

    return-object v0
.end method

.method public final e0(Lb9/c1;)I
    .locals 2

    iget-object v0, p1, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v0}, Lu8/o0;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget p1, p0, Lb9/f0;->J0:I

    return p1

    :cond_0
    iget-object v0, p1, Lb9/c1;->a:Lu8/o0;

    iget-object p1, p1, Lb9/c1;->b:Ll9/c0;

    iget-object p1, p1, Ll9/c0;->a:Ljava/lang/Object;

    iget-object v1, p0, Lb9/f0;->P:Lu8/m0;

    invoke-virtual {v0, p1, v1}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    move-result-object p1

    iget p1, p1, Lu8/m0;->c:I

    return p1
.end method

.method public final f0()J
    .locals 4

    invoke-virtual {p0}, Lb9/f0;->L0()V

    invoke-virtual {p0}, Lb9/f0;->l0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    iget-object v1, v0, Lb9/c1;->b:Ll9/c0;

    iget-object v0, v0, Lb9/c1;->a:Lu8/o0;

    iget-object v2, v1, Ll9/c0;->a:Ljava/lang/Object;

    iget-object v3, p0, Lb9/f0;->P:Lu8/m0;

    invoke-virtual {v0, v2, v3}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    iget v0, v1, Ll9/c0;->b:I

    iget v1, v1, Ll9/c0;->c:I

    invoke-virtual {v3, v0, v1}, Lu8/m0;->a(II)J

    move-result-wide v0

    invoke-static {v0, v1}, Lx8/t;->U(J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-virtual {p0}, La2/a;->x()J

    move-result-wide v0

    return-wide v0
.end method

.method public final g0()Z
    .locals 1

    invoke-virtual {p0}, Lb9/f0;->L0()V

    iget-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    iget-boolean v0, v0, Lb9/c1;->l:Z

    return v0
.end method

.method public final h0()Lu8/e0;
    .locals 1

    invoke-virtual {p0}, Lb9/f0;->L0()V

    iget-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    iget-object v0, v0, Lb9/c1;->o:Lu8/e0;

    return-object v0
.end method

.method public final i0()I
    .locals 1

    invoke-virtual {p0}, Lb9/f0;->L0()V

    iget-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    iget v0, v0, Lb9/c1;->e:I

    return v0
.end method

.method public final k0()Lo9/j;
    .locals 1

    invoke-virtual {p0}, Lb9/f0;->L0()V

    iget-object v0, p0, Lb9/f0;->J:Lb3/b;

    check-cast v0, Lo9/q;

    invoke-virtual {v0}, Lo9/q;->N()Lo9/j;

    move-result-object v0

    return-object v0
.end method

.method public final l0()Z
    .locals 1

    invoke-virtual {p0}, Lb9/f0;->L0()V

    iget-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    iget-object v0, v0, Lb9/c1;->b:Ll9/c0;

    invoke-virtual {v0}, Ll9/c0;->b()Z

    move-result v0

    return v0
.end method

.method public final n0(Lb9/c1;Lu8/o0;Landroid/util/Pair;)Lb9/c1;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    invoke-virtual {v1}, Lu8/o0;->p()Z

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
    invoke-static {v3}, Lva3/g;->d(Z)V

    move-object/from16 v3, p1

    iget-object v6, v3, Lb9/c1;->a:Lu8/o0;

    invoke-virtual/range {p0 .. p1}, Lb9/f0;->W(Lb9/c1;)J

    move-result-wide v7

    invoke-virtual/range {p1 .. p2}, Lb9/c1;->i(Lu8/o0;)Lb9/c1;

    move-result-object v9

    invoke-virtual {v1}, Lu8/o0;->p()Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v10, Lb9/c1;->u:Ll9/c0;

    iget-wide v1, v0, Lb9/f0;->K0:J

    invoke-static {v1, v2}, Lx8/t;->J(J)J

    move-result-wide v11

    sget-object v19, Ll9/g1;->d:Ll9/g1;

    iget-object v1, v0, Lb9/f0;->y:Lo9/v;

    sget-object v21, Lzr/w0;->E:Lzr/w0;

    const-wide/16 v17, 0x0

    move-wide v13, v11

    move-wide v15, v11

    move-object/from16 v20, v1

    invoke-virtual/range {v9 .. v21}, Lb9/c1;->d(Ll9/c0;JJJJLl9/g1;Lo9/v;Ljava/util/List;)Lb9/c1;

    move-result-object v1

    invoke-virtual {v1, v10}, Lb9/c1;->c(Ll9/c0;)Lb9/c1;

    move-result-object v1

    iget-wide v2, v1, Lb9/c1;->s:J

    iput-wide v2, v1, Lb9/c1;->q:J

    return-object v1

    :cond_2
    iget-object v3, v9, Lb9/c1;->b:Ll9/c0;

    iget-object v3, v3, Ll9/c0;->a:Ljava/lang/Object;

    iget-object v10, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v3, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3

    new-instance v11, Ll9/c0;

    iget-object v12, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-direct {v11, v12}, Ll9/c0;-><init>(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object v11, v9, Lb9/c1;->b:Ll9/c0;

    :goto_2
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    invoke-static {v7, v8}, Lx8/t;->J(J)J

    move-result-wide v7

    invoke-virtual {v6}, Lu8/o0;->p()Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, v0, Lb9/f0;->P:Lu8/m0;

    invoke-virtual {v6, v3, v2}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    move-result-object v2

    iget-wide v2, v2, Lu8/m0;->e:J

    sub-long/2addr v7, v2

    :cond_4
    if-eqz v10, :cond_5

    cmp-long v2, v12, v7

    if-gez v2, :cond_6

    :cond_5
    move v1, v10

    move-object v10, v11

    move-wide v11, v12

    goto/16 :goto_6

    :cond_6
    if-nez v2, :cond_a

    iget-object v2, v9, Lb9/c1;->k:Ll9/c0;

    iget-object v2, v2, Ll9/c0;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lu8/o0;->b(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_8

    iget-object v3, v0, Lb9/f0;->P:Lu8/m0;

    invoke-virtual {v1, v2, v3, v4}, Lu8/o0;->f(ILu8/m0;Z)Lu8/m0;

    move-result-object v2

    iget v2, v2, Lu8/m0;->c:I

    iget-object v3, v11, Ll9/c0;->a:Ljava/lang/Object;

    iget-object v4, v0, Lb9/f0;->P:Lu8/m0;

    invoke-virtual {v1, v3, v4}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    move-result-object v3

    iget v3, v3, Lu8/m0;->c:I

    if-eq v2, v3, :cond_7

    goto :goto_3

    :cond_7
    return-object v9

    :cond_8
    :goto_3
    iget-object v2, v11, Ll9/c0;->a:Ljava/lang/Object;

    iget-object v3, v0, Lb9/f0;->P:Lu8/m0;

    invoke-virtual {v1, v2, v3}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    invoke-virtual {v11}, Ll9/c0;->b()Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, v0, Lb9/f0;->P:Lu8/m0;

    iget v2, v11, Ll9/c0;->b:I

    iget v3, v11, Ll9/c0;->c:I

    invoke-virtual {v1, v2, v3}, Lu8/m0;->a(II)J

    move-result-wide v1

    :goto_4
    move-object v10, v11

    goto :goto_5

    :cond_9
    iget-object v1, v0, Lb9/f0;->P:Lu8/m0;

    iget-wide v1, v1, Lu8/m0;->d:J

    goto :goto_4

    :goto_5
    iget-wide v11, v9, Lb9/c1;->s:J

    iget-wide v13, v9, Lb9/c1;->s:J

    iget-wide v3, v9, Lb9/c1;->d:J

    iget-wide v5, v9, Lb9/c1;->s:J

    sub-long v17, v1, v5

    iget-object v5, v9, Lb9/c1;->h:Ll9/g1;

    iget-object v6, v9, Lb9/c1;->i:Lo9/v;

    iget-object v7, v9, Lb9/c1;->j:Ljava/util/List;

    move-wide v15, v3

    move-object/from16 v19, v5

    move-object/from16 v20, v6

    move-object/from16 v21, v7

    invoke-virtual/range {v9 .. v21}, Lb9/c1;->d(Ll9/c0;JJJJLl9/g1;Lo9/v;Ljava/util/List;)Lb9/c1;

    move-result-object v3

    invoke-virtual {v3, v10}, Lb9/c1;->c(Ll9/c0;)Lb9/c1;

    move-result-object v3

    iput-wide v1, v3, Lb9/c1;->q:J

    return-object v3

    :cond_a
    move-object v10, v11

    invoke-virtual {v10}, Ll9/c0;->b()Z

    move-result v1

    xor-int/2addr v1, v5

    invoke-static {v1}, Lva3/g;->i(Z)V

    iget-wide v1, v9, Lb9/c1;->r:J

    sub-long v3, v12, v7

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x0

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v17

    iget-wide v1, v9, Lb9/c1;->q:J

    iget-object v3, v9, Lb9/c1;->k:Ll9/c0;

    iget-object v4, v9, Lb9/c1;->b:Ll9/c0;

    invoke-virtual {v3, v4}, Ll9/c0;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    add-long v1, v12, v17

    :cond_b
    iget-object v3, v9, Lb9/c1;->h:Ll9/g1;

    iget-object v4, v9, Lb9/c1;->i:Lo9/v;

    iget-object v5, v9, Lb9/c1;->j:Ljava/util/List;

    move-wide v11, v12

    move-wide v13, v11

    move-wide v15, v11

    move-object/from16 v19, v3

    move-object/from16 v20, v4

    move-object/from16 v21, v5

    invoke-virtual/range {v9 .. v21}, Lb9/c1;->d(Ll9/c0;JJJJLl9/g1;Lo9/v;Ljava/util/List;)Lb9/c1;

    move-result-object v3

    iput-wide v1, v3, Lb9/c1;->q:J

    return-object v3

    :goto_6
    invoke-virtual {v10}, Ll9/c0;->b()Z

    move-result v2

    xor-int/2addr v2, v5

    invoke-static {v2}, Lva3/g;->i(Z)V

    if-nez v1, :cond_c

    sget-object v2, Ll9/g1;->d:Ll9/g1;

    :goto_7
    move-object/from16 v19, v2

    goto :goto_8

    :cond_c
    iget-object v2, v9, Lb9/c1;->h:Ll9/g1;

    goto :goto_7

    :goto_8
    if-nez v1, :cond_d

    iget-object v2, v0, Lb9/f0;->y:Lo9/v;

    :goto_9
    move-object/from16 v20, v2

    goto :goto_a

    :cond_d
    iget-object v2, v9, Lb9/c1;->i:Lo9/v;

    goto :goto_9

    :goto_a
    if-nez v1, :cond_e

    sget-object v1, Lzr/g0;->x:Lzr/e0;

    sget-object v1, Lzr/w0;->E:Lzr/w0;

    :goto_b
    move-object/from16 v21, v1

    goto :goto_c

    :cond_e
    iget-object v1, v9, Lb9/c1;->j:Ljava/util/List;

    goto :goto_b

    :goto_c
    const-wide/16 v17, 0x0

    move-wide v13, v11

    move-wide v15, v11

    invoke-virtual/range {v9 .. v21}, Lb9/c1;->d(Ll9/c0;JJJJLl9/g1;Lo9/v;Ljava/util/List;)Lb9/c1;

    move-result-object v1

    invoke-virtual {v1, v10}, Lb9/c1;->c(Ll9/c0;)Lb9/c1;

    move-result-object v1

    iput-wide v11, v1, Lb9/c1;->q:J

    return-object v1
.end method

.method public final o0(Lu8/o0;IJ)Landroid/util/Pair;
    .locals 6

    invoke-virtual {p1}, Lu8/o0;->p()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_1

    iput p2, p0, Lb9/f0;->J0:I

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p3, p1

    if-nez p1, :cond_0

    move-wide p3, v1

    :cond_0
    iput-wide p3, p0, Lb9/f0;->K0:J

    const/4 p1, 0x0

    return-object p1

    :cond_1
    const/4 v0, -0x1

    if-eq p2, v0, :cond_3

    invoke-virtual {p1}, Lu8/o0;->o()I

    move-result v0

    if-lt p2, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    move v3, p2

    goto :goto_2

    :cond_3
    :goto_1
    iget-boolean p2, p0, Lb9/f0;->i0:Z

    invoke-virtual {p1, p2}, Lu8/o0;->a(Z)I

    move-result p2

    iget-object p3, p0, La2/a;->x:Ljava/lang/Object;

    check-cast p3, Lu8/n0;

    invoke-virtual {p1, p2, p3, v1, v2}, Lu8/o0;->m(ILu8/n0;J)Lu8/n0;

    move-result-object p3

    iget-wide p3, p3, Lu8/n0;->l:J

    invoke-static {p3, p4}, Lx8/t;->U(J)J

    move-result-wide p3

    goto :goto_0

    :goto_2
    iget-object p2, p0, La2/a;->x:Ljava/lang/Object;

    move-object v1, p2

    check-cast v1, Lu8/n0;

    iget-object v2, p0, Lb9/f0;->P:Lu8/m0;

    invoke-static {p3, p4}, Lx8/t;->J(J)J

    move-result-wide v4

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lu8/o0;->i(Lu8/n0;Lu8/m0;IJ)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method public final p0(II)V
    .locals 3

    iget-object v0, p0, Lb9/f0;->y0:Lx8/o;

    iget v1, v0, Lx8/o;->a:I

    if-ne p1, v1, :cond_1

    iget v0, v0, Lx8/o;->b:I

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    new-instance v0, Lx8/o;

    invoke-direct {v0, p1, p2}, Lx8/o;-><init>(II)V

    iput-object v0, p0, Lb9/f0;->y0:Lx8/o;

    new-instance v0, Lb9/s;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lb9/s;-><init>(III)V

    iget-object v1, p0, Lb9/f0;->N:Lx8/i;

    const/16 v2, 0x18

    invoke-virtual {v1, v2, v0}, Lx8/i;->e(ILx8/f;)V

    new-instance v0, Lx8/o;

    invoke-direct {v0, p1, p2}, Lx8/o;-><init>(II)V

    const/4 p1, 0x2

    const/16 p2, 0xe

    invoke-virtual {p0, p1, p2, v0}, Lb9/f0;->v0(IILjava/lang/Object;)V

    return-void
.end method

.method public final q0()V
    .locals 12

    invoke-virtual {p0}, Lb9/f0;->L0()V

    iget-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    iget v1, v0, Lb9/c1;->e:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lb9/c1;->f(Landroidx/media3/exoplayer/ExoPlaybackException;)Lb9/c1;

    move-result-object v0

    iget-object v1, v0, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v1}, Lu8/o0;->p()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    invoke-static {v0, v1}, Lb9/f0;->m0(Lb9/c1;I)Lb9/c1;

    move-result-object v4

    iget v0, p0, Lb9/f0;->j0:I

    add-int/2addr v0, v2

    iput v0, p0, Lb9/f0;->j0:I

    iget-object v0, p0, Lb9/f0;->M:Lb9/l0;

    iget-object v0, v0, Lb9/l0;->H:Lx8/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lx8/r;->b()Lx8/q;

    move-result-object v1

    iget-object v0, v0, Lx8/r;->a:Landroid/os/Handler;

    const/16 v2, 0x1d

    invoke-virtual {v0, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    iput-object v0, v1, Lx8/q;->a:Landroid/os/Message;

    invoke-virtual {v1}, Lx8/q;->b()V

    const/4 v10, -0x1

    const/4 v11, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x5

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    move-object v3, p0

    invoke-virtual/range {v3 .. v11}, Lb9/f0;->J0(Lb9/c1;IZIJIZ)V

    return-void
.end method

.method public final r0()V
    .locals 7

    const-string v0, "ExoPlayerImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Release "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " [AndroidXMedia3/1.6.1] ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lx8/t;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "] ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lu8/y;->a:Ljava/util/HashSet;

    const-class v2, Lu8/y;

    monitor-enter v2

    :try_start_0
    sget-object v3, Lu8/y;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v2

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lx8/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lb9/f0;->L0()V

    iget-object v0, p0, Lb9/f0;->c0:Lb9/b;

    invoke-virtual {v0}, Lb9/b;->z()V

    iget-object v0, p0, Lb9/f0;->d0:Lb9/m1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lb9/m1;->d(Z)V

    iget-object v0, p0, Lb9/f0;->e0:Lb9/m1;

    invoke-virtual {v0, v1}, Lb9/m1;->d(Z)V

    iget-object v0, p0, Lb9/f0;->M:Lb9/l0;

    monitor-enter v0

    :try_start_1
    iget-boolean v1, v0, Lb9/l0;->d0:Z

    const/4 v2, 0x7

    const/4 v3, 0x1

    if-nez v1, :cond_1

    iget-object v1, v0, Lb9/l0;->J:Landroid/os/Looper;

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lb9/l0;->H:Lx8/r;

    invoke-virtual {v1, v2}, Lx8/r;->e(I)Z

    new-instance v1, Lb9/n;

    invoke-direct {v1, v0, v3}, Lb9/n;-><init>(Ljava/lang/Object;I)V

    iget-wide v4, v0, Lb9/l0;->U:J

    invoke-virtual {v0, v1, v4, v5}, Lb9/l0;->w0(Lyr/i;J)V

    iget-boolean v1, v0, Lb9/l0;->d0:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto/16 :goto_3

    :cond_1
    :goto_0
    monitor-exit v0

    move v1, v3

    :goto_1
    if-nez v1, :cond_2

    iget-object v0, p0, Lb9/f0;->N:Lx8/i;

    new-instance v1, Lab/a;

    invoke-direct {v1, v2}, Lab/a;-><init>(I)V

    const/16 v2, 0xa

    invoke-virtual {v0, v2, v1}, Lx8/i;->e(ILx8/f;)V

    :cond_2
    iget-object v0, p0, Lb9/f0;->N:Lx8/i;

    invoke-virtual {v0}, Lx8/i;->d()V

    iget-object v0, p0, Lb9/f0;->K:Lx8/r;

    iget-object v0, v0, Lx8/r;->a:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Lb9/f0;->V:Lp9/d;

    iget-object v2, p0, Lb9/f0;->T:Lc9/h;

    check-cast v0, Lp9/f;

    iget-object v0, v0, Lp9/f;->c:Lko/d;

    iget-object v0, v0, Lko/d;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp9/c;

    iget-object v6, v5, Lp9/c;->b:Lc9/h;

    if-ne v6, v2, :cond_3

    iput-boolean v3, v5, Lp9/c;->c:Z

    invoke-virtual {v0, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    iget-boolean v2, v0, Lb9/c1;->p:Z

    if-eqz v2, :cond_5

    invoke-virtual {v0}, Lb9/c1;->a()Lb9/c1;

    move-result-object v0

    iput-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    :cond_5
    iget-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    invoke-static {v0, v3}, Lb9/f0;->m0(Lb9/c1;I)Lb9/c1;

    move-result-object v0

    iput-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    iget-object v2, v0, Lb9/c1;->b:Ll9/c0;

    invoke-virtual {v0, v2}, Lb9/c1;->c(Ll9/c0;)Lb9/c1;

    move-result-object v0

    iput-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    iget-wide v4, v0, Lb9/c1;->s:J

    iput-wide v4, v0, Lb9/c1;->q:J

    iget-object v0, p0, Lb9/f0;->I0:Lb9/c1;

    const-wide/16 v4, 0x0

    iput-wide v4, v0, Lb9/c1;->r:J

    iget-object v0, p0, Lb9/f0;->T:Lc9/h;

    iget-object v2, v0, Lc9/h;->H:Lx8/r;

    invoke-static {v2}, Lva3/g;->j(Ljava/lang/Object;)V

    new-instance v4, Landroidx/fragment/app/m;

    const/16 v5, 0xb

    invoke-direct {v4, v0, v5}, Landroidx/fragment/app/m;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v4}, Lx8/r;->c(Ljava/lang/Runnable;)Z

    invoke-virtual {p0}, Lb9/f0;->u0()V

    iget-object v0, p0, Lb9/f0;->s0:Landroid/view/Surface;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    iput-object v1, p0, Lb9/f0;->s0:Landroid/view/Surface;

    :cond_6
    sget-object v0, Lw8/c;->b:Lw8/c;

    iput-object v0, p0, Lb9/f0;->B0:Lw8/c;

    iput-boolean v3, p0, Lb9/f0;->F0:Z

    return-void

    :goto_3
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public final s0(Lu8/h0;)V
    .locals 7

    invoke-virtual {p0}, Lb9/f0;->L0()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lb9/f0;->N:Lx8/i;

    invoke-virtual {v0}, Lx8/i;->f()V

    iget-object v1, v0, Lx8/i;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx8/h;

    iget-object v4, v3, Lx8/h;->a:Ljava/lang/Object;

    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, v0, Lx8/i;->c:Lx8/g;

    const/4 v5, 0x1

    iput-boolean v5, v3, Lx8/h;->d:Z

    iget-boolean v5, v3, Lx8/h;->c:Z

    if-eqz v5, :cond_1

    const/4 v5, 0x0

    iput-boolean v5, v3, Lx8/h;->c:Z

    iget-object v5, v3, Lx8/h;->a:Ljava/lang/Object;

    iget-object v6, v3, Lx8/h;->b:Llo/e;

    invoke-virtual {v6}, Llo/e;->c()Lu8/n;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Lx8/g;->a(Ljava/lang/Object;Lu8/n;)V

    :cond_1
    invoke-virtual {v1, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final setImageOutput(Landroidx/media3/exoplayer/image/ImageOutput;)V
    .locals 2

    invoke-virtual {p0}, Lb9/f0;->L0()V

    const/4 v0, 0x4

    const/16 v1, 0xf

    invoke-virtual {p0, v0, v1, p1}, Lb9/f0;->v0(IILjava/lang/Object;)V

    return-void
.end method

.method public final t0(I)V
    .locals 7

    add-int/lit8 v0, p1, -0x1

    :goto_0
    if-ltz v0, :cond_0

    iget-object v1, p0, Lb9/f0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb9/f0;->n0:Ll9/c1;

    iget-object v1, v0, Ll9/c1;->b:[I

    array-length v2, v1

    sub-int/2addr v2, p1

    new-array v2, v2, [I

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    array-length v5, v1

    if-ge v3, v5, :cond_3

    aget v5, v1, v3

    if-ltz v5, :cond_1

    if-ge v5, p1, :cond_1

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_1
    sub-int v6, v3, v4

    if-ltz v5, :cond_2

    sub-int/2addr v5, p1

    :cond_2
    aput v5, v2, v6

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    new-instance p1, Ll9/c1;

    new-instance v1, Ljava/util/Random;

    iget-object v0, v0, Ll9/c1;->a:Ljava/util/Random;

    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    move-result-wide v3

    invoke-direct {v1, v3, v4}, Ljava/util/Random;-><init>(J)V

    invoke-direct {p1, v2, v1}, Ll9/c1;-><init>([ILjava/util/Random;)V

    iput-object p1, p0, Lb9/f0;->n0:Ll9/c1;

    return-void
.end method

.method public final u0()V
    .locals 4

    iget-object v0, p0, Lb9/f0;->u0:Ls9/i;

    iget-object v1, p0, Lb9/f0;->a0:Lb9/c0;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb9/f0;->b0:Lb9/d0;

    invoke-virtual {p0, v0}, Lb9/f0;->U(Lb9/e1;)Lb9/f1;

    move-result-object v0

    iget-boolean v3, v0, Lb9/f1;->f:Z

    xor-int/lit8 v3, v3, 0x1

    invoke-static {v3}, Lva3/g;->i(Z)V

    const/16 v3, 0x2710

    iput v3, v0, Lb9/f1;->c:I

    iget-boolean v3, v0, Lb9/f1;->f:Z

    xor-int/lit8 v3, v3, 0x1

    invoke-static {v3}, Lva3/g;->i(Z)V

    iput-object v2, v0, Lb9/f1;->d:Ljava/lang/Object;

    invoke-virtual {v0}, Lb9/f1;->b()V

    iget-object v0, p0, Lb9/f0;->u0:Ls9/i;

    iget-object v0, v0, Ls9/i;->w:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    iput-object v2, p0, Lb9/f0;->u0:Ls9/i;

    :cond_0
    iget-object v0, p0, Lb9/f0;->w0:Landroid/view/TextureView;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    move-result-object v0

    if-eq v0, v1, :cond_1

    const-string v0, "ExoPlayerImpl"

    const-string v3, "SurfaceTextureListener already unset or replaced."

    invoke-static {v0, v3}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lb9/f0;->w0:Landroid/view/TextureView;

    invoke-virtual {v0, v2}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    :goto_0
    iput-object v2, p0, Lb9/f0;->w0:Landroid/view/TextureView;

    :cond_2
    iget-object v0, p0, Lb9/f0;->t0:Landroid/view/SurfaceHolder;

    if-eqz v0, :cond_3

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    iput-object v2, p0, Lb9/f0;->t0:Landroid/view/SurfaceHolder;

    :cond_3
    return-void
.end method

.method public final v0(IILjava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Lb9/f0;->H:[Lb9/f;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/4 v4, -0x1

    if-ge v3, v1, :cond_2

    aget-object v5, v0, v3

    if-eq p1, v4, :cond_0

    iget v4, v5, Lb9/f;->x:I

    if-ne v4, p1, :cond_1

    :cond_0
    invoke-virtual {p0, v5}, Lb9/f0;->U(Lb9/e1;)Lb9/f1;

    move-result-object v4

    iget-boolean v5, v4, Lb9/f1;->f:Z

    xor-int/lit8 v5, v5, 0x1

    invoke-static {v5}, Lva3/g;->i(Z)V

    iput p2, v4, Lb9/f1;->c:I

    iget-boolean v5, v4, Lb9/f1;->f:Z

    xor-int/lit8 v5, v5, 0x1

    invoke-static {v5}, Lva3/g;->i(Z)V

    iput-object p3, v4, Lb9/f1;->d:Ljava/lang/Object;

    invoke-virtual {v4}, Lb9/f1;->b()V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lb9/f0;->I:[Lb9/f;

    array-length v1, v0

    :goto_1
    if-ge v2, v1, :cond_5

    aget-object v3, v0, v2

    if-eqz v3, :cond_4

    if-eq p1, v4, :cond_3

    iget v5, v3, Lb9/f;->x:I

    if-ne v5, p1, :cond_4

    :cond_3
    invoke-virtual {p0, v3}, Lb9/f0;->U(Lb9/e1;)Lb9/f1;

    move-result-object v3

    iget-boolean v5, v3, Lb9/f1;->f:Z

    xor-int/lit8 v5, v5, 0x1

    invoke-static {v5}, Lva3/g;->i(Z)V

    iput p2, v3, Lb9/f1;->c:I

    iget-boolean v5, v3, Lb9/f1;->f:Z

    xor-int/lit8 v5, v5, 0x1

    invoke-static {v5}, Lva3/g;->i(Z)V

    iput-object p3, v3, Lb9/f1;->d:Ljava/lang/Object;

    invoke-virtual {v3}, Lb9/f1;->b()V

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    return-void
.end method

.method public final w0(Ll9/a;)V
    .locals 6

    invoke-virtual {p0}, Lb9/f0;->L0()V

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Lb9/f0;->L0()V

    invoke-virtual {p0}, Lb9/f0;->L0()V

    const/4 v2, -0x1

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v5, 0x1

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lb9/f0;->x0(Ljava/util/List;IJZ)V

    return-void
.end method

.method public final x0(Ljava/util/List;IJZ)V
    .locals 14

    move/from16 v1, p2

    iget-object v2, p0, Lb9/f0;->I0:Lb9/c1;

    invoke-virtual {p0, v2}, Lb9/f0;->e0(Lb9/c1;)I

    move-result v2

    invoke-virtual {p0}, Lb9/f0;->a0()J

    move-result-wide v3

    iget v5, p0, Lb9/f0;->j0:I

    const/4 v6, 0x1

    add-int/2addr v5, v6

    iput v5, p0, Lb9/f0;->j0:I

    iget-object v5, p0, Lb9/f0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_0

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-virtual {p0, v7}, Lb9/f0;->t0(I)V

    :cond_0
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    const/4 v7, 0x0

    move v8, v7

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v10

    if-ge v8, v10, :cond_1

    new-instance v10, Lb9/a1;

    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll9/a;

    iget-boolean v13, p0, Lb9/f0;->R:Z

    invoke-direct {v10, v12, v13}, Lb9/a1;-><init>(Ll9/a;Z)V

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, Lb9/e0;

    iget-object v13, v10, Lb9/a1;->b:Ljava/lang/Object;

    iget-object v10, v10, Lb9/a1;->a:Ll9/x;

    invoke-direct {v12, v13, v10}, Lb9/e0;-><init>(Ljava/lang/Object;Ll9/x;)V

    invoke-virtual {v5, v8, v12}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_1
    iget-object v8, p0, Lb9/f0;->n0:Ll9/c1;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v10

    invoke-virtual {v8, v10}, Ll9/c1;->a(I)Ll9/c1;

    move-result-object v8

    iput-object v8, p0, Lb9/f0;->n0:Ll9/c1;

    new-instance v8, Lb9/h1;

    iget-object v10, p0, Lb9/f0;->n0:Ll9/c1;

    invoke-direct {v8, v5, v10}, Lb9/h1;-><init>(Ljava/util/ArrayList;Ll9/c1;)V

    invoke-virtual {v8}, Lu8/o0;->p()Z

    move-result v5

    iget v10, v8, Lb9/h1;->d:I

    if-nez v5, :cond_3

    if-ge v1, v10, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, Landroidx/media3/common/IllegalSeekPositionException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_3
    :goto_1
    const/4 v5, -0x1

    if-eqz p5, :cond_4

    iget-boolean v1, p0, Lb9/f0;->i0:Z

    invoke-virtual {v8, v1}, Lb9/h1;->a(Z)I

    move-result v1

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    :goto_2
    move v11, v1

    goto :goto_3

    :cond_4
    if-ne v1, v5, :cond_5

    move v11, v2

    move-wide v2, v3

    goto :goto_3

    :cond_5
    move-wide/from16 v2, p3

    goto :goto_2

    :goto_3
    iget-object v1, p0, Lb9/f0;->I0:Lb9/c1;

    invoke-virtual {p0, v8, v11, v2, v3}, Lb9/f0;->o0(Lu8/o0;IJ)Landroid/util/Pair;

    move-result-object v4

    invoke-virtual {p0, v1, v8, v4}, Lb9/f0;->n0(Lb9/c1;Lu8/o0;Landroid/util/Pair;)Lb9/c1;

    move-result-object v1

    iget v4, v1, Lb9/c1;->e:I

    if-eq v11, v5, :cond_8

    if-eq v4, v6, :cond_8

    invoke-virtual {v8}, Lu8/o0;->p()Z

    move-result v4

    if-nez v4, :cond_7

    if-lt v11, v10, :cond_6

    goto :goto_4

    :cond_6
    const/4 v4, 0x2

    goto :goto_5

    :cond_7
    :goto_4
    const/4 v4, 0x4

    :cond_8
    :goto_5
    invoke-static {v1, v4}, Lb9/f0;->m0(Lb9/c1;I)Lb9/c1;

    move-result-object v1

    invoke-static {v2, v3}, Lx8/t;->J(J)J

    move-result-wide v12

    iget-object v10, p0, Lb9/f0;->n0:Ll9/c1;

    iget-object v2, p0, Lb9/f0;->M:Lb9/l0;

    iget-object v2, v2, Lb9/l0;->H:Lx8/r;

    new-instance v8, Lb9/i0;

    invoke-direct/range {v8 .. v13}, Lb9/i0;-><init>(Ljava/util/ArrayList;Ll9/c1;IJ)V

    const/16 v3, 0x11

    invoke-virtual {v2, v3, v8}, Lx8/r;->a(ILjava/lang/Object;)Lx8/q;

    move-result-object v2

    invoke-virtual {v2}, Lx8/q;->b()V

    iget-object v2, p0, Lb9/f0;->I0:Lb9/c1;

    iget-object v2, v2, Lb9/c1;->b:Ll9/c0;

    iget-object v2, v2, Ll9/c0;->a:Ljava/lang/Object;

    iget-object v3, v1, Lb9/c1;->b:Ll9/c0;

    iget-object v3, v3, Ll9/c0;->a:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    iget-object v2, p0, Lb9/f0;->I0:Lb9/c1;

    iget-object v2, v2, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v2}, Lu8/o0;->p()Z

    move-result v2

    if-nez v2, :cond_9

    move v3, v6

    goto :goto_6

    :cond_9
    move v3, v7

    :goto_6
    invoke-virtual {p0, v1}, Lb9/f0;->b0(Lb9/c1;)J

    move-result-wide v5

    const/4 v7, -0x1

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x4

    move-object v0, p0

    invoke-virtual/range {v0 .. v8}, Lb9/f0;->J0(Lb9/c1;IZIJIZ)V

    return-void
.end method

.method public final y0(Landroid/view/SurfaceHolder;)V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lb9/f0;->v0:Z

    iput-object p1, p0, Lb9/f0;->t0:Landroid/view/SurfaceHolder;

    iget-object v1, p0, Lb9/f0;->a0:Lb9/c0;

    invoke-interface {p1, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    iget-object p1, p0, Lb9/f0;->t0:Landroid/view/SurfaceHolder;

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/Surface;->isValid()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lb9/f0;->t0:Landroid/view/SurfaceHolder;

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lb9/f0;->p0(II)V

    return-void

    :cond_0
    invoke-virtual {p0, v0, v0}, Lb9/f0;->p0(II)V

    return-void
.end method

.method public final z0(Z)V
    .locals 1

    invoke-virtual {p0}, Lb9/f0;->L0()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p1}, Lb9/f0;->I0(IZ)V

    return-void
.end method

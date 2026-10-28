.class public final Lb9/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;
.implements Ll9/z;
.implements Lb9/d1;


# static fields
.field public static final A0:J


# instance fields
.field public final E:Lo9/v;

.field public final F:Lb9/k;

.field public final G:Lp9/d;

.field public final H:Lx8/r;

.field public final I:Llo/r;

.field public final J:Landroid/os/Looper;

.field public final K:Lu8/n0;

.field public final L:Lu8/m0;

.field public final M:J

.field public final N:Lb9/l;

.field public final O:Ljava/util/ArrayList;

.field public final P:Lx8/p;

.field public final Q:Lb9/u;

.field public final R:Lb9/s0;

.field public final S:Lb9/b1;

.field public final T:Lb9/i;

.field public final U:J

.field public final V:Lc9/n;

.field public final W:Lc9/h;

.field public final X:Lx8/r;

.field public final Y:Z

.field public final Z:Lb9/e;

.field public a0:Lb9/k1;

.field public b0:Lb9/c1;

.field public c0:Lab/y;

.field public d0:Z

.field public e0:Z

.field public f0:Z

.field public g0:Z

.field public h0:J

.field public i0:Z

.field public j0:I

.field public k0:Z

.field public l0:Z

.field public m0:Z

.field public n0:Z

.field public o0:I

.field public p0:Lb9/k0;

.field public q0:J

.field public r0:J

.field public s0:I

.field public t0:Z

.field public u0:Landroidx/media3/exoplayer/ExoPlaybackException;

.field public v0:J

.field public final w:[Lb9/j1;

.field public w0:Lb9/q;

.field public final x:[Lb9/f;

.field public x0:J

.field public final y:[Z

.field public y0:Z

.field public final z:Lb3/b;

.field public z0:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/16 v0, 0x2710

    invoke-static {v0, v1}, Lx8/t;->U(J)J

    move-result-wide v0

    sput-wide v0, Lb9/l0;->A0:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;[Lb9/f;[Lb9/f;Lb3/b;Lo9/v;Lb9/k;Lp9/d;IZLc9/h;Lb9/k1;Lb9/i;JLandroid/os/Looper;Lx8/p;Lb9/u;Lc9/n;Lb9/q;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v2, p4

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    move-object/from16 v5, p10

    move-object/from16 v6, p16

    move-object/from16 v7, p18

    move-object/from16 v8, p19

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v9, v1, Lb9/l0;->x0:J

    move-object/from16 v11, p17

    iput-object v11, v1, Lb9/l0;->Q:Lb9/u;

    iput-object v2, v1, Lb9/l0;->z:Lb3/b;

    move-object/from16 v11, p5

    iput-object v11, v1, Lb9/l0;->E:Lo9/v;

    iput-object v3, v1, Lb9/l0;->F:Lb9/k;

    iput-object v4, v1, Lb9/l0;->G:Lp9/d;

    move/from16 v12, p8

    iput v12, v1, Lb9/l0;->j0:I

    move/from16 v12, p9

    iput-boolean v12, v1, Lb9/l0;->k0:Z

    move-object/from16 v12, p11

    iput-object v12, v1, Lb9/l0;->a0:Lb9/k1;

    move-object/from16 v12, p12

    iput-object v12, v1, Lb9/l0;->T:Lb9/i;

    move-wide/from16 v12, p13

    iput-wide v12, v1, Lb9/l0;->U:J

    const/4 v12, 0x0

    iput-boolean v12, v1, Lb9/l0;->e0:Z

    iput-object v6, v1, Lb9/l0;->P:Lx8/p;

    iput-object v7, v1, Lb9/l0;->V:Lc9/n;

    iput-object v8, v1, Lb9/l0;->w0:Lb9/q;

    iput-object v5, v1, Lb9/l0;->W:Lc9/h;

    const/high16 v13, 0x3f800000    # 1.0f

    iput v13, v1, Lb9/l0;->z0:F

    iput-wide v9, v1, Lb9/l0;->v0:J

    iput-wide v9, v1, Lb9/l0;->h0:J

    iget-wide v9, v3, Lb9/k;->g:J

    iput-wide v9, v1, Lb9/l0;->M:J

    sget-object v3, Lu8/o0;->a:Lu8/l0;

    invoke-static {v11}, Lb9/c1;->j(Lo9/v;)Lb9/c1;

    move-result-object v3

    iput-object v3, v1, Lb9/l0;->b0:Lb9/c1;

    new-instance v9, Lab/y;

    invoke-direct {v9, v3}, Lab/y;-><init>(Lb9/c1;)V

    iput-object v9, v1, Lb9/l0;->c0:Lab/y;

    array-length v3, v0

    new-array v3, v3, [Lb9/f;

    iput-object v3, v1, Lb9/l0;->x:[Lb9/f;

    array-length v3, v0

    new-array v3, v3, [Z

    iput-object v3, v1, Lb9/l0;->y:[Z

    move-object v3, v2

    check-cast v3, Lo9/q;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length v9, v0

    new-array v9, v9, [Lb9/j1;

    iput-object v9, v1, Lb9/l0;->w:[Lb9/j1;

    move v9, v12

    move v10, v9

    :goto_0
    array-length v11, v0

    const/4 v13, 0x1

    if-ge v9, v11, :cond_1

    aget-object v11, v0, v9

    iput v9, v11, Lb9/f;->E:I

    iput-object v7, v11, Lb9/f;->F:Lc9/n;

    iput-object v6, v11, Lb9/f;->G:Lx8/p;

    iget-object v14, v1, Lb9/l0;->x:[Lb9/f;

    aput-object v11, v14, v9

    iget-object v11, v1, Lb9/l0;->x:[Lb9/f;

    aget-object v11, v11, v9

    iget-object v14, v11, Lb9/f;->w:Ljava/lang/Object;

    monitor-enter v14

    :try_start_0
    iput-object v3, v11, Lb9/f;->Q:Lo9/q;

    monitor-exit v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    aget-object v11, p3, v9

    if-eqz v11, :cond_0

    array-length v10, v0

    add-int/2addr v10, v9

    iput v10, v11, Lb9/f;->E:I

    iput-object v7, v11, Lb9/f;->F:Lc9/n;

    iput-object v6, v11, Lb9/f;->G:Lx8/p;

    move v10, v13

    :cond_0
    iget-object v13, v1, Lb9/l0;->w:[Lb9/j1;

    new-instance v14, Lb9/j1;

    aget-object v15, v0, v9

    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    iput-object v15, v14, Lb9/j1;->e:Ljava/lang/Object;

    iput v9, v14, Lb9/j1;->c:I

    iput-object v11, v14, Lb9/j1;->f:Ljava/lang/Object;

    const/4 v11, 0x0

    iput v11, v14, Lb9/j1;->d:I

    iput-boolean v11, v14, Lb9/j1;->a:Z

    iput-boolean v11, v14, Lb9/j1;->b:Z

    aput-object v14, v13, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_1
    iput-boolean v10, v1, Lb9/l0;->Y:Z

    new-instance v0, Lb9/l;

    invoke-direct {v0, v1, v6}, Lb9/l;-><init>(Lb9/l0;Lx8/p;)V

    iput-object v0, v1, Lb9/l0;->N:Lb9/l;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v1, Lb9/l0;->O:Ljava/util/ArrayList;

    new-instance v0, Lu8/n0;

    invoke-direct {v0}, Lu8/n0;-><init>()V

    iput-object v0, v1, Lb9/l0;->K:Lu8/n0;

    new-instance v0, Lu8/m0;

    invoke-direct {v0}, Lu8/m0;-><init>()V

    iput-object v0, v1, Lb9/l0;->L:Lu8/m0;

    iput-object v1, v2, Lb3/b;->b:Ljava/lang/Object;

    iput-object v4, v2, Lb3/b;->c:Ljava/lang/Object;

    iput-boolean v13, v1, Lb9/l0;->t0:Z

    const/4 v0, 0x0

    move-object/from16 v2, p15

    invoke-virtual {v6, v2, v0}, Lx8/p;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lx8/r;

    move-result-object v0

    iput-object v0, v1, Lb9/l0;->X:Lx8/r;

    new-instance v2, Lb9/s0;

    new-instance v3, Lab/g0;

    const/16 v4, 0xa

    invoke-direct {v3, v1, v4}, Lab/g0;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v2, v5, v0, v3, v8}, Lb9/s0;-><init>(Lc9/h;Lx8/r;Lab/g0;Lb9/q;)V

    iput-object v2, v1, Lb9/l0;->R:Lb9/s0;

    new-instance v2, Lb9/b1;

    invoke-direct {v2, v1, v5, v0, v7}, Lb9/b1;-><init>(Lb9/l0;Lc9/h;Lx8/r;Lc9/n;)V

    iput-object v2, v1, Lb9/l0;->S:Lb9/b1;

    new-instance v0, Llo/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, v0, Llo/r;->w:Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, v0, Llo/r;->y:Ljava/lang/Object;

    iput-object v2, v0, Llo/r;->z:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Llo/r;->x:I

    iput-object v0, v1, Lb9/l0;->I:Llo/r;

    iget-object v2, v0, Llo/r;->w:Ljava/lang/Object;

    monitor-enter v2

    :try_start_2
    iget-object v3, v0, Llo/r;->y:Ljava/lang/Object;

    check-cast v3, Landroid/os/Looper;

    if-nez v3, :cond_3

    iget v3, v0, Llo/r;->x:I

    if-nez v3, :cond_2

    iget-object v3, v0, Llo/r;->z:Ljava/lang/Object;

    check-cast v3, Landroid/os/HandlerThread;

    if-nez v3, :cond_2

    move v12, v13

    :cond_2
    invoke-static {v12}, Lva3/g;->i(Z)V

    new-instance v3, Landroid/os/HandlerThread;

    const-string v4, "ExoPlayer:Playback"

    const/16 v5, -0x10

    invoke-direct {v3, v4, v5}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object v3, v0, Llo/r;->z:Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    iget-object v3, v0, Llo/r;->z:Ljava/lang/Object;

    check-cast v3, Landroid/os/HandlerThread;

    invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v3

    iput-object v3, v0, Llo/r;->y:Ljava/lang/Object;

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_3
    :goto_1
    iget v3, v0, Llo/r;->x:I

    add-int/2addr v3, v13

    iput v3, v0, Llo/r;->x:I

    iget-object v0, v0, Llo/r;->y:Ljava/lang/Object;

    check-cast v0, Landroid/os/Looper;

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iput-object v0, v1, Lb9/l0;->J:Landroid/os/Looper;

    invoke-virtual {v6, v0, v1}, Lx8/p;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lx8/r;

    move-result-object v2

    iput-object v2, v1, Lb9/l0;->H:Lx8/r;

    new-instance v2, Lb9/e;

    move-object/from16 v3, p1

    invoke-direct {v2, v3, v0, v1}, Lb9/e;-><init>(Landroid/content/Context;Landroid/os/Looper;Lb9/l0;)V

    iput-object v2, v1, Lb9/l0;->Z:Lb9/e;

    return-void

    :goto_2
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public static P(Lu8/o0;Lb9/k0;ZIZLu8/n0;Lu8/m0;)Landroid/util/Pair;
    .locals 9

    iget-object v0, p1, Lb9/k0;->a:Lu8/o0;

    invoke-virtual {p0}, Lu8/o0;->p()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {v0}, Lu8/o0;->p()Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v2, p0

    goto :goto_0

    :cond_1
    move-object v2, v0

    :goto_0
    :try_start_0
    iget v5, p1, Lb9/k0;->b:I

    iget-wide v6, p1, Lb9/k0;->c:J

    move-object v3, p5

    move-object v4, p6

    invoke-virtual/range {v2 .. v7}, Lu8/o0;->i(Lu8/n0;Lu8/m0;IJ)Landroid/util/Pair;

    move-result-object p5
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v5, v4

    move-object v4, v3

    invoke-virtual {p0, v2}, Lu8/o0;->equals(Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_2

    goto :goto_1

    :cond_2
    iget-object p6, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {p0, p6}, Lu8/o0;->b(Ljava/lang/Object;)I

    move-result p6

    const/4 v0, -0x1

    if-eq p6, v0, :cond_4

    iget-object p2, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v2, p2, v5}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    move-result-object p2

    iget-boolean p2, p2, Lu8/m0;->f:Z

    if-eqz p2, :cond_3

    iget p2, v5, Lu8/m0;->c:I

    const-wide/16 p3, 0x0

    invoke-virtual {v2, p2, v4, p3, p4}, Lu8/o0;->m(ILu8/n0;J)Lu8/n0;

    move-result-object p2

    iget p2, p2, Lu8/n0;->n:I

    iget-object p3, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v2, p3}, Lu8/o0;->b(Ljava/lang/Object;)I

    move-result p3

    if-ne p2, p3, :cond_3

    iget-object p2, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {p0, p2, v5}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    move-result-object p2

    iget v6, p2, Lu8/m0;->c:I

    iget-wide v7, p1, Lb9/k0;->c:J

    move-object v3, p0

    invoke-virtual/range {v3 .. v8}, Lu8/o0;->i(Lu8/n0;Lu8/m0;IJ)Landroid/util/Pair;

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

    invoke-static/range {p0 .. p6}, Lb9/l0;->Q(Lu8/n0;Lu8/m0;IZLjava/lang/Object;Lu8/o0;Lu8/o0;)I

    move-result v6

    if-eq v6, v0, :cond_5

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    invoke-virtual/range {v3 .. v8}, Lu8/o0;->i(Lu8/n0;Lu8/m0;IJ)Landroid/util/Pair;

    move-result-object p0

    return-object p0

    :catch_0
    :cond_5
    :goto_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static Q(Lu8/n0;Lu8/m0;IZLjava/lang/Object;Lu8/o0;Lu8/o0;)I
    .locals 12

    move-object v3, p0

    move-object v2, p1

    move-object/from16 v0, p4

    move-object/from16 v1, p5

    move-object/from16 v6, p6

    invoke-virtual {v1, v0, p1}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    move-result-object v4

    iget v4, v4, Lu8/m0;->c:I

    const-wide/16 v7, 0x0

    invoke-virtual {v1, v4, p0, v7, v8}, Lu8/o0;->m(ILu8/n0;J)Lu8/n0;

    move-result-object v4

    iget-object v4, v4, Lu8/n0;->a:Ljava/lang/Object;

    const/4 v9, 0x0

    move v5, v9

    :goto_0
    invoke-virtual {v6}, Lu8/o0;->o()I

    move-result v10

    if-ge v5, v10, :cond_1

    invoke-virtual {v6, v5, p0, v7, v8}, Lu8/o0;->m(ILu8/n0;J)Lu8/n0;

    move-result-object v10

    iget-object v10, v10, Lu8/n0;->a:Ljava/lang/Object;

    invoke-virtual {v10, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    return v5

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v0}, Lu8/o0;->b(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {v1}, Lu8/o0;->h()I

    move-result v7

    const/4 v8, -0x1

    move v11, v8

    move v10, v9

    :goto_1
    if-ge v10, v7, :cond_3

    if-ne v11, v8, :cond_3

    move-object v4, v1

    move v1, v0

    move-object v0, v4

    move v4, p2

    move v5, p3

    invoke-virtual/range {v0 .. v5}, Lu8/o0;->d(ILu8/m0;Lu8/n0;IZ)I

    move-result v1

    if-ne v1, v8, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v1}, Lu8/o0;->l(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v6, v3}, Lu8/o0;->b(Ljava/lang/Object;)I

    move-result v11

    add-int/lit8 v10, v10, 0x1

    move v3, v1

    move-object v1, v0

    move v0, v3

    move-object v3, p0

    goto :goto_1

    :cond_3
    :goto_2
    if-ne v11, v8, :cond_4

    return v8

    :cond_4
    invoke-virtual {v6, v11, p1, v9}, Lu8/o0;->f(ILu8/m0;Z)Lu8/m0;

    move-result-object v0

    iget v0, v0, Lu8/m0;->c:I

    return v0
.end method

.method public static x(Lb9/q0;)Z
    .locals 6

    const/4 v0, 0x0

    if-eqz p0, :cond_4

    :try_start_0
    iget-object v1, p0, Lb9/q0;->a:Ljava/lang/Object;

    iget-boolean v2, p0, Lb9/q0;->e:Z

    if-nez v2, :cond_0

    invoke-interface {v1}, Ll9/a0;->h()V

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lb9/q0;->c:[Ll9/z0;

    array-length v3, v2

    move v4, v0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    if-eqz v5, :cond_1

    invoke-interface {v5}, Ll9/z0;->c()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    iget-boolean p0, p0, Lb9/q0;->e:Z

    if-nez p0, :cond_3

    const-wide/16 v1, 0x0

    goto :goto_2

    :cond_3
    invoke-interface {v1}, Ll9/b1;->d()J

    move-result-wide v1

    :goto_2
    const-wide/high16 v3, -0x8000000000000000L

    cmp-long p0, v1, v3

    if-eqz p0, :cond_4

    const/4 p0, 0x1

    return p0

    :catch_0
    :cond_4
    return v0
.end method


# virtual methods
.method public final A()V
    .locals 9

    iget-object v0, p0, Lb9/l0;->R:Lb9/s0;

    invoke-virtual {v0}, Lb9/s0;->k()V

    iget-object v0, v0, Lb9/s0;->m:Lb9/q0;

    if-eqz v0, :cond_a

    iget-object v1, v0, Lb9/q0;->a:Ljava/lang/Object;

    iget-boolean v2, v0, Lb9/q0;->d:Z

    if-eqz v2, :cond_0

    iget-boolean v2, v0, Lb9/q0;->e:Z

    if-eqz v2, :cond_a

    :cond_0
    invoke-interface {v1}, Ll9/b1;->a()Z

    move-result v2

    if-nez v2, :cond_a

    iget-object v2, p0, Lb9/l0;->b0:Lb9/c1;

    iget-object v2, v2, Lb9/c1;->a:Lu8/o0;

    iget-boolean v2, v0, Lb9/q0;->e:Z

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ll9/b1;->m()J

    :cond_1
    iget-object v2, p0, Lb9/l0;->F:Lb9/k;

    iget-object v2, v2, Lb9/k;->h:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb9/j;

    iget-boolean v3, v3, Lb9/j;->a:Z

    if-eqz v3, :cond_2

    goto/16 :goto_5

    :cond_3
    iget-boolean v2, v0, Lb9/q0;->d:Z

    const/4 v3, 0x1

    if-nez v2, :cond_4

    iget-object v2, v0, Lb9/q0;->g:Lb9/r0;

    iget-wide v4, v2, Lb9/r0;->b:J

    iput-boolean v3, v0, Lb9/q0;->d:Z

    invoke-interface {v1, p0, v4, v5}, Ll9/a0;->t(Ll9/z;J)V

    return-void

    :cond_4
    new-instance v2, Lb9/n0;

    invoke-direct {v2}, Lb9/n0;-><init>()V

    iget-wide v4, p0, Lb9/l0;->q0:J

    iget-wide v6, v0, Lb9/q0;->p:J

    sub-long/2addr v4, v6

    iput-wide v4, v2, Lb9/n0;->a:J

    iget-object v4, p0, Lb9/l0;->N:Lb9/l;

    invoke-virtual {v4}, Lb9/l;->b()Lu8/e0;

    move-result-object v4

    iget v4, v4, Lu8/e0;->a:F

    const/4 v5, 0x0

    cmpl-float v5, v4, v5

    const/4 v6, 0x0

    if-gtz v5, :cond_6

    const v5, -0x800001

    cmpl-float v5, v4, v5

    if-nez v5, :cond_5

    goto :goto_0

    :cond_5
    move v5, v6

    goto :goto_1

    :cond_6
    :goto_0
    move v5, v3

    :goto_1
    invoke-static {v5}, Lva3/g;->d(Z)V

    iput v4, v2, Lb9/n0;->b:F

    iget-wide v4, p0, Lb9/l0;->h0:J

    const-wide/16 v7, 0x0

    cmp-long v7, v4, v7

    if-gez v7, :cond_8

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v7, v4, v7

    if-nez v7, :cond_7

    goto :goto_2

    :cond_7
    move v7, v6

    goto :goto_3

    :cond_8
    :goto_2
    move v7, v3

    :goto_3
    invoke-static {v7}, Lva3/g;->d(Z)V

    iput-wide v4, v2, Lb9/n0;->c:J

    new-instance v4, Lb9/o0;

    invoke-direct {v4, v2}, Lb9/o0;-><init>(Lb9/n0;)V

    iget-object v0, v0, Lb9/q0;->m:Lb9/q0;

    if-nez v0, :cond_9

    goto :goto_4

    :cond_9
    move v3, v6

    :goto_4
    invoke-static {v3}, Lva3/g;->i(Z)V

    invoke-interface {v1, v4}, Ll9/b1;->x(Lb9/o0;)Z

    :cond_a
    :goto_5
    return-void
.end method

.method public final B()V
    .locals 5

    iget-object v0, p0, Lb9/l0;->c0:Lab/y;

    iget-object v1, p0, Lb9/l0;->b0:Lb9/c1;

    iget-boolean v2, v0, Lab/y;->c:Z

    iget-object v3, v0, Lab/y;->e:Ljava/lang/Object;

    check-cast v3, Lb9/c1;

    if-eq v3, v1, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    or-int/2addr v2, v3

    iput-boolean v2, v0, Lab/y;->c:Z

    iput-object v1, v0, Lab/y;->e:Ljava/lang/Object;

    if-eqz v2, :cond_1

    iget-object v1, p0, Lb9/l0;->Q:Lb9/u;

    iget-object v1, v1, Lb9/u;->w:Lb9/f0;

    iget-object v2, v1, Lb9/f0;->K:Lx8/r;

    new-instance v3, La8/c;

    const/4 v4, 0x3

    invoke-direct {v3, v4, v1, v0}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Lx8/r;->c(Ljava/lang/Runnable;)Z

    new-instance v0, Lab/y;

    iget-object v1, p0, Lb9/l0;->b0:Lb9/c1;

    invoke-direct {v0, v1}, Lab/y;-><init>(Lb9/c1;)V

    iput-object v0, p0, Lb9/l0;->c0:Lab/y;

    :cond_1
    return-void
.end method

.method public final C(I)V
    .locals 10

    iget-object v0, p0, Lb9/l0;->w:[Lb9/j1;

    aget-object v1, v0, p1

    :try_start_0
    iget-object v0, p0, Lb9/l0;->R:Lb9/s0;

    iget-object v0, v0, Lb9/s0;->i:Lb9/q0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v0}, Lb9/j1;->d(Lb9/q0;)Lb9/f;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lb9/f;->I:Ll9/z0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0}, Ll9/z0;->c()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    iget-object v1, v1, Lb9/j1;->e:Ljava/lang/Object;

    check-cast v1, Lb9/f;

    iget v1, v1, Lb9/f;->x:I

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    const/4 v2, 0x5

    if-ne v1, v2, :cond_0

    goto :goto_1

    :cond_0
    throw v0

    :cond_1
    :goto_1
    iget-object v1, p0, Lb9/l0;->R:Lb9/s0;

    iget-object v1, v1, Lb9/s0;->i:Lb9/q0;

    iget-object v1, v1, Lb9/q0;->o:Lo9/v;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Disabling track due to error: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v1, Lo9/v;->c:[Lo9/s;

    aget-object v3, v3, p1

    invoke-interface {v3}, Lo9/s;->n()Lu8/p;

    move-result-object v3

    invoke-static {v3}, Lu8/p;->c(Lu8/p;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ExoPlayerImplInternal"

    invoke-static {v3, v2, v0}, Lx8/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v5, Lo9/v;

    iget-object v0, v1, Lo9/v;->b:[Lb9/i1;

    invoke-virtual {v0}, [Lb9/i1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb9/i1;

    iget-object v2, v1, Lo9/v;->c:[Lo9/s;

    invoke-virtual {v2}, [Lo9/s;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lo9/s;

    iget-object v3, v1, Lo9/v;->d:Lu8/v0;

    iget-object v1, v1, Lo9/v;->e:Ljava/lang/Object;

    invoke-direct {v5, v0, v2, v3, v1}, Lo9/v;-><init>([Lb9/i1;[Lo9/s;Lu8/v0;Ljava/lang/Object;)V

    iget-object v0, v5, Lo9/v;->b:[Lb9/i1;

    const/4 v1, 0x0

    aput-object v1, v0, p1

    iget-object v0, v5, Lo9/v;->c:[Lo9/s;

    aput-object v1, v0, p1

    invoke-virtual {p0, p1}, Lb9/l0;->g(I)V

    iget-object p1, p0, Lb9/l0;->R:Lb9/s0;

    iget-object v4, p1, Lb9/s0;->i:Lb9/q0;

    iget-object p1, p0, Lb9/l0;->b0:Lb9/c1;

    iget-wide v6, p1, Lb9/c1;->s:J

    iget-object p1, v4, Lb9/q0;->j:[Lb9/f;

    array-length p1, p1

    new-array v9, p1, [Z

    const/4 v8, 0x0

    invoke-virtual/range {v4 .. v9}, Lb9/q0;->a(Lo9/v;JZ[Z)J

    return-void
.end method

.method public final D(IZ)V
    .locals 2

    iget-object v0, p0, Lb9/l0;->y:[Z

    aget-boolean v1, v0, p1

    if-eq v1, p2, :cond_0

    aput-boolean p2, v0, p1

    new-instance v0, Lb9/g0;

    invoke-direct {v0, p0, p1, p2}, Lb9/g0;-><init>(Lb9/l0;IZ)V

    iget-object p1, p0, Lb9/l0;->X:Lx8/r;

    invoke-virtual {p1, v0}, Lx8/r;->c(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final E()V
    .locals 2

    iget-object v0, p0, Lb9/l0;->S:Lb9/b1;

    invoke-virtual {v0}, Lb9/b1;->d()Lu8/o0;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lb9/l0;->t(Lu8/o0;Z)V

    return-void
.end method

.method public final F()V
    .locals 2

    iget-object v0, p0, Lb9/l0;->c0:Lab/y;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lab/y;->c(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final G()V
    .locals 10

    iget-object v0, p0, Lb9/l0;->c0:Lab/y;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lab/y;->c(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0, v0, v1}, Lb9/l0;->L(ZZZZ)V

    iget-object v2, p0, Lb9/l0;->F:Lb9/k;

    iget-object v3, v2, Lb9/k;->h:Ljava/util/HashMap;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Thread;->getId()J

    move-result-wide v4

    iget-wide v6, v2, Lb9/k;->i:J

    const-wide/16 v8, -0x1

    cmp-long v8, v6, v8

    if-eqz v8, :cond_1

    cmp-long v6, v6, v4

    if-nez v6, :cond_0

    goto :goto_0

    :cond_0
    move v6, v0

    goto :goto_1

    :cond_1
    :goto_0
    move v6, v1

    :goto_1
    const-string v7, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper)."

    invoke-static {v7, v6}, Lva3/g;->h(Ljava/lang/String;Z)V

    iput-wide v4, v2, Lb9/k;->i:J

    iget-object v4, p0, Lb9/l0;->V:Lc9/n;

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    new-instance v5, Lb9/j;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb9/j;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v2, v2, Lb9/k;->f:I

    const/4 v4, -0x1

    if-ne v2, v4, :cond_3

    const/high16 v2, 0xc80000

    :cond_3
    iput v2, v3, Lb9/j;->b:I

    iput-boolean v0, v3, Lb9/j;->a:Z

    iget-object v2, p0, Lb9/l0;->b0:Lb9/c1;

    iget-object v2, v2, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v2}, Lu8/o0;->p()Z

    move-result v2

    const/4 v3, 0x2

    if-eqz v2, :cond_4

    const/4 v2, 0x4

    goto :goto_2

    :cond_4
    move v2, v3

    :goto_2
    invoke-virtual {p0, v2}, Lb9/l0;->h0(I)V

    iget-object v2, p0, Lb9/l0;->b0:Lb9/c1;

    iget-boolean v4, v2, Lb9/c1;->l:Z

    iget v5, v2, Lb9/c1;->n:I

    iget v6, v2, Lb9/c1;->m:I

    iget-object v7, p0, Lb9/l0;->Z:Lb9/e;

    iget v2, v2, Lb9/c1;->e:I

    invoke-virtual {v7, v2, v4}, Lb9/e;->d(IZ)I

    move-result v2

    invoke-virtual {p0, v2, v5, v6, v4}, Lb9/l0;->s0(IIIZ)V

    iget-object v2, p0, Lb9/l0;->G:Lp9/d;

    check-cast v2, Lp9/f;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, p0, Lb9/l0;->S:Lb9/b1;

    iget-object v5, v4, Lb9/b1;->b:Ljava/util/ArrayList;

    iget-boolean v6, v4, Lb9/b1;->g:Z

    xor-int/2addr v6, v1

    invoke-static {v6}, Lva3/g;->i(Z)V

    iput-object v2, v4, Lb9/b1;->m:Ljava/lang/Object;

    :goto_3
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_5

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb9/a1;

    invoke-virtual {v4, v2}, Lb9/b1;->h(Lb9/a1;)V

    iget-object v6, v4, Lb9/b1;->f:Ljava/util/HashSet;

    invoke-virtual {v6, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_5
    iput-boolean v1, v4, Lb9/b1;->g:Z

    iget-object v0, p0, Lb9/l0;->H:Lx8/r;

    invoke-virtual {v0, v3}, Lx8/r;->e(I)Z

    return-void
.end method

.method public final H()V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    invoke-virtual {p0, v1, v0, v1, v0}, Lb9/l0;->L(ZZZZ)V

    invoke-virtual {p0}, Lb9/l0;->I()V

    iget-object v2, p0, Lb9/l0;->F:Lb9/k;

    iget-object v3, p0, Lb9/l0;->V:Lc9/n;

    iget-object v4, v2, Lb9/k;->h:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lb9/k;->d()V

    :cond_0
    iget-object v3, v2, Lb9/k;->h:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    const-wide/16 v3, -0x1

    iput-wide v3, v2, Lb9/k;->i:J

    :cond_1
    iget-object v2, p0, Lb9/l0;->Z:Lb9/e;

    const/4 v3, 0x0

    iput-object v3, v2, Lb9/e;->c:Lb9/l0;

    invoke-virtual {v2}, Lb9/e;->a()V

    invoke-virtual {v2, v0}, Lb9/e;->c(I)V

    iget-object v0, p0, Lb9/l0;->z:Lb3/b;

    check-cast v0, Lo9/q;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v2, Lx8/t;->a:I

    const/16 v4, 0x20

    if-lt v2, v4, :cond_2

    iget-object v2, v0, Lo9/q;->h:Lo9/l;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lo9/l;->d()V

    :cond_2
    iput-object v3, v0, Lb3/b;->b:Ljava/lang/Object;

    iput-object v3, v0, Lb3/b;->c:Ljava/lang/Object;

    invoke-virtual {p0, v1}, Lb9/l0;->h0(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object v0, p0, Lb9/l0;->I:Llo/r;

    invoke-virtual {v0}, Llo/r;->e()V

    monitor-enter p0

    :try_start_1
    iput-boolean v1, p0, Lb9/l0;->d0:Z

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :catchall_1
    move-exception v0

    iget-object v2, p0, Lb9/l0;->I:Llo/r;

    invoke-virtual {v2}, Llo/r;->e()V

    monitor-enter p0

    :try_start_2
    iput-boolean v1, p0, Lb9/l0;->d0:Z

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    throw v0

    :catchall_2
    move-exception v0

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw v0
.end method

.method public final I()V
    .locals 6

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lb9/l0;->w:[Lb9/j1;

    array-length v2, v2

    if-ge v1, v2, :cond_3

    iget-object v2, p0, Lb9/l0;->x:[Lb9/f;

    aget-object v2, v2, v1

    iget-object v3, v2, Lb9/f;->w:Ljava/lang/Object;

    monitor-enter v3

    const/4 v4, 0x0

    :try_start_0
    iput-object v4, v2, Lb9/f;->Q:Lo9/q;

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v2, p0, Lb9/l0;->w:[Lb9/j1;

    aget-object v2, v2, v1

    iget-object v3, v2, Lb9/j1;->e:Ljava/lang/Object;

    check-cast v3, Lb9/f;

    iget v4, v3, Lb9/f;->H:I

    const/4 v5, 0x1

    if-nez v4, :cond_0

    move v4, v5

    goto :goto_1

    :cond_0
    move v4, v0

    :goto_1
    invoke-static {v4}, Lva3/g;->i(Z)V

    invoke-virtual {v3}, Lb9/f;->r()V

    iput-boolean v0, v2, Lb9/j1;->a:Z

    iget-object v3, v2, Lb9/j1;->f:Ljava/lang/Object;

    check-cast v3, Lb9/f;

    if-eqz v3, :cond_2

    iget v4, v3, Lb9/f;->H:I

    if-nez v4, :cond_1

    goto :goto_2

    :cond_1
    move v5, v0

    :goto_2
    invoke-static {v5}, Lva3/g;->i(Z)V

    invoke-virtual {v3}, Lb9/f;->r()V

    iput-boolean v0, v2, Lb9/j1;->b:Z

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_3
    return-void
.end method

.method public final J(IILl9/c1;)V
    .locals 4

    iget-object v0, p0, Lb9/l0;->c0:Lab/y;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lab/y;->c(I)V

    iget-object v0, p0, Lb9/l0;->S:Lb9/b1;

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
    invoke-static {v1}, Lva3/g;->d(Z)V

    iput-object p3, v0, Lb9/b1;->l:Ljava/lang/Object;

    invoke-virtual {v0, p1, p2}, Lb9/b1;->l(II)V

    invoke-virtual {v0}, Lb9/b1;->d()Lu8/o0;

    move-result-object p1

    invoke-virtual {p0, p1, v2}, Lb9/l0;->t(Lu8/o0;Z)V

    return-void
.end method

.method public final K()V
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lb9/l0;->N:Lb9/l;

    invoke-virtual {v1}, Lb9/l;->b()Lu8/e0;

    move-result-object v1

    iget v1, v1, Lu8/e0;->a:F

    iget-object v2, v0, Lb9/l0;->R:Lb9/s0;

    iget-object v3, v2, Lb9/s0;->i:Lb9/q0;

    iget-object v2, v2, Lb9/s0;->j:Lb9/q0;

    const/4 v10, 0x1

    const/4 v4, 0x0

    move-object v11, v3

    move v3, v10

    :goto_0
    if-eqz v11, :cond_13

    iget-boolean v5, v11, Lb9/q0;->e:Z

    if-nez v5, :cond_0

    goto/16 :goto_a

    :cond_0
    iget-object v5, v0, Lb9/l0;->b0:Lb9/c1;

    iget-object v6, v5, Lb9/c1;->a:Lu8/o0;

    iget-boolean v5, v5, Lb9/c1;->l:Z

    invoke-virtual {v11, v1, v6, v5}, Lb9/q0;->j(FLu8/o0;Z)Lo9/v;

    move-result-object v12

    iget-object v5, v0, Lb9/l0;->R:Lb9/s0;

    iget-object v5, v5, Lb9/s0;->i:Lb9/q0;

    if-ne v11, v5, :cond_1

    move-object v14, v12

    goto :goto_1

    :cond_1
    move-object v14, v4

    :goto_1
    iget-object v4, v11, Lb9/q0;->o:Lo9/v;

    iget-object v5, v12, Lo9/v;->c:[Lo9/s;

    const/4 v6, 0x0

    if-eqz v4, :cond_6

    iget-object v7, v4, Lo9/v;->c:[Lo9/s;

    array-length v7, v7

    array-length v8, v5

    if-eq v7, v8, :cond_2

    goto :goto_3

    :cond_2
    move v7, v6

    :goto_2
    array-length v8, v5

    if-ge v7, v8, :cond_4

    invoke-virtual {v12, v4, v7}, Lo9/v;->a(Lo9/v;I)Z

    move-result v8

    if-nez v8, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_4
    if-ne v11, v2, :cond_5

    move v3, v6

    :cond_5
    iget-object v11, v11, Lb9/q0;->m:Lb9/q0;

    move-object v4, v14

    goto :goto_0

    :cond_6
    :goto_3
    const/4 v1, 0x4

    if-eqz v3, :cond_11

    iget-object v2, v0, Lb9/l0;->R:Lb9/s0;

    iget-object v13, v2, Lb9/s0;->i:Lb9/q0;

    invoke-virtual {v2, v13}, Lb9/s0;->n(Lb9/q0;)I

    move-result v2

    and-int/2addr v2, v10

    if-eqz v2, :cond_7

    move/from16 v17, v10

    goto :goto_4

    :cond_7
    move/from16 v17, v6

    :goto_4
    iget-object v2, v0, Lb9/l0;->w:[Lb9/j1;

    array-length v2, v2

    new-array v2, v2, [Z

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v0, Lb9/l0;->b0:Lb9/c1;

    iget-wide v3, v3, Lb9/c1;->s:J

    move-object/from16 v18, v2

    move-wide v15, v3

    invoke-virtual/range {v13 .. v18}, Lb9/q0;->a(Lo9/v;JZ[Z)J

    move-result-wide v2

    iget-object v4, v0, Lb9/l0;->b0:Lb9/c1;

    iget v5, v4, Lb9/c1;->e:I

    if-eq v5, v1, :cond_8

    iget-wide v4, v4, Lb9/c1;->s:J

    cmp-long v4, v2, v4

    if-eqz v4, :cond_8

    move v8, v10

    goto :goto_5

    :cond_8
    move v8, v6

    :goto_5
    iget-object v4, v0, Lb9/l0;->b0:Lb9/c1;

    move v5, v1

    iget-object v1, v4, Lb9/c1;->b:Ll9/c0;

    iget-wide v11, v4, Lb9/c1;->c:J

    iget-wide v14, v4, Lb9/c1;->d:J

    const/4 v9, 0x5

    move-wide/from16 v19, v14

    move v14, v5

    move-wide v4, v11

    move v11, v6

    move-wide/from16 v6, v19

    invoke-virtual/range {v0 .. v9}, Lb9/l0;->w(Ll9/c0;JJJZI)Lb9/c1;

    move-result-object v1

    iput-object v1, v0, Lb9/l0;->b0:Lb9/c1;

    if-eqz v8, :cond_9

    invoke-virtual {v0, v2, v3}, Lb9/l0;->N(J)V

    :cond_9
    invoke-virtual {v0}, Lb9/l0;->f()V

    iget-object v1, v0, Lb9/l0;->w:[Lb9/j1;

    array-length v1, v1

    new-array v1, v1, [Z

    move v6, v11

    :goto_6
    iget-object v2, v0, Lb9/l0;->w:[Lb9/j1;

    array-length v3, v2

    if-ge v6, v3, :cond_f

    aget-object v2, v2, v6

    invoke-virtual {v2}, Lb9/j1;->c()I

    move-result v2

    iget-object v3, v0, Lb9/l0;->w:[Lb9/j1;

    aget-object v3, v3, v6

    invoke-virtual {v3}, Lb9/j1;->g()Z

    move-result v3

    aput-boolean v3, v1, v6

    iget-object v3, v0, Lb9/l0;->w:[Lb9/j1;

    aget-object v3, v3, v6

    iget-object v4, v13, Lb9/q0;->c:[Ll9/z0;

    aget-object v4, v4, v6

    iget-object v5, v0, Lb9/l0;->N:Lb9/l;

    iget-wide v7, v0, Lb9/l0;->q0:J

    aget-boolean v9, v18, v6

    iget-object v12, v3, Lb9/j1;->e:Ljava/lang/Object;

    check-cast v12, Lb9/f;

    invoke-static {v12}, Lb9/j1;->h(Lb9/f;)Z

    move-result v15

    if-eqz v15, :cond_b

    iget-object v15, v12, Lb9/f;->I:Ll9/z0;

    if-eq v4, v15, :cond_a

    invoke-virtual {v3, v12, v5}, Lb9/j1;->a(Lb9/f;Lb9/l;)V

    goto :goto_7

    :cond_a
    if-eqz v9, :cond_b

    iput-boolean v11, v12, Lb9/f;->N:Z

    iput-wide v7, v12, Lb9/f;->L:J

    iput-wide v7, v12, Lb9/f;->M:J

    invoke-virtual {v12, v7, v8, v11}, Lb9/f;->q(JZ)V

    :cond_b
    :goto_7
    iget-object v12, v3, Lb9/j1;->f:Ljava/lang/Object;

    check-cast v12, Lb9/f;

    if-eqz v12, :cond_d

    invoke-static {v12}, Lb9/j1;->h(Lb9/f;)Z

    move-result v15

    if-eqz v15, :cond_d

    iget-object v15, v12, Lb9/f;->I:Ll9/z0;

    if-eq v4, v15, :cond_c

    invoke-virtual {v3, v12, v5}, Lb9/j1;->a(Lb9/f;Lb9/l;)V

    goto :goto_8

    :cond_c
    if-eqz v9, :cond_d

    iput-boolean v11, v12, Lb9/f;->N:Z

    iput-wide v7, v12, Lb9/f;->L:J

    iput-wide v7, v12, Lb9/f;->M:J

    invoke-virtual {v12, v7, v8, v11}, Lb9/f;->q(JZ)V

    :cond_d
    :goto_8
    iget-object v3, v0, Lb9/l0;->w:[Lb9/j1;

    aget-object v3, v3, v6

    invoke-virtual {v3}, Lb9/j1;->c()I

    move-result v3

    sub-int v3, v2, v3

    if-lez v3, :cond_e

    invoke-virtual {v0, v6, v11}, Lb9/l0;->D(IZ)V

    :cond_e
    iget v3, v0, Lb9/l0;->o0:I

    iget-object v4, v0, Lb9/l0;->w:[Lb9/j1;

    aget-object v4, v4, v6

    invoke-virtual {v4}, Lb9/j1;->c()I

    move-result v4

    sub-int/2addr v2, v4

    sub-int/2addr v3, v2

    iput v3, v0, Lb9/l0;->o0:I

    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    :cond_f
    iget-wide v2, v0, Lb9/l0;->q0:J

    invoke-virtual {v0, v1, v2, v3}, Lb9/l0;->j([ZJ)V

    iput-boolean v10, v13, Lb9/q0;->h:Z

    :cond_10
    move v5, v14

    goto :goto_9

    :cond_11
    move v14, v1

    iget-object v1, v0, Lb9/l0;->R:Lb9/s0;

    invoke-virtual {v1, v11}, Lb9/s0;->n(Lb9/q0;)I

    iget-boolean v1, v11, Lb9/q0;->e:Z

    if-eqz v1, :cond_10

    iget-object v1, v11, Lb9/q0;->g:Lb9/r0;

    iget-wide v1, v1, Lb9/r0;->b:J

    iget-wide v3, v0, Lb9/l0;->q0:J

    iget-wide v5, v11, Lb9/q0;->p:J

    sub-long/2addr v3, v5

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    iget-boolean v3, v0, Lb9/l0;->Y:Z

    if-eqz v3, :cond_12

    invoke-virtual {v0}, Lb9/l0;->d()Z

    move-result v3

    if-eqz v3, :cond_12

    iget-object v3, v0, Lb9/l0;->R:Lb9/s0;

    iget-object v3, v3, Lb9/s0;->k:Lb9/q0;

    if-ne v3, v11, :cond_12

    invoke-virtual {v0}, Lb9/l0;->f()V

    :cond_12
    iget-object v3, v11, Lb9/q0;->j:[Lb9/f;

    array-length v3, v3

    new-array v3, v3, [Z

    const/4 v15, 0x0

    move-object/from16 v16, v3

    move v5, v14

    move-wide v13, v1

    invoke-virtual/range {v11 .. v16}, Lb9/q0;->a(Lo9/v;JZ[Z)J

    :goto_9
    invoke-virtual {v0, v10}, Lb9/l0;->s(Z)V

    iget-object v1, v0, Lb9/l0;->b0:Lb9/c1;

    iget v1, v1, Lb9/c1;->e:I

    if-eq v1, v5, :cond_13

    invoke-virtual {v0}, Lb9/l0;->z()V

    invoke-virtual {v0}, Lb9/l0;->t0()V

    iget-object v1, v0, Lb9/l0;->H:Lx8/r;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lx8/r;->e(I)Z

    :cond_13
    :goto_a
    return-void
.end method

.method public final L(ZZZZ)V
    .locals 35

    move-object/from16 v1, p0

    const-string v2, "ExoPlayerImplInternal"

    iget-object v0, v1, Lb9/l0;->H:Lx8/r;

    const/4 v3, 0x2

    invoke-virtual {v0, v3}, Lx8/r;->d(I)V

    const/4 v3, 0x0

    iput-object v3, v1, Lb9/l0;->u0:Landroidx/media3/exoplayer/ExoPlaybackException;

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-virtual {v1, v4, v5}, Lb9/l0;->v0(ZZ)V

    iget-object v0, v1, Lb9/l0;->N:Lb9/l;

    iput-boolean v4, v0, Lb9/l;->y:Z

    iget-object v0, v0, Lb9/l;->z:Ljava/lang/Object;

    check-cast v0, Lb9/l1;

    iget-boolean v6, v0, Lb9/l1;->z:Z

    if-eqz v6, :cond_0

    invoke-virtual {v0}, Lb9/l1;->c()J

    move-result-wide v6

    invoke-virtual {v0, v6, v7}, Lb9/l1;->a(J)V

    iput-boolean v4, v0, Lb9/l1;->z:Z

    :cond_0
    const-wide v6, 0xe8d4a51000L

    iput-wide v6, v1, Lb9/l0;->q0:J

    move v0, v4

    :goto_0
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    :try_start_0
    iget-object v8, v1, Lb9/l0;->w:[Lb9/j1;

    array-length v8, v8

    if-ge v0, v8, :cond_1

    invoke-virtual {v1, v0}, Lb9/l0;->g(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_1

    :cond_1
    iput-wide v6, v1, Lb9/l0;->x0:J
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroidx/media3/exoplayer/ExoPlaybackException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    const-string v8, "Disable failed."

    invoke-static {v2, v8, v0}, Lx8/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    if-eqz p1, :cond_2

    iget-object v8, v1, Lb9/l0;->w:[Lb9/j1;

    array-length v9, v8

    move v10, v4

    :goto_3
    if-ge v10, v9, :cond_2

    aget-object v0, v8, v10

    :try_start_1
    invoke-virtual {v0}, Lb9/j1;->l()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_4

    :catch_2
    move-exception v0

    const-string v11, "Reset failed."

    invoke-static {v2, v11, v0}, Lx8/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_4
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_2
    iput v4, v1, Lb9/l0;->o0:I

    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v2, v0, Lb9/c1;->b:Ll9/c0;

    iget-wide v8, v0, Lb9/c1;->s:J

    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v0, v0, Lb9/c1;->b:Ll9/c0;

    invoke-virtual {v0}, Ll9/c0;->b()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v10, v1, Lb9/l0;->L:Lu8/m0;

    iget-object v11, v0, Lb9/c1;->b:Ll9/c0;

    iget-object v0, v0, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v0}, Lu8/o0;->p()Z

    move-result v12

    if-nez v12, :cond_4

    iget-object v11, v11, Ll9/c0;->a:Ljava/lang/Object;

    invoke-virtual {v0, v11, v10}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    move-result-object v0

    iget-boolean v0, v0, Lu8/m0;->f:Z

    if-eqz v0, :cond_3

    goto :goto_5

    :cond_3
    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget-wide v10, v0, Lb9/c1;->s:J

    goto :goto_6

    :cond_4
    :goto_5
    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget-wide v10, v0, Lb9/c1;->c:J

    :goto_6
    if-eqz p2, :cond_6

    iput-object v3, v1, Lb9/l0;->p0:Lb9/k0;

    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v0, v0, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v1, v0}, Lb9/l0;->m(Lu8/o0;)Landroid/util/Pair;

    move-result-object v0

    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ll9/c0;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v0, v0, Lb9/c1;->b:Ll9/c0;

    invoke-virtual {v2, v0}, Ll9/c0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :goto_7
    move-wide v11, v8

    move-wide v9, v6

    goto :goto_8

    :cond_5
    move v5, v4

    goto :goto_7

    :cond_6
    move-wide/from16 v33, v10

    move-wide v11, v8

    move-wide/from16 v9, v33

    move v5, v4

    :goto_8
    iget-object v0, v1, Lb9/l0;->R:Lb9/s0;

    invoke-virtual {v0}, Lb9/s0;->b()V

    iput-boolean v4, v1, Lb9/l0;->i0:Z

    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v0, v0, Lb9/c1;->a:Lu8/o0;

    if-eqz p3, :cond_9

    instance-of v6, v0, Lb9/h1;

    if-eqz v6, :cond_9

    check-cast v0, Lb9/h1;

    iget-object v6, v1, Lb9/l0;->S:Lb9/b1;

    iget-object v6, v6, Lb9/b1;->l:Ljava/lang/Object;

    check-cast v6, Ll9/c1;

    iget-object v7, v0, Lb9/h1;->h:[Lu8/o0;

    array-length v8, v7

    new-array v8, v8, [Lu8/o0;

    move v13, v4

    :goto_9
    array-length v14, v7

    if-ge v13, v14, :cond_7

    new-instance v14, Lb9/g1;

    aget-object v15, v7, v13

    invoke-direct {v14, v15}, Lb9/g1;-><init>(Lu8/o0;)V

    aput-object v14, v8, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_9

    :cond_7
    new-instance v7, Lb9/h1;

    iget-object v0, v0, Lb9/h1;->i:[Ljava/lang/Object;

    invoke-direct {v7, v8, v0, v6}, Lb9/h1;-><init>([Lu8/o0;[Ljava/lang/Object;Ll9/c1;)V

    iget v0, v2, Ll9/c0;->b:I

    const/4 v6, -0x1

    if-eq v0, v6, :cond_8

    iget-object v0, v2, Ll9/c0;->a:Ljava/lang/Object;

    iget-object v6, v1, Lb9/l0;->L:Lu8/m0;

    invoke-virtual {v7, v0, v6}, Lb9/h1;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    iget-object v0, v1, Lb9/l0;->L:Lu8/m0;

    iget v0, v0, Lu8/m0;->c:I

    iget-object v6, v1, Lb9/l0;->K:Lu8/n0;

    const-wide/16 v13, 0x0

    invoke-virtual {v7, v0, v6, v13, v14}, Lb9/h1;->m(ILu8/n0;J)Lu8/n0;

    invoke-virtual {v6}, Lu8/n0;->a()Z

    move-result v0

    if-eqz v0, :cond_8

    new-instance v0, Ll9/c0;

    iget-object v6, v2, Ll9/c0;->a:Ljava/lang/Object;

    iget-wide v13, v2, Ll9/c0;->d:J

    invoke-direct {v0, v6, v13, v14}, Ll9/c0;-><init>(Ljava/lang/Object;J)V

    move-object v8, v0

    goto :goto_b

    :cond_8
    :goto_a
    move-object v8, v2

    goto :goto_b

    :cond_9
    move-object v7, v0

    goto :goto_a

    :goto_b
    new-instance v6, Lb9/c1;

    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget v13, v0, Lb9/c1;->e:I

    if-eqz p4, :cond_a

    move-object v14, v3

    goto :goto_c

    :cond_a
    iget-object v2, v0, Lb9/c1;->f:Landroidx/media3/exoplayer/ExoPlaybackException;

    move-object v14, v2

    :goto_c
    if-eqz v5, :cond_b

    sget-object v2, Ll9/g1;->d:Ll9/g1;

    :goto_d
    move-object/from16 v16, v2

    goto :goto_e

    :cond_b
    iget-object v2, v0, Lb9/c1;->h:Ll9/g1;

    goto :goto_d

    :goto_e
    if-eqz v5, :cond_c

    iget-object v2, v1, Lb9/l0;->E:Lo9/v;

    :goto_f
    move-object/from16 v17, v2

    goto :goto_10

    :cond_c
    iget-object v2, v0, Lb9/c1;->i:Lo9/v;

    goto :goto_f

    :goto_10
    if-eqz v5, :cond_d

    sget-object v2, Lzr/g0;->x:Lzr/e0;

    sget-object v2, Lzr/w0;->E:Lzr/w0;

    :goto_11
    move-object/from16 v18, v2

    goto :goto_12

    :cond_d
    iget-object v2, v0, Lb9/c1;->j:Ljava/util/List;

    goto :goto_11

    :goto_12
    iget-boolean v2, v0, Lb9/c1;->l:Z

    iget v5, v0, Lb9/c1;->m:I

    iget v15, v0, Lb9/c1;->n:I

    iget-object v0, v0, Lb9/c1;->o:Lu8/e0;

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    move/from16 v22, v15

    const/4 v15, 0x0

    const-wide/16 v26, 0x0

    move-object/from16 v19, v8

    move-wide/from16 v24, v11

    move-wide/from16 v28, v11

    move-object/from16 v23, v0

    move/from16 v20, v2

    move/from16 v21, v5

    invoke-direct/range {v6 .. v32}, Lb9/c1;-><init>(Lu8/o0;Ll9/c0;JJILandroidx/media3/exoplayer/ExoPlaybackException;ZLl9/g1;Lo9/v;Ljava/util/List;Ll9/c0;ZIILu8/e0;JJJJZ)V

    iput-object v6, v1, Lb9/l0;->b0:Lb9/c1;

    if-eqz p3, :cond_11

    iget-object v0, v1, Lb9/l0;->R:Lb9/s0;

    iget-object v2, v0, Lb9/s0;->q:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_f

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    move v5, v4

    :goto_13
    iget-object v6, v0, Lb9/s0;->q:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_e

    iget-object v6, v0, Lb9/s0;->q:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lb9/q0;

    invoke-virtual {v6}, Lb9/q0;->i()V

    add-int/lit8 v5, v5, 0x1

    goto :goto_13

    :cond_e
    iput-object v2, v0, Lb9/s0;->q:Ljava/util/ArrayList;

    iput-object v3, v0, Lb9/s0;->m:Lb9/q0;

    invoke-virtual {v0}, Lb9/s0;->k()V

    :cond_f
    iget-object v2, v1, Lb9/l0;->S:Lb9/b1;

    iget-object v3, v2, Lb9/b1;->e:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_14
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lb9/z0;

    :try_start_2
    iget-object v0, v6, Lb9/z0;->a:Ll9/a;

    iget-object v7, v6, Lb9/z0;->b:Lb9/u0;

    invoke-virtual {v0, v7}, Ll9/a;->n(Ll9/d0;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_3

    goto :goto_15

    :catch_3
    move-exception v0

    const-string v7, "MediaSourceList"

    const-string v8, "Failed to release child source."

    invoke-static {v7, v8, v0}, Lx8/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_15
    iget-object v0, v6, Lb9/z0;->a:Ll9/a;

    iget-object v7, v6, Lb9/z0;->c:Lb9/y0;

    invoke-virtual {v0, v7}, Ll9/a;->q(Ll9/i0;)V

    iget-object v0, v6, Lb9/z0;->a:Ll9/a;

    invoke-virtual {v0, v7}, Ll9/a;->p(Lg9/e;)V

    goto :goto_14

    :cond_10
    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    iget-object v0, v2, Lb9/b1;->f:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    iput-boolean v4, v2, Lb9/b1;->g:Z

    :cond_11
    return-void
.end method

.method public final M()V
    .locals 1

    iget-object v0, p0, Lb9/l0;->R:Lb9/s0;

    iget-object v0, v0, Lb9/s0;->i:Lb9/q0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lb9/q0;->g:Lb9/r0;

    iget-boolean v0, v0, Lb9/r0;->i:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lb9/l0;->e0:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lb9/l0;->f0:Z

    return-void
.end method

.method public final N(J)V
    .locals 7

    iget-object v0, p0, Lb9/l0;->R:Lb9/s0;

    iget-object v1, v0, Lb9/s0;->i:Lb9/q0;

    if-nez v1, :cond_0

    const-wide v2, 0xe8d4a51000L

    :goto_0
    add-long/2addr p1, v2

    goto :goto_1

    :cond_0
    iget-wide v2, v1, Lb9/q0;->p:J

    goto :goto_0

    :goto_1
    iput-wide p1, p0, Lb9/l0;->q0:J

    iget-object v2, p0, Lb9/l0;->N:Lb9/l;

    iget-object v2, v2, Lb9/l;->z:Ljava/lang/Object;

    check-cast v2, Lb9/l1;

    invoke-virtual {v2, p1, p2}, Lb9/l1;->a(J)V

    iget-object p1, p0, Lb9/l0;->w:[Lb9/j1;

    array-length p2, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_2
    if-ge v3, p2, :cond_2

    aget-object v4, p1, v3

    iget-wide v5, p0, Lb9/l0;->q0:J

    invoke-virtual {v4, v1}, Lb9/j1;->d(Lb9/q0;)Lb9/f;

    move-result-object v4

    if-eqz v4, :cond_1

    iput-boolean v2, v4, Lb9/f;->N:Z

    iput-wide v5, v4, Lb9/f;->L:J

    iput-wide v5, v4, Lb9/f;->M:J

    invoke-virtual {v4, v5, v6, v2}, Lb9/f;->q(JZ)V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    iget-object p1, v0, Lb9/s0;->i:Lb9/q0;

    :goto_3
    if-eqz p1, :cond_5

    iget-object p2, p1, Lb9/q0;->o:Lo9/v;

    iget-object p2, p2, Lo9/v;->c:[Lo9/s;

    array-length v0, p2

    move v1, v2

    :goto_4
    if-ge v1, v0, :cond_4

    aget-object v3, p2, v1

    if-eqz v3, :cond_3

    invoke-interface {v3}, Lo9/s;->h()V

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_4
    iget-object p1, p1, Lb9/q0;->m:Lb9/q0;

    goto :goto_3

    :cond_5
    return-void
.end method

.method public final O(Lu8/o0;Lu8/o0;)V
    .locals 0

    invoke-virtual {p1}, Lu8/o0;->p()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Lu8/o0;->p()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lb9/l0;->O:Ljava/util/ArrayList;

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

.method public final R(J)V
    .locals 2

    iget-object v0, p0, Lb9/l0;->b0:Lb9/c1;

    iget v0, v0, Lb9/c1;->e:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lb9/l0;->k0()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x3e8

    goto :goto_0

    :cond_0
    sget-wide v0, Lb9/l0;->A0:J

    :goto_0
    add-long/2addr p1, v0

    iget-object v0, p0, Lb9/l0;->H:Lx8/r;

    iget-object v0, v0, Lx8/r;->a:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    return-void
.end method

.method public final S(Z)V
    .locals 11

    iget-object v0, p0, Lb9/l0;->R:Lb9/s0;

    iget-object v0, v0, Lb9/s0;->i:Lb9/q0;

    iget-object v0, v0, Lb9/q0;->g:Lb9/r0;

    iget-object v2, v0, Lb9/r0;->a:Ll9/c0;

    iget-object v0, p0, Lb9/l0;->b0:Lb9/c1;

    iget-wide v3, v0, Lb9/c1;->s:J

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lb9/l0;->U(Ll9/c0;JZZ)J

    move-result-wide v3

    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget-wide v5, v0, Lb9/c1;->s:J

    cmp-long v0, v3, v5

    if-eqz v0, :cond_0

    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget-wide v5, v0, Lb9/c1;->c:J

    iget-wide v7, v0, Lb9/c1;->d:J

    const/4 v10, 0x5

    move v9, p1

    invoke-virtual/range {v1 .. v10}, Lb9/l0;->w(Ll9/c0;JJJZI)Lb9/c1;

    move-result-object p1

    iput-object p1, v1, Lb9/l0;->b0:Lb9/c1;

    :cond_0
    return-void
.end method

.method public final T(Lb9/k0;)V
    .locals 18

    move-object/from16 v1, p0

    iget-object v0, v1, Lb9/l0;->c0:Lab/y;

    const/4 v9, 0x1

    invoke-virtual {v0, v9}, Lab/y;->c(I)V

    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v2, v0, Lb9/c1;->a:Lu8/o0;

    iget v5, v1, Lb9/l0;->j0:I

    iget-boolean v6, v1, Lb9/l0;->k0:Z

    iget-object v7, v1, Lb9/l0;->K:Lu8/n0;

    iget-object v8, v1, Lb9/l0;->L:Lu8/m0;

    const/4 v4, 0x1

    move-object/from16 v3, p1

    invoke-static/range {v2 .. v8}, Lb9/l0;->P(Lu8/o0;Lb9/k0;ZIZLu8/n0;Lu8/m0;)Landroid/util/Pair;

    move-result-object v0

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v8, 0x0

    if-nez v0, :cond_0

    iget-object v2, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v2, v2, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v1, v2}, Lb9/l0;->m(Lu8/o0;)Landroid/util/Pair;

    move-result-object v2

    iget-object v10, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v10, Ll9/c0;

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    iget-object v2, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v2, v2, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v2}, Lu8/o0;->p()Z

    move-result v2

    xor-int/2addr v2, v9

    move-wide v5, v6

    :goto_0
    const-wide/16 v15, 0x0

    goto :goto_3

    :cond_0
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v10, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Long;

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    iget-wide v13, v3, Lb9/k0;->c:J

    cmp-long v10, v13, v6

    if-nez v10, :cond_1

    move-wide v13, v6

    goto :goto_1

    :cond_1
    move-wide v13, v11

    :goto_1
    iget-object v10, v1, Lb9/l0;->R:Lb9/s0;

    iget-object v15, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v15, v15, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v10, v15, v2, v11, v12}, Lb9/s0;->p(Lu8/o0;Ljava/lang/Object;J)Ll9/c0;

    move-result-object v10

    invoke-virtual {v10}, Ll9/c0;->b()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v2, v2, Lb9/c1;->a:Lu8/o0;

    iget-object v6, v10, Ll9/c0;->a:Ljava/lang/Object;

    iget-object v7, v1, Lb9/l0;->L:Lu8/m0;

    invoke-virtual {v2, v6, v7}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    iget-object v2, v1, Lb9/l0;->L:Lu8/m0;

    iget v6, v10, Ll9/c0;->b:I

    invoke-virtual {v2, v6}, Lu8/m0;->e(I)I

    move-result v2

    iget v6, v10, Ll9/c0;->c:I

    if-ne v2, v6, :cond_2

    iget-object v2, v1, Lb9/l0;->L:Lu8/m0;

    iget-object v2, v2, Lu8/m0;->g:Lu8/b;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_2
    move v2, v9

    move-wide v5, v13

    const-wide/16 v11, 0x0

    goto :goto_0

    :cond_3
    const-wide/16 v15, 0x0

    iget-wide v4, v3, Lb9/k0;->c:J

    cmp-long v2, v4, v6

    if-nez v2, :cond_4

    move v2, v9

    goto :goto_2

    :cond_4
    move v2, v8

    :goto_2
    move-wide v5, v13

    :goto_3
    :try_start_0
    iget-object v4, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v4, v4, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v4}, Lu8/o0;->p()Z

    move-result v4

    if-eqz v4, :cond_5

    iput-object v3, v1, Lb9/l0;->p0:Lb9/k0;

    goto :goto_6

    :catchall_0
    move-exception v0

    move v9, v2

    :goto_4
    move-object v2, v10

    :goto_5
    move-wide v3, v11

    goto/16 :goto_12

    :cond_5
    const/4 v3, 0x4

    if-nez v0, :cond_7

    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget v0, v0, Lb9/c1;->e:I

    if-eq v0, v9, :cond_6

    invoke-virtual {v1, v3}, Lb9/l0;->h0(I)V

    :cond_6
    invoke-virtual {v1, v8, v9, v8, v9}, Lb9/l0;->L(ZZZZ)V

    :goto_6
    move v9, v2

    move-object v2, v10

    move-wide v3, v11

    goto/16 :goto_f

    :cond_7
    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v0, v0, Lb9/c1;->b:Ll9/c0;

    invoke-virtual {v10, v0}, Ll9/c0;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_b

    :try_start_1
    iget-object v0, v1, Lb9/l0;->R:Lb9/s0;

    iget-object v0, v0, Lb9/s0;->i:Lb9/q0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v0, :cond_8

    :try_start_2
    iget-boolean v4, v0, Lb9/q0;->e:Z

    if-eqz v4, :cond_8

    cmp-long v4, v11, v15

    if-eqz v4, :cond_8

    iget-object v0, v0, Lb9/q0;->a:Ljava/lang/Object;

    iget-object v4, v1, Lb9/l0;->a0:Lb9/k1;

    invoke-interface {v0, v11, v12, v4}, Ll9/a0;->s(JLb9/k1;)J

    move-result-wide v13
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_7

    :cond_8
    move-wide v13, v11

    :goto_7
    :try_start_3
    invoke-static {v13, v14}, Lx8/t;->U(J)J

    move-result-wide v15

    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget-wide v8, v0, Lb9/c1;->s:J

    invoke-static {v8, v9}, Lx8/t;->U(J)J

    move-result-wide v8

    cmp-long v0, v15, v8

    if-nez v0, :cond_9

    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget v4, v0, Lb9/c1;->e:I

    const/4 v8, 0x2

    if-eq v4, v8, :cond_a

    const/4 v8, 0x3

    if-ne v4, v8, :cond_9

    goto :goto_8

    :cond_9
    move v9, v2

    move-wide v15, v5

    move-object v2, v10

    goto :goto_a

    :cond_a
    :goto_8
    iget-wide v3, v0, Lb9/c1;->s:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move v9, v2

    move-object v2, v10

    const/4 v10, 0x2

    move-wide v7, v3

    :goto_9
    invoke-virtual/range {v1 .. v10}, Lb9/l0;->w(Ll9/c0;JJJZI)Lb9/c1;

    move-result-object v0

    iput-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    return-void

    :catchall_1
    move-exception v0

    move v9, v2

    move-wide v15, v5

    goto :goto_4

    :cond_b
    move v9, v2

    move-wide v15, v5

    move-object v2, v10

    move-wide v13, v11

    :goto_a
    :try_start_4
    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget v0, v0, Lb9/c1;->e:I

    if-ne v0, v3, :cond_c

    const/4 v6, 0x1

    goto :goto_b

    :cond_c
    const/4 v6, 0x0

    :goto_b
    iget-object v0, v1, Lb9/l0;->R:Lb9/s0;

    iget-object v3, v0, Lb9/s0;->i:Lb9/q0;

    iget-object v0, v0, Lb9/s0;->j:Lb9/q0;

    if-eq v3, v0, :cond_d

    const/4 v5, 0x1

    :goto_c
    move-wide v3, v13

    goto :goto_d

    :cond_d
    const/4 v5, 0x0

    goto :goto_c

    :goto_d
    invoke-virtual/range {v1 .. v6}, Lb9/l0;->U(Ll9/c0;JZZ)J

    move-result-wide v13
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    cmp-long v0, v11, v13

    if-eqz v0, :cond_e

    const/16 v17, 0x1

    goto :goto_e

    :cond_e
    const/16 v17, 0x0

    :goto_e
    or-int v9, v9, v17

    :try_start_5
    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    move-object v3, v2

    :try_start_6
    iget-object v2, v0, Lb9/c1;->a:Lu8/o0;

    iget-object v5, v0, Lb9/c1;->b:Ll9/c0;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    const/4 v8, 0x1

    move-object v4, v2

    move-wide v6, v15

    :try_start_7
    invoke-virtual/range {v1 .. v8}, Lb9/l0;->u0(Lu8/o0;Ll9/c0;Lu8/o0;Ll9/c0;JZ)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    move-object v2, v3

    move-wide v5, v6

    move-wide v3, v13

    :goto_f
    const/4 v10, 0x2

    move-wide v7, v3

    move-object/from16 v1, p0

    goto :goto_9

    :catchall_2
    move-exception v0

    move-object v2, v3

    move-wide v5, v6

    :goto_10
    move-wide v3, v13

    goto :goto_12

    :catchall_3
    move-exception v0

    move-object v2, v3

    :goto_11
    move-wide v5, v15

    goto :goto_10

    :catchall_4
    move-exception v0

    goto :goto_11

    :catchall_5
    move-exception v0

    move-wide v5, v15

    goto/16 :goto_5

    :goto_12
    const/4 v10, 0x2

    move-wide v7, v3

    invoke-virtual/range {v1 .. v10}, Lb9/l0;->w(Ll9/c0;JJJZI)Lb9/c1;

    move-result-object v2

    iput-object v2, v1, Lb9/l0;->b0:Lb9/c1;

    throw v0
.end method

.method public final U(Ll9/c0;JZZ)J
    .locals 9

    invoke-virtual {p0}, Lb9/l0;->o0()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lb9/l0;->v0(ZZ)V

    const/4 v2, 0x2

    if-nez p5, :cond_0

    iget-object p5, p0, Lb9/l0;->b0:Lb9/c1;

    iget p5, p5, Lb9/c1;->e:I

    const/4 v3, 0x3

    if-ne p5, v3, :cond_1

    :cond_0
    invoke-virtual {p0, v2}, Lb9/l0;->h0(I)V

    :cond_1
    iget-object p5, p0, Lb9/l0;->R:Lb9/s0;

    iget-object v3, p5, Lb9/s0;->i:Lb9/q0;

    move-object v4, v3

    :goto_0
    if-eqz v4, :cond_3

    iget-object v5, v4, Lb9/q0;->g:Lb9/r0;

    iget-object v5, v5, Lb9/r0;->a:Ll9/c0;

    invoke-virtual {p1, v5}, Ll9/c0;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    :cond_2
    iget-object v4, v4, Lb9/q0;->m:Lb9/q0;

    goto :goto_0

    :cond_3
    :goto_1
    if-nez p4, :cond_4

    if-ne v3, v4, :cond_4

    if-eqz v4, :cond_7

    iget-wide v5, v4, Lb9/q0;->p:J

    add-long/2addr v5, p2

    const-wide/16 v7, 0x0

    cmp-long p1, v5, v7

    if-gez p1, :cond_7

    :cond_4
    move p1, v0

    :goto_2
    iget-object p4, p0, Lb9/l0;->w:[Lb9/j1;

    array-length v3, p4

    if-ge p1, v3, :cond_5

    invoke-virtual {p0, p1}, Lb9/l0;->g(I)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :cond_5
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v5, p0, Lb9/l0;->x0:J

    if-eqz v4, :cond_7

    :goto_3
    iget-object p1, p5, Lb9/s0;->i:Lb9/q0;

    if-eq p1, v4, :cond_6

    invoke-virtual {p5}, Lb9/s0;->a()Lb9/q0;

    goto :goto_3

    :cond_6
    invoke-virtual {p5, v4}, Lb9/s0;->n(Lb9/q0;)I

    const-wide v5, 0xe8d4a51000L

    iput-wide v5, v4, Lb9/q0;->p:J

    array-length p1, p4

    new-array p1, p1, [Z

    iget-object p4, p5, Lb9/s0;->j:Lb9/q0;

    invoke-virtual {p4}, Lb9/q0;->e()J

    move-result-wide v5

    invoke-virtual {p0, p1, v5, v6}, Lb9/l0;->j([ZJ)V

    iput-boolean v1, v4, Lb9/q0;->h:Z

    :cond_7
    invoke-virtual {p0}, Lb9/l0;->f()V

    if-eqz v4, :cond_a

    iget-object p1, v4, Lb9/q0;->a:Ljava/lang/Object;

    invoke-virtual {p5, v4}, Lb9/s0;->n(Lb9/q0;)I

    iget-boolean p4, v4, Lb9/q0;->e:Z

    if-nez p4, :cond_8

    iget-object p1, v4, Lb9/q0;->g:Lb9/r0;

    invoke-virtual {p1, p2, p3}, Lb9/r0;->b(J)Lb9/r0;

    move-result-object p1

    iput-object p1, v4, Lb9/q0;->g:Lb9/r0;

    goto :goto_4

    :cond_8
    iget-boolean p4, v4, Lb9/q0;->f:Z

    if-eqz p4, :cond_9

    invoke-interface {p1, p2, p3}, Ll9/a0;->e(J)J

    move-result-wide p2

    iget-wide p4, p0, Lb9/l0;->M:J

    sub-long p4, p2, p4

    invoke-interface {p1, p4, p5}, Ll9/a0;->i(J)V

    :cond_9
    :goto_4
    invoke-virtual {p0, p2, p3}, Lb9/l0;->N(J)V

    invoke-virtual {p0}, Lb9/l0;->z()V

    goto :goto_5

    :cond_a
    invoke-virtual {p5}, Lb9/s0;->b()V

    invoke-virtual {p0, p2, p3}, Lb9/l0;->N(J)V

    :goto_5
    invoke-virtual {p0, v0}, Lb9/l0;->s(Z)V

    iget-object p1, p0, Lb9/l0;->H:Lx8/r;

    invoke-virtual {p1, v2}, Lx8/r;->e(I)Z

    return-wide p2
.end method

.method public final V(Lb9/f1;)V
    .locals 5

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lb9/l0;->H:Lx8/r;

    iget-object v1, p1, Lb9/f1;->e:Landroid/os/Looper;

    iget-object v2, p0, Lb9/l0;->J:Landroid/os/Looper;

    if-ne v1, v2, :cond_2

    monitor-enter p1

    monitor-exit p1

    const/4 v1, 0x1

    :try_start_0
    iget-object v2, p1, Lb9/f1;->a:Lb9/e1;

    iget v3, p1, Lb9/f1;->c:I

    iget-object v4, p1, Lb9/f1;->d:Ljava/lang/Object;

    invoke-interface {v2, v3, v4}, Lb9/e1;->a(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1, v1}, Lb9/f1;->a(Z)V

    iget-object p1, p0, Lb9/l0;->b0:Lb9/c1;

    iget p1, p1, Lb9/c1;->e:I

    const/4 v1, 0x3

    const/4 v2, 0x2

    if-eq p1, v1, :cond_1

    if-ne p1, v2, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    invoke-virtual {v0, v2}, Lx8/r;->e(I)Z

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p1, v1}, Lb9/f1;->a(Z)V

    throw v0

    :cond_2
    const/16 v1, 0xf

    invoke-virtual {v0, v1, p1}, Lx8/r;->a(ILjava/lang/Object;)Lx8/q;

    move-result-object p1

    invoke-virtual {p1}, Lx8/q;->b()V

    return-void
.end method

.method public final W(Lb9/f1;)V
    .locals 3

    iget-object v0, p1, Lb9/f1;->e:Landroid/os/Looper;

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v0, "TAG"

    const-string v1, "Trying to send message on a dead thread."

    invoke-static {v0, v1}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lb9/f1;->a(Z)V

    return-void

    :cond_0
    const/4 v1, 0x0

    iget-object v2, p0, Lb9/l0;->P:Lx8/p;

    invoke-virtual {v2, v0, v1}, Lx8/p;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lx8/r;

    move-result-object v0

    new-instance v1, Landroidx/fragment/app/m;

    invoke-direct {v1, p0, p1}, Landroidx/fragment/app/m;-><init>(Lb9/l0;Lb9/f1;)V

    invoke-virtual {v0, v1}, Lx8/r;->c(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final X(Lu8/d;Z)V
    .locals 3

    iget-object v0, p0, Lb9/l0;->z:Lb3/b;

    check-cast v0, Lo9/q;

    iget-object v1, v0, Lo9/q;->i:Lu8/d;

    invoke-virtual {v1, p1}, Lu8/d;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iput-object p1, v0, Lo9/q;->i:Lu8/d;

    invoke-virtual {v0}, Lo9/q;->O()V

    :goto_0
    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    iget-object p2, p0, Lb9/l0;->Z:Lb9/e;

    iget-object v0, p2, Lb9/e;->d:Lu8/d;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    iput-object p1, p2, Lb9/e;->d:Lu8/d;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_2

    move p1, v0

    goto :goto_2

    :cond_2
    move p1, v1

    :goto_2
    iput p1, p2, Lb9/e;->f:I

    if-eq p1, v1, :cond_3

    if-nez p1, :cond_4

    :cond_3
    move v0, v1

    :cond_4
    const-string p1, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."

    invoke-static {v0, p1}, Lva3/g;->e(ZLjava/lang/String;)V

    :cond_5
    iget-object p1, p0, Lb9/l0;->b0:Lb9/c1;

    iget-boolean v0, p1, Lb9/c1;->l:Z

    iget v1, p1, Lb9/c1;->n:I

    iget v2, p1, Lb9/c1;->m:I

    iget p1, p1, Lb9/c1;->e:I

    invoke-virtual {p2, p1, v0}, Lb9/e;->d(IZ)I

    move-result p1

    invoke-virtual {p0, p1, v1, v2, v0}, Lb9/l0;->s0(IIIZ)V

    return-void
.end method

.method public final Y(ZLjava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 3

    iget-boolean v0, p0, Lb9/l0;->l0:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lb9/l0;->l0:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lb9/l0;->w:[Lb9/j1;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    invoke-virtual {v2}, Lb9/j1;->l()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

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

    :cond_1
    return-void
.end method

.method public final Z(Lb9/i0;)V
    .locals 7

    iget-object v0, p0, Lb9/l0;->c0:Lab/y;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lab/y;->c(I)V

    iget v0, p1, Lb9/i0;->c:I

    iget-object v1, p1, Lb9/i0;->b:Ll9/c1;

    iget-object v2, p1, Lb9/i0;->a:Ljava/util/ArrayList;

    const/4 v3, -0x1

    if-eq v0, v3, :cond_0

    new-instance v0, Lb9/k0;

    new-instance v3, Lb9/h1;

    invoke-direct {v3, v2, v1}, Lb9/h1;-><init>(Ljava/util/ArrayList;Ll9/c1;)V

    iget v4, p1, Lb9/i0;->c:I

    iget-wide v5, p1, Lb9/i0;->d:J

    invoke-direct {v0, v3, v4, v5, v6}, Lb9/k0;-><init>(Lu8/o0;IJ)V

    iput-object v0, p0, Lb9/l0;->p0:Lb9/k0;

    :cond_0
    iget-object p1, p0, Lb9/l0;->S:Lb9/b1;

    iget-object v0, p1, Lb9/b1;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {p1, v4, v3}, Lb9/b1;->l(II)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p1, v0, v2, v1}, Lb9/b1;->b(ILjava/util/ArrayList;Ll9/c1;)Lu8/o0;

    move-result-object p1

    invoke-virtual {p0, p1, v4}, Lb9/l0;->t(Lu8/o0;Z)V

    return-void
.end method

.method public final a(Lb9/i0;I)V
    .locals 2

    iget-object v0, p0, Lb9/l0;->c0:Lab/y;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lab/y;->c(I)V

    const/4 v0, -0x1

    iget-object v1, p0, Lb9/l0;->S:Lb9/b1;

    if-ne p2, v0, :cond_0

    iget-object p2, v1, Lb9/b1;->b:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    :cond_0
    iget-object v0, p1, Lb9/i0;->a:Ljava/util/ArrayList;

    iget-object p1, p1, Lb9/i0;->b:Ll9/c1;

    invoke-virtual {v1, p2, v0, p1}, Lb9/b1;->b(ILjava/util/ArrayList;Ll9/c1;)Lu8/o0;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Lb9/l0;->t(Lu8/o0;Z)V

    return-void
.end method

.method public final a0(Z)V
    .locals 1

    iput-boolean p1, p0, Lb9/l0;->e0:Z

    invoke-virtual {p0}, Lb9/l0;->M()V

    iget-boolean p1, p0, Lb9/l0;->f0:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lb9/l0;->R:Lb9/s0;

    iget-object v0, p1, Lb9/s0;->j:Lb9/q0;

    iget-object p1, p1, Lb9/s0;->i:Lb9/q0;

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lb9/l0;->S(Z)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lb9/l0;->s(Z)V

    :cond_0
    return-void
.end method

.method public final b(Ll9/b1;)V
    .locals 2

    check-cast p1, Ll9/a0;

    iget-object v0, p0, Lb9/l0;->H:Lx8/r;

    const/16 v1, 0x9

    invoke-virtual {v0, v1, p1}, Lx8/r;->a(ILjava/lang/Object;)Lx8/q;

    move-result-object p1

    invoke-virtual {p1}, Lx8/q;->b()V

    return-void
.end method

.method public final b0(Lu8/e0;)V
    .locals 2

    iget-object v0, p0, Lb9/l0;->H:Lx8/r;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Lx8/r;->d(I)V

    iget-object v0, p0, Lb9/l0;->N:Lb9/l;

    invoke-virtual {v0, p1}, Lb9/l;->d(Lu8/e0;)V

    invoke-virtual {v0}, Lb9/l;->b()Lu8/e0;

    move-result-object p1

    const/4 v0, 0x1

    iget v1, p1, Lu8/e0;->a:F

    invoke-virtual {p0, p1, v1, v0, v0}, Lb9/l0;->v(Lu8/e0;FZZ)V

    return-void
.end method

.method public final c(Ll9/a0;)V
    .locals 2

    iget-object v0, p0, Lb9/l0;->H:Lx8/r;

    const/16 v1, 0x8

    invoke-virtual {v0, v1, p1}, Lx8/r;->a(ILjava/lang/Object;)Lx8/q;

    move-result-object p1

    invoke-virtual {p1}, Lx8/q;->b()V

    return-void
.end method

.method public final c0(Lb9/q;)V
    .locals 3

    iput-object p1, p0, Lb9/l0;->w0:Lb9/q;

    iget-object v0, p0, Lb9/l0;->b0:Lb9/c1;

    iget-object v0, v0, Lb9/c1;->a:Lu8/o0;

    iget-object v0, p0, Lb9/l0;->R:Lb9/s0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, v0, Lb9/s0;->q:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    iget-object v2, v0, Lb9/s0;->q:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, v0, Lb9/s0;->q:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb9/q0;

    invoke-virtual {v2}, Lb9/q0;->i()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput-object p1, v0, Lb9/s0;->q:Ljava/util/ArrayList;

    const/4 p1, 0x0

    iput-object p1, v0, Lb9/s0;->m:Lb9/q0;

    invoke-virtual {v0}, Lb9/s0;->k()V

    :cond_1
    return-void
.end method

.method public final d()Z
    .locals 5

    iget-boolean v0, p0, Lb9/l0;->Y:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lb9/l0;->w:[Lb9/j1;

    array-length v2, v0

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v0, v3

    invoke-virtual {v4}, Lb9/j1;->f()Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public final d0(I)V
    .locals 2

    iput p1, p0, Lb9/l0;->j0:I

    iget-object v0, p0, Lb9/l0;->b0:Lb9/c1;

    iget-object v0, v0, Lb9/c1;->a:Lu8/o0;

    iget-object v1, p0, Lb9/l0;->R:Lb9/s0;

    iput p1, v1, Lb9/s0;->g:I

    invoke-virtual {v1, v0}, Lb9/s0;->r(Lu8/o0;)I

    move-result p1

    and-int/lit8 v0, p1, 0x1

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lb9/l0;->S(Z)V

    goto :goto_0

    :cond_0
    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lb9/l0;->f()V

    :cond_1
    :goto_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lb9/l0;->s(Z)V

    return-void
.end method

.method public final e()V
    .locals 1

    invoke-virtual {p0}, Lb9/l0;->K()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lb9/l0;->S(Z)V

    return-void
.end method

.method public final e0(Lb9/k1;)V
    .locals 0

    iput-object p1, p0, Lb9/l0;->a0:Lb9/k1;

    return-void
.end method

.method public final f()V
    .locals 10

    iget-boolean v0, p0, Lb9/l0;->Y:Z

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lb9/l0;->d()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_6

    :cond_0
    iget-object v0, p0, Lb9/l0;->w:[Lb9/j1;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_6

    aget-object v4, v0, v3

    invoke-virtual {v4}, Lb9/j1;->c()I

    move-result v5

    invoke-virtual {v4}, Lb9/j1;->f()Z

    move-result v6

    if-nez v6, :cond_1

    goto :goto_5

    :cond_1
    iget v6, v4, Lb9/j1;->d:I

    const/4 v7, 0x1

    const/4 v8, 0x4

    if-eq v6, v8, :cond_3

    const/4 v9, 0x2

    if-ne v6, v9, :cond_2

    goto :goto_1

    :cond_2
    move v9, v2

    goto :goto_2

    :cond_3
    :goto_1
    move v9, v7

    :goto_2
    if-ne v6, v8, :cond_4

    goto :goto_3

    :cond_4
    move v7, v2

    :goto_3
    if-eqz v9, :cond_5

    iget-object v6, v4, Lb9/j1;->e:Ljava/lang/Object;

    check-cast v6, Lb9/f;

    goto :goto_4

    :cond_5
    iget-object v6, v4, Lb9/j1;->f:Ljava/lang/Object;

    check-cast v6, Lb9/f;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_4
    iget-object v8, p0, Lb9/l0;->N:Lb9/l;

    invoke-virtual {v4, v6, v8}, Lb9/j1;->a(Lb9/f;Lb9/l;)V

    invoke-virtual {v4, v9}, Lb9/j1;->j(Z)V

    iput v7, v4, Lb9/j1;->d:I

    :goto_5
    iget v6, p0, Lb9/l0;->o0:I

    invoke-virtual {v4}, Lb9/j1;->c()I

    move-result v4

    sub-int/2addr v5, v4

    sub-int/2addr v6, v5

    iput v6, p0, Lb9/l0;->o0:I

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_6
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lb9/l0;->x0:J

    :cond_7
    :goto_6
    return-void
.end method

.method public final f0(Z)V
    .locals 2

    iput-boolean p1, p0, Lb9/l0;->k0:Z

    iget-object v0, p0, Lb9/l0;->b0:Lb9/c1;

    iget-object v0, v0, Lb9/c1;->a:Lu8/o0;

    iget-object v1, p0, Lb9/l0;->R:Lb9/s0;

    iput-boolean p1, v1, Lb9/s0;->h:Z

    invoke-virtual {v1, v0}, Lb9/s0;->r(Lu8/o0;)I

    move-result p1

    and-int/lit8 v0, p1, 0x1

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lb9/l0;->S(Z)V

    goto :goto_0

    :cond_0
    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lb9/l0;->f()V

    :cond_1
    :goto_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lb9/l0;->s(Z)V

    return-void
.end method

.method public final g(I)V
    .locals 7

    iget-object v0, p0, Lb9/l0;->w:[Lb9/j1;

    aget-object v1, v0, p1

    invoke-virtual {v1}, Lb9/j1;->c()I

    move-result v1

    aget-object v0, v0, p1

    iget-object v2, v0, Lb9/j1;->e:Ljava/lang/Object;

    check-cast v2, Lb9/f;

    iget-object v3, p0, Lb9/l0;->N:Lb9/l;

    invoke-virtual {v0, v2, v3}, Lb9/j1;->a(Lb9/f;Lb9/l;)V

    iget-object v2, v0, Lb9/j1;->f:Ljava/lang/Object;

    check-cast v2, Lb9/f;

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    iget v5, v2, Lb9/f;->H:I

    if-eqz v5, :cond_0

    iget v5, v0, Lb9/j1;->d:I

    const/4 v6, 0x3

    if-eq v5, v6, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    move v5, v4

    :goto_0
    invoke-virtual {v0, v2, v3}, Lb9/j1;->a(Lb9/f;Lb9/l;)V

    invoke-virtual {v0, v4}, Lb9/j1;->j(Z)V

    if-eqz v5, :cond_1

    iget-object v3, v0, Lb9/j1;->e:Ljava/lang/Object;

    check-cast v3, Lb9/f;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v5, 0x11

    invoke-interface {v2, v5, v3}, Lb9/e1;->a(ILjava/lang/Object;)V

    :cond_1
    iput v4, v0, Lb9/j1;->d:I

    invoke-virtual {p0, p1, v4}, Lb9/l0;->D(IZ)V

    iget p1, p0, Lb9/l0;->o0:I

    sub-int/2addr p1, v1

    iput p1, p0, Lb9/l0;->o0:I

    return-void
.end method

.method public final g0(Ll9/c1;)V
    .locals 6

    iget-object v0, p0, Lb9/l0;->c0:Lab/y;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lab/y;->c(I)V

    iget-object v0, p0, Lb9/l0;->S:Lb9/b1;

    iget-object v1, v0, Lb9/b1;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget-object v2, p1, Ll9/c1;->b:[I

    array-length v2, v2

    if-eq v2, v1, :cond_0

    new-instance v2, Ll9/c1;

    new-instance v3, Ljava/util/Random;

    iget-object p1, p1, Ll9/c1;->a:Ljava/util/Random;

    invoke-virtual {p1}, Ljava/util/Random;->nextLong()J

    move-result-wide v4

    invoke-direct {v3, v4, v5}, Ljava/util/Random;-><init>(J)V

    invoke-direct {v2, v3}, Ll9/c1;-><init>(Ljava/util/Random;)V

    invoke-virtual {v2, v1}, Ll9/c1;->a(I)Ll9/c1;

    move-result-object p1

    :cond_0
    iput-object p1, v0, Lb9/b1;->l:Ljava/lang/Object;

    invoke-virtual {v0}, Lb9/b1;->d()Lu8/o0;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lb9/l0;->t(Lu8/o0;Z)V

    return-void
.end method

.method public final h()V
    .locals 50

    move-object/from16 v1, p0

    iget-object v0, v1, Lb9/l0;->P:Lx8/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v11

    iget-object v0, v1, Lb9/l0;->H:Lx8/r;

    const/4 v13, 0x2

    invoke-virtual {v0, v13}, Lx8/r;->d(I)V

    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v0, v0, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v0}, Lu8/o0;->p()Z

    move-result v0

    const/4 v14, 0x0

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v15, 0x4

    const/4 v2, 0x1

    if-nez v0, :cond_0

    iget-object v0, v1, Lb9/l0;->S:Lb9/b1;

    iget-boolean v0, v0, Lb9/b1;->g:Z

    if-nez v0, :cond_1

    :cond_0
    const/4 v15, 0x3

    goto/16 :goto_38

    :cond_1
    iget-object v0, v1, Lb9/l0;->R:Lb9/s0;

    iget-wide v3, v1, Lb9/l0;->q0:J

    invoke-virtual {v0, v3, v4}, Lb9/s0;->m(J)V

    iget-object v0, v1, Lb9/l0;->R:Lb9/s0;

    iget-object v3, v0, Lb9/s0;->l:Lb9/q0;

    if-eqz v3, :cond_3

    iget-object v4, v3, Lb9/q0;->g:Lb9/r0;

    iget-boolean v4, v4, Lb9/r0;->j:Z

    if-nez v4, :cond_2

    invoke-virtual {v3}, Lb9/q0;->g()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, v0, Lb9/s0;->l:Lb9/q0;

    iget-object v3, v3, Lb9/q0;->g:Lb9/r0;

    iget-wide v3, v3, Lb9/r0;->e:J

    cmp-long v3, v3, v9

    if-eqz v3, :cond_2

    iget v0, v0, Lb9/s0;->n:I

    const/16 v3, 0x64

    if-ge v0, v3, :cond_2

    goto :goto_0

    :cond_2
    move-wide/from16 v23, v9

    goto/16 :goto_9

    :cond_3
    :goto_0
    iget-object v0, v1, Lb9/l0;->R:Lb9/s0;

    iget-wide v3, v1, Lb9/l0;->q0:J

    iget-object v5, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v6, v0, Lb9/s0;->l:Lb9/q0;

    if-nez v6, :cond_4

    iget-object v3, v5, Lb9/c1;->a:Lu8/o0;

    iget-object v4, v5, Lb9/c1;->b:Ll9/c0;

    move-wide/from16 v23, v9

    iget-wide v9, v5, Lb9/c1;->c:J

    iget-wide v5, v5, Lb9/c1;->s:J

    move-object/from16 v16, v0

    move-object/from16 v17, v3

    move-object/from16 v18, v4

    move-wide/from16 v21, v5

    move-wide/from16 v19, v9

    invoke-virtual/range {v16 .. v22}, Lb9/s0;->d(Lu8/o0;Ll9/c0;JJ)Lb9/r0;

    move-result-object v0

    goto :goto_1

    :cond_4
    move-wide/from16 v23, v9

    iget-object v5, v5, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v0, v5, v6, v3, v4}, Lb9/s0;->c(Lu8/o0;Lb9/q0;J)Lb9/r0;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_f

    iget-object v3, v1, Lb9/l0;->R:Lb9/s0;

    iget-object v4, v3, Lb9/s0;->l:Lb9/q0;

    if-nez v4, :cond_5

    const-wide v4, 0xe8d4a51000L

    :goto_2
    move-wide/from16 v27, v4

    goto :goto_3

    :cond_5
    iget-wide v5, v4, Lb9/q0;->p:J

    iget-object v4, v4, Lb9/q0;->g:Lb9/r0;

    iget-wide v9, v4, Lb9/r0;->e:J

    add-long/2addr v5, v9

    iget-wide v9, v0, Lb9/r0;->b:J

    sub-long v4, v5, v9

    goto :goto_2

    :goto_3
    const/4 v4, 0x0

    :goto_4
    iget-object v5, v3, Lb9/s0;->q:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_8

    iget-object v5, v3, Lb9/s0;->q:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb9/q0;

    iget-object v5, v5, Lb9/q0;->g:Lb9/r0;

    iget-wide v9, v5, Lb9/r0;->e:J

    iget-wide v7, v0, Lb9/r0;->e:J

    cmp-long v6, v9, v23

    if-eqz v6, :cond_6

    cmp-long v6, v9, v7

    if-nez v6, :cond_7

    :cond_6
    iget-wide v6, v5, Lb9/r0;->b:J

    iget-wide v8, v0, Lb9/r0;->b:J

    cmp-long v6, v6, v8

    if-nez v6, :cond_7

    iget-object v5, v5, Lb9/r0;->a:Ll9/c0;

    iget-object v6, v0, Lb9/r0;->a:Ll9/c0;

    invoke-virtual {v5, v6}, Ll9/c0;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    iget-object v5, v3, Lb9/s0;->q:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb9/q0;

    goto :goto_5

    :cond_7
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_8
    move-object v4, v14

    :goto_5
    if-nez v4, :cond_9

    iget-object v4, v3, Lb9/s0;->e:Lab/g0;

    iget-object v4, v4, Lab/g0;->x:Ljava/lang/Object;

    check-cast v4, Lb9/l0;

    new-instance v25, Lb9/q0;

    iget-object v5, v4, Lb9/l0;->x:[Lb9/f;

    iget-object v6, v4, Lb9/l0;->z:Lb3/b;

    iget-object v7, v4, Lb9/l0;->F:Lb9/k;

    iget-object v7, v7, Lb9/k;->a:Lko/o;

    iget-object v8, v4, Lb9/l0;->S:Lb9/b1;

    iget-object v9, v4, Lb9/l0;->E:Lo9/v;

    iget-object v4, v4, Lb9/l0;->w0:Lb9/q;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v32, v0

    move-object/from16 v26, v5

    move-object/from16 v29, v6

    move-object/from16 v30, v7

    move-object/from16 v31, v8

    move-object/from16 v33, v9

    invoke-direct/range {v25 .. v33}, Lb9/q0;-><init>([Lb9/f;JLb3/b;Lko/o;Lb9/b1;Lb9/r0;Lo9/v;)V

    move-object/from16 v4, v25

    goto :goto_6

    :cond_9
    move-wide/from16 v5, v27

    iput-object v0, v4, Lb9/q0;->g:Lb9/r0;

    iput-wide v5, v4, Lb9/q0;->p:J

    :goto_6
    iget-object v5, v3, Lb9/s0;->l:Lb9/q0;

    if-eqz v5, :cond_b

    iget-object v6, v5, Lb9/q0;->m:Lb9/q0;

    if-ne v4, v6, :cond_a

    goto :goto_7

    :cond_a
    invoke-virtual {v5}, Lb9/q0;->b()V

    iput-object v4, v5, Lb9/q0;->m:Lb9/q0;

    invoke-virtual {v5}, Lb9/q0;->c()V

    goto :goto_7

    :cond_b
    iput-object v4, v3, Lb9/s0;->i:Lb9/q0;

    iput-object v4, v3, Lb9/s0;->j:Lb9/q0;

    iput-object v4, v3, Lb9/s0;->k:Lb9/q0;

    :goto_7
    iput-object v14, v3, Lb9/s0;->o:Ljava/lang/Object;

    iput-object v4, v3, Lb9/s0;->l:Lb9/q0;

    iget v5, v3, Lb9/s0;->n:I

    add-int/2addr v5, v2

    iput v5, v3, Lb9/s0;->n:I

    invoke-virtual {v3}, Lb9/s0;->l()V

    iget-boolean v3, v4, Lb9/q0;->d:Z

    if-nez v3, :cond_c

    iget-wide v5, v0, Lb9/r0;->b:J

    iput-boolean v2, v4, Lb9/q0;->d:Z

    iget-object v3, v4, Lb9/q0;->a:Ljava/lang/Object;

    invoke-interface {v3, v1, v5, v6}, Ll9/a0;->t(Ll9/z;J)V

    goto :goto_8

    :cond_c
    iget-boolean v3, v4, Lb9/q0;->e:Z

    if-eqz v3, :cond_d

    iget-object v3, v1, Lb9/l0;->H:Lx8/r;

    const/16 v5, 0x8

    iget-object v6, v4, Lb9/q0;->a:Ljava/lang/Object;

    invoke-virtual {v3, v5, v6}, Lx8/r;->a(ILjava/lang/Object;)Lx8/q;

    move-result-object v3

    invoke-virtual {v3}, Lx8/q;->b()V

    :cond_d
    :goto_8
    iget-object v3, v1, Lb9/l0;->R:Lb9/s0;

    iget-object v3, v3, Lb9/s0;->i:Lb9/q0;

    if-ne v3, v4, :cond_e

    iget-wide v3, v0, Lb9/r0;->b:J

    invoke-virtual {v1, v3, v4}, Lb9/l0;->N(J)V

    :cond_e
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lb9/l0;->s(Z)V

    :cond_f
    :goto_9
    iget-boolean v0, v1, Lb9/l0;->i0:Z

    if-eqz v0, :cond_10

    iget-object v0, v1, Lb9/l0;->R:Lb9/s0;

    iget-object v0, v0, Lb9/s0;->l:Lb9/q0;

    invoke-static {v0}, Lb9/l0;->x(Lb9/q0;)Z

    move-result v0

    iput-boolean v0, v1, Lb9/l0;->i0:Z

    invoke-virtual {v1}, Lb9/l0;->p0()V

    goto :goto_a

    :cond_10
    invoke-virtual {v1}, Lb9/l0;->z()V

    :goto_a
    iget-object v0, v1, Lb9/l0;->R:Lb9/s0;

    iget-boolean v3, v1, Lb9/l0;->f0:Z

    if-nez v3, :cond_11

    iget-boolean v3, v1, Lb9/l0;->Y:Z

    if-eqz v3, :cond_11

    iget-boolean v3, v1, Lb9/l0;->y0:Z

    if-nez v3, :cond_11

    invoke-virtual {v1}, Lb9/l0;->d()Z

    move-result v3

    if-eqz v3, :cond_13

    :cond_11
    :goto_b
    move v9, v2

    :cond_12
    :goto_c
    const/4 v0, 0x0

    goto/16 :goto_10

    :cond_13
    iget-object v3, v0, Lb9/s0;->k:Lb9/q0;

    if-eqz v3, :cond_11

    iget-object v4, v0, Lb9/s0;->j:Lb9/q0;

    if-ne v3, v4, :cond_11

    iget-object v3, v3, Lb9/q0;->m:Lb9/q0;

    if-eqz v3, :cond_11

    iget-boolean v4, v3, Lb9/q0;->e:Z

    if-nez v4, :cond_14

    goto :goto_b

    :cond_14
    iput-object v3, v0, Lb9/s0;->k:Lb9/q0;

    invoke-virtual {v0}, Lb9/s0;->l()V

    iget-object v3, v0, Lb9/s0;->k:Lb9/q0;

    invoke-static {v3}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-object v7, v1, Lb9/l0;->w:[Lb9/j1;

    move v3, v2

    iget-object v2, v0, Lb9/s0;->k:Lb9/q0;

    if-nez v2, :cond_15

    move v9, v3

    goto :goto_c

    :cond_15
    iget-object v8, v2, Lb9/q0;->o:Lo9/v;

    move v4, v3

    const/4 v3, 0x0

    :goto_d
    array-length v5, v7

    if-ge v3, v5, :cond_19

    invoke-virtual {v8, v3}, Lo9/v;->b(I)Z

    move-result v5

    if-eqz v5, :cond_18

    aget-object v5, v7, v3

    iget-object v6, v5, Lb9/j1;->f:Ljava/lang/Object;

    check-cast v6, Lb9/f;

    if-eqz v6, :cond_18

    invoke-virtual {v5}, Lb9/j1;->f()Z

    move-result v5

    if-nez v5, :cond_18

    aget-object v5, v7, v3

    invoke-virtual {v5}, Lb9/j1;->f()Z

    move-result v6

    xor-int/2addr v6, v4

    invoke-static {v6}, Lva3/g;->i(Z)V

    iget-object v6, v5, Lb9/j1;->e:Ljava/lang/Object;

    check-cast v6, Lb9/f;

    invoke-static {v6}, Lb9/j1;->h(Lb9/f;)Z

    move-result v6

    if-eqz v6, :cond_16

    const/4 v6, 0x3

    goto :goto_e

    :cond_16
    iget-object v6, v5, Lb9/j1;->f:Ljava/lang/Object;

    check-cast v6, Lb9/f;

    if-eqz v6, :cond_17

    iget v6, v6, Lb9/f;->H:I

    if-eqz v6, :cond_17

    move v6, v15

    goto :goto_e

    :cond_17
    move v6, v13

    :goto_e
    iput v6, v5, Lb9/j1;->d:I

    move v5, v4

    const/4 v4, 0x0

    move v9, v5

    invoke-virtual {v2}, Lb9/q0;->e()J

    move-result-wide v5

    invoke-virtual/range {v1 .. v6}, Lb9/l0;->i(Lb9/q0;IZJ)V

    goto :goto_f

    :cond_18
    move v9, v4

    :goto_f
    add-int/lit8 v3, v3, 0x1

    move v4, v9

    goto :goto_d

    :cond_19
    move v9, v4

    invoke-virtual {v1}, Lb9/l0;->d()Z

    move-result v3

    if-eqz v3, :cond_12

    iget-object v3, v2, Lb9/q0;->a:Ljava/lang/Object;

    invoke-interface {v3}, Ll9/a0;->f()J

    move-result-wide v3

    iput-wide v3, v1, Lb9/l0;->x0:J

    invoke-virtual {v2}, Lb9/q0;->g()Z

    move-result v3

    if-nez v3, :cond_12

    invoke-virtual {v0, v2}, Lb9/s0;->n(Lb9/q0;)I

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lb9/l0;->s(Z)V

    invoke-virtual {v1}, Lb9/l0;->z()V

    :goto_10
    iget-boolean v10, v1, Lb9/l0;->Y:Z

    iget-object v2, v1, Lb9/l0;->w:[Lb9/j1;

    iget-object v3, v1, Lb9/l0;->R:Lb9/s0;

    iget-object v4, v3, Lb9/s0;->j:Lb9/q0;

    if-nez v4, :cond_1b

    :cond_1a
    :goto_11
    const/4 v7, 0x3

    goto/16 :goto_24

    :cond_1b
    iget-object v5, v4, Lb9/q0;->m:Lb9/q0;

    if-eqz v5, :cond_1c

    iget-boolean v5, v1, Lb9/l0;->f0:Z

    if-eqz v5, :cond_1d

    :cond_1c
    move-object v14, v2

    const/4 v7, 0x3

    goto/16 :goto_1f

    :cond_1d
    iget-boolean v5, v4, Lb9/q0;->e:Z

    if-nez v5, :cond_1e

    goto :goto_11

    :cond_1e
    move v5, v0

    :goto_12
    array-length v6, v2

    if-ge v5, v6, :cond_1f

    aget-object v6, v2, v5

    iget-object v7, v6, Lb9/j1;->e:Ljava/lang/Object;

    check-cast v7, Lb9/f;

    invoke-virtual {v6, v4, v7}, Lb9/j1;->e(Lb9/q0;Lb9/f;)Z

    move-result v7

    if-eqz v7, :cond_1a

    iget-object v7, v6, Lb9/j1;->f:Ljava/lang/Object;

    check-cast v7, Lb9/f;

    invoke-virtual {v6, v4, v7}, Lb9/j1;->e(Lb9/q0;Lb9/f;)Z

    move-result v6

    if-eqz v6, :cond_1a

    add-int/lit8 v5, v5, 0x1

    goto :goto_12

    :cond_1f
    invoke-virtual {v1}, Lb9/l0;->d()Z

    move-result v5

    if-eqz v5, :cond_20

    iget-object v5, v3, Lb9/s0;->k:Lb9/q0;

    iget-object v6, v3, Lb9/s0;->j:Lb9/q0;

    if-ne v5, v6, :cond_20

    goto :goto_11

    :cond_20
    iget-object v5, v4, Lb9/q0;->m:Lb9/q0;

    iget-boolean v6, v5, Lb9/q0;->e:Z

    if-nez v6, :cond_21

    iget-wide v6, v1, Lb9/l0;->q0:J

    invoke-virtual {v5}, Lb9/q0;->e()J

    move-result-wide v17

    cmp-long v5, v6, v17

    if-gez v5, :cond_21

    goto :goto_11

    :cond_21
    iget-object v5, v4, Lb9/q0;->o:Lo9/v;

    iget-object v6, v3, Lb9/s0;->k:Lb9/q0;

    iget-object v7, v3, Lb9/s0;->j:Lb9/q0;

    if-ne v6, v7, :cond_22

    invoke-static {v7}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-object v6, v7, Lb9/q0;->m:Lb9/q0;

    iput-object v6, v3, Lb9/s0;->k:Lb9/q0;

    :cond_22
    iget-object v6, v3, Lb9/s0;->j:Lb9/q0;

    invoke-static {v6}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-object v6, v6, Lb9/q0;->m:Lb9/q0;

    iput-object v6, v3, Lb9/s0;->j:Lb9/q0;

    invoke-virtual {v3}, Lb9/s0;->l()V

    iget-object v6, v3, Lb9/s0;->j:Lb9/q0;

    invoke-static {v6}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-object v7, v6, Lb9/q0;->o:Lo9/v;

    iget-object v8, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v8, v8, Lb9/c1;->a:Lu8/o0;

    iget-object v0, v6, Lb9/q0;->g:Lb9/r0;

    iget-object v0, v0, Lb9/r0;->a:Ll9/c0;

    iget-object v4, v4, Lb9/q0;->g:Lb9/r0;

    iget-object v4, v4, Lb9/r0;->a:Ll9/c0;

    move-object/from16 v18, v6

    move-object/from16 v19, v7

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    move-object/from16 v20, v2

    move-object v2, v8

    const/4 v8, 0x0

    move-object/from16 v21, v5

    move-object v5, v4

    move-object v4, v2

    move-object v9, v3

    move-object/from16 v13, v19

    move-object/from16 v14, v20

    move-object/from16 v34, v21

    move-object v3, v0

    move/from16 v20, v10

    move-object/from16 v0, v18

    const/4 v10, 0x3

    invoke-virtual/range {v1 .. v8}, Lb9/l0;->u0(Lu8/o0;Ll9/c0;Lu8/o0;Ll9/c0;JZ)V

    iget-boolean v2, v0, Lb9/q0;->e:Z

    if-eqz v2, :cond_2f

    if-eqz v20, :cond_24

    iget-wide v2, v1, Lb9/l0;->x0:J

    cmp-long v2, v2, v23

    if-nez v2, :cond_23

    goto :goto_14

    :cond_23
    :goto_13
    move-wide/from16 v2, v23

    goto :goto_15

    :cond_24
    :goto_14
    iget-object v2, v0, Lb9/q0;->a:Ljava/lang/Object;

    invoke-interface {v2}, Ll9/a0;->f()J

    move-result-wide v2

    cmp-long v2, v2, v23

    if-eqz v2, :cond_2f

    goto :goto_13

    :goto_15
    iput-wide v2, v1, Lb9/l0;->x0:J

    if-eqz v20, :cond_25

    iget-boolean v2, v1, Lb9/l0;->y0:Z

    if-nez v2, :cond_25

    const/4 v8, 0x1

    goto :goto_16

    :cond_25
    const/4 v8, 0x0

    :goto_16
    if-eqz v8, :cond_28

    const/4 v2, 0x0

    :goto_17
    array-length v3, v14

    if-ge v2, v3, :cond_28

    invoke-virtual {v13, v2}, Lo9/v;->b(I)Z

    move-result v3

    iget-object v4, v13, Lo9/v;->c:[Lo9/s;

    if-nez v3, :cond_26

    goto :goto_18

    :cond_26
    aget-object v3, v4, v2

    invoke-interface {v3}, Lo9/s;->n()Lu8/p;

    move-result-object v3

    iget-object v3, v3, Lu8/p;->n:Ljava/lang/String;

    aget-object v4, v4, v2

    invoke-interface {v4}, Lo9/s;->n()Lu8/p;

    move-result-object v4

    iget-object v4, v4, Lu8/p;->k:Ljava/lang/String;

    invoke-static {v3, v4}, Lu8/d0;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_27

    aget-object v3, v14, v2

    invoke-virtual {v3}, Lb9/j1;->f()Z

    move-result v3

    if-nez v3, :cond_27

    const/4 v8, 0x0

    goto :goto_19

    :cond_27
    :goto_18
    add-int/lit8 v2, v2, 0x1

    goto :goto_17

    :cond_28
    :goto_19
    if-nez v8, :cond_2f

    invoke-virtual {v0}, Lb9/q0;->e()J

    move-result-wide v2

    array-length v4, v14

    const/4 v8, 0x0

    :goto_1a
    if-ge v8, v4, :cond_2c

    aget-object v5, v14, v8

    iget-object v6, v5, Lb9/j1;->f:Ljava/lang/Object;

    check-cast v6, Lb9/f;

    iget-object v7, v5, Lb9/j1;->e:Ljava/lang/Object;

    check-cast v7, Lb9/f;

    invoke-static {v7}, Lb9/j1;->h(Lb9/f;)Z

    move-result v13

    if-eqz v13, :cond_29

    iget v13, v5, Lb9/j1;->d:I

    if-eq v13, v15, :cond_29

    const/4 v15, 0x2

    if-eq v13, v15, :cond_29

    invoke-static {v7, v2, v3}, Lb9/j1;->m(Lb9/f;J)V

    :cond_29
    if-eqz v6, :cond_2b

    iget v7, v6, Lb9/f;->H:I

    if-eqz v7, :cond_2a

    const/4 v7, 0x1

    goto :goto_1b

    :cond_2a
    const/4 v7, 0x0

    :goto_1b
    if-eqz v7, :cond_2b

    iget v5, v5, Lb9/j1;->d:I

    if-eq v5, v10, :cond_2b

    invoke-static {v6, v2, v3}, Lb9/j1;->m(Lb9/f;J)V

    :cond_2b
    add-int/lit8 v8, v8, 0x1

    const/4 v15, 0x4

    goto :goto_1a

    :cond_2c
    invoke-virtual {v0}, Lb9/q0;->g()Z

    move-result v2

    if-nez v2, :cond_2d

    invoke-virtual {v9, v0}, Lb9/s0;->n(Lb9/q0;)I

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lb9/l0;->s(Z)V

    invoke-virtual {v1}, Lb9/l0;->z()V

    :cond_2d
    move v7, v10

    :cond_2e
    const-wide v23, -0x7fffffffffffffffL    # -4.9E-324

    goto/16 :goto_24

    :cond_2f
    array-length v2, v14

    const/4 v8, 0x0

    :goto_1c
    if-ge v8, v2, :cond_2d

    aget-object v3, v14, v8

    invoke-virtual {v0}, Lb9/q0;->e()J

    move-result-wide v4

    iget-object v6, v3, Lb9/j1;->e:Ljava/lang/Object;

    check-cast v6, Lb9/f;

    iget v7, v3, Lb9/j1;->c:I

    move-object/from16 v9, v34

    invoke-virtual {v9, v7}, Lo9/v;->b(I)Z

    move-result v15

    invoke-virtual {v13, v7}, Lo9/v;->b(I)Z

    move-result v21

    iget-object v10, v3, Lb9/j1;->f:Ljava/lang/Object;

    check-cast v10, Lb9/f;

    move-object/from16 v25, v0

    if-eqz v10, :cond_30

    iget v0, v3, Lb9/j1;->d:I

    move/from16 v26, v7

    const/4 v7, 0x3

    if-eq v0, v7, :cond_31

    if-nez v0, :cond_32

    invoke-static {v6}, Lb9/j1;->h(Lb9/f;)Z

    move-result v0

    if-eqz v0, :cond_32

    goto :goto_1d

    :cond_30
    move/from16 v26, v7

    const/4 v7, 0x3

    :cond_31
    :goto_1d
    move-object v10, v6

    :cond_32
    if-eqz v15, :cond_35

    iget-boolean v0, v10, Lb9/f;->N:Z

    if-nez v0, :cond_35

    iget v0, v6, Lb9/f;->x:I

    const/4 v6, -0x2

    if-ne v0, v6, :cond_33

    const/4 v0, 0x1

    goto :goto_1e

    :cond_33
    const/4 v0, 0x0

    :goto_1e
    iget-object v6, v9, Lo9/v;->b:[Lb9/i1;

    aget-object v6, v6, v26

    iget-object v15, v13, Lo9/v;->b:[Lb9/i1;

    aget-object v15, v15, v26

    if-eqz v21, :cond_34

    invoke-static {v15, v6}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_34

    if-nez v0, :cond_34

    invoke-virtual {v3}, Lb9/j1;->f()Z

    move-result v0

    if-eqz v0, :cond_35

    :cond_34
    invoke-static {v10, v4, v5}, Lb9/j1;->m(Lb9/f;J)V

    :cond_35
    add-int/lit8 v8, v8, 0x1

    move v10, v7

    move-object/from16 v34, v9

    move-object/from16 v0, v25

    goto :goto_1c

    :goto_1f
    iget-object v0, v4, Lb9/q0;->g:Lb9/r0;

    iget-boolean v0, v0, Lb9/r0;->j:Z

    if-nez v0, :cond_36

    iget-boolean v0, v1, Lb9/l0;->f0:Z

    if-eqz v0, :cond_2e

    :cond_36
    array-length v0, v14

    const/4 v8, 0x0

    :goto_20
    if-ge v8, v0, :cond_2e

    aget-object v2, v14, v8

    invoke-virtual {v2, v4}, Lb9/j1;->d(Lb9/q0;)Lb9/f;

    move-result-object v3

    if-eqz v3, :cond_37

    const/4 v3, 0x1

    goto :goto_21

    :cond_37
    const/4 v3, 0x0

    :goto_21
    if-nez v3, :cond_39

    :cond_38
    const-wide v23, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_23

    :cond_39
    invoke-virtual {v2, v4}, Lb9/j1;->d(Lb9/q0;)Lb9/f;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Lb9/f;->k()Z

    move-result v3

    if-eqz v3, :cond_38

    iget-object v3, v4, Lb9/q0;->g:Lb9/r0;

    iget-wide v5, v3, Lb9/r0;->e:J

    const-wide v23, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v5, v23

    if-eqz v3, :cond_3a

    const-wide/high16 v9, -0x8000000000000000L

    cmp-long v3, v5, v9

    if-eqz v3, :cond_3a

    iget-wide v9, v4, Lb9/q0;->p:J

    add-long/2addr v5, v9

    goto :goto_22

    :cond_3a
    move-wide/from16 v5, v23

    :goto_22
    invoke-virtual {v2, v4}, Lb9/j1;->d(Lb9/q0;)Lb9/f;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v5, v6}, Lb9/j1;->m(Lb9/f;J)V

    :goto_23
    add-int/lit8 v8, v8, 0x1

    goto :goto_20

    :goto_24
    iget-object v0, v1, Lb9/l0;->R:Lb9/s0;

    iget-object v2, v0, Lb9/s0;->j:Lb9/q0;

    if-eqz v2, :cond_44

    iget-object v3, v0, Lb9/s0;->i:Lb9/q0;

    if-eq v3, v2, :cond_44

    iget-boolean v3, v2, Lb9/q0;->h:Z

    if-eqz v3, :cond_3b

    goto/16 :goto_2a

    :cond_3b
    iget-object v8, v1, Lb9/l0;->w:[Lb9/j1;

    iget-object v9, v2, Lb9/q0;->o:Lo9/v;

    const/4 v3, 0x0

    const/4 v10, 0x1

    :goto_25
    array-length v4, v8

    if-ge v3, v4, :cond_40

    aget-object v4, v8, v3

    invoke-virtual {v4}, Lb9/j1;->c()I

    move-result v4

    aget-object v5, v8, v3

    iget-object v6, v1, Lb9/l0;->N:Lb9/l;

    iget-object v13, v5, Lb9/j1;->e:Ljava/lang/Object;

    check-cast v13, Lb9/f;

    invoke-virtual {v5, v13, v2, v9, v6}, Lb9/j1;->k(Lb9/f;Lb9/q0;Lo9/v;Lb9/l;)I

    move-result v13

    iget-object v14, v5, Lb9/j1;->f:Ljava/lang/Object;

    check-cast v14, Lb9/f;

    invoke-virtual {v5, v14, v2, v9, v6}, Lb9/j1;->k(Lb9/f;Lb9/q0;Lo9/v;Lb9/l;)I

    move-result v5

    const/4 v6, 0x1

    if-ne v13, v6, :cond_3c

    move v13, v5

    :cond_3c
    and-int/lit8 v5, v13, 0x2

    if-eqz v5, :cond_3e

    iget-boolean v5, v1, Lb9/l0;->n0:Z

    if-eqz v5, :cond_3e

    if-nez v5, :cond_3d

    goto :goto_26

    :cond_3d
    const/4 v5, 0x0

    iput-boolean v5, v1, Lb9/l0;->n0:Z

    iget-object v5, v1, Lb9/l0;->b0:Lb9/c1;

    iget-boolean v5, v5, Lb9/c1;->p:Z

    if-eqz v5, :cond_3e

    iget-object v5, v1, Lb9/l0;->H:Lx8/r;

    const/4 v15, 0x2

    invoke-virtual {v5, v15}, Lx8/r;->e(I)Z

    :cond_3e
    :goto_26
    iget v5, v1, Lb9/l0;->o0:I

    aget-object v6, v8, v3

    invoke-virtual {v6}, Lb9/j1;->c()I

    move-result v6

    sub-int/2addr v4, v6

    sub-int/2addr v5, v4

    iput v5, v1, Lb9/l0;->o0:I

    and-int/lit8 v4, v13, 0x1

    if-eqz v4, :cond_3f

    const/4 v4, 0x1

    goto :goto_27

    :cond_3f
    const/4 v4, 0x0

    :goto_27
    and-int/2addr v10, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_25

    :cond_40
    if-eqz v10, :cond_43

    const/4 v3, 0x0

    :goto_28
    array-length v4, v8

    if-ge v3, v4, :cond_43

    invoke-virtual {v9, v3}, Lo9/v;->b(I)Z

    move-result v4

    if-eqz v4, :cond_42

    aget-object v4, v8, v3

    invoke-virtual {v4, v2}, Lb9/j1;->d(Lb9/q0;)Lb9/f;

    move-result-object v4

    if-eqz v4, :cond_41

    const/4 v4, 0x1

    goto :goto_29

    :cond_41
    const/4 v4, 0x0

    :goto_29
    if-nez v4, :cond_42

    const/4 v4, 0x0

    invoke-virtual {v2}, Lb9/q0;->e()J

    move-result-wide v5

    invoke-virtual/range {v1 .. v6}, Lb9/l0;->i(Lb9/q0;IZJ)V

    :cond_42
    add-int/lit8 v3, v3, 0x1

    goto :goto_28

    :cond_43
    if-eqz v10, :cond_44

    iget-object v0, v0, Lb9/s0;->j:Lb9/q0;

    const/4 v9, 0x1

    iput-boolean v9, v0, Lb9/q0;->h:Z

    :cond_44
    :goto_2a
    iget-object v0, v1, Lb9/l0;->w:[Lb9/j1;

    iget-object v13, v1, Lb9/l0;->R:Lb9/s0;

    const/4 v8, 0x0

    :goto_2b
    invoke-virtual {v1}, Lb9/l0;->k0()Z

    move-result v2

    if-nez v2, :cond_46

    :cond_45
    :goto_2c
    move v15, v7

    goto/16 :goto_37

    :cond_46
    iget-boolean v2, v1, Lb9/l0;->f0:Z

    if-eqz v2, :cond_47

    goto :goto_2c

    :cond_47
    iget-object v2, v13, Lb9/s0;->i:Lb9/q0;

    if-nez v2, :cond_48

    goto :goto_2c

    :cond_48
    iget-object v2, v2, Lb9/q0;->m:Lb9/q0;

    if-eqz v2, :cond_45

    iget-wide v3, v1, Lb9/l0;->q0:J

    invoke-virtual {v2}, Lb9/q0;->e()J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-ltz v3, :cond_45

    iget-boolean v2, v2, Lb9/q0;->h:Z

    if-eqz v2, :cond_45

    if-eqz v8, :cond_49

    invoke-virtual {v1}, Lb9/l0;->B()V

    :cond_49
    const/4 v5, 0x0

    iput-boolean v5, v1, Lb9/l0;->y0:Z

    invoke-virtual {v13}, Lb9/s0;->a()Lb9/q0;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v2, v2, Lb9/c1;->b:Ll9/c0;

    iget-object v2, v2, Ll9/c0;->a:Ljava/lang/Object;

    iget-object v3, v14, Lb9/q0;->g:Lb9/r0;

    iget-object v3, v3, Lb9/r0;->a:Ll9/c0;

    iget-object v3, v3, Ll9/c0;->a:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4a

    iget-object v2, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v2, v2, Lb9/c1;->b:Ll9/c0;

    iget v3, v2, Ll9/c0;->b:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_4a

    iget-object v3, v14, Lb9/q0;->g:Lb9/r0;

    iget-object v3, v3, Lb9/r0;->a:Ll9/c0;

    iget v5, v3, Ll9/c0;->b:I

    if-ne v5, v4, :cond_4a

    iget v2, v2, Ll9/c0;->e:I

    iget v3, v3, Ll9/c0;->e:I

    if-eq v2, v3, :cond_4a

    const/4 v8, 0x1

    goto :goto_2d

    :cond_4a
    const/4 v8, 0x0

    :goto_2d
    iget-object v2, v14, Lb9/q0;->g:Lb9/r0;

    iget-object v3, v2, Lb9/r0;->a:Ll9/c0;

    move-object v5, v3

    iget-wide v3, v2, Lb9/r0;->b:J

    iget-wide v9, v2, Lb9/r0;->c:J

    const/16 v17, 0x1

    xor-int/lit8 v2, v8, 0x1

    move-wide/from16 v48, v9

    move v9, v2

    move-object v2, v5

    move-wide/from16 v5, v48

    const/4 v10, 0x0

    move/from16 v22, v7

    move-wide v7, v3

    move/from16 v15, v22

    invoke-virtual/range {v1 .. v10}, Lb9/l0;->w(Ll9/c0;JJJZI)Lb9/c1;

    move-result-object v2

    iput-object v2, v1, Lb9/l0;->b0:Lb9/c1;

    invoke-virtual {v1}, Lb9/l0;->M()V

    invoke-virtual {v1}, Lb9/l0;->t0()V

    invoke-virtual {v1}, Lb9/l0;->d()Z

    move-result v2

    if-eqz v2, :cond_51

    iget-object v2, v13, Lb9/s0;->k:Lb9/q0;

    if-ne v14, v2, :cond_51

    array-length v2, v0

    const/4 v8, 0x0

    :goto_2e
    if-ge v8, v2, :cond_51

    aget-object v3, v0, v8

    iget v4, v3, Lb9/j1;->d:I

    const/4 v5, 0x4

    if-eq v4, v15, :cond_4c

    if-ne v4, v5, :cond_4b

    goto :goto_2f

    :cond_4b
    const/4 v6, 0x2

    if-ne v4, v6, :cond_50

    const/4 v4, 0x0

    iput v4, v3, Lb9/j1;->d:I

    goto :goto_33

    :cond_4c
    :goto_2f
    if-ne v4, v5, :cond_4d

    const/4 v4, 0x1

    goto :goto_30

    :cond_4d
    const/4 v4, 0x0

    :goto_30
    iget-object v5, v3, Lb9/j1;->e:Ljava/lang/Object;

    check-cast v5, Lb9/f;

    iget-object v6, v3, Lb9/j1;->f:Ljava/lang/Object;

    check-cast v6, Lb9/f;

    const/16 v7, 0x11

    if-eqz v4, :cond_4e

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v6, v7, v5}, Lb9/e1;->a(ILjava/lang/Object;)V

    goto :goto_31

    :cond_4e
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v5, v7, v6}, Lb9/e1;->a(ILjava/lang/Object;)V

    :goto_31
    iget v4, v3, Lb9/j1;->d:I

    const/4 v5, 0x4

    if-ne v4, v5, :cond_4f

    const/4 v4, 0x0

    goto :goto_32

    :cond_4f
    const/4 v4, 0x1

    :goto_32
    iput v4, v3, Lb9/j1;->d:I

    :cond_50
    :goto_33
    add-int/lit8 v8, v8, 0x1

    goto :goto_2e

    :cond_51
    iget-object v2, v1, Lb9/l0;->b0:Lb9/c1;

    iget v2, v2, Lb9/c1;->e:I

    if-ne v2, v15, :cond_52

    invoke-virtual {v1}, Lb9/l0;->m0()V

    :cond_52
    iget-object v2, v13, Lb9/s0;->i:Lb9/q0;

    iget-object v2, v2, Lb9/q0;->o:Lo9/v;

    const/4 v8, 0x0

    :goto_34
    array-length v3, v0

    if-ge v8, v3, :cond_57

    invoke-virtual {v2, v8}, Lo9/v;->b(I)Z

    move-result v3

    if-nez v3, :cond_53

    goto :goto_36

    :cond_53
    aget-object v3, v0, v8

    iget-object v4, v3, Lb9/j1;->f:Ljava/lang/Object;

    check-cast v4, Lb9/f;

    iget-object v3, v3, Lb9/j1;->e:Ljava/lang/Object;

    check-cast v3, Lb9/f;

    invoke-static {v3}, Lb9/j1;->h(Lb9/f;)Z

    move-result v5

    if-eqz v5, :cond_54

    invoke-virtual {v3}, Lb9/f;->h()V

    goto :goto_36

    :cond_54
    if-eqz v4, :cond_56

    iget v3, v4, Lb9/f;->H:I

    if-eqz v3, :cond_55

    const/4 v3, 0x1

    goto :goto_35

    :cond_55
    const/4 v3, 0x0

    :goto_35
    if-eqz v3, :cond_56

    invoke-virtual {v4}, Lb9/f;->h()V

    :cond_56
    :goto_36
    add-int/lit8 v8, v8, 0x1

    goto :goto_34

    :cond_57
    move v7, v15

    const/4 v8, 0x1

    const-wide v23, -0x7fffffffffffffffL    # -4.9E-324

    goto/16 :goto_2b

    :goto_37
    iget-object v0, v1, Lb9/l0;->w0:Lb9/q;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_38
    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget v0, v0, Lb9/c1;->e:I

    const/4 v9, 0x1

    if-eq v0, v9, :cond_90

    const/4 v5, 0x4

    if-ne v0, v5, :cond_58

    goto/16 :goto_56

    :cond_58
    iget-object v0, v1, Lb9/l0;->R:Lb9/s0;

    iget-object v0, v0, Lb9/s0;->i:Lb9/q0;

    if-nez v0, :cond_59

    invoke-virtual {v1, v11, v12}, Lb9/l0;->R(J)V

    return-void

    :cond_59
    const-string v2, "doSomeWork"

    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    invoke-virtual {v1}, Lb9/l0;->t0()V

    iget-boolean v2, v0, Lb9/q0;->e:Z

    if-eqz v2, :cond_66

    iget-object v2, v1, Lb9/l0;->P:Lx8/p;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    invoke-static {v2, v3}, Lx8/t;->J(J)J

    move-result-wide v2

    iput-wide v2, v1, Lb9/l0;->r0:J

    iget-object v2, v0, Lb9/q0;->a:Ljava/lang/Object;

    iget-object v3, v1, Lb9/l0;->b0:Lb9/c1;

    iget-wide v3, v3, Lb9/c1;->s:J

    iget-wide v5, v1, Lb9/l0;->M:J

    sub-long/2addr v3, v5

    invoke-interface {v2, v3, v4}, Ll9/a0;->i(J)V

    const/4 v2, 0x1

    const/4 v3, 0x1

    const/4 v8, 0x0

    :goto_39
    iget-object v4, v1, Lb9/l0;->w:[Lb9/j1;

    array-length v5, v4

    if-ge v8, v5, :cond_67

    aget-object v4, v4, v8

    invoke-virtual {v4}, Lb9/j1;->c()I

    move-result v5

    if-nez v5, :cond_5a

    const/4 v5, 0x0

    invoke-virtual {v1, v8, v5}, Lb9/l0;->D(IZ)V

    goto/16 :goto_41

    :cond_5a
    iget-wide v5, v1, Lb9/l0;->q0:J

    iget-wide v9, v1, Lb9/l0;->r0:J

    iget-object v7, v4, Lb9/j1;->f:Ljava/lang/Object;

    check-cast v7, Lb9/f;

    iget-object v13, v4, Lb9/j1;->e:Ljava/lang/Object;

    check-cast v13, Lb9/f;

    invoke-static {v13}, Lb9/j1;->h(Lb9/f;)Z

    move-result v14

    if-eqz v14, :cond_5b

    invoke-virtual {v13, v5, v6, v9, v10}, Lb9/f;->x(JJ)V

    :cond_5b
    if-eqz v7, :cond_5d

    iget v13, v7, Lb9/f;->H:I

    if-eqz v13, :cond_5c

    const/4 v13, 0x1

    goto :goto_3a

    :cond_5c
    const/4 v13, 0x0

    :goto_3a
    if-eqz v13, :cond_5d

    invoke-virtual {v7, v5, v6, v9, v10}, Lb9/f;->x(JJ)V

    :cond_5d
    if-eqz v2, :cond_61

    iget-object v2, v4, Lb9/j1;->f:Ljava/lang/Object;

    check-cast v2, Lb9/f;

    iget-object v5, v4, Lb9/j1;->e:Ljava/lang/Object;

    check-cast v5, Lb9/f;

    invoke-static {v5}, Lb9/j1;->h(Lb9/f;)Z

    move-result v6

    if-eqz v6, :cond_5e

    invoke-virtual {v5}, Lb9/f;->l()Z

    move-result v5

    goto :goto_3b

    :cond_5e
    const/4 v5, 0x1

    :goto_3b
    if-eqz v2, :cond_60

    iget v6, v2, Lb9/f;->H:I

    if-eqz v6, :cond_5f

    const/4 v6, 0x1

    goto :goto_3c

    :cond_5f
    const/4 v6, 0x0

    :goto_3c
    if-eqz v6, :cond_60

    invoke-virtual {v2}, Lb9/f;->l()Z

    move-result v2

    and-int/2addr v5, v2

    :cond_60
    if-eqz v5, :cond_61

    const/4 v2, 0x1

    goto :goto_3d

    :cond_61
    const/4 v2, 0x0

    :goto_3d
    invoke-virtual {v4, v0}, Lb9/j1;->d(Lb9/q0;)Lb9/f;

    move-result-object v4

    if-eqz v4, :cond_63

    invoke-virtual {v4}, Lb9/f;->k()Z

    move-result v5

    if-nez v5, :cond_63

    invoke-virtual {v4}, Lb9/f;->n()Z

    move-result v5

    if-nez v5, :cond_63

    invoke-virtual {v4}, Lb9/f;->l()Z

    move-result v4

    if-eqz v4, :cond_62

    goto :goto_3e

    :cond_62
    const/4 v4, 0x0

    goto :goto_3f

    :cond_63
    :goto_3e
    const/4 v4, 0x1

    :goto_3f
    invoke-virtual {v1, v8, v4}, Lb9/l0;->D(IZ)V

    if-eqz v3, :cond_64

    if-eqz v4, :cond_64

    const/4 v3, 0x1

    goto :goto_40

    :cond_64
    const/4 v3, 0x0

    :goto_40
    if-nez v4, :cond_65

    invoke-virtual {v1, v8}, Lb9/l0;->C(I)V

    :cond_65
    :goto_41
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_39

    :cond_66
    iget-object v2, v0, Lb9/q0;->a:Ljava/lang/Object;

    invoke-interface {v2}, Ll9/a0;->h()V

    const/4 v2, 0x1

    const/4 v3, 0x1

    :cond_67
    iget-object v4, v0, Lb9/q0;->g:Lb9/r0;

    iget-wide v4, v4, Lb9/r0;->e:J

    if-eqz v2, :cond_69

    iget-boolean v2, v0, Lb9/q0;->e:Z

    if-eqz v2, :cond_69

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v4, v6

    if-eqz v2, :cond_68

    iget-object v2, v1, Lb9/l0;->b0:Lb9/c1;

    iget-wide v8, v2, Lb9/c1;->s:J

    cmp-long v2, v4, v8

    if-gtz v2, :cond_6a

    :cond_68
    const/4 v8, 0x1

    goto :goto_42

    :cond_69
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    :cond_6a
    const/4 v8, 0x0

    :goto_42
    if-eqz v8, :cond_6b

    iget-boolean v2, v1, Lb9/l0;->f0:Z

    if-eqz v2, :cond_6b

    const/4 v5, 0x0

    iput-boolean v5, v1, Lb9/l0;->f0:Z

    iget-object v2, v1, Lb9/l0;->b0:Lb9/c1;

    iget v2, v2, Lb9/c1;->n:I

    iget-object v4, v1, Lb9/l0;->c0:Lab/y;

    invoke-virtual {v4, v5}, Lab/y;->c(I)V

    iget-object v4, v1, Lb9/l0;->Z:Lb9/e;

    iget-object v9, v1, Lb9/l0;->b0:Lb9/c1;

    iget v9, v9, Lb9/c1;->e:I

    invoke-virtual {v4, v9, v5}, Lb9/e;->d(IZ)I

    move-result v4

    const/4 v9, 0x5

    invoke-virtual {v1, v4, v2, v9, v5}, Lb9/l0;->s0(IIIZ)V

    :cond_6b
    if-eqz v8, :cond_6d

    iget-object v2, v0, Lb9/q0;->g:Lb9/r0;

    iget-boolean v2, v2, Lb9/r0;->j:Z

    if-eqz v2, :cond_6d

    const/4 v5, 0x4

    invoke-virtual {v1, v5}, Lb9/l0;->h0(I)V

    invoke-virtual {v1}, Lb9/l0;->o0()V

    :cond_6c
    const/4 v9, 0x1

    goto/16 :goto_4c

    :cond_6d
    iget-object v2, v1, Lb9/l0;->b0:Lb9/c1;

    iget v4, v2, Lb9/c1;->e:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_79

    iget-object v4, v1, Lb9/l0;->R:Lb9/s0;

    iget v5, v1, Lb9/l0;->o0:I

    if-nez v5, :cond_6e

    invoke-virtual {v1}, Lb9/l0;->y()Z

    move-result v8

    goto/16 :goto_48

    :cond_6e
    if-nez v3, :cond_70

    :cond_6f
    const/4 v8, 0x0

    goto/16 :goto_48

    :cond_70
    iget-boolean v5, v2, Lb9/c1;->g:Z

    if-nez v5, :cond_72

    :cond_71
    :goto_43
    const/4 v8, 0x1

    goto/16 :goto_48

    :cond_72
    iget-object v5, v4, Lb9/s0;->i:Lb9/q0;

    iget-object v2, v2, Lb9/c1;->a:Lu8/o0;

    iget-object v5, v5, Lb9/q0;->g:Lb9/r0;

    iget-object v5, v5, Lb9/r0;->a:Ll9/c0;

    invoke-virtual {v1, v2, v5}, Lb9/l0;->l0(Lu8/o0;Ll9/c0;)Z

    move-result v2

    if-eqz v2, :cond_73

    iget-object v2, v1, Lb9/l0;->T:Lb9/i;

    iget-wide v9, v2, Lb9/i;->i:J

    goto :goto_44

    :cond_73
    move-wide v9, v6

    :goto_44
    iget-object v2, v4, Lb9/s0;->l:Lb9/q0;

    invoke-virtual {v2}, Lb9/q0;->g()Z

    move-result v4

    if-eqz v4, :cond_74

    iget-object v4, v2, Lb9/q0;->g:Lb9/r0;

    iget-boolean v4, v4, Lb9/r0;->j:Z

    if-eqz v4, :cond_74

    const/4 v8, 0x1

    goto :goto_45

    :cond_74
    const/4 v8, 0x0

    :goto_45
    iget-object v4, v2, Lb9/q0;->g:Lb9/r0;

    iget-object v4, v4, Lb9/r0;->a:Ll9/c0;

    invoke-virtual {v4}, Ll9/c0;->b()Z

    move-result v4

    if-eqz v4, :cond_75

    iget-boolean v4, v2, Lb9/q0;->e:Z

    if-nez v4, :cond_75

    const/4 v4, 0x1

    goto :goto_46

    :cond_75
    const/4 v4, 0x0

    :goto_46
    if-nez v8, :cond_71

    if-eqz v4, :cond_76

    goto :goto_43

    :cond_76
    invoke-virtual {v2}, Lb9/q0;->d()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Lb9/l0;->n(J)J

    move-result-wide v4

    iget-object v2, v1, Lb9/l0;->F:Lb9/k;

    iget-object v8, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v8, v8, Lb9/c1;->a:Lu8/o0;

    iget-object v8, v1, Lb9/l0;->N:Lb9/l;

    invoke-virtual {v8}, Lb9/l;->b()Lu8/e0;

    move-result-object v8

    iget v8, v8, Lu8/e0;->a:F

    iget-object v13, v1, Lb9/l0;->b0:Lb9/c1;

    iget-boolean v13, v13, Lb9/c1;->l:Z

    iget-boolean v13, v1, Lb9/l0;->g0:Z

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v4, v5}, Lx8/t;->x(FJ)J

    move-result-wide v4

    if-eqz v13, :cond_77

    iget-wide v13, v2, Lb9/k;->e:J

    goto :goto_47

    :cond_77
    iget-wide v13, v2, Lb9/k;->d:J

    :goto_47
    cmp-long v8, v9, v6

    if-eqz v8, :cond_78

    const-wide/16 v21, 0x2

    div-long v9, v9, v21

    invoke-static {v9, v10, v13, v14}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v13

    :cond_78
    const-wide/16 v8, 0x0

    cmp-long v8, v13, v8

    if-lez v8, :cond_71

    cmp-long v4, v4, v13

    if-gez v4, :cond_71

    iget-object v4, v2, Lb9/k;->a:Lko/o;

    monitor-enter v4

    :try_start_0
    iget v5, v4, Lko/o;->e:I

    iget v8, v4, Lko/o;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    mul-int/2addr v5, v8

    monitor-exit v4

    invoke-virtual {v2}, Lb9/k;->b()I

    move-result v2

    if-lt v5, v2, :cond_6f

    goto/16 :goto_43

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :goto_48
    if-eqz v8, :cond_79

    invoke-virtual {v1, v15}, Lb9/l0;->h0(I)V

    const/4 v2, 0x0

    iput-object v2, v1, Lb9/l0;->u0:Landroidx/media3/exoplayer/ExoPlaybackException;

    invoke-virtual {v1}, Lb9/l0;->k0()Z

    move-result v2

    if-eqz v2, :cond_6c

    const/4 v5, 0x0

    invoke-virtual {v1, v5, v5}, Lb9/l0;->v0(ZZ)V

    iget-object v2, v1, Lb9/l0;->N:Lb9/l;

    const/4 v9, 0x1

    iput-boolean v9, v2, Lb9/l;->y:Z

    iget-object v2, v2, Lb9/l;->z:Ljava/lang/Object;

    check-cast v2, Lb9/l1;

    invoke-virtual {v2}, Lb9/l1;->g()V

    invoke-virtual {v1}, Lb9/l0;->m0()V

    goto :goto_4c

    :cond_79
    const/4 v9, 0x1

    iget-object v2, v1, Lb9/l0;->b0:Lb9/c1;

    iget v2, v2, Lb9/c1;->e:I

    if-ne v2, v15, :cond_82

    iget v2, v1, Lb9/l0;->o0:I

    if-nez v2, :cond_7a

    invoke-virtual {v1}, Lb9/l0;->y()Z

    move-result v2

    if-eqz v2, :cond_7b

    goto :goto_4c

    :cond_7a
    if-nez v3, :cond_82

    :cond_7b
    invoke-virtual {v1}, Lb9/l0;->k0()Z

    move-result v2

    const/4 v5, 0x0

    invoke-virtual {v1, v2, v5}, Lb9/l0;->v0(ZZ)V

    const/4 v5, 0x2

    invoke-virtual {v1, v5}, Lb9/l0;->h0(I)V

    iget-boolean v2, v1, Lb9/l0;->g0:Z

    if-eqz v2, :cond_81

    iget-object v2, v1, Lb9/l0;->R:Lb9/s0;

    iget-object v2, v2, Lb9/s0;->i:Lb9/q0;

    :goto_49
    if-eqz v2, :cond_7e

    iget-object v3, v2, Lb9/q0;->o:Lo9/v;

    iget-object v3, v3, Lo9/v;->c:[Lo9/s;

    array-length v4, v3

    const/4 v8, 0x0

    :goto_4a
    if-ge v8, v4, :cond_7d

    aget-object v5, v3, v8

    if-eqz v5, :cond_7c

    invoke-interface {v5}, Lo9/s;->p()V

    :cond_7c
    add-int/lit8 v8, v8, 0x1

    goto :goto_4a

    :cond_7d
    iget-object v2, v2, Lb9/q0;->m:Lb9/q0;

    goto :goto_49

    :cond_7e
    iget-object v2, v1, Lb9/l0;->T:Lb9/i;

    iget-wide v3, v2, Lb9/i;->i:J

    cmp-long v5, v3, v6

    if-nez v5, :cond_7f

    goto :goto_4b

    :cond_7f
    iget-wide v13, v2, Lb9/i;->c:J

    add-long/2addr v3, v13

    iput-wide v3, v2, Lb9/i;->i:J

    iget-wide v13, v2, Lb9/i;->h:J

    cmp-long v5, v13, v6

    if-eqz v5, :cond_80

    cmp-long v3, v3, v13

    if-lez v3, :cond_80

    iput-wide v13, v2, Lb9/i;->i:J

    :cond_80
    iput-wide v6, v2, Lb9/i;->m:J

    :cond_81
    :goto_4b
    invoke-virtual {v1}, Lb9/l0;->o0()V

    :cond_82
    :goto_4c
    iget-object v2, v1, Lb9/l0;->b0:Lb9/c1;

    iget v2, v2, Lb9/c1;->e:I

    const/4 v5, 0x2

    if-ne v2, v5, :cond_86

    const/4 v8, 0x0

    :goto_4d
    iget-object v2, v1, Lb9/l0;->w:[Lb9/j1;

    array-length v3, v2

    if-ge v8, v3, :cond_85

    aget-object v2, v2, v8

    invoke-virtual {v2, v0}, Lb9/j1;->d(Lb9/q0;)Lb9/f;

    move-result-object v2

    if-eqz v2, :cond_83

    move v2, v9

    goto :goto_4e

    :cond_83
    const/4 v2, 0x0

    :goto_4e
    if-eqz v2, :cond_84

    invoke-virtual {v1, v8}, Lb9/l0;->C(I)V

    :cond_84
    add-int/lit8 v8, v8, 0x1

    goto :goto_4d

    :cond_85
    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget-boolean v2, v0, Lb9/c1;->g:Z

    if-nez v2, :cond_86

    iget-wide v2, v0, Lb9/c1;->r:J

    const-wide/32 v4, 0x7a120

    cmp-long v0, v2, v4

    if-gez v0, :cond_86

    iget-object v0, v1, Lb9/l0;->R:Lb9/s0;

    iget-object v0, v0, Lb9/s0;->l:Lb9/q0;

    invoke-static {v0}, Lb9/l0;->x(Lb9/q0;)Z

    move-result v0

    if-eqz v0, :cond_86

    invoke-virtual {v1}, Lb9/l0;->k0()Z

    move-result v0

    if-eqz v0, :cond_86

    move v8, v9

    goto :goto_4f

    :cond_86
    const/4 v8, 0x0

    :goto_4f
    if-nez v8, :cond_87

    iput-wide v6, v1, Lb9/l0;->v0:J

    goto :goto_50

    :cond_87
    iget-wide v2, v1, Lb9/l0;->v0:J

    cmp-long v0, v2, v6

    if-nez v0, :cond_88

    iget-object v0, v1, Lb9/l0;->P:Lx8/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iput-wide v2, v1, Lb9/l0;->v0:J

    goto :goto_50

    :cond_88
    iget-object v0, v1, Lb9/l0;->P:Lx8/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, v1, Lb9/l0;->v0:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0xfa0

    cmp-long v0, v2, v4

    if-gez v0, :cond_8f

    :goto_50
    invoke-virtual {v1}, Lb9/l0;->k0()Z

    move-result v0

    if-eqz v0, :cond_89

    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget v0, v0, Lb9/c1;->e:I

    if-ne v0, v15, :cond_89

    move v8, v9

    goto :goto_51

    :cond_89
    const/4 v8, 0x0

    :goto_51
    iget-boolean v0, v1, Lb9/l0;->n0:Z

    if-eqz v0, :cond_8a

    iget-boolean v0, v1, Lb9/l0;->m0:Z

    if-eqz v0, :cond_8a

    if-eqz v8, :cond_8a

    goto :goto_52

    :cond_8a
    const/4 v9, 0x0

    :goto_52
    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget-boolean v2, v0, Lb9/c1;->p:Z

    if-eq v2, v9, :cond_8b

    new-instance v21, Lb9/c1;

    iget-object v2, v0, Lb9/c1;->a:Lu8/o0;

    iget-object v3, v0, Lb9/c1;->b:Ll9/c0;

    iget-wide v4, v0, Lb9/c1;->c:J

    iget-wide v6, v0, Lb9/c1;->d:J

    iget v10, v0, Lb9/c1;->e:I

    iget-object v13, v0, Lb9/c1;->f:Landroidx/media3/exoplayer/ExoPlaybackException;

    iget-boolean v14, v0, Lb9/c1;->g:Z

    iget-object v15, v0, Lb9/c1;->h:Ll9/g1;

    move-object/from16 v22, v2

    iget-object v2, v0, Lb9/c1;->i:Lo9/v;

    move-object/from16 v32, v2

    iget-object v2, v0, Lb9/c1;->j:Ljava/util/List;

    move-object/from16 v33, v2

    iget-object v2, v0, Lb9/c1;->k:Ll9/c0;

    move-object/from16 v34, v2

    iget-boolean v2, v0, Lb9/c1;->l:Z

    move/from16 v35, v2

    iget v2, v0, Lb9/c1;->m:I

    move/from16 v36, v2

    iget v2, v0, Lb9/c1;->n:I

    move/from16 v37, v2

    iget-object v2, v0, Lb9/c1;->o:Lu8/e0;

    move-object/from16 v38, v2

    move-object/from16 v23, v3

    iget-wide v2, v0, Lb9/c1;->q:J

    move-wide/from16 v39, v2

    iget-wide v2, v0, Lb9/c1;->r:J

    move-wide/from16 v41, v2

    iget-wide v2, v0, Lb9/c1;->s:J

    move-wide/from16 v43, v2

    iget-wide v2, v0, Lb9/c1;->t:J

    move-wide/from16 v45, v2

    move-wide/from16 v24, v4

    move-wide/from16 v26, v6

    move/from16 v47, v9

    move/from16 v28, v10

    move-object/from16 v29, v13

    move/from16 v30, v14

    move-object/from16 v31, v15

    invoke-direct/range {v21 .. v47}, Lb9/c1;-><init>(Lu8/o0;Ll9/c0;JJILandroidx/media3/exoplayer/ExoPlaybackException;ZLl9/g1;Lo9/v;Ljava/util/List;Ll9/c0;ZIILu8/e0;JJJJZ)V

    move-object/from16 v0, v21

    iput-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    :goto_53
    const/4 v5, 0x0

    goto :goto_54

    :cond_8b
    move/from16 v47, v9

    goto :goto_53

    :goto_54
    iput-boolean v5, v1, Lb9/l0;->m0:Z

    if-nez v47, :cond_8e

    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget v0, v0, Lb9/c1;->e:I

    const/4 v5, 0x4

    if-ne v0, v5, :cond_8c

    goto :goto_55

    :cond_8c
    if-nez v8, :cond_8d

    const/4 v5, 0x2

    if-eq v0, v5, :cond_8d

    const/4 v15, 0x3

    if-ne v0, v15, :cond_8e

    iget v0, v1, Lb9/l0;->o0:I

    if-eqz v0, :cond_8e

    :cond_8d
    invoke-virtual {v1, v11, v12}, Lb9/l0;->R(J)V

    :cond_8e
    :goto_55
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :cond_8f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Playback stuck buffering and not loading"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_90
    :goto_56
    return-void
.end method

.method public final h0(I)V
    .locals 3

    iget-object v0, p0, Lb9/l0;->b0:Lb9/c1;

    iget v1, v0, Lb9/c1;->e:I

    if-eq v1, p1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, p0, Lb9/l0;->v0:J

    :cond_0
    invoke-virtual {v0, p1}, Lb9/c1;->h(I)Lb9/c1;

    move-result-object p1

    iput-object p1, p0, Lb9/l0;->b0:Lb9/c1;

    :cond_1
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v11, "Playback error"

    const-string v12, "ExoPlayerImplInternal"

    const/4 v2, 0x2

    const/16 v3, 0x3e8

    const/4 v4, 0x4

    const/4 v13, 0x0

    const/4 v14, 0x1

    :try_start_0
    iget v5, v0, Landroid/os/Message;->what:I

    packed-switch v5, :pswitch_data_0

    :pswitch_0
    return v13

    :pswitch_1
    invoke-virtual {v1}, Lb9/l0;->p()V

    goto/16 :goto_11

    :catch_0
    move-exception v0

    goto/16 :goto_5

    :catch_1
    move-exception v0

    goto/16 :goto_6

    :catch_2
    move-exception v0

    goto/16 :goto_7

    :catch_3
    move-exception v0

    goto/16 :goto_8

    :catch_4
    move-exception v0

    goto/16 :goto_9

    :catch_5
    move-exception v0

    goto/16 :goto_c

    :catch_6
    move-exception v0

    goto/16 :goto_d

    :pswitch_2
    iget v0, v0, Landroid/os/Message;->arg1:I

    invoke-virtual {v1, v0}, Lb9/l0;->o(I)V

    goto/16 :goto_11

    :pswitch_3
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {v1, v0}, Lb9/l0;->j0(F)V

    goto/16 :goto_11

    :pswitch_4
    iget-object v5, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v5, Lu8/d;

    iget v0, v0, Landroid/os/Message;->arg1:I

    if-eqz v0, :cond_0

    move v0, v14

    goto :goto_0

    :cond_0
    move v0, v13

    :goto_0
    invoke-virtual {v1, v5, v0}, Lb9/l0;->X(Lu8/d;Z)V

    goto/16 :goto_11

    :pswitch_5
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/util/Pair;

    iget-object v5, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v5, v0}, Lb9/l0;->i0(Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    goto/16 :goto_11

    :pswitch_6
    invoke-virtual {v1}, Lb9/l0;->G()V

    goto/16 :goto_11

    :pswitch_7
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lb9/q;

    invoke-virtual {v1, v0}, Lb9/l0;->c0(Lb9/q;)V

    goto/16 :goto_11

    :pswitch_8
    iget v5, v0, Landroid/os/Message;->arg1:I

    iget v6, v0, Landroid/os/Message;->arg2:I

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-virtual {v1, v5, v6, v0}, Lb9/l0;->r0(IILjava/util/List;)V

    goto/16 :goto_11

    :pswitch_9
    invoke-virtual {v1}, Lb9/l0;->K()V

    invoke-virtual {v1, v14}, Lb9/l0;->S(Z)V

    goto/16 :goto_11

    :pswitch_a
    invoke-virtual {v1}, Lb9/l0;->e()V

    goto/16 :goto_11

    :pswitch_b
    iget v0, v0, Landroid/os/Message;->arg1:I

    if-eqz v0, :cond_1

    move v0, v14

    goto :goto_1

    :cond_1
    move v0, v13

    :goto_1
    invoke-virtual {v1, v0}, Lb9/l0;->a0(Z)V

    goto/16 :goto_11

    :pswitch_c
    invoke-virtual {v1}, Lb9/l0;->E()V

    goto/16 :goto_11

    :pswitch_d
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ll9/c1;

    invoke-virtual {v1, v0}, Lb9/l0;->g0(Ll9/c1;)V

    goto/16 :goto_11

    :pswitch_e
    iget v5, v0, Landroid/os/Message;->arg1:I

    iget v6, v0, Landroid/os/Message;->arg2:I

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ll9/c1;

    invoke-virtual {v1, v5, v6, v0}, Lb9/l0;->J(IILl9/c1;)V

    goto/16 :goto_11

    :pswitch_f
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v0}, Lr;->t(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lb9/l0;->F()V

    const/4 v0, 0x0

    throw v0

    :pswitch_10
    iget-object v5, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v5, Lb9/i0;

    iget v0, v0, Landroid/os/Message;->arg1:I

    invoke-virtual {v1, v5, v0}, Lb9/l0;->a(Lb9/i0;I)V

    goto/16 :goto_11

    :pswitch_11
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lb9/i0;

    invoke-virtual {v1, v0}, Lb9/l0;->Z(Lb9/i0;)V

    goto/16 :goto_11

    :pswitch_12
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lu8/e0;

    iget v5, v0, Lu8/e0;->a:F

    invoke-virtual {v1, v0, v5, v14, v13}, Lb9/l0;->v(Lu8/e0;FZZ)V

    goto/16 :goto_11

    :pswitch_13
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lb9/f1;

    invoke-virtual {v1, v0}, Lb9/l0;->W(Lb9/f1;)V

    goto/16 :goto_11

    :pswitch_14
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lb9/f1;

    invoke-virtual {v1, v0}, Lb9/l0;->V(Lb9/f1;)V

    goto/16 :goto_11

    :pswitch_15
    iget v5, v0, Landroid/os/Message;->arg1:I

    if-eqz v5, :cond_2

    move v5, v14

    goto :goto_2

    :cond_2
    move v5, v13

    :goto_2
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v5, v0}, Lb9/l0;->Y(ZLjava/util/concurrent/atomic/AtomicBoolean;)V

    goto/16 :goto_11

    :pswitch_16
    iget v0, v0, Landroid/os/Message;->arg1:I

    if-eqz v0, :cond_3

    move v0, v14

    goto :goto_3

    :cond_3
    move v0, v13

    :goto_3
    invoke-virtual {v1, v0}, Lb9/l0;->f0(Z)V

    goto/16 :goto_11

    :pswitch_17
    iget v0, v0, Landroid/os/Message;->arg1:I

    invoke-virtual {v1, v0}, Lb9/l0;->d0(I)V

    goto/16 :goto_11

    :pswitch_18
    invoke-virtual {v1}, Lb9/l0;->K()V

    goto/16 :goto_11

    :pswitch_19
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ll9/a0;

    invoke-virtual {v1, v0}, Lb9/l0;->q(Ll9/a0;)V

    goto/16 :goto_11

    :pswitch_1a
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ll9/a0;

    invoke-virtual {v1, v0}, Lb9/l0;->u(Ll9/a0;)V

    goto/16 :goto_11

    :pswitch_1b
    invoke-virtual {v1}, Lb9/l0;->H()V

    return v14

    :pswitch_1c
    invoke-virtual {v1, v13, v14}, Lb9/l0;->n0(ZZ)V

    goto/16 :goto_11

    :pswitch_1d
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lb9/k1;

    invoke-virtual {v1, v0}, Lb9/l0;->e0(Lb9/k1;)V

    goto/16 :goto_11

    :pswitch_1e
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lu8/e0;

    invoke-virtual {v1, v0}, Lb9/l0;->b0(Lu8/e0;)V

    goto/16 :goto_11

    :pswitch_1f
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lb9/k0;

    invoke-virtual {v1, v0}, Lb9/l0;->T(Lb9/k0;)V

    goto/16 :goto_11

    :pswitch_20
    invoke-virtual {v1}, Lb9/l0;->h()V

    goto/16 :goto_11

    :pswitch_21
    iget v5, v0, Landroid/os/Message;->arg1:I

    if-eqz v5, :cond_4

    move v5, v14

    goto :goto_4

    :cond_4
    move v5, v13

    :goto_4
    iget v0, v0, Landroid/os/Message;->arg2:I

    shr-int/lit8 v6, v0, 0x4

    and-int/lit8 v0, v0, 0xf

    iget-object v7, v1, Lb9/l0;->c0:Lab/y;

    invoke-virtual {v7, v14}, Lab/y;->c(I)V

    iget-object v7, v1, Lb9/l0;->Z:Lb9/e;

    iget-object v8, v1, Lb9/l0;->b0:Lb9/c1;

    iget v8, v8, Lb9/c1;->e:I

    invoke-virtual {v7, v8, v5}, Lb9/e;->d(IZ)I

    move-result v7

    invoke-virtual {v1, v7, v6, v0, v5}, Lb9/l0;->s0(IIIZ)V
    :try_end_0
    .catch Landroidx/media3/exoplayer/ExoPlaybackException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Landroidx/media3/common/ParserException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Landroidx/media3/datasource/DataSourceException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Landroidx/media3/exoplayer/source/BehindLiveWindowException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_11

    :goto_5
    instance-of v4, v0, Ljava/lang/IllegalStateException;

    if-nez v4, :cond_5

    instance-of v4, v0, Ljava/lang/IllegalArgumentException;

    if-eqz v4, :cond_6

    :cond_5
    const/16 v3, 0x3ec

    :cond_6
    new-instance v4, Landroidx/media3/exoplayer/ExoPlaybackException;

    invoke-direct {v4, v2, v0, v3}, Landroidx/media3/exoplayer/ExoPlaybackException;-><init>(ILjava/lang/Exception;I)V

    invoke-static {v12, v11, v4}, Lx8/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v1, v14, v13}, Lb9/l0;->n0(ZZ)V

    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    invoke-virtual {v0, v4}, Lb9/c1;->f(Landroidx/media3/exoplayer/ExoPlaybackException;)Lb9/c1;

    move-result-object v0

    iput-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    goto/16 :goto_11

    :goto_6
    const/16 v2, 0x7d0

    invoke-virtual {v1, v0, v2}, Lb9/l0;->r(Ljava/io/IOException;I)V

    goto/16 :goto_11

    :goto_7
    const/16 v2, 0x3ea

    invoke-virtual {v1, v0, v2}, Lb9/l0;->r(Ljava/io/IOException;I)V

    goto/16 :goto_11

    :goto_8
    iget v2, v0, Landroidx/media3/datasource/DataSourceException;->w:I

    invoke-virtual {v1, v0, v2}, Lb9/l0;->r(Ljava/io/IOException;I)V

    goto/16 :goto_11

    :goto_9
    iget-boolean v2, v0, Landroidx/media3/common/ParserException;->w:Z

    iget v5, v0, Landroidx/media3/common/ParserException;->x:I

    if-ne v5, v14, :cond_8

    if-eqz v2, :cond_7

    const/16 v2, 0xbb9

    :goto_a
    move v3, v2

    goto :goto_b

    :cond_7
    const/16 v2, 0xbbb

    goto :goto_a

    :cond_8
    if-ne v5, v4, :cond_a

    if-eqz v2, :cond_9

    const/16 v2, 0xbba

    goto :goto_a

    :cond_9
    const/16 v2, 0xbbc

    goto :goto_a

    :cond_a
    :goto_b
    invoke-virtual {v1, v0, v3}, Lb9/l0;->r(Ljava/io/IOException;I)V

    goto/16 :goto_11

    :goto_c
    iget v2, v0, Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;->w:I

    invoke-virtual {v1, v0, v2}, Lb9/l0;->r(Ljava/io/IOException;I)V

    goto/16 :goto_11

    :goto_d
    iget v3, v0, Landroidx/media3/exoplayer/ExoPlaybackException;->y:I

    iget-object v5, v1, Lb9/l0;->w:[Lb9/j1;

    iget-object v6, v1, Lb9/l0;->R:Lb9/s0;

    if-ne v3, v14, :cond_c

    iget-object v3, v6, Lb9/s0;->j:Lb9/q0;

    if-eqz v3, :cond_c

    array-length v7, v5

    iget v8, v0, Landroidx/media3/exoplayer/ExoPlaybackException;->E:I

    rem-int v7, v8, v7

    aget-object v7, v5, v7

    invoke-virtual {v7, v8}, Lb9/j1;->i(I)Z

    move-result v7

    if-eqz v7, :cond_b

    iget-object v7, v3, Lb9/q0;->m:Lb9/q0;

    if-eqz v7, :cond_b

    iget-object v3, v7, Lb9/q0;->g:Lb9/r0;

    iget-object v3, v3, Lb9/r0;->a:Ll9/c0;

    goto :goto_e

    :cond_b
    iget-object v3, v3, Lb9/q0;->g:Lb9/r0;

    iget-object v3, v3, Lb9/r0;->a:Ll9/c0;

    :goto_e
    invoke-virtual {v0, v3}, Landroidx/media3/exoplayer/ExoPlaybackException;->a(Ll9/c0;)Landroidx/media3/exoplayer/ExoPlaybackException;

    move-result-object v0

    :cond_c
    iget v3, v0, Landroidx/media3/exoplayer/ExoPlaybackException;->y:I

    iget-object v15, v1, Lb9/l0;->H:Lx8/r;

    if-ne v3, v14, :cond_e

    iget v3, v0, Landroidx/media3/exoplayer/ExoPlaybackException;->E:I

    array-length v7, v5

    rem-int v7, v3, v7

    aget-object v5, v5, v7

    invoke-virtual {v5, v3}, Lb9/j1;->i(I)Z

    move-result v3

    if-eqz v3, :cond_e

    iput-boolean v14, v1, Lb9/l0;->y0:Z

    invoke-virtual {v1}, Lb9/l0;->f()V

    invoke-virtual {v6}, Lb9/s0;->g()Lb9/q0;

    move-result-object v0

    iget-object v3, v6, Lb9/s0;->i:Lb9/q0;

    if-eq v3, v0, :cond_d

    :goto_f
    if-eqz v3, :cond_d

    iget-object v5, v3, Lb9/q0;->m:Lb9/q0;

    if-eq v5, v0, :cond_d

    move-object v3, v5

    goto :goto_f

    :cond_d
    invoke-virtual {v6, v3}, Lb9/s0;->n(Lb9/q0;)I

    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget v0, v0, Lb9/c1;->e:I

    if-eq v0, v4, :cond_15

    invoke-virtual {v1}, Lb9/l0;->z()V

    invoke-virtual {v15, v2}, Lx8/r;->e(I)Z

    goto/16 :goto_11

    :cond_e
    iget-object v2, v1, Lb9/l0;->u0:Landroidx/media3/exoplayer/ExoPlaybackException;

    if-eqz v2, :cond_f

    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    iget-object v0, v1, Lb9/l0;->u0:Landroidx/media3/exoplayer/ExoPlaybackException;

    :cond_f
    iget v2, v0, Landroidx/media3/exoplayer/ExoPlaybackException;->y:I

    if-ne v2, v14, :cond_11

    iget-object v2, v6, Lb9/s0;->i:Lb9/q0;

    iget-object v3, v6, Lb9/s0;->j:Lb9/q0;

    if-eq v2, v3, :cond_11

    :goto_10
    iget-object v2, v6, Lb9/s0;->i:Lb9/q0;

    iget-object v3, v6, Lb9/s0;->j:Lb9/q0;

    if-eq v2, v3, :cond_10

    invoke-virtual {v6}, Lb9/s0;->a()Lb9/q0;

    goto :goto_10

    :cond_10
    invoke-static {v2}, Lva3/g;->g(Lb9/q0;)V

    invoke-virtual {v1}, Lb9/l0;->B()V

    iget-object v2, v2, Lb9/q0;->g:Lb9/r0;

    iget-object v3, v2, Lb9/r0;->a:Ll9/c0;

    move-object v5, v3

    iget-wide v3, v2, Lb9/r0;->b:J

    iget-wide v6, v2, Lb9/r0;->c:J

    const/4 v9, 0x1

    const/4 v10, 0x0

    move-object v2, v5

    move-wide v5, v6

    move-wide v7, v3

    invoke-virtual/range {v1 .. v10}, Lb9/l0;->w(Ll9/c0;JJJZI)Lb9/c1;

    move-result-object v2

    iput-object v2, v1, Lb9/l0;->b0:Lb9/c1;

    :cond_11
    iget-boolean v2, v0, Landroidx/media3/exoplayer/ExoPlaybackException;->I:Z

    if-eqz v2, :cond_14

    iget-object v2, v1, Lb9/l0;->u0:Landroidx/media3/exoplayer/ExoPlaybackException;

    if-eqz v2, :cond_12

    iget v2, v0, Landroidx/media3/common/PlaybackException;->w:I

    const/16 v3, 0x138c

    if-eq v2, v3, :cond_12

    const/16 v3, 0x138b

    if-ne v2, v3, :cond_14

    :cond_12
    const-string v2, "Recoverable renderer error"

    invoke-static {v12, v2, v0}, Lx8/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v2, v1, Lb9/l0;->u0:Landroidx/media3/exoplayer/ExoPlaybackException;

    if-nez v2, :cond_13

    iput-object v0, v1, Lb9/l0;->u0:Landroidx/media3/exoplayer/ExoPlaybackException;

    :cond_13
    const/16 v2, 0x19

    invoke-virtual {v15, v2, v0}, Lx8/r;->a(ILjava/lang/Object;)Lx8/q;

    move-result-object v0

    iget-object v2, v15, Lx8/r;->a:Landroid/os/Handler;

    iget-object v3, v0, Lx8/q;->a:Landroid/os/Message;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v3}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    invoke-virtual {v0}, Lx8/q;->a()V

    goto :goto_11

    :cond_14
    invoke-static {v12, v11, v0}, Lx8/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v1, v14, v13}, Lb9/l0;->n0(ZZ)V

    iget-object v2, v1, Lb9/l0;->b0:Lb9/c1;

    invoke-virtual {v2, v0}, Lb9/c1;->f(Landroidx/media3/exoplayer/ExoPlaybackException;)Lb9/c1;

    move-result-object v0

    iput-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    :cond_15
    :goto_11
    invoke-virtual {v1}, Lb9/l0;->B()V

    return v14

    nop

    :pswitch_data_0
    .packed-switch 0x1
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
        :pswitch_0
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
    .end packed-switch
.end method

.method public final i(Lb9/q0;IZJ)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lb9/l0;->w:[Lb9/j1;

    aget-object v10, v2, p2

    invoke-virtual {v10}, Lb9/j1;->g()Z

    move-result v2

    iget-object v3, v10, Lb9/j1;->e:Ljava/lang/Object;

    check-cast v3, Lb9/f;

    if-eqz v2, :cond_0

    goto/16 :goto_a

    :cond_0
    iget-object v2, v0, Lb9/l0;->R:Lb9/s0;

    iget-object v2, v2, Lb9/s0;->i:Lb9/q0;

    const/4 v4, 0x1

    if-ne v1, v2, :cond_1

    move v12, v4

    goto :goto_0

    :cond_1
    const/4 v12, 0x0

    :goto_0
    iget-object v2, v1, Lb9/q0;->o:Lo9/v;

    iget-object v5, v2, Lo9/v;->b:[Lb9/i1;

    aget-object v5, v5, p2

    iget-object v2, v2, Lo9/v;->c:[Lo9/s;

    aget-object v2, v2, p2

    invoke-virtual {v0}, Lb9/l0;->k0()Z

    move-result v6

    if-eqz v6, :cond_2

    iget-object v6, v0, Lb9/l0;->b0:Lb9/c1;

    iget v6, v6, Lb9/c1;->e:I

    const/4 v7, 0x3

    if-ne v6, v7, :cond_2

    move v13, v4

    goto :goto_1

    :cond_2
    const/4 v13, 0x0

    :goto_1
    if-nez p3, :cond_3

    if-eqz v13, :cond_3

    move v14, v4

    goto :goto_2

    :cond_3
    const/4 v14, 0x0

    :goto_2
    iget v6, v0, Lb9/l0;->o0:I

    add-int/2addr v6, v4

    iput v6, v0, Lb9/l0;->o0:I

    iget-object v6, v1, Lb9/q0;->c:[Ll9/z0;

    aget-object v6, v6, p2

    iget-wide v7, v1, Lb9/q0;->p:J

    iget-object v9, v1, Lb9/q0;->g:Lb9/r0;

    iget-object v9, v9, Lb9/r0;->a:Ll9/c0;

    iget-object v15, v10, Lb9/j1;->f:Ljava/lang/Object;

    check-cast v15, Lb9/f;

    if-eqz v2, :cond_4

    invoke-interface {v2}, Lo9/s;->length()I

    move-result v16

    move/from16 v11, v16

    :goto_3
    move-object/from16 v17, v3

    goto :goto_4

    :cond_4
    const/4 v11, 0x0

    goto :goto_3

    :goto_4
    new-array v3, v11, [Lu8/p;

    const/4 v4, 0x0

    :goto_5
    if-ge v4, v11, :cond_5

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v2, v4}, Lo9/s;->d(I)Lu8/p;

    move-result-object v18

    aput-object v18, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_5
    iget v2, v10, Lb9/j1;->d:I

    iget-object v11, v0, Lb9/l0;->N:Lb9/l;

    if-eqz v2, :cond_6

    const/4 v4, 0x2

    if-eq v2, v4, :cond_6

    const/4 v4, 0x4

    if-ne v2, v4, :cond_7

    :cond_6
    move-object v4, v6

    const/4 v2, 0x1

    goto :goto_7

    :cond_7
    const/4 v2, 0x1

    iput-boolean v2, v10, Lb9/j1;->b:Z

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v4, v15, Lb9/f;->H:I

    if-nez v4, :cond_8

    move v4, v2

    goto :goto_6

    :cond_8
    const/4 v4, 0x0

    :goto_6
    invoke-static {v4}, Lva3/g;->i(Z)V

    iput-object v5, v15, Lb9/f;->z:Lb9/i1;

    iput v2, v15, Lb9/f;->H:I

    invoke-virtual {v15, v14, v12}, Lb9/f;->p(ZZ)V

    move-object v4, v6

    move-object v2, v15

    move-wide/from16 v5, p4

    invoke-virtual/range {v2 .. v9}, Lb9/f;->y([Lu8/p;Ll9/z0;JJLl9/c0;)V

    move-wide v3, v5

    const/4 v5, 0x0

    iput-boolean v5, v2, Lb9/f;->N:Z

    iput-wide v3, v2, Lb9/f;->L:J

    iput-wide v3, v2, Lb9/f;->M:J

    invoke-virtual {v2, v3, v4, v14}, Lb9/f;->q(JZ)V

    invoke-virtual {v11, v2}, Lb9/l;->a(Lb9/f;)V

    goto :goto_9

    :goto_7
    iput-boolean v2, v10, Lb9/j1;->a:Z

    move-object/from16 v6, v17

    iget v15, v6, Lb9/f;->H:I

    if-nez v15, :cond_9

    move v15, v2

    goto :goto_8

    :cond_9
    const/4 v15, 0x0

    :goto_8
    invoke-static {v15}, Lva3/g;->i(Z)V

    iput-object v5, v6, Lb9/f;->z:Lb9/i1;

    iput v2, v6, Lb9/f;->H:I

    invoke-virtual {v6, v14, v12}, Lb9/f;->p(ZZ)V

    move-object v2, v6

    move-wide/from16 v5, p4

    invoke-virtual/range {v2 .. v9}, Lb9/f;->y([Lu8/p;Ll9/z0;JJLl9/c0;)V

    const/4 v3, 0x0

    iput-boolean v3, v2, Lb9/f;->N:Z

    iput-wide v5, v2, Lb9/f;->L:J

    iput-wide v5, v2, Lb9/f;->M:J

    invoke-virtual {v2, v5, v6, v14}, Lb9/f;->q(JZ)V

    invoke-virtual {v11, v2}, Lb9/l;->a(Lb9/f;)V

    :goto_9
    new-instance v2, Lb9/h0;

    invoke-direct {v2, v0}, Lb9/h0;-><init>(Lb9/l0;)V

    invoke-virtual {v10, v1}, Lb9/j1;->d(Lb9/q0;)Lb9/f;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v3, 0xb

    invoke-interface {v1, v3, v2}, Lb9/e1;->a(ILjava/lang/Object;)V

    if-eqz v13, :cond_a

    if-eqz v12, :cond_a

    invoke-virtual {v10}, Lb9/j1;->n()V

    :cond_a
    :goto_a
    return-void
.end method

.method public final i0(Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 8

    iget-object v0, p0, Lb9/l0;->w:[Lb9/j1;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x2

    const/4 v4, 0x1

    if-ge v2, v1, :cond_3

    aget-object v5, v0, v2

    iget-object v6, v5, Lb9/j1;->e:Ljava/lang/Object;

    check-cast v6, Lb9/f;

    iget v7, v6, Lb9/f;->x:I

    if-eq v7, v3, :cond_0

    goto :goto_2

    :cond_0
    iget v3, v5, Lb9/j1;->d:I

    const/4 v7, 0x4

    if-eq v3, v7, :cond_2

    if-ne v3, v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v6, v4, p1}, Lb9/e1;->a(ILjava/lang/Object;)V

    goto :goto_2

    :cond_2
    :goto_1
    iget-object v3, v5, Lb9/j1;->f:Ljava/lang/Object;

    check-cast v3, Lb9/f;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v3, v4, p1}, Lb9/e1;->a(ILjava/lang/Object;)V

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lb9/l0;->b0:Lb9/c1;

    iget p1, p1, Lb9/c1;->e:I

    const/4 v0, 0x3

    if-eq p1, v0, :cond_4

    if-ne p1, v3, :cond_5

    :cond_4
    iget-object p1, p0, Lb9/l0;->H:Lx8/r;

    invoke-virtual {p1, v3}, Lx8/r;->e(I)Z

    :cond_5
    if-eqz p2, :cond_6

    monitor-enter p0

    :try_start_0
    invoke-virtual {p2, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_6
    return-void
.end method

.method public final j([ZJ)V
    .locals 8

    iget-object v0, p0, Lb9/l0;->R:Lb9/s0;

    iget-object v2, v0, Lb9/s0;->j:Lb9/q0;

    iget-object v0, v2, Lb9/q0;->o:Lo9/v;

    const/4 v1, 0x0

    move v3, v1

    :goto_0
    iget-object v7, p0, Lb9/l0;->w:[Lb9/j1;

    array-length v4, v7

    if-ge v3, v4, :cond_1

    invoke-virtual {v0, v3}, Lo9/v;->b(I)Z

    move-result v4

    if-nez v4, :cond_0

    aget-object v4, v7, v3

    invoke-virtual {v4}, Lb9/j1;->l()V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move v3, v1

    :goto_1
    array-length v1, v7

    if-ge v3, v1, :cond_4

    invoke-virtual {v0, v3}, Lo9/v;->b(I)Z

    move-result v1

    if-eqz v1, :cond_2

    aget-object v1, v7, v3

    invoke-virtual {v1, v2}, Lb9/j1;->d(Lb9/q0;)Lb9/f;

    move-result-object v1

    if-eqz v1, :cond_3

    :cond_2
    move-wide v5, p2

    goto :goto_2

    :cond_3
    aget-boolean v4, p1, v3

    move-object v1, p0

    move-wide v5, p2

    invoke-virtual/range {v1 .. v6}, Lb9/l0;->i(Lb9/q0;IZJ)V

    :goto_2
    add-int/lit8 v3, v3, 0x1

    move-wide p2, v5

    goto :goto_1

    :cond_4
    return-void
.end method

.method public final j0(F)V
    .locals 7

    iput p1, p0, Lb9/l0;->z0:F

    iget-object v0, p0, Lb9/l0;->Z:Lb9/e;

    iget v0, v0, Lb9/e;->g:F

    mul-float/2addr p1, v0

    iget-object v0, p0, Lb9/l0;->w:[Lb9/j1;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    iget-object v4, v3, Lb9/j1;->e:Ljava/lang/Object;

    check-cast v4, Lb9/f;

    iget v5, v4, Lb9/f;->x:I

    const/4 v6, 0x1

    if-eq v5, v6, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    const/4 v6, 0x2

    invoke-interface {v4, v6, v5}, Lb9/e1;->a(ILjava/lang/Object;)V

    iget-object v3, v3, Lb9/j1;->f:Ljava/lang/Object;

    check-cast v3, Lb9/f;

    if-eqz v3, :cond_1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-interface {v3, v6, v4}, Lb9/e1;->a(ILjava/lang/Object;)V

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final k(Lu8/o0;Ljava/lang/Object;J)J
    .locals 4

    iget-object v0, p0, Lb9/l0;->L:Lu8/m0;

    invoke-virtual {p1, p2, v0}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    move-result-object p2

    iget p2, p2, Lu8/m0;->c:I

    iget-object v1, p0, Lb9/l0;->K:Lu8/n0;

    invoke-virtual {p1, p2, v1}, Lu8/o0;->n(ILu8/n0;)V

    iget-wide p1, v1, Lu8/n0;->f:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p1, v2

    if-eqz p1, :cond_1

    invoke-virtual {v1}, Lu8/n0;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-boolean p1, v1, Lu8/n0;->i:Z

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-wide p1, v1, Lu8/n0;->g:J

    invoke-static {p1, p2}, Lx8/t;->v(J)J

    move-result-wide p1

    iget-wide v1, v1, Lu8/n0;->f:J

    sub-long/2addr p1, v1

    invoke-static {p1, p2}, Lx8/t;->J(J)J

    move-result-wide p1

    iget-wide v0, v0, Lu8/m0;->e:J

    add-long/2addr p3, v0

    sub-long/2addr p1, p3

    return-wide p1

    :cond_1
    :goto_0
    return-wide v2
.end method

.method public final k0()Z
    .locals 2

    iget-object v0, p0, Lb9/l0;->b0:Lb9/c1;

    iget-boolean v1, v0, Lb9/c1;->l:Z

    if-eqz v1, :cond_0

    iget v0, v0, Lb9/c1;->n:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final l(Lb9/q0;)J
    .locals 8

    if-nez p1, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    iget-wide v0, p1, Lb9/q0;->p:J

    iget-boolean v2, p1, Lb9/q0;->e:Z

    if-nez v2, :cond_1

    return-wide v0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lb9/l0;->w:[Lb9/j1;

    array-length v4, v3

    if-ge v2, v4, :cond_4

    aget-object v4, v3, v2

    invoke-virtual {v4, p1}, Lb9/j1;->d(Lb9/q0;)Lb9/f;

    move-result-object v4

    if-eqz v4, :cond_3

    aget-object v3, v3, v2

    invoke-virtual {v3, p1}, Lb9/j1;->d(Lb9/q0;)Lb9/f;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v3, v3, Lb9/f;->M:J

    const-wide/high16 v5, -0x8000000000000000L

    cmp-long v7, v3, v5

    if-nez v7, :cond_2

    return-wide v5

    :cond_2
    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return-wide v0
.end method

.method public final l0(Lu8/o0;Ll9/c0;)Z
    .locals 2

    invoke-virtual {p2}, Ll9/c0;->b()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lu8/o0;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p2, Ll9/c0;->a:Ljava/lang/Object;

    iget-object v0, p0, Lb9/l0;->L:Lu8/m0;

    invoke-virtual {p1, p2, v0}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    move-result-object p2

    iget p2, p2, Lu8/m0;->c:I

    iget-object v0, p0, Lb9/l0;->K:Lu8/n0;

    invoke-virtual {p1, p2, v0}, Lu8/o0;->n(ILu8/n0;)V

    invoke-virtual {v0}, Lu8/n0;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-boolean p1, v0, Lu8/n0;->i:Z

    if-eqz p1, :cond_1

    iget-wide p1, v0, Lu8/n0;->f:J

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

.method public final m(Lu8/o0;)Landroid/util/Pair;
    .locals 9

    invoke-virtual {p1}, Lu8/o0;->p()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    sget-object p1, Lb9/c1;->u:Ll9/c0;

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1

    :cond_0
    iget-boolean v0, p0, Lb9/l0;->k0:Z

    invoke-virtual {p1, v0}, Lu8/o0;->a(Z)I

    move-result v6

    iget-object v5, p0, Lb9/l0;->L:Lu8/m0;

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    iget-object v4, p0, Lb9/l0;->K:Lu8/n0;

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lu8/o0;->i(Lu8/n0;Lu8/m0;IJ)Landroid/util/Pair;

    move-result-object p1

    iget-object v0, p0, Lb9/l0;->R:Lb9/s0;

    iget-object v4, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v0, v3, v4, v1, v2}, Lb9/s0;->p(Lu8/o0;Ljava/lang/Object;J)Ll9/c0;

    move-result-object v0

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v0}, Ll9/c0;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, v0, Ll9/c0;->a:Ljava/lang/Object;

    iget-object v4, p0, Lb9/l0;->L:Lu8/m0;

    invoke-virtual {v3, p1, v4}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    iget p1, v0, Ll9/c0;->c:I

    iget v3, v0, Ll9/c0;->b:I

    invoke-virtual {v4, v3}, Lu8/m0;->e(I)I

    move-result v3

    if-ne p1, v3, :cond_2

    iget-object p1, v4, Lu8/m0;->g:Lu8/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    move-wide v1, v4

    :cond_2
    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method public final m0()V
    .locals 4

    iget-object v0, p0, Lb9/l0;->R:Lb9/s0;

    iget-object v0, v0, Lb9/s0;->i:Lb9/q0;

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, v0, Lb9/q0;->o:Lo9/v;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lb9/l0;->w:[Lb9/j1;

    array-length v3, v2

    if-ge v1, v3, :cond_2

    invoke-virtual {v0, v1}, Lo9/v;->b(I)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    aget-object v2, v2, v1

    invoke-virtual {v2}, Lb9/j1;->n()V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    return-void
.end method

.method public final n(J)J
    .locals 7

    iget-object v0, p0, Lb9/l0;->R:Lb9/s0;

    iget-object v0, v0, Lb9/s0;->l:Lb9/q0;

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    return-wide v1

    :cond_0
    iget-wide v3, p0, Lb9/l0;->q0:J

    iget-wide v5, v0, Lb9/q0;->p:J

    sub-long/2addr v3, v5

    sub-long/2addr p1, v3

    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final n0(ZZ)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lb9/l0;->l0:Z

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move p1, v0

    goto :goto_1

    :cond_1
    :goto_0
    move p1, v1

    :goto_1
    invoke-virtual {p0, p1, v0, v1, v0}, Lb9/l0;->L(ZZZZ)V

    iget-object p1, p0, Lb9/l0;->c0:Lab/y;

    invoke-virtual {p1, p2}, Lab/y;->c(I)V

    iget-object p1, p0, Lb9/l0;->F:Lb9/k;

    iget-object p2, p1, Lb9/k;->h:Ljava/util/HashMap;

    iget-object v0, p0, Lb9/l0;->V:Lc9/n;

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lb9/k;->d()V

    :cond_2
    iget-object p1, p0, Lb9/l0;->b0:Lb9/c1;

    iget-boolean p1, p1, Lb9/c1;->l:Z

    iget-object p2, p0, Lb9/l0;->Z:Lb9/e;

    invoke-virtual {p2, v1, p1}, Lb9/e;->d(IZ)I

    invoke-virtual {p0, v1}, Lb9/l0;->h0(I)V

    return-void
.end method

.method public final o(I)V
    .locals 3

    iget-object v0, p0, Lb9/l0;->b0:Lb9/c1;

    iget-boolean v1, v0, Lb9/c1;->l:Z

    iget v2, v0, Lb9/c1;->n:I

    iget v0, v0, Lb9/c1;->m:I

    invoke-virtual {p0, p1, v2, v0, v1}, Lb9/l0;->s0(IIIZ)V

    return-void
.end method

.method public final o0()V
    .locals 6

    iget-object v0, p0, Lb9/l0;->N:Lb9/l;

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
    iget-object v0, p0, Lb9/l0;->w:[Lb9/j1;

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_3

    aget-object v3, v0, v1

    iget-object v4, v3, Lb9/j1;->f:Ljava/lang/Object;

    check-cast v4, Lb9/f;

    iget-object v3, v3, Lb9/j1;->e:Ljava/lang/Object;

    check-cast v3, Lb9/f;

    invoke-static {v3}, Lb9/j1;->h(Lb9/f;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-static {v3}, Lb9/j1;->b(Lb9/f;)V

    :cond_1
    if-eqz v4, :cond_2

    iget v3, v4, Lb9/f;->H:I

    if-eqz v3, :cond_2

    invoke-static {v4}, Lb9/j1;->b(Lb9/f;)V

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final p()V
    .locals 1

    iget v0, p0, Lb9/l0;->z0:F

    invoke-virtual {p0, v0}, Lb9/l0;->j0(F)V

    return-void
.end method

.method public final p0()V
    .locals 3

    iget-object v0, p0, Lb9/l0;->R:Lb9/s0;

    iget-object v0, v0, Lb9/s0;->l:Lb9/q0;

    iget-boolean v1, p0, Lb9/l0;->i0:Z

    if-nez v1, :cond_1

    if-eqz v0, :cond_0

    iget-object v0, v0, Lb9/q0;->a:Ljava/lang/Object;

    invoke-interface {v0}, Ll9/b1;->a()Z

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
    iget-object v1, p0, Lb9/l0;->b0:Lb9/c1;

    iget-boolean v2, v1, Lb9/c1;->g:Z

    if-eq v0, v2, :cond_2

    invoke-virtual {v1, v0}, Lb9/c1;->b(Z)Lb9/c1;

    move-result-object v0

    iput-object v0, p0, Lb9/l0;->b0:Lb9/c1;

    :cond_2
    return-void
.end method

.method public final q(Ll9/a0;)V
    .locals 3

    iget-object v0, p0, Lb9/l0;->R:Lb9/s0;

    iget-object v1, v0, Lb9/s0;->l:Lb9/q0;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lb9/q0;->a:Ljava/lang/Object;

    if-ne v1, p1, :cond_0

    iget-wide v1, p0, Lb9/l0;->q0:J

    invoke-virtual {v0, v1, v2}, Lb9/s0;->m(J)V

    invoke-virtual {p0}, Lb9/l0;->z()V

    return-void

    :cond_0
    iget-object v0, v0, Lb9/s0;->m:Lb9/q0;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lb9/q0;->a:Ljava/lang/Object;

    if-ne v0, p1, :cond_1

    invoke-virtual {p0}, Lb9/l0;->A()V

    :cond_1
    return-void
.end method

.method public final q0(Lo9/v;)V
    .locals 9

    iget-object v0, p0, Lb9/l0;->R:Lb9/s0;

    iget-object v0, v0, Lb9/s0;->l:Lb9/q0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Lb9/q0;->d()J

    move-result-wide v1

    invoke-virtual {p0, v1, v2}, Lb9/l0;->n(J)J

    iget-object v1, p0, Lb9/l0;->b0:Lb9/c1;

    iget-object v1, v1, Lb9/c1;->a:Lu8/o0;

    iget-object v0, v0, Lb9/q0;->g:Lb9/r0;

    iget-object v0, v0, Lb9/r0;->a:Ll9/c0;

    invoke-virtual {p0, v1, v0}, Lb9/l0;->l0(Lu8/o0;Ll9/c0;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb9/l0;->T:Lb9/i;

    iget-wide v0, v0, Lb9/i;->i:J

    :cond_0
    iget-object v0, p0, Lb9/l0;->b0:Lb9/c1;

    iget-object v0, v0, Lb9/c1;->a:Lu8/o0;

    iget-object v0, p0, Lb9/l0;->N:Lb9/l;

    invoke-virtual {v0}, Lb9/l;->b()Lu8/e0;

    move-result-object v0

    iget v0, v0, Lu8/e0;->a:F

    iget-object v0, p0, Lb9/l0;->b0:Lb9/c1;

    iget-boolean v0, v0, Lb9/c1;->l:Z

    iget-object p1, p1, Lo9/v;->c:[Lo9/s;

    iget-object v0, p0, Lb9/l0;->F:Lb9/k;

    iget-object v1, v0, Lb9/k;->h:Ljava/util/HashMap;

    iget-object v2, p0, Lb9/l0;->V:Lc9/n;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb9/j;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v2, v0, Lb9/k;->f:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_3

    array-length v2, p1

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    const/high16 v6, 0xc80000

    if-ge v4, v2, :cond_2

    aget-object v7, p1, v4

    if-eqz v7, :cond_1

    invoke-interface {v7}, Lo9/s;->j()Lu8/p0;

    move-result-object v7

    iget v7, v7, Lu8/p0;->c:I

    const/high16 v8, 0x20000

    packed-switch v7, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    move v6, v8

    goto :goto_1

    :pswitch_1
    const/high16 v6, 0x7d00000

    goto :goto_1

    :pswitch_2
    const/high16 v6, 0x89a0000

    goto :goto_1

    :pswitch_3
    move v6, v3

    :goto_1
    :pswitch_4
    add-int/2addr v5, v6

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    move-result v2

    :cond_3
    iput v2, v1, Lb9/j;->b:I

    invoke-virtual {v0}, Lb9/k;->d()V

    return-void

    :pswitch_data_0
    .packed-switch -0x2
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_4
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/io/IOException;I)V
    .locals 2

    new-instance v0, Landroidx/media3/exoplayer/ExoPlaybackException;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1, p2}, Landroidx/media3/exoplayer/ExoPlaybackException;-><init>(ILjava/lang/Exception;I)V

    iget-object p1, p0, Lb9/l0;->R:Lb9/s0;

    iget-object p1, p1, Lb9/s0;->i:Lb9/q0;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lb9/q0;->g:Lb9/r0;

    iget-object p1, p1, Lb9/r0;->a:Ll9/c0;

    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/ExoPlaybackException;->a(Ll9/c0;)Landroidx/media3/exoplayer/ExoPlaybackException;

    move-result-object v0

    :cond_0
    const-string p1, "ExoPlayerImplInternal"

    const-string p2, "Playback error"

    invoke-static {p1, p2, v0}, Lx8/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v1, v1}, Lb9/l0;->n0(ZZ)V

    iget-object p1, p0, Lb9/l0;->b0:Lb9/c1;

    invoke-virtual {p1, v0}, Lb9/c1;->f(Landroidx/media3/exoplayer/ExoPlaybackException;)Lb9/c1;

    move-result-object p1

    iput-object p1, p0, Lb9/l0;->b0:Lb9/c1;

    return-void
.end method

.method public final r0(IILjava/util/List;)V
    .locals 6

    iget-object v0, p0, Lb9/l0;->c0:Lab/y;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lab/y;->c(I)V

    iget-object v0, p0, Lb9/l0;->S:Lb9/b1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v0, Lb9/b1;->b:Ljava/util/ArrayList;

    const/4 v3, 0x0

    if-ltz p1, :cond_0

    if-gt p1, p2, :cond_0

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-gt p2, v4, :cond_0

    move v4, v1

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    invoke-static {v4}, Lva3/g;->d(Z)V

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v4

    sub-int v5, p2, p1

    if-ne v4, v5, :cond_1

    goto :goto_1

    :cond_1
    move v1, v3

    :goto_1
    invoke-static {v1}, Lva3/g;->d(Z)V

    move v1, p1

    :goto_2
    if-ge v1, p2, :cond_2

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb9/a1;

    iget-object v4, v4, Lb9/a1;->a:Ll9/x;

    sub-int v5, v1, p1

    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lu8/x;

    invoke-virtual {v4, v5}, Ll9/x;->r(Lu8/x;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lb9/b1;->d()Lu8/o0;

    move-result-object p1

    invoke-virtual {p0, p1, v3}, Lb9/l0;->t(Lu8/o0;Z)V

    return-void
.end method

.method public final s(Z)V
    .locals 5

    iget-object v0, p0, Lb9/l0;->R:Lb9/s0;

    iget-object v0, v0, Lb9/s0;->l:Lb9/q0;

    if-nez v0, :cond_0

    iget-object v1, p0, Lb9/l0;->b0:Lb9/c1;

    iget-object v1, v1, Lb9/c1;->b:Ll9/c0;

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lb9/q0;->g:Lb9/r0;

    iget-object v1, v1, Lb9/r0;->a:Ll9/c0;

    :goto_0
    iget-object v2, p0, Lb9/l0;->b0:Lb9/c1;

    iget-object v2, v2, Lb9/c1;->k:Ll9/c0;

    invoke-virtual {v2, v1}, Ll9/c0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v3, p0, Lb9/l0;->b0:Lb9/c1;

    invoke-virtual {v3, v1}, Lb9/c1;->c(Ll9/c0;)Lb9/c1;

    move-result-object v1

    iput-object v1, p0, Lb9/l0;->b0:Lb9/c1;

    :cond_1
    iget-object v1, p0, Lb9/l0;->b0:Lb9/c1;

    if-nez v0, :cond_2

    iget-wide v3, v1, Lb9/c1;->s:J

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lb9/q0;->d()J

    move-result-wide v3

    :goto_1
    iput-wide v3, v1, Lb9/c1;->q:J

    iget-object v1, p0, Lb9/l0;->b0:Lb9/c1;

    iget-wide v3, v1, Lb9/c1;->q:J

    invoke-virtual {p0, v3, v4}, Lb9/l0;->n(J)J

    move-result-wide v3

    iput-wide v3, v1, Lb9/c1;->r:J

    if-eqz v2, :cond_3

    if-eqz p1, :cond_4

    :cond_3
    if-eqz v0, :cond_4

    iget-boolean p1, v0, Lb9/q0;->e:Z

    if-eqz p1, :cond_4

    iget-object p1, v0, Lb9/q0;->o:Lo9/v;

    invoke-virtual {p0, p1}, Lb9/l0;->q0(Lo9/v;)V

    :cond_4
    return-void
.end method

.method public final s0(IIIZ)V
    .locals 6

    const/4 v0, -0x1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p4, :cond_0

    if-eq p1, v0, :cond_0

    move p4, v1

    goto :goto_0

    :cond_0
    move p4, v2

    :goto_0
    const/4 v3, 0x2

    if-ne p1, v0, :cond_1

    move p3, v3

    goto :goto_1

    :cond_1
    if-ne p3, v3, :cond_2

    move p3, v1

    :cond_2
    :goto_1
    if-nez p1, :cond_3

    move p2, v1

    goto :goto_2

    :cond_3
    if-ne p2, v1, :cond_4

    move p2, v2

    :cond_4
    :goto_2
    iget-object p1, p0, Lb9/l0;->b0:Lb9/c1;

    iget-boolean v0, p1, Lb9/c1;->l:Z

    if-ne v0, p4, :cond_5

    iget v0, p1, Lb9/c1;->n:I

    if-ne v0, p2, :cond_5

    iget v0, p1, Lb9/c1;->m:I

    if-ne v0, p3, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {p1, p3, p2, p4}, Lb9/c1;->e(IIZ)Lb9/c1;

    move-result-object p1

    iput-object p1, p0, Lb9/l0;->b0:Lb9/c1;

    invoke-virtual {p0, v2, v2}, Lb9/l0;->v0(ZZ)V

    iget-object p1, p0, Lb9/l0;->R:Lb9/s0;

    iget-object p2, p1, Lb9/s0;->i:Lb9/q0;

    :goto_3
    if-eqz p2, :cond_8

    iget-object p3, p2, Lb9/q0;->o:Lo9/v;

    iget-object p3, p3, Lo9/v;->c:[Lo9/s;

    array-length v0, p3

    move v4, v2

    :goto_4
    if-ge v4, v0, :cond_7

    aget-object v5, p3, v4

    if-eqz v5, :cond_6

    invoke-interface {v5, p4}, Lo9/s;->k(Z)V

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_7
    iget-object p2, p2, Lb9/q0;->m:Lb9/q0;

    goto :goto_3

    :cond_8
    invoke-virtual {p0}, Lb9/l0;->k0()Z

    move-result p2

    if-nez p2, :cond_9

    invoke-virtual {p0}, Lb9/l0;->o0()V

    invoke-virtual {p0}, Lb9/l0;->t0()V

    iget-wide p2, p0, Lb9/l0;->q0:J

    invoke-virtual {p1, p2, p3}, Lb9/s0;->m(J)V

    return-void

    :cond_9
    iget-object p1, p0, Lb9/l0;->b0:Lb9/c1;

    iget p1, p1, Lb9/c1;->e:I

    const/4 p2, 0x3

    iget-object p3, p0, Lb9/l0;->H:Lx8/r;

    if-ne p1, p2, :cond_a

    iget-object p1, p0, Lb9/l0;->N:Lb9/l;

    iput-boolean v1, p1, Lb9/l;->y:Z

    iget-object p1, p1, Lb9/l;->z:Ljava/lang/Object;

    check-cast p1, Lb9/l1;

    invoke-virtual {p1}, Lb9/l1;->g()V

    invoke-virtual {p0}, Lb9/l0;->m0()V

    invoke-virtual {p3, v3}, Lx8/r;->e(I)Z

    return-void

    :cond_a
    if-ne p1, v3, :cond_b

    invoke-virtual {p3, v3}, Lx8/r;->e(I)Z

    :cond_b
    :goto_5
    return-void
.end method

.method public final t(Lu8/o0;Z)V
    .locals 38

    move-object/from16 v1, p0

    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v3, v1, Lb9/l0;->p0:Lb9/k0;

    iget-object v9, v1, Lb9/l0;->R:Lb9/s0;

    iget v4, v1, Lb9/l0;->j0:I

    iget-boolean v5, v1, Lb9/l0;->k0:Z

    iget-object v2, v1, Lb9/l0;->K:Lu8/n0;

    iget-object v8, v1, Lb9/l0;->L:Lu8/m0;

    invoke-virtual/range {p1 .. p1}, Lu8/o0;->p()Z

    move-result v6

    const/4 v12, 0x4

    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v6, :cond_0

    new-instance v18, Lb9/j0;

    sget-object v19, Lb9/c1;->u:Ll9/c0;

    const/16 v25, 0x1

    const/16 v26, 0x0

    const-wide/16 v20, 0x0

    const-wide v22, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v24, 0x0

    invoke-direct/range {v18 .. v26}, Lb9/j0;-><init>(Ljava/lang/Object;JJZZZ)V

    move-object/from16 v2, p1

    move-object/from16 v10, v18

    goto/16 :goto_14

    :cond_0
    iget-object v14, v0, Lb9/c1;->b:Ll9/c0;

    iget-object v6, v14, Ll9/c0;->a:Ljava/lang/Object;

    iget-object v7, v0, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v7}, Lu8/o0;->p()Z

    move-result v19

    if-nez v19, :cond_2

    iget-object v13, v14, Ll9/c0;->a:Ljava/lang/Object;

    invoke-virtual {v7, v13, v8}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    move-result-object v7

    iget-boolean v7, v7, Lu8/m0;->f:Z

    if-eqz v7, :cond_1

    goto :goto_0

    :cond_1
    const/4 v13, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v13, 0x1

    :goto_1
    iget-object v7, v0, Lb9/c1;->b:Ll9/c0;

    invoke-virtual {v7}, Ll9/c0;->b()Z

    move-result v7

    if-nez v7, :cond_4

    if-eqz v13, :cond_3

    goto :goto_2

    :cond_3
    iget-wide v10, v0, Lb9/c1;->s:J

    goto :goto_3

    :cond_4
    :goto_2
    iget-wide v10, v0, Lb9/c1;->c:J

    :goto_3
    if-eqz v3, :cond_8

    move-object v7, v6

    move v6, v5

    move v5, v4

    const/4 v4, 0x1

    move-object v15, v7

    move-object v7, v2

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v8}, Lb9/l0;->P(Lu8/o0;Lb9/k0;ZIZLu8/n0;Lu8/m0;)Landroid/util/Pair;

    move-result-object v4

    if-nez v4, :cond_5

    invoke-virtual {v2, v6}, Lu8/o0;->a(Z)I

    move-result v3

    move/from16 v23, v3

    move-wide v3, v10

    move-object v6, v15

    const/4 v5, 0x0

    const/4 v15, 0x1

    const/16 v18, 0x0

    goto :goto_6

    :cond_5
    iget-wide v5, v3, Lb9/k0;->c:J

    cmp-long v3, v5, v16

    if-nez v3, :cond_6

    iget-object v3, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v2, v3, v8}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    move-result-object v3

    iget v3, v3, Lu8/m0;->c:I

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
    iget v3, v0, Lb9/c1;->e:I

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
    move/from16 v33, v5

    move/from16 v34, v15

    move/from16 v35, v18

    move/from16 v2, v23

    move-wide v4, v3

    move-object v3, v7

    move/from16 v18, v13

    const/4 v7, -0x1

    const-wide/16 v12, 0x0

    goto/16 :goto_c

    :cond_8
    move-object v7, v2

    move-object v15, v6

    move-object/from16 v2, p1

    move v6, v5

    move v5, v4

    iget-object v3, v0, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v3}, Lu8/o0;->p()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-virtual {v2, v6}, Lu8/o0;->a(Z)I

    move-result v3

    move v2, v3

    move-object v3, v7

    move-wide v4, v10

    move/from16 v18, v13

    move-object v6, v15

    :goto_7
    const/4 v7, -0x1

    const-wide/16 v12, 0x0

    :goto_8
    const/16 v33, 0x0

    const/16 v34, 0x0

    :goto_9
    const/16 v35, 0x0

    goto/16 :goto_c

    :cond_9
    invoke-virtual {v2, v15}, Lu8/o0;->b(Ljava/lang/Object;)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_b

    move-object v3, v7

    iget-object v7, v0, Lb9/c1;->a:Lu8/o0;

    move-object/from16 v36, v8

    move-object v8, v2

    move-object v2, v3

    move-object/from16 v3, v36

    move-object/from16 v36, v15

    move v15, v4

    move v4, v5

    move v5, v6

    move-object/from16 v6, v36

    invoke-static/range {v2 .. v8}, Lb9/l0;->Q(Lu8/n0;Lu8/m0;IZLjava/lang/Object;Lu8/o0;Lu8/o0;)I

    move-result v4

    move-object/from16 v36, v3

    move-object v3, v2

    move-object v2, v8

    move-object/from16 v8, v36

    if-ne v4, v15, :cond_a

    invoke-virtual {v2, v5}, Lu8/o0;->a(Z)I

    move-result v4

    const/4 v7, 0x1

    goto :goto_a

    :cond_a
    const/4 v7, 0x0

    :goto_a
    move v2, v4

    move/from16 v34, v7

    move-wide v4, v10

    move/from16 v18, v13

    const/4 v7, -0x1

    const-wide/16 v12, 0x0

    const/16 v33, 0x0

    goto :goto_9

    :cond_b
    move-object v3, v7

    move-object v6, v15

    cmp-long v4, v10, v16

    if-nez v4, :cond_c

    invoke-virtual {v2, v6, v8}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    move-result-object v4

    iget v4, v4, Lu8/m0;->c:I

    move v2, v4

    move-wide v4, v10

    move/from16 v18, v13

    goto :goto_7

    :cond_c
    if-eqz v13, :cond_e

    iget-object v4, v0, Lb9/c1;->a:Lu8/o0;

    iget-object v5, v14, Ll9/c0;->a:Ljava/lang/Object;

    invoke-virtual {v4, v5, v8}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    iget-object v4, v0, Lb9/c1;->a:Lu8/o0;

    iget v5, v8, Lu8/m0;->c:I

    move/from16 v18, v13

    const-wide/16 v12, 0x0

    invoke-virtual {v4, v5, v3, v12, v13}, Lu8/o0;->m(ILu8/n0;J)Lu8/n0;

    move-result-object v4

    iget v4, v4, Lu8/n0;->n:I

    iget-object v5, v0, Lb9/c1;->a:Lu8/o0;

    iget-object v7, v14, Ll9/c0;->a:Ljava/lang/Object;

    invoke-virtual {v5, v7}, Lu8/o0;->b(Ljava/lang/Object;)I

    move-result v5

    if-ne v4, v5, :cond_d

    iget-wide v4, v8, Lu8/m0;->e:J

    add-long/2addr v4, v10

    invoke-virtual {v2, v6, v8}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    move-result-object v6

    iget v6, v6, Lu8/m0;->c:I

    move-wide/from16 v36, v4

    move v5, v6

    move-wide/from16 v6, v36

    move-object v4, v8

    invoke-virtual/range {v2 .. v7}, Lu8/o0;->i(Lu8/n0;Lu8/m0;IJ)Landroid/util/Pair;

    move-result-object v5

    iget-object v6, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v2, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    goto :goto_b

    :cond_d
    move-wide v4, v10

    :goto_b
    const/4 v2, -0x1

    const/4 v7, -0x1

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x1

    goto :goto_c

    :cond_e
    move/from16 v18, v13

    const-wide/16 v12, 0x0

    move-wide v4, v10

    const/4 v2, -0x1

    const/4 v7, -0x1

    goto/16 :goto_8

    :goto_c
    if-eq v2, v7, :cond_f

    move/from16 v22, v7

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    move v5, v2

    move-object v4, v8

    move/from16 v8, v22

    move-object/from16 v2, p1

    invoke-virtual/range {v2 .. v7}, Lu8/o0;->i(Lu8/n0;Lu8/m0;IJ)Landroid/util/Pair;

    move-result-object v3

    move-object v7, v4

    iget-object v6, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    move-wide/from16 v31, v16

    goto :goto_d

    :cond_f
    move-object v2, v8

    move v8, v7

    move-object v7, v2

    move-object/from16 v2, p1

    move-wide/from16 v31, v4

    :goto_d
    invoke-virtual {v9, v2, v6, v4, v5}, Lb9/s0;->p(Lu8/o0;Ljava/lang/Object;J)Ll9/c0;

    move-result-object v3

    iget v9, v3, Ll9/c0;->e:I

    if-eq v9, v8, :cond_11

    iget v12, v14, Ll9/c0;->e:I

    if-eq v12, v8, :cond_10

    if-lt v9, v12, :cond_10

    goto :goto_e

    :cond_10
    const/4 v8, 0x0

    goto :goto_f

    :cond_11
    :goto_e
    const/4 v8, 0x1

    :goto_f
    iget-object v9, v14, Ll9/c0;->a:Ljava/lang/Object;

    invoke-virtual {v9, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_12

    invoke-virtual {v14}, Ll9/c0;->b()Z

    move-result v9

    if-nez v9, :cond_12

    invoke-virtual {v3}, Ll9/c0;->b()Z

    move-result v9

    if-nez v9, :cond_12

    if-eqz v8, :cond_12

    const/4 v8, 0x1

    goto :goto_10

    :cond_12
    const/4 v8, 0x0

    :goto_10
    invoke-virtual {v2, v6, v7}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    move-result-object v6

    if-nez v18, :cond_15

    cmp-long v9, v10, v31

    if-nez v9, :cond_15

    iget-object v9, v14, Ll9/c0;->a:Ljava/lang/Object;

    iget v10, v14, Ll9/c0;->b:I

    iget-object v11, v3, Ll9/c0;->a:Ljava/lang/Object;

    invoke-virtual {v9, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_13

    goto :goto_11

    :cond_13
    invoke-virtual {v14}, Ll9/c0;->b()Z

    move-result v9

    if-eqz v9, :cond_14

    invoke-virtual {v6, v10}, Lu8/m0;->g(I)Z

    :cond_14
    invoke-virtual {v3}, Ll9/c0;->b()Z

    move-result v9

    if-eqz v9, :cond_15

    iget v9, v3, Ll9/c0;->b:I

    invoke-virtual {v6, v9}, Lu8/m0;->g(I)Z

    :cond_15
    :goto_11
    if-nez v8, :cond_16

    goto :goto_12

    :cond_16
    move-object v3, v14

    :goto_12
    invoke-virtual {v3}, Ll9/c0;->b()Z

    move-result v6

    if-eqz v6, :cond_17

    invoke-virtual {v3, v14}, Ll9/c0;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_18

    iget-wide v4, v0, Lb9/c1;->s:J

    :cond_17
    move-wide/from16 v29, v4

    goto :goto_13

    :cond_18
    iget-object v0, v3, Ll9/c0;->a:Ljava/lang/Object;

    invoke-virtual {v2, v0, v7}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    iget v0, v3, Ll9/c0;->c:I

    iget v4, v3, Ll9/c0;->b:I

    invoke-virtual {v7, v4}, Lu8/m0;->e(I)I

    move-result v4

    if-ne v0, v4, :cond_19

    iget-object v0, v7, Lu8/m0;->g:Lu8/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_19
    const-wide/16 v29, 0x0

    :goto_13
    new-instance v27, Lb9/j0;

    move-object/from16 v28, v3

    invoke-direct/range {v27 .. v35}, Lb9/j0;-><init>(Ljava/lang/Object;JJZZZ)V

    move-object/from16 v10, v27

    :goto_14
    iget-object v0, v10, Lb9/j0;->f:Ljava/lang/Object;

    move-object v11, v0

    check-cast v11, Ll9/c0;

    iget-wide v12, v10, Lb9/j0;->b:J

    iget-boolean v6, v10, Lb9/j0;->c:Z

    iget-wide v3, v10, Lb9/j0;->a:J

    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v0, v0, Lb9/c1;->b:Ll9/c0;

    invoke-virtual {v0, v11}, Ll9/c0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget-wide v7, v0, Lb9/c1;->s:J

    cmp-long v0, v3, v7

    if-eqz v0, :cond_1a

    goto :goto_15

    :cond_1a
    const/4 v14, 0x0

    goto :goto_16

    :cond_1b
    :goto_15
    const/4 v14, 0x1

    :goto_16
    const/16 v18, 0x3

    :try_start_0
    iget-boolean v0, v10, Lb9/j0;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-eqz v0, :cond_1d

    :try_start_1
    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget v0, v0, Lb9/c1;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v8, 0x1

    if-eq v0, v8, :cond_1c

    const/4 v15, 0x4

    :try_start_2
    invoke-virtual {v1, v15}, Lb9/l0;->h0(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_17
    const/4 v9, 0x0

    goto :goto_18

    :catchall_0
    move-exception v0

    move-object v15, v11

    move-object v11, v2

    move-object v2, v15

    move-wide/from16 v20, v3

    move/from16 v24, v8

    const/4 v15, 0x0

    goto/16 :goto_2d

    :cond_1c
    const/4 v15, 0x4

    goto :goto_17

    :goto_18
    :try_start_3
    invoke-virtual {v1, v9, v9, v9, v8}, Lb9/l0;->L(ZZZZ)V

    goto :goto_1a

    :catchall_1
    move-exception v0

    :goto_19
    move-object v15, v11

    move-object v11, v2

    move-object v2, v15

    move-wide/from16 v20, v3

    move/from16 v24, v8

    move v15, v9

    goto/16 :goto_2d

    :catchall_2
    move-exception v0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v15, 0x4

    goto :goto_19

    :cond_1d
    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v15, 0x4

    :goto_1a
    iget-object v0, v1, Lb9/l0;->w:[Lb9/j1;

    array-length v5, v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move v7, v9

    :goto_1b
    if-ge v7, v5, :cond_20

    :try_start_4
    aget-object v8, v0, v7

    iget-object v9, v8, Lb9/j1;->e:Ljava/lang/Object;

    check-cast v9, Lb9/f;

    iget-object v15, v9, Lb9/f;->P:Lu8/o0;

    invoke-static {v15, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_1e

    iput-object v2, v9, Lb9/f;->P:Lu8/o0;

    :cond_1e
    iget-object v8, v8, Lb9/j1;->f:Ljava/lang/Object;

    check-cast v8, Lb9/f;

    if-eqz v8, :cond_1f

    iget-object v9, v8, Lb9/f;->P:Lu8/o0;

    invoke-static {v9, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1f

    iput-object v2, v8, Lb9/f;->P:Lu8/o0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :cond_1f
    add-int/lit8 v7, v7, 0x1

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v15, 0x4

    goto :goto_1b

    :goto_1c
    move-object v15, v11

    move-object v11, v2

    move-object v2, v15

    move-wide/from16 v20, v3

    const/4 v15, 0x0

    const/16 v24, 0x1

    goto/16 :goto_2d

    :catchall_3
    move-exception v0

    goto :goto_1c

    :cond_20
    if-nez v14, :cond_26

    :try_start_5
    iget-object v0, v1, Lb9/l0;->R:Lb9/s0;

    iget-object v0, v0, Lb9/s0;->j:Lb9/q0;

    if-nez v0, :cond_21

    const-wide/16 v6, 0x0

    goto :goto_1d

    :cond_21
    invoke-virtual {v1, v0}, Lb9/l0;->l(Lb9/q0;)J

    move-result-wide v5

    move-wide v6, v5

    :goto_1d
    invoke-virtual {v1}, Lb9/l0;->d()Z

    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_8

    if-eqz v0, :cond_23

    :try_start_6
    iget-object v0, v1, Lb9/l0;->R:Lb9/s0;

    iget-object v0, v0, Lb9/s0;->k:Lb9/q0;

    if-nez v0, :cond_22

    goto :goto_1e

    :cond_22
    invoke-virtual {v1, v0}, Lb9/l0;->l(Lb9/q0;)J

    move-result-wide v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_1f

    :cond_23
    :goto_1e
    const-wide/16 v8, 0x0

    :goto_1f
    :try_start_7
    iget-object v2, v1, Lb9/l0;->R:Lb9/s0;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    move-wide/from16 v20, v3

    :try_start_8
    iget-wide v4, v1, Lb9/l0;->q0:J
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    move-object/from16 v3, p1

    const/4 v15, 0x0

    const/16 v23, 0x2

    const/16 v24, 0x1

    :try_start_9
    invoke-virtual/range {v2 .. v9}, Lb9/s0;->s(Lu8/o0;JJJ)I

    move-result v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    move-object v8, v3

    and-int/lit8 v2, v0, 0x1

    if-eqz v2, :cond_24

    :try_start_a
    invoke-virtual {v1, v15}, Lb9/l0;->S(Z)V

    goto :goto_22

    :catchall_4
    move-exception v0

    :goto_20
    move-object v2, v11

    :goto_21
    move-object v11, v8

    goto/16 :goto_2d

    :cond_24
    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_25

    invoke-virtual {v1}, Lb9/l0;->f()V

    :cond_25
    :goto_22
    move-object v2, v11

    goto/16 :goto_28

    :catchall_5
    move-exception v0

    move-object v8, v3

    goto :goto_20

    :catchall_6
    move-exception v0

    move-object/from16 v8, p1

    :goto_23
    const/4 v15, 0x0

    const/16 v23, 0x2

    const/16 v24, 0x1

    goto :goto_20

    :catchall_7
    move-exception v0

    move-object/from16 v8, p1

    :goto_24
    move-wide/from16 v20, v3

    goto :goto_23

    :catchall_8
    move-exception v0

    move-object v8, v2

    goto :goto_24

    :cond_26
    move-object v8, v2

    move-wide/from16 v20, v3

    const/4 v15, 0x0

    const/16 v23, 0x2

    const/16 v24, 0x1

    invoke-virtual {v8}, Lu8/o0;->p()Z

    move-result v0

    if-nez v0, :cond_25

    iget-object v0, v1, Lb9/l0;->R:Lb9/s0;

    iget-object v0, v0, Lb9/s0;->i:Lb9/q0;

    :goto_25
    if-eqz v0, :cond_28

    iget-object v2, v0, Lb9/q0;->g:Lb9/r0;

    iget-object v2, v2, Lb9/r0;->a:Ll9/c0;

    invoke-virtual {v2, v11}, Ll9/c0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_27

    iget-object v2, v1, Lb9/l0;->R:Lb9/s0;

    iget-object v3, v0, Lb9/q0;->g:Lb9/r0;

    invoke-virtual {v2, v8, v3}, Lb9/s0;->h(Lu8/o0;Lb9/r0;)Lb9/r0;

    move-result-object v2

    iput-object v2, v0, Lb9/q0;->g:Lb9/r0;

    invoke-virtual {v0}, Lb9/q0;->k()V

    :cond_27
    iget-object v0, v0, Lb9/q0;->m:Lb9/q0;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    goto :goto_25

    :cond_28
    :try_start_b
    iget-object v0, v1, Lb9/l0;->R:Lb9/s0;

    iget-object v2, v0, Lb9/s0;->i:Lb9/q0;

    iget-object v0, v0, Lb9/s0;->j:Lb9/q0;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_a

    if-eq v2, v0, :cond_29

    move/from16 v5, v24

    :goto_26
    move-object v2, v11

    move-wide/from16 v3, v20

    goto :goto_27

    :cond_29
    move v5, v15

    goto :goto_26

    :goto_27
    :try_start_c
    invoke-virtual/range {v1 .. v6}, Lb9/l0;->U(Ll9/c0;JZZ)J

    move-result-wide v3
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    move-wide/from16 v20, v3

    goto :goto_28

    :catchall_9
    move-exception v0

    move-wide/from16 v20, v3

    goto :goto_21

    :catchall_a
    move-exception v0

    goto :goto_20

    :goto_28
    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v4, v0, Lb9/c1;->a:Lu8/o0;

    iget-object v5, v0, Lb9/c1;->b:Ll9/c0;

    iget-boolean v0, v10, Lb9/j0;->e:Z

    if-eqz v0, :cond_2a

    move-wide/from16 v6, v20

    goto :goto_29

    :cond_2a
    move-wide/from16 v6, v16

    :goto_29
    const/4 v8, 0x0

    move-object v3, v2

    move-object/from16 v2, p1

    invoke-virtual/range {v1 .. v8}, Lb9/l0;->u0(Lu8/o0;Ll9/c0;Lu8/o0;Ll9/c0;JZ)V

    move-object v11, v2

    move-object v2, v3

    if-nez v14, :cond_2b

    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget-wide v3, v0, Lb9/c1;->c:J

    cmp-long v0, v12, v3

    if-eqz v0, :cond_2e

    :cond_2b
    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v3, v0, Lb9/c1;->b:Ll9/c0;

    iget-object v3, v3, Ll9/c0;->a:Ljava/lang/Object;

    iget-object v0, v0, Lb9/c1;->a:Lu8/o0;

    if-eqz v14, :cond_2c

    if-eqz p2, :cond_2c

    invoke-virtual {v0}, Lu8/o0;->p()Z

    move-result v4

    if-nez v4, :cond_2c

    iget-object v4, v1, Lb9/l0;->L:Lu8/m0;

    invoke-virtual {v0, v3, v4}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    move-result-object v0

    iget-boolean v0, v0, Lu8/m0;->f:Z

    if-nez v0, :cond_2c

    move/from16 v9, v24

    goto :goto_2a

    :cond_2c
    move v9, v15

    :goto_2a
    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget-wide v7, v0, Lb9/c1;->d:J

    invoke-virtual {v11, v3}, Lu8/o0;->b(Ljava/lang/Object;)I

    move-result v0

    const/4 v4, -0x1

    if-ne v0, v4, :cond_2d

    const/4 v10, 0x4

    :goto_2b
    move-wide v5, v12

    move-wide/from16 v3, v20

    goto :goto_2c

    :cond_2d
    move/from16 v10, v18

    goto :goto_2b

    :goto_2c
    invoke-virtual/range {v1 .. v10}, Lb9/l0;->w(Ll9/c0;JJJZI)Lb9/c1;

    move-result-object v0

    iput-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    :cond_2e
    invoke-virtual {v1}, Lb9/l0;->M()V

    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v0, v0, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v1, v11, v0}, Lb9/l0;->O(Lu8/o0;Lu8/o0;)V

    iget-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    invoke-virtual {v0, v11}, Lb9/c1;->i(Lu8/o0;)Lb9/c1;

    move-result-object v0

    iput-object v0, v1, Lb9/l0;->b0:Lb9/c1;

    invoke-virtual {v11}, Lu8/o0;->p()Z

    move-result v0

    if-nez v0, :cond_2f

    const/4 v2, 0x0

    iput-object v2, v1, Lb9/l0;->p0:Lb9/k0;

    :cond_2f
    invoke-virtual {v1, v15}, Lb9/l0;->s(Z)V

    iget-object v0, v1, Lb9/l0;->H:Lx8/r;

    move/from16 v2, v23

    invoke-virtual {v0, v2}, Lx8/r;->e(I)Z

    return-void

    :goto_2d
    iget-object v3, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v4, v3, Lb9/c1;->a:Lu8/o0;

    iget-object v5, v3, Lb9/c1;->b:Ll9/c0;

    iget-boolean v3, v10, Lb9/j0;->e:Z

    if-eqz v3, :cond_30

    move-wide/from16 v6, v20

    goto :goto_2e

    :cond_30
    move-wide/from16 v6, v16

    :goto_2e
    const/4 v8, 0x0

    move-object v3, v2

    move-object v2, v11

    invoke-virtual/range {v1 .. v8}, Lb9/l0;->u0(Lu8/o0;Ll9/c0;Lu8/o0;Ll9/c0;JZ)V

    move-object v2, v3

    if-nez v14, :cond_31

    iget-object v3, v1, Lb9/l0;->b0:Lb9/c1;

    iget-wide v3, v3, Lb9/c1;->c:J

    cmp-long v3, v12, v3

    if-eqz v3, :cond_34

    :cond_31
    iget-object v3, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v4, v3, Lb9/c1;->b:Ll9/c0;

    iget-object v4, v4, Ll9/c0;->a:Ljava/lang/Object;

    iget-object v3, v3, Lb9/c1;->a:Lu8/o0;

    if-eqz v14, :cond_32

    if-eqz p2, :cond_32

    invoke-virtual {v3}, Lu8/o0;->p()Z

    move-result v5

    if-nez v5, :cond_32

    iget-object v5, v1, Lb9/l0;->L:Lu8/m0;

    invoke-virtual {v3, v4, v5}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    move-result-object v3

    iget-boolean v3, v3, Lu8/m0;->f:Z

    if-nez v3, :cond_32

    move/from16 v9, v24

    goto :goto_2f

    :cond_32
    move v9, v15

    :goto_2f
    iget-object v3, v1, Lb9/l0;->b0:Lb9/c1;

    iget-wide v7, v3, Lb9/c1;->d:J

    invoke-virtual {v11, v4}, Lu8/o0;->b(Ljava/lang/Object;)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_33

    const/4 v10, 0x4

    :goto_30
    move-wide v5, v12

    move-wide/from16 v3, v20

    goto :goto_31

    :cond_33
    move/from16 v10, v18

    goto :goto_30

    :goto_31
    invoke-virtual/range {v1 .. v10}, Lb9/l0;->w(Ll9/c0;JJJZI)Lb9/c1;

    move-result-object v2

    iput-object v2, v1, Lb9/l0;->b0:Lb9/c1;

    :cond_34
    invoke-virtual {v1}, Lb9/l0;->M()V

    iget-object v2, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v2, v2, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v1, v11, v2}, Lb9/l0;->O(Lu8/o0;Lu8/o0;)V

    iget-object v2, v1, Lb9/l0;->b0:Lb9/c1;

    invoke-virtual {v2, v11}, Lb9/c1;->i(Lu8/o0;)Lb9/c1;

    move-result-object v2

    iput-object v2, v1, Lb9/l0;->b0:Lb9/c1;

    invoke-virtual {v11}, Lu8/o0;->p()Z

    move-result v2

    if-nez v2, :cond_35

    const/4 v2, 0x0

    iput-object v2, v1, Lb9/l0;->p0:Lb9/k0;

    :cond_35
    invoke-virtual {v1, v15}, Lb9/l0;->s(Z)V

    iget-object v2, v1, Lb9/l0;->H:Lx8/r;

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Lx8/r;->e(I)Z

    throw v0
.end method

.method public final t0()V
    .locals 26

    move-object/from16 v0, p0

    iget-object v1, v0, Lb9/l0;->R:Lb9/s0;

    iget-object v1, v1, Lb9/s0;->i:Lb9/q0;

    if-nez v1, :cond_0

    goto/16 :goto_c

    :cond_0
    iget-boolean v2, v1, Lb9/q0;->e:Z

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v2, :cond_1

    iget-object v2, v1, Lb9/q0;->a:Ljava/lang/Object;

    invoke-interface {v2}, Ll9/a0;->f()J

    move-result-wide v2

    goto :goto_0

    :cond_1
    move-wide v2, v10

    :goto_0
    cmp-long v4, v2, v10

    const/4 v12, 0x2

    const/16 v13, 0x10

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eqz v4, :cond_3

    invoke-virtual {v1}, Lb9/q0;->g()Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, v0, Lb9/l0;->R:Lb9/s0;

    invoke-virtual {v4, v1}, Lb9/s0;->n(Lb9/q0;)I

    invoke-virtual {v0, v15}, Lb9/l0;->s(Z)V

    invoke-virtual {v0}, Lb9/l0;->z()V

    :cond_2
    invoke-virtual {v0, v2, v3}, Lb9/l0;->N(J)V

    iget-object v1, v0, Lb9/l0;->b0:Lb9/c1;

    iget-wide v4, v1, Lb9/c1;->s:J

    cmp-long v1, v2, v4

    if-eqz v1, :cond_13

    iget-object v1, v0, Lb9/l0;->b0:Lb9/c1;

    iget-object v4, v1, Lb9/c1;->b:Ll9/c0;

    iget-wide v5, v1, Lb9/c1;->c:J

    const/4 v8, 0x1

    const/4 v9, 0x5

    move-object v1, v4

    move-wide v4, v5

    move-wide v6, v2

    invoke-virtual/range {v0 .. v9}, Lb9/l0;->w(Ll9/c0;JJJZI)Lb9/c1;

    move-result-object v1

    iput-object v1, v0, Lb9/l0;->b0:Lb9/c1;

    goto/16 :goto_7

    :cond_3
    iget-object v2, v0, Lb9/l0;->N:Lb9/l;

    iget-object v3, v0, Lb9/l0;->R:Lb9/s0;

    iget-object v3, v3, Lb9/s0;->j:Lb9/q0;

    if-eq v1, v3, :cond_4

    move v3, v14

    goto :goto_1

    :cond_4
    move v3, v15

    :goto_1
    iget-object v4, v2, Lb9/l;->z:Ljava/lang/Object;

    check-cast v4, Lb9/l1;

    iget-object v5, v2, Lb9/l;->F:Ljava/lang/Object;

    check-cast v5, Lb9/f;

    if-eqz v5, :cond_9

    invoke-virtual {v5}, Lb9/f;->l()Z

    move-result v5

    if-nez v5, :cond_9

    if-eqz v3, :cond_5

    iget-object v5, v2, Lb9/l;->F:Ljava/lang/Object;

    check-cast v5, Lb9/f;

    iget v5, v5, Lb9/f;->H:I

    if-ne v5, v12, :cond_9

    :cond_5
    iget-object v5, v2, Lb9/l;->F:Ljava/lang/Object;

    check-cast v5, Lb9/f;

    invoke-virtual {v5}, Lb9/f;->n()Z

    move-result v5

    if-nez v5, :cond_6

    if-nez v3, :cond_9

    iget-object v3, v2, Lb9/l;->F:Ljava/lang/Object;

    check-cast v3, Lb9/f;

    invoke-virtual {v3}, Lb9/f;->k()Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_2

    :cond_6
    iget-object v3, v2, Lb9/l;->G:Ljava/lang/Object;

    check-cast v3, Lb9/p0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v3}, Lb9/p0;->c()J

    move-result-wide v5

    iget-boolean v7, v2, Lb9/l;->x:Z

    if-eqz v7, :cond_8

    invoke-virtual {v4}, Lb9/l1;->c()J

    move-result-wide v7

    cmp-long v7, v5, v7

    if-gez v7, :cond_7

    iget-boolean v3, v4, Lb9/l1;->z:Z

    if-eqz v3, :cond_a

    invoke-virtual {v4}, Lb9/l1;->c()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Lb9/l1;->a(J)V

    iput-boolean v15, v4, Lb9/l1;->z:Z

    goto :goto_3

    :cond_7
    iput-boolean v15, v2, Lb9/l;->x:Z

    iget-boolean v7, v2, Lb9/l;->y:Z

    if-eqz v7, :cond_8

    invoke-virtual {v4}, Lb9/l1;->g()V

    :cond_8
    invoke-virtual {v4, v5, v6}, Lb9/l1;->a(J)V

    invoke-interface {v3}, Lb9/p0;->b()Lu8/e0;

    move-result-object v3

    iget-object v5, v4, Lb9/l1;->F:Ljava/lang/Object;

    check-cast v5, Lu8/e0;

    invoke-virtual {v3, v5}, Lu8/e0;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    invoke-virtual {v4, v3}, Lb9/l1;->d(Lu8/e0;)V

    iget-object v4, v2, Lb9/l;->E:Landroid/os/Handler$Callback;

    check-cast v4, Lb9/l0;

    iget-object v4, v4, Lb9/l0;->H:Lx8/r;

    invoke-virtual {v4, v13, v3}, Lx8/r;->a(ILjava/lang/Object;)Lx8/q;

    move-result-object v3

    invoke-virtual {v3}, Lx8/q;->b()V

    goto :goto_3

    :cond_9
    :goto_2
    iput-boolean v14, v2, Lb9/l;->x:Z

    iget-boolean v3, v2, Lb9/l;->y:Z

    if-eqz v3, :cond_a

    invoke-virtual {v4}, Lb9/l1;->g()V

    :cond_a
    :goto_3
    invoke-virtual {v2}, Lb9/l;->c()J

    move-result-wide v2

    iput-wide v2, v0, Lb9/l0;->q0:J

    iget-wide v4, v1, Lb9/q0;->p:J

    sub-long/2addr v2, v4

    iget-object v1, v0, Lb9/l0;->b0:Lb9/c1;

    iget-wide v4, v1, Lb9/c1;->s:J

    iget-object v1, v0, Lb9/l0;->O:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_11

    iget-object v1, v0, Lb9/l0;->b0:Lb9/c1;

    iget-object v1, v1, Lb9/c1;->b:Ll9/c0;

    invoke-virtual {v1}, Ll9/c0;->b()Z

    move-result v1

    if-eqz v1, :cond_b

    goto :goto_6

    :cond_b
    iget-boolean v1, v0, Lb9/l0;->t0:Z

    if-eqz v1, :cond_c

    iput-boolean v15, v0, Lb9/l0;->t0:Z

    :cond_c
    iget-object v1, v0, Lb9/l0;->b0:Lb9/c1;

    iget-object v4, v1, Lb9/c1;->a:Lu8/o0;

    iget-object v1, v1, Lb9/c1;->b:Ll9/c0;

    iget-object v1, v1, Ll9/c0;->a:Ljava/lang/Object;

    invoke-virtual {v4, v1}, Lu8/o0;->b(Ljava/lang/Object;)I

    iget v1, v0, Lb9/l0;->s0:I

    iget-object v4, v0, Lb9/l0;->O:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-lez v1, :cond_e

    iget-object v4, v0, Lb9/l0;->O:Ljava/util/ArrayList;

    add-int/lit8 v5, v1, -0x1

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_d

    goto :goto_4

    :cond_d
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    :cond_e
    :goto_4
    iget-object v4, v0, Lb9/l0;->O:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v1, v4, :cond_10

    iget-object v4, v0, Lb9/l0;->O:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_f

    goto :goto_5

    :cond_f
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    :cond_10
    :goto_5
    iput v1, v0, Lb9/l0;->s0:I

    :cond_11
    :goto_6
    iget-object v1, v0, Lb9/l0;->N:Lb9/l;

    invoke-virtual {v1}, Lb9/l;->e()Z

    move-result v1

    if-eqz v1, :cond_12

    iget-object v1, v0, Lb9/l0;->c0:Lab/y;

    iget-boolean v1, v1, Lab/y;->d:Z

    xor-int/lit8 v8, v1, 0x1

    iget-object v1, v0, Lb9/l0;->b0:Lb9/c1;

    iget-object v4, v1, Lb9/c1;->b:Ll9/c0;

    iget-wide v5, v1, Lb9/c1;->c:J

    const/4 v9, 0x6

    move-object v1, v4

    move-wide v4, v5

    move-wide v6, v2

    invoke-virtual/range {v0 .. v9}, Lb9/l0;->w(Ll9/c0;JJJZI)Lb9/c1;

    move-result-object v1

    iput-object v1, v0, Lb9/l0;->b0:Lb9/c1;

    goto :goto_7

    :cond_12
    iget-object v1, v0, Lb9/l0;->b0:Lb9/c1;

    iput-wide v2, v1, Lb9/c1;->s:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iput-wide v2, v1, Lb9/c1;->t:J

    :cond_13
    :goto_7
    iget-object v1, v0, Lb9/l0;->R:Lb9/s0;

    iget-object v1, v1, Lb9/s0;->l:Lb9/q0;

    iget-object v2, v0, Lb9/l0;->b0:Lb9/c1;

    invoke-virtual {v1}, Lb9/q0;->d()J

    move-result-wide v3

    iput-wide v3, v2, Lb9/c1;->q:J

    iget-object v1, v0, Lb9/l0;->b0:Lb9/c1;

    iget-wide v2, v1, Lb9/c1;->q:J

    invoke-virtual {v0, v2, v3}, Lb9/l0;->n(J)J

    move-result-wide v2

    iput-wide v2, v1, Lb9/c1;->r:J

    iget-object v1, v0, Lb9/l0;->b0:Lb9/c1;

    iget-boolean v2, v1, Lb9/c1;->l:Z

    if-eqz v2, :cond_1b

    iget v2, v1, Lb9/c1;->e:I

    const/4 v3, 0x3

    if-ne v2, v3, :cond_1b

    iget-object v2, v1, Lb9/c1;->a:Lu8/o0;

    iget-object v1, v1, Lb9/c1;->b:Ll9/c0;

    invoke-virtual {v0, v2, v1}, Lb9/l0;->l0(Lu8/o0;Ll9/c0;)Z

    move-result v1

    if-eqz v1, :cond_1b

    iget-object v1, v0, Lb9/l0;->b0:Lb9/c1;

    iget-object v2, v1, Lb9/c1;->o:Lu8/e0;

    iget v2, v2, Lu8/e0;->a:F

    const/high16 v4, 0x3f800000    # 1.0f

    cmpl-float v2, v2, v4

    if-nez v2, :cond_1b

    iget-object v2, v0, Lb9/l0;->T:Lb9/i;

    iget-object v5, v1, Lb9/c1;->a:Lu8/o0;

    iget-object v6, v1, Lb9/c1;->b:Ll9/c0;

    iget-object v6, v6, Ll9/c0;->a:Ljava/lang/Object;

    iget-wide v7, v1, Lb9/c1;->s:J

    invoke-virtual {v0, v5, v6, v7, v8}, Lb9/l0;->k(Lu8/o0;Ljava/lang/Object;J)J

    move-result-wide v5

    iget-object v1, v0, Lb9/l0;->b0:Lb9/c1;

    iget-wide v7, v1, Lb9/c1;->r:J

    move-wide/from16 v16, v10

    iget-wide v10, v2, Lb9/i;->d:J

    cmp-long v1, v10, v16

    if-nez v1, :cond_14

    goto/16 :goto_b

    :cond_14
    sub-long v7, v5, v7

    iget-wide v9, v2, Lb9/i;->n:J

    cmp-long v1, v9, v16

    if-nez v1, :cond_15

    iput-wide v7, v2, Lb9/i;->n:J

    const-wide/16 v7, 0x0

    iput-wide v7, v2, Lb9/i;->o:J

    goto :goto_8

    :cond_15
    long-to-float v1, v9

    const v9, 0x3f7fbe77    # 0.999f

    mul-float/2addr v1, v9

    long-to-float v10, v7

    const v11, 0x3a831200    # 9.999871E-4f

    mul-float/2addr v10, v11

    add-float/2addr v10, v1

    move v1, v9

    float-to-long v9, v10

    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v9

    iput-wide v9, v2, Lb9/i;->n:J

    sub-long/2addr v7, v9

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    move-result-wide v7

    iget-wide v9, v2, Lb9/i;->o:J

    long-to-float v9, v9

    mul-float/2addr v9, v1

    long-to-float v1, v7

    mul-float/2addr v11, v1

    add-float/2addr v11, v9

    float-to-long v7, v11

    iput-wide v7, v2, Lb9/i;->o:J

    :goto_8
    iget-wide v7, v2, Lb9/i;->m:J

    cmp-long v1, v7, v16

    if-eqz v1, :cond_16

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v9

    const-wide/16 v18, 0x3e8

    iget-wide v7, v2, Lb9/i;->m:J

    sub-long/2addr v9, v7

    cmp-long v1, v9, v18

    if-gez v1, :cond_17

    iget v4, v2, Lb9/i;->l:F

    goto/16 :goto_b

    :cond_16
    const-wide/16 v18, 0x3e8

    :cond_17
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v7

    iput-wide v7, v2, Lb9/i;->m:J

    iget-wide v7, v2, Lb9/i;->n:J

    const-wide/16 v20, 0x3

    iget-wide v9, v2, Lb9/i;->o:J

    mul-long v9, v9, v20

    add-long v24, v9, v7

    iget-wide v7, v2, Lb9/i;->i:J

    cmp-long v1, v7, v24

    if-lez v1, :cond_18

    invoke-static/range {v18 .. v19}, Lx8/t;->J(J)J

    move-result-wide v8

    iget v1, v2, Lb9/i;->l:F

    sub-float/2addr v1, v4

    long-to-float v8, v8

    mul-float/2addr v1, v8

    float-to-long v9, v1

    iget v1, v2, Lb9/i;->j:F

    sub-float/2addr v1, v4

    mul-float/2addr v1, v8

    const v11, 0x33d6bf95    # 1.0E-7f

    float-to-long v7, v1

    add-long/2addr v9, v7

    iget-wide v7, v2, Lb9/i;->f:J

    move/from16 v18, v11

    move v1, v12

    iget-wide v11, v2, Lb9/i;->i:J

    sub-long/2addr v11, v9

    new-array v3, v3, [J

    aput-wide v24, v3, v15

    aput-wide v7, v3, v14

    aput-wide v11, v3, v1

    invoke-static {v3}, Lvp/c;->i0([J)J

    move-result-wide v7

    iput-wide v7, v2, Lb9/i;->i:J

    goto :goto_9

    :cond_18
    const v18, 0x33d6bf95    # 1.0E-7f

    iget v1, v2, Lb9/i;->l:F

    sub-float/2addr v1, v4

    const/4 v3, 0x0

    invoke-static {v3, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    div-float v1, v1, v18

    float-to-long v7, v1

    sub-long v20, v5, v7

    iget-wide v7, v2, Lb9/i;->i:J

    move-wide/from16 v22, v7

    invoke-static/range {v20 .. v25}, Lx8/t;->h(JJJ)J

    move-result-wide v7

    iput-wide v7, v2, Lb9/i;->i:J

    iget-wide v9, v2, Lb9/i;->h:J

    cmp-long v1, v9, v16

    if-eqz v1, :cond_19

    cmp-long v1, v7, v9

    if-lez v1, :cond_19

    iput-wide v9, v2, Lb9/i;->i:J

    :cond_19
    :goto_9
    iget-wide v7, v2, Lb9/i;->i:J

    sub-long/2addr v5, v7

    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    move-result-wide v7

    iget-wide v9, v2, Lb9/i;->b:J

    cmp-long v1, v7, v9

    if-gez v1, :cond_1a

    iput v4, v2, Lb9/i;->l:F

    goto :goto_a

    :cond_1a
    long-to-float v1, v5

    mul-float v7, v18, v1

    add-float/2addr v7, v4

    iget v1, v2, Lb9/i;->k:F

    iget v3, v2, Lb9/i;->j:F

    invoke-static {v7, v1, v3}, Lx8/t;->f(FFF)F

    move-result v1

    iput v1, v2, Lb9/i;->l:F

    :goto_a
    iget v4, v2, Lb9/i;->l:F

    :goto_b
    iget-object v1, v0, Lb9/l0;->N:Lb9/l;

    invoke-virtual {v1}, Lb9/l;->b()Lu8/e0;

    move-result-object v1

    iget v1, v1, Lu8/e0;->a:F

    cmpl-float v1, v1, v4

    if-eqz v1, :cond_1b

    iget-object v1, v0, Lb9/l0;->b0:Lb9/c1;

    iget-object v1, v1, Lb9/c1;->o:Lu8/e0;

    new-instance v2, Lu8/e0;

    iget v1, v1, Lu8/e0;->b:F

    invoke-direct {v2, v4, v1}, Lu8/e0;-><init>(FF)V

    iget-object v1, v0, Lb9/l0;->H:Lx8/r;

    invoke-virtual {v1, v13}, Lx8/r;->d(I)V

    iget-object v1, v0, Lb9/l0;->N:Lb9/l;

    invoke-virtual {v1, v2}, Lb9/l;->d(Lu8/e0;)V

    iget-object v1, v0, Lb9/l0;->b0:Lb9/c1;

    iget-object v1, v1, Lb9/c1;->o:Lu8/e0;

    iget-object v2, v0, Lb9/l0;->N:Lb9/l;

    invoke-virtual {v2}, Lb9/l;->b()Lu8/e0;

    move-result-object v2

    iget v2, v2, Lu8/e0;->a:F

    invoke-virtual {v0, v1, v2, v15, v15}, Lb9/l0;->v(Lu8/e0;FZZ)V

    :cond_1b
    :goto_c
    return-void
.end method

.method public final u(Ll9/a0;)V
    .locals 12

    iget-object v0, p0, Lb9/l0;->R:Lb9/s0;

    iget-object v1, v0, Lb9/s0;->l:Lb9/q0;

    iget-object v2, p0, Lb9/l0;->N:Lb9/l;

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    iget-object v4, v1, Lb9/q0;->a:Ljava/lang/Object;

    if-ne v4, p1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean p1, v1, Lb9/q0;->e:Z

    if-nez p1, :cond_0

    invoke-virtual {v2}, Lb9/l;->b()Lu8/e0;

    move-result-object p1

    iget p1, p1, Lu8/e0;->a:F

    iget-object v2, p0, Lb9/l0;->b0:Lb9/c1;

    iget-object v4, v2, Lb9/c1;->a:Lu8/o0;

    iget-boolean v2, v2, Lb9/c1;->l:Z

    invoke-virtual {v1, p1, v4, v2}, Lb9/q0;->f(FLu8/o0;Z)V

    :cond_0
    iget-object p1, v1, Lb9/q0;->o:Lo9/v;

    invoke-virtual {p0, p1}, Lb9/l0;->q0(Lo9/v;)V

    iget-object p1, v0, Lb9/s0;->i:Lb9/q0;

    if-ne v1, p1, :cond_1

    iget-object p1, v1, Lb9/q0;->g:Lb9/r0;

    iget-wide v4, p1, Lb9/r0;->b:J

    invoke-virtual {p0, v4, v5}, Lb9/l0;->N(J)V

    iget-object p1, p0, Lb9/l0;->w:[Lb9/j1;

    array-length p1, p1

    new-array p1, p1, [Z

    iget-object v0, v0, Lb9/s0;->j:Lb9/q0;

    invoke-virtual {v0}, Lb9/q0;->e()J

    move-result-wide v4

    invoke-virtual {p0, p1, v4, v5}, Lb9/l0;->j([ZJ)V

    iput-boolean v3, v1, Lb9/q0;->h:Z

    iget-object p1, p0, Lb9/l0;->b0:Lb9/c1;

    iget-object v3, p1, Lb9/c1;->b:Ll9/c0;

    iget-object v0, v1, Lb9/q0;->g:Lb9/r0;

    iget-wide v4, v0, Lb9/r0;->b:J

    iget-wide v6, p1, Lb9/c1;->c:J

    const/4 v10, 0x0

    const/4 v11, 0x5

    move-wide v8, v4

    move-object v2, p0

    invoke-virtual/range {v2 .. v11}, Lb9/l0;->w(Ll9/c0;JJJZI)Lb9/c1;

    move-result-object p1

    move-object v1, v2

    iput-object p1, v1, Lb9/l0;->b0:Lb9/c1;

    goto :goto_0

    :cond_1
    move-object v1, p0

    :goto_0
    invoke-virtual {p0}, Lb9/l0;->z()V

    return-void

    :cond_2
    move-object v1, p0

    const/4 v4, 0x0

    :goto_1
    iget-object v5, v0, Lb9/s0;->q:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_4

    iget-object v5, v0, Lb9/s0;->q:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb9/q0;

    iget-object v6, v5, Lb9/q0;->a:Ljava/lang/Object;

    if-ne v6, p1, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    const/4 v5, 0x0

    :goto_2
    if-eqz v5, :cond_5

    iget-boolean v4, v5, Lb9/q0;->e:Z

    xor-int/2addr v3, v4

    invoke-static {v3}, Lva3/g;->i(Z)V

    invoke-virtual {v2}, Lb9/l;->b()Lu8/e0;

    move-result-object v2

    iget v2, v2, Lu8/e0;->a:F

    iget-object v3, v1, Lb9/l0;->b0:Lb9/c1;

    iget-object v4, v3, Lb9/c1;->a:Lu8/o0;

    iget-boolean v3, v3, Lb9/c1;->l:Z

    invoke-virtual {v5, v2, v4, v3}, Lb9/q0;->f(FLu8/o0;Z)V

    iget-object v0, v0, Lb9/s0;->m:Lb9/q0;

    if-eqz v0, :cond_5

    iget-object v0, v0, Lb9/q0;->a:Ljava/lang/Object;

    if-ne v0, p1, :cond_5

    invoke-virtual {p0}, Lb9/l0;->A()V

    :cond_5
    return-void
.end method

.method public final u0(Lu8/o0;Ll9/c0;Lu8/o0;Ll9/c0;JZ)V
    .locals 8

    invoke-virtual {p0, p1, p2}, Lb9/l0;->l0(Lu8/o0;Ll9/c0;)Z

    move-result v0

    iget-object v1, p2, Ll9/c0;->a:Ljava/lang/Object;

    if-nez v0, :cond_1

    invoke-virtual {p2}, Ll9/c0;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lu8/e0;->d:Lu8/e0;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lb9/l0;->b0:Lb9/c1;

    iget-object p1, p1, Lb9/c1;->o:Lu8/e0;

    :goto_0
    iget-object p2, p0, Lb9/l0;->N:Lb9/l;

    invoke-virtual {p2}, Lb9/l;->b()Lu8/e0;

    move-result-object p3

    invoke-virtual {p3, p1}, Lu8/e0;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_7

    iget-object p3, p0, Lb9/l0;->H:Lx8/r;

    const/16 p4, 0x10

    invoke-virtual {p3, p4}, Lx8/r;->d(I)V

    invoke-virtual {p2, p1}, Lb9/l;->d(Lu8/e0;)V

    iget-object p2, p0, Lb9/l0;->b0:Lb9/c1;

    iget-object p2, p2, Lb9/c1;->o:Lu8/e0;

    iget p1, p1, Lu8/e0;->a:F

    const/4 p3, 0x0

    invoke-virtual {p0, p2, p1, p3, p3}, Lb9/l0;->v(Lu8/e0;FZZ)V

    return-void

    :cond_1
    iget-object p2, p0, Lb9/l0;->L:Lu8/m0;

    invoke-virtual {p1, v1, p2}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    move-result-object v0

    iget v0, v0, Lu8/m0;->c:I

    iget-object v2, p0, Lb9/l0;->K:Lu8/n0;

    invoke-virtual {p1, v0, v2}, Lu8/o0;->n(ILu8/n0;)V

    iget-object v0, v2, Lu8/n0;->j:Lu8/t;

    iget-object v3, p0, Lb9/l0;->T:Lb9/i;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v4, v0, Lu8/t;->a:J

    invoke-static {v4, v5}, Lx8/t;->J(J)J

    move-result-wide v4

    iput-wide v4, v3, Lb9/i;->d:J

    iget-wide v4, v0, Lu8/t;->b:J

    invoke-static {v4, v5}, Lx8/t;->J(J)J

    move-result-wide v4

    iput-wide v4, v3, Lb9/i;->g:J

    iget-wide v4, v0, Lu8/t;->c:J

    invoke-static {v4, v5}, Lx8/t;->J(J)J

    move-result-wide v4

    iput-wide v4, v3, Lb9/i;->h:J

    iget v4, v0, Lu8/t;->d:F

    const v5, -0x800001

    cmpl-float v6, v4, v5

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_2
    const v4, 0x3f7851ec    # 0.97f

    :goto_1
    iput v4, v3, Lb9/i;->k:F

    iget v0, v0, Lu8/t;->e:F

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

    invoke-virtual {p0, p1, v1, p5, p6}, Lb9/l0;->k(Lu8/o0;Ljava/lang/Object;J)J

    move-result-wide p1

    iput-wide p1, v3, Lb9/i;->e:J

    invoke-virtual {v3}, Lb9/i;->a()V

    return-void

    :cond_5
    iget-object p1, v2, Lu8/n0;->a:Ljava/lang/Object;

    invoke-virtual {p3}, Lu8/o0;->p()Z

    move-result p5

    if-nez p5, :cond_6

    iget-object p4, p4, Ll9/c0;->a:Ljava/lang/Object;

    invoke-virtual {p3, p4, p2}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    move-result-object p2

    iget p2, p2, Lu8/m0;->c:I

    const-wide/16 p4, 0x0

    invoke-virtual {p3, p2, v2, p4, p5}, Lu8/o0;->m(ILu8/n0;J)Lu8/n0;

    move-result-object p2

    iget-object p2, p2, Lu8/n0;->a:Ljava/lang/Object;

    goto :goto_3

    :cond_6
    const/4 p2, 0x0

    :goto_3
    invoke-static {p2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    if-eqz p7, :cond_7

    goto :goto_4

    :cond_7
    return-void

    :cond_8
    :goto_4
    iput-wide v6, v3, Lb9/i;->e:J

    invoke-virtual {v3}, Lb9/i;->a()V

    return-void
.end method

.method public final v(Lu8/e0;FZZ)V
    .locals 4

    if-eqz p3, :cond_1

    if-eqz p4, :cond_0

    iget-object p3, p0, Lb9/l0;->c0:Lab/y;

    const/4 p4, 0x1

    invoke-virtual {p3, p4}, Lab/y;->c(I)V

    :cond_0
    iget-object p3, p0, Lb9/l0;->b0:Lb9/c1;

    invoke-virtual {p3, p1}, Lb9/c1;->g(Lu8/e0;)Lb9/c1;

    move-result-object p3

    iput-object p3, p0, Lb9/l0;->b0:Lb9/c1;

    :cond_1
    iget p3, p1, Lu8/e0;->a:F

    iget-object p4, p0, Lb9/l0;->R:Lb9/s0;

    iget-object p4, p4, Lb9/s0;->i:Lb9/q0;

    :goto_0
    const/4 v0, 0x0

    if-eqz p4, :cond_4

    iget-object v1, p4, Lb9/q0;->o:Lo9/v;

    iget-object v1, v1, Lo9/v;->c:[Lo9/s;

    array-length v2, v1

    :goto_1
    if-ge v0, v2, :cond_3

    aget-object v3, v1, v0

    if-eqz v3, :cond_2

    invoke-interface {v3, p3}, Lo9/s;->f(F)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    iget-object p4, p4, Lb9/q0;->m:Lb9/q0;

    goto :goto_0

    :cond_4
    iget-object p3, p0, Lb9/l0;->w:[Lb9/j1;

    array-length p4, p3

    :goto_2
    if-ge v0, p4, :cond_6

    aget-object v1, p3, v0

    iget v2, p1, Lu8/e0;->a:F

    iget-object v3, v1, Lb9/j1;->e:Ljava/lang/Object;

    check-cast v3, Lb9/f;

    invoke-virtual {v3, p2, v2}, Lb9/f;->z(FF)V

    iget-object v1, v1, Lb9/j1;->f:Ljava/lang/Object;

    check-cast v1, Lb9/f;

    if-eqz v1, :cond_5

    invoke-virtual {v1, p2, v2}, Lb9/f;->z(FF)V

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_6
    return-void
.end method

.method public final v0(ZZ)V
    .locals 0

    iput-boolean p1, p0, Lb9/l0;->g0:Z

    if-eqz p1, :cond_0

    if-nez p2, :cond_0

    iget-object p1, p0, Lb9/l0;->P:Lx8/p;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    goto :goto_0

    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    iput-wide p1, p0, Lb9/l0;->h0:J

    return-void
.end method

.method public final w(Ll9/c0;JJJZI)Lb9/c1;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-wide/from16 v5, p4

    move/from16 v1, p9

    iget-boolean v3, v0, Lb9/l0;->t0:Z

    const/4 v7, 0x0

    if-nez v3, :cond_1

    iget-object v3, v0, Lb9/l0;->b0:Lb9/c1;

    iget-wide v8, v3, Lb9/c1;->s:J

    cmp-long v3, p2, v8

    if-nez v3, :cond_1

    iget-object v3, v0, Lb9/l0;->b0:Lb9/c1;

    iget-object v3, v3, Lb9/c1;->b:Ll9/c0;

    invoke-virtual {v2, v3}, Ll9/c0;->equals(Ljava/lang/Object;)Z

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
    iput-boolean v3, v0, Lb9/l0;->t0:Z

    invoke-virtual {v0}, Lb9/l0;->M()V

    iget-object v3, v0, Lb9/l0;->b0:Lb9/c1;

    iget-object v8, v3, Lb9/c1;->h:Ll9/g1;

    iget-object v9, v3, Lb9/c1;->i:Lo9/v;

    iget-object v10, v3, Lb9/c1;->j:Ljava/util/List;

    iget-object v11, v0, Lb9/l0;->S:Lb9/b1;

    iget-boolean v11, v11, Lb9/b1;->g:Z

    if-eqz v11, :cond_10

    iget-object v3, v0, Lb9/l0;->R:Lb9/s0;

    iget-object v3, v3, Lb9/s0;->i:Lb9/q0;

    if-nez v3, :cond_2

    sget-object v8, Ll9/g1;->d:Ll9/g1;

    goto :goto_2

    :cond_2
    iget-object v8, v3, Lb9/q0;->n:Ll9/g1;

    :goto_2
    if-nez v3, :cond_3

    iget-object v9, v0, Lb9/l0;->E:Lo9/v;

    goto :goto_3

    :cond_3
    iget-object v9, v3, Lb9/q0;->o:Lo9/v;

    :goto_3
    iget-object v10, v9, Lo9/v;->c:[Lo9/s;

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

    invoke-interface {v15, v7}, Lo9/s;->d(I)Lu8/p;

    move-result-object v15

    iget-object v15, v15, Lu8/p;->l:Lu8/c0;

    if-nez v15, :cond_4

    new-instance v15, Lu8/c0;

    new-array v4, v7, [Lu8/b0;

    invoke-direct {v15, v4}, Lu8/c0;-><init>([Lu8/b0;)V

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

    iget-object v4, v3, Lb9/q0;->g:Lb9/r0;

    iget-wide v11, v4, Lb9/r0;->c:J

    cmp-long v11, v11, v5

    if-eqz v11, :cond_8

    invoke-virtual {v4, v5, v6}, Lb9/r0;->a(J)Lb9/r0;

    move-result-object v4

    iput-object v4, v3, Lb9/q0;->g:Lb9/r0;

    :cond_8
    iget-object v3, v0, Lb9/l0;->w:[Lb9/j1;

    iget-object v4, v0, Lb9/l0;->R:Lb9/s0;

    iget-object v11, v4, Lb9/s0;->i:Lb9/q0;

    iget-object v4, v4, Lb9/s0;->j:Lb9/q0;

    if-eq v11, v4, :cond_9

    goto :goto_b

    :cond_9
    if-eqz v11, :cond_f

    iget-object v4, v11, Lb9/q0;->o:Lo9/v;

    move v11, v7

    move v12, v11

    :goto_8
    array-length v13, v3

    if-ge v11, v13, :cond_c

    invoke-virtual {v4, v11}, Lo9/v;->b(I)Z

    move-result v13

    if-eqz v13, :cond_b

    aget-object v13, v3, v11

    iget-object v13, v13, Lb9/j1;->e:Ljava/lang/Object;

    check-cast v13, Lb9/f;

    iget v13, v13, Lb9/f;->x:I

    const/4 v14, 0x1

    if-eq v13, v14, :cond_a

    move v14, v7

    goto :goto_9

    :cond_a
    iget-object v13, v4, Lo9/v;->b:[Lb9/i1;

    aget-object v13, v13, v11

    iget v13, v13, Lb9/i1;->a:I

    if-eqz v13, :cond_b

    const/4 v12, 0x1

    :cond_b
    add-int/lit8 v11, v11, 0x1

    goto :goto_8

    :cond_c
    const/4 v14, 0x1

    :goto_9
    if-eqz v12, :cond_d

    if-eqz v14, :cond_d

    const/4 v14, 0x1

    goto :goto_a

    :cond_d
    move v14, v7

    :goto_a
    iget-boolean v3, v0, Lb9/l0;->n0:Z

    if-ne v14, v3, :cond_e

    goto :goto_b

    :cond_e
    iput-boolean v14, v0, Lb9/l0;->n0:Z

    if-nez v14, :cond_f

    iget-object v3, v0, Lb9/l0;->b0:Lb9/c1;

    iget-boolean v3, v3, Lb9/c1;->p:Z

    if-eqz v3, :cond_f

    iget-object v3, v0, Lb9/l0;->H:Lx8/r;

    const/4 v4, 0x2

    invoke-virtual {v3, v4}, Lx8/r;->e(I)Z

    :cond_f
    :goto_b
    move-object v11, v8

    move-object v12, v9

    move-object v13, v10

    goto :goto_c

    :cond_10
    iget-object v3, v3, Lb9/c1;->b:Ll9/c0;

    invoke-virtual {v2, v3}, Ll9/c0;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    sget-object v8, Ll9/g1;->d:Ll9/g1;

    iget-object v9, v0, Lb9/l0;->E:Lo9/v;

    sget-object v10, Lzr/w0;->E:Lzr/w0;

    goto :goto_b

    :goto_c
    if-eqz p8, :cond_13

    iget-object v3, v0, Lb9/l0;->c0:Lab/y;

    iget-boolean v4, v3, Lab/y;->d:Z

    if-eqz v4, :cond_12

    iget v4, v3, Lab/y;->f:I

    const/4 v8, 0x5

    if-eq v4, v8, :cond_12

    if-ne v1, v8, :cond_11

    const/4 v4, 0x1

    goto :goto_d

    :cond_11
    move v4, v7

    :goto_d
    invoke-static {v4}, Lva3/g;->d(Z)V

    goto :goto_e

    :cond_12
    const/4 v14, 0x1

    iput-boolean v14, v3, Lab/y;->c:Z

    iput-boolean v14, v3, Lab/y;->d:Z

    iput v1, v3, Lab/y;->f:I

    :cond_13
    :goto_e
    iget-object v1, v0, Lb9/l0;->b0:Lb9/c1;

    iget-wide v3, v1, Lb9/c1;->q:J

    invoke-virtual {v0, v3, v4}, Lb9/l0;->n(J)J

    move-result-wide v9

    move-wide/from16 v3, p2

    move-wide/from16 v7, p6

    invoke-virtual/range {v1 .. v13}, Lb9/c1;->d(Ll9/c0;JJJJLl9/g1;Lo9/v;Ljava/util/List;)Lb9/c1;

    move-result-object v1

    return-object v1
.end method

.method public final declared-synchronized w0(Lyr/i;J)V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lb9/l0;->P:Lx8/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    add-long/2addr v0, p2

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Lyr/i;->get()Ljava/lang/Object;

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
    iget-object v3, p0, Lb9/l0;->P:Lx8/p;

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
    iget-object p2, p0, Lb9/l0;->P:Lx8/p;

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

.method public final y()Z
    .locals 5

    iget-object v0, p0, Lb9/l0;->R:Lb9/s0;

    iget-object v0, v0, Lb9/s0;->i:Lb9/q0;

    iget-object v1, v0, Lb9/q0;->g:Lb9/r0;

    iget-wide v1, v1, Lb9/r0;->e:J

    iget-boolean v0, v0, Lb9/q0;->e:Z

    if-eqz v0, :cond_1

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v1, v3

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb9/l0;->b0:Lb9/c1;

    iget-wide v3, v0, Lb9/c1;->s:J

    cmp-long v0, v3, v1

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Lb9/l0;->k0()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final z()V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lb9/l0;->R:Lb9/s0;

    iget-object v1, v1, Lb9/s0;->l:Lb9/q0;

    invoke-static {v1}, Lb9/l0;->x(Lb9/q0;)Z

    move-result v1

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    if-nez v1, :cond_0

    move v1, v6

    goto/16 :goto_2

    :cond_0
    iget-object v1, v0, Lb9/l0;->R:Lb9/s0;

    iget-object v1, v1, Lb9/s0;->l:Lb9/q0;

    iget-boolean v7, v1, Lb9/q0;->e:Z

    if-nez v7, :cond_1

    move-wide v7, v4

    goto :goto_0

    :cond_1
    iget-object v7, v1, Lb9/q0;->a:Ljava/lang/Object;

    invoke-interface {v7}, Ll9/b1;->d()J

    move-result-wide v7

    :goto_0
    invoke-virtual {v0, v7, v8}, Lb9/l0;->n(J)J

    move-result-wide v11

    iget-object v7, v0, Lb9/l0;->R:Lb9/s0;

    iget-object v7, v7, Lb9/s0;->i:Lb9/q0;

    iget-object v7, v0, Lb9/l0;->b0:Lb9/c1;

    iget-object v7, v7, Lb9/c1;->a:Lu8/o0;

    iget-object v1, v1, Lb9/q0;->g:Lb9/r0;

    iget-object v1, v1, Lb9/r0;->a:Ll9/c0;

    invoke-virtual {v0, v7, v1}, Lb9/l0;->l0(Lu8/o0;Ll9/c0;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v0, Lb9/l0;->T:Lb9/i;

    iget-wide v7, v1, Lb9/i;->i:J

    move-wide v15, v7

    goto :goto_1

    :cond_2
    move-wide v15, v2

    :goto_1
    new-instance v9, Lb9/m0;

    iget-object v10, v0, Lb9/l0;->V:Lc9/n;

    iget-object v1, v0, Lb9/l0;->b0:Lb9/c1;

    iget-object v1, v1, Lb9/c1;->a:Lu8/o0;

    iget-object v1, v0, Lb9/l0;->N:Lb9/l;

    invoke-virtual {v1}, Lb9/l;->b()Lu8/e0;

    move-result-object v1

    iget v13, v1, Lu8/e0;->a:F

    iget-object v1, v0, Lb9/l0;->b0:Lb9/c1;

    iget-boolean v1, v1, Lb9/c1;->l:Z

    iget-boolean v14, v0, Lb9/l0;->g0:Z

    invoke-direct/range {v9 .. v16}, Lb9/m0;-><init>(Lc9/n;JFZJ)V

    iget-object v1, v0, Lb9/l0;->F:Lb9/k;

    invoke-virtual {v1, v9}, Lb9/k;->c(Lb9/m0;)Z

    move-result v1

    iget-object v7, v0, Lb9/l0;->R:Lb9/s0;

    iget-object v7, v7, Lb9/s0;->i:Lb9/q0;

    if-nez v1, :cond_4

    iget-boolean v8, v7, Lb9/q0;->e:Z

    if-eqz v8, :cond_4

    const-wide/32 v13, 0x7a120

    cmp-long v8, v11, v13

    if-gez v8, :cond_4

    iget-wide v10, v0, Lb9/l0;->M:J

    cmp-long v8, v10, v4

    if-gtz v8, :cond_3

    goto :goto_2

    :cond_3
    iget-object v1, v7, Lb9/q0;->a:Ljava/lang/Object;

    iget-object v7, v0, Lb9/l0;->b0:Lb9/c1;

    iget-wide v7, v7, Lb9/c1;->s:J

    invoke-interface {v1, v7, v8}, Ll9/a0;->i(J)V

    iget-object v1, v0, Lb9/l0;->F:Lb9/k;

    invoke-virtual {v1, v9}, Lb9/k;->c(Lb9/m0;)Z

    move-result v1

    :cond_4
    :goto_2
    iput-boolean v1, v0, Lb9/l0;->i0:Z

    if-eqz v1, :cond_a

    iget-object v1, v0, Lb9/l0;->R:Lb9/s0;

    iget-object v1, v1, Lb9/s0;->l:Lb9/q0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v7, Lb9/n0;

    invoke-direct {v7}, Lb9/n0;-><init>()V

    iget-wide v8, v0, Lb9/l0;->q0:J

    iget-wide v10, v1, Lb9/q0;->p:J

    sub-long/2addr v8, v10

    iput-wide v8, v7, Lb9/n0;->a:J

    iget-object v8, v0, Lb9/l0;->N:Lb9/l;

    invoke-virtual {v8}, Lb9/l;->b()Lu8/e0;

    move-result-object v8

    iget v8, v8, Lu8/e0;->a:F

    const/4 v9, 0x0

    cmpl-float v9, v8, v9

    const/4 v10, 0x1

    if-gtz v9, :cond_6

    const v9, -0x800001

    cmpl-float v9, v8, v9

    if-nez v9, :cond_5

    goto :goto_3

    :cond_5
    move v9, v6

    goto :goto_4

    :cond_6
    :goto_3
    move v9, v10

    :goto_4
    invoke-static {v9}, Lva3/g;->d(Z)V

    iput v8, v7, Lb9/n0;->b:F

    iget-wide v8, v0, Lb9/l0;->h0:J

    cmp-long v4, v8, v4

    if-gez v4, :cond_8

    cmp-long v2, v8, v2

    if-nez v2, :cond_7

    goto :goto_5

    :cond_7
    move v2, v6

    goto :goto_6

    :cond_8
    :goto_5
    move v2, v10

    :goto_6
    invoke-static {v2}, Lva3/g;->d(Z)V

    iput-wide v8, v7, Lb9/n0;->c:J

    new-instance v2, Lb9/o0;

    invoke-direct {v2, v7}, Lb9/o0;-><init>(Lb9/n0;)V

    iget-object v3, v1, Lb9/q0;->m:Lb9/q0;

    if-nez v3, :cond_9

    move v6, v10

    :cond_9
    invoke-static {v6}, Lva3/g;->i(Z)V

    iget-object v1, v1, Lb9/q0;->a:Ljava/lang/Object;

    invoke-interface {v1, v2}, Ll9/b1;->x(Lb9/o0;)Z

    :cond_a
    invoke-virtual {v0}, Lb9/l0;->p0()V

    return-void
.end method

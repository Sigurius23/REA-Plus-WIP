.class public final Ld9/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final j0:Ljava/lang/Object;

.field public static k0:Ljava/util/concurrent/ScheduledExecutorService;

.field public static l0:I


# instance fields
.field public A:Ld9/r;

.field public B:Ld9/r;

.field public C:Lu8/e0;

.field public D:Z

.field public E:Ljava/nio/ByteBuffer;

.field public F:I

.field public G:J

.field public H:J

.field public I:J

.field public J:J

.field public K:I

.field public L:Z

.field public M:Z

.field public N:J

.field public O:F

.field public P:Ljava/nio/ByteBuffer;

.field public Q:I

.field public R:Ljava/nio/ByteBuffer;

.field public S:Z

.field public T:Z

.field public U:Z

.field public V:Z

.field public W:Z

.field public X:I

.field public Y:Lu8/e;

.field public Z:Lro/i;

.field public final a:Landroid/content/Context;

.field public a0:Z

.field public final b:La33/d;

.field public b0:J

.field public final c:Ld9/n;

.field public c0:J

.field public final d:Ld9/e0;

.field public d0:Z

.field public final e:Lzr/w0;

.field public e0:Z

.field public final f:Lzr/w0;

.field public f0:Landroid/os/Looper;

.field public final g:Ld9/m;

.field public g0:J

.field public final h:Ljava/util/ArrayDeque;

.field public h0:J

.field public final i:Z

.field public i0:Landroid/os/Handler;

.field public j:I

.field public k:Ld9/w;

.field public final l:Ld9/t;

.field public final m:Ld9/t;

.field public final n:Ld9/y;

.field public final o:Lqg3/d;

.field public final p:Ld9/z;

.field public q:Lc9/n;

.field public r:Lro/i;

.field public s:Ld9/q;

.field public t:Ld9/q;

.field public u:Lv8/c;

.field public v:Landroid/media/AudioTrack;

.field public w:Ld9/b;

.field public x:Ld30/h;

.field public y:La33/d;

.field public z:Lu8/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ld9/x;->j0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ld9/p;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Ld9/p;->b:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Ld9/x;->a:Landroid/content/Context;

    sget-object v1, Lu8/d;->c:Lu8/d;

    iput-object v1, p0, Ld9/x;->z:Lu8/d;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p1, Ld9/p;->c:Ljava/lang/Object;

    check-cast v0, Ld9/b;

    :goto_0
    iput-object v0, p0, Ld9/x;->w:Ld9/b;

    iget-object v0, p1, Ld9/p;->d:Ljava/lang/Object;

    check-cast v0, La33/d;

    iput-object v0, p0, Ld9/x;->b:La33/d;

    sget v0, Lx8/t;->a:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Ld9/x;->i:Z

    iput v0, p0, Ld9/x;->j:I

    iget-object v1, p1, Ld9/p;->e:Ljava/lang/Object;

    check-cast v1, Ld9/y;

    iput-object v1, p0, Ld9/x;->n:Ld9/y;

    iget-object v1, p1, Ld9/p;->g:Ljava/lang/Object;

    check-cast v1, Lqg3/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v1, p0, Ld9/x;->o:Lqg3/d;

    new-instance v1, Ld9/m;

    new-instance v2, Lro/i;

    const/16 v3, 0x19

    invoke-direct {v2, p0, v3}, Lro/i;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v1, v2}, Ld9/m;-><init>(Lro/i;)V

    iput-object v1, p0, Ld9/x;->g:Ld9/m;

    new-instance v1, Ld9/n;

    invoke-direct {v1}, Lv8/f;-><init>()V

    iput-object v1, p0, Ld9/x;->c:Ld9/n;

    new-instance v2, Ld9/e0;

    invoke-direct {v2}, Lv8/f;-><init>()V

    sget-object v3, Lx8/t;->c:[B

    iput-object v3, v2, Ld9/e0;->m:[B

    iput-object v2, p0, Ld9/x;->d:Ld9/e0;

    new-instance v3, Lv8/i;

    invoke-direct {v3}, Lv8/f;-><init>()V

    sget-object v4, Lzr/g0;->x:Lzr/e0;

    filled-new-array {v3, v1, v2}, [Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x3

    invoke-static {v4, v3}, Lzr/q;->b(I[Ljava/lang/Object;)V

    invoke-static {v4, v3}, Lzr/g0;->j(I[Ljava/lang/Object;)Lzr/w0;

    move-result-object v3

    iput-object v3, p0, Ld9/x;->e:Lzr/w0;

    new-instance v3, Ld9/d0;

    invoke-direct {v3}, Lv8/f;-><init>()V

    filled-new-array {v3, v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v4, v1}, Lzr/q;->b(I[Ljava/lang/Object;)V

    invoke-static {v4, v1}, Lzr/g0;->j(I[Ljava/lang/Object;)Lzr/w0;

    move-result-object v1

    iput-object v1, p0, Ld9/x;->f:Lzr/w0;

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Ld9/x;->O:F

    iput v0, p0, Ld9/x;->X:I

    new-instance v1, Lu8/e;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Ld9/x;->Y:Lu8/e;

    new-instance v2, Ld9/r;

    sget-object v3, Lu8/e0;->d:Lu8/e0;

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    invoke-direct/range {v2 .. v7}, Ld9/r;-><init>(Lu8/e0;JJ)V

    iput-object v2, p0, Ld9/x;->B:Ld9/r;

    iput-object v3, p0, Ld9/x;->C:Lu8/e0;

    iput-boolean v0, p0, Ld9/x;->D:Z

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ld9/x;->h:Ljava/util/ArrayDeque;

    new-instance v0, Ld9/t;

    invoke-direct {v0}, Ld9/t;-><init>()V

    iput-object v0, p0, Ld9/x;->l:Ld9/t;

    new-instance v0, Ld9/t;

    invoke-direct {v0}, Ld9/t;-><init>()V

    iput-object v0, p0, Ld9/x;->m:Ld9/t;

    iget-object p1, p1, Ld9/p;->f:Ljava/lang/Object;

    check-cast p1, Ld9/z;

    iput-object p1, p0, Ld9/x;->p:Ld9/z;

    return-void
.end method

.method public static p(Landroid/media/AudioTrack;)Z
    .locals 2

    sget v0, Lx8/t;->a:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/media/AudioTrack;->isOffloadedPlayback()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a(J)V
    .locals 9

    invoke-virtual {p0}, Ld9/x;->y()Z

    move-result v0

    const/4 v1, 0x0

    iget-object v2, p0, Ld9/x;->b:La33/d;

    if-nez v0, :cond_5

    iget-boolean v0, p0, Ld9/x;->a0:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Ld9/x;->t:Ld9/q;

    iget v3, v0, Ld9/q;->c:I

    if-nez v3, :cond_3

    iget-object v0, v0, Ld9/q;->a:Lu8/p;

    iget v0, v0, Lu8/p;->F:I

    iget-object v0, p0, Ld9/x;->C:Lu8/e0;

    iget-object v3, v2, La33/d;->z:Ljava/lang/Object;

    check-cast v3, Lv8/h;

    iget v4, v0, Lu8/e0;->a:F

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x0

    cmpl-float v6, v4, v5

    const/4 v7, 0x1

    if-lez v6, :cond_0

    move v6, v7

    goto :goto_0

    :cond_0
    move v6, v1

    :goto_0
    invoke-static {v6}, Lva3/g;->d(Z)V

    iget v6, v3, Lv8/h;->c:F

    cmpl-float v6, v6, v4

    if-eqz v6, :cond_1

    iput v4, v3, Lv8/h;->c:F

    iput-boolean v7, v3, Lv8/h;->i:Z

    :cond_1
    iget v4, v0, Lu8/e0;->b:F

    cmpl-float v5, v4, v5

    if-lez v5, :cond_2

    move v5, v7

    goto :goto_1

    :cond_2
    move v5, v1

    :goto_1
    invoke-static {v5}, Lva3/g;->d(Z)V

    iget v5, v3, Lv8/h;->d:F

    cmpl-float v5, v5, v4

    if-eqz v5, :cond_4

    iput v4, v3, Lv8/h;->d:F

    iput-boolean v7, v3, Lv8/h;->i:Z

    goto :goto_2

    :cond_3
    sget-object v0, Lu8/e0;->d:Lu8/e0;

    :cond_4
    :goto_2
    iput-object v0, p0, Ld9/x;->C:Lu8/e0;

    :goto_3
    move-object v4, v0

    goto :goto_4

    :cond_5
    sget-object v0, Lu8/e0;->d:Lu8/e0;

    goto :goto_3

    :goto_4
    iget-boolean v0, p0, Ld9/x;->a0:Z

    if-nez v0, :cond_6

    iget-object v0, p0, Ld9/x;->t:Ld9/q;

    iget v3, v0, Ld9/q;->c:I

    if-nez v3, :cond_6

    iget-object v0, v0, Ld9/q;->a:Lu8/p;

    iget v0, v0, Lu8/p;->F:I

    iget-boolean v1, p0, Ld9/x;->D:Z

    iget-object v0, v2, La33/d;->y:Ljava/lang/Object;

    check-cast v0, Ld9/c0;

    iput-boolean v1, v0, Ld9/c0;->o:Z

    :cond_6
    iput-boolean v1, p0, Ld9/x;->D:Z

    new-instance v3, Ld9/r;

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    iget-object p1, p0, Ld9/x;->t:Ld9/q;

    invoke-virtual {p0}, Ld9/x;->k()J

    move-result-wide v0

    iget p1, p1, Ld9/q;->e:I

    invoke-static {p1, v0, v1}, Lx8/t;->O(IJ)J

    move-result-wide v7

    invoke-direct/range {v3 .. v8}, Ld9/r;-><init>(Lu8/e0;JJ)V

    iget-object p1, p0, Ld9/x;->h:Ljava/util/ArrayDeque;

    invoke-virtual {p1, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Ld9/x;->t:Ld9/q;

    iget-object p1, p1, Ld9/q;->i:Lv8/c;

    iput-object p1, p0, Ld9/x;->u:Lv8/c;

    invoke-virtual {p1}, Lv8/c;->a()V

    iget-object p1, p0, Ld9/x;->r:Lro/i;

    if-eqz p1, :cond_7

    iget-boolean p2, p0, Ld9/x;->D:Z

    iget-object p1, p1, Lro/i;->x:Ljava/lang/Object;

    check-cast p1, Ld9/a0;

    iget-object p1, p1, Ld9/a0;->d1:Lio/sentry/internal/debugmeta/c;

    iget-object v0, p1, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    if-eqz v0, :cond_7

    new-instance v1, Ld9/i;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Ld9/i;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_7
    return-void
.end method

.method public final b(Ld9/j;Lu8/d;ILu8/p;)Landroid/media/AudioTrack;
    .locals 9

    :try_start_0
    iget-object v0, p0, Ld9/x;->p:Ld9/z;

    invoke-virtual {v0, p1, p2, p3}, Ld9/z;->a(Ld9/j;Lu8/d;I)Landroid/media/AudioTrack;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    invoke-virtual {p2}, Landroid/media/AudioTrack;->getState()I

    move-result v1

    const/4 p3, 0x1

    if-ne v1, p3, :cond_0

    return-object p2

    :cond_0
    :try_start_1
    invoke-virtual {p2}, Landroid/media/AudioTrack;->release()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    new-instance v0, Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;

    iget v2, p1, Ld9/j;->c:I

    iget v3, p1, Ld9/j;->e:I

    iget v4, p1, Ld9/j;->b:I

    iget-boolean v6, p1, Ld9/j;->d:Z

    const/4 v7, 0x0

    move-object v5, p4

    invoke-direct/range {v0 .. v7}, Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;-><init>(IIIILu8/p;ZLjava/lang/RuntimeException;)V

    throw v0

    :catch_1
    move-exception v0

    :goto_0
    move-object v5, p4

    move-object p2, v0

    move-object v8, p2

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_0

    :goto_1
    new-instance v1, Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;

    iget v3, p1, Ld9/j;->c:I

    iget v4, p1, Ld9/j;->e:I

    move-object v6, v5

    iget v5, p1, Ld9/j;->b:I

    iget-boolean v7, p1, Ld9/j;->d:Z

    const/4 v2, 0x0

    invoke-direct/range {v1 .. v8}, Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;-><init>(IIIILu8/p;ZLjava/lang/RuntimeException;)V

    throw v1
.end method

.method public final c(Ld9/q;)Landroid/media/AudioTrack;
    .locals 3

    :try_start_0
    invoke-virtual {p1}, Ld9/q;->a()Ld9/j;

    move-result-object v0

    iget-object v1, p0, Ld9/x;->z:Lu8/d;

    iget v2, p0, Ld9/x;->X:I

    iget-object p1, p1, Ld9/q;->a:Lu8/p;

    invoke-virtual {p0, v0, v1, v2, p1}, Ld9/x;->b(Ld9/j;Lu8/d;ILu8/p;)Landroid/media/AudioTrack;

    move-result-object p1
    :try_end_0
    .catch Landroidx/media3/exoplayer/audio/AudioSink$InitializationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Ld9/x;->r:Lro/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lro/i;->x(Ljava/lang/Exception;)V

    :cond_0
    throw p1
.end method

.method public final d(Lu8/p;[I)V
    .locals 27

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    invoke-virtual {v1}, Ld9/x;->q()V

    iget-object v0, v3, Lu8/p;->n:Ljava/lang/String;

    iget v2, v3, Lu8/p;->E:I

    iget v4, v3, Lu8/p;->D:I

    iget v5, v3, Lu8/p;->F:I

    const-string v6, "audio/raw"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    iget-boolean v8, v1, Ld9/x;->i:Z

    const/4 v9, 0x1

    const/4 v10, -0x1

    const/4 v11, 0x0

    if-eqz v6, :cond_4

    invoke-static {v5}, Lx8/t;->G(I)Z

    move-result v6

    invoke-static {v6}, Lva3/g;->d(Z)V

    invoke-static {v5}, Lx8/t;->r(I)I

    move-result v6

    mul-int/2addr v6, v4

    new-instance v12, Lzr/d0;

    const/4 v13, 0x4

    invoke-direct {v12, v13}, Lzr/a0;-><init>(I)V

    iget-object v13, v1, Ld9/x;->e:Lzr/w0;

    invoke-virtual {v12, v13}, Lzr/a0;->c(Ljava/lang/Iterable;)V

    iget-object v13, v1, Ld9/x;->b:La33/d;

    iget-object v13, v13, La33/d;->x:Ljava/lang/Object;

    check-cast v13, [Lv8/e;

    array-length v14, v13

    invoke-static {v14, v13}, Lzr/q;->b(I[Ljava/lang/Object;)V

    invoke-virtual {v12, v14}, Lzr/a0;->d(I)V

    iget-object v15, v12, Lzr/a0;->a:[Ljava/lang/Object;

    iget v7, v12, Lzr/a0;->b:I

    invoke-static {v13, v11, v15, v7, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v7, v12, Lzr/a0;->b:I

    add-int/2addr v7, v14

    iput v7, v12, Lzr/a0;->b:I

    new-instance v7, Lv8/c;

    invoke-virtual {v12}, Lzr/d0;->f()Lzr/w0;

    move-result-object v12

    invoke-direct {v7, v12}, Lv8/c;-><init>(Lzr/g0;)V

    iget-object v12, v1, Ld9/x;->u:Lv8/c;

    invoke-virtual {v7, v12}, Lv8/c;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_0

    iget-object v7, v1, Ld9/x;->u:Lv8/c;

    :cond_0
    iget v12, v3, Lu8/p;->G:I

    iget v13, v3, Lu8/p;->H:I

    iget-object v14, v1, Ld9/x;->d:Ld9/e0;

    iput v12, v14, Ld9/e0;->i:I

    iput v13, v14, Ld9/e0;->j:I

    iget-object v12, v1, Ld9/x;->c:Ld9/n;

    move-object/from16 v13, p2

    iput-object v13, v12, Ld9/n;->i:[I

    new-instance v12, Lv8/d;

    invoke-direct {v12, v2, v4, v5}, Lv8/d;-><init>(III)V

    :try_start_0
    iget-object v2, v7, Lv8/c;->a:Lzr/g0;

    sget-object v4, Lv8/d;->e:Lv8/d;

    invoke-virtual {v12, v4}, Lv8/d;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v5

    if-ge v4, v5, :cond_2

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lv8/e;

    invoke-interface {v5, v12}, Lv8/e;->e(Lv8/d;)Lv8/d;

    move-result-object v13

    invoke-interface {v5}, Lv8/e;->isActive()Z

    move-result v5

    if-eqz v5, :cond_1

    sget-object v5, Lv8/d;->e:Lv8/d;

    invoke-virtual {v13, v5}, Lv8/d;->equals(Ljava/lang/Object;)Z

    move-result v5

    xor-int/lit8 v5, v5, 0x1

    invoke-static {v5}, Lva3/g;->i(Z)V
    :try_end_0
    .catch Landroidx/media3/common/audio/AudioProcessor$UnhandledAudioFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v12, v13

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    iget v2, v12, Lv8/d;->b:I

    iget v4, v12, Lv8/d;->c:I

    iget v5, v12, Lv8/d;->a:I

    invoke-static {v2}, Lx8/t;->q(I)I

    move-result v12

    invoke-static {v4}, Lx8/t;->r(I)I

    move-result v13

    mul-int/2addr v13, v2

    move v2, v12

    move v12, v8

    move v8, v2

    move-object v2, v7

    move v14, v11

    move v7, v5

    move v5, v13

    move v13, v14

    goto/16 :goto_2

    :cond_3
    :try_start_1
    new-instance v0, Landroidx/media3/common/audio/AudioProcessor$UnhandledAudioFormatException;

    invoke-direct {v0, v12}, Landroidx/media3/common/audio/AudioProcessor$UnhandledAudioFormatException;-><init>(Lv8/d;)V

    throw v0
    :try_end_1
    .catch Landroidx/media3/common/audio/AudioProcessor$UnhandledAudioFormatException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception v0

    new-instance v2, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;

    invoke-direct {v2, v0, v3}, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;-><init>(Landroidx/media3/common/audio/AudioProcessor$UnhandledAudioFormatException;Lu8/p;)V

    throw v2

    :cond_4
    new-instance v7, Lv8/c;

    sget-object v5, Lzr/w0;->E:Lzr/w0;

    invoke-direct {v7, v5}, Lv8/c;-><init>(Lzr/g0;)V

    iget v5, v1, Ld9/x;->j:I

    if-eqz v5, :cond_5

    invoke-virtual/range {p0 .. p1}, Ld9/x;->h(Lu8/p;)Ld9/g;

    move-result-object v5

    goto :goto_1

    :cond_5
    sget-object v5, Ld9/g;->d:Ld9/g;

    :goto_1
    iget v6, v1, Ld9/x;->j:I

    if-eqz v6, :cond_6

    iget-boolean v6, v5, Ld9/g;->a:Z

    if-eqz v6, :cond_6

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, v3, Lu8/p;->k:Ljava/lang/String;

    invoke-static {v0, v6}, Lu8/d0;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-result v6

    invoke-static {v4}, Lx8/t;->q(I)I

    move-result v12

    iget-boolean v4, v5, Ld9/g;->b:Z

    move-object v5, v7

    move v7, v2

    move-object v2, v5

    move v13, v4

    move v4, v6

    move v14, v9

    move v5, v10

    move v6, v5

    move v8, v12

    move v12, v14

    goto :goto_2

    :cond_6
    iget-object v4, v1, Ld9/x;->w:Ld9/b;

    iget-object v5, v1, Ld9/x;->z:Lu8/d;

    invoke-virtual {v4, v5, v3}, Ld9/b;->d(Lu8/d;Lu8/p;)Landroid/util/Pair;

    move-result-object v4

    if-eqz v4, :cond_18

    iget-object v5, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v12

    move-object v4, v7

    move v7, v2

    move-object v2, v4

    move v4, v12

    move v12, v8

    move v8, v4

    move v4, v5

    move v5, v10

    move v6, v5

    move v13, v11

    const/4 v14, 0x2

    :goto_2
    const-string v15, ") for: "

    if-eqz v4, :cond_17

    if-eqz v8, :cond_16

    iget v15, v3, Lu8/p;->j:I

    const-string v11, "audio/vnd.dts.hd;profile=lbr"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    if-ne v15, v10, :cond_7

    const v15, 0xbb800

    :cond_7
    invoke-static {v7, v8, v4}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    move-result v0

    const/4 v11, -0x2

    if-eq v0, v11, :cond_8

    move v11, v9

    goto :goto_3

    :cond_8
    const/4 v11, 0x0

    :goto_3
    invoke-static {v11}, Lva3/g;->i(Z)V

    if-eq v5, v10, :cond_9

    move v11, v5

    goto :goto_4

    :cond_9
    move v11, v9

    :goto_4
    if-eqz v12, :cond_a

    const-wide/high16 v17, 0x4020000000000000L    # 8.0

    goto :goto_5

    :cond_a
    const-wide/high16 v17, 0x3ff0000000000000L    # 1.0

    :goto_5
    iget-object v10, v1, Ld9/x;->n:Ld9/y;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/32 v20, 0xf4240

    if-eqz v14, :cond_14

    if-eq v14, v9, :cond_13

    move/from16 v22, v9

    const/4 v9, 0x2

    if-ne v14, v9, :cond_12

    const/4 v9, 0x5

    const/16 v10, 0x8

    if-ne v4, v9, :cond_b

    const v9, 0x7a120

    :goto_6
    move/from16 v16, v10

    :goto_7
    const/4 v10, -0x1

    goto :goto_8

    :cond_b
    if-ne v4, v10, :cond_c

    const v9, 0xf4240

    goto :goto_6

    :cond_c
    move/from16 v16, v10

    const v9, 0x3d090

    goto :goto_7

    :goto_8
    if-eq v15, v10, :cond_11

    sget-object v10, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    div-int/lit8 v19, v15, 0x8

    mul-int v23, v16, v19

    sub-int v23, v15, v23

    if-nez v23, :cond_d

    goto :goto_a

    :cond_d
    xor-int/lit8 v15, v15, 0x8

    shr-int/lit8 v15, v15, 0x1f

    or-int/lit8 v15, v15, 0x1

    sget-object v24, Lbs/d;->a:[I

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v10, v24, v10

    packed-switch v10, :pswitch_data_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :pswitch_0
    invoke-static/range {v23 .. v23}, Ljava/lang/Math;->abs(I)I

    move-result v10

    invoke-static/range {v16 .. v16}, Ljava/lang/Math;->abs(I)I

    move-result v16

    sub-int v16, v16, v10

    sub-int v10, v10, v16

    if-nez v10, :cond_e

    sget-object v10, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    sget-object v10, Ljava/math/RoundingMode;->HALF_EVEN:Ljava/math/RoundingMode;

    goto :goto_a

    :cond_e
    if-lez v10, :cond_f

    goto :goto_9

    :pswitch_1
    if-lez v15, :cond_f

    goto :goto_9

    :pswitch_2
    if-gez v15, :cond_f

    :goto_9
    :pswitch_3
    add-int v19, v19, v15

    goto :goto_a

    :pswitch_4
    if-nez v23, :cond_10

    :cond_f
    :goto_a
    :pswitch_5
    move-object/from16 v16, v2

    move/from16 v10, v19

    goto :goto_b

    :cond_10
    new-instance v0, Ljava/lang/ArithmeticException;

    const-string v2, "mode was UNNECESSARY, but rounding was necessary"

    invoke-direct {v0, v2}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    invoke-static {v4}, Ld9/y;->a(I)I

    move-result v19

    goto :goto_a

    :goto_b
    int-to-long v2, v9

    int-to-long v9, v10

    mul-long/2addr v2, v9

    div-long v2, v2, v20

    invoke-static {v2, v3}, Lvd/f;->k(J)I

    move-result v2

    :goto_c
    move/from16 p2, v4

    goto :goto_d

    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_13
    move-object/from16 v16, v2

    move/from16 v22, v9

    invoke-static {v4}, Ld9/y;->a(I)I

    move-result v2

    const v3, 0x2faf080

    int-to-long v9, v3

    int-to-long v2, v2

    mul-long/2addr v9, v2

    div-long v9, v9, v20

    invoke-static {v9, v10}, Lvd/f;->k(J)I

    move-result v2

    goto :goto_c

    :cond_14
    move-object/from16 v16, v2

    move/from16 v22, v9

    mul-int/lit8 v2, v0, 0x4

    const v3, 0x3d090

    int-to-long v9, v3

    move/from16 p2, v4

    int-to-long v3, v7

    mul-long/2addr v9, v3

    move-wide/from16 v23, v3

    int-to-long v3, v11

    mul-long/2addr v9, v3

    div-long v9, v9, v20

    invoke-static {v9, v10}, Lvd/f;->k(J)I

    move-result v9

    const v10, 0xb71b0

    move-wide/from16 v25, v3

    int-to-long v3, v10

    mul-long v3, v3, v23

    mul-long v3, v3, v25

    div-long v3, v3, v20

    invoke-static {v3, v4}, Lvd/f;->k(J)I

    move-result v3

    invoke-static {v2, v9, v3}, Lx8/t;->g(III)I

    move-result v2

    :goto_d
    int-to-double v2, v2

    mul-double v2, v2, v17

    double-to-int v2, v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr v0, v11

    add-int/lit8 v0, v0, -0x1

    div-int/2addr v0, v11

    mul-int v10, v0, v11

    const/4 v0, 0x0

    iput-boolean v0, v1, Ld9/x;->d0:Z

    new-instance v2, Ld9/q;

    move v4, v6

    move v6, v5

    move v5, v14

    iget-boolean v14, v1, Ld9/x;->a0:Z

    move-object/from16 v3, p1

    move/from16 v9, p2

    move-object/from16 v11, v16

    invoke-direct/range {v2 .. v14}, Ld9/q;-><init>(Lu8/p;IIIIIIILv8/c;ZZZ)V

    invoke-virtual {v1}, Ld9/x;->o()Z

    move-result v0

    if-eqz v0, :cond_15

    iput-object v2, v1, Ld9/x;->s:Ld9/q;

    return-void

    :cond_15
    iput-object v2, v1, Ld9/x;->t:Ld9/q;

    return-void

    :cond_16
    move v5, v14

    new-instance v0, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Invalid output channel config (mode="

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;-><init>(Ljava/lang/String;Lu8/p;)V

    throw v0

    :cond_17
    move v5, v14

    new-instance v0, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Invalid output encoding (mode="

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;-><init>(Ljava/lang/String;Lu8/p;)V

    throw v0

    :cond_18
    new-instance v0, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Unable to configure passthrough for: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;-><init>(Ljava/lang/String;Lu8/p;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_5
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(J)V
    .locals 12

    iget-object v0, p0, Ld9/x;->m:Ld9/t;

    iget-object v1, p0, Ld9/x;->R:Ljava/nio/ByteBuffer;

    if-nez v1, :cond_0

    goto/16 :goto_8

    :cond_0
    iget-object v1, v0, Ld9/t;->c:Ljava/io/Serializable;

    check-cast v1, Ljava/lang/Exception;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    sget-object v1, Ld9/x;->j0:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget v4, Ld9/x;->l0:I

    if-lez v4, :cond_2

    move v4, v3

    goto :goto_0

    :cond_2
    move v4, v2

    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_3

    goto/16 :goto_8

    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iget-wide v6, v0, Ld9/t;->b:J

    cmp-long v1, v4, v6

    if-gez v1, :cond_4

    goto/16 :goto_8

    :cond_4
    :goto_1
    iget-object v1, p0, Ld9/x;->R:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    move-result v6

    iget-boolean v1, p0, Ld9/x;->a0:Z

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v1, :cond_d

    cmp-long v1, p1, v10

    if-eqz v1, :cond_5

    move v1, v3

    goto :goto_2

    :cond_5
    move v1, v2

    :goto_2
    invoke-static {v1}, Lva3/g;->i(Z)V

    const-wide/high16 v4, -0x8000000000000000L

    cmp-long v1, p1, v4

    if-nez v1, :cond_6

    iget-wide p1, p0, Ld9/x;->b0:J

    goto :goto_3

    :cond_6
    iput-wide p1, p0, Ld9/x;->b0:J

    :goto_3
    iget-object v4, p0, Ld9/x;->v:Landroid/media/AudioTrack;

    iget-object v5, p0, Ld9/x;->R:Ljava/nio/ByteBuffer;

    sget v1, Lx8/t;->a:I

    const/16 v7, 0x1a

    const-wide/16 v8, 0x3e8

    if-lt v1, v7, :cond_7

    const/4 v7, 0x1

    mul-long/2addr v8, p1

    invoke-virtual/range {v4 .. v9}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;IIJ)I

    move-result p1

    goto :goto_4

    :cond_7
    iget-object v1, p0, Ld9/x;->E:Ljava/nio/ByteBuffer;

    if-nez v1, :cond_8

    const/16 v1, 0x10

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, p0, Ld9/x;->E:Ljava/nio/ByteBuffer;

    sget-object v7, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v7}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    iget-object v1, p0, Ld9/x;->E:Ljava/nio/ByteBuffer;

    const v7, 0x55550001

    invoke-virtual {v1, v7}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    :cond_8
    iget v1, p0, Ld9/x;->F:I

    if-nez v1, :cond_9

    iget-object v1, p0, Ld9/x;->E:Ljava/nio/ByteBuffer;

    const/4 v7, 0x4

    invoke-virtual {v1, v7, v6}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    iget-object v1, p0, Ld9/x;->E:Ljava/nio/ByteBuffer;

    const/16 v7, 0x8

    mul-long/2addr p1, v8

    invoke-virtual {v1, v7, p1, p2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    iget-object p1, p0, Ld9/x;->E:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iput v6, p0, Ld9/x;->F:I

    :cond_9
    iget-object p1, p0, Ld9/x;->E:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result p1

    if-lez p1, :cond_b

    iget-object p2, p0, Ld9/x;->E:Ljava/nio/ByteBuffer;

    invoke-virtual {v4, p2, p1, v3}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    move-result p2

    if-gez p2, :cond_a

    iput v2, p0, Ld9/x;->F:I

    move p1, p2

    goto :goto_4

    :cond_a
    if-ge p2, p1, :cond_b

    move p1, v2

    goto :goto_4

    :cond_b
    invoke-virtual {v4, v5, v6, v3}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    move-result p1

    if-gez p1, :cond_c

    iput v2, p0, Ld9/x;->F:I

    goto :goto_4

    :cond_c
    iget p2, p0, Ld9/x;->F:I

    sub-int/2addr p2, p1

    iput p2, p0, Ld9/x;->F:I

    goto :goto_4

    :cond_d
    iget-object p1, p0, Ld9/x;->v:Landroid/media/AudioTrack;

    iget-object p2, p0, Ld9/x;->R:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, p2, v6, v3}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    move-result p1

    :goto_4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iput-wide v4, p0, Ld9/x;->c0:J

    const-wide/16 v4, 0x0

    if-gez p1, :cond_16

    sget p2, Lx8/t;->a:I

    const/16 v1, 0x18

    if-lt p2, v1, :cond_e

    const/4 p2, -0x6

    if-eq p1, p2, :cond_f

    :cond_e
    const/16 p2, -0x20

    if-ne p1, p2, :cond_12

    :cond_f
    invoke-virtual {p0}, Ld9/x;->k()J

    move-result-wide v6

    cmp-long p2, v6, v4

    if-lez p2, :cond_11

    :cond_10
    :goto_5
    move v2, v3

    goto :goto_6

    :cond_11
    iget-object p2, p0, Ld9/x;->v:Landroid/media/AudioTrack;

    invoke-static {p2}, Ld9/x;->p(Landroid/media/AudioTrack;)Z

    move-result p2

    if-eqz p2, :cond_12

    iget-object p2, p0, Ld9/x;->t:Ld9/q;

    iget p2, p2, Ld9/q;->c:I

    if-ne p2, v3, :cond_10

    iput-boolean v3, p0, Ld9/x;->d0:Z

    goto :goto_5

    :cond_12
    :goto_6
    new-instance p2, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;

    iget-object v1, p0, Ld9/x;->t:Ld9/q;

    iget-object v1, v1, Ld9/q;->a:Lu8/p;

    invoke-direct {p2, p1, v1, v2}, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;-><init>(ILu8/p;Z)V

    iget-object p1, p0, Ld9/x;->r:Lro/i;

    if-eqz p1, :cond_13

    invoke-virtual {p1, p2}, Lro/i;->x(Ljava/lang/Exception;)V

    :cond_13
    iget-boolean p1, p2, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;->x:Z

    if-eqz p1, :cond_15

    iget-object p1, p0, Ld9/x;->a:Landroid/content/Context;

    if-nez p1, :cond_14

    goto :goto_7

    :cond_14
    sget-object p1, Ld9/b;->c:Ld9/b;

    iput-object p1, p0, Ld9/x;->w:Ld9/b;

    throw p2

    :cond_15
    :goto_7
    invoke-virtual {v0, p2}, Ld9/t;->a(Ljava/lang/Exception;)V

    return-void

    :cond_16
    const/4 p2, 0x0

    iput-object p2, v0, Ld9/t;->c:Ljava/io/Serializable;

    iput-wide v10, v0, Ld9/t;->a:J

    iput-wide v10, v0, Ld9/t;->b:J

    iget-object v0, p0, Ld9/x;->v:Landroid/media/AudioTrack;

    invoke-static {v0}, Ld9/x;->p(Landroid/media/AudioTrack;)Z

    move-result v0

    if-eqz v0, :cond_18

    iget-wide v0, p0, Ld9/x;->J:J

    cmp-long v0, v0, v4

    if-lez v0, :cond_17

    iput-boolean v2, p0, Ld9/x;->e0:Z

    :cond_17
    iget-boolean v0, p0, Ld9/x;->V:Z

    if-eqz v0, :cond_18

    iget-object v0, p0, Ld9/x;->r:Lro/i;

    if-eqz v0, :cond_18

    if-ge p1, v6, :cond_18

    iget-boolean v1, p0, Ld9/x;->e0:Z

    if-nez v1, :cond_18

    iget-object v0, v0, Lro/i;->x:Ljava/lang/Object;

    check-cast v0, Ld9/a0;

    iget-object v0, v0, Li9/o;->f0:Lb9/h0;

    if-eqz v0, :cond_18

    iget-object v0, v0, Lb9/h0;->a:Lb9/l0;

    iput-boolean v3, v0, Lb9/l0;->m0:Z

    :cond_18
    iget-object v0, p0, Ld9/x;->t:Ld9/q;

    iget v0, v0, Ld9/q;->c:I

    if-nez v0, :cond_19

    iget-wide v4, p0, Ld9/x;->I:J

    int-to-long v7, p1

    add-long/2addr v4, v7

    iput-wide v4, p0, Ld9/x;->I:J

    :cond_19
    if-ne p1, v6, :cond_1c

    if-eqz v0, :cond_1b

    iget-object p1, p0, Ld9/x;->R:Ljava/nio/ByteBuffer;

    iget-object v0, p0, Ld9/x;->P:Ljava/nio/ByteBuffer;

    if-ne p1, v0, :cond_1a

    move v2, v3

    :cond_1a
    invoke-static {v2}, Lva3/g;->i(Z)V

    iget-wide v0, p0, Ld9/x;->J:J

    iget p1, p0, Ld9/x;->K:I

    int-to-long v2, p1

    iget p1, p0, Ld9/x;->Q:I

    int-to-long v4, p1

    mul-long/2addr v2, v4

    add-long/2addr v2, v0

    iput-wide v2, p0, Ld9/x;->J:J

    :cond_1b
    iput-object p2, p0, Ld9/x;->R:Ljava/nio/ByteBuffer;

    :cond_1c
    :goto_8
    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final f()Z
    .locals 6

    iget-object v0, p0, Ld9/x;->u:Lv8/c;

    invoke-virtual {v0}, Lv8/c;->d()Z

    move-result v0

    const-wide/high16 v1, -0x8000000000000000L

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p0, v1, v2}, Ld9/x;->e(J)V

    iget-object v0, p0, Ld9/x;->R:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_4

    goto :goto_1

    :cond_0
    iget-object v0, p0, Ld9/x;->u:Lv8/c;

    invoke-virtual {v0}, Lv8/c;->d()Z

    move-result v5

    if-eqz v5, :cond_2

    iget-boolean v5, v0, Lv8/c;->d:Z

    if-eqz v5, :cond_1

    goto :goto_0

    :cond_1
    iput-boolean v4, v0, Lv8/c;->d:Z

    iget-object v0, v0, Lv8/c;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv8/e;

    invoke-interface {v0}, Lv8/e;->c()V

    :cond_2
    :goto_0
    invoke-virtual {p0, v1, v2}, Ld9/x;->t(J)V

    iget-object v0, p0, Ld9/x;->u:Lv8/c;

    invoke-virtual {v0}, Lv8/c;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Ld9/x;->R:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    :goto_1
    return v4

    :cond_4
    return v3
.end method

.method public final g()V
    .locals 11

    invoke-virtual {p0}, Ld9/x;->o()Z

    move-result v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_5

    iput-wide v1, p0, Ld9/x;->G:J

    iput-wide v1, p0, Ld9/x;->H:J

    iput-wide v1, p0, Ld9/x;->I:J

    iput-wide v1, p0, Ld9/x;->J:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Ld9/x;->e0:Z

    iput v0, p0, Ld9/x;->K:I

    new-instance v4, Ld9/r;

    iget-object v5, p0, Ld9/x;->C:Lu8/e0;

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    invoke-direct/range {v4 .. v9}, Ld9/r;-><init>(Lu8/e0;JJ)V

    iput-object v4, p0, Ld9/x;->B:Ld9/r;

    iput-wide v1, p0, Ld9/x;->N:J

    iput-object v3, p0, Ld9/x;->A:Ld9/r;

    iget-object v4, p0, Ld9/x;->h:Ljava/util/ArrayDeque;

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->clear()V

    iput-object v3, p0, Ld9/x;->P:Ljava/nio/ByteBuffer;

    iput v0, p0, Ld9/x;->Q:I

    iput-object v3, p0, Ld9/x;->R:Ljava/nio/ByteBuffer;

    iput-boolean v0, p0, Ld9/x;->T:Z

    iput-boolean v0, p0, Ld9/x;->S:Z

    iput-boolean v0, p0, Ld9/x;->U:Z

    iput-object v3, p0, Ld9/x;->E:Ljava/nio/ByteBuffer;

    iput v0, p0, Ld9/x;->F:I

    iget-object v0, p0, Ld9/x;->d:Ld9/e0;

    iput-wide v1, v0, Ld9/e0;->o:J

    iget-object v0, p0, Ld9/x;->t:Ld9/q;

    iget-object v0, v0, Ld9/q;->i:Lv8/c;

    iput-object v0, p0, Ld9/x;->u:Lv8/c;

    invoke-virtual {v0}, Lv8/c;->a()V

    iget-object v0, p0, Ld9/x;->g:Ld9/m;

    iget-object v0, v0, Ld9/m;->c:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const/4 v4, 0x3

    if-ne v0, v4, :cond_0

    iget-object v0, p0, Ld9/x;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    :cond_0
    iget-object v0, p0, Ld9/x;->v:Landroid/media/AudioTrack;

    invoke-static {v0}, Ld9/x;->p(Landroid/media/AudioTrack;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ld9/x;->k:Ld9/w;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, p0, Ld9/x;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0, v4}, Ld9/w;->a(Landroid/media/AudioTrack;)V

    :cond_1
    iget-object v0, p0, Ld9/x;->t:Ld9/q;

    invoke-virtual {v0}, Ld9/q;->a()Ld9/j;

    move-result-object v8

    iget-object v0, p0, Ld9/x;->s:Ld9/q;

    if-eqz v0, :cond_2

    iput-object v0, p0, Ld9/x;->t:Ld9/q;

    iput-object v3, p0, Ld9/x;->s:Ld9/q;

    :cond_2
    iget-object v0, p0, Ld9/x;->g:Ld9/m;

    invoke-virtual {v0}, Ld9/m;->e()V

    iput-object v3, v0, Ld9/m;->c:Landroid/media/AudioTrack;

    iput-object v3, v0, Ld9/m;->e:Ld9/l;

    sget v0, Lx8/t;->a:I

    const/16 v4, 0x18

    if-lt v0, v4, :cond_3

    iget-object v0, p0, Ld9/x;->y:La33/d;

    if-eqz v0, :cond_3

    iget-object v4, v0, La33/d;->x:Ljava/lang/Object;

    check-cast v4, Landroid/media/AudioTrack;

    iget-object v5, v0, La33/d;->z:Ljava/lang/Object;

    check-cast v5, Ld9/s;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v5}, Landroid/media/AudioTrack;->removeOnRoutingChangedListener(Landroid/media/AudioRouting$OnRoutingChangedListener;)V

    iput-object v3, v0, La33/d;->z:Ljava/lang/Object;

    iput-object v3, p0, Ld9/x;->y:La33/d;

    :cond_3
    iget-object v5, p0, Ld9/x;->v:Landroid/media/AudioTrack;

    iget-object v6, p0, Ld9/x;->r:Lro/i;

    new-instance v7, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v7, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sget-object v10, Ld9/x;->j0:Ljava/lang/Object;

    monitor-enter v10

    :try_start_0
    sget-object v0, Ld9/x;->k0:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez v0, :cond_4

    new-instance v0, Lc33/a;

    const/4 v4, 0x3

    invoke-direct {v0, v4}, Lc33/a;-><init>(I)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sput-object v0, Ld9/x;->k0:Ljava/util/concurrent/ScheduledExecutorService;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_4
    :goto_0
    sget v0, Ld9/x;->l0:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Ld9/x;->l0:I

    sget-object v0, Ld9/x;->k0:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v4, Lbv/a;

    const/4 v9, 0x2

    invoke-direct/range {v4 .. v9}, Lbv/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v6, 0x14

    invoke-interface {v0, v4, v6, v7, v5}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    monitor-exit v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v3, p0, Ld9/x;->v:Landroid/media/AudioTrack;

    goto :goto_2

    :goto_1
    :try_start_1
    monitor-exit v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_5
    :goto_2
    iget-object v0, p0, Ld9/x;->m:Ld9/t;

    iput-object v3, v0, Ld9/t;->c:Ljava/io/Serializable;

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v4, v0, Ld9/t;->a:J

    iput-wide v4, v0, Ld9/t;->b:J

    iget-object v0, p0, Ld9/x;->l:Ld9/t;

    iput-object v3, v0, Ld9/t;->c:Ljava/io/Serializable;

    iput-wide v4, v0, Ld9/t;->a:J

    iput-wide v4, v0, Ld9/t;->b:J

    iput-wide v1, p0, Ld9/x;->g0:J

    iput-wide v1, p0, Ld9/x;->h0:J

    iget-object v0, p0, Ld9/x;->i0:Landroid/os/Handler;

    if-eqz v0, :cond_6

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :cond_6
    return-void
.end method

.method public final h(Lu8/p;)Ld9/g;
    .locals 6

    iget-boolean v0, p0, Ld9/x;->d0:Z

    if-eqz v0, :cond_0

    sget-object p1, Ld9/g;->d:Ld9/g;

    return-object p1

    :cond_0
    iget-object v0, p0, Ld9/x;->z:Lu8/d;

    iget-object v1, p0, Ld9/x;->o:Lqg3/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v2, p1, Lu8/p;->E:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v3, Lx8/t;->a:I

    const/16 v4, 0x1d

    if-lt v3, v4, :cond_9

    const/4 v4, -0x1

    if-ne v2, v4, :cond_1

    goto/16 :goto_4

    :cond_1
    iget-object v4, v1, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v4, Landroid/content/Context;

    iget-object v5, v1, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Boolean;

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    goto :goto_2

    :cond_2
    if-eqz v4, :cond_4

    invoke-static {v4}, Lv8/b;->r(Landroid/content/Context;)Landroid/media/AudioManager;

    move-result-object v4

    const-string v5, "offloadVariableRateSupported"

    invoke-virtual {v4, v5}, Landroid/media/AudioManager;->getParameters(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    const-string v5, "offloadVariableRateSupported=1"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/4 v4, 0x1

    goto :goto_0

    :cond_3
    const/4 v4, 0x0

    :goto_0
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iput-object v4, v1, Lqg3/d;->y:Ljava/lang/Object;

    goto :goto_1

    :cond_4
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v4, v1, Lqg3/d;->y:Ljava/lang/Object;

    :goto_1
    iget-object v1, v1, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :goto_2
    iget-object v4, p1, Lu8/p;->n:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, p1, Lu8/p;->k:Ljava/lang/String;

    invoke-static {v4, v5}, Lu8/d0;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    if-eqz v4, :cond_8

    invoke-static {v4}, Lx8/t;->o(I)I

    move-result v5

    if-ge v3, v5, :cond_5

    goto :goto_3

    :cond_5
    iget p1, p1, Lu8/p;->D:I

    invoke-static {p1}, Lx8/t;->q(I)I

    move-result p1

    if-nez p1, :cond_6

    sget-object p1, Ld9/g;->d:Ld9/g;

    return-object p1

    :cond_6
    :try_start_0
    invoke-static {v2, p1, v4}, Lx8/t;->p(III)Landroid/media/AudioFormat;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v2, 0x1f

    if-lt v3, v2, :cond_7

    invoke-virtual {v0}, Lu8/d;->a()Lty/c;

    move-result-object v0

    iget-object v0, v0, Lty/c;->x:Ljava/lang/Object;

    check-cast v0, Landroid/media/AudioAttributes;

    invoke-static {p1, v0, v1}, Ld2/b;->k(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;Z)Ld9/g;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-virtual {v0}, Lu8/d;->a()Lty/c;

    move-result-object v0

    iget-object v0, v0, Lty/c;->x:Ljava/lang/Object;

    check-cast v0, Landroid/media/AudioAttributes;

    invoke-static {p1, v0, v1}, La4/a;->t(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;Z)Ld9/g;

    move-result-object p1

    return-object p1

    :catch_0
    sget-object p1, Ld9/g;->d:Ld9/g;

    return-object p1

    :cond_8
    :goto_3
    sget-object p1, Ld9/g;->d:Ld9/g;

    return-object p1

    :cond_9
    :goto_4
    sget-object p1, Ld9/g;->d:Ld9/g;

    return-object p1
.end method

.method public final i(Lu8/p;)I
    .locals 4

    invoke-virtual {p0}, Ld9/x;->q()V

    iget-object v0, p1, Lu8/p;->n:Ljava/lang/String;

    iget v1, p1, Lu8/p;->F:I

    const-string v2, "audio/raw"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eqz v0, :cond_1

    invoke-static {v1}, Lx8/t;->G(I)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "DefaultAudioSink"

    const-string v0, "Invalid PCM encoding: "

    invoke-static {v1, v0, p1}, Ly00/t7;->r(ILjava/lang/String;Ljava/lang/String;)V

    return v2

    :cond_0
    if-eq v1, v3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_1
    iget-object v0, p0, Ld9/x;->w:Ld9/b;

    iget-object v1, p0, Ld9/x;->z:Lu8/d;

    invoke-virtual {v0, v1, p1}, Ld9/b;->d(Lu8/d;Lu8/p;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_3

    :cond_2
    return v3

    :cond_3
    return v2
.end method

.method public final j()J
    .locals 5

    iget-object v0, p0, Ld9/x;->t:Ld9/q;

    iget v1, v0, Ld9/q;->c:I

    if-nez v1, :cond_0

    iget-wide v1, p0, Ld9/x;->G:J

    iget v0, v0, Ld9/q;->b:I

    int-to-long v3, v0

    div-long/2addr v1, v3

    return-wide v1

    :cond_0
    iget-wide v0, p0, Ld9/x;->H:J

    return-wide v0
.end method

.method public final k()J
    .locals 7

    iget-object v0, p0, Ld9/x;->t:Ld9/q;

    iget v1, v0, Ld9/q;->c:I

    if-nez v1, :cond_0

    iget-wide v1, p0, Ld9/x;->I:J

    iget v0, v0, Ld9/q;->d:I

    int-to-long v3, v0

    sget v0, Lx8/t;->a:I

    add-long/2addr v1, v3

    const-wide/16 v5, 0x1

    sub-long/2addr v1, v5

    div-long/2addr v1, v3

    return-wide v1

    :cond_0
    iget-wide v0, p0, Ld9/x;->J:J

    return-wide v0
.end method

.method public final l(Ljava/nio/ByteBuffer;JI)Z
    .locals 27

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-wide/from16 v2, p2

    move/from16 v4, p4

    iget-object v5, v1, Ld9/x;->P:Ljava/nio/ByteBuffer;

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v5, :cond_1

    if-ne v0, v5, :cond_0

    goto :goto_0

    :cond_0
    move v5, v7

    goto :goto_1

    :cond_1
    :goto_0
    move v5, v6

    :goto_1
    invoke-static {v5}, Lva3/g;->d(Z)V

    iget-object v5, v1, Ld9/x;->s:Ld9/q;

    const/4 v8, 0x3

    iget-object v9, v1, Ld9/x;->g:Ld9/m;

    const/4 v10, 0x0

    if-eqz v5, :cond_7

    invoke-virtual {v1}, Ld9/x;->f()Z

    move-result v5

    if-nez v5, :cond_2

    :goto_2
    move/from16 v21, v7

    goto/16 :goto_1c

    :cond_2
    iget-object v5, v1, Ld9/x;->s:Ld9/q;

    iget-object v11, v1, Ld9/x;->t:Ld9/q;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v12, v11, Ld9/q;->c:I

    iget v13, v5, Ld9/q;->c:I

    if-ne v12, v13, :cond_4

    iget v12, v11, Ld9/q;->g:I

    iget v13, v5, Ld9/q;->g:I

    if-ne v12, v13, :cond_4

    iget v12, v11, Ld9/q;->e:I

    iget v13, v5, Ld9/q;->e:I

    if-ne v12, v13, :cond_4

    iget v12, v11, Ld9/q;->f:I

    iget v13, v5, Ld9/q;->f:I

    if-ne v12, v13, :cond_4

    iget v12, v11, Ld9/q;->d:I

    iget v13, v5, Ld9/q;->d:I

    if-ne v12, v13, :cond_4

    iget-boolean v12, v11, Ld9/q;->j:Z

    iget-boolean v13, v5, Ld9/q;->j:Z

    if-ne v12, v13, :cond_4

    iget-boolean v11, v11, Ld9/q;->k:Z

    iget-boolean v5, v5, Ld9/q;->k:Z

    if-ne v11, v5, :cond_4

    iget-object v5, v1, Ld9/x;->s:Ld9/q;

    iput-object v5, v1, Ld9/x;->t:Ld9/q;

    iput-object v10, v1, Ld9/x;->s:Ld9/q;

    iget-object v5, v1, Ld9/x;->v:Landroid/media/AudioTrack;

    if-eqz v5, :cond_6

    invoke-static {v5}, Ld9/x;->p(Landroid/media/AudioTrack;)Z

    move-result v5

    if-eqz v5, :cond_6

    iget-object v5, v1, Ld9/x;->t:Ld9/q;

    iget-boolean v5, v5, Ld9/q;->k:Z

    if-eqz v5, :cond_6

    iget-object v5, v1, Ld9/x;->v:Landroid/media/AudioTrack;

    invoke-virtual {v5}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v5

    if-ne v5, v8, :cond_3

    iget-object v5, v1, Ld9/x;->v:Landroid/media/AudioTrack;

    invoke-virtual {v5}, Landroid/media/AudioTrack;->setOffloadEndOfStream()V

    iput-boolean v6, v9, Ld9/m;->G:Z

    iget-object v5, v9, Ld9/m;->e:Ld9/l;

    if-eqz v5, :cond_3

    iget-object v5, v5, Ld9/l;->g:Ljava/lang/Object;

    check-cast v5, Ld9/k;

    if-eqz v5, :cond_3

    iput-boolean v6, v5, Ld9/k;->f:Z

    :cond_3
    iget-object v5, v1, Ld9/x;->v:Landroid/media/AudioTrack;

    iget-object v11, v1, Ld9/x;->t:Ld9/q;

    iget-object v11, v11, Ld9/q;->a:Lu8/p;

    iget v12, v11, Lu8/p;->G:I

    iget v11, v11, Lu8/p;->H:I

    invoke-virtual {v5, v12, v11}, Landroid/media/AudioTrack;->setOffloadDelayPadding(II)V

    iput-boolean v6, v1, Ld9/x;->e0:Z

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Ld9/x;->s()V

    invoke-virtual {v1}, Ld9/x;->m()Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v1}, Ld9/x;->g()V

    :cond_6
    :goto_3
    invoke-virtual {v1, v2, v3}, Ld9/x;->a(J)V

    :cond_7
    invoke-virtual {v1}, Ld9/x;->o()Z

    move-result v5

    iget-object v11, v1, Ld9/x;->l:Ld9/t;

    if-nez v5, :cond_9

    :try_start_0
    invoke-virtual {v1}, Ld9/x;->n()Z

    move-result v5
    :try_end_0
    .catch Landroidx/media3/exoplayer/audio/AudioSink$InitializationException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v5, :cond_9

    goto/16 :goto_2

    :catch_0
    move-exception v0

    iget-boolean v2, v0, Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;->x:Z

    if-nez v2, :cond_8

    invoke-virtual {v11, v0}, Ld9/t;->a(Ljava/lang/Exception;)V

    return v7

    :cond_8
    throw v0

    :cond_9
    iput-object v10, v11, Ld9/t;->c:Ljava/io/Serializable;

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v12, v11, Ld9/t;->a:J

    iput-wide v12, v11, Ld9/t;->b:J

    iget-boolean v5, v1, Ld9/x;->M:Z

    const-wide/16 v14, 0x0

    move-wide/from16 v16, v12

    if-eqz v5, :cond_b

    invoke-static {v14, v15, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v12

    iput-wide v12, v1, Ld9/x;->N:J

    iput-boolean v7, v1, Ld9/x;->L:Z

    iput-boolean v7, v1, Ld9/x;->M:Z

    invoke-virtual {v1}, Ld9/x;->y()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-virtual {v1}, Ld9/x;->v()V

    :cond_a
    invoke-virtual {v1, v2, v3}, Ld9/x;->a(J)V

    iget-boolean v5, v1, Ld9/x;->V:Z

    if-eqz v5, :cond_b

    invoke-virtual {v1}, Ld9/x;->r()V

    :cond_b
    invoke-virtual {v1}, Ld9/x;->k()J

    move-result-wide v11

    iget-object v5, v9, Ld9/m;->c:Landroid/media/AudioTrack;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v5

    iget-boolean v13, v9, Ld9/m;->g:Z

    move-wide/from16 v18, v14

    const/4 v14, 0x2

    if-eqz v13, :cond_d

    if-ne v5, v14, :cond_c

    iput-boolean v7, v9, Ld9/m;->o:Z

    return v7

    :cond_c
    if-ne v5, v6, :cond_d

    invoke-virtual {v9}, Ld9/m;->b()J

    move-result-wide v20

    cmp-long v13, v20, v18

    if-nez v13, :cond_d

    goto/16 :goto_2

    :cond_d
    iget-boolean v13, v9, Ld9/m;->o:Z

    invoke-virtual {v9, v11, v12}, Ld9/m;->d(J)Z

    move-result v11

    iput-boolean v11, v9, Ld9/m;->o:Z

    if-eqz v13, :cond_e

    if-nez v11, :cond_e

    if-eq v5, v6, :cond_e

    iget-object v5, v9, Ld9/m;->a:Lro/i;

    iget v11, v9, Ld9/m;->d:I

    iget-wide v12, v9, Ld9/m;->h:J

    invoke-static {v12, v13}, Lx8/t;->U(J)J

    move-result-wide v23

    iget-object v5, v5, Lro/i;->x:Ljava/lang/Object;

    check-cast v5, Ld9/x;

    iget-object v12, v5, Ld9/x;->r:Lro/i;

    if-eqz v12, :cond_e

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v12

    move/from16 v22, v11

    iget-wide v10, v5, Ld9/x;->c0:J

    sub-long v25, v12, v10

    iget-object v5, v5, Ld9/x;->r:Lro/i;

    iget-object v5, v5, Lro/i;->x:Ljava/lang/Object;

    check-cast v5, Ld9/a0;

    iget-object v5, v5, Ld9/a0;->d1:Lio/sentry/internal/debugmeta/c;

    iget-object v10, v5, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v10, Landroid/os/Handler;

    if-eqz v10, :cond_e

    new-instance v20, Ld9/h;

    move-object/from16 v21, v5

    invoke-direct/range {v20 .. v26}, Ld9/h;-><init>(Lio/sentry/internal/debugmeta/c;IJJ)V

    move-object/from16 v5, v20

    invoke-virtual {v10, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_e
    iget-object v5, v1, Ld9/x;->P:Ljava/nio/ByteBuffer;

    if-nez v5, :cond_38

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object v5

    sget-object v10, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    if-ne v5, v10, :cond_f

    move v5, v6

    goto :goto_4

    :cond_f
    move v5, v7

    :goto_4
    invoke-static {v5}, Lva3/g;->d(Z)V

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v5

    if-nez v5, :cond_10

    goto/16 :goto_19

    :cond_10
    iget-object v5, v1, Ld9/x;->t:Ld9/q;

    iget v10, v5, Ld9/q;->c:I

    if-eqz v10, :cond_2f

    iget v10, v1, Ld9/x;->K:I

    if-nez v10, :cond_2f

    iget v5, v5, Ld9/q;->g:I

    const/16 v10, 0x14

    const/4 v11, 0x5

    if-eq v5, v10, :cond_2a

    const/16 v10, 0x1e

    const/4 v12, -0x2

    const/4 v13, -0x1

    if-eq v5, v10, :cond_22

    const/16 v10, 0xa

    packed-switch v5, :pswitch_data_0

    const/16 v14, 0x10

    packed-switch v5, :pswitch_data_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Unexpected audio encoding: "

    invoke-static {v5, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    new-array v5, v14, [B

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v8

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    new-instance v8, Llo/s;

    const/4 v10, 0x5

    const/4 v11, 0x0

    invoke-direct {v8, v5, v14, v10, v11}, Llo/s;-><init>([BIIB)V

    invoke-static {v8}, Lt9/a;->l(Llo/s;)Lcr/p;

    move-result-object v5

    iget v13, v5, Lcr/p;->c:I

    goto/16 :goto_18

    :cond_11
    :goto_5
    :pswitch_1
    const/16 v13, 0x400

    goto/16 :goto_18

    :pswitch_2
    const/16 v13, 0x200

    goto/16 :goto_18

    :pswitch_3
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v5

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v8

    sub-int/2addr v8, v10

    move v10, v5

    :goto_6
    if-gt v10, v8, :cond_14

    add-int/lit8 v11, v10, 0x4

    invoke-virtual {v0, v11}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v11

    move/from16 v21, v14

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object v14

    sget-object v15, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    if-ne v14, v15, :cond_12

    goto :goto_7

    :cond_12
    invoke-static {v11}, Ljava/lang/Integer;->reverseBytes(I)I

    move-result v11

    :goto_7
    and-int/2addr v11, v12

    const v14, -0x78d9046

    if-ne v11, v14, :cond_13

    sub-int/2addr v10, v5

    goto :goto_8

    :cond_13
    add-int/lit8 v10, v10, 0x1

    move/from16 v14, v21

    goto :goto_6

    :cond_14
    move/from16 v21, v14

    move v10, v13

    :goto_8
    if-ne v10, v13, :cond_15

    move v13, v7

    goto/16 :goto_18

    :cond_15
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v5

    add-int/2addr v5, v10

    add-int/lit8 v5, v5, 0x7

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    and-int/lit16 v5, v5, 0xff

    const/16 v8, 0xbb

    if-ne v5, v8, :cond_16

    move v5, v6

    goto :goto_9

    :cond_16
    move v5, v7

    :goto_9
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v8

    add-int/2addr v8, v10

    if-eqz v5, :cond_17

    const/16 v5, 0x9

    goto :goto_a

    :cond_17
    const/16 v5, 0x8

    :goto_a
    add-int/2addr v8, v5

    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    shr-int/lit8 v5, v5, 0x4

    and-int/lit8 v5, v5, 0x7

    const/16 v8, 0x28

    shl-int v5, v8, v5

    mul-int/lit8 v13, v5, 0x10

    goto/16 :goto_18

    :pswitch_4
    const/16 v13, 0x800

    goto/16 :goto_18

    :pswitch_5
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v5

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v5

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object v11

    sget-object v12, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    if-ne v11, v12, :cond_18

    goto :goto_b

    :cond_18
    invoke-static {v5}, Ljava/lang/Integer;->reverseBytes(I)I

    move-result v5

    :goto_b
    const/high16 v11, -0x200000

    and-int v12, v5, v11

    if-ne v12, v11, :cond_19

    ushr-int/lit8 v11, v5, 0x13

    and-int/2addr v11, v8

    if-ne v11, v6, :cond_1a

    :cond_19
    :goto_c
    move v5, v13

    goto :goto_d

    :cond_1a
    ushr-int/lit8 v12, v5, 0x11

    and-int/2addr v12, v8

    if-nez v12, :cond_1b

    goto :goto_c

    :cond_1b
    ushr-int/lit8 v15, v5, 0xc

    const/16 v7, 0xf

    and-int/2addr v15, v7

    ushr-int/2addr v5, v10

    and-int/2addr v5, v8

    if-eqz v15, :cond_19

    if-eq v15, v7, :cond_19

    if-ne v5, v8, :cond_1c

    goto :goto_c

    :cond_1c
    const/16 v5, 0x480

    if-eq v12, v6, :cond_1e

    if-eq v12, v14, :cond_20

    if-ne v12, v8, :cond_1d

    const/16 v5, 0x180

    goto :goto_d

    :cond_1d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_1e
    if-ne v11, v8, :cond_1f

    goto :goto_d

    :cond_1f
    const/16 v5, 0x240

    :cond_20
    :goto_d
    if-eq v5, v13, :cond_21

    move v13, v5

    goto/16 :goto_18

    :cond_21
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_22
    :pswitch_6
    move v5, v7

    goto :goto_f

    :pswitch_7
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v5

    add-int/2addr v5, v11

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    and-int/lit16 v5, v5, 0xf8

    shr-int/2addr v5, v8

    if-le v5, v10, :cond_24

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v5

    add-int/lit8 v5, v5, 0x4

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    and-int/lit16 v5, v5, 0xc0

    shr-int/lit8 v5, v5, 0x6

    if-ne v5, v8, :cond_23

    goto :goto_e

    :cond_23
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v5

    add-int/lit8 v5, v5, 0x4

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    and-int/lit8 v5, v5, 0x30

    shr-int/lit8 v8, v5, 0x4

    :goto_e
    sget-object v5, Lt9/a;->c:[I

    aget v5, v5, v8

    mul-int/lit16 v13, v5, 0x100

    goto/16 :goto_18

    :cond_24
    const/16 v13, 0x600

    goto/16 :goto_18

    :goto_f
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v7

    const v8, -0xde4bec0

    if-eq v7, v8, :cond_11

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v7

    const v8, -0x17bd3b8f

    if-ne v7, v8, :cond_25

    goto/16 :goto_5

    :cond_25
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v7

    const v5, 0x25205864

    if-ne v7, v5, :cond_26

    const/16 v13, 0x1000

    goto/16 :goto_18

    :cond_26
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v5

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v7

    if-eq v7, v12, :cond_29

    if-eq v7, v13, :cond_28

    const/16 v8, 0x1f

    if-eq v7, v8, :cond_27

    add-int/lit8 v7, v5, 0x4

    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v7

    and-int/2addr v7, v6

    shl-int/lit8 v7, v7, 0x6

    add-int/2addr v5, v11

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    :goto_10
    and-int/lit16 v5, v5, 0xfc

    :goto_11
    shr-int/2addr v5, v14

    or-int/2addr v5, v7

    goto :goto_13

    :cond_27
    add-int/lit8 v7, v5, 0x5

    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v7

    and-int/lit8 v7, v7, 0x7

    shl-int/lit8 v7, v7, 0x4

    add-int/lit8 v5, v5, 0x6

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    :goto_12
    and-int/lit8 v5, v5, 0x3c

    goto :goto_11

    :cond_28
    add-int/lit8 v7, v5, 0x4

    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v7

    and-int/lit8 v7, v7, 0x7

    shl-int/lit8 v7, v7, 0x4

    add-int/lit8 v5, v5, 0x7

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    goto :goto_12

    :cond_29
    add-int/lit8 v7, v5, 0x5

    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v7

    and-int/2addr v7, v6

    shl-int/lit8 v7, v7, 0x6

    add-int/lit8 v5, v5, 0x4

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    goto :goto_10

    :goto_13
    add-int/2addr v5, v6

    mul-int/lit8 v13, v5, 0x20

    goto :goto_18

    :cond_2a
    invoke-virtual {v0, v11}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    and-int/2addr v5, v14

    if-nez v5, :cond_2b

    const/4 v5, 0x0

    goto :goto_16

    :cond_2b
    const/16 v5, 0x1a

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    const/16 v7, 0x1c

    move v10, v7

    const/4 v8, 0x0

    :goto_14
    if-ge v8, v5, :cond_2c

    add-int/lit8 v11, v8, 0x1b

    invoke-virtual {v0, v11}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v11

    add-int/2addr v10, v11

    add-int/lit8 v8, v8, 0x1

    goto :goto_14

    :cond_2c
    add-int/lit8 v5, v10, 0x1a

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    const/4 v8, 0x0

    :goto_15
    if-ge v8, v5, :cond_2d

    add-int/lit8 v11, v10, 0x1b

    add-int/2addr v11, v8

    invoke-virtual {v0, v11}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v11

    add-int/2addr v7, v11

    add-int/lit8 v8, v8, 0x1

    goto :goto_15

    :cond_2d
    add-int v5, v10, v7

    :goto_16
    add-int/lit8 v7, v5, 0x1a

    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v7

    add-int/lit8 v7, v7, 0x1b

    add-int/2addr v7, v5

    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v8

    sub-int/2addr v8, v7

    if-le v8, v6, :cond_2e

    add-int/2addr v7, v6

    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v7

    goto :goto_17

    :cond_2e
    const/4 v7, 0x0

    :goto_17
    invoke-static {v5, v7}, Lt9/a;->j(BB)J

    move-result-wide v7

    const-wide/32 v10, 0xbb80

    mul-long/2addr v7, v10

    const-wide/32 v10, 0xf4240

    div-long/2addr v7, v10

    long-to-int v13, v7

    :goto_18
    iput v13, v1, Ld9/x;->K:I

    if-nez v13, :cond_2f

    :goto_19
    return v6

    :cond_2f
    iget-object v5, v1, Ld9/x;->A:Ld9/r;

    if-eqz v5, :cond_32

    invoke-virtual {v1}, Ld9/x;->f()Z

    move-result v5

    if-nez v5, :cond_31

    :cond_30
    :goto_1a
    const/16 v21, 0x0

    goto/16 :goto_1c

    :cond_31
    invoke-virtual {v1, v2, v3}, Ld9/x;->a(J)V

    const/4 v15, 0x0

    iput-object v15, v1, Ld9/x;->A:Ld9/r;

    :cond_32
    iget-wide v7, v1, Ld9/x;->N:J

    iget-object v5, v1, Ld9/x;->t:Ld9/q;

    invoke-virtual {v1}, Ld9/x;->j()J

    move-result-wide v10

    iget-object v12, v1, Ld9/x;->d:Ld9/e0;

    iget-wide v12, v12, Ld9/e0;->o:J

    sub-long/2addr v10, v12

    iget-object v5, v5, Ld9/q;->a:Lu8/p;

    iget v5, v5, Lu8/p;->E:I

    invoke-static {v5, v10, v11}, Lx8/t;->O(IJ)J

    move-result-wide v10

    add-long/2addr v10, v7

    iget-boolean v5, v1, Ld9/x;->L:Z

    if-nez v5, :cond_34

    sub-long v7, v10, v2

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    move-result-wide v7

    const-wide/32 v12, 0x30d40

    cmp-long v5, v7, v12

    if-lez v5, :cond_34

    iget-object v5, v1, Ld9/x;->r:Lro/i;

    if-eqz v5, :cond_33

    new-instance v7, Landroidx/media3/exoplayer/audio/AudioSink$UnexpectedDiscontinuityException;

    const-string v8, "Unexpected audio track timestamp discontinuity: expected "

    const-string v12, ", got "

    invoke-static {v10, v11, v8, v12}, Lyb0/f;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v7}, Lro/i;->x(Ljava/lang/Exception;)V

    :cond_33
    iput-boolean v6, v1, Ld9/x;->L:Z

    :cond_34
    iget-boolean v5, v1, Ld9/x;->L:Z

    if-eqz v5, :cond_36

    invoke-virtual {v1}, Ld9/x;->f()Z

    move-result v5

    if-nez v5, :cond_35

    goto :goto_1a

    :cond_35
    sub-long v7, v2, v10

    iget-wide v10, v1, Ld9/x;->N:J

    add-long/2addr v10, v7

    iput-wide v10, v1, Ld9/x;->N:J

    const/4 v5, 0x0

    iput-boolean v5, v1, Ld9/x;->L:Z

    invoke-virtual {v1, v2, v3}, Ld9/x;->a(J)V

    iget-object v5, v1, Ld9/x;->r:Lro/i;

    if-eqz v5, :cond_36

    cmp-long v7, v7, v18

    if-eqz v7, :cond_36

    iget-object v5, v5, Lro/i;->x:Ljava/lang/Object;

    check-cast v5, Ld9/a0;

    iput-boolean v6, v5, Ld9/a0;->m1:Z

    :cond_36
    iget-object v5, v1, Ld9/x;->t:Ld9/q;

    iget v5, v5, Ld9/q;->c:I

    if-nez v5, :cond_37

    iget-wide v7, v1, Ld9/x;->G:J

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v5

    int-to-long v10, v5

    add-long/2addr v7, v10

    iput-wide v7, v1, Ld9/x;->G:J

    goto :goto_1b

    :cond_37
    iget-wide v7, v1, Ld9/x;->H:J

    iget v5, v1, Ld9/x;->K:I

    int-to-long v10, v5

    int-to-long v12, v4

    mul-long/2addr v10, v12

    add-long/2addr v10, v7

    iput-wide v10, v1, Ld9/x;->H:J

    :goto_1b
    iput-object v0, v1, Ld9/x;->P:Ljava/nio/ByteBuffer;

    iput v4, v1, Ld9/x;->Q:I

    :cond_38
    invoke-virtual {v1, v2, v3}, Ld9/x;->t(J)V

    iget-object v0, v1, Ld9/x;->P:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_39

    const/4 v15, 0x0

    iput-object v15, v1, Ld9/x;->P:Ljava/nio/ByteBuffer;

    const/4 v5, 0x0

    iput v5, v1, Ld9/x;->Q:I

    return v6

    :cond_39
    invoke-virtual {v1}, Ld9/x;->k()J

    move-result-wide v2

    iget-wide v4, v9, Ld9/m;->y:J

    cmp-long v0, v4, v16

    if-eqz v0, :cond_30

    cmp-long v0, v2, v18

    if-lez v0, :cond_30

    iget-object v0, v9, Ld9/m;->I:Lx8/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, v9, Ld9/m;->y:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0xc8

    cmp-long v0, v2, v4

    if-ltz v0, :cond_30

    const-string v0, "DefaultAudioSink"

    const-string v2, "Resetting stalled audio track"

    invoke-static {v0, v2}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Ld9/x;->g()V

    return v6

    :goto_1c
    return v21

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_1
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xe
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_7
    .end packed-switch
.end method

.method public final m()Z
    .locals 3

    invoke-virtual {p0}, Ld9/x;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lx8/t;->a:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Ld9/x;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->isOffloadedPlayback()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ld9/x;->U:Z

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Ld9/x;->g:Ld9/m;

    invoke-virtual {p0}, Ld9/x;->k()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ld9/m;->d(J)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final n()Z
    .locals 20

    move-object/from16 v1, p0

    iget-object v0, v1, Ld9/x;->l:Ld9/t;

    iget-object v2, v0, Ld9/t;->c:Ljava/io/Serializable;

    check-cast v2, Ljava/lang/Exception;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    sget-object v2, Ld9/x;->j0:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    sget v5, Ld9/x;->l0:I

    if-lez v5, :cond_1

    move v5, v4

    goto :goto_0

    :cond_1
    move v5, v3

    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v5, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    iget-wide v7, v0, Ld9/t;->b:J

    cmp-long v0, v5, v7

    if-gez v0, :cond_3

    :goto_1
    return v3

    :cond_3
    :goto_2
    :try_start_1
    iget-object v0, v1, Ld9/x;->t:Ld9/q;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v0}, Ld9/x;->c(Ld9/q;)Landroid/media/AudioTrack;

    move-result-object v0
    :try_end_1
    .catch Landroidx/media3/exoplayer/audio/AudioSink$InitializationException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    move-object v2, v0

    iget-object v0, v1, Ld9/x;->t:Ld9/q;

    iget v5, v0, Ld9/q;->h:I

    const v6, 0xf4240

    if-le v5, v6, :cond_f

    new-instance v7, Ld9/q;

    iget-object v8, v0, Ld9/q;->a:Lu8/p;

    iget v9, v0, Ld9/q;->b:I

    iget v10, v0, Ld9/q;->c:I

    iget v11, v0, Ld9/q;->d:I

    iget v12, v0, Ld9/q;->e:I

    iget v13, v0, Ld9/q;->f:I

    iget v14, v0, Ld9/q;->g:I

    iget-object v5, v0, Ld9/q;->i:Lv8/c;

    iget-boolean v6, v0, Ld9/q;->j:Z

    iget-boolean v15, v0, Ld9/q;->k:Z

    iget-boolean v0, v0, Ld9/q;->l:Z

    move/from16 v18, v15

    const v15, 0xf4240

    move/from16 v19, v0

    move-object/from16 v16, v5

    move/from16 v17, v6

    invoke-direct/range {v7 .. v19}, Ld9/q;-><init>(Lu8/p;IIIIIIILv8/c;ZZZ)V

    :try_start_2
    invoke-virtual {v1, v7}, Ld9/x;->c(Ld9/q;)Landroid/media/AudioTrack;

    move-result-object v0

    iput-object v7, v1, Ld9/x;->t:Ld9/q;
    :try_end_2
    .catch Landroidx/media3/exoplayer/audio/AudioSink$InitializationException; {:try_start_2 .. :try_end_2} :catch_1

    :goto_3
    iput-object v0, v1, Ld9/x;->v:Landroid/media/AudioTrack;

    invoke-static {v0}, Ld9/x;->p(Landroid/media/AudioTrack;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, v1, Ld9/x;->v:Landroid/media/AudioTrack;

    iget-object v2, v1, Ld9/x;->k:Ld9/w;

    if-nez v2, :cond_4

    new-instance v2, Ld9/w;

    invoke-direct {v2, v1}, Ld9/w;-><init>(Ld9/x;)V

    iput-object v2, v1, Ld9/x;->k:Ld9/w;

    :cond_4
    iget-object v2, v1, Ld9/x;->k:Ld9/w;

    iget-object v5, v2, Ld9/w;->b:Landroid/os/Handler;

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Ld9/u;

    invoke-direct {v6, v5}, Ld9/u;-><init>(Landroid/os/Handler;)V

    iget-object v2, v2, Ld9/w;->c:Ljava/lang/Object;

    check-cast v2, Ld9/v;

    invoke-virtual {v0, v6, v2}, Landroid/media/AudioTrack;->registerStreamEventCallback(Ljava/util/concurrent/Executor;Landroid/media/AudioTrack$StreamEventCallback;)V

    iget-object v0, v1, Ld9/x;->t:Ld9/q;

    iget-boolean v2, v0, Ld9/q;->k:Z

    if-eqz v2, :cond_5

    iget-object v2, v1, Ld9/x;->v:Landroid/media/AudioTrack;

    iget-object v0, v0, Ld9/q;->a:Lu8/p;

    iget v5, v0, Lu8/p;->G:I

    iget v0, v0, Lu8/p;->H:I

    invoke-virtual {v2, v5, v0}, Landroid/media/AudioTrack;->setOffloadDelayPadding(II)V

    :cond_5
    sget v0, Lx8/t;->a:I

    const/16 v2, 0x1f

    if-lt v0, v2, :cond_6

    iget-object v2, v1, Ld9/x;->q:Lc9/n;

    if-eqz v2, :cond_6

    iget-object v5, v1, Ld9/x;->v:Landroid/media/AudioTrack;

    invoke-static {v5, v2}, Ld2/b;->q(Landroid/media/AudioTrack;Lc9/n;)V

    :cond_6
    iget-object v2, v1, Ld9/x;->v:Landroid/media/AudioTrack;

    invoke-virtual {v2}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result v2

    iput v2, v1, Ld9/x;->X:I

    iget-object v2, v1, Ld9/x;->g:Ld9/m;

    iget-object v5, v1, Ld9/x;->v:Landroid/media/AudioTrack;

    iget-object v6, v1, Ld9/x;->t:Ld9/q;

    iget v7, v6, Ld9/q;->c:I

    const/4 v8, 0x2

    if-ne v7, v8, :cond_7

    move v7, v4

    goto :goto_4

    :cond_7
    move v7, v3

    :goto_4
    iget v8, v6, Ld9/q;->g:I

    iget v9, v6, Ld9/q;->d:I

    iget v6, v6, Ld9/q;->h:I

    iput-object v5, v2, Ld9/m;->c:Landroid/media/AudioTrack;

    iput v6, v2, Ld9/m;->d:I

    new-instance v10, Ld9/l;

    const/4 v11, 0x0

    invoke-direct {v10, v5, v11}, Ld9/l;-><init>(Landroid/media/AudioTrack;I)V

    iput-object v10, v2, Ld9/m;->e:Ld9/l;

    invoke-virtual {v5}, Landroid/media/AudioTrack;->getSampleRate()I

    move-result v5

    iput v5, v2, Ld9/m;->f:I

    const/16 v5, 0x17

    if-eqz v7, :cond_9

    if-ge v0, v5, :cond_9

    const/4 v7, 0x5

    if-eq v8, v7, :cond_8

    const/4 v7, 0x6

    if-ne v8, v7, :cond_9

    :cond_8
    move v7, v4

    goto :goto_5

    :cond_9
    move v7, v3

    :goto_5
    iput-boolean v7, v2, Ld9/m;->g:Z

    invoke-static {v8}, Lx8/t;->G(I)Z

    move-result v7

    iput-boolean v7, v2, Ld9/m;->p:Z

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v7, :cond_a

    div-int/2addr v6, v9

    int-to-long v6, v6

    iget v8, v2, Ld9/m;->f:I

    invoke-static {v8, v6, v7}, Lx8/t;->O(IJ)J

    move-result-wide v6

    goto :goto_6

    :cond_a
    move-wide v6, v10

    :goto_6
    iput-wide v6, v2, Ld9/m;->h:J

    const-wide/16 v6, 0x0

    iput-wide v6, v2, Ld9/m;->s:J

    iput-wide v6, v2, Ld9/m;->t:J

    iput-boolean v3, v2, Ld9/m;->G:Z

    iput-wide v6, v2, Ld9/m;->H:J

    iput-wide v6, v2, Ld9/m;->u:J

    iput-boolean v3, v2, Ld9/m;->o:Z

    iput-wide v10, v2, Ld9/m;->x:J

    iput-wide v10, v2, Ld9/m;->y:J

    iput-wide v6, v2, Ld9/m;->q:J

    iput-wide v6, v2, Ld9/m;->n:J

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, v2, Ld9/m;->i:F

    invoke-virtual {v1}, Ld9/x;->o()Z

    move-result v2

    if-eqz v2, :cond_b

    iget-object v2, v1, Ld9/x;->v:Landroid/media/AudioTrack;

    iget v3, v1, Ld9/x;->O:F

    invoke-virtual {v2, v3}, Landroid/media/AudioTrack;->setVolume(F)I

    :cond_b
    iget-object v2, v1, Ld9/x;->Y:Lu8/e;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v1, Ld9/x;->Z:Lro/i;

    if-eqz v2, :cond_c

    if-lt v0, v5, :cond_c

    iget-object v3, v1, Ld9/x;->v:Landroid/media/AudioTrack;

    iget-object v2, v2, Lro/i;->x:Ljava/lang/Object;

    check-cast v2, Landroid/media/AudioDeviceInfo;

    invoke-virtual {v3, v2}, Landroid/media/AudioTrack;->setPreferredDevice(Landroid/media/AudioDeviceInfo;)Z

    iget-object v2, v1, Ld9/x;->x:Ld30/h;

    if-eqz v2, :cond_c

    iget-object v3, v1, Ld9/x;->Z:Lro/i;

    iget-object v3, v3, Lro/i;->x:Ljava/lang/Object;

    check-cast v3, Landroid/media/AudioDeviceInfo;

    invoke-virtual {v2, v3}, Ld30/h;->c(Landroid/media/AudioDeviceInfo;)V

    :cond_c
    const/16 v2, 0x18

    if-lt v0, v2, :cond_d

    iget-object v0, v1, Ld9/x;->x:Ld30/h;

    if-eqz v0, :cond_d

    new-instance v2, La33/d;

    iget-object v3, v1, Ld9/x;->v:Landroid/media/AudioTrack;

    invoke-direct {v2, v3, v0}, La33/d;-><init>(Landroid/media/AudioTrack;Ld30/h;)V

    iput-object v2, v1, Ld9/x;->y:La33/d;

    :cond_d
    iput-boolean v4, v1, Ld9/x;->M:Z

    iget-object v0, v1, Ld9/x;->r:Lro/i;

    if-eqz v0, :cond_e

    iget-object v2, v1, Ld9/x;->t:Ld9/q;

    invoke-virtual {v2}, Ld9/q;->a()Ld9/j;

    move-result-object v2

    iget-object v0, v0, Lro/i;->x:Ljava/lang/Object;

    check-cast v0, Ld9/a0;

    iget-object v0, v0, Ld9/a0;->d1:Lio/sentry/internal/debugmeta/c;

    iget-object v3, v0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v3, Landroid/os/Handler;

    if-eqz v3, :cond_e

    new-instance v5, Ld9/h;

    const/4 v6, 0x7

    invoke-direct {v5, v0, v2, v6}, Ld9/h;-><init>(Lio/sentry/internal/debugmeta/c;Ljava/lang/Object;I)V

    invoke-virtual {v3, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_e
    return v4

    :catch_1
    move-exception v0

    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_f
    iget-object v0, v1, Ld9/x;->t:Ld9/q;

    iget v0, v0, Ld9/q;->c:I

    if-ne v0, v4, :cond_10

    iput-boolean v4, v1, Ld9/x;->d0:Z

    :cond_10
    throw v2

    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public final o()Z
    .locals 1

    iget-object v0, p0, Ld9/x;->v:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final q()V
    .locals 7

    iget-object v0, p0, Ld9/x;->x:Ld30/h;

    if-nez v0, :cond_3

    iget-object v0, p0, Ld9/x;->a:Landroid/content/Context;

    if-eqz v0, :cond_3

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    iput-object v1, p0, Ld9/x;->f0:Landroid/os/Looper;

    new-instance v1, Ld30/h;

    new-instance v2, Lab/g0;

    const/16 v3, 0x1a

    invoke-direct {v2, p0, v3}, Lab/g0;-><init>(Ljava/lang/Object;I)V

    iget-object v3, p0, Ld9/x;->z:Lu8/d;

    iget-object v4, p0, Ld9/x;->Z:Lro/i;

    invoke-direct {v1, v0, v2, v3, v4}, Ld30/h;-><init>(Landroid/content/Context;Lab/g0;Lu8/d;Lro/i;)V

    iput-object v1, p0, Ld9/x;->x:Ld30/h;

    iget-object v0, v1, Ld30/h;->d:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    iget-object v2, v1, Ld30/h;->b:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    iget-boolean v3, v1, Ld30/h;->a:Z

    if-eqz v3, :cond_0

    iget-object v0, v1, Ld30/h;->h:Ljava/lang/Object;

    check-cast v0, Ld9/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_0
    const/4 v3, 0x1

    iput-boolean v3, v1, Ld30/h;->a:Z

    iget-object v3, v1, Ld30/h;->g:Ljava/lang/Object;

    check-cast v3, Ld9/d;

    if-eqz v3, :cond_1

    iget-object v4, v3, Ld9/d;->a:Landroid/content/ContentResolver;

    iget-object v5, v3, Ld9/d;->b:Landroid/net/Uri;

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6, v3}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    :cond_1
    sget v3, Lx8/t;->a:I

    const/16 v4, 0x17

    if-lt v3, v4, :cond_2

    iget-object v3, v1, Ld30/h;->e:Ljava/lang/Object;

    check-cast v3, Ld9/c;

    if-eqz v3, :cond_2

    invoke-static {v2}, Lv8/b;->r(Landroid/content/Context;)Landroid/media/AudioManager;

    move-result-object v4

    invoke-virtual {v4, v3, v0}, Landroid/media/AudioManager;->registerAudioDeviceCallback(Landroid/media/AudioDeviceCallback;Landroid/os/Handler;)V

    :cond_2
    iget-object v3, v1, Ld30/h;->f:Ljava/lang/Object;

    check-cast v3, Ld9/e;

    new-instance v4, Landroid/content/IntentFilter;

    const-string v5, "android.media.action.HDMI_AUDIO_PLUG"

    invoke-direct {v4, v5}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v4, v5, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    move-result-object v0

    iget-object v3, v1, Ld30/h;->j:Ljava/lang/Object;

    check-cast v3, Lu8/d;

    iget-object v4, v1, Ld30/h;->i:Ljava/lang/Object;

    check-cast v4, Lro/i;

    invoke-static {v2, v0, v3, v4}, Ld9/b;->b(Landroid/content/Context;Landroid/content/Intent;Lu8/d;Lro/i;)Ld9/b;

    move-result-object v0

    iput-object v0, v1, Ld30/h;->h:Ljava/lang/Object;

    :goto_0
    iput-object v0, p0, Ld9/x;->w:Ld9/b;

    :cond_3
    iget-object v0, p0, Ld9/x;->w:Ld9/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final r()V
    .locals 5

    const/4 v0, 0x1

    iput-boolean v0, p0, Ld9/x;->V:Z

    invoke-virtual {p0}, Ld9/x;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ld9/x;->g:Ld9/m;

    iget-wide v1, v0, Ld9/m;->x:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v1, v3

    if-eqz v1, :cond_0

    iget-object v1, v0, Ld9/m;->I:Lx8/p;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    invoke-static {v1, v2}, Lx8/t;->J(J)J

    move-result-wide v1

    iput-wide v1, v0, Ld9/m;->x:J

    :cond_0
    iget-object v0, v0, Ld9/m;->e:Ld9/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ld9/l;->a()V

    iget-object v0, p0, Ld9/x;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    :cond_1
    return-void
.end method

.method public final s()V
    .locals 5

    iget-boolean v0, p0, Ld9/x;->T:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ld9/x;->T:Z

    invoke-virtual {p0}, Ld9/x;->k()J

    move-result-wide v0

    iget-object v2, p0, Ld9/x;->g:Ld9/m;

    invoke-virtual {v2}, Ld9/m;->b()J

    move-result-wide v3

    iput-wide v3, v2, Ld9/m;->z:J

    iget-object v3, v2, Ld9/m;->I:Lx8/p;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    invoke-static {v3, v4}, Lx8/t;->J(J)J

    move-result-wide v3

    iput-wide v3, v2, Ld9/m;->x:J

    iput-wide v0, v2, Ld9/m;->A:J

    iget-object v0, p0, Ld9/x;->v:Landroid/media/AudioTrack;

    invoke-static {v0}, Ld9/x;->p(Landroid/media/AudioTrack;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Ld9/x;->U:Z

    :cond_0
    iget-object v0, p0, Ld9/x;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    iput v1, p0, Ld9/x;->F:I

    :cond_1
    return-void
.end method

.method public final t(J)V
    .locals 3

    invoke-virtual {p0, p1, p2}, Ld9/x;->e(J)V

    iget-object v0, p0, Ld9/x;->R:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v0, p0, Ld9/x;->u:Lv8/c;

    invoke-virtual {v0}, Lv8/c;->d()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ld9/x;->P:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_8

    invoke-virtual {p0, v0}, Ld9/x;->x(Ljava/nio/ByteBuffer;)V

    invoke-virtual {p0, p1, p2}, Ld9/x;->e(J)V

    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Ld9/x;->u:Lv8/c;

    invoke-virtual {v0}, Lv8/c;->c()Z

    move-result v0

    if-nez v0, :cond_8

    :cond_2
    iget-object v0, p0, Ld9/x;->u:Lv8/c;

    invoke-virtual {v0}, Lv8/c;->d()Z

    move-result v1

    if-nez v1, :cond_3

    sget-object v0, Lv8/e;->a:Ljava/nio/ByteBuffer;

    goto :goto_1

    :cond_3
    iget-object v1, v0, Lv8/c;->c:[Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Lv8/c;->b()I

    move-result v2

    aget-object v1, v1, v2

    invoke-virtual {v1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v2

    if-eqz v2, :cond_4

    move-object v0, v1

    goto :goto_1

    :cond_4
    sget-object v1, Lv8/e;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Lv8/c;->e(Ljava/nio/ByteBuffer;)V

    iget-object v1, v0, Lv8/c;->c:[Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Lv8/c;->b()I

    move-result v0

    aget-object v0, v1, v0

    :goto_1
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0, v0}, Ld9/x;->x(Ljava/nio/ByteBuffer;)V

    invoke-virtual {p0, p1, p2}, Ld9/x;->e(J)V

    iget-object v0, p0, Ld9/x;->R:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_5
    iget-object v0, p0, Ld9/x;->P:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_2

    :cond_6
    iget-object v0, p0, Ld9/x;->u:Lv8/c;

    iget-object v1, p0, Ld9/x;->P:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Lv8/c;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-boolean v2, v0, Lv8/c;->d:Z

    if-eqz v2, :cond_7

    goto :goto_0

    :cond_7
    invoke-virtual {v0, v1}, Lv8/c;->e(Ljava/nio/ByteBuffer;)V

    goto :goto_0

    :cond_8
    :goto_2
    return-void
.end method

.method public final u()V
    .locals 5

    invoke-virtual {p0}, Ld9/x;->g()V

    iget-object v0, p0, Ld9/x;->e:Lzr/w0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lzr/g0;->o(I)Lzr/e0;

    move-result-object v0

    :goto_0
    invoke-virtual {v0}, Lzr/e0;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lzr/e0;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv8/e;

    invoke-interface {v2}, Lv8/e;->reset()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ld9/x;->f:Lzr/w0;

    invoke-virtual {v0, v1}, Lzr/g0;->o(I)Lzr/e0;

    move-result-object v0

    :goto_1
    invoke-virtual {v0}, Lzr/e0;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lzr/e0;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv8/e;

    invoke-interface {v2}, Lv8/e;->reset()V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Ld9/x;->u:Lv8/c;

    if-eqz v0, :cond_3

    iget-object v2, v0, Lv8/c;->a:Lzr/g0;

    move v3, v1

    :goto_2
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v4

    if-ge v3, v4, :cond_2

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lv8/e;

    invoke-interface {v4}, Lv8/e;->flush()V

    invoke-interface {v4}, Lv8/e;->reset()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    new-array v2, v1, [Ljava/nio/ByteBuffer;

    iput-object v2, v0, Lv8/c;->c:[Ljava/nio/ByteBuffer;

    sget-object v2, Lv8/d;->e:Lv8/d;

    iput-boolean v1, v0, Lv8/c;->d:Z

    :cond_3
    iput-boolean v1, p0, Ld9/x;->V:Z

    iput-boolean v1, p0, Ld9/x;->d0:Z

    return-void
.end method

.method public final v()V
    .locals 3

    invoke-virtual {p0}, Ld9/x;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Landroid/media/PlaybackParams;

    invoke-direct {v0}, Landroid/media/PlaybackParams;-><init>()V

    invoke-virtual {v0}, Landroid/media/PlaybackParams;->allowDefaults()Landroid/media/PlaybackParams;

    move-result-object v0

    iget-object v1, p0, Ld9/x;->C:Lu8/e0;

    iget v1, v1, Lu8/e0;->a:F

    invoke-virtual {v0, v1}, Landroid/media/PlaybackParams;->setSpeed(F)Landroid/media/PlaybackParams;

    move-result-object v0

    iget-object v1, p0, Ld9/x;->C:Lu8/e0;

    iget v1, v1, Lu8/e0;->b:F

    invoke-virtual {v0, v1}, Landroid/media/PlaybackParams;->setPitch(F)Landroid/media/PlaybackParams;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/media/PlaybackParams;->setAudioFallbackMode(I)Landroid/media/PlaybackParams;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Ld9/x;->v:Landroid/media/AudioTrack;

    invoke-virtual {v1, v0}, Landroid/media/AudioTrack;->setPlaybackParams(Landroid/media/PlaybackParams;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "DefaultAudioSink"

    const-string v2, "Failed to set playback params"

    invoke-static {v1, v2, v0}, Lx8/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    new-instance v0, Lu8/e0;

    iget-object v1, p0, Ld9/x;->v:Landroid/media/AudioTrack;

    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/PlaybackParams;->getSpeed()F

    move-result v1

    iget-object v2, p0, Ld9/x;->v:Landroid/media/AudioTrack;

    invoke-virtual {v2}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    move-result-object v2

    invoke-virtual {v2}, Landroid/media/PlaybackParams;->getPitch()F

    move-result v2

    invoke-direct {v0, v1, v2}, Lu8/e0;-><init>(FF)V

    iput-object v0, p0, Ld9/x;->C:Lu8/e0;

    iget v0, v0, Lu8/e0;->a:F

    iget-object v1, p0, Ld9/x;->g:Ld9/m;

    iput v0, v1, Ld9/m;->i:F

    iget-object v0, v1, Ld9/m;->e:Ld9/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ld9/l;->a()V

    :cond_0
    invoke-virtual {v1}, Ld9/m;->e()V

    :cond_1
    return-void
.end method

.method public final w(II)V
    .locals 1

    iget-object v0, p0, Ld9/x;->v:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ld9/x;->p(Landroid/media/AudioTrack;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ld9/x;->t:Ld9/q;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Ld9/q;->k:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ld9/x;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0, p1, p2}, Landroid/media/AudioTrack;->setOffloadDelayPadding(II)V

    :cond_0
    return-void
.end method

.method public final x(Ljava/nio/ByteBuffer;)V
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Ld9/x;->R:Ljava/nio/ByteBuffer;

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lva3/g;->i(Z)V

    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    iget-object v1, v0, Ld9/x;->t:Ld9/q;

    iget v1, v1, Ld9/q;->c:I

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    const-wide/16 v1, 0x14

    invoke-static {v1, v2}, Lx8/t;->J(J)J

    move-result-wide v3

    iget-object v1, v0, Ld9/x;->t:Ld9/q;

    iget v1, v1, Ld9/q;->e:I

    int-to-long v5, v1

    const-wide/32 v7, 0xf4240

    sget-object v9, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    invoke-static/range {v3 .. v9}, Lx8/t;->Q(JJJLjava/math/RoundingMode;)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-virtual {v0}, Ld9/x;->k()J

    move-result-wide v2

    int-to-long v4, v1

    cmp-long v6, v2, v4

    if-ltz v6, :cond_3

    :goto_1
    move-object/from16 v3, p1

    goto/16 :goto_8

    :cond_3
    iget-object v6, v0, Ld9/x;->t:Ld9/q;

    iget v7, v6, Ld9/q;->g:I

    iget v6, v6, Ld9/q;->d:I

    long-to-int v2, v2

    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->remaining()I

    move-result v3

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    move-result v8

    :cond_4
    :goto_2
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v9

    if-eqz v9, :cond_17

    if-ge v2, v1, :cond_17

    const/high16 v12, 0x50000000

    const/high16 v13, 0x10000000

    const/16 v14, 0x16

    const/16 v15, 0x15

    const/high16 v16, 0x4f000000

    const/4 v9, 0x4

    const/high16 v17, -0x31000000

    const/4 v10, 0x3

    const/4 v11, 0x2

    if-eq v7, v11, :cond_d

    if-eq v7, v10, :cond_c

    if-eq v7, v9, :cond_a

    if-eq v7, v15, :cond_9

    if-eq v7, v14, :cond_8

    if-eq v7, v13, :cond_7

    if-eq v7, v12, :cond_6

    const/high16 v12, 0x60000000

    if-ne v7, v12, :cond_5

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v12

    and-int/lit16 v12, v12, 0xff

    shl-int/lit8 v12, v12, 0x18

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v13

    and-int/lit16 v13, v13, 0xff

    shl-int/lit8 v13, v13, 0x10

    or-int/2addr v12, v13

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v13

    and-int/lit16 v13, v13, 0xff

    shl-int/lit8 v13, v13, 0x8

    or-int/2addr v12, v13

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v13

    and-int/lit16 v13, v13, 0xff

    :goto_3
    or-int/2addr v12, v13

    goto/16 :goto_6

    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_6
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v12

    and-int/lit16 v12, v12, 0xff

    shl-int/lit8 v12, v12, 0x18

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v13

    and-int/lit16 v13, v13, 0xff

    shl-int/lit8 v13, v13, 0x10

    or-int/2addr v12, v13

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v13

    and-int/lit16 v13, v13, 0xff

    shl-int/lit8 v13, v13, 0x8

    goto :goto_3

    :cond_7
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v12

    and-int/lit16 v12, v12, 0xff

    shl-int/lit8 v12, v12, 0x18

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v13

    and-int/lit16 v13, v13, 0xff

    shl-int/lit8 v13, v13, 0x10

    goto :goto_3

    :cond_8
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v12

    and-int/lit16 v12, v12, 0xff

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v13

    and-int/lit16 v13, v13, 0xff

    shl-int/lit8 v13, v13, 0x8

    or-int/2addr v12, v13

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v13

    and-int/lit16 v13, v13, 0xff

    shl-int/lit8 v13, v13, 0x10

    or-int/2addr v12, v13

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v13

    :goto_4
    and-int/lit16 v13, v13, 0xff

    shl-int/lit8 v13, v13, 0x18

    goto :goto_3

    :cond_9
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v12

    and-int/lit16 v12, v12, 0xff

    shl-int/lit8 v12, v12, 0x8

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v13

    and-int/lit16 v13, v13, 0xff

    shl-int/lit8 v13, v13, 0x10

    or-int/2addr v12, v13

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v13

    goto :goto_4

    :cond_a
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->getFloat()F

    move-result v12

    const/high16 v13, -0x40800000    # -1.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v12, v13, v14}, Lx8/t;->f(FFF)F

    move-result v12

    const/4 v13, 0x0

    cmpg-float v13, v12, v13

    if-gez v13, :cond_b

    neg-float v12, v12

    mul-float v12, v12, v17

    :goto_5
    float-to-int v12, v12

    goto :goto_6

    :cond_b
    mul-float v12, v12, v16

    goto :goto_5

    :cond_c
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v12

    and-int/lit16 v12, v12, 0xff

    shl-int/lit8 v12, v12, 0x18

    goto :goto_6

    :cond_d
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v12

    and-int/lit16 v12, v12, 0xff

    shl-int/lit8 v12, v12, 0x10

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v13

    goto :goto_4

    :goto_6
    int-to-long v12, v12

    int-to-long v9, v2

    mul-long/2addr v12, v9

    div-long/2addr v12, v4

    long-to-int v9, v12

    if-eq v7, v11, :cond_16

    const/4 v10, 0x3

    if-eq v7, v10, :cond_15

    const/4 v14, 0x4

    if-eq v7, v14, :cond_13

    if-eq v7, v15, :cond_12

    const/16 v10, 0x16

    if-eq v7, v10, :cond_11

    const/high16 v10, 0x10000000

    if-eq v7, v10, :cond_10

    const/high16 v10, 0x50000000

    if-eq v7, v10, :cond_f

    const/high16 v12, 0x60000000

    if-ne v7, v12, :cond_e

    shr-int/lit8 v10, v9, 0x18

    int-to-byte v10, v10

    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v10, v9, 0x10

    int-to-byte v10, v10

    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v10, v9, 0x8

    int-to-byte v10, v10

    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    int-to-byte v9, v9

    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto/16 :goto_7

    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_f
    shr-int/lit8 v10, v9, 0x18

    int-to-byte v10, v10

    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v10, v9, 0x10

    int-to-byte v10, v10

    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v9, v9, 0x8

    int-to-byte v9, v9

    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_7

    :cond_10
    shr-int/lit8 v10, v9, 0x18

    int-to-byte v10, v10

    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v9, v9, 0x10

    int-to-byte v9, v9

    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_7

    :cond_11
    int-to-byte v10, v9

    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v10, v9, 0x8

    int-to-byte v10, v10

    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v10, v9, 0x10

    int-to-byte v10, v10

    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v9, v9, 0x18

    int-to-byte v9, v9

    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_7

    :cond_12
    shr-int/lit8 v10, v9, 0x8

    int-to-byte v10, v10

    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v10, v9, 0x10

    int-to-byte v10, v10

    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v9, v9, 0x18

    int-to-byte v9, v9

    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_7

    :cond_13
    if-gez v9, :cond_14

    int-to-float v9, v9

    neg-float v9, v9

    div-float v9, v9, v17

    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    goto :goto_7

    :cond_14
    int-to-float v9, v9

    div-float v9, v9, v16

    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    goto :goto_7

    :cond_15
    shr-int/lit8 v9, v9, 0x18

    int-to-byte v9, v9

    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_7

    :cond_16
    shr-int/lit8 v10, v9, 0x10

    int-to-byte v10, v10

    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v9, v9, 0x18

    int-to-byte v9, v9

    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    :goto_7
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    move-result v9

    add-int v10, v8, v6

    if-ne v9, v10, :cond_4

    add-int/lit8 v2, v2, 0x1

    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    move-result v8

    goto/16 :goto_2

    :cond_17
    move-object/from16 v1, p1

    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    :goto_8
    iput-object v3, v0, Ld9/x;->R:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public final y()Z
    .locals 2

    iget-object v0, p0, Ld9/x;->t:Ld9/q;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Ld9/q;->j:Z

    if-eqz v0, :cond_0

    sget v0, Lx8/t;->a:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

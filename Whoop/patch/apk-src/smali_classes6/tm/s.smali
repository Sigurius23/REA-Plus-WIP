.class public final Ltm/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:I

.field public B:J

.field public C:J

.field public D:J

.field public E:J

.field public F:I

.field public G:Z

.field public H:Z

.field public I:J

.field public J:F

.field public K:[Ltm/h;

.field public L:[Ljava/nio/ByteBuffer;

.field public M:Ljava/nio/ByteBuffer;

.field public N:I

.field public O:Ljava/nio/ByteBuffer;

.field public P:[B

.field public Q:I

.field public R:I

.field public S:Z

.field public T:Z

.field public U:Z

.field public V:Z

.field public W:I

.field public X:Ltm/l;

.field public Y:Z

.field public Z:J

.field public final a:Ltm/f;

.field public a0:Z

.field public final b:Lq30/w0;

.field public b0:Z

.field public final c:Z

.field public final d:Ltm/n;

.field public final e:Ltm/a0;

.field public final f:[Ltm/h;

.field public final g:[Ltm/h;

.field public final h:Landroid/os/ConditionVariable;

.field public final i:Ltm/k;

.field public final j:Ljava/util/ArrayDeque;

.field public final k:Z

.field public final l:I

.field public m:Ld9/w;

.field public final n:Lan/d;

.field public final o:Lan/d;

.field public final p:Ltm/t;

.field public q:Lsm/f;

.field public r:Lq30/u0;

.field public s:Ltm/q;

.field public t:Ltm/q;

.field public u:Landroid/media/AudioTrack;

.field public v:Ltm/d;

.field public w:Ltm/r;

.field public x:Ltm/r;

.field public y:Lrm/w0;

.field public z:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(Lq30/w0;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Ltm/f;

    iput-object v0, p0, Ltm/s;->a:Ltm/f;

    iget-object v0, p1, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v0, Lq30/w0;

    iput-object v0, p0, Ltm/s;->b:Lq30/w0;

    sget v1, Llo/y;->a:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Ltm/s;->c:Z

    iput-boolean v1, p0, Ltm/s;->k:Z

    iput v1, p0, Ltm/s;->l:I

    iget-object p1, p1, Lq30/w0;->z:Ljava/lang/Object;

    check-cast p1, Ltm/t;

    iput-object p1, p0, Ltm/s;->p:Ltm/t;

    new-instance p1, Landroid/os/ConditionVariable;

    const/4 v2, 0x1

    invoke-direct {p1, v2}, Landroid/os/ConditionVariable;-><init>(Z)V

    iput-object p1, p0, Ltm/s;->h:Landroid/os/ConditionVariable;

    new-instance p1, Ltm/k;

    new-instance v3, Lq30/u0;

    const/16 v4, 0x17

    invoke-direct {v3, p0, v4}, Lq30/u0;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p1, v3}, Ltm/k;-><init>(Lq30/u0;)V

    iput-object p1, p0, Ltm/s;->i:Ltm/k;

    new-instance p1, Ltm/n;

    invoke-direct {p1}, Ltm/m;-><init>()V

    iput-object p1, p0, Ltm/s;->d:Ltm/n;

    new-instance v3, Ltm/a0;

    invoke-direct {v3}, Ltm/m;-><init>()V

    sget-object v4, Llo/y;->f:[B

    iput-object v4, v3, Ltm/a0;->m:[B

    iput-object v3, p0, Ltm/s;->e:Ltm/a0;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ltm/w;

    invoke-direct {v5}, Ltm/m;-><init>()V

    const/4 v6, 0x3

    new-array v6, v6, [Ltm/m;

    aput-object v5, v6, v1

    aput-object p1, v6, v2

    const/4 p1, 0x2

    aput-object v3, v6, p1

    invoke-static {v4, v6}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    iget-object p1, v0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast p1, [Ltm/h;

    invoke-static {v4, p1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    new-array p1, v1, [Ltm/h;

    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ltm/h;

    iput-object p1, p0, Ltm/s;->f:[Ltm/h;

    new-instance p1, Ltm/u;

    invoke-direct {p1}, Ltm/m;-><init>()V

    new-array v0, v2, [Ltm/h;

    aput-object p1, v0, v1

    iput-object v0, p0, Ltm/s;->g:[Ltm/h;

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Ltm/s;->J:F

    sget-object p1, Ltm/d;->G:Ltm/d;

    iput-object p1, p0, Ltm/s;->v:Ltm/d;

    iput v1, p0, Ltm/s;->W:I

    new-instance p1, Ltm/l;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltm/s;->X:Ltm/l;

    new-instance v2, Ltm/r;

    sget-object v3, Lrm/w0;->z:Lrm/w0;

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v8}, Ltm/r;-><init>(Lrm/w0;ZJJ)V

    iput-object v2, p0, Ltm/s;->x:Ltm/r;

    iput-object v3, p0, Ltm/s;->y:Lrm/w0;

    const/4 p1, -0x1

    iput p1, p0, Ltm/s;->R:I

    new-array p1, v1, [Ltm/h;

    iput-object p1, p0, Ltm/s;->K:[Ltm/h;

    new-array p1, v1, [Ljava/nio/ByteBuffer;

    iput-object p1, p0, Ltm/s;->L:[Ljava/nio/ByteBuffer;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Ltm/s;->j:Ljava/util/ArrayDeque;

    new-instance p1, Lan/d;

    const/16 v0, 0x9

    invoke-direct {p1, v0}, Lan/d;-><init>(I)V

    iput-object p1, p0, Ltm/s;->n:Lan/d;

    new-instance p1, Lan/d;

    invoke-direct {p1, v0}, Lan/d;-><init>(I)V

    iput-object p1, p0, Ltm/s;->o:Lan/d;

    return-void
.end method

.method public static e(III)Landroid/media/AudioFormat;
    .locals 1

    new-instance v0, Landroid/media/AudioFormat$Builder;

    invoke-direct {v0}, Landroid/media/AudioFormat$Builder;-><init>()V

    invoke-virtual {v0, p0}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lrm/c0;Ltm/f;)Landroid/util/Pair;
    .locals 12

    iget-object v0, p0, Lrm/c0;->L:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lrm/c0;->I:Ljava/lang/String;

    invoke-static {v0, v1}, Llo/m;->b(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x7

    const/4 v2, 0x6

    const/4 v3, 0x0

    const/16 v4, 0x8

    const/16 v5, 0x12

    const/4 v6, 0x5

    if-eq v0, v6, :cond_0

    if-eq v0, v2, :cond_0

    if-eq v0, v5, :cond_0

    const/16 v7, 0x11

    if-eq v0, v7, :cond_0

    if-eq v0, v1, :cond_0

    if-eq v0, v4, :cond_0

    const/16 v7, 0xe

    if-ne v0, v7, :cond_f

    :cond_0
    if-ne v0, v5, :cond_2

    iget-object v7, p1, Ltm/f;->a:[I

    invoke-static {v7, v5}, Ljava/util/Arrays;->binarySearch([II)I

    move-result v7

    if-ltz v7, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1

    :cond_2
    :goto_0
    if-ne v0, v4, :cond_4

    iget-object v7, p1, Ltm/f;->a:[I

    invoke-static {v7, v4}, Ljava/util/Arrays;->binarySearch([II)I

    move-result v7

    if-ltz v7, :cond_3

    goto :goto_1

    :cond_3
    move v0, v1

    :cond_4
    :goto_1
    iget-object v7, p1, Ltm/f;->a:[I

    invoke-static {v7, v0}, Ljava/util/Arrays;->binarySearch([II)I

    move-result v7

    if-ltz v7, :cond_11

    const/4 v7, 0x3

    const/4 v8, 0x1

    if-ne v0, v5, :cond_9

    sget p1, Llo/y;->a:I

    const/16 v9, 0x1d

    if-lt p1, v9, :cond_8

    iget p0, p0, Lrm/c0;->Z:I

    const/4 p1, -0x1

    if-eq p0, p1, :cond_5

    goto :goto_2

    :cond_5
    const p0, 0xbb80

    :goto_2
    new-instance p1, Landroid/media/AudioAttributes$Builder;

    invoke-direct {p1}, Landroid/media/AudioAttributes$Builder;-><init>()V

    invoke-virtual {p1, v8}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    invoke-virtual {p1, v7}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object p1

    move v9, v4

    :goto_3
    if-lez v9, :cond_7

    new-instance v10, Landroid/media/AudioFormat$Builder;

    invoke-direct {v10}, Landroid/media/AudioFormat$Builder;-><init>()V

    invoke-virtual {v10, v5}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    move-result-object v10

    invoke-virtual {v10, p0}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    move-result-object v10

    invoke-static {v9}, Llo/y;->l(I)I

    move-result v11

    invoke-virtual {v10, v11}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    move-result-object v10

    invoke-virtual {v10}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    move-result-object v10

    invoke-static {v10, p1}, Landroid/media/AudioTrack;->isDirectPlaybackSupported(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    move-result v10

    if-eqz v10, :cond_6

    goto :goto_4

    :cond_6
    add-int/lit8 v9, v9, -0x1

    goto :goto_3

    :cond_7
    const/4 v9, 0x0

    :goto_4
    if-nez v9, :cond_a

    const-string p0, "DefaultAudioSink"

    const-string p1, "E-AC3 JOC encoding supported but no channel count supported"

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v3

    :cond_8
    move v9, v2

    goto :goto_5

    :cond_9
    iget v9, p0, Lrm/c0;->Y:I

    iget p0, p1, Ltm/f;->b:I

    if-le v9, p0, :cond_a

    goto :goto_7

    :cond_a
    :goto_5
    sget p0, Llo/y;->a:I

    const/16 p1, 0x1c

    if-gt p0, p1, :cond_c

    if-ne v9, v1, :cond_b

    move v2, v4

    goto :goto_6

    :cond_b
    if-eq v9, v7, :cond_d

    const/4 p1, 0x4

    if-eq v9, p1, :cond_d

    if-ne v9, v6, :cond_c

    goto :goto_6

    :cond_c
    move v2, v9

    :cond_d
    :goto_6
    const/16 p1, 0x1a

    if-gt p0, p1, :cond_e

    const-string p0, "fugu"

    sget-object p1, Llo/y;->b:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_e

    if-ne v2, v8, :cond_e

    const/4 v2, 0x2

    :cond_e
    invoke-static {v2}, Llo/y;->l(I)I

    move-result p0

    if-nez p0, :cond_10

    :cond_f
    :goto_7
    return-object v3

    :cond_10
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p1, p0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0

    :cond_11
    return-object v3
.end method

.method public static o(Landroid/media/AudioTrack;)Z
    .locals 2

    sget v0, Llo/y;->a:I

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
    .locals 10

    invoke-virtual {p0}, Ltm/s;->u()Z

    move-result v0

    iget-object v1, p0, Ltm/s;->b:Lq30/w0;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ltm/s;->h()Ltm/r;

    move-result-object v0

    iget-object v0, v0, Ltm/r;->a:Lrm/w0;

    iget-object v2, v1, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v2, Ltm/z;

    iget v3, v0, Lrm/w0;->w:F

    iget v4, v2, Ltm/z;->c:F

    cmpl-float v4, v4, v3

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    iput v3, v2, Ltm/z;->c:F

    iput-boolean v5, v2, Ltm/z;->i:Z

    :cond_0
    iget v3, v0, Lrm/w0;->x:F

    iget v4, v2, Ltm/z;->d:F

    cmpl-float v4, v4, v3

    if-eqz v4, :cond_1

    iput v3, v2, Ltm/z;->d:F

    iput-boolean v5, v2, Ltm/z;->i:Z

    :cond_1
    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_2
    sget-object v0, Lrm/w0;->z:Lrm/w0;

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Ltm/s;->u()Z

    move-result v0

    const/4 v9, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ltm/s;->h()Ltm/r;

    move-result-object v0

    iget-boolean v0, v0, Ltm/r;->b:Z

    iget-object v1, v1, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v1, Ltm/x;

    iput-boolean v0, v1, Ltm/x;->m:Z

    move v4, v0

    goto :goto_2

    :cond_3
    move v4, v9

    :goto_2
    new-instance v2, Ltm/r;

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    iget-object p1, p0, Ltm/s;->t:Ltm/q;

    invoke-virtual {p0}, Ltm/s;->j()J

    move-result-wide v0

    const-wide/32 v7, 0xf4240

    mul-long/2addr v0, v7

    iget p1, p1, Ltm/q;->e:I

    int-to-long p1, p1

    div-long v7, v0, p1

    invoke-direct/range {v2 .. v8}, Ltm/r;-><init>(Lrm/w0;ZJJ)V

    iget-object p1, p0, Ltm/s;->j:Ljava/util/ArrayDeque;

    invoke-virtual {p1, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Ltm/s;->t:Ltm/q;

    iget-object p1, p1, Ltm/q;->i:[Ltm/h;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    array-length v0, p1

    move v1, v9

    :goto_3
    if-ge v1, v0, :cond_5

    aget-object v2, p1, v1

    invoke-interface {v2}, Ltm/h;->isActive()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_4
    invoke-interface {v2}, Ltm/h;->flush()V

    :goto_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_5
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array v0, p1, [Ltm/h;

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ltm/h;

    iput-object p2, p0, Ltm/s;->K:[Ltm/h;

    new-array p1, p1, [Ljava/nio/ByteBuffer;

    iput-object p1, p0, Ltm/s;->L:[Ljava/nio/ByteBuffer;

    :goto_5
    iget-object p1, p0, Ltm/s;->K:[Ltm/h;

    array-length p2, p1

    if-ge v9, p2, :cond_6

    aget-object p1, p1, v9

    invoke-interface {p1}, Ltm/h;->flush()V

    iget-object p2, p0, Ltm/s;->L:[Ljava/nio/ByteBuffer;

    invoke-interface {p1}, Ltm/h;->a()Ljava/nio/ByteBuffer;

    move-result-object p1

    aput-object p1, p2, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_6
    iget-object p1, p0, Ltm/s;->r:Lq30/u0;

    if-eqz p1, :cond_7

    iget-object p1, p1, Lq30/u0;->x:Ljava/lang/Object;

    check-cast p1, Ltm/v;

    iget-object p1, p1, Ltm/v;->f1:Lq3/i;

    iget-object p2, p1, Lq3/i;->w:Ljava/lang/Object;

    check-cast p2, Landroid/os/Handler;

    if-eqz p2, :cond_7

    new-instance v0, Ld9/i;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v4, v1}, Ld9/i;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_7
    return-void
.end method

.method public final b(Lrm/c0;[I)V
    .locals 23

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    iget-object v0, v3, Lrm/c0;->L:Ljava/lang/String;

    iget v2, v3, Lrm/c0;->Z:I

    iget v4, v3, Lrm/c0;->Y:I

    iget v5, v3, Lrm/c0;->a0:I

    const-string v6, "audio/raw"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v0, :cond_6

    invoke-static {v5}, Llo/y;->x(I)Z

    move-result v0

    invoke-static {v0}, Llo/a;->e(Z)V

    invoke-static {v5, v4}, Llo/y;->r(II)I

    move-result v0

    iget-boolean v9, v1, Ltm/s;->c:Z

    if-eqz v9, :cond_1

    const/high16 v9, 0x20000000

    if-eq v5, v9, :cond_0

    const/high16 v9, 0x30000000

    if-eq v5, v9, :cond_0

    const/4 v9, 0x4

    if-ne v5, v9, :cond_1

    :cond_0
    iget-object v9, v1, Ltm/s;->g:[Ltm/h;

    goto :goto_0

    :cond_1
    iget-object v9, v1, Ltm/s;->f:[Ltm/h;

    :goto_0
    iget v10, v3, Lrm/c0;->b0:I

    iget v11, v3, Lrm/c0;->c0:I

    iget-object v12, v1, Ltm/s;->e:Ltm/a0;

    iput v10, v12, Ltm/a0;->i:I

    iput v11, v12, Ltm/a0;->j:I

    sget v10, Llo/y;->a:I

    const/16 v11, 0x15

    if-ge v10, v11, :cond_2

    const/16 v10, 0x8

    if-ne v4, v10, :cond_2

    if-nez p2, :cond_2

    const/4 v10, 0x6

    new-array v11, v10, [I

    move v12, v8

    :goto_1
    if-ge v12, v10, :cond_3

    aput v12, v11, v12

    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_2
    move-object/from16 v11, p2

    :cond_3
    iget-object v10, v1, Ltm/s;->d:Ltm/n;

    iput-object v11, v10, Ltm/n;->i:[I

    new-instance v10, Ltm/g;

    invoke-direct {v10, v2, v4, v5}, Ltm/g;-><init>(III)V

    array-length v2, v9

    move v4, v8

    :goto_2
    if-ge v4, v2, :cond_5

    aget-object v5, v9, v4

    :try_start_0
    invoke-interface {v5, v10}, Ltm/h;->e(Ltm/g;)Ltm/g;

    move-result-object v11

    invoke-interface {v5}, Ltm/h;->isActive()Z

    move-result v5
    :try_end_0
    .catch Lcom/google/android/exoplayer2/audio/AudioProcessor$UnhandledAudioFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v5, :cond_4

    move-object v10, v11

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :catch_0
    move-exception v0

    new-instance v2, Lcom/google/android/exoplayer2/audio/AudioSink$ConfigurationException;

    invoke-direct {v2, v0, v3}, Lcom/google/android/exoplayer2/audio/AudioSink$ConfigurationException;-><init>(Lcom/google/android/exoplayer2/audio/AudioProcessor$UnhandledAudioFormatException;Lrm/c0;)V

    throw v2

    :cond_5
    iget v2, v10, Ltm/g;->c:I

    iget v4, v10, Ltm/g;->b:I

    iget v5, v10, Ltm/g;->a:I

    invoke-static {v4}, Llo/y;->l(I)I

    move-result v10

    invoke-static {v2, v4}, Llo/y;->r(II)I

    move-result v4

    move-object v11, v9

    move v9, v2

    move v2, v5

    move v5, v4

    move v4, v0

    move v0, v8

    goto :goto_3

    :cond_6
    new-array v9, v8, [Ltm/h;

    iget-object v0, v1, Ltm/s;->v:Ltm/d;

    invoke-virtual {v1, v3, v0}, Ltm/s;->v(Lrm/c0;Ltm/d;)Z

    move-result v0

    const/4 v5, -0x1

    if-eqz v0, :cond_7

    iget-object v0, v3, Lrm/c0;->L:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v10, v3, Lrm/c0;->I:Ljava/lang/String;

    invoke-static {v0, v10}, Llo/m;->b(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-static {v4}, Llo/y;->l(I)I

    move-result v10

    move v4, v5

    move-object v11, v9

    move v9, v0

    move v0, v7

    goto :goto_3

    :cond_7
    iget-object v0, v1, Ltm/s;->a:Ltm/f;

    invoke-static {v3, v0}, Ltm/s;->f(Lrm/c0;Ltm/f;)Landroid/util/Pair;

    move-result-object v0

    if-eqz v0, :cond_11

    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v10

    move v0, v6

    move-object v11, v9

    move v9, v4

    move v4, v5

    :goto_3
    invoke-static {v2, v10, v9}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    move-result v12

    const/4 v13, -0x2

    if-eq v12, v13, :cond_8

    move v13, v7

    goto :goto_4

    :cond_8
    move v13, v8

    :goto_4
    invoke-static {v13}, Llo/a;->i(Z)V

    iget-boolean v13, v1, Ltm/s;->k:Z

    if-eqz v13, :cond_9

    const-wide/high16 v13, 0x4020000000000000L    # 8.0

    goto :goto_5

    :cond_9
    const-wide/high16 v13, 0x3ff0000000000000L    # 1.0

    :goto_5
    iget-object v15, v1, Ltm/s;->p:Ltm/t;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/32 v17, 0xf4240

    const v15, 0x3d090

    if-eqz v0, :cond_d

    if-eq v0, v7, :cond_c

    if-ne v0, v6, :cond_b

    const/4 v6, 0x5

    if-ne v9, v6, :cond_a

    const v15, 0x7a120

    :cond_a
    invoke-static {v9}, Ltm/t;->a(I)I

    move-result v6

    move/from16 v16, v7

    int-to-long v7, v15

    move/from16 p2, v4

    int-to-long v3, v6

    mul-long/2addr v7, v3

    div-long v7, v7, v17

    invoke-static {v7, v8}, Lvd/f;->k(J)I

    move-result v3

    :goto_6
    move v15, v5

    goto :goto_7

    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_c
    move/from16 p2, v4

    move/from16 v16, v7

    invoke-static {v9}, Ltm/t;->a(I)I

    move-result v3

    const v4, 0x2faf080

    int-to-long v6, v4

    int-to-long v3, v3

    mul-long/2addr v6, v3

    div-long v6, v6, v17

    invoke-static {v6, v7}, Lvd/f;->k(J)I

    move-result v3

    goto :goto_6

    :cond_d
    move/from16 p2, v4

    move/from16 v16, v7

    mul-int/lit8 v3, v12, 0x4

    int-to-long v6, v15

    move-wide/from16 v19, v6

    int-to-long v6, v2

    mul-long v19, v19, v6

    move-wide/from16 v21, v6

    int-to-long v6, v5

    mul-long v19, v19, v6

    div-long v19, v19, v17

    invoke-static/range {v19 .. v20}, Lvd/f;->k(J)I

    move-result v4

    const v8, 0xb71b0

    move v15, v5

    move-wide/from16 v19, v6

    int-to-long v5, v8

    mul-long v5, v5, v21

    mul-long v5, v5, v19

    div-long v5, v5, v17

    invoke-static {v5, v6}, Lvd/f;->k(J)I

    move-result v5

    invoke-static {v3, v4, v5}, Llo/y;->h(III)I

    move-result v3

    :goto_7
    int-to-double v3, v3

    mul-double/2addr v3, v13

    double-to-int v3, v3

    invoke-static {v12, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/2addr v3, v15

    add-int/lit8 v3, v3, -0x1

    div-int/2addr v3, v15

    mul-int/2addr v3, v15

    const-string v4, ") for: "

    if-eqz v9, :cond_10

    if-eqz v10, :cond_f

    const/4 v5, 0x0

    iput-boolean v5, v1, Ltm/s;->a0:Z

    move v7, v2

    new-instance v2, Ltm/q;

    move/from16 v4, p2

    move v5, v0

    move v8, v10

    move v6, v15

    move v10, v3

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v11}, Ltm/q;-><init>(Lrm/c0;IIIIIII[Ltm/h;)V

    invoke-virtual {v1}, Ltm/s;->n()Z

    move-result v0

    if-eqz v0, :cond_e

    iput-object v2, v1, Ltm/s;->s:Ltm/q;

    return-void

    :cond_e
    iput-object v2, v1, Ltm/s;->t:Ltm/q;

    return-void

    :cond_f
    move-object/from16 v3, p1

    move v5, v0

    new-instance v0, Lcom/google/android/exoplayer2/audio/AudioSink$ConfigurationException;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, 0x36

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, "Invalid output channel config (mode="

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Lcom/google/android/exoplayer2/audio/AudioSink$ConfigurationException;-><init>(Ljava/lang/String;Lrm/c0;)V

    throw v0

    :cond_10
    move-object/from16 v3, p1

    move v5, v0

    new-instance v0, Lcom/google/android/exoplayer2/audio/AudioSink$ConfigurationException;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, 0x30

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, "Invalid output encoding (mode="

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Lcom/google/android/exoplayer2/audio/AudioSink$ConfigurationException;-><init>(Ljava/lang/String;Lrm/c0;)V

    throw v0

    :cond_11
    new-instance v0, Lcom/google/android/exoplayer2/audio/AudioSink$ConfigurationException;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x25

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Unable to configure passthrough for: "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Lcom/google/android/exoplayer2/audio/AudioSink$ConfigurationException;-><init>(Ljava/lang/String;Lrm/c0;)V

    throw v0
.end method

.method public final c()Z
    .locals 9

    iget v0, p0, Ltm/s;->R:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    iput v2, p0, Ltm/s;->R:I

    :goto_0
    move v0, v1

    goto :goto_1

    :cond_0
    move v0, v2

    :goto_1
    iget v4, p0, Ltm/s;->R:I

    iget-object v5, p0, Ltm/s;->K:[Ltm/h;

    array-length v6, v5

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    if-ge v4, v6, :cond_3

    aget-object v4, v5, v4

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ltm/h;->c()V

    :cond_1
    invoke-virtual {p0, v7, v8}, Ltm/s;->q(J)V

    invoke-interface {v4}, Ltm/h;->d()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    iget v0, p0, Ltm/s;->R:I

    add-int/2addr v0, v1

    iput v0, p0, Ltm/s;->R:I

    goto :goto_0

    :cond_3
    iget-object v0, p0, Ltm/s;->O:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_4

    invoke-virtual {p0, v0, v7, v8}, Ltm/s;->w(Ljava/nio/ByteBuffer;J)V

    iget-object v0, p0, Ltm/s;->O:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_4

    :goto_2
    return v2

    :cond_4
    iput v3, p0, Ltm/s;->R:I

    return v1
.end method

.method public final d()V
    .locals 11

    invoke-virtual {p0}, Ltm/s;->n()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Ltm/s;->B:J

    iput-wide v2, p0, Ltm/s;->C:J

    iput-wide v2, p0, Ltm/s;->D:J

    iput-wide v2, p0, Ltm/s;->E:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Ltm/s;->b0:Z

    iput v0, p0, Ltm/s;->F:I

    new-instance v4, Ltm/r;

    invoke-virtual {p0}, Ltm/s;->h()Ltm/r;

    move-result-object v5

    iget-object v5, v5, Ltm/r;->a:Lrm/w0;

    invoke-virtual {p0}, Ltm/s;->h()Ltm/r;

    move-result-object v6

    iget-boolean v6, v6, Ltm/r;->b:Z

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    invoke-direct/range {v4 .. v10}, Ltm/r;-><init>(Lrm/w0;ZJJ)V

    iput-object v4, p0, Ltm/s;->x:Ltm/r;

    iput-wide v2, p0, Ltm/s;->I:J

    iput-object v1, p0, Ltm/s;->w:Ltm/r;

    iget-object v4, p0, Ltm/s;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->clear()V

    iput-object v1, p0, Ltm/s;->M:Ljava/nio/ByteBuffer;

    iput v0, p0, Ltm/s;->N:I

    iput-object v1, p0, Ltm/s;->O:Ljava/nio/ByteBuffer;

    iput-boolean v0, p0, Ltm/s;->T:Z

    iput-boolean v0, p0, Ltm/s;->S:Z

    const/4 v4, -0x1

    iput v4, p0, Ltm/s;->R:I

    iput-object v1, p0, Ltm/s;->z:Ljava/nio/ByteBuffer;

    iput v0, p0, Ltm/s;->A:I

    iget-object v4, p0, Ltm/s;->e:Ltm/a0;

    iput-wide v2, v4, Ltm/a0;->o:J

    move v4, v0

    :goto_0
    iget-object v5, p0, Ltm/s;->K:[Ltm/h;

    array-length v6, v5

    if-ge v4, v6, :cond_0

    aget-object v5, v5, v4

    invoke-interface {v5}, Ltm/h;->flush()V

    iget-object v6, p0, Ltm/s;->L:[Ljava/nio/ByteBuffer;

    invoke-interface {v5}, Ltm/h;->a()Ljava/nio/ByteBuffer;

    move-result-object v5

    aput-object v5, v6, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    iget-object v4, p0, Ltm/s;->i:Ltm/k;

    iget-object v5, v4, Ltm/k;->c:Landroid/media/AudioTrack;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v5

    const/4 v6, 0x3

    if-ne v5, v6, :cond_1

    iget-object v5, p0, Ltm/s;->u:Landroid/media/AudioTrack;

    invoke-virtual {v5}, Landroid/media/AudioTrack;->pause()V

    :cond_1
    iget-object v5, p0, Ltm/s;->u:Landroid/media/AudioTrack;

    invoke-static {v5}, Ltm/s;->o(Landroid/media/AudioTrack;)Z

    move-result v5

    if-eqz v5, :cond_2

    iget-object v5, p0, Ltm/s;->m:Ld9/w;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, p0, Ltm/s;->u:Landroid/media/AudioTrack;

    invoke-virtual {v5, v6}, Ld9/w;->a(Landroid/media/AudioTrack;)V

    :cond_2
    iget-object v5, p0, Ltm/s;->u:Landroid/media/AudioTrack;

    iput-object v1, p0, Ltm/s;->u:Landroid/media/AudioTrack;

    sget v6, Llo/y;->a:I

    const/16 v7, 0x15

    if-ge v6, v7, :cond_3

    iget-boolean v6, p0, Ltm/s;->V:Z

    if-nez v6, :cond_3

    iput v0, p0, Ltm/s;->W:I

    :cond_3
    iget-object v6, p0, Ltm/s;->s:Ltm/q;

    if-eqz v6, :cond_4

    iput-object v6, p0, Ltm/s;->t:Ltm/q;

    iput-object v1, p0, Ltm/s;->s:Ltm/q;

    :cond_4
    iput-wide v2, v4, Ltm/k;->l:J

    iput v0, v4, Ltm/k;->w:I

    iput v0, v4, Ltm/k;->v:I

    iput-wide v2, v4, Ltm/k;->m:J

    iput-wide v2, v4, Ltm/k;->C:J

    iput-wide v2, v4, Ltm/k;->F:J

    iput-boolean v0, v4, Ltm/k;->k:Z

    iput-object v1, v4, Ltm/k;->c:Landroid/media/AudioTrack;

    iput-object v1, v4, Ltm/k;->f:Ld9/l;

    iget-object v0, p0, Ltm/s;->h:Landroid/os/ConditionVariable;

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->close()V

    new-instance v0, Ltm/o;

    invoke-direct {v0, p0, v5}, Ltm/o;-><init>(Ltm/s;Landroid/media/AudioTrack;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_5
    iget-object v0, p0, Ltm/s;->o:Lan/d;

    iput-object v1, v0, Lan/d;->y:Ljava/lang/Object;

    iget-object v0, p0, Ltm/s;->n:Lan/d;

    iput-object v1, v0, Lan/d;->y:Ljava/lang/Object;

    return-void
.end method

.method public final g(Lrm/c0;)I
    .locals 4

    iget-object v0, p1, Lrm/c0;->L:Ljava/lang/String;

    iget v1, p1, Lrm/c0;->a0:I

    const-string v2, "audio/raw"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eqz v0, :cond_2

    invoke-static {v1}, Llo/y;->x(I)Z

    move-result p1

    if-nez p1, :cond_0

    const/16 p1, 0x21

    const-string v0, "Invalid PCM encoding: "

    const-string v3, "DefaultAudioSink"

    invoke-static {p1, v1, v0, v3}, Lq63/c;->t(IILjava/lang/String;Ljava/lang/String;)V

    return v2

    :cond_0
    if-eq v1, v3, :cond_4

    iget-boolean p1, p0, Ltm/s;->c:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x4

    if-ne v1, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    iget-boolean v0, p0, Ltm/s;->a0:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Ltm/s;->v:Ltm/d;

    invoke-virtual {p0, p1, v0}, Ltm/s;->v(Lrm/c0;Ltm/d;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Ltm/s;->a:Ltm/f;

    invoke-static {p1, v0}, Ltm/s;->f(Lrm/c0;Ltm/f;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_5

    :cond_4
    :goto_0
    return v3

    :cond_5
    return v2
.end method

.method public final h()Ltm/r;
    .locals 2

    iget-object v0, p0, Ltm/s;->w:Ltm/r;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Ltm/s;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltm/r;

    return-object v0

    :cond_1
    iget-object v0, p0, Ltm/s;->x:Ltm/r;

    return-object v0
.end method

.method public final i()J
    .locals 5

    iget-object v0, p0, Ltm/s;->t:Ltm/q;

    iget v1, v0, Ltm/q;->c:I

    if-nez v1, :cond_0

    iget-wide v1, p0, Ltm/s;->B:J

    iget v0, v0, Ltm/q;->b:I

    int-to-long v3, v0

    div-long/2addr v1, v3

    return-wide v1

    :cond_0
    iget-wide v0, p0, Ltm/s;->C:J

    return-wide v0
.end method

.method public final j()J
    .locals 5

    iget-object v0, p0, Ltm/s;->t:Ltm/q;

    iget v1, v0, Ltm/q;->c:I

    if-nez v1, :cond_0

    iget-wide v1, p0, Ltm/s;->D:J

    iget v0, v0, Ltm/q;->d:I

    int-to-long v3, v0

    div-long/2addr v1, v3

    return-wide v1

    :cond_0
    iget-wide v0, p0, Ltm/s;->E:J

    return-wide v0
.end method

.method public final k(Ljava/nio/ByteBuffer;JI)Z
    .locals 25

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-wide/from16 v2, p2

    move/from16 v4, p4

    iget-object v5, v1, Ltm/s;->M:Ljava/nio/ByteBuffer;

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
    invoke-static {v5}, Llo/a;->e(Z)V

    iget-object v5, v1, Ltm/s;->s:Ltm/q;

    const/4 v8, 0x3

    const/4 v9, 0x0

    if-eqz v5, :cond_6

    invoke-virtual {v1}, Ltm/s;->c()Z

    move-result v5

    if-nez v5, :cond_2

    :goto_2
    move/from16 v20, v7

    goto/16 :goto_16

    :cond_2
    iget-object v5, v1, Ltm/s;->s:Ltm/q;

    iget-object v10, v1, Ltm/s;->t:Ltm/q;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v11, v10, Ltm/q;->c:I

    iget v12, v5, Ltm/q;->c:I

    if-ne v11, v12, :cond_3

    iget v11, v10, Ltm/q;->g:I

    iget v12, v5, Ltm/q;->g:I

    if-ne v11, v12, :cond_3

    iget v11, v10, Ltm/q;->e:I

    iget v12, v5, Ltm/q;->e:I

    if-ne v11, v12, :cond_3

    iget v11, v10, Ltm/q;->f:I

    iget v12, v5, Ltm/q;->f:I

    if-ne v11, v12, :cond_3

    iget v10, v10, Ltm/q;->d:I

    iget v5, v5, Ltm/q;->d:I

    if-ne v10, v5, :cond_3

    iget-object v5, v1, Ltm/s;->s:Ltm/q;

    iput-object v5, v1, Ltm/s;->t:Ltm/q;

    iput-object v9, v1, Ltm/s;->s:Ltm/q;

    iget-object v5, v1, Ltm/s;->u:Landroid/media/AudioTrack;

    invoke-static {v5}, Ltm/s;->o(Landroid/media/AudioTrack;)Z

    move-result v5

    if-eqz v5, :cond_5

    iget v5, v1, Ltm/s;->l:I

    if-eq v5, v8, :cond_5

    iget-object v5, v1, Ltm/s;->u:Landroid/media/AudioTrack;

    invoke-virtual {v5}, Landroid/media/AudioTrack;->setOffloadEndOfStream()V

    iget-object v5, v1, Ltm/s;->u:Landroid/media/AudioTrack;

    iget-object v10, v1, Ltm/s;->t:Ltm/q;

    iget-object v10, v10, Ltm/q;->a:Lrm/c0;

    iget v11, v10, Lrm/c0;->b0:I

    iget v10, v10, Lrm/c0;->c0:I

    invoke-virtual {v5, v11, v10}, Landroid/media/AudioTrack;->setOffloadDelayPadding(II)V

    iput-boolean v6, v1, Ltm/s;->b0:Z

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ltm/s;->p()V

    invoke-virtual {v1}, Ltm/s;->l()Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, Ltm/s;->d()V

    :cond_5
    :goto_3
    invoke-virtual {v1, v2, v3}, Ltm/s;->a(J)V

    :cond_6
    invoke-virtual {v1}, Ltm/s;->n()Z

    move-result v5

    iget-object v10, v1, Ltm/s;->n:Lan/d;

    if-nez v5, :cond_8

    :try_start_0
    invoke-virtual {v1}, Ltm/s;->m()V
    :try_end_0
    .catch Lcom/google/android/exoplayer2/audio/AudioSink$InitializationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    iget-boolean v2, v0, Lcom/google/android/exoplayer2/audio/AudioSink$InitializationException;->w:Z

    if-nez v2, :cond_7

    invoke-virtual {v10, v0}, Lan/d;->O(Ljava/lang/Exception;)V

    return v7

    :cond_7
    throw v0

    :cond_8
    :goto_4
    iput-object v9, v10, Lan/d;->y:Ljava/lang/Object;

    iget-boolean v5, v1, Ltm/s;->H:Z

    iget-object v10, v1, Ltm/s;->i:Ltm/k;

    const-wide/16 v11, 0x0

    if-eqz v5, :cond_a

    invoke-static {v11, v12, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v13

    iput-wide v13, v1, Ltm/s;->I:J

    iput-boolean v7, v1, Ltm/s;->G:Z

    iput-boolean v7, v1, Ltm/s;->H:Z

    iget-boolean v5, v1, Ltm/s;->k:Z

    if-eqz v5, :cond_9

    sget v5, Llo/y;->a:I

    const/16 v13, 0x17

    if-lt v5, v13, :cond_9

    iget-object v5, v1, Ltm/s;->y:Lrm/w0;

    invoke-virtual {v1, v5}, Ltm/s;->t(Lrm/w0;)V

    :cond_9
    invoke-virtual {v1, v2, v3}, Ltm/s;->a(J)V

    iget-boolean v5, v1, Ltm/s;->U:Z

    if-eqz v5, :cond_a

    iput-boolean v6, v1, Ltm/s;->U:Z

    invoke-virtual {v1}, Ltm/s;->n()Z

    move-result v5

    if-eqz v5, :cond_a

    iget-object v5, v10, Ltm/k;->f:Ld9/l;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ld9/l;->a()V

    iget-object v5, v1, Ltm/s;->u:Landroid/media/AudioTrack;

    invoke-virtual {v5}, Landroid/media/AudioTrack;->play()V

    :cond_a
    invoke-virtual {v1}, Ltm/s;->j()J

    move-result-wide v13

    iget-object v5, v10, Ltm/k;->c:Landroid/media/AudioTrack;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v5

    iget-boolean v15, v10, Ltm/k;->h:Z

    move-wide/from16 v16, v11

    const/4 v11, 0x2

    if-eqz v15, :cond_c

    if-ne v5, v11, :cond_b

    iput-boolean v7, v10, Ltm/k;->p:Z

    return v7

    :cond_b
    if-ne v5, v6, :cond_c

    invoke-virtual {v10}, Ltm/k;->a()J

    move-result-wide v18

    cmp-long v12, v18, v16

    if-nez v12, :cond_c

    goto/16 :goto_2

    :cond_c
    iget-boolean v12, v10, Ltm/k;->p:Z

    invoke-virtual {v10, v13, v14}, Ltm/k;->b(J)Z

    move-result v13

    iput-boolean v13, v10, Ltm/k;->p:Z

    if-eqz v12, :cond_d

    if-nez v13, :cond_d

    if-eq v5, v6, :cond_d

    iget-object v5, v10, Ltm/k;->a:Lq30/u0;

    iget v12, v10, Ltm/k;->e:I

    iget-wide v13, v10, Ltm/k;->i:J

    invoke-static {v13, v14}, Llo/y;->G(J)J

    move-result-wide v21

    iget-object v5, v5, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v5, Ltm/s;

    iget-object v13, v5, Ltm/s;->r:Lq30/u0;

    if-eqz v13, :cond_d

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v13

    move v15, v11

    move/from16 v20, v12

    iget-wide v11, v5, Ltm/s;->Z:J

    sub-long v23, v13, v11

    iget-object v5, v5, Ltm/s;->r:Lq30/u0;

    iget-object v5, v5, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v5, Ltm/v;

    iget-object v5, v5, Ltm/v;->f1:Lq3/i;

    iget-object v11, v5, Lq3/i;->w:Ljava/lang/Object;

    check-cast v11, Landroid/os/Handler;

    if-eqz v11, :cond_e

    new-instance v18, Ltm/i;

    move-object/from16 v19, v5

    invoke-direct/range {v18 .. v24}, Ltm/i;-><init>(Lq3/i;IJJ)V

    move-object/from16 v5, v18

    invoke-virtual {v11, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_5

    :cond_d
    move v15, v11

    :cond_e
    :goto_5
    iget-object v5, v1, Ltm/s;->M:Ljava/nio/ByteBuffer;

    if-nez v5, :cond_26

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object v5

    sget-object v11, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    if-ne v5, v11, :cond_f

    move v5, v6

    goto :goto_6

    :cond_f
    move v5, v7

    :goto_6
    invoke-static {v5}, Llo/a;->e(Z)V

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v5

    if-nez v5, :cond_10

    goto/16 :goto_13

    :cond_10
    iget-object v5, v1, Ltm/s;->t:Ltm/q;

    iget v11, v5, Ltm/q;->c:I

    if-eqz v11, :cond_1e

    iget v11, v1, Ltm/s;->F:I

    if-nez v11, :cond_1e

    iget v5, v5, Ltm/q;->g:I

    const/4 v11, -0x2

    const/16 v12, 0xa

    const/16 v14, 0x10

    const/4 v13, -0x1

    packed-switch v5, :pswitch_data_0

    :pswitch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const/16 v2, 0x26

    const-string v3, "Unexpected audio encoding: "

    invoke-static {v2, v5, v3}, Lr80/c;->j(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    new-array v5, v14, [B

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v8

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    new-instance v8, Llo/s;

    invoke-direct {v8, v5, v14, v7, v7}, Llo/s;-><init>([BIIB)V

    invoke-static {v8}, Ltm/a;->e(Llo/s;)Lcr/p;

    move-result-object v5

    iget v13, v5, Lcr/p;->c:I

    goto/16 :goto_12

    :pswitch_2
    const/16 v13, 0x400

    goto/16 :goto_12

    :pswitch_3
    const/16 v13, 0x200

    goto/16 :goto_12

    :pswitch_4
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v5

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v8

    sub-int/2addr v8, v12

    move v12, v5

    :goto_7
    if-gt v12, v8, :cond_13

    add-int/lit8 v15, v12, 0x4

    sget v18, Llo/y;->a:I

    invoke-virtual {v0, v15}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v15

    move/from16 v19, v14

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object v14

    sget-object v7, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    if-ne v14, v7, :cond_11

    goto :goto_8

    :cond_11
    invoke-static {v15}, Ljava/lang/Integer;->reverseBytes(I)I

    move-result v15

    :goto_8
    and-int/lit8 v7, v15, -0x2

    const v14, -0x78d9046

    if-ne v7, v14, :cond_12

    sub-int/2addr v12, v5

    goto :goto_9

    :cond_12
    add-int/lit8 v12, v12, 0x1

    move/from16 v14, v19

    const/4 v7, 0x0

    goto :goto_7

    :cond_13
    move/from16 v19, v14

    move v12, v13

    :goto_9
    if-ne v12, v13, :cond_14

    const/4 v13, 0x0

    goto/16 :goto_12

    :cond_14
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v5

    add-int/2addr v5, v12

    add-int/lit8 v5, v5, 0x7

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    and-int/lit16 v5, v5, 0xff

    const/16 v7, 0xbb

    if-ne v5, v7, :cond_15

    move v5, v6

    goto :goto_a

    :cond_15
    const/4 v5, 0x0

    :goto_a
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v7

    add-int/2addr v7, v12

    if-eqz v5, :cond_16

    const/16 v5, 0x9

    goto :goto_b

    :cond_16
    const/16 v5, 0x8

    :goto_b
    add-int/2addr v7, v5

    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    shr-int/lit8 v5, v5, 0x4

    and-int/lit8 v5, v5, 0x7

    const/16 v7, 0x28

    shl-int v5, v7, v5

    mul-int/lit8 v13, v5, 0x10

    goto/16 :goto_12

    :pswitch_5
    const/16 v13, 0x800

    goto/16 :goto_12

    :pswitch_6
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v5

    sget v7, Llo/y;->a:I

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v5

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object v7

    sget-object v8, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    if-ne v7, v8, :cond_17

    goto :goto_c

    :cond_17
    invoke-static {v5}, Ljava/lang/Integer;->reverseBytes(I)I

    move-result v5

    :goto_c
    invoke-static {v5}, Ltm/a;->g(I)I

    move-result v5

    if-eq v5, v13, :cond_18

    move v13, v5

    goto/16 :goto_12

    :cond_18
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :pswitch_7
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v5

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v7

    if-eq v7, v11, :cond_1b

    if-eq v7, v13, :cond_1a

    const/16 v8, 0x1f

    if-eq v7, v8, :cond_19

    add-int/lit8 v7, v5, 0x4

    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v7

    and-int/2addr v7, v6

    shl-int/lit8 v7, v7, 0x6

    add-int/lit8 v5, v5, 0x5

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    :goto_d
    and-int/lit16 v5, v5, 0xfc

    :goto_e
    shr-int/2addr v5, v15

    or-int/2addr v5, v7

    goto :goto_10

    :cond_19
    add-int/lit8 v7, v5, 0x5

    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v7

    and-int/lit8 v7, v7, 0x7

    shl-int/lit8 v7, v7, 0x4

    add-int/lit8 v5, v5, 0x6

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    :goto_f
    and-int/lit8 v5, v5, 0x3c

    goto :goto_e

    :cond_1a
    add-int/lit8 v7, v5, 0x4

    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v7

    and-int/lit8 v7, v7, 0x7

    shl-int/lit8 v7, v7, 0x4

    add-int/lit8 v5, v5, 0x7

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    goto :goto_f

    :cond_1b
    add-int/lit8 v7, v5, 0x5

    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v7

    and-int/2addr v7, v6

    shl-int/lit8 v7, v7, 0x6

    add-int/lit8 v5, v5, 0x4

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    goto :goto_d

    :goto_10
    add-int/2addr v5, v6

    mul-int/lit8 v13, v5, 0x20

    goto :goto_12

    :pswitch_8
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v5

    add-int/lit8 v5, v5, 0x5

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    and-int/lit16 v5, v5, 0xf8

    shr-int/2addr v5, v8

    if-le v5, v12, :cond_1d

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v5

    add-int/lit8 v5, v5, 0x4

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    and-int/lit16 v5, v5, 0xc0

    shr-int/lit8 v5, v5, 0x6

    if-ne v5, v8, :cond_1c

    goto :goto_11

    :cond_1c
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v5

    add-int/lit8 v5, v5, 0x4

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    and-int/lit8 v5, v5, 0x30

    shr-int/lit8 v8, v5, 0x4

    :goto_11
    sget-object v5, Ltm/a;->c:[I

    aget v5, v5, v8

    mul-int/lit16 v13, v5, 0x100

    goto :goto_12

    :cond_1d
    const/16 v13, 0x600

    :goto_12
    iput v13, v1, Ltm/s;->F:I

    if-nez v13, :cond_1e

    :goto_13
    return v6

    :cond_1e
    iget-object v5, v1, Ltm/s;->w:Ltm/r;

    if-eqz v5, :cond_21

    invoke-virtual {v1}, Ltm/s;->c()Z

    move-result v5

    if-nez v5, :cond_20

    :cond_1f
    :goto_14
    const/16 v20, 0x0

    goto/16 :goto_16

    :cond_20
    invoke-virtual {v1, v2, v3}, Ltm/s;->a(J)V

    iput-object v9, v1, Ltm/s;->w:Ltm/r;

    :cond_21
    iget-wide v7, v1, Ltm/s;->I:J

    iget-object v5, v1, Ltm/s;->t:Ltm/q;

    invoke-virtual {v1}, Ltm/s;->i()J

    move-result-wide v11

    iget-object v13, v1, Ltm/s;->e:Ltm/a0;

    iget-wide v13, v13, Ltm/a0;->o:J

    sub-long/2addr v11, v13

    const-wide/32 v13, 0xf4240

    mul-long/2addr v11, v13

    iget-object v5, v5, Ltm/q;->a:Lrm/c0;

    iget v5, v5, Lrm/c0;->Z:I

    int-to-long v13, v5

    div-long/2addr v11, v13

    add-long/2addr v11, v7

    iget-boolean v5, v1, Ltm/s;->G:Z

    if-nez v5, :cond_22

    sub-long v7, v11, v2

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    move-result-wide v7

    const-wide/32 v13, 0x30d40

    cmp-long v5, v7, v13

    if-lez v5, :cond_22

    iget-object v5, v1, Ltm/s;->r:Lq30/u0;

    new-instance v7, Lcom/google/android/exoplayer2/audio/AudioSink$UnexpectedDiscontinuityException;

    new-instance v8, Ljava/lang/StringBuilder;

    const/16 v13, 0x67

    invoke-direct {v8, v13}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v13, "Unexpected audio track timestamp discontinuity: expected "

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v13, ", got "

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v7}, Lq30/u0;->D(Ljava/lang/Exception;)V

    iput-boolean v6, v1, Ltm/s;->G:Z

    :cond_22
    iget-boolean v5, v1, Ltm/s;->G:Z

    if-eqz v5, :cond_24

    invoke-virtual {v1}, Ltm/s;->c()Z

    move-result v5

    if-nez v5, :cond_23

    goto :goto_14

    :cond_23
    sub-long v7, v2, v11

    iget-wide v11, v1, Ltm/s;->I:J

    add-long/2addr v11, v7

    iput-wide v11, v1, Ltm/s;->I:J

    const/4 v5, 0x0

    iput-boolean v5, v1, Ltm/s;->G:Z

    invoke-virtual {v1, v2, v3}, Ltm/s;->a(J)V

    iget-object v5, v1, Ltm/s;->r:Lq30/u0;

    if-eqz v5, :cond_24

    cmp-long v7, v7, v16

    if-eqz v7, :cond_24

    iget-object v5, v5, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v5, Ltm/v;

    iput-boolean v6, v5, Ltm/v;->m1:Z

    :cond_24
    iget-object v5, v1, Ltm/s;->t:Ltm/q;

    iget v5, v5, Ltm/q;->c:I

    if-nez v5, :cond_25

    iget-wide v7, v1, Ltm/s;->B:J

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v5

    int-to-long v11, v5

    add-long/2addr v7, v11

    iput-wide v7, v1, Ltm/s;->B:J

    goto :goto_15

    :cond_25
    iget-wide v7, v1, Ltm/s;->C:J

    iget v5, v1, Ltm/s;->F:I

    mul-int/2addr v5, v4

    int-to-long v11, v5

    add-long/2addr v7, v11

    iput-wide v7, v1, Ltm/s;->C:J

    :goto_15
    iput-object v0, v1, Ltm/s;->M:Ljava/nio/ByteBuffer;

    iput v4, v1, Ltm/s;->N:I

    :cond_26
    invoke-virtual {v1, v2, v3}, Ltm/s;->q(J)V

    iget-object v0, v1, Ltm/s;->M:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_27

    iput-object v9, v1, Ltm/s;->M:Ljava/nio/ByteBuffer;

    const/4 v5, 0x0

    iput v5, v1, Ltm/s;->N:I

    return v6

    :cond_27
    invoke-virtual {v1}, Ltm/s;->j()J

    move-result-wide v2

    iget-wide v4, v10, Ltm/k;->y:J

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v4, v7

    if-eqz v0, :cond_1f

    cmp-long v0, v2, v16

    if-lez v0, :cond_1f

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, v10, Ltm/k;->y:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0xc8

    cmp-long v0, v2, v4

    if-ltz v0, :cond_1f

    const-string v0, "DefaultAudioSink"

    const-string v2, "Resetting stalled audio track"

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v1}, Ltm/s;->d()V

    return v6

    :goto_16
    return v20

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_2
        :pswitch_5
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_8
    .end packed-switch
.end method

.method public final l()Z
    .locals 3

    invoke-virtual {p0}, Ltm/s;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ltm/s;->i:Ltm/k;

    invoke-virtual {p0}, Ltm/s;->j()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ltm/k;->b(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final m()V
    .locals 15

    iget-object v0, p0, Ltm/s;->h:Landroid/os/ConditionVariable;

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->block()V

    const/4 v1, 0x1

    :try_start_0
    iget-object v0, p0, Ltm/s;->t:Ltm/q;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Lcom/google/android/exoplayer2/audio/AudioSink$InitializationException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    iget-boolean v2, p0, Ltm/s;->Y:Z

    iget-object v3, p0, Ltm/s;->v:Ltm/d;

    iget v4, p0, Ltm/s;->W:I

    invoke-virtual {v0, v2, v3, v4}, Ltm/q;->a(ZLtm/d;I)Landroid/media/AudioTrack;

    move-result-object v0
    :try_end_1
    .catch Lcom/google/android/exoplayer2/audio/AudioSink$InitializationException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    :try_start_2
    iget-object v2, p0, Ltm/s;->r:Lq30/u0;

    if-eqz v2, :cond_0

    invoke-virtual {v2, v0}, Lq30/u0;->D(Ljava/lang/Exception;)V

    :cond_0
    throw v0
    :try_end_2
    .catch Lcom/google/android/exoplayer2/audio/AudioSink$InitializationException; {:try_start_2 .. :try_end_2} :catch_1

    :goto_0
    move-object v2, v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0

    :goto_1
    iget-object v0, p0, Ltm/s;->t:Ltm/q;

    iget v3, v0, Ltm/q;->h:I

    const v4, 0xf4240

    if-le v3, v4, :cond_b

    new-instance v5, Ltm/q;

    iget-object v6, v0, Ltm/q;->a:Lrm/c0;

    iget v7, v0, Ltm/q;->b:I

    iget v8, v0, Ltm/q;->c:I

    iget v9, v0, Ltm/q;->d:I

    iget v10, v0, Ltm/q;->e:I

    iget v11, v0, Ltm/q;->f:I

    iget v12, v0, Ltm/q;->g:I

    iget-object v14, v0, Ltm/q;->i:[Ltm/h;

    const v13, 0xf4240

    invoke-direct/range {v5 .. v14}, Ltm/q;-><init>(Lrm/c0;IIIIIII[Ltm/h;)V

    :try_start_3
    iget-boolean v0, p0, Ltm/s;->Y:Z

    iget-object v3, p0, Ltm/s;->v:Ltm/d;

    iget v4, p0, Ltm/s;->W:I

    invoke-virtual {v5, v0, v3, v4}, Ltm/q;->a(ZLtm/d;I)Landroid/media/AudioTrack;

    move-result-object v0
    :try_end_3
    .catch Lcom/google/android/exoplayer2/audio/AudioSink$InitializationException; {:try_start_3 .. :try_end_3} :catch_3

    :try_start_4
    iput-object v5, p0, Ltm/s;->t:Ltm/q;
    :try_end_4
    .catch Lcom/google/android/exoplayer2/audio/AudioSink$InitializationException; {:try_start_4 .. :try_end_4} :catch_2

    :goto_2
    iput-object v0, p0, Ltm/s;->u:Landroid/media/AudioTrack;

    invoke-static {v0}, Ltm/s;->o(Landroid/media/AudioTrack;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ltm/s;->u:Landroid/media/AudioTrack;

    iget-object v2, p0, Ltm/s;->m:Ld9/w;

    if-nez v2, :cond_1

    new-instance v2, Ld9/w;

    invoke-direct {v2, p0}, Ld9/w;-><init>(Ltm/s;)V

    iput-object v2, p0, Ltm/s;->m:Ld9/w;

    :cond_1
    iget-object v2, p0, Ltm/s;->m:Ld9/w;

    iget-object v3, v2, Ld9/w;->b:Landroid/os/Handler;

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Ld9/u;

    invoke-direct {v4, v3}, Ld9/u;-><init>(Landroid/os/Handler;)V

    iget-object v2, v2, Ld9/w;->c:Ljava/lang/Object;

    check-cast v2, Ld9/v;

    invoke-virtual {v0, v4, v2}, Landroid/media/AudioTrack;->registerStreamEventCallback(Ljava/util/concurrent/Executor;Landroid/media/AudioTrack$StreamEventCallback;)V

    iget v0, p0, Ltm/s;->l:I

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    iget-object v0, p0, Ltm/s;->u:Landroid/media/AudioTrack;

    iget-object v2, p0, Ltm/s;->t:Ltm/q;

    iget-object v2, v2, Ltm/q;->a:Lrm/c0;

    iget v3, v2, Lrm/c0;->b0:I

    iget v2, v2, Lrm/c0;->c0:I

    invoke-virtual {v0, v3, v2}, Landroid/media/AudioTrack;->setOffloadDelayPadding(II)V

    :cond_2
    sget v0, Llo/y;->a:I

    const/16 v2, 0x1f

    if-lt v0, v2, :cond_3

    iget-object v2, p0, Ltm/s;->q:Lsm/f;

    if-eqz v2, :cond_3

    iget-object v3, p0, Ltm/s;->u:Landroid/media/AudioTrack;

    invoke-static {v3, v2}, Ltm/p;->a(Landroid/media/AudioTrack;Lsm/f;)V

    :cond_3
    iget-object v2, p0, Ltm/s;->u:Landroid/media/AudioTrack;

    invoke-virtual {v2}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result v2

    iput v2, p0, Ltm/s;->W:I

    iget-object v2, p0, Ltm/s;->u:Landroid/media/AudioTrack;

    iget-object v3, p0, Ltm/s;->t:Ltm/q;

    iget v4, v3, Ltm/q;->c:I

    const/4 v5, 0x2

    const/4 v6, 0x0

    if-ne v4, v5, :cond_4

    move v4, v1

    goto :goto_3

    :cond_4
    move v4, v6

    :goto_3
    iget v5, v3, Ltm/q;->g:I

    iget v7, v3, Ltm/q;->d:I

    iget v3, v3, Ltm/q;->h:I

    iget-object v8, p0, Ltm/s;->i:Ltm/k;

    iput-object v2, v8, Ltm/k;->c:Landroid/media/AudioTrack;

    iput v7, v8, Ltm/k;->d:I

    iput v3, v8, Ltm/k;->e:I

    new-instance v9, Ld9/l;

    const/4 v10, 0x1

    invoke-direct {v9, v2, v10}, Ld9/l;-><init>(Landroid/media/AudioTrack;I)V

    iput-object v9, v8, Ltm/k;->f:Ld9/l;

    invoke-virtual {v2}, Landroid/media/AudioTrack;->getSampleRate()I

    move-result v2

    iput v2, v8, Ltm/k;->g:I

    if-eqz v4, :cond_6

    const/16 v2, 0x17

    if-ge v0, v2, :cond_6

    const/4 v2, 0x5

    if-eq v5, v2, :cond_5

    const/4 v2, 0x6

    if-ne v5, v2, :cond_6

    :cond_5
    move v2, v1

    goto :goto_4

    :cond_6
    move v2, v6

    :goto_4
    iput-boolean v2, v8, Ltm/k;->h:Z

    invoke-static {v5}, Llo/y;->x(I)Z

    move-result v2

    iput-boolean v2, v8, Ltm/k;->q:Z

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v2, :cond_7

    div-int/2addr v3, v7

    int-to-long v2, v3

    const-wide/32 v9, 0xf4240

    mul-long/2addr v2, v9

    iget v7, v8, Ltm/k;->g:I

    int-to-long v9, v7

    div-long/2addr v2, v9

    goto :goto_5

    :cond_7
    move-wide v2, v4

    :goto_5
    iput-wide v2, v8, Ltm/k;->i:J

    const-wide/16 v2, 0x0

    iput-wide v2, v8, Ltm/k;->s:J

    iput-wide v2, v8, Ltm/k;->t:J

    iput-wide v2, v8, Ltm/k;->u:J

    iput-boolean v6, v8, Ltm/k;->p:Z

    iput-wide v4, v8, Ltm/k;->x:J

    iput-wide v4, v8, Ltm/k;->y:J

    iput-wide v2, v8, Ltm/k;->r:J

    iput-wide v2, v8, Ltm/k;->o:J

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v8, Ltm/k;->j:F

    invoke-virtual {p0}, Ltm/s;->n()Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_6

    :cond_8
    const/16 v2, 0x15

    if-lt v0, v2, :cond_9

    iget-object v0, p0, Ltm/s;->u:Landroid/media/AudioTrack;

    iget v2, p0, Ltm/s;->J:F

    invoke-virtual {v0, v2}, Landroid/media/AudioTrack;->setVolume(F)I

    goto :goto_6

    :cond_9
    iget-object v0, p0, Ltm/s;->u:Landroid/media/AudioTrack;

    iget v2, p0, Ltm/s;->J:F

    invoke-virtual {v0, v2, v2}, Landroid/media/AudioTrack;->setStereoVolume(FF)I

    :goto_6
    iget-object v0, p0, Ltm/s;->X:Ltm/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-boolean v1, p0, Ltm/s;->H:Z

    return-void

    :catch_2
    move-exception v0

    goto :goto_7

    :catch_3
    move-exception v0

    :try_start_5
    iget-object v3, p0, Ltm/s;->r:Lq30/u0;

    if-eqz v3, :cond_a

    invoke-virtual {v3, v0}, Lq30/u0;->D(Ljava/lang/Exception;)V

    :cond_a
    throw v0
    :try_end_5
    .catch Lcom/google/android/exoplayer2/audio/AudioSink$InitializationException; {:try_start_5 .. :try_end_5} :catch_2

    :goto_7
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_b
    iget-object v0, p0, Ltm/s;->t:Ltm/q;

    iget v0, v0, Ltm/q;->c:I

    if-ne v0, v1, :cond_c

    iput-boolean v1, p0, Ltm/s;->a0:Z

    :cond_c
    throw v2
.end method

.method public final n()Z
    .locals 1

    iget-object v0, p0, Ltm/s;->u:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final p()V
    .locals 7

    iget-boolean v0, p0, Ltm/s;->T:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltm/s;->T:Z

    invoke-virtual {p0}, Ltm/s;->j()J

    move-result-wide v0

    iget-object v2, p0, Ltm/s;->i:Ltm/k;

    invoke-virtual {v2}, Ltm/k;->a()J

    move-result-wide v3

    iput-wide v3, v2, Ltm/k;->z:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    const-wide/16 v5, 0x3e8

    mul-long/2addr v3, v5

    iput-wide v3, v2, Ltm/k;->x:J

    iput-wide v0, v2, Ltm/k;->A:J

    iget-object v0, p0, Ltm/s;->u:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    const/4 v0, 0x0

    iput v0, p0, Ltm/s;->A:I

    :cond_0
    return-void
.end method

.method public final q(J)V
    .locals 5

    iget-object v0, p0, Ltm/s;->K:[Ltm/h;

    array-length v0, v0

    move v1, v0

    :goto_0
    if-ltz v1, :cond_6

    if-lez v1, :cond_0

    iget-object v2, p0, Ltm/s;->L:[Ljava/nio/ByteBuffer;

    add-int/lit8 v3, v1, -0x1

    aget-object v2, v2, v3

    goto :goto_1

    :cond_0
    iget-object v2, p0, Ltm/s;->M:Ljava/nio/ByteBuffer;

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    sget-object v2, Ltm/h;->a:Ljava/nio/ByteBuffer;

    :goto_1
    if-ne v1, v0, :cond_2

    invoke-virtual {p0, v2, p1, p2}, Ltm/s;->w(Ljava/nio/ByteBuffer;J)V

    goto :goto_2

    :cond_2
    iget-object v3, p0, Ltm/s;->K:[Ltm/h;

    aget-object v3, v3, v1

    iget v4, p0, Ltm/s;->R:I

    if-le v1, v4, :cond_3

    invoke-interface {v3, v2}, Ltm/h;->b(Ljava/nio/ByteBuffer;)V

    :cond_3
    invoke-interface {v3}, Ltm/h;->a()Ljava/nio/ByteBuffer;

    move-result-object v3

    iget-object v4, p0, Ltm/s;->L:[Ljava/nio/ByteBuffer;

    aput-object v3, v4, v1

    invoke-virtual {v3}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v3

    if-eqz v3, :cond_4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    invoke-virtual {v2}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_3

    :cond_5
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_6
    :goto_3
    return-void
.end method

.method public final r()V
    .locals 5

    invoke-virtual {p0}, Ltm/s;->d()V

    iget-object v0, p0, Ltm/s;->f:[Ltm/h;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    invoke-interface {v4}, Ltm/h;->reset()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ltm/s;->g:[Ltm/h;

    array-length v1, v0

    move v3, v2

    :goto_1
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    invoke-interface {v4}, Ltm/h;->reset()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    iput-boolean v2, p0, Ltm/s;->U:Z

    iput-boolean v2, p0, Ltm/s;->a0:Z

    return-void
.end method

.method public final s(Lrm/w0;Z)V
    .locals 8

    invoke-virtual {p0}, Ltm/s;->h()Ltm/r;

    move-result-object v0

    iget-object v1, v0, Ltm/r;->a:Lrm/w0;

    invoke-virtual {p1, v1}, Lrm/w0;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v0, v0, Ltm/r;->b:Z

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    new-instance v1, Ltm/r;

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    move-object v2, p1

    move v3, p2

    invoke-direct/range {v1 .. v7}, Ltm/r;-><init>(Lrm/w0;ZJJ)V

    invoke-virtual {p0}, Ltm/s;->n()Z

    move-result p1

    if-eqz p1, :cond_2

    iput-object v1, p0, Ltm/s;->w:Ltm/r;

    return-void

    :cond_2
    iput-object v1, p0, Ltm/s;->x:Ltm/r;

    return-void
.end method

.method public final t(Lrm/w0;)V
    .locals 2

    invoke-virtual {p0}, Ltm/s;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/media/PlaybackParams;

    invoke-direct {v0}, Landroid/media/PlaybackParams;-><init>()V

    invoke-virtual {v0}, Landroid/media/PlaybackParams;->allowDefaults()Landroid/media/PlaybackParams;

    move-result-object v0

    iget v1, p1, Lrm/w0;->w:F

    invoke-virtual {v0, v1}, Landroid/media/PlaybackParams;->setSpeed(F)Landroid/media/PlaybackParams;

    move-result-object v0

    iget p1, p1, Lrm/w0;->x:F

    invoke-virtual {v0, p1}, Landroid/media/PlaybackParams;->setPitch(F)Landroid/media/PlaybackParams;

    move-result-object p1

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/media/PlaybackParams;->setAudioFallbackMode(I)Landroid/media/PlaybackParams;

    move-result-object p1

    :try_start_0
    iget-object v0, p0, Ltm/s;->u:Landroid/media/AudioTrack;

    invoke-virtual {v0, p1}, Landroid/media/AudioTrack;->setPlaybackParams(Landroid/media/PlaybackParams;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "DefaultAudioSink"

    const-string v1, "Failed to set playback params"

    invoke-static {v0, v1, p1}, Llo/a;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_0
    new-instance p1, Lrm/w0;

    iget-object v0, p0, Ltm/s;->u:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/PlaybackParams;->getSpeed()F

    move-result v0

    iget-object v1, p0, Ltm/s;->u:Landroid/media/AudioTrack;

    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/PlaybackParams;->getPitch()F

    move-result v1

    invoke-direct {p1, v0, v1}, Lrm/w0;-><init>(FF)V

    iget v0, p1, Lrm/w0;->w:F

    iget-object v1, p0, Ltm/s;->i:Ltm/k;

    iput v0, v1, Ltm/k;->j:F

    iget-object v0, v1, Ltm/k;->f:Ld9/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ld9/l;->a()V

    :cond_0
    iput-object p1, p0, Ltm/s;->y:Lrm/w0;

    return-void
.end method

.method public final u()Z
    .locals 2

    iget-boolean v0, p0, Ltm/s;->Y:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ltm/s;->t:Ltm/q;

    iget-object v0, v0, Ltm/q;->a:Lrm/c0;

    iget-object v0, v0, Lrm/c0;->L:Ljava/lang/String;

    const-string v1, "audio/raw"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ltm/s;->t:Ltm/q;

    iget-object v0, v0, Ltm/q;->a:Lrm/c0;

    iget v0, v0, Lrm/c0;->a0:I

    iget-boolean v1, p0, Ltm/s;->c:Z

    if-eqz v1, :cond_0

    sget v1, Llo/y;->a:I

    const/high16 v1, 0x20000000

    if-eq v0, v1, :cond_1

    const/high16 v1, 0x30000000

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final v(Lrm/c0;Ltm/d;)Z
    .locals 7

    sget v0, Llo/y;->a:I

    const/16 v1, 0x1d

    const/4 v2, 0x0

    if-lt v0, v1, :cond_d

    iget v1, p0, Ltm/s;->l:I

    if-nez v1, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v3, p1, Lrm/c0;->L:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, p1, Lrm/c0;->I:Ljava/lang/String;

    invoke-static {v3, v4}, Llo/m;->b(Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    if-nez v3, :cond_1

    return v2

    :cond_1
    iget v4, p1, Lrm/c0;->Y:I

    invoke-static {v4}, Llo/y;->l(I)I

    move-result v4

    if-nez v4, :cond_2

    return v2

    :cond_2
    iget v5, p1, Lrm/c0;->Z:I

    invoke-static {v5, v4, v3}, Ltm/s;->e(III)Landroid/media/AudioFormat;

    move-result-object v3

    invoke-virtual {p2}, Ltm/d;->a()Landroid/media/AudioAttributes;

    move-result-object p2

    const/16 v4, 0x1f

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-lt v0, v4, :cond_3

    invoke-static {v3, p2}, Landroid/media/AudioManager;->getPlaybackOffloadSupport(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)I

    move-result p2

    goto :goto_0

    :cond_3
    invoke-static {v3, p2}, Landroid/media/AudioManager;->isOffloadedPlaybackSupported(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    move-result p2

    if-nez p2, :cond_4

    move p2, v2

    goto :goto_0

    :cond_4
    const/16 p2, 0x1e

    if-ne v0, p2, :cond_5

    sget-object p2, Llo/y;->d:Ljava/lang/String;

    const-string v0, "Pixel"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_5

    move p2, v5

    goto :goto_0

    :cond_5
    move p2, v6

    :goto_0
    if-eqz p2, :cond_d

    if-eq p2, v6, :cond_7

    if-ne p2, v5, :cond_6

    return v6

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_7
    iget p2, p1, Lrm/c0;->b0:I

    if-nez p2, :cond_9

    iget p1, p1, Lrm/c0;->c0:I

    if-eqz p1, :cond_8

    goto :goto_1

    :cond_8
    move p1, v2

    goto :goto_2

    :cond_9
    :goto_1
    move p1, v6

    :goto_2
    if-ne v1, v6, :cond_a

    move p2, v6

    goto :goto_3

    :cond_a
    move p2, v2

    :goto_3
    if-eqz p1, :cond_c

    if-nez p2, :cond_b

    goto :goto_4

    :cond_b
    return v2

    :cond_c
    :goto_4
    return v6

    :cond_d
    :goto_5
    return v2
.end method

.method public final w(Ljava/nio/ByteBuffer;J)V
    .locals 12

    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_7

    :cond_0
    iget-object v0, p0, Ltm/s;->O:Ljava/nio/ByteBuffer;

    const/16 v1, 0x15

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    if-ne v0, p1, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v3

    :goto_0
    invoke-static {v0}, Llo/a;->e(Z)V

    goto :goto_1

    :cond_2
    iput-object p1, p0, Ltm/s;->O:Ljava/nio/ByteBuffer;

    sget v0, Llo/y;->a:I

    if-ge v0, v1, :cond_5

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    iget-object v4, p0, Ltm/s;->P:[B

    if-eqz v4, :cond_3

    array-length v4, v4

    if-ge v4, v0, :cond_4

    :cond_3
    new-array v4, v0, [B

    iput-object v4, p0, Ltm/s;->P:[B

    :cond_4
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v4

    iget-object v5, p0, Ltm/s;->P:[B

    invoke-virtual {p1, v5, v3, v0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iput v3, p0, Ltm/s;->Q:I

    :cond_5
    :goto_1
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v8

    sget v0, Llo/y;->a:I

    iget-object v4, p0, Ltm/s;->i:Ltm/k;

    if-ge v0, v1, :cond_8

    iget-wide p2, p0, Ltm/s;->D:J

    invoke-virtual {v4}, Ltm/k;->a()J

    move-result-wide v5

    iget v1, v4, Ltm/k;->d:I

    int-to-long v9, v1

    mul-long/2addr v5, v9

    sub-long/2addr p2, v5

    long-to-int p2, p2

    iget p3, v4, Ltm/k;->e:I

    sub-int/2addr p3, p2

    if-lez p3, :cond_6

    invoke-static {v8, p3}, Ljava/lang/Math;->min(II)I

    move-result p2

    iget-object p3, p0, Ltm/s;->u:Landroid/media/AudioTrack;

    iget-object v1, p0, Ltm/s;->P:[B

    iget v5, p0, Ltm/s;->Q:I

    invoke-virtual {p3, v1, v5, p2}, Landroid/media/AudioTrack;->write([BII)I

    move-result p2

    if-lez p2, :cond_7

    iget p3, p0, Ltm/s;->Q:I

    add-int/2addr p3, p2

    iput p3, p0, Ltm/s;->Q:I

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result p3

    add-int/2addr p3, p2

    invoke-virtual {p1, p3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto :goto_2

    :cond_6
    move p2, v3

    :cond_7
    :goto_2
    move-object v7, p1

    goto/16 :goto_5

    :cond_8
    iget-boolean v1, p0, Ltm/s;->Y:Z

    if-eqz v1, :cond_10

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, p2, v5

    if-eqz v1, :cond_9

    move v1, v2

    goto :goto_3

    :cond_9
    move v1, v3

    :goto_3
    invoke-static {v1}, Llo/a;->i(Z)V

    iget-object v6, p0, Ltm/s;->u:Landroid/media/AudioTrack;

    const/16 v1, 0x1a

    const-wide/16 v9, 0x3e8

    if-lt v0, v1, :cond_a

    move-wide v10, v9

    const/4 v9, 0x1

    mul-long/2addr v10, p2

    move-object v7, p1

    invoke-virtual/range {v6 .. v11}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;IIJ)I

    move-result p1

    :goto_4
    move p2, p1

    goto :goto_5

    :cond_a
    move-object v7, p1

    move-wide v10, v9

    iget-object p1, p0, Ltm/s;->z:Ljava/nio/ByteBuffer;

    if-nez p1, :cond_b

    const/16 p1, 0x10

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Ltm/s;->z:Ljava/nio/ByteBuffer;

    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    iget-object p1, p0, Ltm/s;->z:Ljava/nio/ByteBuffer;

    const v1, 0x55550001

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    :cond_b
    iget p1, p0, Ltm/s;->A:I

    if-nez p1, :cond_c

    iget-object p1, p0, Ltm/s;->z:Ljava/nio/ByteBuffer;

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v8}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    iget-object p1, p0, Ltm/s;->z:Ljava/nio/ByteBuffer;

    const/16 v1, 0x8

    mul-long/2addr p2, v10

    invoke-virtual {p1, v1, p2, p3}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    iget-object p1, p0, Ltm/s;->z:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iput v8, p0, Ltm/s;->A:I

    :cond_c
    iget-object p1, p0, Ltm/s;->z:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result p1

    if-lez p1, :cond_e

    iget-object p2, p0, Ltm/s;->z:Ljava/nio/ByteBuffer;

    invoke-virtual {v6, p2, p1, v2}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    move-result p2

    if-gez p2, :cond_d

    iput v3, p0, Ltm/s;->A:I

    goto :goto_5

    :cond_d
    if-ge p2, p1, :cond_e

    move p2, v3

    goto :goto_5

    :cond_e
    invoke-virtual {v6, v7, v8, v2}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    move-result p1

    if-gez p1, :cond_f

    iput v3, p0, Ltm/s;->A:I

    goto :goto_4

    :cond_f
    iget p2, p0, Ltm/s;->A:I

    sub-int/2addr p2, p1

    iput p2, p0, Ltm/s;->A:I

    goto :goto_4

    :cond_10
    move-object v7, p1

    iget-object p1, p0, Ltm/s;->u:Landroid/media/AudioTrack;

    invoke-virtual {p1, v7, v8, v2}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    move-result p2

    :goto_5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    iput-wide v5, p0, Ltm/s;->Z:J

    iget-object p1, p0, Ltm/s;->o:Lan/d;

    if-gez p2, :cond_17

    const/16 p3, 0x18

    if-lt v0, p3, :cond_11

    const/4 p3, -0x6

    if-eq p2, p3, :cond_12

    :cond_11
    const/16 p3, -0x20

    if-ne p2, p3, :cond_13

    :cond_12
    move v3, v2

    :cond_13
    if-eqz v3, :cond_14

    iget-object p3, p0, Ltm/s;->t:Ltm/q;

    iget p3, p3, Ltm/q;->c:I

    if-ne p3, v2, :cond_14

    iput-boolean v2, p0, Ltm/s;->a0:Z

    :cond_14
    new-instance p3, Lcom/google/android/exoplayer2/audio/AudioSink$WriteException;

    iget-object v0, p0, Ltm/s;->t:Ltm/q;

    iget-object v0, v0, Ltm/q;->a:Lrm/c0;

    invoke-direct {p3, p2, v0, v3}, Lcom/google/android/exoplayer2/audio/AudioSink$WriteException;-><init>(ILrm/c0;Z)V

    iget-object p2, p0, Ltm/s;->r:Lq30/u0;

    if-eqz p2, :cond_15

    invoke-virtual {p2, p3}, Lq30/u0;->D(Ljava/lang/Exception;)V

    :cond_15
    iget-boolean p2, p3, Lcom/google/android/exoplayer2/audio/AudioSink$WriteException;->w:Z

    if-nez p2, :cond_16

    invoke-virtual {p1, p3}, Lan/d;->O(Ljava/lang/Exception;)V

    return-void

    :cond_16
    throw p3

    :cond_17
    const/4 p3, 0x0

    iput-object p3, p1, Lan/d;->y:Ljava/lang/Object;

    iget-object p1, p0, Ltm/s;->u:Landroid/media/AudioTrack;

    invoke-static {p1}, Ltm/s;->o(Landroid/media/AudioTrack;)Z

    move-result p1

    if-eqz p1, :cond_19

    iget-wide v0, p0, Ltm/s;->E:J

    const-wide/16 v5, 0x0

    cmp-long p1, v0, v5

    if-lez p1, :cond_18

    iput-boolean v3, p0, Ltm/s;->b0:Z

    :cond_18
    iget-boolean p1, p0, Ltm/s;->U:Z

    if-eqz p1, :cond_19

    iget-object p1, p0, Ltm/s;->r:Lq30/u0;

    if-eqz p1, :cond_19

    if-ge p2, v8, :cond_19

    iget-boolean p1, p0, Ltm/s;->b0:Z

    if-nez p1, :cond_19

    invoke-virtual {v4}, Ltm/k;->a()J

    move-result-wide v5

    sub-long/2addr v0, v5

    const-wide/32 v5, 0xf4240

    mul-long/2addr v0, v5

    iget p1, v4, Ltm/k;->g:I

    int-to-long v4, p1

    div-long/2addr v0, v4

    invoke-static {v0, v1}, Llo/y;->G(J)J

    move-result-wide v0

    iget-object p1, p0, Ltm/s;->r:Lq30/u0;

    iget-object p1, p1, Lq30/u0;->x:Ljava/lang/Object;

    check-cast p1, Ltm/v;

    iget-object p1, p1, Ltm/v;->o1:Lrm/v;

    if-eqz p1, :cond_19

    const-wide/16 v4, 0x7d0

    cmp-long v0, v0, v4

    if-ltz v0, :cond_19

    iget-object p1, p1, Lrm/v;->a:Lrm/z;

    iput-boolean v2, p1, Lrm/z;->g0:Z

    :cond_19
    iget-object p1, p0, Ltm/s;->t:Ltm/q;

    iget p1, p1, Ltm/q;->c:I

    if-nez p1, :cond_1a

    iget-wide v0, p0, Ltm/s;->D:J

    int-to-long v4, p2

    add-long/2addr v0, v4

    iput-wide v0, p0, Ltm/s;->D:J

    :cond_1a
    if-ne p2, v8, :cond_1d

    if-eqz p1, :cond_1c

    iget-object p1, p0, Ltm/s;->M:Ljava/nio/ByteBuffer;

    if-ne v7, p1, :cond_1b

    goto :goto_6

    :cond_1b
    move v2, v3

    :goto_6
    invoke-static {v2}, Llo/a;->i(Z)V

    iget-wide p1, p0, Ltm/s;->E:J

    iget v0, p0, Ltm/s;->F:I

    iget v1, p0, Ltm/s;->N:I

    mul-int/2addr v0, v1

    int-to-long v0, v0

    add-long/2addr p1, v0

    iput-wide p1, p0, Ltm/s;->E:J

    :cond_1c
    iput-object p3, p0, Ltm/s;->O:Ljava/nio/ByteBuffer;

    :cond_1d
    :goto_7
    return-void
.end method
